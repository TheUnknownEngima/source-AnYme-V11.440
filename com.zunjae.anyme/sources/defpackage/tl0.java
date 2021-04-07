package defpackage;

/* renamed from: tl0  reason: default package */
public class tl0 {
    private volatile pm0 a;
    private volatile bk0 b;

    static {
        sk0.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.pm0 a(defpackage.pm0 r2) {
        /*
            r1 = this;
            pm0 r0 = r1.a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            pm0 r0 = r1.a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.a = r2     // Catch:{ ol0 -> 0x0012 }
            bk0 r0 = defpackage.bk0.f     // Catch:{ ol0 -> 0x0012 }
            r1.b = r0     // Catch:{ ol0 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.a = r2     // Catch:{ all -> 0x0019 }
            bk0 r2 = defpackage.bk0.f     // Catch:{ all -> 0x0019 }
            r1.b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            pm0 r2 = r1.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.a(pm0):pm0");
    }

    public final pm0 b(pm0 pm0) {
        pm0 pm02 = this.a;
        this.b = null;
        this.a = pm0;
        return pm02;
    }

    public final bk0 c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                bk0 bk0 = this.b;
                return bk0;
            }
            this.b = this.a == null ? bk0.f : this.a.g();
            bk0 bk02 = this.b;
            return bk02;
        }
    }

    public final int d() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0 = (tl0) obj;
        pm0 pm0 = this.a;
        pm0 pm02 = tl0.a;
        return (pm0 == null && pm02 == null) ? c().equals(tl0.c()) : (pm0 == null || pm02 == null) ? pm0 != null ? pm0.equals(tl0.a(pm0.f())) : a(pm02.f()).equals(pm02) : pm0.equals(pm02);
    }

    public int hashCode() {
        return 1;
    }
}
