package defpackage;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: nu1  reason: default package */
public final class nu1 extends a0 {
    /* access modifiers changed from: private */
    public final com.zunjae.jikanrest.b A;
    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.kanon.e B;
    private LiveData<List<sy1>> c;
    private int d;
    private int e;
    private sy1 f;
    private Integer[] g;
    private List<Integer> h;
    private Integer[] i;
    private Integer[] j;
    private nx1 k;
    private t<com.zunjae.vresult.a<List<cr1>>> l;
    private t<com.zunjae.vresult.a<List<zq1>>> m;
    private t<com.zunjae.vresult.a<List<kt1>>> n;
    private t<com.zunjae.vresult.a<List<pt1>>> o;
    private final t<com.zunjae.vresult.a<List<vx1>>> p;
    private final t<com.zunjae.vresult.a<List<ux1>>> q;
    private final t<com.zunjae.vresult.a<List<bz1>>> r;
    private final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.h>>> s;
    private final t<com.zunjae.vresult.a<com.zunjae.anyme.features.discover.seasonal.f>> t;
    private final t<com.zunjae.vresult.a<com.zunjae.anyme.features.niche.trace.d>> u;
    private final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.discover.friends.a>>> v;
    private String w;
    private final ov1 x;
    /* access modifiers changed from: private */
    public final or1 y;
    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.niche.trace.e z;

