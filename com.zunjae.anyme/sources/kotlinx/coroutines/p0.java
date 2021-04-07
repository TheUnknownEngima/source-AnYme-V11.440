package kotlinx.coroutines;

import defpackage.n42;

public final class p0 {
    public static final Object a(long j, k42<? super u22> k42) {
        if (j <= 0) {
            return u22.a;
        }
        j jVar = new j(r42.c(k42), 1);
        b(jVar.e()).k(j, jVar);
        Object s = jVar.s();
        if (s == s42.d()) {
            a52.c(k42);
        }
        return s;
    }

    public static final o0 b(n42 n42) {
        v62.f(n42, "$this$delay");
        n42.b bVar = n42.get(l42.b);
        if (!(bVar instanceof o0)) {
            bVar = null;
        }
        o0 o0Var = (o0) bVar;
        return o0Var != null ? o0Var : n0.a();
    }
}
