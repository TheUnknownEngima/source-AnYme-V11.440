package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: e02  reason: default package */
public final class e02 {
    @SerializedName("data")
    private final List<a> a;

    /* renamed from: e02$a */
    public static final class a {
        @SerializedName("cover_photo")
        private final String a;
        @SerializedName("description")
        private final String b;
        @SerializedName("dynamic_id")
        private final int c;
        @SerializedName("id")
        private final int d;
        @SerializedName("slug")
        private final String e;
        @SerializedName("title")
        private final String f;
        @SerializedName("type")
        private final String g;
        @SerializedName("year")
        private final String h;

        public a() {
            this((String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, 255, (r62) null);
        }

        public a(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r10, java.lang.String r11, int r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, defpackage.r62 r19) {
            /*
                r9 = this;
                r0 = r18
                r1 = r0 & 1
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r1 = r2
                goto L_0x000b
            L_0x000a:
                r1 = r10
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0012
            L_0x0011:
                r3 = r11
            L_0x0012:
                r4 = r0 & 4
                r5 = 0
                if (r4 == 0) goto L_0x0019
                r4 = 0
                goto L_0x001a
            L_0x0019:
                r4 = r12
            L_0x001a:
                r6 = r0 & 8
                if (r6 == 0) goto L_0x001f
                goto L_0x0020
            L_0x001f:
                r5 = r13
            L_0x0020:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0026
                r6 = r2
                goto L_0x0027
            L_0x0026:
                r6 = r14
            L_0x0027:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002d
                r7 = r2
                goto L_0x002e
            L_0x002d:
                r7 = r15
            L_0x002e:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0034
                r8 = r2
                goto L_0x0036
            L_0x0034:
                r8 = r16
            L_0x0036:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r2 = r17
            L_0x003d:
                r10 = r9
                r11 = r1
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r16 = r7
                r17 = r8
                r18 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e02.a.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r62):void");
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.f;
        }

        public final String d() {
            return this.g;
        }

        public final String e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g) && v62.a(this.h, aVar.h);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.g;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.h;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            return "Data(coverPhoto=" + this.a + ", description=" + this.b + ", dynamicId=" + this.c + ", id=" + this.d + ", slug=" + this.e + ", title=" + this.f + ", type=" + this.g + ", year=" + this.h + ")";
        }
    }

    public e02() {
        this((List) null, 1, (r62) null);
    }

    public e02(List<a> list) {
        v62.e(list, "data");
        this.a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e02(List list, int i, r62 r62) {
        this((i & 1) != 0 ? f32.f() : list);
    }

    public final List<a> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e02) && v62.a(this.a, ((e02) obj).a);
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
        return "AnimeUltimaSearchResult(data=" + this.a + ")";
    }
}
