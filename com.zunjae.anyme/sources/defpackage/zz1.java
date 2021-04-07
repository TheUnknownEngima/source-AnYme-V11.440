package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.a02;
import defpackage.ab2;
import defpackage.b02;
import defpackage.c02;
import defpackage.d02;
import defpackage.e02;
import defpackage.iz1;
import defpackage.og2;
import defpackage.ri2;
import defpackage.ua2;
import defpackage.xa2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: zz1  reason: default package */
public final class zz1 implements iz1, og2 {
    public static final b n = new b((r62) null);
    private final d22 e = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final jz1 f = jz1.AnimeUltima;
    private final hz1 g = hz1.TryDirectly;
    private final String h;
    private final boolean i = true;
    private final Integer j;
    private final mz1 k = mz1.Grid;
    private final long l = 30;
    private final boolean m = true;

    /* renamed from: zz1$a */
    public static final class a extends w62 implements o52<a02> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [a02, java.lang.Object] */
        public final a02 invoke() {
            return this.f.e(f72.b(a02.class), this.g, this.h);
        }
    }

    /* renamed from: zz1$b */
    public static final class b {

        /* renamed from: zz1$b$a */
        static final class a implements ua2 {
            public static final a a = new a();

            a() {
            }

            public final cb2 a(ua2.a aVar) {
                ab2.a h = aVar.i().h();
                h.a("accept", "application/json, text/plain, */*");
                h.a("cache-control", "no-cache");
                h.a("authority", "api.animeultima.tv");
                h.a("Referer", "https://m.animeultima.eu/");
                h.a("origin", "https://m.animeultima.eu");
                h.a("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36");
                return aVar.c(h.b());
            }
        }

        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final a02 a(Context context, boolean z) {
            v62.e(context, "context");
            Gson create = new GsonBuilder().setLenient().create();
            xa2.b c = com.zunjae.extensions.b.a.c(context, z, 30);
            c.a(a.a);
            ri2.b bVar = new ri2.b();
            bVar.b("https://api.animeultima.tv/");
            bVar.a(wi2.g(create));
            bVar.f(c.b());
            Object b = bVar.d().b(a02.class);
            v62.d(b, "retrofit.create(AnimeUltimaEndpoints::class.java)");
            return (a02) b;
        }
    }

    /* renamed from: zz1$c */
    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String a = ((d02.a.C0223a.C0224a) t).a();
            Integer num = null;
            Integer g = a != null ? e92.g(a) : null;
            String a2 = ((d02.a.C0223a.C0224a) t2).a();
            if (a2 != null) {
                num = e92.g(a2);
            }
            return d42.a(g, num);
        }
    }

    /* renamed from: zz1$d */
    public static final class d<T> implements Comparator<T> {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r3 = defpackage.e92.g(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r2, T r3) {
            /*
                r1 = this;
                e02$a r3 = (defpackage.e02.a) r3
                java.lang.String r3 = r3.e()
                r0 = 0
                if (r3 == 0) goto L_0x0014
                java.lang.Integer r3 = defpackage.e92.g(r3)
                if (r3 == 0) goto L_0x0014
                int r3 = r3.intValue()
                goto L_0x0015
            L_0x0014:
                r3 = 0
            L_0x0015:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                e02$a r2 = (defpackage.e02.a) r2
                java.lang.String r2 = r2.e()
                if (r2 == 0) goto L_0x002b
                java.lang.Integer r2 = defpackage.e92.g(r2)
                if (r2 == 0) goto L_0x002b
                int r0 = r2.intValue()
            L_0x002b:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                int r2 = defpackage.d42.a(r3, r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zz1.d.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    private final a02 p() {
        return (a02) this.e.getValue();
    }

    public Integer a() {
        return this.j;
    }

    public hz1 b() {
        return this.g;
    }

    public List<oz1> c(pz1 pz1) {
        v62.e(pz1, "provider");
        throw new k22((String) null, 1, (r62) null);
    }

    public List<qz1> d(String str) {
        e02 e02;
        List<e02.a> a2;
        v62.e(str, "query");
        ArrayList arrayList = null;
        try {
            e02 = p().a(g92.i0(str).toString()).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            e02 = null;
        }
        if (!(e02 == null || (a2 = e02.a()) == null)) {
            List<T> U = n32.U(a2, new d());
            arrayList = new ArrayList(g32.l(U, 10));
            for (T t : U) {
                String str2 = t.d() + " (" + t.e() + ')';
                String b2 = t.b();
                if (b2 == null) {
                    b2 = "null";
                }
                String str3 = b2;
                String c2 = t.c();
                if (c2 == null) {
                    c2 = "~";
                }
                arrayList.add(new qz1(str3, c2, t.a(), (String) null, str2, (Integer) null, 32, (r62) null));
            }
        }
        return arrayList;
    }

    public mz1 e() {
        return this.k;
    }

    public long f() {
        return this.l;
    }

    public List<lz1> g(String str, int i2) {
        d02 d02;
        String str2;
        d02.a.C0223a a2;
        List<d02.a.C0223a.C0224a> a3;
        String str3;
        d02.a.C0223a a4;
        String str4 = str;
        v62.e(str4, "slug");
        List<T> list = null;
        try {
            d02 = (d02) a02.a.a(p(), str4, false, 2, (Object) null).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            d02 = null;
        }
        if (d02 == null) {
            return null;
        }
        d02.a a5 = d02.a();
        if (v62.a(a5 != null ? a5.c() : null, "Movie")) {
            d02.a a6 = d02.a();
            if (a6 == null || (a4 = a6.a()) == null || (str3 = a4.b()) == null) {
                str3 = "Watch";
            }
            return e32.b(new lz1("~", "~", (Integer) null, e32.b(new nz1(str, str3, "1", (String) null, (List) null, 16, (r62) null)), 4, (r62) null));
        }
        d02.a a7 = d02.a();
        if (!(a7 == null || (a2 = a7.a()) == null || (a3 = a2.a()) == null)) {
            list = n32.U(a3, new c());
        }
        d02.a a8 = d02.a();
        if (a8 == null || (str2 = a8.b()) == null) {
            str2 = "null";
        }
        if (list == null || list.isEmpty()) {
            return f32.f();
        }
        ArrayList arrayList = new ArrayList(g32.l(list, 10));
        for (T t : list) {
            String b2 = t.b();
            if (b2 == null) {
                b2 = "~";
            }
            String str5 = b2;
            String a9 = t.a();
            if (a9 == null) {
                a9 = "?";
            }
            arrayList.add(new nz1(str2, str5, a9, (String) null, (List) null, 16, (r62) null));
        }
        return e32.b(new lz1("~", "~", (Integer) null, arrayList, 4, (r62) null));
    }

    public boolean h() {
        return this.i;
    }

    public List<oz1> i(String str, int i2) {
        b02 b02;
        b02.a.C0145a a2;
        v62.e(str, "id");
        c02 c02 = null;
        try {
            b02 = (b02) a02.a.b(p(), str, i2, (String) null, 4, (Object) null).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            b02 = null;
        }
        if (b02 == null) {
            return f32.f();
        }
        b02.a a3 = b02.a();
        if (a3 == null || (a2 = a3.a()) == null) {
            return f32.f();
        }
        try {
            c02 = (c02) a02.a.c(p(), a2.a(), (String) null, 2, (Object) null).h().a();
        } catch (Exception e3) {
            uj2.d(e3);
        }
        if (c02 == null) {
            return f32.f();
        }
        List<c02.a> a4 = c02.a();
        if (a4 == null) {
            return f32.f();
        }
        ArrayList arrayList = new ArrayList(g32.l(a4, 10));
        for (c02.a aVar : a4) {
            arrayList.add(new oz1(aVar.b() + " (" + aVar.c() + ')', aVar.a()));
        }
        return arrayList;
    }

    public String j() {
        return this.h;
    }

    public Spanned k() {
        return iz1.a.a(this);
    }

    public jz1 l() {
        return this.f;
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public boolean n() {
        return this.m;
    }

    public List<qz1> o() {
        throw new k22("An operation is not implemented: " + "not implemented");
    }
}
