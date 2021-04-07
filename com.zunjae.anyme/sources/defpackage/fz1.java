package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/* renamed from: fz1  reason: default package */
public final class fz1 {
    public static final fz1 a = new fz1();

    /* renamed from: fz1$a */
    public static final class a extends TypeToken<py1> {
    }

    private fz1() {
    }

    private final long c() {
        return l02.h("KEY_USER_COOKIES_EXPIRATION_DATE", -1);
    }

    private final wy1 j() {
        return (wy1) l02.i("KEY_MALUSERPROFILE2", wy1.class);
    }

    public final void a() {
        l02.c("KEY_USER_CREDENTIALSV3");
        a.e();
    }

    public final boolean b() {
        return System.currentTimeMillis() > c();
    }

    public final void d() {
        l02.s("KEY_USER_COOKIES_EXPIRATION_DATE", i02.c(30));
    }

    public final void e() {
        l02.c("KEY_USER_COOKIES");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015 A[Catch:{ Exception -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ Exception -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.py1 f() {
        /*
            r3 = this;
            java.lang.String r0 = "KEY_LOGIN_INSTRUCTIONS"
            r1 = 0
            java.lang.String r0 = defpackage.l02.l(r0, r1)     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0012
            int r1 = r0.length()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            py1$a r0 = defpackage.py1.i     // Catch:{ Exception -> 0x0031 }
            py1 r0 = r0.a()     // Catch:{ Exception -> 0x0031 }
            return r0
        L_0x001c:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0031 }
            r1.<init>()     // Catch:{ Exception -> 0x0031 }
            fz1$a r2 = new fz1$a     // Catch:{ Exception -> 0x0031 }
            r2.<init>()     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x0031 }
            py1 r0 = (defpackage.py1) r0     // Catch:{ Exception -> 0x0031 }
            return r0
        L_0x0031:
            py1$a r0 = defpackage.py1.i
            py1 r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.f():py1");
    }

    public final boolean g() {
        return l02.m("KEY_USER_CREDENTIALSV3");
    }

    public final boolean h() {
        return !g();
    }

    public final String i() {
        wy1 j = j();
        if (j != null) {
            return j.a();
        }
        return null;
    }

    public final String k() {
        return "https://myanimelist.net/mangalist/" + t() + "?status=1&tag=";
    }

    public final String l() {
        return "http://myanimelist.net/profile/" + t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m() {
        /*
            r1 = this;
            wy1 r0 = r1.j()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.b()
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz1.m():java.lang.String");
    }

    public final void n(py1 py1) {
        v62.e(py1, "instructions");
        l02.v("KEY_LOGIN_INSTRUCTIONS", new Gson().toJson((Object) py1));
    }

    public final void o(wy1 wy1) {
        v62.e(wy1, "userProfile");
        l02.t("KEY_MALUSERPROFILE2", wy1);
    }

    public final void p(String str) {
        v62.e(str, "cookies");
        l02.v("KEY_USER_COOKIES", str);
        l02.s("KEY_USER_COOKIES_EXPIRATION_DATE", i02.a(10));
    }

    public final void q(qy1 qy1) {
        v62.e(qy1, "user");
        l02.t("KEY_USER_CREDENTIALSV3", qy1);
    }

    public final String r() {
        return l02.l("KEY_USER_COOKIES", (String) null);
    }

    public final qy1 s() {
        return (qy1) l02.i("KEY_USER_CREDENTIALSV3", qy1.class);
    }

    public final String t() {
        qy1 s = s();
        if (s != null) {
            return s.b();
        }
        return null;
    }
}
