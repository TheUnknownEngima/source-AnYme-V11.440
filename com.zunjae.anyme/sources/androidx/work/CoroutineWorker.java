package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import defpackage.m22;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.o1;
import kotlinx.coroutines.v0;

public abstract class CoroutineWorker extends ListenableWorker {
    private final o1 h = u1.d((o1) null, 1, (Object) null);
    private final r8<ListenableWorker.a> i;
    private final a0 j;

    static final class a implements Runnable {
        final /* synthetic */ CoroutineWorker e;

        a(CoroutineWorker coroutineWorker) {
            this.e = coroutineWorker;
        }

        public final void run() {
            if (this.e.q().isCancelled()) {
                this.e.r().cancel();
            }
        }
    }

    @y42(c = "androidx/work/CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {64, 67}, m = "invokeSuspend")
    static final class b extends d52 implements d62<f0, k42<? super u22>, Object> {
        private f0 i;
        int j;
        final /* synthetic */ CoroutineWorker k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CoroutineWorker coroutineWorker, k42 k42) {
            super(2, k42);
            this.k = coroutineWorker;
        }

        public final Object G(Object obj, Object obj2) {
            return ((b) a(obj, (k42) obj2)).k(u22.a);
        }

        public final k42<u22> a(Object obj, k42<?> k42) {
            v62.f(k42, "completion");
            b bVar = new b(this.k, k42);
            bVar.i = (f0) obj;
            return bVar;
        }

        public final Object k(Object obj) {
            Object d = s42.d();
            int i2 = this.j;
            if (i2 != 0) {
                if (i2 == 1) {
                    try {
                        if (obj instanceof m22.b) {
                            throw ((m22.b) obj).e;
                        }
                    } catch (Throwable th) {
                        this.k.q().q(th);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else if (!(obj instanceof m22.b)) {
                CoroutineWorker coroutineWorker = this.k;
                this.j = 1;
                obj = coroutineWorker.o(this);
                if (obj == d) {
                    return d;
                }
            } else {
                throw ((m22.b) obj).e;
            }
            this.k.q().p((ListenableWorker.a) obj);
            return u22.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.f(context, "appContext");
        v62.f(workerParameters, "params");
        r8<ListenableWorker.a> t = r8.t();
        v62.b(t, "SettableFuture.create()");
        this.i = t;
        a aVar = new a(this);
        s8 g = g();
        v62.b(g, "taskExecutor");
        t.a(aVar, g.d());
        this.j = v0.a();
    }

    public final void j() {
        super.j();
        this.i.cancel(false);
    }

    public final db1<ListenableWorker.a> l() {
        o1 unused = e.b(g0.a(p().plus(this.h)), (n42) null, (i0) null, new b(this, (k42) null), 3, (Object) null);
        return this.i;
    }

    public abstract Object o(k42<? super ListenableWorker.a> k42);

    public a0 p() {
        return this.j;
    }

    public final r8<ListenableWorker.a> q() {
        return this.i;
    }

    public final o1 r() {
        return this.h;
    }
}
