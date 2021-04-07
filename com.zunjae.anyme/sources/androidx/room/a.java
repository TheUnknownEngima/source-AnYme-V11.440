package androidx.room;

import java.util.concurrent.Callable;
import kotlinx.coroutines.d;
import kotlinx.coroutines.f0;

public final class a {
    public static final C0051a a = new C0051a((r62) null);

    /* renamed from: androidx.room.a$a  reason: collision with other inner class name */
    public static final class C0051a {

        @y42(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.room.a$a$a  reason: collision with other inner class name */
        static final class C0052a extends d52 implements d62<f0, k42<? super R>, Object> {
            private f0 i;
            int j;
            final /* synthetic */ Callable k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0052a(Callable callable, k42 k42) {
                super(2, k42);
                this.k = callable;
            }

            public final Object G(Object obj, Object obj2) {
                return ((C0052a) a(obj, (k42) obj2)).k(u22.a);
            }

            public final k42<u22> a(Object obj, k42<?> k42) {
                v62.f(k42, "completion");
                C0052a aVar = new C0052a(this.k, k42);
                aVar.i = (f0) obj;
                return aVar;
            }

            public final Object k(Object obj) {
                q42.d();
                if (this.j == 0) {
                    n22.b(obj);
                    return this.k.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private C0051a() {
        }

        public /* synthetic */ C0051a(r62 r62) {
            this();
        }

        public final <R> Object a(l lVar, boolean z, Callable<R> callable, k42<? super R> k42) {
            l42 l42;
            if (lVar.s() && lVar.o()) {
                return callable.call();
            }
            t tVar = (t) k42.e().get(t.f);
            if (tVar == null || (l42 = tVar.c()) == null) {
                l42 = z ? b.b(lVar) : b.a(lVar);
            }
            return d.c(l42, new C0052a(callable, (k42) null), k42);
        }
    }

    public static final <R> Object a(l lVar, boolean z, Callable<R> callable, k42<? super R> k42) {
        return a.a(lVar, z, callable, k42);
    }
}
