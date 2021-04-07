package defpackage;

import com.google.android.exoplayer2.m0;

/* renamed from: iu  reason: default package */
abstract class iu {
    protected final vt a;

    /* renamed from: iu$a */
    public static final class a extends m0 {
        public a(String str) {
            super(str);
        }
    }

    protected iu(vt vtVar) {
        this.a = vtVar;
    }

    public final boolean a(i50 i50, long j) {
        return b(i50) && c(i50, j);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(i50 i50);

    /* access modifiers changed from: protected */
    public abstract boolean c(i50 i50, long j);
}
