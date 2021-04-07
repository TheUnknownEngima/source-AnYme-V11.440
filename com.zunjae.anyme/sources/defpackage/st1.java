package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: st1  reason: default package */
public final class st1 {
    @SerializedName("question")
    private final String a;
    @SerializedName("answer")
    private final String b;

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
        if (!(obj instanceof st1)) {
            return false;
        }
        st1 st1 = (st1) obj;
        return v62.a(this.a, st1.a) && v62.a(this.b, st1.b);
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
        return "Faq(question=" + this.a + ", answer=" + this.b + ")";
    }
}
