package defpackage;

/* renamed from: cr1  reason: default package */
public final class cr1 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public cr1(String str, String str2, String str3, String str4, String str5) {
        v62.e(str, "title");
        v62.e(str2, "imageUrl");
        v62.e(str3, "date");
        v62.e(str4, "numberOfComments");
        v62.e(str5, "articleURL");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr1)) {
            return false;
        }
        cr1 cr1 = (cr1) obj;
        return v62.a(this.a, cr1.a) && v62.a(this.b, cr1.b) && v62.a(this.c, cr1.c) && v62.a(this.d, cr1.d) && v62.a(this.e, cr1.e);
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
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "NewsArticle(title=" + this.a + ", imageUrl=" + this.b + ", date=" + this.c + ", numberOfComments=" + this.d + ", articleURL=" + this.e + ")";
    }
}
