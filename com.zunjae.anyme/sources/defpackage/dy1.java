package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: dy1  reason: default package */
public final class dy1 {
    @SerializedName("GenreTitle")
    private final String a;
    @SerializedName("Amount")
    private final int b;

    public final String a() {
        return f92.q(this.a, "_", " ", false, 4, (Object) null);
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1 = (dy1) obj;
        return v62.a(this.a, dy1.a) && this.b == dy1.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        return "TopGenre(title=" + this.a + ", amount=" + this.b + ")";
    }
}
