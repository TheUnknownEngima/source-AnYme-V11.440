package defpackage;

/* renamed from: ov  reason: default package */
final class ov {
    public final lv a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public ov(lv lvVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        q40.a(iArr.length == jArr2.length);
        q40.a(jArr.length == jArr2.length);
        q40.a(iArr2.length == jArr2.length ? true : z);
        this.a = lvVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int f2 = v50.f(this.f, j, true, false); f2 >= 0; f2--) {
            if ((this.g[f2] & 1) != 0) {
                return f2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int d2 = v50.d(this.f, j, true, false); d2 < this.f.length; d2++) {
            if ((this.g[d2] & 1) != 0) {
                return d2;
            }
        }
        return -1;
    }
}
