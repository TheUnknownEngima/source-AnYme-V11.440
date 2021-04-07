package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: jt1  reason: default package */
public final class jt1 {
    @SerializedName("id")
    private int a;
    @SerializedName("title")
    private String b;
    @SerializedName("type")
    private String c;
    @SerializedName("episodes")
    private Integer d;
    @SerializedName("image_url")
    private final String e;
    @SerializedName("score")
    private double f;

    public final int a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = defpackage.f92.q(r0, "{MP}", "https://cdn.myanimelist.net/images/anime/", false, 4, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r6 = this;
            java.lang.String r0 = r6.e
            if (r0 == 0) goto L_0x0012
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "{MP}"
            java.lang.String r2 = "https://cdn.myanimelist.net/images/anime/"
            java.lang.String r0 = defpackage.f92.q(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.lang.String r0 = ""
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt1.b():java.lang.String");
    }

    public final double c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return false;
        }
        jt1 jt1 = (jt1) obj;
        return this.a == jt1.a && v62.a(this.b, jt1.b) && v62.a(this.c, jt1.c) && v62.a(this.d, jt1.d) && v62.a(this.e, jt1.e) && Double.compare(this.f, jt1.f) == 0;
    }

    public final vs1 f() {
        String str;
        if (this.f > ((double) 0)) {
            str = "{faw-star} " + this.f;
        } else {
            str = null;
        }
        return new vs1(this.a, this.b, b(), str, this.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode3 + i2) * 31) + Double.doubleToLongBits(this.f);
    }

    public String toString() {
        return "DiscoverEntry(id=" + this.a + ", title=" + this.b + ", type=" + this.c + ", episodes=" + this.d + ", imageUrl=" + this.e + ", score=" + this.f + ")";
    }
}
