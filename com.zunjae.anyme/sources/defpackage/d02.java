package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: d02  reason: default package */
public final class d02 {
    @SerializedName("data")
    private final a a;

    /* renamed from: d02$a */
    public static final class a {
        @SerializedName("duration")
        private final String a;
        @SerializedName("id")
        private final Integer b;
        @SerializedName("schema")
        private final C0223a c;
        @SerializedName("slug")
        private final String d;
        @SerializedName("title")
        private final String e;
        @SerializedName("url")
        private final String f;
        @SerializedName("type")
        private final String g;

        /* renamed from: d02$a$a  reason: collision with other inner class name */
        public static final class C0223a {
            @SerializedName("episodes")
            private final List<C0224a> a;
            @SerializedName("url")
            private final String b;
            @SerializedName("name")
            private final String c;

            /* renamed from: d02$a$a$a  reason: collision with other inner class name */
            public static final class C0224a {
                @SerializedName("datePublished")
                private final String a;
                @SerializedName("episodeNumber")
                private final String b;
                @SerializedName("inLanguage")
                private final String c;
                @SerializedName("name")
                private final String d;
                @SerializedName("position")
                private final String e;
                @SerializedName("subtitleLanguage")
                private final String f;
                @SerializedName("@type")
                private final String g;
                @SerializedName("url")
                private final String h;

                public C0224a() {
                    this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (r62) null);
                }

                public C0224a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = str4;
                    this.e = str5;
                    this.f = str6;
                    this.g = str7;
                    this.h = str8;
                }

                /* JADX WARNING: Illegal instructions before constructor call */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public /* synthetic */ C0224a(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, defpackage.r62 r19) {
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
                        if (r4 == 0) goto L_0x0018
                        r4 = r2
                        goto L_0x0019
                    L_0x0018:
                        r4 = r12
                    L_0x0019:
                        r5 = r0 & 8
                        if (r5 == 0) goto L_0x001f
                        r5 = r2
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.d02.a.C0223a.C0224a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r62):void");
                }

                public final String a() {
                    return this.b;
                }

                public final String b() {
                    return this.d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0224a)) {
                        return false;
                    }
                    C0224a aVar = (C0224a) obj;
                    return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g) && v62.a(this.h, aVar.h);
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
                    int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                    String str5 = this.e;
                    int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
                    String str6 = this.f;
                    int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
                    String str7 = this.g;
                    int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
                    String str8 = this.h;
                    if (str8 != null) {
                        i = str8.hashCode();
                    }
                    return hashCode7 + i;
                }

                public String toString() {
                    return "Episode(datePublished=" + this.a + ", episodeNumber=" + this.b + ", inLanguage=" + this.c + ", name=" + this.d + ", position=" + this.e + ", subtitleLanguage=" + this.f + ", type=" + this.g + ", url=" + this.h + ")";
                }
            }

            public C0223a() {
                this((List) null, (String) null, (String) null, 7, (r62) null);
            }

            public C0223a(List<C0224a> list, String str, String str2) {
                this.a = list;
                this.b = str;
                this.c = str2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0223a(List list, String str, String str2, int i, r62 r62) {
                this((i & 1) != 0 ? f32.f() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
            }

            public final List<C0224a> a() {
                return this.a;
            }

            public final String b() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0223a)) {
                    return false;
                }
                C0223a aVar = (C0223a) obj;
                return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
            }

            public int hashCode() {
                List<C0224a> list = this.a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                return "Schema(episodes=" + this.a + ", url=" + this.b + ", name=" + this.c + ")";
            }
        }

        public a() {
            this((String) null, (Integer) null, (C0223a) null, (String) null, (String) null, (String) null, (String) null, 127, (r62) null);
        }

        public a(String str, Integer num, C0223a aVar, String str2, String str3, String str4, String str5) {
            this.a = str;
            this.b = num;
            this.c = aVar;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(java.lang.String r11, java.lang.Integer r12, defpackage.d02.a.C0223a r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, defpackage.r62 r19) {
            /*
                r10 = this;
                r0 = r18 & 1
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0008
                r0 = r1
                goto L_0x0009
            L_0x0008:
                r0 = r11
            L_0x0009:
                r2 = r18 & 2
                if (r2 == 0) goto L_0x0013
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0014
            L_0x0013:
                r2 = r12
            L_0x0014:
                r3 = r18 & 4
                if (r3 == 0) goto L_0x0024
                d02$a$a r3 = new d02$a$a
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 7
                r9 = 0
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9)
                goto L_0x0025
            L_0x0024:
                r3 = r13
            L_0x0025:
                r4 = r18 & 8
                if (r4 == 0) goto L_0x002b
                r4 = r1
                goto L_0x002c
            L_0x002b:
                r4 = r14
            L_0x002c:
                r5 = r18 & 16
                if (r5 == 0) goto L_0x0032
                r5 = r1
                goto L_0x0033
            L_0x0032:
                r5 = r15
            L_0x0033:
                r6 = r18 & 32
                if (r6 == 0) goto L_0x0039
                r6 = r1
                goto L_0x003b
            L_0x0039:
                r6 = r16
            L_0x003b:
                r7 = r18 & 64
                if (r7 == 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r1 = r17
            L_0x0042:
                r11 = r10
                r12 = r0
                r13 = r2
                r14 = r3
                r15 = r4
                r16 = r5
                r17 = r6
                r18 = r1
                r11.<init>(r12, r13, r14, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d02.a.<init>(java.lang.String, java.lang.Integer, d02$a$a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r62):void");
        }

        public final C0223a a() {
            return this.c;
        }

        public final String b() {
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
            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            C0223a aVar = this.c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.g;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            return "Data(duration=" + this.a + ", id=" + this.b + ", schema=" + this.c + ", slug=" + this.d + ", title=" + this.e + ", url=" + this.f + ", type=" + this.g + ")";
        }
    }

    public d02() {
        this((a) null, 1, (r62) null);
    }

    public d02(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d02(a aVar, int i, r62 r62) {
        this((i & 1) != 0 ? new a((String) null, (Integer) null, (a.C0223a) null, (String) null, (String) null, (String) null, (String) null, 127, (r62) null) : aVar);
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d02) && v62.a(this.a, ((d02) obj).a);
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AnimeUltimaEpisodes(data=" + this.a + ")";
    }
}
