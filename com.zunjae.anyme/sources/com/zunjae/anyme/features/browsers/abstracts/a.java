package com.zunjae.anyme.features.browsers.abstracts;

public final class a {
    private final String a;
    private final int b;
    private final String c;

    public a(String str, int i, String str2) {
        v62.e(str, "videoLink");
        v62.e(str2, "videoTitle");
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
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
        return v62.a(this.a, aVar.a) && this.b == aVar.b && v62.a(this.c, aVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VideoResolverBus(videoLink=" + this.a + ", episodeNumber=" + this.b + ", videoTitle=" + this.c + ")";
    }
}
