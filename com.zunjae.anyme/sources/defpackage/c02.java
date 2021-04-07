package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: c02  reason: default package */
public final class c02 {
    @SerializedName("data")
    private final List<a> a;

    /* renamed from: c02$a */
    public static final class a {
        @SerializedName("embed")
        private final String a;
        @SerializedName("id")
        private final Integer b;
        @SerializedName("name")
        private final String c;
        @SerializedName("type")
        private final String d;

        public a() {
            this((String) null, (Integer) null, (String) null, (String) null, 15, (r62) null);
        }

        public a(String str, Integer num, String str2, String str3) {
            v62.e(str, "embed");
            v62.e(str2, "name");
            v62.e(str3, "type");
            this.a = str;
            this.b = num;
            this.c = str2;
            this.d = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, Integer num, String str2, String str3, int i, r62 r62) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "Data(embed=" + this.a + ", id=" + this.b + ", name=" + this.c + ", type=" + this.d + ")";
        }
    }

    public c02() {
        this((List) null, 1, (r62) null);
    }

    public c02(List<a> list) {
        this.a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c02(List list, int i, r62 r62) {
        this((i & 1) != 0 ? f32.f() : list);
    }

    public final List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c02) && v62.a(this.a, ((c02) obj).a);
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
        return "AnimeUltimaEpisodeVideo(data=" + this.a + ")";
    }
}
