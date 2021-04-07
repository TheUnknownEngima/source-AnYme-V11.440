package defpackage;

/* renamed from: jz0  reason: default package */
public class jz0 {
    private volatile f01 a;
    private volatile lx0 b;

    static {
        fy0.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.f01 c(defpackage.f01 r2) {
        /*
            r1 = this;
            f01 r0 = r1.a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            f01 r0 = r1.a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.a = r2     // Catch:{ ez0 -> 0x0012 }
            lx0 r0 = defpackage.lx0.f     // Catch:{ ez0 -> 0x0012 }
            r1.b = r0     // Catch:{ ez0 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.a = r2     // Catch:{ all -> 0x0019 }
            lx0 r2 = defpackage.lx0.f     // Catch:{ all -> 0x0019 }
            r1.b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            f01 r2 = r1.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz0.c(f01):f01");
    }

    public final f01 a(f01 f01) {
        f01 f012 = this.a;
        this.b = null;
        this.a = f01;
        return f012;
    }

    public final int b() {
        if (this.b != null) {
            return this.b.c();
        }
        if (this.a != null) {
            return this.a.d();
        }
        return 0;
    }

    public final lx0 d() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                lx0 lx0 = this.b;
                return lx0;
            }
            this.b = this.a == null ? lx0.f : this.a.b();
            lx0 lx02 = this.b;
            return lx02;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz0)) {
            return false;
        }
        jz0 jz0 = (jz0) obj;
        f01 f01 = this.a;
        f01 f012 = jz0.a;
        return (f01 == null && f012 == null) ? d().equals(jz0.d()) : (f01 == null || f012 == null) ? f01 != null ? f01.equals(jz0.c(f01.j())) : c(f012.j()).equals(f012) : f01.equals(f012);
    }

    public int hashCode() {
        return 1;
    }
}
