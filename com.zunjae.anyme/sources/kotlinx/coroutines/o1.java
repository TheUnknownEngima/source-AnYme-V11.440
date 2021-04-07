package kotlinx.coroutines;

import defpackage.n42;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

public interface o1 extends n42.b {
    public static final b d = b.a;

    public static final class a {
        public static /* synthetic */ void b(o1 o1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                o1Var.K(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R c(o1 o1Var, R r, d62<? super R, ? super n42.b, ? extends R> d62) {
            v62.f(d62, "operation");
            return n42.b.a.a(o1Var, r, d62);
        }

        public static <E extends n42.b> E d(o1 o1Var, n42.c<E> cVar) {
            v62.f(cVar, "key");
            return n42.b.a.b(o1Var, cVar);
        }

        public static /* synthetic */ w0 e(o1 o1Var, boolean z, boolean z2, z52 z52, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return o1Var.z(z, z2, z52);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static n42 f(o1 o1Var, n42.c<?> cVar) {
            v62.f(cVar, "key");
            return n42.b.a.c(o1Var, cVar);
        }

        public static n42 g(o1 o1Var, n42 n42) {
            v62.f(n42, "context");
            return n42.b.a.d(o1Var, n42);
        }
    }

    public static final class b implements n42.c<o1> {
        static final /* synthetic */ b a = new b();

        static {
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.c;
        }

        private b() {
        }
    }

    CancellationException A();

    void K(CancellationException cancellationException);

    n M(p pVar);

    boolean b();

    /* synthetic */ void cancel();

    boolean start();

    w0 z(boolean z, boolean z2, z52<? super Throwable, u22> z52);
}
