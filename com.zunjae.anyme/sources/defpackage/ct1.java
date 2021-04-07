package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: ct1  reason: default package */
public final class ct1 {
    @SerializedName("GenreId")
    private final int a;
    @SerializedName("GenreTitle")
    private final String b;
    @SerializedName("ImageURL")
    private String c;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct1)) {
            return false;
        }
        ct1 ct1 = (ct1) obj;
        return this.a == ct1.a && v62.a(this.b, ct1.b) && v62.a(this.c, ct1.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AggregatedGenre(genreId=" + this.a + ", genreTitle=" + this.b + ", imageURL=" + this.c + ")";
    }
}
