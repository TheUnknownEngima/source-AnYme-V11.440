package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: qt1  reason: default package */
public final class qt1 {
    @SerializedName("GetsCollected")
    private final List<a> a;
    @SerializedName("NotCollected")
    private final List<String> b;

    /* renamed from: qt1$a */
    public static final class a {
        @SerializedName("Reason")
        private final String a;
        @SerializedName("Title")
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b);
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
            return "GetsCollected(reason=" + this.a + ", title=" + this.b + ")";
        }
    }

    public final List<a> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt1)) {
            return false;
        }
        qt1 qt1 = (qt1) obj;
        return v62.a(this.a, qt1.a) && v62.a(this.b, qt1.b);
    }

    public int hashCode() {
        List<a> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppPrivacyPolicy(getsCollected=" + this.a + ", notCollected=" + this.b + ")";
    }
}
