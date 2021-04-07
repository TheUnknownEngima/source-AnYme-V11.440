package kotlinx.coroutines;

import defpackage.n42;

public interface j2<S> extends n42.b {

    public static final class a {
        public static <S, R> R a(j2<S> j2Var, R r, d62<? super R, ? super n42.b, ? extends R> d62) {
            v62.f(d62, "operation");
            return n42.b.a.a(j2Var, r, d62);
        }

        public static <S, E extends n42.b> E b(j2<S> j2Var, n42.c<E> cVar) {
            v62.f(cVar, "key");
            return n42.b.a.b(j2Var, cVar);
        }

        public static <S> n42 c(j2<S> j2Var, n42.c<?> cVar) {
            v62.f(cVar, "key");
            return n42.b.a.c(j2Var, cVar);
        }

        public static <S> n42 d(j2<S> j2Var, n42 n42) {
            v62.f(n42, "context");
            return n42.b.a.d(j2Var, n42);
        }
    }

    void F(n42 n42, S s);

    S L(n42 n42);
}
