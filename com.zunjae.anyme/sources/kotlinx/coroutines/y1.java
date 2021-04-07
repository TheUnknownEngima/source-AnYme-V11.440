package kotlinx.coroutines;

final class y1 extends g2 {
    private d62<? super f0, ? super k42<? super u22>, ? extends Object> h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y1(n42 n42, d62<? super f0, ? super k42<? super u22>, ? extends Object> d62) {
        super(n42, false);
        v62.f(n42, "parentContext");
        v62.f(d62, "block");
        this.h = d62;
    }

    /* access modifiers changed from: protected */
    public void t0() {
        d62<? super f0, ? super k42<? super u22>, ? extends Object> d62 = this.h;
        if (d62 != null) {
            this.h = null;
            j92.b(d62, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }
}
