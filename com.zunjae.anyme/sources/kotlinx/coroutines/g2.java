package kotlinx.coroutines;

class g2 extends a<u22> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2(n42 n42, boolean z) {
        super(n42, z);
        v62.f(n42, "parentContext");
    }

    /* access modifiers changed from: protected */
    public boolean I(Throwable th) {
        v62.f(th, "exception");
        c0.a(e(), th);
        return true;
    }
}
