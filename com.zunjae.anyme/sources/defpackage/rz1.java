package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.ab2;
import defpackage.iz1;
import defpackage.og2;
import defpackage.ri2;
import defpackage.sz1;
import defpackage.tz1;
import defpackage.ua2;
import defpackage.uz1;
import defpackage.xa2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: rz1  reason: default package */
public final class rz1 implements iz1, og2 {
    public static final b n = new b((r62) null);
    private final d22 e = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final jz1 f = jz1.AnimeFlix;
    private final hz1 g = hz1.TryDirectly;
    private final String h;
    private final boolean i = true;
    private final Integer j = 50;
    private final mz1 k = mz1.Grid;
    private final long l = 30;
    private final boolean m = true;

    /* renamed from: rz1$a */
    public static final class a extends w62 implements o52<sz1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, sz1] */
        public final sz1 invoke() {
            return this.f.e(f72.b(sz1.class), this.g, this.h);
        }
    }

    /* renamed from: rz1$b */
    public static final class b {

        /* renamed from: rz1$b$a */
        static final class a implements ua2 {
            public static final a a = new a();

            a() {
            }

            public final cb2 a(ua2.a aVar) {
                ab2.a h = aVar.i().h();
                h.a("accept", "application/json, text/plain, */*");
                h.a("cache-control", "no-cache");
                h.a("authority", "animeflix.io/");
                h.a("Referer", "https://animeflix.io/");
                h.a("origin", "https://animeflix.io/");
                h.a("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36");
                return aVar.c(h.b());
            }
        }

        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final sz1 a(Context context, boolean z) {
            v62.e(context, "context");
            Gson create = new GsonBuilder().setLenient().create();
            xa2.b c = com.zunjae.extensions.b.a.c(context, z, 30);
            c.a(a.a);
            ri2.b bVar = new ri2.b();
            bVar.b("https://animeflix.io/api/");
            bVar.a(wi2.g(create));
            bVar.f(c.b());
            Object b = bVar.d().b(sz1.class);
            v62.d(b, "retrofit.create(AnimeFlixEndpoints::class.java)");
            return (sz1) b;
        }
    }

    /* renamed from: rz1$c */
    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String e = ((uz1.a) t2).e();
            Integer num = null;
            Integer g = e != null ? e92.g(e) : null;
            String e2 = ((uz1.a) t).e();
            if (e2 != null) {
                num = e92.g(e2);
            }
            return d42.a(g, num);
        }
    }

    private final sz1 p() {
        return (sz1) this.e.getValue();
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
        uz1 uz1;
        v62.e(str, "query");
        ArrayList arrayList = null;
        try {
            uz1 = p().a(str).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            uz1 = null;
        }
        if (uz1 != null) {
            List<T> U = n32.U(uz1.a(), new c());
            arrayList = new ArrayList(g32.l(U, 10));
            for (T t : U) {
                StringBuilder sb = new StringBuilder();
                sb.append(t.d());
                sb.append(" (");
                String e3 = t.e();
                if (e3 == null) {
                    e3 = "";
                }
                sb.append(e3);
                sb.append(')');
                arrayList.add(new qz1(String.valueOf(t.b()), t.c(), t.a(), (String) null, sb.toString(), Integer.valueOf(t.b())));
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
        tz1 tz1;
        v62.e(str, "slug");
        try {
            tz1 = (tz1) sz1.a.a(p(), Integer.parseInt(str), i2 + 1, 0, (String) null, 12, (Object) null).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            tz1 = null;
        }
        if (tz1 == null) {
            return null;
        }
        List<tz1.a> a2 = tz1.a();
        ArrayList arrayList = new ArrayList(g32.l(a2, 10));
        for (tz1.a aVar : a2) {
            String valueOf = String.valueOf(aVar.b());
            String c2 = aVar.c();
            String a3 = aVar.a();
            if (a3 == null) {
                a3 = "?";
            }
            arrayList.add(new nz1(valueOf, c2, a3, aVar.c(), (List<pz1>) null));
        }
        return e32.b(new lz1("~", "~", Integer.valueOf(tz1.b().a()), arrayList));
    }

    public boolean h() {
        return this.i;
    }

    public List<oz1> i(String str, int i2) {
        List<vz1> list;
        v62.e(str, "id");
        ArrayList arrayList = null;
        try {
            list = p().b(Integer.parseInt(str)).h().a();
        } catch (Exception e2) {
            uj2.d(e2);
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(g32.l(list, 10));
            for (vz1 vz1 : list) {
                StringBuilder sb = new StringBuilder();
                String c2 = vz1.c();
                if (c2 == null) {
                    c2 = "Watch";
                }
                sb.append(c2);
                sb.append(' ');
                String b2 = vz1.b();
                String str2 = "";
                if (b2 == null) {
                    b2 = str2;
                }
                sb.append(b2);
                sb.append(' ');
                String e3 = vz1.e();
                if (e3 != null) {
                    str2 = e3;
                }
                sb.append(str2);
                sb.append(" (");
                String d = vz1.d();
                if (d == null) {
                    d = "HD";
                }
                sb.append(d);
                sb.append(')');
                arrayList.add(new oz1(f92.q(sb.toString(), "\\s+", " ", false, 4, (Object) null), vz1.a()));
            }
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
