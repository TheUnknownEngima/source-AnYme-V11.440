package kotlinx.coroutines;

public enum i0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final <R, T> void invoke(d62<? super R, ? super k42<? super T>, ? extends Object> d62, R r, k42<? super T> k42) {
        v62.f(d62, "block");
        v62.f(k42, "completion");
        int i = h0.b[ordinal()];
        if (i == 1) {
            j92.b(d62, r, k42);
        } else if (i == 2) {
            m42.b(d62, r, k42);
        } else if (i == 3) {
            k92.b(d62, r, k42);
        } else if (i != 4) {
            throw new j22();
        }
    }

    public final <T> void invoke(z52<? super k42<? super T>, ? extends Object> z52, k42<? super T> k42) {
        v62.f(z52, "block");
        v62.f(k42, "completion");
        int i = h0.a[ordinal()];
        if (i == 1) {
            j92.a(z52, k42);
        } else if (i == 2) {
            m42.a(z52, k42);
        } else if (i == 3) {
            k92.a(z52, k42);
        } else if (i != 4) {
            throw new j22();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
