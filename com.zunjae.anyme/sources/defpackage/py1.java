package defpackage;

import com.google.gson.annotations.SerializedName;
import com.zunjae.constants.b;
import java.util.List;

/* renamed from: py1  reason: default package */
public final class py1 {
    public static final a i = new a((r62) null);
    @SerializedName("version")
    private final int a;
    @SerializedName("lopi")
    private final String b;
    @SerializedName("prco")
    private final List<l22<String, String>> c;
    @SerializedName("reloda")
    private final int d;
    @SerializedName("ua")
    private final String e;
    @SerializedName("un-field")
    private final String f;
    @SerializedName("pw-field")
    private final String g;
    @SerializedName("l_s_c")
    private final String h;

    /* renamed from: py1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final py1 a() {
            return new py1(1, "https://myanimelist.net/login.php", f32.h(new l22("myanimelist.net", "m_gdpr_mdl=1"), new l22("myanimelist.net", "m_gdpr_mdl_2=1")), 5, b.d.a(), "#loginUserName", "#password", "is_logged_in=1");
        }
    }

    public py1(int i2, String str, List<l22<String, String>> list, int i3, String str2, String str3, String str4, String str5) {
        v62.e(str, "loginPage");
        v62.e(list, "preloadedCookies");
        v62.e(str2, "userAgent");
        v62.e(str3, "usernameField");
        v62.e(str4, "passwordField");
        v62.e(str5, "loginSuccessCookieToCheckFor");
        this.a = i2;
        this.b = str;
        this.c = list;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.g;
    }

    public final List<l22<String, String>> d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py1)) {
            return false;
        }
        py1 py1 = (py1) obj;
        return this.a == py1.a && v62.a(this.b, py1.b) && v62.a(this.c, py1.c) && this.d == py1.d && v62.a(this.e, py1.e) && v62.a(this.f, py1.f) && v62.a(this.g, py1.g) && v62.a(this.h, py1.h);
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        int i2 = this.a * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<l22<String, String>> list = this.c;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.d) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode5 + i3;
    }

    public String toString() {
        return "MyAnimeListLoginInstructions(version=" + this.a + ", loginPage=" + this.b + ", preloadedCookies=" + this.c + ", reloginDays=" + this.d + ", userAgent=" + this.e + ", usernameField=" + this.f + ", passwordField=" + this.g + ", loginSuccessCookieToCheckFor=" + this.h + ")";
    }
}
