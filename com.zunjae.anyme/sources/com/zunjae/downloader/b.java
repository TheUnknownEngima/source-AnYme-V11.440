package com.zunjae.downloader;

public final class b {
    private long a;
    private int b;
    private String c;
    private int d;
    private sy1 e;

    public b(long j, int i, String str, int i2, sy1 sy1) {
        v62.e(str, "seriesTitle");
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = sy1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(long j, int i, String str, int i2, sy1 sy1, int i3, r62 r62) {
        this(j, i, str, i2, (i3 & 16) != 0 ? null : sy1);
    }

    public final sy1 a() {
        return this.e;
    }

    public final int b() {
        return this.d;
    }

    public final long c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && v62.a(this.c, bVar.c) && this.d == bVar.d && v62.a(this.e, bVar.e);
    }

    public int hashCode() {
        long j = this.a;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31;
        String str = this.c;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.d) * 31;
        sy1 sy1 = this.e;
        if (sy1 != null) {
            i2 = sy1.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "AnimeDownloadEntry(fileDownloadId=" + this.a + ", malid=" + this.b + ", seriesTitle=" + this.c + ", episodeNumber=" + this.d + ", animeR3=" + this.e + ")";
    }
}
