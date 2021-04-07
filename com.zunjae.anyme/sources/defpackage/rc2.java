package defpackage;

import defpackage.lc2;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: rc2  reason: default package */
public final class rc2 {
    long a = 0;
    long b;
    final int c;
    final pc2 d;
    /* access modifiers changed from: private */
    public final Deque<sa2> e = new ArrayDeque();
    /* access modifiers changed from: private */
    public lc2.a f;
    private boolean g;
    private final b h;
    final a i;
    final c j = new c();
    final c k = new c();
    kc2 l = null;

    /* renamed from: rc2$a */
    final class a implements ce2 {
        private final nd2 e = new nd2();
        boolean f;
        boolean g;

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) {
            long min;
            synchronized (rc2.this) {
                rc2.this.k.k();
                while (rc2.this.b <= 0 && !this.g && !this.f && rc2.this.l == null) {
                    try {
                        rc2.this.t();
                    } catch (Throwable th) {
                        rc2.this.k.u();
                        throw th;
                    }
                }
                rc2.this.k.u();
                rc2.this.e();
                min = Math.min(rc2.this.b, this.e.k0());
                rc2.this.b -= min;
            }
            rc2.this.k.k();
            try {
                rc2.this.d.Q(rc2.this.c, z && min == this.e.k0(), this.e, min);
            } finally {
                rc2.this.k.u();
            }
        }

        public void X(nd2 nd2, long j) {
            this.e.X(nd2, j);
            while (this.e.k0() >= 16384) {
                a(false);
            }
        }

        public ee2 c() {
            return rc2.this.k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.e.k0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.e.k0() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.h;
            r0.d.Q(r0.c, true, (defpackage.nd2) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.h.d.flush();
            r8.h.d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.h.i.g != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                rc2 r0 = defpackage.rc2.this
                monitor-enter(r0)
                boolean r1 = r8.f     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                rc2 r0 = defpackage.rc2.this
                rc2$a r0 = r0.i
                boolean r0 = r0.g
                r1 = 1
                if (r0 != 0) goto L_0x003a
                nd2 r0 = r8.e
                long r2 = r0.k0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                nd2 r0 = r8.e
                long r2 = r0.k0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.a(r1)
                goto L_0x001f
            L_0x002d:
                rc2 r0 = defpackage.rc2.this
                pc2 r2 = r0.d
                int r3 = r0.c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.Q(r3, r4, r5, r6)
            L_0x003a:
                rc2 r2 = defpackage.rc2.this
                monitor-enter(r2)
                r8.f = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                rc2 r0 = defpackage.rc2.this
                pc2 r0 = r0.d
                r0.flush()
                rc2 r0 = defpackage.rc2.this
                r0.d()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.a.close():void");
        }

        public void flush() {
            synchronized (rc2.this) {
                rc2.this.e();
            }
            while (this.e.k0() > 0) {
                a(false);
                rc2.this.d.flush();
            }
        }
    }

    /* renamed from: rc2$b */
    private final class b implements de2 {
        private final nd2 e = new nd2();
        private final nd2 f = new nd2();
        private final long g;
        boolean h;
        boolean i;

        b(long j2) {
            this.g = j2;
        }

        private void b(long j2) {
            rc2.this.d.P(j2);
        }

