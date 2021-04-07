package defpackage;

import defpackage.al;

/* renamed from: yk  reason: default package */
public final class yk implements al, zk {
    private final Object a;
    private final al b;
    private volatile zk c;
    private volatile zk d;
    private al.a e;
    private al.a f;

    public yk(Object obj, al alVar) {
        al.a aVar = al.a.CLEARED;
        this.e = aVar;
        this.f = aVar;
        this.a = obj;
        this.b = alVar;
    }

    private boolean l(zk zkVar) {
        return zkVar.equals(this.c) || (this.e == al.a.FAILED && zkVar.equals(this.d));
    }

    private boolean m() {
        al alVar = this.b;
        return alVar == null || alVar.k(this);
    }

    private boolean o() {
        al alVar = this.b;
        return alVar == null || alVar.e(this);
    }

    private boolean p() {
        al alVar = this.b;
        return alVar == null || alVar.g(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.zk r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            zk r1 = r2.d     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0020
            al$a r3 = defpackage.al.a.FAILED     // Catch:{ all -> 0x002f }
            r2.e = r3     // Catch:{ all -> 0x002f }
            al$a r3 = r2.f     // Catch:{ all -> 0x002f }
            al$a r1 = defpackage.al.a.RUNNING     // Catch:{ all -> 0x002f }
            if (r3 == r1) goto L_0x001e
            al$a r3 = defpackage.al.a.RUNNING     // Catch:{ all -> 0x002f }
            r2.f = r3     // Catch:{ all -> 0x002f }
            zk r3 = r2.d     // Catch:{ all -> 0x002f }
            r3.h()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0020:
            al$a r3 = defpackage.al.a.FAILED     // Catch:{ all -> 0x002f }
            r2.f = r3     // Catch:{ all -> 0x002f }
            al r3 = r2.b     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            al r3 = r2.b     // Catch:{ all -> 0x002f }
            r3.a(r2)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk.a(zk):void");
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            if (!this.c.b()) {
                if (!this.d.b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public al c() {
        al c2;
        synchronized (this.a) {
            c2 = this.b != null ? this.b.c() : this;
        }
        return c2;
    }

    public void clear() {
        synchronized (this.a) {
            this.e = al.a.CLEARED;
            this.c.clear();
            if (this.f != al.a.CLEARED) {
                this.f = al.a.CLEARED;
                this.d.clear();
            }
        }
    }

    public boolean d(zk zkVar) {
        if (!(zkVar instanceof yk)) {
            return false;
        }
        yk ykVar = (yk) zkVar;
        return this.c.d(ykVar.c) && this.d.d(ykVar.d);
    }

    public boolean e(zk zkVar) {
        boolean z;
        synchronized (this.a) {
            z = o() && l(zkVar);
        }
        return z;
    }

    public boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.e == al.a.CLEARED && this.f == al.a.CLEARED;
        }
        return z;
    }

    public boolean g(zk zkVar) {
        boolean z;
        synchronized (this.a) {
            z = p() && l(zkVar);
        }
        return z;
    }

    public void h() {
        synchronized (this.a) {
            if (this.e != al.a.RUNNING) {
                this.e = al.a.RUNNING;
                this.c.h();
            }
        }
    }

    public void i(zk zkVar) {
        synchronized (this.a) {
            if (zkVar.equals(this.c)) {
                this.e = al.a.SUCCESS;
            } else if (zkVar.equals(this.d)) {
                this.f = al.a.SUCCESS;
            }
            if (this.b != null) {
                this.b.i(this);
            }
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            if (this.e != al.a.RUNNING) {
                if (this.f != al.a.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean j() {
        boolean z;
        synchronized (this.a) {
            if (this.e != al.a.SUCCESS) {
                if (this.f != al.a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean k(zk zkVar) {
        boolean z;
        synchronized (this.a) {
            z = m() && l(zkVar);
        }
        return z;
    }

    public void n() {
        synchronized (this.a) {
            if (this.e == al.a.RUNNING) {
                this.e = al.a.PAUSED;
                this.c.n();
            }
            if (this.f == al.a.RUNNING) {
                this.f = al.a.PAUSED;
                this.d.n();
            }
        }
    }

    public void q(zk zkVar, zk zkVar2) {
        this.c = zkVar;
        this.d = zkVar2;
    }
}
