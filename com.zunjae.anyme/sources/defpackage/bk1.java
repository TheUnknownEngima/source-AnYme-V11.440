package defpackage;

/* renamed from: bk1  reason: default package */
public class bk1 {
    private ej1 a;
    private mj1 b;
    protected volatile ok1 c;
    private volatile ej1 d;

    static {
        mj1.b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.c = r4;
        r3.d = defpackage.ej1.f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.ok1 r4) {
        /*
            r3 = this;
            ok1 r0 = r3.c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            ok1 r0 = r3.c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            ej1 r0 = r3.a     // Catch:{ yj1 -> 0x002a }
            if (r0 == 0) goto L_0x0025
            xk1 r0 = r4.n()     // Catch:{ yj1 -> 0x002a }
            ej1 r1 = r3.a     // Catch:{ yj1 -> 0x002a }
            mj1 r2 = r3.b     // Catch:{ yj1 -> 0x002a }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ yj1 -> 0x002a }
            ok1 r0 = (defpackage.ok1) r0     // Catch:{ yj1 -> 0x002a }
            r3.c = r0     // Catch:{ yj1 -> 0x002a }
            ej1 r0 = r3.a     // Catch:{ yj1 -> 0x002a }
        L_0x0022:
            r3.d = r0     // Catch:{ yj1 -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.c = r4     // Catch:{ yj1 -> 0x002a }
            ej1 r0 = defpackage.ej1.f     // Catch:{ yj1 -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.c = r4     // Catch:{ all -> 0x0032 }
            ej1 r4 = defpackage.ej1.f     // Catch:{ all -> 0x0032 }
            r3.d = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk1.a(ok1):void");
    }

    public int b() {
        if (this.d != null) {
            return this.d.size();
        }
        ej1 ej1 = this.a;
        if (ej1 != null) {
            return ej1.size();
        }
        if (this.c != null) {
            return this.c.g();
        }
        return 0;
    }

    public ok1 c(ok1 ok1) {
        a(ok1);
        return this.c;
    }

    public ok1 d(ok1 ok1) {
        ok1 ok12 = this.c;
        this.a = null;
        this.d = null;
        this.c = ok1;
        return ok12;
    }

    public ej1 e() {
        if (this.d != null) {
            return this.d;
        }
        ej1 ej1 = this.a;
        if (ej1 != null) {
            return ej1;
        }
        synchronized (this) {
            if (this.d != null) {
                ej1 ej12 = this.d;
                return ej12;
            }
            this.d = this.c == null ? ej1.f : this.c.f();
            ej1 ej13 = this.d;
            return ej13;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk1)) {
            return false;
        }
        bk1 bk1 = (bk1) obj;
        ok1 ok1 = this.c;
        ok1 ok12 = bk1.c;
        return (ok1 == null && ok12 == null) ? e().equals(bk1.e()) : (ok1 == null || ok12 == null) ? ok1 != null ? ok1.equals(bk1.c(ok1.c())) : c(ok12.c()).equals(ok12) : ok1.equals(ok12);
    }

    public int hashCode() {
        return 1;
    }
}
