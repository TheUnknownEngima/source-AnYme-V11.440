package kotlinx.coroutines;

import java.util.concurrent.Future;

final class f extends g {
    private final Future<?> e;

    public f(Future<?> future) {
        v62.f(future, "future");
        this.e = future;
    }

    public void a(Throwable th) {
        this.e.cancel(false);
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        a((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.e + ']';
    }
}
