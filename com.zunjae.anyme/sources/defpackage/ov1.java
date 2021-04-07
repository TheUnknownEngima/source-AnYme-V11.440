package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import com.zunjae.anyme.features.database.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ov1  reason: default package */
public final class ov1 {
    private final com.zunjae.anyme.features.database.a a;

    /* renamed from: ov1$a */
    private static final class a extends AsyncTask<lx1, Void, Void> {
        private final com.zunjae.anyme.features.database.a a;

        public a(com.zunjae.anyme.features.database.a aVar) {
            v62.e(aVar, "dao");
            this.a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(lx1... lx1Arr) {
            v62.e(lx1Arr, "animeJikanInfoR2s");
            this.a.a(lx1Arr[0]);
            return null;
        }
    }

    /* renamed from: ov1$b */
    private static final class b extends AsyncTask<sy1, Void, Void> {
        private final com.zunjae.anyme.features.database.a a;
        private final mv1 b;

        public b(com.zunjae.anyme.features.database.a aVar, mv1 mv1) {
            v62.e(aVar, "dao");
            v62.e(mv1, "crud");
            this.a = aVar;
            this.b = mv1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(sy1... sy1Arr) {
            v62.e(sy1Arr, "params");
            sy1 sy1 = sy1Arr[0];
            int i = pv1.a[this.b.ordinal()];
            if (i == 1) {
                this.a.b(sy1);
                return null;
            } else if (i == 2) {
                this.a.h0(sy1);
                return null;
            } else if (i != 3) {
                return null;
            } else {
                this.a.t(sy1);
                return null;
            }
        }
    }

    public ov1(Context context) {
        v62.e(context, "application");
        com.zunjae.anyme.features.database.a w = AppDatabase.y(context).w();
        v62.d(w, "AppDatabase.getAppDatabase(application).animeDao()");
        this.a = w;
    }

    private final List<yy1> f() {
        return this.a.i();
    }

    public final List<ux1> A(long j) {
        boolean z;
        List<ux1> J = this.a.J(j, System.currentTimeMillis() / ((long) 1000));
        if (J.isEmpty()) {
            return J;
        }
        ArrayList arrayList = new ArrayList(g32.l(J, 10));
        for (ux1 a2 : J) {
            arrayList.add(Integer.valueOf((int) a2.a()));
        }
        List<ry1> Y = this.a.Y(arrayList);
        for (ux1 ux1 : J) {
            T t = null;
            if (Y != null) {
                Iterator<T> it = Y.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((ry1) next).a() == ux1.a()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t = next;
                        break;
                    }
                }
                t = (ry1) t;
            }
            ux1.g = t;
        }
        return J;
    }

    public final List<bz1> B(int i) {
        return this.a.K(i, System.currentTimeMillis() / ((long) 1000));
    }

    public final LiveData<List<vv1>> C() {
        return this.a.M();
    }

    public final List<Integer> D() {
        return this.a.N();
    }

    public final LiveData<List<sy1>> E(int i) {
        return this.a.O(i);
    }

