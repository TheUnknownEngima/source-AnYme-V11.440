package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.o1;

final class LifecycleController$observer$1 implements l {
    final /* synthetic */ i e;
    final /* synthetic */ o1 f;

    public final void c(n nVar, h.a aVar) {
        v62.f(nVar, "source");
        v62.f(aVar, "<anonymous parameter 1>");
        h a = nVar.a();
        v62.b(a, "source.lifecycle");
        if (a.b() != h.b.DESTROYED) {
            h a2 = nVar.a();
            v62.b(a2, "source.lifecycle");
            if (a2.b().compareTo(this.e.a) < 0) {
                this.e.b.a();
                throw null;
            } else {
                this.e.b.b();
                throw null;
            }
        } else {
            i iVar = this.e;
            o1.a.b(this.f, (CancellationException) null, 1, (Object) null);
            iVar.c();
            throw null;
        }
    }
}
