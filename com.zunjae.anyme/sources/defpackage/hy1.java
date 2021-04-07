package defpackage;

import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import com.zunjae.constants.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* renamed from: hy1  reason: default package */
public final class hy1 {
    private final String a = "https://myanimelist.net/ownlist/anime/edit.json";
    private final String b = "https://myanimelist.net/ownlist/anime/add.json";
    private final String c = "https://myanimelist.net/ownlist/anime/%d/delete";
    private final int d = 6000;
    private final Gson e;

    public hy1(Gson gson) {
        v62.e(gson, "gson");
        this.e = gson;
    }

    private final iy1 d(String str, String str2) {
        try {
            q12 b2 = k12.b(str, w32.f(q22.a("user-agent", str2), q22.a("cookie", fz1.a.r()), q22.a("accept-encoding", "gzip, deflate, br")), (Map) null, (Object) null, (Object) null, (r12) null, (Map) null, Utils.DOUBLE_EPSILON, (Boolean) null, false, (List) null, 2044, (Object) null);
            String c2 = df2.b(b2.b()).z0("meta[name=csrf_token]").c("content");
            s12 d2 = b2.a().d("MALSESSIONID");
            Object b3 = d2 != null ? d2.b() : null;
            s12 d3 = b2.a().d("MALHLOGSESSID");
            Object b4 = d3 != null ? d3.b() : null;
            v62.d(c2, "csrfToken");
            if (!(b3 instanceof String)) {
                b3 = null;
            }
            String str3 = (String) b3;
            if (!(b4 instanceof String)) {
                b4 = null;
            }
            return new iy1(c2, str3, (String) b4);
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    static /* synthetic */ iy1 e(hy1 hy1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "https://myanimelist.net/support.php";
        }
        if ((i & 2) != 0) {
            str2 = b.d.a();
        }
        return hy1.d(str, str2);
    }

    private final int g(String str, String str2) {
        try {
            try {
                return k12.b(str, w32.f(q22.a("user-agent", b.d.b()), q22.a("cookie", fz1.a.r()), q22.a("accept-encoding", "gzip, deflate, br"), q22.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")), (Map) null, str2, (Object) null, (r12) null, (Map) null, (double) this.d, (Boolean) null, false, (List) null, 1908, (Object) null).d();
            } catch (TimeoutException unused) {
                return -1000;
            } catch (cf2 e2) {
                e = e2;
                uj2.d(e);
                return e.a();
            } catch (IllegalArgumentException e3) {
                e = e3;
                uj2.d(e);
                return -3000;
            } catch (Exception e4) {
                e = e4;
                uj2.d(e);
                return -1;
            }
        } catch (TimeoutException unused2) {
            return -1000;
        } catch (cf2 e5) {
            e = e5;
            uj2.d(e);
            return e.a();
        } catch (IllegalArgumentException e6) {
            e = e6;
            uj2.d(e);
            return -3000;
        } catch (Exception e7) {
            e = e7;
            uj2.d(e);
            return -1;
        }
    }

    public final int a(int i) {
        iy1 e2 = e(this, (String) null, (String) null, 3, (Object) null);
        if (e2 == null || f92.n(e2.a())) {
            return -2000;
        }
        jy1 jy1 = new jy1(i, 6, 0, 0, e2.a());
        String str = this.b;
        String json = this.e.toJson((Object) jy1);
        v62.d(json, "gson.toJson(updateAnimeModel)");
        return g(str, json);
    }

    public final int b(int i) {
        iy1 e2 = e(this, (String) null, (String) null, 3, (Object) null);
        if (e2 == null || f92.n(e2.a())) {
            return -2000;
        }
        h72 h72 = h72.a;
        String format = String.format(this.c, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        v62.d(format, "java.lang.String.format(format, *args)");
        return g(format, "csrf_token=" + e2.a());
    }

    public final ArrayList<sy1> c(String str) {
        String str2 = str;
        v62.e(str2, "username");
        try {
            bf2 a2 = df2.a("https://myanimelist.net/animelist/" + str2 + "&view=tile&status=7&order=5");
            a2.c(b.d.a());
            a2.a("cookie", fz1.a.r());
            a2.a("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            a2.a("accept-encoding", "gzip, deflate, br");
            try {
                a2.d(this.d);
                JSONObject jSONObject = new JSONObject(a2.get().z0("div#app").c("data-list")).getJSONObject("items");
                ArrayList<sy1> arrayList = new ArrayList<>();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null) {
                        String str3 = next;
                        if (jSONObject.get(str3) instanceof JSONObject) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                            try {
                                sy1 sy1 = r5;
                                sy1 sy12 = new sy1(0, (String) null, 0, 0, 0, (String) null, 0, 0, 0, 0, (List) null, (yy1) null, (ky1) null, 8191, (r62) null);
                                sy1 sy13 = sy1;
                                sy13.I(jSONObject2.optLong("id", 0));
                                String optString = jSONObject2.optString("title", "IDK?");
                                v62.d(optString, "animeObject.optString(\"title\", \"IDK?\")");
                                sy13.a0(optString);
                                sy13.X("https://cdn.myanimelist.net" + jSONObject2.optString("image", ""));
                                sy13.W(jSONObject2.optInt("totalEpisodes", 0));
                                sy13.R(jSONObject2.optInt("userStatusId", -1));
                                sy13.Q(jSONObject2.optInt("score", 0));
                                sy13.Y(jSONObject2.optInt("statusId", 0));
                                sy13.T(jSONObject2.optInt("orderKey", -1));
                                sy13.S(jSONObject2.optInt("watchedEpisodes", 0));
                                arrayList.add(sy13);
                            } catch (Exception e2) {
                                uj2.d(e2);
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return arrayList;
            } catch (Exception e3) {
                e = e3;
                uj2.d(e);
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            uj2.d(e);
            return null;
        }
    }

    public final int f(sy1 sy1) {
        v62.e(sy1, "anime");
        iy1 e2 = e(this, (String) null, (String) null, 3, (Object) null);
        if (e2 == null || f92.n(e2.a())) {
            return -2000;
        }
        jy1 jy1 = new jy1(sy1.i(), sy1.n(), sy1.m(), sy1.p(), e2.a());
        String str = this.a;
        String json = this.e.toJson((Object) jy1);
        v62.d(json, "gson.toJson(updateAnimeModel)");
        return g(str, json);
    }
}
