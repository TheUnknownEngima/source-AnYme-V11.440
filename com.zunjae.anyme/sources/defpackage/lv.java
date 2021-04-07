package defpackage;

import com.google.android.exoplayer2.f0;

/* renamed from: lv  reason: default package */
public final class lv {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final f0 f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    private final mv[] k;

    public lv(int i2, int i3, long j2, long j3, long j4, f0 f0Var, int i4, mv[] mvVarArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = f0Var;
        this.g = i4;
        this.k = mvVarArr;
        this.j = i5;
        this.h = jArr;
        this.i = jArr2;
    }

    public mv a(int i2) {
        mv[] mvVarArr = this.k;
        if (mvVarArr == null) {
            return null;
        }
        return mvVarArr[i2];
    }
}
