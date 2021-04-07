package defpackage;

import android.content.Context;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zunjae.anyme.features.vydia.s;
import com.zunjae.dynsourcegen.e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qv1  reason: default package */
public final class qv1 {
    public static final qv1 a = new qv1();

    /* renamed from: qv1$a */
    public static abstract class a {

        /* renamed from: qv1$a$a  reason: collision with other inner class name */
        public static final class C0260a extends a {
            public static final C0260a a = new C0260a();

            private C0260a() {
                super((r62) null);
            }
        }

        /* renamed from: qv1$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super((r62) null);
            }
        }

        /* renamed from: qv1$a$c */
        public static final class c extends a {
            public c(double d, int i) {
                super((r62) null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }
    }

    /* renamed from: qv1$b */
    public static final class b extends TypeToken<List<? extends s>> {
    }

    private qv1() {
    }

    private final a B(int i, tr1 tr1, ut1 ut1) {
        try {
            ur1 a2 = ut1.f().h().a();
            if (a2 == null) {
                return a.b.a;
            }
            v62.d(a2, "gistService.searchAdBloc…urn AppUpdateResult.Retry");
            if (n32.t(a2.a())) {
                uj2.a("About to save new list with " + a2.a().size() + " entries", new Object[0]);
                nv1.a.d(a2.a(), i);
            }
            tr1.b();
            return new a.c(g(), nv1.a.a());
        } catch (Exception e) {
            uj2.d(e);
            return a.b.a;
        }
    }

    private final void r(String str) {
        l02.v("KEY_LAST_NEW_VERSION", str);
    }

    private final void v(boolean z) {
        l02.p("KEY_SHOULD_UPDATE", z);
    }

    public final boolean A(Context context) {
        v62.e(context, "context");
        return g() > com.zunjae.zapplib.a.e(context);
    }

    public final a C(ut1 ut1, tr1 tr1) {
        v62.e(ut1, "gistService");
        v62.e(tr1, "adBlocker");
        try {
            com.zunjae.anyme.features.niche.au.a a2 = ut1.b().h().a();
            if (a2 == null) {
                return a.b.a;
            }
            v62.d(a2, "try {\n      gistService.…pUpdateResult.Retry\n    }");
            Double q = a2.q();
            if ((q != null ? q.doubleValue() : 0.0d) <= Utils.DOUBLE_EPSILON) {
                uj2.c("Incorrect version number from AppUpdate... Found " + a2.q(), new Object[0]);
                return a.C0260a.a;
            }
            r(String.valueOf(a2.q()));
            n(a2.d());
            u(a2.p());
            String j = a2.j();
            if (j != null) {
                a.l(j);
            }
            v(a2.r());
            q(a2.i());
            m(a2.c());
            o(a2.n());
            p(a2.m());
            t(a2.o());
            e.j.p(a2.e());
            zw1.c.f(a2.f());
            zw1.c.g(a2.h());
            zw1.c.h(a2.g());
            py1 k = a2.k();
            if (k != null) {
                fz1.a.n(k);
            }
            String l = a2.l();
            if (l != null) {
                a.s(l);
            }
            if (a2.b() > nv1.a.a()) {
                return B(a2.b(), tr1, ut1);
            }
            uj2.a("No need to update the AdBlocker :-)", new Object[0]);
            return new a.c(g(), nv1.a.a());
        } catch (Exception e) {
            uj2.d(e);
            return a.b.a;
        }
    }

    public final String a() {
        String l = l02.l("KEY_APP_UPDATE_ENDPOINT", "https://anyme.app/apk");
        v62.d(l, "ZimpleDB.getString(KEY_A… \"https://anyme.app/apk\")");
        return l;
    }

    public final String b() {
        return l02.l("KEY_BETA_VERSION", (String) null);
    }

    public final String c() {
        return l02.l("KEY_CHANGELOG_URL", (String) null);
    }

    public final int d() {
        return l02.g("KEY_GENRES_PAGING_COUNT", 75);
    }

    public final List<String> e() {
        ArrayList<String> f = l02.f("KEY_MANUALLY_PLAY", String.class);
        v62.d(f, "ZimpleDB.getGenericList(…PLAY, String::class.java)");
        List<String> a0 = n32.a0(f);
        return a0.isEmpty() ? f32.h("fembed.com/v/", "replay.watch/", "animeultima.eu") : a0;
    }

    public final String f() {
        return l02.l("KEY_KS", (String) null);
    }

    public final double g() {
        String l = l02.l("KEY_LAST_NEW_VERSION", (String) null);
        if (l == null) {
            return -1.0d;
        }
        try {
            return Double.parseDouble(l);
        } catch (Exception e) {
            uj2.d(e);
            return -1.0d;
        }
    }

    public final List<s> h() {
        String l = l02.l("KEY_REDIRECTOR", (String) null);
        if (l != null) {
            return (List) new Gson().fromJson(l, new b().getType());
        }
        return null;
    }

    public final String i() {
        return l02.l("KEY_SHORT_DESCRIPTION", (String) null);
    }

    public final boolean j() {
        String q;
        Integer g;
        try {
            Integer g2 = e92.g(f92.q("11.440", ".", "", false, 4, (Object) null));
            int intValue = g2 != null ? g2.intValue() : 0;
            String b2 = b();
            return intValue < ((b2 == null || (q = f92.q(b2, ".", "", false, 4, (Object) null)) == null || (g = e92.g(q)) == null) ? 0 : g.intValue());
        } catch (Exception e) {
            uj2.d(e);
            return false;
        }
    }

    public final void k(String str) {
        v62.e(str, "itemId");
        l02.p("MenuItem" + str, true);
    }

    public final void l(String str) {
        v62.e(str, "endpoint");
        l02.v("KEY_APP_UPDATE_ENDPOINT", str);
    }

    public final void m(String str) {
        if (str != null) {
            l02.v("KEY_BETA_VERSION", str);
        }
    }

    public final void n(String str) {
        if (str != null && (!f92.n(str))) {
            l02.v("KEY_CHANGELOG_URL", str);
        }
    }

    public final void o(int i) {
        l02.r("KEY_GENRES_PAGING_COUNT", i);
    }

    public final void p(List<String> list) {
        v62.e(list, "value");
        l02.q("KEY_MANUALLY_PLAY", list);
    }

    public final void q(String str) {
        if (str == null) {
            l02.c("KEY_KS");
        } else {
            l02.v("KEY_KS", str);
        }
    }

    public final void s(String str) {
        v62.e(str, "endpoint");
        l02.v("KEY_LOGIN_SUCCESS_ENDPOINT", str);
    }

    public final void t(List<s> list) {
        l02.v("KEY_REDIRECTOR", new Gson().toJson((Object) list));
    }

    public final void u(String str) {
        if (str != null && (!f92.n(str))) {
            l02.v("KEY_SHORT_DESCRIPTION", str);
        }
    }

    public final boolean w() {
        return l02.e("KEY_SHOULD_UPDATE", false);
    }

    public final boolean x(Context context) {
        v62.e(context, "context");
        return !z(context);
    }

    public final boolean y() {
        return l02.e("preference_key_use_english_titles_instead", false);
    }

    public final boolean z(Context context) {
        v62.e(context, "context");
        return com.zunjae.zapplib.a.c(context, "com.zunjae.support");
    }
}
