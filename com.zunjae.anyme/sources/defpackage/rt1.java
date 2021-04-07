package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: rt1  reason: default package */
public final class rt1 {
    @SerializedName("name")
    private final String a;
    @SerializedName("image")
    private final String b;
    @SerializedName("description")
    private final String c;
    @SerializedName("donationEndpoint")
    private final String d;

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1 = (rt1) obj;
        return v62.a(this.a, rt1.a) && v62.a(this.b, rt1.b) && v62.a(this.c, rt1.c) && v62.a(this.d, rt1.d);
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "DonatableGroup(name=" + this.a + ", image=" + this.b + ", description=" + this.c + ", donationEndpoint=" + this.d + ")";
    }
}
