package defpackage;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.m;
import defpackage.lm;
import defpackage.se;
import defpackage.ve;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ue  reason: default package */
class ue<R> implements se.a, Runnable, Comparable<ue<?>>, lm.f {
    private Thread A;
    private com.bumptech.glide.load.g B;
    private com.bumptech.glide.load.g C;
    private Object D;
    private com.bumptech.glide.load.a E;
    private wd<?> F;
    private volatile se G;
    private volatile boolean H;
    private volatile boolean I;
    private final te<R> e = new te<>();
    private final List<Throwable> f = new ArrayList();
    private final nm g = nm.a();
    private final e h;
    private final r3<ue<?>> i;
    private final d<?> j = new d<>();
    private final f k = new f();
    private com.bumptech.glide.e l;
    private com.bumptech.glide.load.g m;
    private com.bumptech.glide.g n;
    private af o;
    private int p;
    private int q;
    private we r;
    private i s;
    private b<R> t;
    private int u;
    private h v;
    private g w;
    private long x;
    private boolean y;
    private Object z;

    /* renamed from: ue$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                ue$h[] r2 = defpackage.ue.h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                b = r2
                ue$h r3 = defpackage.ue.h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0038 }
                ue$h r3 = defpackage.ue.h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0043 }
                ue$h r4 = defpackage.ue.h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x004e }
                ue$h r4 = defpackage.ue.h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0059 }
                ue$h r4 = defpackage.ue.h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                ue$g[] r3 = defpackage.ue.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                ue$g r4 = defpackage.ue.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0074 }
                ue$g r3 = defpackage.ue.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007e }
                ue$g r1 = defpackage.ue.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ue.a.<clinit>():void");
        }
    }

    /* renamed from: ue$b */
    interface b<R> {
        void a(df dfVar);

        void c(Cif<R> ifVar, com.bumptech.glide.load.a aVar);

        void d(ue<?> ueVar);
    }

    /* renamed from: ue$c */
    private final class c<Z> implements ve.a<Z> {
        private final com.bumptech.glide.load.a a;

        c(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }

        public Cif<Z> a(Cif<Z> ifVar) {
            return ue.this.G(this.a, ifVar);
        }
    }

    /* renamed from: ue$d */
    private static class d<Z> {
        private com.bumptech.glide.load.g a;
        private l<Z> b;
        private hf<Z> c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        /* access modifiers changed from: package-private */
        public void b(e eVar, i iVar) {
            mm.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new re(this.b, this.c, iVar));
            } finally {
                this.c.g();
                mm.d();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.c != null;
        }

