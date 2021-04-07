package defpackage;

import defpackage.al;

/* renamed from: fl  reason: default package */
public class fl implements al, zk {
    private final al a;
    private final Object b;
    private volatile zk c;
    private volatile zk d;
    private al.a e;
    private al.a f;
    private boolean g;

    public fl(Object obj, al alVar) {
        al.a aVar = al.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.b = obj;
        this.a = alVar;
    }

    private boolean l() {
        al alVar = this.a;
        return alVar == null || alVar.k(this);
    }

    private boolean m() {
        al alVar = this.a;
        return alVar == null || alVar.e(this);
    }

    private boolean o() {
        al alVar = this.a;
        return alVar == null || alVar.g(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.zk r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            zk r1 = r2.c     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0011
            al$a r3 = defpackage.al.a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0011:
            al$a r3 = defpackage.al.a.FAILED     // Catch:{ all -> 0x0020 }
            r2.e = r3     // Catch:{ all -> 0x0020 }
            al r3 = r2.a     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            al r3 = r2.a     // Catch:{ all -> 0x0020 }
            r3.a(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl.a(zk):void");
    }

    public boolean b() {
        boolean z;
        synchronized (this.b) {
            if (!this.d.b()) {
                if (!this.c.b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public al c() {
        al c2;
        synchronized (this.b) {
            c2 = this.a != null ? this.a.c() : this;
        }
        return c2;
    }

    public void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = al.a.CLEARED;
            this.f = al.a.CLEARED;
            this.d.clear();
            this.c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.zk r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.fl
            r1 = 0
            if (r0 == 0) goto L_0x002e
            fl r4 = (defpackage.fl) r4
            zk r0 = r3.c
            if (r0 != 0) goto L_0x0010
            zk r0 = r4.c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            zk r0 = r3.c
            zk r2 = r4.c
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            zk r0 = r3.d
            if (r0 != 0) goto L_0x0023
            zk r4 = r4.d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            zk r0 = r3.d
            zk r4 = r4.d
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl.d(zk):boolean");
    }

    public boolean e(zk zkVar) {
        boolean z;
        synchronized (this.b) {
            z = m() && zkVar.equals(this.c) && !b();
        }
        return z;
    }

    public boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.e == al.a.CLEARED;
        }
        return z;
    }

    public boolean g(zk zkVar) {
        boolean z;
        synchronized (this.b) {
            z = o() && (zkVar.equals(this.c) || this.e != al.a.SUCCESS);
        }
        return z;
    }

    public void h() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (!(this.e == al.a.SUCCESS || this.f == al.a.RUNNING)) {
                    this.f = al.a.RUNNING;
                    this.d.h();
                }
                if (this.g && this.e != al.a.RUNNING) {
                    this.e = al.a.RUNNING;
                    this.c.h();
                }
            } finally {
                this.g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(defpackage.zk r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            zk r1 = r2.d     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0011
            al$a r3 = defpackage.al.a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f = r3     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0011:
            al$a r3 = defpackage.al.a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.e = r3     // Catch:{ all -> 0x002d }
            al r3 = r2.a     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            al r3 = r2.a     // Catch:{ all -> 0x002d }
            r3.i(r2)     // Catch:{ all -> 0x002d }
        L_0x001e:
            al$a r3 = r2.f     // Catch:{ all -> 0x002d }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            zk r3 = r2.d     // Catch:{ all -> 0x002d }
            r3.clear()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl.i(zk):void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == al.a.RUNNING;
        }
        return z;
    }

    public boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == al.a.SUCCESS;
        }
        return z;
    }

    public boolean k(zk zkVar) {
        boolean z;
        synchronized (this.b) {
            z = l() && zkVar.equals(this.c) && this.e != al.a.PAUSED;
        }
        return z;
    }

    public void n() {
        synchronized (this.b) {
            if (!this.f.isComplete()) {
                this.f = al.a.PAUSED;
                this.d.n();
            }
            if (!this.e.isComplete()) {
                this.e = al.a.PAUSED;
                this.c.n();
            }
        }
    }

    public void p(zk zkVar, zk zkVar2) {
        this.c = zkVar;
        this.d = zkVar2;
    }
}
