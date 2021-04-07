package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* renamed from: n70  reason: default package */
public final class n70 {
    private static final u60 f = new u60("RequestTracker");
    private static final Object g = new Object();
    private long a;
    private final Handler b = new mb0(Looper.getMainLooper());
    private long c = -1;
    private o70 d;
    private Runnable e;

    public n70(long j) {
        this.a = j;
    }

    private final void b(int i, Object obj, String str) {
        f.a(str, new Object[0]);
        synchronized (g) {
            if (this.d != null) {
                this.d.b(this.c, i, obj);
            }
            this.c = -1;
            this.d = null;
            synchronized (g) {
                if (this.e != null) {
                    this.b.removeCallbacks(this.e);
                    this.e = null;
                }
            }
        }
    }

    private final boolean d(int i, Object obj) {
        synchronized (g) {
            if (this.c == -1) {
                return false;
            }
            b(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(this.c)}));
            return true;
        }
    }

    public final boolean a(long j) {
        boolean z;
        synchronized (g) {
            z = this.c != -1 && this.c == j;
        }
        return z;
    }

    public final void c(long j, o70 o70) {
        o70 o702;
        long j2;
        synchronized (g) {
            o702 = this.d;
            j2 = this.c;
            this.c = j;
            this.d = o70;
        }
        if (o702 != null) {
            o702.a(j2);
        }
        synchronized (g) {
            if (this.e != null) {
                this.b.removeCallbacks(this.e);
            }
            p70 p70 = new p70(this);
            this.e = p70;
            this.b.postDelayed(p70, this.a);
        }
    }

    public final boolean e(int i) {
        return d(2002, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(long r8, int r10, java.lang.Object r11) {
        /*
            r7 = this;
            java.lang.Object r0 = g
            monitor-enter(r0)
            long r1 = r7.c     // Catch:{ all -> 0x002a }
            r3 = -1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0028
            long r1 = r7.c     // Catch:{ all -> 0x002a }
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0028
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "request %d completed"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x002a }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x002a }
            r4[r5] = r8     // Catch:{ all -> 0x002a }
            java.lang.String r8 = java.lang.String.format(r1, r2, r4)     // Catch:{ all -> 0x002a }
            r7.b(r10, r11, r8)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r3
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return r5
        L_0x002a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n70.f(long, int, java.lang.Object):boolean");
    }

    public final boolean g() {
        boolean z;
        synchronized (g) {
            z = this.c != -1;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        synchronized (g) {
            if (this.c != -1) {
                d(15, (Object) null);
            }
        }
    }
}
