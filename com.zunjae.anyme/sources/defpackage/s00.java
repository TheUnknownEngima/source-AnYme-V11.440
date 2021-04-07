package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;

/* renamed from: s00  reason: default package */
public abstract class s00 extends d10 {
    public final long j;
    public final long k;
    private u00 l;
    private int[] m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s00(i iVar, l lVar, f0 f0Var, int i, Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(iVar, lVar, f0Var, i, obj, j2, j3, j6);
        this.j = j4;
        this.k = j5;
    }

    public final int i(int i) {
        return this.m[i];
    }

    /* access modifiers changed from: protected */
    public final u00 j() {
        return this.l;
    }

    public void k(u00 u00) {
        this.l = u00;
        this.m = u00.b();
    }
}
