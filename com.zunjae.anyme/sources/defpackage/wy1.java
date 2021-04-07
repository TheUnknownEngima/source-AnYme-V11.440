package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: wy1  reason: default package */
public final class wy1 {
    @SerializedName("userId")
    private final String a;
    @SerializedName("daysWastedText")
    private final String b;

    public wy1(String str, String str2) {
        v62.e(str, "userImage");
        v62.e(str2, "daysWastedText");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy1)) {
            return false;
        }
        wy1 wy1 = (wy1) obj;
        return v62.a(this.a, wy1.a) && v62.a(this.b, wy1.b);
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
        return "MALUserProfile(userImage=" + this.a + ", daysWastedText=" + this.b + ")";
    }
}
