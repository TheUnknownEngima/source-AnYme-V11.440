package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.ab2;
import defpackage.g02;
import defpackage.iz1;
import defpackage.og2;
import defpackage.ri2;
import defpackage.ua2;
import defpackage.xa2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: h02  reason: default package */
public final class h02 implements iz1, og2 {
    public static final d n = new d((r62) null);
    private final d22 e = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final long f = 60;
    private final jz1 g = jz1.WonderfulSubs;
    private final boolean h;
    private final String i = "https://blog.wonderfulsubs.com/donate";
    private final Integer j;
    private final hz1 k = hz1.TryDirectly;
    private final mz1 l = mz1.Grid;
    private final boolean m = true;

    /* renamed from: h02$a */
    public static final class a extends w62 implements o52<g02> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [g02, java.lang.Object] */
        public final g02 invoke() {
            return this.f.e(f72.b(g02.class), this.g, this.h);
        }
    }

    /* renamed from: h02$b */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((g02.d.a) t2).a(), ((g02.d.a) t).a());
        }
    }

    /* renamed from: h02$c */
    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((g02.d.a) t2).a(), ((g02.d.a) t).a());
        }
    }

    /* renamed from: h02$d */
    public static final class d {

        /* renamed from: h02$d$a */
        static final class a implements ua2 {
            public static final a a = new a();

            a() {
            }

            public final cb2 a(ua2.a aVar) {
                ab2.a h = aVar.i().h();
                h.a("Referer", "https://www.wonderfulsubs.com/search?q=dragon");
                return aVar.c(h.b());
            }
        }

        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public final g02 a(Context context, boolean z) {
            v62.e(context, "context");
            Gson create = new GsonBuilder().setLenient().create();
            xa2.b b = com.zunjae.extensions.b.b(com.zunjae.extensions.b.a, context, z, 60, 0, 8, (Object) null);
            b.a(a.a);
            xa2 b2 = b.b();
            ri2.b bVar = new ri2.b();
            bVar.b("https://www.wonderfulsubs.com/api/");
            bVar.a(wi2.g(create));
            bVar.f(b2);
            Object b3 = bVar.d().b(g02.class);
            v62.d(b3, "retrofit.create(WonderfulSubEndpoints::class.java)");
            return (g02) b3;
        }
    }

    /* renamed from: h02$e */
    static final class e extends w62 implements z52<String, g02.a> {
        public static final e f = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final g02.a r(String str) {
            v62.e(str, "body");
            try {
                return (g02.a) new Gson().fromJson(str, g02.a.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: h02$f */
    static final class f extends w62 implements z52<String, g02.a> {
        public static final f f = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final g02.a r(String str) {
            v62.e(str, "body");
            try {
                return ((g02.b) new Gson().fromJson(str, g02.b.class)).a();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private final g02 p() {
        return (g02) this.e.getValue();
    }

    public Integer a() {
        return this.j;
    }

    public hz1 b() {
        return this.k;
    }

    public List<oz1> c(pz1 pz1) {
        g02.a aVar;
        List<g02.a.C0235a> a2;
        v62.e(pz1, "provider");
        e eVar = e.f;
        f fVar = f.f;
        ArrayList arrayList = null;
        if (pz1.a() == null) {
            uj2.a("Sites was null", new Object[0]);
            return null;
        }
        try {
            db2 a3 = p().a(pz1.a()).h().a();
            String r = a3 != null ? a3.r() : null;
            v62.c(r);
            aVar = eVar.r(r);
            if (aVar == null) {
                aVar = fVar.r(r);
            }
        } catch (Exception unused) {
            aVar = null;
        }
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            arrayList = new ArrayList(g32.l(a2, 10));
            for (g02.a.C0235a aVar2 : a2) {
                arrayList.add(new oz1(aVar2.a(), aVar2.b()));
            }
        }
        return arrayList;
    }

    public List<qz1> d(String str) {
        qi2<g02.e> qi2;
        g02.e a2;
        g02.f a3;
        List<g02.d> a4;
        String str2;
        String q;
        g02.d.a aVar;
        String b2;
        String str3 = str;
        v62.e(str3, "query");
        try {
            qi2 = p().c(str3).h();
            if (qi2 == null) {
                return null;
            }
        } catch (Exception e2) {
            uj2.d(e2);
            qi2 = null;
        }
        if (qi2 == null || (a2 = qi2.a()) == null || (a3 = a2.a()) == null || (a4 = a3.a()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(g32.l(a4, 10));
        for (g02.d dVar : a4) {
            List<g02.d.a> b3 = dVar.b();
            List<T> U = b3 != null ? n32.U(b3, new b()) : null;
            Integer valueOf = U != null ? Integer.valueOf(U.size()) : null;
            if (valueOf == null || valueOf.intValue() == 0) {
                str2 = null;
            } else {
                str2 = ((g02.d.a) n32.z(U)).b();
                if (str2 == null) {
                    str2 = "";
                }
            }
            List<g02.d.a> a5 = dVar.a();
            List<T> U2 = a5 != null ? n32.U(a5, new c()) : null;
            Integer valueOf2 = U2 != null ? Integer.valueOf(U2.size()) : null;
            String str4 = (valueOf2 != null && valueOf2.intValue() == 0) ? null : (U == null || (aVar = (g02.d.a) n32.z(U)) == null || (b2 = aVar.b()) == null) ? "" : b2;
            String d2 = dVar.d();
            String str5 = (d2 == null || (q = f92.q(d2, "/watch/", "", false, 4, (Object) null)) == null) ? "" : q;
            String c2 = dVar.c();
            arrayList.add(new qz1(str5, c2 != null ? c2 : "", str2 != null ? str2 : "", str4, v62.a(dVar.e(), Boolean.TRUE) ? "Sub | Dub" : "Sub", (Integer) null, 32, (r62) null));
        }
        return arrayList;
    }

    public mz1 e() {
        return this.l;
    }

    public long f() {
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r0 = (r0 = (r0 = r0.a()).a()).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.lz1> g(java.lang.String r29, int r30) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "slug"
            defpackage.v62.e(r0, r1)
            g02 r1 = r28.p()
            ai2 r0 = r1.b(r0)
            qi2 r0 = r0.h()
            java.lang.Object r0 = r0.a()
            g02$c r0 = (defpackage.g02.c) r0
            r1 = 0
            if (r0 == 0) goto L_0x0033
            g02$c$a r0 = r0.a()
            if (r0 == 0) goto L_0x0033
            g02$c$a$a r0 = r0.a()
            if (r0 == 0) goto L_0x0033
            g02$c$a$a$a r0 = r0.a()
            if (r0 == 0) goto L_0x0033
            java.util.List r0 = r0.a()
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            defpackage.v62.c(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0159
            java.lang.Object r3 = r0.next()
            g02$c$a$a$a$a r3 = (defpackage.g02.c.a.C0236a.C0237a.C0238a) r3
            if (r3 == 0) goto L_0x0129
            java.util.List r4 = r3.a()
            if (r4 == 0) goto L_0x0129
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x005d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0126
            java.lang.Object r6 = r4.next()
            g02$c$a$a$a$a$a r6 = (defpackage.g02.c.a.C0236a.C0237a.C0238a.C0239a) r6
            if (r6 == 0) goto L_0x0070
            java.lang.Object r7 = r6.d()
            goto L_0x0071
        L_0x0070:
            r7 = r1
        L_0x0071:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L_0x0076
            r7 = r1
        L_0x0076:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x008a
            pz1 r8 = new pz1
            java.lang.String r9 = "Bun"
            java.lang.String r10 = "Dynamic"
            r8.<init>(r1, r9, r7, r10)
            java.util.List r7 = defpackage.e32.b(r8)
            r18 = r7
            goto L_0x00e6
        L_0x008a:
            if (r6 == 0) goto L_0x00e4
            java.util.List r7 = r6.e()
            if (r7 == 0) goto L_0x00e4
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.g32.l(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00a1:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00e1
            java.lang.Object r9 = r7.next()
            g02$c$a$a$a$a$a$a r9 = (defpackage.g02.c.a.C0236a.C0237a.C0238a.C0239a.C0240a) r9
            java.lang.Object r10 = r9.a()
            boolean r11 = r10 instanceof java.lang.String
            if (r11 != 0) goto L_0x00b6
            r10 = r1
        L_0x00b6:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00bb
            goto L_0x00d0
        L_0x00bb:
            java.lang.Object r10 = r9.a()
            boolean r11 = r10 instanceof java.util.List
            if (r11 != 0) goto L_0x00c4
            r10 = r1
        L_0x00c4:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x00cf
            java.lang.Object r10 = defpackage.n32.z(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00d0
        L_0x00cf:
            r10 = r1
        L_0x00d0:
            pz1 r11 = new pz1
            java.lang.String r12 = r9.c()
            java.lang.String r9 = r9.b()
            r11.<init>(r1, r12, r10, r9)
            r8.add(r11)
            goto L_0x00a1
        L_0x00e1:
            r18 = r8
            goto L_0x00e6
        L_0x00e4:
            r18 = r1
        L_0x00e6:
            nz1 r7 = new nz1
            r14 = 0
            java.lang.String r8 = "?"
            if (r6 == 0) goto L_0x00f5
            java.lang.String r9 = r6.f()
            if (r9 == 0) goto L_0x00f5
            r15 = r9
            goto L_0x00f6
        L_0x00f5:
            r15 = r8
        L_0x00f6:
            if (r6 == 0) goto L_0x00ff
            java.lang.String r9 = r6.b()
            if (r9 == 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            if (r6 == 0) goto L_0x0106
            java.lang.String r9 = r6.c()
            goto L_0x0107
        L_0x0106:
            r9 = r1
        L_0x0107:
            if (r9 == 0) goto L_0x010c
            r16 = r9
            goto L_0x010e
        L_0x010c:
            r16 = r8
        L_0x010e:
            if (r6 == 0) goto L_0x0117
            java.lang.String r6 = r6.a()
            r17 = r6
            goto L_0x0119
        L_0x0117:
            r17 = r1
        L_0x0119:
            r19 = 1
            r20 = 0
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r5.add(r7)
            goto L_0x005d
        L_0x0126:
            r25 = r5
            goto L_0x012b
        L_0x0129:
            r25 = r1
        L_0x012b:
            lz1 r4 = new lz1
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x013a
            java.lang.String r6 = r3.b()
            if (r6 == 0) goto L_0x013a
            r22 = r6
            goto L_0x013c
        L_0x013a:
            r22 = r5
        L_0x013c:
            if (r3 == 0) goto L_0x0147
            java.lang.String r3 = r3.c()
            if (r3 == 0) goto L_0x0147
            r23 = r3
            goto L_0x0149
        L_0x0147:
            r23 = r5
        L_0x0149:
            r24 = 0
            r26 = 4
            r27 = 0
            r21 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r2.add(r4)
            goto L_0x0040
        L_0x0159:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h02.g(java.lang.String, int):java.util.List");
    }

    public boolean h() {
        return this.h;
    }

    public List<oz1> i(String str, int i2) {
        v62.e(str, "episodeId");
        throw new k22("An operation is not implemented: " + "not implemented");
    }

    public String j() {
        return this.i;
    }

    public Spanned k() {
        return iz1.a.a(this);
    }

    public jz1 l() {
        return this.g;
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
