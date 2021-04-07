package defpackage;

import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.v;
import defpackage.tt;

/* renamed from: uu  reason: default package */
final class uu implements wu {
    private final long[] a;
    private final long[] b;
    private final long c;

    private uu(long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = v.a(jArr2[jArr2.length - 1]);
    }

    public static uu a(long j, xy xyVar) {
        int length = xyVar.i.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (xyVar.g + xyVar.i[i3]);
            j2 += (long) (xyVar.h + xyVar.j[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new uu(jArr, jArr2);
    }

    private static Pair<Long, Long> d(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int f = v50.f(jArr, j, true, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? Utils.DOUBLE_EPSILON : (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public long b(long j) {
        return v.a(((Long) d(j, this.a, this.b).second).longValue());
    }

    public long c() {
        return -1;
    }

    public boolean e() {
        return true;
    }

    public tt.a i(long j) {
        Pair<Long, Long> d = d(v.b(v50.p(j, 0, this.c)), this.b, this.a);
        return new tt.a(new ut(v.a(((Long) d.first).longValue()), ((Long) d.second).longValue()));
    }

    public long j() {
        return this.c;
    }
}
