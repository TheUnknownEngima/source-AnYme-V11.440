package com.zunjae.anyme.features.discover.continue_watching;

import com.google.gson.annotations.SerializedName;

public final class c {
    @SerializedName("MALId")
    private final int a;
    @SerializedName("Score")
    private final double b;
    @SerializedName("Type")
    private final String c;
    @SerializedName("ImageURL")
    private final String d;
    @SerializedName("Title")
    private final String e;
    @SerializedName("Episodes")
    private final int f;
    @SerializedName("Id")
    private final int g;

    public final int a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.g;
    }

    public final double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && Double.compare(this.b, cVar.b) == 0 && v62.a(this.c, cVar.c) && v62.a(this.d, cVar.d) && v62.a(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.c;
    }

    public final xy1 h() {
        return new xy1((long) this.a, this.e, this.d);
    }

    public int hashCode() {
        int a2 = ((this.a * 31) + Double.doubleToLongBits(this.b)) * 31;
        String str = this.c;
        int i = 0;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.f) * 31) + this.g;
    }

    public String toString() {
        return "ContinueWatchingModel(malId=" + this.a + ", score=" + this.b + ", type=" + this.c + ", imageURL=" + this.d + ", title=" + this.e + ", episodes=" + this.f + ", parentId=" + this.g + ")";
    }
}
