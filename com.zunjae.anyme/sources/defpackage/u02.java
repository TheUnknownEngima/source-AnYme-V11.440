package defpackage;

import io.github.inflationx.viewpump.b;
import io.github.inflationx.viewpump.c;
import io.github.inflationx.viewpump.d;
import java.util.List;

/* renamed from: u02  reason: default package */
public final class u02 implements d.a {
    private final List<d> a;
    private final int b;
    private final b c;

    public u02(List<? extends d> list, int i, b bVar) {
        v62.f(list, "interceptors");
        v62.f(bVar, "request");
        this.a = list;
        this.b = i;
        this.c = bVar;
    }

    public b i() {
        return this.c;
    }

    public c j(b bVar) {
        v62.f(bVar, "request");
        if (this.b < this.a.size()) {
            return this.a.get(this.b).intercept(new u02(this.a, this.b + 1, bVar));
        }
        throw new AssertionError("no interceptors added to the chain");
    }
}
