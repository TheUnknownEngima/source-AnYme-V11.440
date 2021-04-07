package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;

/* renamed from: d10  reason: default package */
public abstract class d10 extends v00 {
    public final long i;

    public d10(i iVar, l lVar, f0 f0Var, int i2, Object obj, long j, long j2, long j3) {
        super(iVar, lVar, 1, f0Var, i2, obj, j, j2);
        q40.e(f0Var);
        this.i = j3;
    }

    public long g() {
        long j = this.i;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    public abstract boolean h();
}