        /* access modifiers changed from: package-private */
        public <X> void d(com.bumptech.glide.load.g gVar, l<X> lVar, hf<X> hfVar) {
            this.a = gVar;
            this.b = lVar;
            this.c = hfVar;
        }
    }

    /* renamed from: ue$e */
    interface e {
        bg a();
    }

    /* renamed from: ue$f */
    private static class f {
        private boolean a;
        private boolean b;
        private boolean c;

        f() {
        }

        private boolean a(boolean z) {
            return (this.c || z || this.b) && this.a;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.b = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            this.c = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }

    /* renamed from: ue$g */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: ue$h */
    private enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    ue(e eVar, r3<ue<?>> r3Var) {
        this.h = eVar;
        this.i = r3Var;
    }

    private void A(Cif<R> ifVar, com.bumptech.glide.load.a aVar) {
        M();
        this.t.c(ifVar, aVar);
    }

    private void B(Cif<R> ifVar, com.bumptech.glide.load.a aVar) {
        if (ifVar instanceof ef) {
            ((ef) ifVar).b();
        }
        hf<R> hfVar = null;
        hf<R> hfVar2 = ifVar;
        if (this.j.c()) {
            hf<R> e2 = hf.e(ifVar);
            hfVar = e2;
            hfVar2 = e2;
        }
        A(hfVar2, aVar);
        this.v = h.ENCODE;
        try {
            if (this.j.c()) {
                this.j.b(this.h, this.s);
            }
            E();
        } finally {
            if (hfVar != null) {
                hfVar.g();
            }
        }
    }

    private void C() {
        M();
        this.t.a(new df("Failed to load resource", (List<Throwable>) new ArrayList(this.f)));
        F();
    }

    private void E() {
        if (this.k.b()) {
            I();
        }
    }

    private void F() {
        if (this.k.c()) {
            I();
        }
    }

    private void I() {
        this.k.e();
        this.j.a();
        this.e.a();
        this.H = false;
        this.l = null;
        this.m = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.t = null;
        this.v = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.x = 0;
        this.I = false;
        this.z = null;
        this.f.clear();
        this.i.c(this);
    }

    private void J() {
        this.A = Thread.currentThread();
        this.x = fm.b();
        boolean z2 = false;
        while (!this.I && this.G != null && !(z2 = this.G.b())) {
            this.v = s(this.v);
            this.G = r();
            if (this.v == h.SOURCE) {
                e();
                return;
            }
        }
        if ((this.v == h.FINISHED || this.I) && !z2) {
            C();
        }
    }

    private <Data, ResourceType> Cif<R> K(Data data, com.bumptech.glide.load.a aVar, gf<Data, ResourceType, R> gfVar) {
        i t2 = t(aVar);
        xd l2 = this.l.h().l(data);
        try {
            return gfVar.a(l2, t2, this.p, this.q, new c(aVar));
        } finally {
            l2.b();
        }
    }

    private void L() {
        int i2 = a.a[this.w.ordinal()];
        if (i2 == 1) {
            this.v = s(h.INITIALIZE);
            this.G = r();
        } else if (i2 != 2) {
            if (i2 == 3) {
                q();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.w);
        }
        J();
    }

    private void M() {
        Throwable th;
        this.g.c();
        if (this.H) {
            if (this.f.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.H = true;
    }

    private <Data> Cif<R> l(wd<?> wdVar, Data data, com.bumptech.glide.load.a aVar) {
        if (data == null) {
            wdVar.b();
            return null;
        }
        try {
            long b2 = fm.b();
            Cif<R> m2 = m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                x("Decoded result " + m2, b2);
            }
            return m2;
        } finally {
            wdVar.b();
        }
    }

    private <Data> Cif<R> m(Data data, com.bumptech.glide.load.a aVar) {
        return K(data, aVar, this.e.h(data.getClass()));
    }

    private void q() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.x;
            z("Retrieved data", j2, "data: " + this.D + ", cache key: " + this.B + ", fetcher: " + this.F);
        }
        Cif<R> ifVar = null;
        try {
            ifVar = l(this.F, this.D, this.E);
        } catch (df e2) {
            e2.i(this.C, this.E);
            this.f.add(e2);
        }
        if (ifVar != null) {
            B(ifVar, this.E);
        } else {
            J();
        }
    }

    private se r() {
        int i2 = a.b[this.v.ordinal()];
        if (i2 == 1) {
            return new jf(this.e, this);
        }
        if (i2 == 2) {
            return new pe(this.e, this);
        }
        if (i2 == 3) {
            return new mf(this.e, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.v);
    }

    private h s(h hVar) {
        int i2 = a.b[hVar.ordinal()];
        if (i2 == 1) {
            return this.r.a() ? h.DATA_CACHE : s(h.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.y ? h.FINISHED : h.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return h.FINISHED;
        }
        if (i2 == 5) {
            return this.r.b() ? h.RESOURCE_CACHE : s(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    private i t(com.bumptech.glide.load.a aVar) {
        i iVar = this.s;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z2 = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.e.w();
        Boolean bool = (Boolean) iVar.c(gi.i);
        if (bool != null && (!bool.booleanValue() || z2)) {
            return iVar;
        }
        i iVar2 = new i();
        iVar2.d(this.s);
        iVar2.e(gi.i, Boolean.valueOf(z2));
        return iVar2;
    }

    private int v() {
        return this.n.ordinal();
    }

    private void x(String str, long j2) {
        z(str, j2, (String) null);
    }

    private void z(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(fm.a(j2));
        sb.append(", load key: ");
        sb.append(this.o);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: kf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: qe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: kf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kf} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> defpackage.Cif<Z> G(com.bumptech.glide.load.a r12, defpackage.Cif<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            te<R> r0 = r11.e
            com.bumptech.glide.load.m r0 = r0.r(r8)
            com.bumptech.glide.e r2 = r11.l
            int r3 = r11.p
            int r4 = r11.q
            if r2 = r0.b(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.a()
        L_0x002b:
            te<R> r13 = r11.e
            boolean r13 = r13.v(r0)
            if (r13 == 0) goto L_0x0040
            te<R> r13 = r11.e
            com.bumptech.glide.load.l r1 = r13.n(r0)
            com.bumptech.glide.load.i r13 = r11.s
            com.bumptech.glide.load.c r13 = r1.b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.c.NONE
        L_0x0042:
            r10 = r1
            te<R> r1 = r11.e
            com.bumptech.glide.load.g r2 = r11.B
            boolean r1 = r1.x(r2)
            r2 = 1
            r1 = r1 ^ r2
            we r3 = r11.r
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = defpackage.ue.a.c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            kf r12 = new kf
            te<R> r13 = r11.e
            of r2 = r13.b()
            com.bumptech.glide.load.g r3 = r11.B
            com.bumptech.glide.load.g r4 = r11.m
            int r5 = r11.p
            int r6 = r11.q
            com.bumptech.glide.load.i r9 = r11.s
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            qe r12 = new qe
            com.bumptech.glide.load.g r13 = r11.B
            com.bumptech.glide.load.g r1 = r11.m
            r12.<init>(r13, r1)
        L_0x009b:
            hf r0 = defpackage.hf.e(r0)
            ue$d<?> r13 = r11.j
            r13.d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.h$d r12 = new com.bumptech.glide.h$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue.G(com.bumptech.glide.load.a, if):if");
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z2) {
        if (this.k.d(z2)) {
            I();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean N() {
        h s2 = s(h.INITIALIZE);
        return s2 == h.RESOURCE_CACHE || s2 == h.DATA_CACHE;
    }

    public void a(com.bumptech.glide.load.g gVar, Exception exc, wd<?> wdVar, com.bumptech.glide.load.a aVar) {
        wdVar.b();
        df dfVar = new df("Fetching data failed", (Throwable) exc);
        dfVar.j(gVar, aVar, wdVar.a());
        this.f.add(dfVar);
        if (Thread.currentThread() != this.A) {
            this.w = g.SWITCH_TO_SOURCE_SERVICE;
            this.t.d(this);
            return;
        }
        J();
    }

    public void e() {
        this.w = g.SWITCH_TO_SOURCE_SERVICE;
        this.t.d(this);
    }

    public void f(com.bumptech.glide.load.g gVar, Object obj, wd<?> wdVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.B = gVar;
        this.D = obj;
        this.F = wdVar;
        this.E = aVar;
        this.C = gVar2;
        if (Thread.currentThread() != this.A) {
            this.w = g.DECODE_DATA;
            this.t.d(this);
            return;
        }
        mm.a("DecodeJob.decodeFromRetrievedData");
        try {
            q();
        } finally {
            mm.d();
        }
    }

    public nm h() {
        return this.g;
    }

    public void i() {
        this.I = true;
        se seVar = this.G;
        if (seVar != null) {
            seVar.cancel();
        }
    }

    /* renamed from: k */
    public int compareTo(ue<?> ueVar) {
        int v2 = v() - ueVar.v();
        return v2 == 0 ? this.u - ueVar.u : v2;
    }

    public void run() {
        mm.b("DecodeJob#run(model=%s)", this.z);
        wd<?> wdVar = this.F;
        try {
            if (this.I) {
                C();
                if (wdVar != null) {
                    wdVar.b();
                }
                mm.d();
                return;
            }
            L();
            if (wdVar != null) {
                wdVar.b();
            }
            mm.d();
        } catch (oe e2) {
            throw e2;
        } catch (Throwable th) {
            if (wdVar != null) {
                wdVar.b();
            }
            mm.d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public ue<R> w(com.bumptech.glide.e eVar, Object obj, af afVar, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, we weVar, Map<Class<?>, m<?>> map, boolean z2, boolean z3, boolean z4, i iVar, b<R> bVar, int i4) {
        this.e.u(eVar, obj, gVar, i2, i3, weVar, cls, cls2, gVar2, iVar, map, z2, z3, this.h);
        this.l = eVar;
        this.m = gVar;
        this.n = gVar2;
        this.o = afVar;
        this.p = i2;
        this.q = i3;
        this.r = weVar;
        this.y = z4;
        this.s = iVar;
        this.t = bVar;
        this.u = i4;
        this.w = g.INITIALIZE;
        this.z = obj;
        return this;
    }
}
