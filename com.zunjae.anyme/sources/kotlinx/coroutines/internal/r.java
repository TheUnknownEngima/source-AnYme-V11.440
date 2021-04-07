package kotlinx.coroutines.internal;

import kotlinx.coroutines.a;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.s;

public class r<T> extends a<T> implements x42 {
    public final k42<T> h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(n42 n42, k42<? super T> k42) {
        super(n42, true);
        v62.f(n42, "context");
        v62.f(k42, "uCont");
        this.h = k42;
    }

    /* access modifiers changed from: protected */
    public final boolean Q() {
        return true;
    }

    public final x42 c() {
        return (x42) this.h;
    }

    public final StackTraceElement g() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void n(Object obj, int i) {
        if (obj instanceof s) {
            Throwable th = ((s) obj).a;
            if (i != 4) {
                th = t.j(th, this.h);
            }
            e2.e(this.h, th, i);
            return;
        }
        e2.d(this.h, obj, i);
    }

    public int p0() {
        return 2;
    }
}
