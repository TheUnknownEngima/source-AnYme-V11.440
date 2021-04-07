package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: b02  reason: default package */
public final class b02 {
    @SerializedName("data")
    private final a a;

    /* renamed from: b02$a */
    public static final class a {
        @SerializedName("schema")
        private final b a;
        @SerializedName("current")
        private final C0145a b;

        /* renamed from: b02$a$a  reason: collision with other inner class name */
        public static final class C0145a {
            @SerializedName("airing_date")
            private final String a;
            @SerializedName("anime")
            private final C0146a b;
            @SerializedName("episode_num")
            private final String c;
            @SerializedName("has_vod_dub")
            private final Boolean d;
            @SerializedName("has_vod_sub")
            private final Boolean e;
            @SerializedName("id")
            private final int f;
            @SerializedName("thumbnail")
            private final String g;
            @SerializedName("title")
            private final Object h;
            @SerializedName("url")
            private final b i;
            @SerializedName("views")
            private final Integer j;

            /* renamed from: b02$a$a$a  reason: collision with other inner class name */
            public static final class C0146a {
                @SerializedName("id")
                private final Integer a;
                @SerializedName("slug")
                private final String b;

                public C0146a() {
                    this((Integer) null, (String) null, 3, (r62) null);
                }

                public C0146a(Integer num, String str) {
                    this.a = num;
                    this.b = str;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0146a(Integer num, String str, int i, r62 r62) {
                    this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0146a)) {
                        return false;
                    }
                    C0146a aVar = (C0146a) obj;
                    return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b);
                }

                public int hashCode() {
                    Integer num = this.a;
                    int i = 0;
                    int hashCode = (num != null ? num.hashCode() : 0) * 31;
                    String str = this.b;
                    if (str != null) {
                        i = str.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    return "Anime(id=" + this.a + ", slug=" + this.b + ")";
                }
            }

            /* renamed from: b02$a$a$b */
            public static final class b {
                @SerializedName("sub")
                private final String a;
                @SerializedName("dub")
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
                    return "Url(sub=" + this.a + ", dub=" + this.b + ")";
                }
            }

            public C0145a() {
                this((String) null, (C0146a) null, (String) null, (Boolean) null, (Boolean) null, 0, (String) null, (Object) null, (b) null, (Integer) null, 1023, (r62) null);
            }

