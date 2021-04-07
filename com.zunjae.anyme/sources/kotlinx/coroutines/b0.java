package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;

public final class b0 {
    private static final List<CoroutineExceptionHandler> a;

    static {
        Iterator a2 = a.a();
        v62.b(a2, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        a = m82.j(k82.a(a2));
    }

    public static final void a(n42 n42, Throwable th) {
        v62.f(n42, "context");
        v62.f(th, "exception");
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(n42, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                v62.b(currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, c0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        v62.b(currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
