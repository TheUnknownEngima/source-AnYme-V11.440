package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: tz1  reason: default package */
public final class tz1 {
    @SerializedName("data")
    private final List<a> a;
    @SerializedName("links")
    private final b b;
    @SerializedName("meta")
    private final c c;

    /* renamed from: tz1$a */
    public static final class a {
        @SerializedName("dub")
        private final Integer a;
        @SerializedName("dynamic_id")
        private final Integer b;
        @SerializedName("episode_num")
        private final String c;
        @SerializedName("id")
        private final int d;
        @SerializedName("sub")
        private final Integer e;
        @SerializedName("thumbnail")
        private final String f;
        @SerializedName("title")
        private final String g;

        public final String a() {
            return this.c;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && this.d == aVar.d && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g);
        }

        public int hashCode() {
            Integer num = this.a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Integer num2 = this.b;
            int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d) * 31;
            Integer num3 = this.e;
            int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
            String str2 = this.f;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.g;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            return "Data(dub=" + this.a + ", dynamicId=" + this.b + ", episodeNum=" + this.c + ", id=" + this.d + ", sub=" + this.e + ", thumbnail=" + this.f + ", title=" + this.g + ")";
        }
    }

    /* renamed from: tz1$b */
    public static final class b {
        @SerializedName("first")
        private final String a;
        @SerializedName("last")
        private final String b;

        public b() {
            this((String) null, (String) null, 3, (r62) null);
        }

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, String str2, int i, r62 r62) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v62.a(this.a, bVar.a) && v62.a(this.b, bVar.b);
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
            return "Links(first=" + this.a + ", last=" + this.b + ")";
        }
    }

    /* renamed from: tz1$c */
    public static final class c {
        @SerializedName("current_page")
        private final int a;
        @SerializedName("from")
        private final int b;
        @SerializedName("last_page")
        private final int c;
        @SerializedName("path")
        private final String d;
        @SerializedName("per_page")
        private final String e;
        @SerializedName("to")
        private final int f;
        @SerializedName("total")
        private final int g;

        public final int a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && v62.a(this.d, cVar.d) && v62.a(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g;
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
            return ((((hashCode + i2) * 31) + this.f) * 31) + this.g;
        }

        public String toString() {
            return "Meta(currentPage=" + this.a + ", from=" + this.b + ", lastPage=" + this.c + ", path=" + this.d + ", perPage=" + this.e + ", to=" + this.f + ", total=" + this.g + ")";
        }
    }

    public final List<a> a() {
        return this.a;
    }

    public final c b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz1)) {
            return false;
        }
        tz1 tz1 = (tz1) obj;
        return v62.a(this.a, tz1.a) && v62.a(this.b, tz1.b) && v62.a(this.c, tz1.c);
    }

    public int hashCode() {
        List<a> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c cVar = this.c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AnimeFlixEpisodeResult(data=" + this.a + ", links=" + this.b + ", meta=" + this.c + ")";
    }
}
