package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: vt1  reason: default package */
public final class vt1 {
    @SerializedName("Reason")
    private final String a;
    @SerializedName("ShortReason")
    private final String b;

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt1)) {
            return false;
        }
        vt1 vt1 = (vt1) obj;
        return v62.a(this.a, vt1.a) && v62.a(this.b, vt1.b);
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
        return "KanonInfo(reason=" + this.a + ", shortReason=" + this.b + ")";
    }
}
