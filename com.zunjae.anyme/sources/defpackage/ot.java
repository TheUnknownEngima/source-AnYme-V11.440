package defpackage;

import defpackage.tt;
import defpackage.y40;

/* renamed from: ot  reason: default package */
public final class ot implements tt {
    private final y40 a;
    private final long b;

    public ot(y40 y40, long j) {
        this.a = y40;
        this.b = j;
    }

    private ut a(long j, long j2) {
        return new ut((j * 1000000) / ((long) this.a.e), this.b + j2);
    }

    public boolean e() {
        return true;
    }

    public tt.a i(long j) {
        q40.e(this.a.k);
        y40 y40 = this.a;
        y40.a aVar = y40.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int f = v50.f(jArr, y40.k(j), true, false);
        long j2 = 0;
        long j3 = f == -1 ? 0 : jArr[f];
        if (f != -1) {
            j2 = jArr2[f];
        }
        ut a2 = a(j3, j2);
        if (a2.a == j || f == jArr.length - 1) {
            return new tt.a(a2);
        }
        int i = f + 1;
        return new tt.a(a2, a(jArr[i], jArr2[i]));
    }

    public long j() {
        return this.a.h();
    }
}