            public C0145a(String str, C0146a aVar, String str2, Boolean bool, Boolean bool2, int i2, String str3, Object obj, b bVar, Integer num) {
                this.a = str;
                this.b = aVar;
                this.c = str2;
                this.d = bool;
                this.e = bool2;
                this.f = i2;
                this.g = str3;
                this.h = obj;
                this.i = bVar;
                this.j = num;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C0145a(java.lang.String r14, defpackage.b02.a.C0145a.C0146a r15, java.lang.String r16, java.lang.Boolean r17, java.lang.Boolean r18, int r19, java.lang.String r20, java.lang.Object r21, defpackage.b02.a.C0145a.b r22, java.lang.Integer r23, int r24, defpackage.r62 r25) {
                /*
                    r13 = this;
                    r0 = r24
                    r1 = r0 & 1
                    java.lang.String r2 = ""
                    if (r1 == 0) goto L_0x000a
                    r1 = r2
                    goto L_0x000b
                L_0x000a:
                    r1 = r14
                L_0x000b:
                    r3 = r0 & 2
                    r4 = 3
                    r5 = 0
                    if (r3 == 0) goto L_0x0017
                    b02$a$a$a r3 = new b02$a$a$a
                    r3.<init>(r5, r5, r4, r5)
                    goto L_0x0018
                L_0x0017:
                    r3 = r15
                L_0x0018:
                    r6 = r0 & 4
                    if (r6 == 0) goto L_0x001e
                    r6 = r2
                    goto L_0x0020
                L_0x001e:
                    r6 = r16
                L_0x0020:
                    r7 = r0 & 8
                    if (r7 == 0) goto L_0x0027
                    java.lang.Boolean r7 = java.lang.Boolean.FALSE
                    goto L_0x0029
                L_0x0027:
                    r7 = r17
                L_0x0029:
                    r8 = r0 & 16
                    if (r8 == 0) goto L_0x0030
                    java.lang.Boolean r8 = java.lang.Boolean.FALSE
                    goto L_0x0032
                L_0x0030:
                    r8 = r18
                L_0x0032:
                    r9 = r0 & 32
                    r10 = 0
                    if (r9 == 0) goto L_0x0039
                    r9 = 0
                    goto L_0x003b
                L_0x0039:
                    r9 = r19
                L_0x003b:
                    r11 = r0 & 64
                    if (r11 == 0) goto L_0x0040
                    goto L_0x0042
                L_0x0040:
                    r2 = r20
                L_0x0042:
                    r11 = r0 & 128(0x80, float:1.794E-43)
                    if (r11 == 0) goto L_0x004c
                    java.lang.Object r11 = new java.lang.Object
                    r11.<init>()
                    goto L_0x004e
                L_0x004c:
                    r11 = r21
                L_0x004e:
                    r12 = r0 & 256(0x100, float:3.59E-43)
                    if (r12 == 0) goto L_0x0058
                    b02$a$a$b r12 = new b02$a$a$b
                    r12.<init>(r5, r5, r4, r5)
                    goto L_0x005a
                L_0x0058:
                    r12 = r22
                L_0x005a:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0063
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                    goto L_0x0065
                L_0x0063:
                    r0 = r23
                L_0x0065:
                    r14 = r13
                    r15 = r1
                    r16 = r3
                    r17 = r6
                    r18 = r7
                    r19 = r8
                    r20 = r9
                    r21 = r2
                    r22 = r11
                    r23 = r12
                    r24 = r0
                    r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.a.C0145a.<init>(java.lang.String, b02$a$a$a, java.lang.String, java.lang.Boolean, java.lang.Boolean, int, java.lang.String, java.lang.Object, b02$a$a$b, java.lang.Integer, int, r62):void");
            }

            public final int a() {
                return this.f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0145a)) {
                    return false;
                }
                C0145a aVar = (C0145a) obj;
                return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && this.f == aVar.f && v62.a(this.g, aVar.g) && v62.a(this.h, aVar.h) && v62.a(this.i, aVar.i) && v62.a(this.j, aVar.j);
            }

            public int hashCode() {
                String str = this.a;
                int i2 = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                C0146a aVar = this.b;
                int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                Boolean bool = this.d;
                int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
                Boolean bool2 = this.e;
                int hashCode5 = (((hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.f) * 31;
                String str3 = this.g;
                int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Object obj = this.h;
                int hashCode7 = (hashCode6 + (obj != null ? obj.hashCode() : 0)) * 31;
                b bVar = this.i;
                int hashCode8 = (hashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31;
                Integer num = this.j;
                if (num != null) {
                    i2 = num.hashCode();
                }
                return hashCode8 + i2;
            }

            public String toString() {
                return "Current(airingDate=" + this.a + ", anime=" + this.b + ", episodeNum=" + this.c + ", hasVodDub=" + this.d + ", hasVodSub=" + this.e + ", id=" + this.f + ", thumbnail=" + this.g + ", title=" + this.h + ", url=" + this.i + ", views=" + this.j + ")";
            }
        }

        /* renamed from: b02$a$b */
        public static final class b {
            @SerializedName("episodeNumber")
            private final String a;
            @SerializedName("inLanguage")
            private final String b;
            @SerializedName("name")
            private final String c;
            @SerializedName("subtitleLanguage")
            private final String d;
            @SerializedName("thumbnailUrl")
            private final String e;

            public b() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (r62) null);
            }

            public b(String str, String str2, String str3, String str4, String str5) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ b(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, defpackage.r62 r11) {
                /*
                    r4 = this;
                    r11 = r10 & 1
                    java.lang.String r0 = ""
                    if (r11 == 0) goto L_0x0008
                    r11 = r0
                    goto L_0x0009
                L_0x0008:
                    r11 = r5
                L_0x0009:
                    r5 = r10 & 2
                    if (r5 == 0) goto L_0x000f
                    r1 = r0
                    goto L_0x0010
                L_0x000f:
                    r1 = r6
                L_0x0010:
                    r5 = r10 & 4
                    if (r5 == 0) goto L_0x0016
                    r2 = r0
                    goto L_0x0017
                L_0x0016:
                    r2 = r7
                L_0x0017:
                    r5 = r10 & 8
                    if (r5 == 0) goto L_0x001d
                    r3 = r0
                    goto L_0x001e
                L_0x001d:
                    r3 = r8
                L_0x001e:
                    r5 = r10 & 16
                    if (r5 == 0) goto L_0x0024
                    r10 = r0
                    goto L_0x0025
                L_0x0024:
                    r10 = r9
                L_0x0025:
                    r5 = r4
                    r6 = r11
                    r7 = r1
                    r8 = r2
                    r9 = r3
                    r5.<init>(r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.a.b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r62):void");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return v62.a(this.a, bVar.a) && v62.a(this.b, bVar.b) && v62.a(this.c, bVar.c) && v62.a(this.d, bVar.d) && v62.a(this.e, bVar.e);
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
                if (str5 != null) {
                    i = str5.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                return "Schema(episodeNumber=" + this.a + ", inLanguage=" + this.b + ", name=" + this.c + ", subtitleLanguage=" + this.d + ", thumbnailUrk=" + this.e + ")";
            }
        }

        public a() {
            this((b) null, (C0145a) null, 3, (r62) null);
        }

        public a(b bVar, C0145a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(b bVar, C0145a aVar, int i, r62 r62) {
            this((i & 1) != 0 ? new b((String) null, (String) null, (String) null, (String) null, (String) null, 31, (r62) null) : bVar, (i & 2) != 0 ? null : aVar);
        }

        public final C0145a a() {
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
            b bVar = this.a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C0145a aVar = this.b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Data(schema=" + this.a + ", current=" + this.b + ")";
        }
    }

    public b02() {
        this((a) null, 1, (r62) null);
    }

    public b02(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b02(a aVar, int i, r62 r62) {
        this((i & 1) != 0 ? new a((a.b) null, (a.C0145a) null, 3, (r62) null) : aVar);
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b02) && v62.a(this.a, ((b02) obj).a);
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
        return "AnimeUltimaEpisodeLinks(data=" + this.a + ")";
    }
}
