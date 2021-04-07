package kotlinx.coroutines;

public final class c0 {
    public static final void a(n42 n42, Throwable th) {
        v62.f(n42, "context");
        v62.f(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) n42.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(n42, th);
            } else {
                b0.a(n42, th);
            }
        } catch (Throwable th2) {
            b0.a(n42, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        v62.f(th, "originalException");
        v62.f(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        z12.a(runtimeException, th);
        return runtimeException;
    }
}
