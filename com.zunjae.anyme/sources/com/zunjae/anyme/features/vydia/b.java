package com.zunjae.anyme.features.vydia;

public final class b {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;

    public b(int i, String str, String str2, String str3, Integer num) {
        v62.e(str, "seriesTitle");
        v62.e(str3, "videoLink");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public final Integer a() {
        return this.e;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && v62.a(this.b, bVar.b) && v62.a(this.c, bVar.c) && v62.a(this.d, bVar.d) && v62.a(this.e, bVar.e);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "AnimeVydiaParameter(malId=" + this.a + ", seriesTitle=" + this.b + ", subtitle=" + this.c + ", videoLink=" + this.d + ", episodeNumber=" + this.e + ")";
    }
}
