package defpackage;

/* renamed from: qz1  reason: default package */
public final class qz1 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;

    public qz1(String str, String str2, String str3, String str4, String str5, Integer num) {
        v62.e(str, "slug");
        v62.e(str2, "title");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz1(String str, String str2, String str3, String str4, String str5, Integer num, int i, r62 r62) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : num);
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1 = (qz1) obj;
        return v62.a(this.a, qz1.a) && v62.a(this.b, qz1.b) && v62.a(this.c, qz1.c) && v62.a(this.d, qz1.d) && v62.a(this.e, qz1.e) && v62.a(this.f, qz1.f);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "StreamingSiteSearchResult(slug=" + this.a + ", title=" + this.b + ", image=" + this.c + ", wallpaper=" + this.d + ", additionalInfo=" + this.e + ", animeId=" + this.f + ")";
    }
}
