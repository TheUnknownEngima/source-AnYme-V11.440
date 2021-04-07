package kotlinx.coroutines;

import defpackage.n42;

public interface CoroutineExceptionHandler extends n42.b {
    public static final a c = a.a;

    public static final class a implements n42.c<CoroutineExceptionHandler> {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    void handleException(n42 n42, Throwable th);
}
