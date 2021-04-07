package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: li  reason: default package */
public final class li {
    private static final File f = new File("/proc/self/fd");
    private static volatile li g;
    private final boolean a = d();
    private final int b;
    private final int c;
    private int d;
    private boolean e = true;

    li() {
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = 20000;
            i = 0;
        } else {
            this.b = 700;
            i = 128;
        }
        this.c = i;
    }

    public static li a() {
        if (g == null) {
            synchronized (li.class) {
                if (g == null) {
                    g = new li();
                }
            }
        }
        return g;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i = this.d + 1;
        this.d = i;
        if (i >= 50) {
            this.d = 0;
            int length = f.list().length;
            if (length >= this.b) {
                z = false;
            }
            this.e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.b;
            }
        }
        return this.e;
    }

    private static boolean d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = Build.MODEL.substring(0, 7);
        char c2 = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c2 = 0;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r5 = r2.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r3, int r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.a
            if (r5 == 0) goto L_0x001d
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r5 < r1) goto L_0x001d
            if (r6 == 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            int r5 = r2.c
            if (r3 < r5) goto L_0x001d
            if (r4 < r5) goto L_0x001d
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x001d
            r0 = 1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li.c(int, int, boolean, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c2 = c(i, i2, z, z2);
        if (c2) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c2;
    }
}
