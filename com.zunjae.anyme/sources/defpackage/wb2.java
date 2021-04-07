package defpackage;

import defpackage.ua2;
import defpackage.vb2;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* renamed from: wb2  reason: default package */
public final class wb2 {
    public final aa2 a;
    private vb2.a b;
    private eb2 c;
    private final ja2 d;
    public final ea2 e;
    public final pa2 f;
    private final Object g;
    private final vb2 h;
    private int i;
    private sb2 j;
    private boolean k;
    private boolean l;
    private boolean m;
    private zb2 n;

    /* renamed from: wb2$a */
    public static final class a extends WeakReference<wb2> {
        public final Object a;

        a(wb2 wb2, Object obj) {
            super(wb2);
            this.a = obj;
        }
    }

    public wb2(ja2 ja2, aa2 aa2, ea2 ea2, pa2 pa2, Object obj) {
        this.d = ja2;
        this.a = aa2;
        this.e = ea2;
        this.f = pa2;
        this.h = new vb2(aa2, p(), ea2, pa2);
        this.g = obj;
    }

    private Socket e(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.n = null;
        }
        if (z2) {
            this.l = true;
        }
        sb2 sb2 = this.j;
        if (sb2 == null) {
            return null;
        }
        if (z) {
            sb2.k = true;
        }
        if (this.n != null) {
            return null;
        }
        if (!this.l && !this.j.k) {
            return null;
        }
        l(this.j);
        if (this.j.n.isEmpty()) {
            this.j.o = System.nanoTime();
            if (gb2.a.e(this.d, this.j)) {
                socket = this.j.r();
                this.j = null;
                return socket;
            }
        }
        socket = null;
        this.j = null;
        return socket;
    }

    private sb2 f(int i2, int i3, int i4, int i5, boolean z) {
        Socket n2;
        Socket socket;
        sb2 sb2;
        sb2 sb22;
        boolean z2;
        eb2 eb2;
        boolean z3;
        vb2.a aVar;
        synchronized (this.d) {
            if (this.l) {
                throw new IllegalStateException("released");
            } else if (this.n != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.m) {
                sb2 sb23 = this.j;
                n2 = n();
                socket = null;
                if (this.j != null) {
                    sb22 = this.j;
                    sb2 = null;
                } else {
                    sb2 = sb23;
                    sb22 = null;
                }
                if (!this.k) {
                    sb2 = null;
                }
                if (sb22 == null) {
                    gb2.a.h(this.d, this.a, this, (eb2) null);
                    if (this.j != null) {
                        sb22 = this.j;
                        eb2 = null;
                        z2 = true;
                    } else {
                        eb2 = this.c;
                    }
                } else {
                    eb2 = null;
                }
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        ib2.h(n2);
        if (sb2 != null) {
            this.f.h(this.e, sb2);
        }
        if (z2) {
            this.f.g(this.e, sb22);
        }
        if (sb22 != null) {
            return sb22;
        }
        if (eb2 != null || ((aVar = this.b) != null && aVar.b())) {
            z3 = false;
        } else {
            this.b = this.h.e();
            z3 = true;
        }
        synchronized (this.d) {
            if (!this.m) {
                if (z3) {
                    List<eb2> a2 = this.b.a();
                    int size = a2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        eb2 eb22 = a2.get(i6);
                        gb2.a.h(this.d, this.a, this, eb22);
                        if (this.j != null) {
                            sb22 = this.j;
                            this.c = eb22;
                            z2 = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (!z2) {
                    if (eb2 == null) {
                        eb2 = this.b.c();
                    }
                    this.c = eb2;
                    this.i = 0;
                    sb22 = new sb2(this.d, eb2);
                    a(sb22, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z2) {
            sb22.e(i2, i3, i4, i5, z, this.e, this.f);
            p().a(sb22.q());
            synchronized (this.d) {
                this.k = true;
                gb2.a.i(this.d, sb22);
                if (sb22.o()) {
                    socket = gb2.a.f(this.d, this.a, this);
                    sb22 = this.j;
                }
            }
            ib2.h(socket);
        }
        this.f.g(this.e, sb22);
        return sb22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0.n(r9) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.sb2 g(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
            r3 = this;
        L_0x0000:
            sb2 r0 = r3.f(r4, r5, r6, r7, r8)
            ja2 r1 = r3.d
            monitor-enter(r1)
            int r2 = r0.l     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x000d:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            boolean r1 = r0.n(r9)
            if (r1 != 0) goto L_0x0018
            r3.j()
            goto L_0x0000
        L_0x0018:
            return r0
        L_0x0019:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.g(int, int, int, int, boolean, boolean):sb2");
    }

    private void l(sb2 sb2) {
        int size = sb2.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sb2.n.get(i2).get() == this) {
                sb2.n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket n() {
        sb2 sb2 = this.j;
        if (sb2 == null || !sb2.k) {
            return null;
        }
        return e(false, false, true);
    }

    private tb2 p() {
        return gb2.a.j(this.d);
    }

    public void a(sb2 sb2, boolean z) {
        if (this.j == null) {
            this.j = sb2;
            this.k = z;
            sb2.n.add(new a(this, this.g));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        zb2 zb2;
        sb2 sb2;
        synchronized (this.d) {
            this.m = true;
            zb2 = this.n;
            sb2 = this.j;
        }
        if (zb2 != null) {
            zb2.cancel();
        } else if (sb2 != null) {
            sb2.d();
        }
    }

    public zb2 c() {
        zb2 zb2;
        synchronized (this.d) {
            zb2 = this.n;
        }
        return zb2;
    }

    public synchronized sb2 d() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h() {
        /*
            r1 = this;
            eb2 r0 = r1.c
            if (r0 != 0) goto L_0x0019
            vb2$a r0 = r1.b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            vb2 r0 = r1.h
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.h():boolean");
    }

    public zb2 i(xa2 xa2, ua2.a aVar, boolean z) {
        try {
            zb2 p = g(aVar.e(), aVar.a(), aVar.b(), xa2.A(), xa2.I(), z).p(xa2, aVar, this);
            synchronized (this.d) {
                this.n = p;
            }
            return p;
        } catch (IOException e2) {
            throw new ub2(e2);
        }
    }

    public void j() {
        sb2 sb2;
        Socket e2;
        synchronized (this.d) {
            sb2 = this.j;
            e2 = e(true, false, false);
            if (this.j != null) {
                sb2 = null;
            }
        }
        ib2.h(e2);
        if (sb2 != null) {
            this.f.h(this.e, sb2);
        }
    }

    public void k() {
        sb2 sb2;
        Socket e2;
        synchronized (this.d) {
            sb2 = this.j;
            e2 = e(false, true, false);
            if (this.j != null) {
                sb2 = null;
            }
        }
        ib2.h(e2);
        if (sb2 != null) {
            gb2.a.k(this.e, (IOException) null);
            this.f.h(this.e, sb2);
            this.f.a(this.e);
        }
    }

    public Socket m(sb2 sb2) {
        if (this.n == null && this.j.n.size() == 1) {
            Socket e2 = e(true, false, false);
            this.j = sb2;
            sb2.n.add(this.j.n.get(0));
            return e2;
        }
        throw new IllegalStateException();
    }

    public eb2 o() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != defpackage.kc2.CANCEL) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.io.IOException r7) {
        /*
            r6 = this;
            ja2 r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r7 instanceof defpackage.wc2     // Catch:{ all -> 0x0066 }
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0021
            wc2 r7 = (defpackage.wc2) r7     // Catch:{ all -> 0x0066 }
            kc2 r7 = r7.e     // Catch:{ all -> 0x0066 }
            kc2 r1 = defpackage.kc2.REFUSED_STREAM     // Catch:{ all -> 0x0066 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.i     // Catch:{ all -> 0x0066 }
            int r7 = r7 + r4
            r6.i = r7     // Catch:{ all -> 0x0066 }
            if (r7 <= r4) goto L_0x0047
            goto L_0x001e
        L_0x001a:
            kc2 r1 = defpackage.kc2.CANCEL     // Catch:{ all -> 0x0066 }
            if (r7 == r1) goto L_0x0047
        L_0x001e:
            r6.c = r3     // Catch:{ all -> 0x0066 }
            goto L_0x0045
        L_0x0021:
            sb2 r1 = r6.j     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
            sb2 r1 = r6.j     // Catch:{ all -> 0x0066 }
            boolean r1 = r1.o()     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r7 instanceof defpackage.jc2     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0047
        L_0x0031:
            sb2 r1 = r6.j     // Catch:{ all -> 0x0066 }
            int r1 = r1.l     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0045
            eb2 r1 = r6.c     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            vb2 r1 = r6.h     // Catch:{ all -> 0x0066 }
            eb2 r5 = r6.c     // Catch:{ all -> 0x0066 }
            r1.a(r5, r7)     // Catch:{ all -> 0x0066 }
            goto L_0x001e
        L_0x0045:
            r7 = 1
            goto L_0x0048
        L_0x0047:
            r7 = 0
        L_0x0048:
            sb2 r1 = r6.j     // Catch:{ all -> 0x0066 }
            java.net.Socket r7 = r6.e(r7, r2, r4)     // Catch:{ all -> 0x0066 }
            sb2 r2 = r6.j     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0058
            boolean r2 = r6.k     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            defpackage.ib2.h(r7)
            if (r3 == 0) goto L_0x0065
            pa2 r7 = r6.f
            ea2 r0 = r6.e
            r7.h(r0, r3)
        L_0x0065:
            return
        L_0x0066:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.q(java.io.IOException):void");
    }

    public void r(boolean z, zb2 zb2, long j2, IOException iOException) {
        sb2 sb2;
        Socket e2;
        boolean z2;
        this.f.p(this.e, j2);
        synchronized (this.d) {
            if (zb2 != null) {
                if (zb2 == this.n) {
                    if (!z) {
                        this.j.l++;
                    }
                    sb2 = this.j;
                    e2 = e(z, false, true);
                    if (this.j != null) {
                        sb2 = null;
                    }
                    z2 = this.l;
                }
            }
            throw new IllegalStateException("expected " + this.n + " but was " + zb2);
        }
        ib2.h(e2);
        if (sb2 != null) {
            this.f.h(this.e, sb2);
        }
        if (iOException != null) {
            this.f.b(this.e, gb2.a.k(this.e, iOException));
        } else if (z2) {
            gb2.a.k(this.e, (IOException) null);
            this.f.a(this.e);
        }
    }

    public String toString() {
        sb2 d2 = d();
        return d2 != null ? d2.toString() : this.a.toString();
    }
}
