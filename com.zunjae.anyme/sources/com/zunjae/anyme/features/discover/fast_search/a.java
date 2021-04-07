package com.zunjae.anyme.features.discover.fast_search;

public final class a {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public a(int i, String str, String str2, String str3, String str4, String str5) {
        v62.e(str, "title");
        v62.e(str2, "score");
        v62.e(str5, "imageURL");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "AnimeMobileSearchResult(id=" + this.a + ", title=" + this.b + ", score=" + this.c + ", episodes=" + this.d + ", description=" + this.e + ", imageURL=" + this.f + ")";
    }
}
