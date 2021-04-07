package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: xt1  reason: default package */
public final class xt1 {
    @SerializedName("description")
    private final String a;
    @SerializedName("image")
    private final String b;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt1)) {
            return false;
        }
        xt1 xt1 = (xt1) obj;
        return v62.a(this.a, xt1.a) && v62.a(this.b, xt1.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "WelcomePages(description=" + this.a + ", image=" + this.b + ")";
    }
}