    public final void F(sy1 sy1) {
        if (sy1 != null) {
            new b(this.a, mv1.INSERT).execute(new sy1[]{sy1});
        }
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(java.util.ArrayList<defpackage.sy1> r12, java.util.List<defpackage.bs1> r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0003
            goto L_0x0007
        L_0x0003:
            java.util.List r12 = r11.h()
        L_0x0007:
            if (r13 == 0) goto L_0x000e
            com.zunjae.anyme.features.database.a r0 = r11.a
            r0.a0(r13)
        L_0x000e:
            java.util.List r0 = r11.f()
            java.util.Iterator r1 = r12.iterator()
        L_0x0016:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r1.next()
            sy1 r2 = (defpackage.sy1) r2
            java.util.Iterator r3 = r0.iterator()
        L_0x0026:
            boolean r4 = r3.hasNext()
            r5 = 1
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.next()
            r8 = r4
            yy1 r8 = (defpackage.yy1) r8
            int r8 = r8.h()
            long r9 = r2.c()
            int r10 = (int) r9
            if (r8 != r10) goto L_0x0043
            r8 = 1
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            if (r8 == 0) goto L_0x0026
            goto L_0x0048
        L_0x0047:
            r4 = r7
        L_0x0048:
            yy1 r4 = (defpackage.yy1) r4
            r2.O(r4)
            if (r13 == 0) goto L_0x007f
            java.util.Iterator r3 = r13.iterator()
        L_0x0053:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r3.next()
            r8 = r4
            bs1 r8 = (defpackage.bs1) r8
            java.lang.Integer r8 = r8.a
            long r9 = r2.c()
            int r10 = (int) r9
            if (r8 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            int r8 = r8.intValue()
            if (r8 != r10) goto L_0x0072
            r8 = 1
            goto L_0x0073
        L_0x0072:
            r8 = 0
        L_0x0073:
            if (r8 == 0) goto L_0x0053
            goto L_0x0077
        L_0x0076:
            r4 = r7
        L_0x0077:
            bs1 r4 = (defpackage.bs1) r4
            if (r4 == 0) goto L_0x007f
            ky1 r7 = r4.a()
        L_0x007f:
            r2.J(r7)
            goto L_0x0016
        L_0x0083:
            com.zunjae.anyme.features.database.a r13 = r11.a
            r13.i0(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov1.G(java.util.ArrayList, java.util.List):void");
    }

    public final void H(List<yy1> list) {
        T t;
        boolean z;
        v62.e(list, "kitsuInfos");
        List<sy1> h = h();
        if (h.size() != 0) {
            for (sy1 sy1 : h) {
                if (sy1.k() == null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((yy1) t).h() == ((int) sy1.c())) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    sy1.O((yy1) t);
                }
            }
            this.a.i0(h);
        }
    }

    public final List<xy1> I(List<Integer> list) {
        v62.e(list, "parentIds");
        return this.a.T(list);
    }

    public final LiveData<List<bs1>> J() {
        return this.a.U();
    }

    public final LiveData<List<sy1>> K() {
        return this.a.V();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        defpackage.k52.a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<java.lang.Integer> L(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            defpackage.v62.e(r3, r0)
            com.zunjae.anyme.features.database.a r0 = r2.a
            java.util.List r0 = r0.W()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x006c
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131755008(0x7f100000, float:1.9140883E38)
            java.io.InputStream r3 = r3.openRawResource(r0)
            java.lang.String r0 = "context.resources.openRawResource(R.raw.nsfw_ids)"
            defpackage.v62.d(r3, r0)
            java.nio.charset.Charset r0 = defpackage.q82.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r3, r0)
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0030
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L_0x0036
        L_0x0030:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r3)
            r1 = r0
        L_0x0036:
            r3 = 0
            java.lang.String r0 = defpackage.l52.c(r1)     // Catch:{ all -> 0x0065 }
            defpackage.k52.a(r1, r3)
            java.lang.String r3 = r0.toString()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            java.lang.Class<wt1> r1 = defpackage.wt1.class
            java.lang.Object r3 = r0.fromJson((java.lang.String) r3, r1)
            java.lang.String r0 = "Gson().fromJson<NSFWIds>…son, NSFWIds::class.java)"
            defpackage.v62.d(r3, r0)
            wt1 r3 = (defpackage.wt1) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r3 = r3.a()
            if (r3 == 0) goto L_0x005d
            goto L_0x0061
        L_0x005d:
            java.util.List r3 = defpackage.f32.f()
        L_0x0061:
            r0.<init>(r3)
            return r0
        L_0x0065:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            defpackage.k52.a(r1, r3)
            throw r0
        L_0x006c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov1.L(android.content.Context):java.util.ArrayList");
    }

    public final LiveData<Integer> M() {
        return this.a.X();
    }

    public final List<ry1> N(List<Integer> list) {
        v62.e(list, "ids");
        return this.a.Y(list);
    }

    public final xy1 O() {
        return this.a.Z();
    }

    public final void P(lx1 lx1) {
        if (lx1 != null) {
            lx1.J(lx1.D());
            new a(this.a).execute(new lx1[]{lx1});
        }
    }

    public final void Q(int i, List<ux1> list) {
        if (list != null) {
            this.a.r(i);
            this.a.d0(list);
        }
    }

    public final void R(List<bs1> list) {
        v62.e(list, "entries");
        this.a.a0(list);
    }

    public final Object S(com.zunjae.downloader.b bVar, k42<? super u22> k42) {
        Object b0 = this.a.b0(bVar, k42);
        return b0 == s42.d() ? b0 : u22.a;
    }

    public final void T(ArrayList<zy1> arrayList) {
        if (arrayList != null) {
            this.a.c0(arrayList);
        }
    }

    public final void U(List<? extends az1> list, int i) {
        if (list != null) {
            this.a.s(i);
            for (az1 az1 : list) {
                az1.k(i);
                az1.j(mw1.h(5));
            }
            this.a.e0(list, i);
        }
    }

    public final int V(int i) {
        return this.a.L(i);
    }

    public final boolean W(int i) {
        Integer F = this.a.F(i);
        return (F != null ? F.intValue() : 0) > 0;
    }

    public final List<ty1> X() {
        return this.a.f0();
    }

    public final int Y() {
        return this.a.g0();
    }

    public final void Z(sy1 sy1) {
        if (sy1 != null) {
            this.a.h0(sy1);
        }
    }

    public final LiveData<List<sy1>> a() {
        return this.a.c();
    }

    public final LiveData<Integer> a0() {
        return this.a.H();
    }

    public final List<Integer> b() {
        return this.a.d();
    }

    public final LiveData<List<sy1>> c() {
        return this.a.e();
    }

    public final LiveData<List<bs1>> d() {
        return this.a.f();
    }

    public final List<Long> e() {
        return this.a.g();
    }

    public final LiveData<List<sy1>> g() {
        return this.a.h();
    }

    public final List<sy1> h() {
        return this.a.j();
    }

    public final List<sy1> i(int i) {
        return this.a.k(i);
    }

    public final List<Integer> j(int i) {
        return this.a.l(i);
    }

    public final List<Integer> k() {
        return this.a.m();
    }

    public final boolean l(int i) {
        return this.a.n(i) > 0;
    }

    public final void m(sy1 sy1) {
        if (sy1 != null) {
            new b(this.a, mv1.DELETE).execute(new sy1[]{sy1});
        }
    }

    public final void n(int i) {
        this.a.u(i);
    }

    public final int o() {
        return this.a.v();
    }

    public final lx1 p(long j) {
        return this.a.w(j, System.currentTimeMillis() / ((long) 1000));
    }

    public final LiveData<lx1> q(long j) {
        return this.a.x(j);
    }

    public final LiveData<sy1> r(long j) {
        return this.a.B(j);
    }

    public final sy1 s(long j) {
        return this.a.y(j);
    }

    public final List<Integer> t(int i) {
        return this.a.A(i);
    }

    public final LiveData<List<sy1>> u(int i) {
        return this.a.z(i);
    }

    public final LiveData<List<bs1>> v(int i) {
        return this.a.C(i);
    }

    public final Object w(List<Long> list, k42<? super List<com.zunjae.downloader.b>> k42) {
        return this.a.D(list, k42);
    }

    public final LiveData<List<uv1>> x() {
        return this.a.E();
    }

    public final LiveData<Integer> y(int i) {
        return this.a.G(i);
    }

    public final LiveData<Integer> z() {
        return this.a.I();
    }
}
