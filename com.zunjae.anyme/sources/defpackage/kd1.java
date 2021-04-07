package defpackage;

import defpackage.jd1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: kd1  reason: default package */
class kd1 implements hd1 {
    private static final Charset d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private jd1 c;

    /* renamed from: kd1$a */
    class a implements jd1.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(kd1 kd1, byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        public void a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: kd1$b */
    private class b {
        public final byte[] a;
        public final int b;

        b(kd1 kd1, byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    kd1(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private void f(long j, String str) {
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.c.k(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(d));
                while (!this.c.A() && this.c.P() > this.b) {
                    this.c.K();
                }
            } catch (IOException e) {
                jb1.f().e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        jd1 jd1 = this.c;
        if (jd1 == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[jd1.P()];
        try {
            this.c.t(new a(this, bArr, iArr));
        } catch (IOException e) {
            jb1.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new b(this, bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new jd1(this.a);
            } catch (IOException e) {
                jb1 f = jb1.f();
                f.e("Could not open log file: " + this.a, e);
            }
        }
    }

    public void a() {
        dc1.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public String b() {
        byte[] c2 = c();
        if (c2 != null) {
            return new String(c2, d);
        }
        return null;
    }

    public byte[] c() {
        b g = g();
        if (g == null) {
            return null;
        }
        int i = g.b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.a, 0, bArr, 0, i);
        return bArr;
    }

    public void d() {
        a();
        this.a.delete();
    }

    public void e(long j, String str) {
        h();
        f(j, str);
    }
}
