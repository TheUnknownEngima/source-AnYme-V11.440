package defpackage;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.github.mikephil.charting.utils.Utils;
import com.zunjae.anyme.features.anime.info_screen.a;
import com.zunjae.anyme.features.anime.info_screen.b;
import com.zunjae.anyme.features.kanon.e;
import com.zunjae.anyme.features.kanon.n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gr1  reason: default package */
public final class gr1 extends a0 {
    private sy1 c;
    private boolean d;
    private t<lx1> e = new t<>();
    private final t<com.zunjae.vresult.a<List<n>>> f = new t<>();
    private final com.zunjae.jikanrest.b g;
    private final e h;
    private final ov1 i;

    /* renamed from: gr1$a */
    static final class a extends w62 implements z52<lx1, List<? extends com.zunjae.anyme.features.anime.info_screen.b>> {
        final /* synthetic */ gr1 f;

        /* renamed from: gr1$a$a  reason: collision with other inner class name */
        static final class C0241a extends w62 implements e62<String, ArrayList<px1>, b.a, u22> {
            final /* synthetic */ List f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0241a(List list) {
                super(3);
                this.f = list;
            }

            public final void a(String str, ArrayList<px1> arrayList, b.a aVar) {
                v62.e(str, "title");
                v62.e(aVar, "wrapperType");
                if (arrayList != null) {
                    for (px1 px1 : arrayList) {
                        try {
                            String b = px1.b();
                            v62.d(b, "show.title");
                            com.zunjae.anyme.features.anime.info_screen.b bVar = new com.zunjae.anyme.features.anime.info_screen.b(str, (CharSequence) b);
                            if (aVar == b.a.ANIME) {
                                bVar.g(new xy1((long) px1.a(), px1.b(), ""));
                            }
                            if (aVar == b.a.MANGA) {
                                bVar.j(px1.c());
                            }
                            bVar.i(aVar);
                            this.f.add(bVar);
                        } catch (Exception e) {
                            uj2.d(e);
                        }
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                a((String) obj, (ArrayList) obj2, (b.a) obj3);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(gr1 gr1) {
            super(1);
            this.f = gr1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.anime.info_screen.b> r(lx1 lx1) {
            v62.e(lx1, "info");
            ArrayList arrayList = new ArrayList();
            Integer h = lx1.h();
            int i = 0;
            arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Episodes", h != null ? h.intValue() : 0));
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            Integer r = lx1.r();
            if (r != null) {
                i = r.intValue();
            }
            sb.append(i);
            arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Ranked", (CharSequence) sb.toString()));
            String q = lx1.q();
            if (q != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Popularity", (CharSequence) '#' + q));
            }
            Double t = lx1.t();
            arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Score", t != null ? t.doubleValue() : Utils.DOUBLE_EPSILON));
            String C = lx1.C();
            if (C != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Type", (CharSequence) C));
            }
            String u = lx1.u();
            if (u != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Source", (CharSequence) u));
            }
            ArrayList<mx1> w = lx1.w();
            if (w != null) {
                for (mx1 mx1 : w) {
                    String str = mx1.b;
                    v62.d(str, "studio.name");
                    com.zunjae.anyme.features.anime.info_screen.b bVar = new com.zunjae.anyme.features.anime.info_screen.b("Studio", (CharSequence) str);
                    bVar.i(b.a.STUDIO);
                    bVar.h(mx1.a());
                    u22 u22 = u22.a;
                    arrayList.add(bVar);
                }
            }
            String s = lx1.s();
            if (s != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Rating", (CharSequence) s));
            }
            String v = lx1.v();
            if (v != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Status", (CharSequence) v));
            }
            ox1 b = lx1.b();
            if (b != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Aired", (CharSequence) b.b()));
            }
            String a = lx1.a();
            if (a != null) {
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Duration", (CharSequence) lx1.e() + " (" + a + ')'));
            } else {
                String e = lx1.e();
                if (e == null) {
                    e = "?";
                }
                arrayList.add(new com.zunjae.anyme.features.anime.info_screen.b("Duration", (CharSequence) e));
            }
            C0241a aVar = new C0241a(arrayList);
            qx1 l = lx1.l();
            ArrayList<px1> arrayList2 = null;
            aVar.a("Adaption", l != null ? l.a() : null, b.a.MANGA);
            qx1 l2 = lx1.l();
            aVar.a("Prequel", l2 != null ? l2.c() : null, b.a.ANIME);
            qx1 l3 = lx1.l();
            aVar.a("Sequel", l3 != null ? l3.d() : null, b.a.ANIME);
            qx1 l4 = lx1.l();
            if (l4 != null) {
                arrayList2 = l4.b();
            }
            aVar.a("OVA", arrayList2, b.a.ANIME);
            ArrayList arrayList3 = new ArrayList();
            for (Object next : arrayList) {
                if (!v62.a(((com.zunjae.anyme.features.anime.info_screen.b) next).a(), "0")) {
                    arrayList3.add(next);
                }
            }
            return arrayList3;
        }
    }

    /* renamed from: gr1$b */
    static final class b extends w62 implements o52<List<? extends n>> {
        final /* synthetic */ gr1 f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(gr1 gr1, int i, int i2) {
            super(0);
            this.f = gr1;
            this.g = i;
            this.h = i2;
        }

        /* renamed from: a */
        public final List<n> invoke() {
            return this.f.i().r(this.g, this.h).h().a();
        }
    }

    public gr1(com.zunjae.jikanrest.b bVar, e eVar, ov1 ov1) {
        v62.e(bVar, "jikanService");
        v62.e(eVar, "kanonService");
        v62.e(ov1, "animeRepository");
        this.g = bVar;
        this.h = eVar;
        this.i = ov1;
    }

    public final com.zunjae.anyme.features.anime.info_screen.a f(int i2) {
        a aVar = new a(this);
        lx1 p = this.i.p((long) i2);
        if (p != null) {
            return new a.c(aVar.r(p), p, true);
        }
        try {
            lx1 a2 = this.g.c(i2).h().a();
            if (a2 == null) {
                return a.b.a;
            }
            v62.d(a2, "jikanService.getAnimeInf…ionalInfoResult.NoResults");
            this.i.P(a2);
            return new a.c(aVar.r(a2), a2, false);
        } catch (Exception e2) {
            return new a.C0162a(e2);
        }
    }

    public final sy1 g() {
        sy1 sy1 = this.c;
        if (sy1 != null) {
            return sy1;
        }
        v62.p("anime");
        throw null;
    }

    public final t<lx1> h() {
        return this.e;
    }

    public final e i() {
        return this.h;
    }

    public final t<com.zunjae.vresult.a<List<n>>> j() {
        return this.f;
    }

    public final boolean k() {
        return this.d;
    }

    public final void l(xy1 xy1) {
        v62.e(xy1, "minimalAnimeInfo");
        sy1 s = this.i.s(xy1.a());
        this.d = s != null;
        if (s == null) {
            s = sy1.r.b(xy1);
        }
        this.c = s;
    }

    public final void m(int i2, int i3) {
        com.zunjae.vresult.b.b(this, this.f, new b(this, i2, i3));
    }

    public final void n(boolean z) {
        this.d = z;
    }
}
