package com.zunjae.downloader;

import java.util.Map;

public abstract class i {

    public static final class a extends i {
        private final int a;
        private final String b;
        private final String c;
        private final int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, String str, String str2, int i2) {
            super((r62) null);
            v62.e(str, "seriesTitle");
            v62.e(str2, "videoURL");
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = i2;
        }

        public final int a() {
            return this.d;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && this.d == aVar.d;
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((hashCode + i2) * 31) + this.d;
        }

        public String toString() {
            return "AnimeVydiaStream(malId=" + this.a + ", seriesTitle=" + this.b + ", videoURL=" + this.c + ", episodeNumber=" + this.d + ")";
        }
    }

    public static final class b extends i {
        private final String a;
        private final String b;
        private final int c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i) {
            super((r62) null);
            v62.e(str, "url");
            v62.e(str2, "videoTitle");
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v62.a(this.a, bVar.a) && v62.a(this.b, bVar.b) && this.c == bVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + this.c;
        }

        public String toString() {
            return "Cast(url=" + this.a + ", videoTitle=" + this.b + ", episodeNumber=" + this.c + ")";
        }
    }

    public static final class c extends i {
        private final String a;
        private final String b;
        private final String c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3) {
            super((r62) null);
            v62.e(str, "filename");
            v62.e(str2, "url");
            v62.e(str3, "folder");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b) && v62.a(this.c, cVar.c);
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
            return "Download(filename=" + this.a + ", url=" + this.b + ", folder=" + this.c + ")";
        }
    }

    public static final class d extends i {
        private final int a;
        private final String b;
        private final int c;
        private final String d;
        private final Map<String, String> e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i, String str, int i2, String str2, Map<String, String> map) {
            super((r62) null);
            v62.e(str, "seriesTitle");
            v62.e(str2, "url");
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
            this.e = map;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(int i, String str, int i2, String str2, Map map, int i3, r62 r62) {
            this(i, str, i2, str2, (i3 & 16) != 0 ? null : map);
        }

        public final int a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && v62.a(this.b, dVar.b) && this.c == dVar.c && v62.a(this.d, dVar.d) && v62.a(this.e, dVar.e);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            int i2 = 0;
            int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Map<String, String> map = this.e;
            if (map != null) {
                i2 = map.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            return "DownloadAnime(malId=" + this.a + ", seriesTitle=" + this.b + ", episodeNumber=" + this.c + ", url=" + this.d + ", headers=" + this.e + ")";
        }
    }

    public static final class e extends i {
        private final String a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super((r62) null);
            v62.e(str, "title");
            v62.e(str2, "videoURL");
            this.a = str;
            this.b = str2;
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return v62.a(this.a, eVar.a) && v62.a(this.b, eVar.b);
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
            return "ExternalVideoPlayerStream(title=" + this.a + ", videoURL=" + this.b + ")";
        }
    }

    private i() {
    }

    public /* synthetic */ i(r62 r62) {
        this();
    }
}
