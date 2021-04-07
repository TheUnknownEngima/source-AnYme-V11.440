package com.zunjae.downloader;

public final class e {
    private final long a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private b f;

    public e(long j, String str, int i, long j2, long j3, b bVar) {
        v62.e(str, "title");
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = j3;
        this.f = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(long j, String str, int i, long j2, long j3, b bVar, int i2, r62 r62) {
        this(j, str, i, j2, j3, (i2 & 32) != 0 ? null : bVar);
    }

    public final b a() {
        return this.f;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return !e32.b(8).contains(Integer.valueOf(this.c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && v62.a(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && v62.a(this.f, eVar.f);
    }

    public final int f() {
        try {
            return (int) ((((float) this.e) / ((float) this.d)) * 100.0f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void g(b bVar) {
        this.f = bVar;
    }

    public final String h() {
        int i = this.c;
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? "Unknown" : "Failed" : "Downloaded" : "Paused" : "Downloading" : "Pending";
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.d;
        long j3 = this.e;
        int i3 = (((((((i + hashCode) * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        b bVar = this.f;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "FileDownload(id=" + this.a + ", title=" + this.b + ", status=" + this.c + ", bytesTotal=" + this.d + ", bytesDownloaded=" + this.e + ", animeEntry=" + this.f + ")";
    }
}
