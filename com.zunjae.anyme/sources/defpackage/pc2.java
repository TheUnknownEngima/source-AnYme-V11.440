package defpackage;

import defpackage.qc2;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: pc2  reason: default package */
public final class pc2 implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ib2.G("OkHttp Http2Connection", true));
    final boolean e;
    final h f;
    final Map<Integer, rc2> g = new LinkedHashMap();
    final String h;
    int i;
    int j;
    boolean k;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService l;
    private final ExecutorService m;
    final uc2 n;
    /* access modifiers changed from: private */
    public boolean o;
    long p = 0;
    long q;
    vc2 r = new vc2();
    final vc2 s = new vc2();
    boolean t = false;
    final Socket u;
    final sc2 v;
    final j w;
    final Set<Integer> x = new LinkedHashSet();

    /* renamed from: pc2$a */
    class a extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ kc2 g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, kc2 kc2) {
            super(str, objArr);
            this.f = i;
            this.g = kc2;
        }

        public void k() {
            try {
                pc2.this.V(this.f, this.g);
            } catch (IOException unused) {
                pc2.this.l();
            }
        }
    }

    /* renamed from: pc2$b */
    class b extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ long g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f = i;
            this.g = j;
        }

        public void k() {
            try {
                pc2.this.v.E(this.f, this.g);
            } catch (IOException unused) {
                pc2.this.l();
            }
        }
    }

    /* renamed from: pc2$c */
    class c extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ List g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f = i;
            this.g = list;
        }

        public void k() {
            if (pc2.this.n.a(this.f, this.g)) {
                try {
                    pc2.this.v.A(this.f, kc2.CANCEL);
                    synchronized (pc2.this) {
                        pc2.this.x.remove(Integer.valueOf(this.f));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: pc2$d */
    class d extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ List g;
        final /* synthetic */ boolean h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i2, List list, boolean z) {
            super(str, objArr);
            this.f = i2;
            this.g = list;
            this.h = z;
        }

        public void k() {
            boolean b = pc2.this.n.b(this.f, this.g, this.h);
            if (b) {
                try {
                    pc2.this.v.A(this.f, kc2.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.h) {
                synchronized (pc2.this) {
                    pc2.this.x.remove(Integer.valueOf(this.f));
                }
            }
        }
    }

    /* renamed from: pc2$e */
    class e extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ nd2 g;
        final /* synthetic */ int h;
        final /* synthetic */ boolean i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i2, nd2 nd2, int i3, boolean z) {
            super(str, objArr);
            this.f = i2;
            this.g = nd2;
            this.h = i3;
            this.i = z;
        }

        public void k() {
            try {
                boolean d = pc2.this.n.d(this.f, this.g, this.h, this.i);
                if (d) {
                    pc2.this.v.A(this.f, kc2.CANCEL);
                }
                if (d || this.i) {
                    synchronized (pc2.this) {
                        pc2.this.x.remove(Integer.valueOf(this.f));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: pc2$f */
    class f extends hb2 {
        final /* synthetic */ int f;
        final /* synthetic */ kc2 g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i, kc2 kc2) {
            super(str, objArr);
            this.f = i;
            this.g = kc2;
        }

        public void k() {
            pc2.this.n.c(this.f, this.g);
            synchronized (pc2.this) {
                pc2.this.x.remove(Integer.valueOf(this.f));
            }
        }
    }

    /* renamed from: pc2$g */
    public static class g {
        Socket a;
        String b;
        pd2 c;
        od2 d;
        h e = h.a;
        uc2 f = uc2.a;
        boolean g;
        int h;

        public g(boolean z) {
            this.g = z;
        }

        public pc2 a() {
            return new pc2(this);
        }

        public g b(h hVar) {
            this.e = hVar;
            return this;
        }

        public g c(int i) {
            this.h = i;
            return this;
        }

        public g d(Socket socket, String str, pd2 pd2, od2 od2) {
            this.a = socket;
            this.b = str;
            this.c = pd2;
            this.d = od2;
            return this;
        }
    }

    /* renamed from: pc2$h */
    public static abstract class h {
        public static final h a = new a();

        /* renamed from: pc2$h$a */
        class a extends h {
            a() {
            }

            public void c(rc2 rc2) {
                rc2.f(kc2.REFUSED_STREAM);
            }
        }

        public void b(pc2 pc2) {
        }

        public abstract void c(rc2 rc2);
    }

    /* renamed from: pc2$i */
    final class i extends hb2 {
        final boolean f;
        final int g;
        final int h;

        i(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", pc2.this.h, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f = z;
            this.g = i2;
            this.h = i3;
        }

        public void k() {
            pc2.this.U(this.f, this.g, this.h);
        }
    }

    /* renamed from: pc2$j */
    class j extends hb2 implements qc2.b {
        final qc2 f;

        /* renamed from: pc2$j$a */
        class a extends hb2 {
            final /* synthetic */ rc2 f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, rc2 rc2) {
                super(str, objArr);
                this.f = rc2;
            }

            public void k() {
                try {
                    pc2.this.f.c(this.f);
                } catch (IOException e) {
                    dd2 j = dd2.j();
                    j.q(4, "Http2Connection.Listener failure for " + pc2.this.h, e);
                    try {
                        this.f.f(kc2.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: pc2$j$b */
        class b extends hb2 {
            b(String str, Object... objArr) {
                super(str, objArr);
            }

            public void k() {
                pc2 pc2 = pc2.this;
                pc2.f.b(pc2);
            }
        }

        /* renamed from: pc2$j$c */
        class c extends hb2 {
            final /* synthetic */ vc2 f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr, vc2 vc2) {
                super(str, objArr);
                this.f = vc2;
            }

            public void k() {
                try {
                    pc2.this.v.a(this.f);
                } catch (IOException unused) {
                    pc2.this.l();
                }
            }
        }

        j(qc2 qc2) {
            super("OkHttp %s", pc2.this.h);
            this.f = qc2;
        }

        private void l(vc2 vc2) {
            try {
                pc2.this.l.execute(new c("OkHttp %s ACK Settings", new Object[]{pc2.this.h}, vc2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void a() {
        }

        /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(boolean r11, defpackage.vc2 r12) {
            /*
                r10 = this;
                pc2 r0 = defpackage.pc2.this
                monitor-enter(r0)
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                vc2 r1 = r1.s     // Catch:{ all -> 0x008f }
                int r1 = r1.d()     // Catch:{ all -> 0x008f }
                if (r11 == 0) goto L_0x0014
                pc2 r11 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                vc2 r11 = r11.s     // Catch:{ all -> 0x008f }
                r11.a()     // Catch:{ all -> 0x008f }
            L_0x0014:
                pc2 r11 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                vc2 r11 = r11.s     // Catch:{ all -> 0x008f }
                r11.h(r12)     // Catch:{ all -> 0x008f }
                r10.l(r12)     // Catch:{ all -> 0x008f }
                pc2 r11 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                vc2 r11 = r11.s     // Catch:{ all -> 0x008f }
                int r11 = r11.d()     // Catch:{ all -> 0x008f }
                r12 = -1
                r2 = 0
                r4 = 1
                r5 = 0
                if (r11 == r12) goto L_0x005f
                if (r11 == r1) goto L_0x005f
                int r11 = r11 - r1
                long r11 = (long) r11     // Catch:{ all -> 0x008f }
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                boolean r1 = r1.t     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x003b
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                r1.t = r4     // Catch:{ all -> 0x008f }
            L_0x003b:
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, rc2> r1 = r1.g     // Catch:{ all -> 0x008f }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x0060
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, rc2> r1 = r1.g     // Catch:{ all -> 0x008f }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x008f }
                pc2 r5 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                java.util.Map<java.lang.Integer, rc2> r5 = r5.g     // Catch:{ all -> 0x008f }
                int r5 = r5.size()     // Catch:{ all -> 0x008f }
                rc2[] r5 = new defpackage.rc2[r5]     // Catch:{ all -> 0x008f }
                java.lang.Object[] r1 = r1.toArray(r5)     // Catch:{ all -> 0x008f }
                r5 = r1
                rc2[] r5 = (defpackage.rc2[]) r5     // Catch:{ all -> 0x008f }
                goto L_0x0060
            L_0x005f:
                r11 = r2
            L_0x0060:
                java.util.concurrent.ExecutorService r1 = defpackage.pc2.y     // Catch:{ all -> 0x008f }
                pc2$j$b r6 = new pc2$j$b     // Catch:{ all -> 0x008f }
                java.lang.String r7 = "OkHttp %s settings"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008f }
                pc2 r8 = defpackage.pc2.this     // Catch:{ all -> 0x008f }
                java.lang.String r8 = r8.h     // Catch:{ all -> 0x008f }
                r9 = 0
                r4[r9] = r8     // Catch:{ all -> 0x008f }
                r6.<init>(r7, r4)     // Catch:{ all -> 0x008f }
                r1.execute(r6)     // Catch:{ all -> 0x008f }
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                if (r5 == 0) goto L_0x008e
                int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x008e
                int r0 = r5.length
            L_0x007f:
                if (r9 >= r0) goto L_0x008e
                r1 = r5[r9]
                monitor-enter(r1)
                r1.c(r11)     // Catch:{ all -> 0x008b }
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                int r9 = r9 + 1
                goto L_0x007f
            L_0x008b:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008b }
                throw r11
            L_0x008e:
                return
            L_0x008f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008f }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.j.b(boolean, vc2):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r0.q(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            r0.p();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(boolean r10, int r11, int r12, java.util.List<defpackage.lc2> r13) {
            /*
                r9 = this;
                pc2 r12 = defpackage.pc2.this
                boolean r12 = r12.J(r11)
                if (r12 == 0) goto L_0x000e
                pc2 r12 = defpackage.pc2.this
                r12.E(r11, r13, r10)
                return
            L_0x000e:
                pc2 r12 = defpackage.pc2.this
                monitor-enter(r12)
                pc2 r0 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                rc2 r0 = r0.m(r11)     // Catch:{ all -> 0x007d }
                if (r0 != 0) goto L_0x0073
                pc2 r0 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                boolean r0 = r0.k     // Catch:{ all -> 0x007d }
                if (r0 == 0) goto L_0x0021
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0021:
                pc2 r0 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                int r0 = r0.i     // Catch:{ all -> 0x007d }
                if (r11 > r0) goto L_0x0029
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0029:
                int r0 = r11 % 2
                pc2 r1 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                int r1 = r1.j     // Catch:{ all -> 0x007d }
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0035:
                sa2 r8 = defpackage.ib2.H(r13)     // Catch:{ all -> 0x007d }
                rc2 r13 = new rc2     // Catch:{ all -> 0x007d }
                pc2 r5 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007d }
                pc2 r10 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                r10.i = r11     // Catch:{ all -> 0x007d }
                pc2 r10 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                java.util.Map<java.lang.Integer, rc2> r10 = r10.g     // Catch:{ all -> 0x007d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r10.put(r0, r13)     // Catch:{ all -> 0x007d }
                java.util.concurrent.ExecutorService r10 = defpackage.pc2.y     // Catch:{ all -> 0x007d }
                pc2$j$a r0 = new pc2$j$a     // Catch:{ all -> 0x007d }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
                r3 = 0
                pc2 r4 = defpackage.pc2.this     // Catch:{ all -> 0x007d }
                java.lang.String r4 = r4.h     // Catch:{ all -> 0x007d }
                r2[r3] = r4     // Catch:{ all -> 0x007d }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r2[r3] = r11     // Catch:{ all -> 0x007d }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007d }
                r10.execute(r0)     // Catch:{ all -> 0x007d }
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0073:
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                r0.q(r13)
                if (r10 == 0) goto L_0x007c
                r0.p()
            L_0x007c:
                return
            L_0x007d:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.j.c(boolean, int, int, java.util.List):void");
        }

        public void d(int i, long j) {
            pc2 pc2 = pc2.this;
            if (i == 0) {
                synchronized (pc2) {
                    pc2.this.q += j;
                    pc2.this.notifyAll();
                }
                return;
            }
            rc2 m = pc2.m(i);
            if (m != null) {
                synchronized (m) {
                    m.c(j);
                }
            }
        }

        public void e(boolean z, int i, pd2 pd2, int i2) {
            if (pc2.this.J(i)) {
                pc2.this.B(i, pd2, i2, z);
                return;
            }
            rc2 m = pc2.this.m(i);
            if (m == null) {
                pc2.this.Y(i, kc2.PROTOCOL_ERROR);
                long j = (long) i2;
                pc2.this.P(j);
                pd2.e(j);
                return;
            }
            m.o(pd2, i2);
            if (z) {
                m.p();
            }
        }

        public void f(boolean z, int i, int i2) {
            if (z) {
                synchronized (pc2.this) {
                    boolean unused = pc2.this.o = false;
                    pc2.this.notifyAll();
                }
                return;
            }
            try {
                pc2.this.l.execute(new i(true, i, i2));
            } catch (RejectedExecutionException unused2) {
            }
        }

        public void g(int i, int i2, int i3, boolean z) {
        }

        public void h(int i, kc2 kc2) {
            if (pc2.this.J(i)) {
                pc2.this.G(i, kc2);
                return;
            }
            rc2 K = pc2.this.K(i);
            if (K != null) {
                K.r(kc2);
            }
        }

        public void i(int i, int i2, List<lc2> list) {
            pc2.this.F(i2, list);
        }

        public void j(int i, kc2 kc2, qd2 qd2) {
            rc2[] rc2Arr;
            qd2.A();
            synchronized (pc2.this) {
                rc2Arr = (rc2[]) pc2.this.g.values().toArray(new rc2[pc2.this.g.size()]);
                pc2.this.k = true;
            }
            for (rc2 rc2 : rc2Arr) {
                if (rc2.i() > i && rc2.l()) {
                    rc2.r(kc2.REFUSED_STREAM);
                    pc2.this.K(rc2.i());
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = defpackage.kc2.PROTOCOL_ERROR;
            r0 = defpackage.kc2.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r2 = r4.g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r4 = this;
                kc2 r0 = defpackage.kc2.INTERNAL_ERROR
                qc2 r1 = r4.f     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.h(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                qc2 r1 = r4.f     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.b(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                kc2 r1 = defpackage.kc2.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                kc2 r0 = defpackage.kc2.CANCEL     // Catch:{ IOException -> 0x001c }
                pc2 r2 = defpackage.pc2.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                kc2 r1 = defpackage.kc2.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                kc2 r0 = defpackage.kc2.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                pc2 r2 = defpackage.pc2.this     // Catch:{ IOException -> 0x0025 }
            L_0x0022:
                r2.k(r1, r0)     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                qc2 r0 = r4.f
                defpackage.ib2.g(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                pc2 r3 = defpackage.pc2.this     // Catch:{ IOException -> 0x0031 }
                r3.k(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                qc2 r0 = r4.f
                defpackage.ib2.g(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.j.k():void");
        }
    }

    static {
        Class<pc2> cls = pc2.class;
    }

    pc2(g gVar) {
        g gVar2 = gVar;
        this.n = gVar2.f;
        boolean z = gVar2.g;
        this.e = z;
        this.f = gVar2.e;
        int i2 = z ? 1 : 2;
        this.j = i2;
        if (gVar2.g) {
            this.j = i2 + 2;
        }
        if (gVar2.g) {
            this.r.i(7, 16777216);
        }
        this.h = gVar2.b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, ib2.G(ib2.r("OkHttp %s Writer", this.h), false));
        this.l = scheduledThreadPoolExecutor;
        if (gVar2.h != 0) {
            i iVar = new i(false, 0, 0);
            int i3 = gVar2.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i3, (long) i3, TimeUnit.MILLISECONDS);
        }
        this.m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), ib2.G(ib2.r("OkHttp %s Push Observer", this.h), true));
        this.s.i(7, 65535);
        this.s.i(5, 16384);
        this.q = (long) this.s.d();
        this.u = gVar2.a;
        this.v = new sc2(gVar2.d, this.e);
        this.w = new j(new qc2(gVar2.c, this.e));
    }

    private synchronized void C(hb2 hb2) {
        if (!r()) {
            this.m.execute(hb2);
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        try {
            k(kc2.PROTOCOL_ERROR, kc2.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.rc2 z(int r11, java.util.List<defpackage.lc2> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            sc2 r7 = r10.v
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.j     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            kc2 r0 = defpackage.kc2.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.L(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.k     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.j     // Catch:{ all -> 0x0075 }
            int r0 = r10.j     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.j = r0     // Catch:{ all -> 0x0075 }
            rc2 r9 = new rc2     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.q     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.m()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, rc2> r0 = r10.g     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            sc2 r0 = r10.v     // Catch:{ all -> 0x0078 }
            r0.C(r6, r8, r11, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.e     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            sc2 r0 = r10.v     // Catch:{ all -> 0x0078 }
            r0.z(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            sc2 r11 = r10.v
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            jc2 r11 = new jc2     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.z(int, java.util.List, boolean):rc2");
    }

    public rc2 A(List<lc2> list, boolean z) {
        return z(0, list, z);
    }

    /* access modifiers changed from: package-private */
    public void B(int i2, pd2 pd2, int i3, boolean z) {
        nd2 nd2 = new nd2();
        long j2 = (long) i3;
        pd2.H0(j2);
        pd2.y0(nd2, j2);
        if (nd2.k0() == j2) {
            C(new e("OkHttp %s Push Data[%s]", new Object[]{this.h, Integer.valueOf(i2)}, i2, nd2, i3, z));
            return;
        }
        throw new IOException(nd2.k0() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void E(int i2, List<lc2> list, boolean z) {
        try {
            C(new d("OkHttp %s Push Headers[%s]", new Object[]{this.h, Integer.valueOf(i2)}, i2, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void F(int i2, List<lc2> list) {
        synchronized (this) {
            if (this.x.contains(Integer.valueOf(i2))) {
                Y(i2, kc2.PROTOCOL_ERROR);
                return;
            }
            this.x.add(Integer.valueOf(i2));
            try {
                C(new c("OkHttp %s Push Request[%s]", new Object[]{this.h, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G(int i2, kc2 kc2) {
        C(new f("OkHttp %s Push Reset[%s]", new Object[]{this.h, Integer.valueOf(i2)}, i2, kc2));
    }

    /* access modifiers changed from: package-private */
    public boolean J(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized rc2 K(int i2) {
        rc2 remove;
        remove = this.g.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public void L(kc2 kc2) {
        synchronized (this.v) {
            synchronized (this) {
                if (!this.k) {
                    this.k = true;
                    int i2 = this.i;
                    this.v.l(i2, kc2, ib2.a);
                }
            }
        }
    }

    public void M() {
        N(true);
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z) {
        if (z) {
            this.v.b();
            this.v.B(this.r);
            int d2 = this.r.d();
            if (d2 != 65535) {
                this.v.E(0, (long) (d2 - 65535));
            }
        }
        new Thread(this.w).start();
    }

    /* access modifiers changed from: package-private */
    public synchronized void P(long j2) {
        long j3 = this.p + j2;
        this.p = j3;
        if (j3 >= ((long) (this.r.d() / 2))) {
            Z(0, this.p);
            this.p = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.q), r8.v.r());
        r6 = (long) r3;
        r8.q -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(int r9, boolean r10, defpackage.nd2 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            sc2 r12 = r8.v
            r12.h(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.q     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, rc2> r3 = r8.g     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.q     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            sc2 r3 = r8.v     // Catch:{ all -> 0x0058 }
            int r3 = r3.r()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.q     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.q = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            sc2 r4 = r8.v
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.h(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.Q(int, boolean, nd2, long):void");
    }

    /* access modifiers changed from: package-private */
    public void U(boolean z, int i2, int i3) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.o;
                this.o = true;
            }
            if (z2) {
                l();
                return;
            }
        }
        try {
            this.v.t(z, i2, i3);
        } catch (IOException unused) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i2, kc2 kc2) {
        this.v.A(i2, kc2);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i2, kc2 kc2) {
        try {
            this.l.execute(new a("OkHttp %s stream %d", new Object[]{this.h, Integer.valueOf(i2)}, i2, kc2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(int i2, long j2) {
        try {
            this.l.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.h, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void close() {
        k(kc2.NO_ERROR, kc2.CANCEL);
    }

    public void flush() {
        this.v.flush();
    }

    /* access modifiers changed from: package-private */
    public void k(kc2 kc2, kc2 kc22) {
        rc2[] rc2Arr = null;
        try {
            L(kc2);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.g.isEmpty()) {
                rc2Arr = (rc2[]) this.g.values().toArray(new rc2[this.g.size()]);
                this.g.clear();
            }
        }
        if (rc2Arr != null) {
            for (rc2 f2 : rc2Arr) {
                try {
                    f2.f(kc22);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.v.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.u.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.l.shutdown();
        this.m.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized rc2 m(int i2) {
        return this.g.get(Integer.valueOf(i2));
    }

    public synchronized boolean r() {
        return this.k;
    }

    public synchronized int t() {
        return this.s.e(Integer.MAX_VALUE);
    }
}
