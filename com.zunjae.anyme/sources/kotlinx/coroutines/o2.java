package kotlinx.coroutines;

import kotlinx.coroutines.internal.r;

final class o2<T> extends r<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o2(n42 n42, k42<? super T> k42) {
        super(n42, k42);
        v62.f(n42, "context");
        v62.f(k42, "uCont");
    }

    public int p0() {
        return 3;
    }
}
