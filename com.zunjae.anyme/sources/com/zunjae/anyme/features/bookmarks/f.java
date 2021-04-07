package com.zunjae.anyme.features.bookmarks;

import com.google.gson.annotations.SerializedName;

public final class f {
    @SerializedName("AnimeId")
    private final int a;
    @SerializedName("SeriesTitle")
    private final String b;
    @SerializedName("ImageURL")
    private final String c;
    @SerializedName("DateCreated")
    private final int d;
    private ry1 e;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final ry1 d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && v62.a(this.b, fVar.b) && v62.a(this.c, fVar.c) && this.d == fVar.d && v62.a(this.e, fVar.e);
    }

    public final void f(ry1 ry1) {
        this.e = ry1;
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
        ry1 ry1 = this.e;
        if (ry1 != null) {
            i2 = ry1.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "BookmarkEntry(animeId=" + this.a + ", seriesTitle=" + this.b + ", imageURL=" + this.c + ", dateCreated=" + this.d + ", progression=" + this.e + ")";
    }
}
