package defpackage;

import com.google.gson.Gson;
import com.zunjae.anyme.features.anime.character.d;
import com.zunjae.anyme.features.discover.friends.a;
import com.zunjae.constants.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import org.jsoup.nodes.f;
import org.jsoup.nodes.h;

/* renamed from: or1  reason: default package */
public final class or1 {
    private final int a = 6000;
    private final ut1 b;

    public or1(Gson gson, ut1 ut1) {
        v62.e(gson, "gson");
        v62.e(ut1, "gistService");
        this.b = ut1;
    }

    public static /* synthetic */ List f(or1 or1, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return or1.e(str, i);
    }

    public final List<zq1> a(int i) {
        String r = fz1.a.r();
        if (r != null) {
            try {
                bf2 a2 = df2.a("https://myanimelist.net/anime/" + i + "/anime/stats");
                a2.c(b.d.b());
                a2.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                a2.a("accept-encoding", "gzip, deflate");
                a2.a("cookie", r);
                try {
                    a2.d(this.a);
                    ag2<h> n = a2.get().z0(".table-recently-updated").n("tr");
                    v62.d(n, "tableRows");
                    ArrayList arrayList = new ArrayList();
                    for (h z0 : n) {
                        try {
                            ag2 z02 = z0.z0("td");
                            h hVar = (h) z02.get(0);
                            String c = hVar.z0(".di-tc > a").c("style");
                            v62.d(c, "nameRow\n              .s…           .attr(\"style\")");
                            String k0 = i92.k0(f92.q(f92.q(f92.q(c, "background-image:url(", "", false, 4, (Object) null), "thumbs/", "", false, 4, (Object) null), "_thumb", "", false, 4, (Object) null), 1);
                            String E0 = hVar.E0();
                            String E02 = ((h) z02.get(1)).E0();
                            v62.d(E02, "rows[1].text()");
                            Integer g = e92.g(E02);
                            int intValue = g != null ? g.intValue() : 0;
                            String E03 = ((h) z02.get(2)).E0();
                            h hVar2 = (h) z02.get(3);
                            String E04 = hVar2 != null ? hVar2.E0() : null;
                            v62.d(E0, "name");
                            v62.d(E03, "status");
                            arrayList.add(new zq1(E0, k0, intValue, E03, E04));
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    return n32.v(arrayList, 1);
                } catch (Exception e) {
                    e = e;
                    uj2.d(e);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                uj2.d(e);
                return null;
            }
        } else {
            return null;
        }
    }

    public final List<kt1> b(int i) {
        try {
            bf2 a2 = df2.a("https://myanimelist.net/anime/" + i + "/anime/reviews");
            a2.c(b.d.a());
            a2.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            a2.a("accept-encoding", "gzip, deflate");
            a2.d(this.a);
            ag2<h> n = a2.get().z0(".review").n(".box-unit4");
            if (n == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(g32.l(n, 10));
            for (h hVar : n) {
                String c = hVar.z0("a[href^=https://myanimelist.net/profile/]").c("href");
                v62.d(c, "review\n            .sele…            .attr(\"href\")");
                String q = f92.q(c, "https://myanimelist.net/profile/", "", false, 4, (Object) null);
                String o = hVar.z0("span[class=\"di-ib pl8\"]").o();
                String a3 = he2.a(hVar.z0(".trunc-inner").o());
                v62.d(o, "rating");
                v62.d(a3, "unescapedReview");
                arrayList.add(new kt1(q, o, a3));
            }
            return arrayList;
        } catch (Exception e) {
            uj2.d(e);
            return null;
        }
    }

    public final List<a> c() {
        String r = fz1.a.r();
        if (r != null) {
            String t = fz1.a.t();
            if (t != null) {
                try {
                    bf2 a2 = df2.a("https://myanimelist.net/profile/" + t + "/friends");
                    a2.c(b.d.b());
                    a2.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    a2.a("accept-encoding", "gzip, deflate");
                    a2.a("cookie", r);
                    try {
                        a2.d(this.a);
                        ag2<h> n = a2.get().z0(".majorPad").n(".friendBlock");
                        v62.d(n, "friends");
                        ArrayList arrayList = new ArrayList();
                        for (h hVar : n) {
                            try {
                                ag2 z0 = hVar.z0("div");
                                String E0 = ((h) z0.get(2)).E0();
                                String c = hVar.z0("img").c("src");
                                v62.d(c, "friend.select(\"img\")\n              .attr(\"src\")");
                                String q = f92.q(f92.q(c, "/thumbs", "", false, 4, (Object) null), "_thumb", "", false, 4, (Object) null);
                                String E02 = ((h) z0.get(3)).E0();
                                v62.d(E0, "name");
                                v62.d(E02, "lastActive");
                                arrayList.add(new a(E0, q, E02));
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        return arrayList;
                    } catch (cf2 e) {
                        e = e;
                    } catch (Exception e2) {
                        e = e2;
                        uj2.d(e);
                        return null;
                    }
                } catch (cf2 e3) {
                    e = e3;
                    if (e.a() == 404) {
                        return f32.f();
                    }
                    return null;
                } catch (Exception e4) {
                    e = e4;
                    uj2.d(e);
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public final wy1 d(String str) {
        v62.e(str, "username");
        try {
            bf2 a2 = df2.a("https://myanimelist.net/profile/" + str);
            a2.c(b.d.b());
            a2.a("cookie", fz1.a.r());
            a2.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            a2.a("accept-encoding", "gzip, deflate");
            a2.d(15000);
            f fVar = a2.get();
            ag2 z0 = fVar.z0("div[class=\"stat-score di-t w100 pt8\"]");
            String o = z0.n("div[class=\"di-tc al pl8 fs12 fw-b\"]").o();
            z0.n("div[class=\"di-tc ar pr8 fs12 fw-b\"]").o();
            String c = fVar.z0("div[class=\"user-image mb8\"]").n("img").c("data-src");
            v62.d(c, "profileImage");
            v62.d(o, "daysWasted");
            return new wy1(c, o);
        } catch (Exception e) {
            uj2.d(e);
            return null;
        }
    }

    public final List<com.zunjae.anyme.features.discover.fast_search.a> e(String str, int i) {
        int i2;
        List<T> list;
        boolean z;
        String str2 = str;
        v62.e(str2, "query");
        int i3 = i > 0 ? i * 20 : i;
        try {
            bf2 a2 = df2.a("https://myanimelist.net/anime.php?q=" + str2 + "&show=" + i3);
            a2.c(b.d.a());
            ag2<h> z0 = a2.get().z0("div[class='box-unit1']");
            if (z0 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(g32.l(z0, 10));
            for (h hVar : z0) {
                String o = hVar.z0("li[class='title']").o();
                String o2 = hVar.z0("dd[class='fn-grey5 fs12 fw-n pt8']").o();
                String o3 = hVar.z0("li[class='fn-grey5 fs12 fw-n']").o();
                String o4 = hVar.z0("li[class='text mt8']").o();
                String c = hVar.z0("img[data-src*='.jpg?s=']").c("data-src");
                v62.d(o3, "score");
                String q = f92.q(o3, "Score", "Score: ", false, 4, (Object) null);
                try {
                    String c2 = hVar.z0("a[class='box-unit1-btn di-box'").c("href");
                    v62.d(c2, "anime.select(\"a[class='b…tn di-box'\").attr(\"href\")");
                    List<String> e = new u82("/").e(c2, 0);
                    if (!e.isEmpty()) {
                        ListIterator<String> listIterator = e.listIterator(e.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            if (listIterator.previous().length() == 0) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                list = n32.X(e, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    list = f32.f();
                    Object[] array = list.toArray(new String[0]);
                    if (array != null) {
                        i2 = Integer.parseInt(((String[]) array)[4]);
                        v62.d(o, "title");
                        v62.d(c, "imageURL");
                        arrayList.add(new com.zunjae.anyme.features.discover.fast_search.a(i2, o, q, o2, o4, c));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                } catch (Exception unused) {
                    i2 = -1;
                }
            }
            return arrayList;
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public final List<bs1> g() {
        Calendar instance = Calendar.getInstance();
        try {
            List<bs1> a2 = this.b.k().h().a();
            if (a2 == null) {
                return null;
            }
            v62.d(a2, "gistService.searchCalend…\n          ?: return null");
            for (bs1 next : a2) {
                try {
                    v62.d(instance, "c");
                    instance.setTime(new Date(next.b * ((long) 1000)));
                    next.h = instance.get(7);
                } catch (Exception e) {
                    uj2.d(e);
                }
            }
            return a2;
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public final List<d> h(long j) {
        long j2 = j;
        try {
            bf2 a2 = df2.a("https://myanimelist.net/anime/" + j2 + "/anime/characters");
            a2.c(b.d.a());
            a2.f(true);
            try {
                a2.d(this.a);
                ag2<h> n = a2.get().z0("div[class='characters']").n("div[class='box-unit4 pl8 pr8 pt0 pb12 mb12 di-box']");
                if (n == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(g32.l(n, 10));
                for (h hVar : n) {
                    String o = hVar.z0("a[href*=/myanimelist.net/character/]").o();
                    String c = hVar.z0("a[href*=/myanimelist.net/character/]").c("href");
                    String c2 = hVar.z0("img[data-src*=/images/characters/]").c("data-src");
                    v62.d(c2, "imageStep1.attr(\"data-src\")");
                    d dVar = new d(o, c, f92.q(c2, "/r/130x130", "", false, 4, (Object) null));
                    dVar.j(j2);
                    arrayList.add(dVar);
                }
                return arrayList;
            } catch (Exception e) {
                e = e;
                uj2.d(e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            uj2.d(e);
            return null;
        }
    }

    public final List<cr1> i(int i) {
        try {
            bf2 a2 = df2.a("https://myanimelist.net/anime/" + i + "/anime/news");
            a2.c(b.d.a());
            a2.d(this.a);
            a2.f(true);
            ag2<h> z0 = a2.get().z0("a[class='box-unit3-btn di-box']");
            if (z0 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(g32.l(z0, 10));
            for (h hVar : z0) {
                String c = hVar.z0("img[data-src*=/r/130x130]").c("data-src");
                String o = hVar.z0("li[class='title']").o();
                String o2 = hVar.z0("span[class='di-ib pr4']").o();
                String o3 = hVar.z0("span[class='di-ib comment']").o();
                String c2 = hVar.z0("a[href*=/myanimelist.net/news/]").c("href");
                v62.d(o, "title");
                v62.d(c, "imageURL");
                v62.d(o2, "date");
                v62.d(o3, "numberOfComments");
                v62.d(c2, "articleURL");
                arrayList.add(new cr1(o, c, o2, o3, c2));
            }
            return arrayList;
        } catch (Exception e) {
            uj2.d(e);
            return null;
        }
    }

    public final List<pt1> j(int i) {
        try {
            bf2 a2 = df2.a("https://myanimelist.net/anime/" + i + "/anime/video");
            a2.c(b.d.a());
            a2.d(this.a);
            a2.f(true);
            ag2<h> z0 = a2.get().z0("div[class='box-unit7 js-fancybox-video pt8 pb8']");
            if (z0 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(g32.l(z0, 10));
            for (h hVar : z0) {
                arrayList.add(new pt1(hVar.d("data-title"), hVar.z0("div[class='icon-thumb users list h40 no-ti'").n("img").c("data-src"), hVar.d("data-id")));
            }
            return arrayList;
        } catch (Exception e) {
            uj2.d(e);
            return null;
        }
    }
}