    /* renamed from: nu1$a */
    static final class a extends w62 implements o52<List<? extends ux1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<ux1> invoke() {
            return this.f.j0(this.g);
        }
    }

    /* renamed from: nu1$b */
    static final class b extends w62 implements o52<List<? extends pt1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<pt1> invoke() {
            return this.f.y.j(this.g);
        }
    }

    /* renamed from: nu1$c */
    static final class c extends w62 implements o52<List<? extends zq1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<zq1> invoke() {
            return this.f.y.a(this.g);
        }
    }

    /* renamed from: nu1$d */
    static final class d extends w62 implements o52<List<? extends com.zunjae.anyme.features.discover.friends.a>> {
        final /* synthetic */ nu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(nu1 nu1) {
            super(0);
            this.f = nu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.discover.friends.a> invoke() {
            return this.f.y.c();
        }
    }

    /* renamed from: nu1$e */
    static final class e extends w62 implements o52<List<? extends vx1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ ArrayList g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(nu1 nu1, ArrayList arrayList) {
            super(0);
            this.f = nu1;
            this.g = arrayList;
        }

        /* renamed from: a */
        public final List<vx1> invoke() {
            return this.f.B.E(new wx1(this.f.x().t(com.zunjae.anyme.features.firebase.b.MinimumScoreStats.m0int()), this.f.x().b(), this.g), com.zunjae.anyme.features.firebase.b.MinimumYearDefaultRecommendations.m0int(), com.zunjae.anyme.features.firebase.b.MinimumScoreStats.m0int()).h().a();
        }
    }

    /* renamed from: nu1$f */
    static final class f extends w62 implements o52<List<? extends cr1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<cr1> invoke() {
            return this.f.y.i(this.g);
        }
    }

    /* renamed from: nu1$g */
    static final class g extends w62 implements o52<List<? extends bz1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<bz1> invoke() {
            return this.f.k0(this.g);
        }
    }

    /* renamed from: nu1$h */
    static final class h extends w62 implements o52<List<? extends kt1>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<kt1> invoke() {
            return this.f.y.b(this.g);
        }
    }

    /* renamed from: nu1$i */
    static final class i extends w62 implements o52<List<? extends com.zunjae.anyme.features.kanon.h>> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(nu1 nu1, int i) {
            super(0);
            this.f = nu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.kanon.h> invoke() {
            return this.f.B.n(this.g).h().a();
        }
    }

    /* renamed from: nu1$j */
    static final class j extends w62 implements o52<com.zunjae.anyme.features.discover.seasonal.f> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ nx1 g;
        final /* synthetic */ boolean h;

        /* renamed from: nu1$j$a */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Integer.valueOf(((sx1) t2).d()), Integer.valueOf(((sx1) t).d()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(nu1 nu1, nx1 nx1, boolean z) {
            super(0);
            this.f = nu1;
            this.g = nx1;
            this.h = z;
        }

        /* renamed from: a */
        public final com.zunjae.anyme.features.discover.seasonal.f invoke() {
            ai2<tx1> b;
            List<sx1> a2;
            ArrayList arrayList;
            if (this.g == null) {
                b = this.f.A.a();
            } else {
                com.zunjae.jikanrest.b g2 = this.f.A;
                int b2 = this.g.b();
                String a3 = this.g.a();
                if (a3 != null) {
                    String lowerCase = a3.toLowerCase();
                    v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    b = g2.b(b2, lowerCase);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            tx1 a4 = b.h().a();
            List<Long> e = this.f.x().e();
            List<T> list = null;
            if (this.h && a4 != null) {
                List<sx1> a5 = a4.a();
                if (a5 != null) {
                    arrayList = new ArrayList();
                    for (T next : a5) {
                        if (!((sx1) next).j()) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                a4.b(arrayList);
            }
            if (!(a4 == null || (a2 = a4.a()) == null)) {
                list = n32.U(a2, new a());
            }
            return new com.zunjae.anyme.features.discover.seasonal.f(list, e);
        }
    }

    /* renamed from: nu1$k */
    static final class k extends w62 implements o52<com.zunjae.anyme.features.niche.trace.d> {
        final /* synthetic */ nu1 f;
        final /* synthetic */ ContentResolver g;
        final /* synthetic */ Uri h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(nu1 nu1, ContentResolver contentResolver, Uri uri) {
            super(0);
            this.f = nu1;
            this.g = contentResolver;
            this.h = uri;
        }

        /* renamed from: a */
        public final com.zunjae.anyme.features.niche.trace.d invoke() {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.g, this.h);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            com.zunjae.anyme.features.niche.trace.e i = this.f.z;
            v62.d(encodeToString, "encodedString");
            return i.a(new com.zunjae.anyme.features.niche.trace.f(encodeToString)).h().a();
        }
    }

    public nu1(ov1 ov1, or1 or1, com.zunjae.anyme.features.niche.trace.e eVar, com.zunjae.jikanrest.b bVar, com.zunjae.anyme.features.kanon.e eVar2) {
        v62.e(ov1, "animeRepository");
        v62.e(or1, "animeService");
        v62.e(eVar, "traceMoeService");
        v62.e(bVar, "jikanService");
        v62.e(eVar2, "kanonService");
        this.x = ov1;
        this.y = or1;
        this.z = eVar;
        this.A = bVar;
        this.B = eVar2;
        Object[] array = f32.h(0, 1, 2).toArray(new Integer[0]);
        if (array != null) {
            this.i = (Integer[]) array;
            this.l = new t<>();
            this.m = new t<>();
            this.n = new t<>();
            this.o = new t<>();
            this.p = new t<>();
            this.q = new t<>();
            this.r = new t<>();
            this.s = new t<>();
            this.t = new t<>();
            this.u = new t<>();
            this.v = new t<>();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: private */
    public final List<ux1> j0(int i2) {
        ArrayList arrayList;
        int i3 = i2;
        long j2 = (long) i3;
        List<ux1> A2 = this.x.A(j2);
        if (!A2.isEmpty()) {
            return A2;
        }
        List a2 = this.B.M(i3).h().a();
        if (a2 != null) {
            ArrayList arrayList2 = new ArrayList(g32.l(a2, 10));
            Iterator it = a2.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    vy1 vy1 = (vy1) next;
                    Iterator it2 = it;
                    ArrayList arrayList3 = arrayList2;
                    ux1 ux1 = r3;
                    ux1 ux12 = new ux1((long) vy1.e(), i4, vy1.g(), vy1.d(), j2, mw1.h(5));
                    arrayList3.add(ux1);
                    arrayList2 = arrayList3;
                    i4 = i5;
                    it = it2;
                } else {
                    d32.k();
                    throw null;
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        this.x.Q(i3, arrayList);
        return this.x.A(j2);
    }

    /* access modifiers changed from: private */
    public final List<bz1> k0(int i2) {
        List<bz1> B2 = this.x.B(i2);
        if (B2 != null && (!B2.isEmpty())) {
            return B2;
        }
        this.x.U(this.B.d(i2).h().a(), i2);
        List<bz1> B3 = this.x.B(i2);
        v62.c(B3);
        return B3;
    }

    public final String A() {
        return this.w;
    }

    public final t<com.zunjae.vresult.a<List<zq1>>> B() {
        return this.m;
    }

    public final int C() {
        return this.d;
    }

    public final Integer[] D() {
        return this.i;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.discover.friends.a>>> E() {
        return this.v;
    }

    public final LiveData<List<uv1>> F() {
        return this.x.x();
    }

    public final t<com.zunjae.vresult.a<List<cr1>>> G() {
        return this.l;
    }

    public final LiveData<Integer> H() {
        return this.x.z();
    }

    public final t<com.zunjae.vresult.a<List<bz1>>> I() {
        return this.r;
    }

    public final t<com.zunjae.vresult.a<com.zunjae.anyme.features.niche.trace.d>> J() {
        return this.u;
    }

    public final t<com.zunjae.vresult.a<List<kt1>>> K() {
        return this.n;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.h>>> L() {
        return this.s;
    }

    public final t<com.zunjae.vresult.a<com.zunjae.anyme.features.discover.seasonal.f>> M() {
        return this.t;
    }

    public final Integer[] N() {
        return this.j;
    }

    public final LiveData<List<vv1>> O() {
        return this.x.C();
    }

    public final LiveData<List<sy1>> P(int i2) {
        if (this.c == null) {
            this.c = i2 == 0 ? l() : this.x.u(i2);
        }
        return this.c;
    }

    public final LiveData<List<sy1>> Q(int i2) {
        return this.x.E(i2);
    }

    public final Integer[] R() {
        return this.g;
    }

    public final int S() {
        return this.e;
    }

    public final void T(sy1 sy1) {
        v62.e(sy1, "animeR2");
        this.x.F(sy1);
    }

    public final void U(int i2) {
        com.zunjae.vresult.b.b(this, this.q, new a(this, i2));
    }

    public final void V(int i2) {
        com.zunjae.vresult.b.b(this, this.o, new b(this, i2));
    }

    public final void W(int i2) {
        com.zunjae.vresult.b.b(this, this.m, new c(this, i2));
    }

    public final void X() {
        com.zunjae.vresult.b.b(this, this.v, new d(this));
    }

    public final void Y(ArrayList<Integer> arrayList) {
        v62.e(arrayList, "userSelectedGenresIdsToExclude");
        com.zunjae.vresult.b.b(this, this.p, new e(this, arrayList));
    }

    public final void Z(boolean z2) {
        e0(z2, this.k);
    }

    public final void a0(int i2) {
        com.zunjae.vresult.b.b(this, this.l, new f(this, i2));
    }

    public final void b0(int i2) {
        com.zunjae.vresult.b.b(this, this.r, new g(this, i2));
    }

    public final void c0(int i2) {
        com.zunjae.vresult.b.b(this, this.n, new h(this, i2));
    }

    public final void d0(int i2) {
        com.zunjae.vresult.b.b(this, this.s, new i(this, i2));
    }

    @SuppressLint({"DefaultLocale"})
    public final void e0(boolean z2, nx1 nx1) {
        this.k = nx1;
        com.zunjae.vresult.b.c(this, this.t, new j(this, nx1, z2));
    }

    public final List<Integer> f0(Context context) {
        v62.e(context, "context");
        return this.x.L(context);
    }

    public final LiveData<Integer> g0() {
        return this.x.M();
    }

    public final void h0(Uri uri, ContentResolver contentResolver) {
        v62.e(uri, "uri");
        v62.e(contentResolver, "contentResolver");
        com.zunjae.vresult.b.c(this, this.u, new k(this, contentResolver, uri));
    }

    public final void i0(ArrayList<sy1> arrayList, List<bs1> list) {
        this.x.G(arrayList, list);
    }

    public final LiveData<List<sy1>> l() {
        return this.x.a();
    }

    public final void l0(List<Integer> list) {
        this.h = list;
    }

    public final LiveData<List<sy1>> m() {
        return this.x.c();
    }

    public final void m0(String str) {
        this.w = str;
    }

    public final LiveData<List<sy1>> n() {
        return this.x.g();
    }

    public final void n0(int i2) {
        this.d = i2;
    }

    public final boolean o(int i2) {
        return this.x.l(i2);
    }

    public final void o0(Integer[] numArr) {
        v62.e(numArr, "<set-?>");
        this.i = numArr;
    }

    public final void p(int i2) {
        this.x.n(i2);
    }

    public final void p0(Integer[] numArr) {
        this.j = numArr;
    }

    public final List<Integer> q() {
        return this.h;
    }

    public final void q0(Integer[] numArr) {
        this.g = numArr;
    }

    public final LiveData<lx1> r(long j2) {
        return this.x.q(j2);
    }

    public final void r0(int i2) {
        this.e = i2;
    }

    public final List<Integer> s() {
        return this.x.b();
    }

    public final boolean s0(int i2) {
        return this.x.W(i2);
    }

    public final LiveData<sy1> t(long j2) {
        return this.x.r(j2);
    }

    public final void t0() {
        try {
            List<bs1> g2 = this.y.g();
            if (g2 != null) {
                this.x.R(g2);
            }
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }

    public final sy1 u(long j2) {
        sy1 sy1 = this.f;
        if (sy1 != null) {
            return sy1;
        }
        sy1 s2 = this.x.s(j2);
        this.f = s2;
        return s2;
    }

    public final void u0(sy1 sy1) {
        v62.e(sy1, "animeR2");
        sy1.T(this.x.Y() - 1);
        this.x.Z(sy1);
    }

    public final t<com.zunjae.vresult.a<List<vx1>>> v() {
        return this.p;
    }

    public final LiveData<Integer> v0() {
        return this.x.a0();
    }

    public final t<com.zunjae.vresult.a<List<ux1>>> w() {
        return this.q;
    }

    public final ov1 x() {
        return this.x;
    }

    public final t<com.zunjae.vresult.a<List<pt1>>> y() {
        return this.o;
    }

    public final LiveData<List<bs1>> z(int i2) {
        return this.x.v(i2);
    }
}
