package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.concurrent.CancellationException;

public final class LifecycleCoroutineScopeImpl extends j implements l {
    private final h e;
    private final n42 f;

    public void c(n nVar, h.a aVar) {
        v62.f(nVar, "source");
        v62.f(aVar, "event");
        if (h().b().compareTo(h.b.DESTROYED) <= 0) {
            h().c(this);
            u1.f(i(), (CancellationException) null, 1, (Object) null);
        }
    }

    public h h() {
        return this.e;
    }

    public n42 i() {
        return this.f;
    }
}
