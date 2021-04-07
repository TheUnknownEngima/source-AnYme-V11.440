package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: x40  reason: default package */
public final class x40<T> {
    private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<>();

    /* renamed from: x40$a */
    public interface a<T> {
        void a(T t);
    }

    /* renamed from: x40$b */
    private static final class b<T> {
        private final Handler a;
        /* access modifiers changed from: private */
        public final T b;
        private boolean c;

        public b(Handler handler, T t) {
            this.a = handler;
            this.b = t;
        }

        public void b(a<T> aVar) {
            this.a.post(new m40(this, aVar));
        }

        public /* synthetic */ void c(a aVar) {
            if (!this.c) {
                aVar.a(this.b);
            }
        }

        public void d() {
            this.c = true;
        }
    }

    public void a(Handler handler, T t) {
        q40.a((handler == null || t == null) ? false : true);
        c(t);
        this.a.add(new b(handler, t));
    }

    public void b(a<T> aVar) {
        Iterator<b<T>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
    }

    public void c(T t) {
        Iterator<b<T>> it = this.a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.b == t) {
                next.d();
                this.a.remove(next);
            }
        }
    }
}
