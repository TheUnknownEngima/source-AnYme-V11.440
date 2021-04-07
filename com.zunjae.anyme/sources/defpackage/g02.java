package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: g02  reason: default package */
public interface g02 {

    /* renamed from: g02$a */
    public static final class a {
        @SerializedName("urls")
        private final List<C0235a> a;

        /* renamed from: g02$a$a  reason: collision with other inner class name */
        public static final class C0235a {
            @SerializedName("label")
            private final String a;
            @SerializedName("src")
            private final String b;
            @SerializedName("type")
            private final String c;

            public C0235a(String str, String str2, String str3) {
                v62.e(str, "label");
                v62.e(str2, "src");
                v62.e(str3, "type");
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

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
                if (!(obj instanceof C0235a)) {
                    return false;
                }
                C0235a aVar = (C0235a) obj;
                return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
            }

            public int hashCode() {
                String str = this.a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.c;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                return "Url(label=" + this.a + ", src=" + this.b + ", type=" + this.c + ")";
            }
        }

        public a(List<C0235a> list) {
            v62.e(list, "urls");
            this.a = list;
        }

        public final List<C0235a> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && v62.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<C0235a> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "HostingSiteSelection(urls=" + this.a + ")";
        }
    }

    /* renamed from: g02$b */
    public static final class b {
        @SerializedName("urls")
        private final String a;

        public final a a() {
            return new a(e32.b(new a.C0235a("Bun", this.a, "Bun")));
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && v62.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "HostingSiteSelectionMinimal(urls=" + this.a + ")";
        }
    }

    /* renamed from: g02$c */
    public static final class c {
        @SerializedName("json")
        private final a a;

        /* renamed from: g02$c$a */
        public static final class a {
            @SerializedName("seasons")
            private final C0236a a;

            /* renamed from: g02$c$a$a  reason: collision with other inner class name */
            public static final class C0236a {
                @SerializedName("ws")
                private final C0237a a;

                /* renamed from: g02$c$a$a$a  reason: collision with other inner class name */
                public static final class C0237a {
                    @SerializedName("media")
                    private final List<C0238a> a;

                    /* renamed from: g02$c$a$a$a$a  reason: collision with other inner class name */
                    public static final class C0238a {
                        @SerializedName("description")
                        private final String a;
                        @SerializedName("episodes")
                        private final List<C0239a> b;
                        @SerializedName("id")
                        private final String c;
                        @SerializedName("is_mature")
                        private final Boolean d;
                        @SerializedName("title")
                        private final String e;

                        /* renamed from: g02$c$a$a$a$a$a  reason: collision with other inner class name */
                        public static final class C0239a {
                            @SerializedName("description")
                            private final String a;
                            @SerializedName("episode_number")
                            private final String b;
                            @SerializedName("ova_number")
                            private final String c;
                            @SerializedName("id")
                            private final String d;
                            @SerializedName("title")
                            private final String e;
                            @SerializedName("sources")
                            private final List<C0240a> f;
                            @SerializedName("retrieve_url")
                            private final Object g;

                            /* renamed from: g02$c$a$a$a$a$a$a  reason: collision with other inner class name */
                            public static final class C0240a {
                                @SerializedName("source")
                                private final String a;
                                @SerializedName("language")
                                private final String b;
                                @SerializedName("retrieve_url")
                                private final Object c;

                                public final Object a() {
                                    return this.c;
                                }

                                public final String b() {
                                    return this.b;
                                }

                                public final String c() {
                                    return this.a;
                                }

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (!(obj instanceof C0240a)) {
                                        return false;
                                    }
                                    C0240a aVar = (C0240a) obj;
                                    return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
                                }

                                public int hashCode() {
                                    String str = this.a;
                                    int i = 0;
                                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                                    String str2 = this.b;
                                    int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                                    Object obj = this.c;
                                    if (obj != null) {
                                        i = obj.hashCode();
                                    }
                                    return hashCode2 + i;
                                }

                                public String toString() {
                                    return "EpisodeSource(sourceTitle=" + this.a + ", showLanguage=" + this.b + ", retrieveURL=" + this.c + ")";
                                }
                            }

                            public final String a() {
                                return this.a;
                            }

                            public final String b() {
                                return this.b;
                            }

                            public final String c() {
                                return this.c;
                            }

                            public final Object d() {
                                return this.g;
                            }

                            public final List<C0240a> e() {
                                return this.f;
                            }

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C0239a)) {
                                    return false;
                                }
                                C0239a aVar = (C0239a) obj;
                                return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && v62.a(this.f, aVar.f) && v62.a(this.g, aVar.g);
                            }

                            public final String f() {
                                return this.e;
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
                                List<C0240a> list = this.f;
                                int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
                                Object obj = this.g;
                                if (obj != null) {
                                    i = obj.hashCode();
                                }
                                return hashCode6 + i;
                            }

                            public String toString() {
                                return "Episode(description=" + this.a + ", episodeNumber=" + this.b + ", ovaNumber=" + this.c + ", id=" + this.d + ", title=" + this.e + ", sources=" + this.f + ", retrieveUrlThot=" + this.g + ")";
                            }
                        }

                        public C0238a() {
                            this((String) null, (List) null, (String) null, (Boolean) null, (String) null, 31, (r62) null);
                        }

                        public C0238a(String str, List<C0239a> list, String str2, Boolean bool, String str3) {
                            this.a = str;
                            this.b = list;
                            this.c = str2;
                            this.d = bool;
                            this.e = str3;
                        }

                        /* JADX WARNING: Illegal instructions before constructor call */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public /* synthetic */ C0238a(java.lang.String r5, java.util.List r6, java.lang.String r7, java.lang.Boolean r8, java.lang.String r9, int r10, defpackage.r62 r11) {
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
                                if (r5 == 0) goto L_0x0011
                                java.util.List r6 = defpackage.f32.f()
                            L_0x0011:
                                r1 = r6
                                r5 = r10 & 4
                                if (r5 == 0) goto L_0x0018
                                r2 = r0
                                goto L_0x0019
                            L_0x0018:
                                r2 = r7
                            L_0x0019:
                                r5 = r10 & 8
                                if (r5 == 0) goto L_0x001f
                                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                            L_0x001f:
                                r3 = r8
                                r5 = r10 & 16
                                if (r5 == 0) goto L_0x0026
                                r10 = r0
                                goto L_0x0027
                            L_0x0026:
                                r10 = r9
                            L_0x0027:
                                r5 = r4
                                r6 = r11
                                r7 = r1
                                r8 = r2
                                r9 = r3
                                r5.<init>(r6, r7, r8, r9, r10)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.g02.c.a.C0236a.C0237a.C0238a.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, int, r62):void");
                        }

                        public final List<C0239a> a() {
                            return this.b;
                        }

                        public final String b() {
                            return this.c;
                        }

                        public final String c() {
                            return this.e;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C0238a)) {
                                return false;
                            }
                            C0238a aVar = (C0238a) obj;
                            return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e);
                        }

                        public int hashCode() {
                            String str = this.a;
                            int i = 0;
                            int hashCode = (str != null ? str.hashCode() : 0) * 31;
                            List<C0239a> list = this.b;
                            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                            String str2 = this.c;
                            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                            Boolean bool = this.d;
                            int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
                            String str3 = this.e;
                            if (str3 != null) {
                                i = str3.hashCode();
                            }
                            return hashCode4 + i;
                        }

                        public String toString() {
                            return "Media(description=" + this.a + ", episodes=" + this.b + ", id=" + this.c + ", isMature=" + this.d + ", title=" + this.e + ")";
                        }
                    }

                    public C0237a() {
                        this((List) null, 1, (r62) null);
                    }

                    public C0237a(List<C0238a> list) {
                        this.a = list;
                    }

                    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ C0237a(List list, int i, r62 r62) {
                        this((i & 1) != 0 ? f32.f() : list);
                    }

                    public final List<C0238a> a() {
                        return this.a;
                    }

                    public boolean equals(Object obj) {
                        if (this != obj) {
                            return (obj instanceof C0237a) && v62.a(this.a, ((C0237a) obj).a);
                        }
                        return true;
                    }

                    public int hashCode() {
                        List<C0238a> list = this.a;
                        if (list != null) {
                            return list.hashCode();
                        }
                        return 0;
                    }

                    public String toString() {
                        return "Ws(media=" + this.a + ")";
                    }
                }

                public C0236a() {
                    this((C0237a) null, 1, (r62) null);
                }

                public C0236a(C0237a aVar) {
                    this.a = aVar;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0236a(C0237a aVar, int i, r62 r62) {
                    this((i & 1) != 0 ? new C0237a((List) null, 1, (r62) null) : aVar);
                }

                public final C0237a a() {
                    return this.a;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof C0236a) && v62.a(this.a, ((C0236a) obj).a);
                    }
                    return true;
                }

                public int hashCode() {
                    C0237a aVar = this.a;
                    if (aVar != null) {
                        return aVar.hashCode();
                    }
                    return 0;
                }

                public String toString() {
                    return "Seasons(ws=" + this.a + ")";
                }
            }

            public a() {
                this((C0236a) null, 1, (r62) null);
            }

            public a(C0236a aVar) {
                this.a = aVar;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(C0236a aVar, int i, r62 r62) {
                this((i & 1) != 0 ? new C0236a((C0236a.C0237a) null, 1, (r62) null) : aVar);
            }

            public final C0236a a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && v62.a(this.a, ((a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                C0236a aVar = this.a;
                if (aVar != null) {
                    return aVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "Json(seasons=" + this.a + ")";
            }
        }

        public c() {
            this((a) null, 1, (r62) null);
        }

        public c(a aVar) {
            this.a = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(a aVar, int i, r62 r62) {
            this((i & 1) != 0 ? new a((a.C0236a) null, 1, (r62) null) : aVar);
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && v62.a(this.a, ((c) obj).a);
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
            return "WonderfulSubsEpisode(json=" + this.a + ")";
        }
    }

    /* renamed from: g02$d */
    public static final class d {
        @SerializedName("poster_tall")
        private final List<a> a;
        @SerializedName("posted_wide")
        private final List<a> b;
        @SerializedName("title")
        private final String c;
        @SerializedName("url")
        private final String d;
        @SerializedName("is_dubbed")
        private final Boolean e;

        /* renamed from: g02$d$a */
        public static final class a {
            @SerializedName("height")
            private final Integer a;
            @SerializedName("source")
            private final String b;
            @SerializedName("width")
            private final Integer c;

            public a() {
                this((Integer) null, (String) null, (Integer) null, 7, (r62) null);
            }

            public a(Integer num, String str, Integer num2) {
                this.a = num;
                this.b = str;
                this.c = num2;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(Integer num, String str, Integer num2, int i, r62 r62) {
                this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0 : num2);
            }

            public final Integer a() {
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
                return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
            }

            public int hashCode() {
                Integer num = this.a;
                int i = 0;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                Integer num2 = this.c;
                if (num2 != null) {
                    i = num2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                return "Poster(height=" + this.a + ", source=" + this.b + ", width=" + this.c + ")";
            }
        }

        public final List<a> a() {
            return this.b;
        }

        public final List<a> b() {
            return this.a;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }

        public final Boolean e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return v62.a(this.a, dVar.a) && v62.a(this.b, dVar.b) && v62.a(this.c, dVar.c) && v62.a(this.d, dVar.d) && v62.a(this.e, dVar.e);
        }

        public int hashCode() {
            List<a> list = this.a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<a> list2 = this.b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool = this.e;
            if (bool != null) {
                i = bool.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "WonderfulSubsSearchResultShow(postersTall=" + this.a + ", posterWide=" + this.b + ", title=" + this.c + ", url=" + this.d + ", isDubbed=" + this.e + ")";
        }
    }

    /* renamed from: g02$e */
    public static final class e {
        @SerializedName("json")
        private final f a;

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && v62.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WonderfulSubsSearchResults(json=" + this.a + ")";
        }
    }

    /* renamed from: g02$f */
    public static final class f {
        @SerializedName("series")
        private final List<d> a;

        public final List<d> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && v62.a(this.a, ((f) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<d> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WonderfulSubsSearchResultsRoot(series=" + this.a + ")";
        }
    }

    @dj2("v1/media/stream")
    ai2<db2> a(@pj2("code") String str);

    @dj2("v1/media/series")
    ai2<c> b(@pj2("series") String str);

    @dj2("v1/media/search")
    ai2<e> c(@pj2("q") String str);
}
