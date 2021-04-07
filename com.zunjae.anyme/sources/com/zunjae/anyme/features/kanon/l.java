package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;

public final class l {
    @SerializedName("Title")
    private final String a;
    @SerializedName("Id")
    private final int b;
    @SerializedName("Amount")
    private final int c;

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return v62.a(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "UserFavoriteGenre(genreTitle=" + this.a + ", genreId=" + this.b + ", amount=" + this.c + ")";
    }
}
