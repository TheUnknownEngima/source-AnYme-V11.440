package defpackage;

/* renamed from: ry1  reason: default package */
public final class ry1 {
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ry1() {
        this(0, 0, 0, 0, 0, 31, (r62) null);
    }

    public ry1(long j, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(long j, int i, int i2, int i3, int i4, int i5, r62 r62) {
        this((i5 & 1) != 0 ? 0 : j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1 = (ry1) obj;
        return this.a == ry1.a && this.b == ry1.b && this.c == ry1.c && this.d == ry1.d && this.e == ry1.e;
    }

    public int hashCode() {
        long j = this.a;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return "AnimeProgression(animeId=" + this.a + ", episodesWatched=" + this.b + ", seriesEpisodes=" + this.c + ", myScore=" + this.d + ", myStatus=" + this.e + ")";
    }
}
