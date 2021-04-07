package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: bt1  reason: default package */
public final class bt1 {
    @SerializedName("Episodes")
    private int a;
    @SerializedName("AnimeId")
    private int b;
    @SerializedName("Amount")
    private int c;
    @SerializedName("ImageURL")
    private String d;
    @SerializedName("Title")
    private String e;
    @SerializedName("Score")
    private float f;

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final float c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1 = (bt1) obj;
        return this.a == bt1.a && this.b == bt1.b && this.c == bt1.c && v62.a(this.d, bt1.d) && v62.a(this.e, bt1.e) && Float.compare(this.f, bt1.f) == 0;
    }

    public int hashCode() {
        int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Float.floatToIntBits(this.f);
    }

    public String toString() {
        return "ShowsBeingWatched(episodes=" + this.a + ", animeId=" + this.b + ", amount=" + this.c + ", imageURL=" + this.d + ", title=" + this.e + ", score=" + this.f + ")";
    }
}
