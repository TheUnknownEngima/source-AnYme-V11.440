package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: uz1  reason: default package */
public final class uz1 {
    @SerializedName("data")
    private final List<a> a;

    /* renamed from: uz1$a */
    public static final class a {
        @SerializedName("dynamic_id")
        private final int a;
        @SerializedName("english_title")
        private final String b;
        @SerializedName("cover_photo")
        private final String c;
        @SerializedName("id")
        private final int d;
        @SerializedName("year")
        private final String e;
        @SerializedName("slug")
        private final String f;
        @SerializedName("title")
        private final String g;
        @SerializedName("type")
        private final String h;

        public final String a() {
            return this.c;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.g;
        }

        public final String d() {
            return this.h;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && this.d == aVar.d && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g) && v62.a(this.h, aVar.h);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.g;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.h;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode5 + i2;
        }

        public String toString() {
            return "Data(dynamicId=" + this.a + ", englishTitle=" + this.b + ", coverPhoto=" + this.c + ", id=" + this.d + ", year=" + this.e + ", slug=" + this.f + ", title=" + this.g + ", type=" + this.h + ")";
        }
    }

    public uz1() {
        this((List) null, 1, (r62) null);
    }

    public uz1(List<a> list) {
        v62.e(list, "data");
        this.a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uz1(List list, int i, r62 r62) {
        this((i & 1) != 0 ? f32.f() : list);
    }

    public final List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uz1) && v62.a(this.a, ((uz1) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<a> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AnimeFlixSearchResultRoot(data=" + this.a + ")";
    }
}