        /* access modifiers changed from: package-private */
        public void a(pd2 pd2, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j2 > 0) {
                synchronized (rc2.this) {
                    z = this.i;
                    z2 = true;
                    z3 = this.f.k0() + j2 > this.g;
                }
                if (z3) {
                    pd2.e(j2);
                    rc2.this.h(kc2.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    pd2.e(j2);
                    return;
                } else {
                    long y0 = pd2.y0(this.e, j2);
                    if (y0 != -1) {
                        j2 -= y0;
                        synchronized (rc2.this) {
                            if (this.f.k0() != 0) {
                                z2 = false;
                            }
                            this.f.a0(this.e);
                            if (z2) {
                                rc2.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public ee2 c() {
            return rc2.this.j;
        }

        public void close() {
            long k0;
            lc2.a aVar;
            ArrayList<sa2> arrayList;
            synchronized (rc2.this) {
                this.h = true;
                k0 = this.f.k0();
                this.f.b();
                aVar = null;
                if (rc2.this.e.isEmpty() || rc2.this.f == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(rc2.this.e);
                    rc2.this.e.clear();
                    ArrayList arrayList3 = arrayList2;
                    aVar = rc2.this.f;
                    arrayList = arrayList3;
                }
                rc2.this.notifyAll();
            }
            if (k0 > 0) {
                b(k0);
            }
            rc2.this.d();
            if (aVar != null) {
                for (sa2 a : arrayList) {
                    aVar.a(a);
                }
            }
        }

        public long y0(nd2 nd2, long j2) {
            kc2 kc2;
            long j3;
            lc2.a aVar;
            sa2 sa2;
            long j4 = j2;
            if (j4 >= 0) {
                while (true) {
                    synchronized (rc2.this) {
                        rc2.this.j.k();
                        try {
                            kc2 = rc2.this.l != null ? rc2.this.l : null;
                            if (!this.h) {
                                if (rc2.this.e.isEmpty() || rc2.this.f == null) {
                                    if (this.f.k0() > 0) {
                                        j3 = this.f.y0(nd2, Math.min(j4, this.f.k0()));
                                        rc2.this.a += j3;
                                        if (kc2 == null && rc2.this.a >= ((long) (rc2.this.d.r.d() / 2))) {
                                            rc2.this.d.Z(rc2.this.c, rc2.this.a);
                                            rc2.this.a = 0;
                                        }
                                    } else {
                                        nd2 nd22 = nd2;
                                        if (this.i || kc2 != null) {
                                            j3 = -1;
                                        } else {
                                            rc2.this.t();
                                        }
                                    }
                                    sa2 = null;
                                    aVar = null;
                                } else {
                                    sa2 = (sa2) rc2.this.e.removeFirst();
                                    aVar = rc2.this.f;
                                    nd2 nd23 = nd2;
                                    j3 = -1;
                                }
                                rc2.this.j.u();
                                if (sa2 != null && aVar != null) {
                                    aVar.a(sa2);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            rc2.this.j.u();
                        }
                    }
                }
                if (j3 != -1) {
                    b(j3);
                    return j3;
                } else if (kc2 == null) {
                    return -1;
                } else {
                    throw new wc2(kc2);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j4);
            }
        }
    }

    /* renamed from: rc2$c */
    class c extends ld2 {
        c() {
        }

        /* access modifiers changed from: protected */
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void t() {
            rc2.this.h(kc2.CANCEL);
        }

        public void u() {
            if (n()) {
                throw o((IOException) null);
            }
        }
    }

    rc2(int i2, pc2 pc2, boolean z, boolean z2, @Nullable sa2 sa2) {
        if (pc2 != null) {
            this.c = i2;
            this.d = pc2;
            this.b = (long) pc2.s.d();
            this.h = new b((long) pc2.r.d());
            a aVar = new a();
            this.i = aVar;
            this.h.i = z2;
            aVar.g = z;
            if (sa2 != null) {
                this.e.add(sa2);
            }
            if (l() && sa2 != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!l() && sa2 == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean g(kc2 kc2) {
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.h.i && this.i.g) {
                return false;
            }
            this.l = kc2;
            notifyAll();
            this.d.K(this.c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        boolean z;
        boolean m;
        synchronized (this) {
            z = !this.h.i && this.h.h && (this.i.g || this.i.f);
            m = m();
        }
        if (z) {
            f(kc2.CANCEL);
        } else if (!m) {
            this.d.K(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a aVar = this.i;
        if (aVar.f) {
            throw new IOException("stream closed");
        } else if (aVar.g) {
            throw new IOException("stream finished");
        } else if (this.l != null) {
            throw new wc2(this.l);
        }
    }

    public void f(kc2 kc2) {
        if (g(kc2)) {
            this.d.V(this.c, kc2);
        }
    }

    public void h(kc2 kc2) {
        if (g(kc2)) {
            this.d.Y(this.c, kc2);
        }
    }

    public int i() {
        return this.c;
    }

    public ce2 j() {
        synchronized (this) {
            if (!this.g) {
                if (!l()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.i;
    }

    public de2 k() {
        return this.h;
    }

    public boolean l() {
        return this.d.e == ((this.c & 1) == 1);
    }

    public synchronized boolean m() {
        if (this.l != null) {
            return false;
        }
        return (!this.h.i && !this.h.h) || (!this.i.g && !this.i.f) || !this.g;
    }

    public ee2 n() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void o(pd2 pd2, int i2) {
        this.h.a(pd2, (long) i2);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        boolean m;
        synchronized (this) {
            this.h.i = true;
            m = m();
            notifyAll();
        }
        if (!m) {
            this.d.K(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(List<lc2> list) {
        boolean m;
        synchronized (this) {
            this.g = true;
            this.e.add(ib2.H(list));
            m = m();
            notifyAll();
        }
        if (!m) {
            this.d.K(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(kc2 kc2) {
        if (this.l == null) {
            this.l = kc2;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        r2.j.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.sa2 s() {
        /*
            r2 = this;
            monitor-enter(r2)
            rc2$c r0 = r2.j     // Catch:{ all -> 0x003c }
            r0.k()     // Catch:{ all -> 0x003c }
        L_0x0006:
            java.util.Deque<sa2> r0 = r2.e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0016
            kc2 r0 = r2.l     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0016
            r2.t()     // Catch:{ all -> 0x0035 }
            goto L_0x0006
        L_0x0016:
            rc2$c r0 = r2.j     // Catch:{ all -> 0x003c }
            r0.u()     // Catch:{ all -> 0x003c }
            java.util.Deque<sa2> r0 = r2.e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<sa2> r0 = r2.e     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x003c }
            sa2 r0 = (defpackage.sa2) r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)
            return r0
        L_0x002d:
            wc2 r0 = new wc2     // Catch:{ all -> 0x003c }
            kc2 r1 = r2.l     // Catch:{ all -> 0x003c }
            r0.<init>(r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r0 = move-exception
            rc2$c r1 = r2.j     // Catch:{ all -> 0x003c }
            r1.u()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc2.s():sa2");
    }

    /* access modifiers changed from: package-private */
    public void t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public ee2 u() {
        return this.k;
    }
}
