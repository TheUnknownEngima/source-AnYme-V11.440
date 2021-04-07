package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c<T> {
    final Executor a;
    final LiveData<T> b;
    final AtomicBoolean c = new AtomicBoolean(true);
    final AtomicBoolean d = new AtomicBoolean(false);
    final Runnable e = new b();
    final Runnable f = new C0027c();

    class a extends LiveData<T> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void i() {
            c cVar = c.this;
            cVar.a.execute(cVar.e);
        }
    }

    class b implements Runnable {
        b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                androidx.lifecycle.c r0 = androidx.lifecycle.c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x003b
                r0 = 0
                r3 = 0
            L_0x000e:
                androidx.lifecycle.c r4 = androidx.lifecycle.c.this     // Catch:{ all -> 0x0032 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.c     // Catch:{ all -> 0x0032 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0032 }
                if (r4 == 0) goto L_0x0020
                androidx.lifecycle.c r0 = androidx.lifecycle.c.this     // Catch:{ all -> 0x0032 }
                java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0032 }
                r3 = 1
                goto L_0x000e
            L_0x0020:
                if (r3 == 0) goto L_0x0029
                androidx.lifecycle.c r2 = androidx.lifecycle.c.this     // Catch:{ all -> 0x0032 }
                androidx.lifecycle.LiveData<T> r2 = r2.b     // Catch:{ all -> 0x0032 }
                r2.k(r0)     // Catch:{ all -> 0x0032 }
            L_0x0029:
                androidx.lifecycle.c r0 = androidx.lifecycle.c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
                r0.set(r1)
                r1 = r3
                goto L_0x003b
            L_0x0032:
                r0 = move-exception
                androidx.lifecycle.c r2 = androidx.lifecycle.c.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.d
                r2.set(r1)
                throw r0
            L_0x003b:
                if (r1 == 0) goto L_0x0047
                androidx.lifecycle.c r0 = androidx.lifecycle.c.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.c
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0000
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.c.b.run():void");
        }
    }

    /* renamed from: androidx.lifecycle.c$c  reason: collision with other inner class name */
    class C0027c implements Runnable {
        C0027c() {
        }

        public void run() {
            boolean f = c.this.b.f();
            if (c.this.c.compareAndSet(false, true) && f) {
                c cVar = c.this;
                cVar.a.execute(cVar.e);
            }
        }
    }

    public c(Executor executor) {
        this.a = executor;
        this.b = new a();
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    public LiveData<T> b() {
        return this.b;
    }

    public void c() {
        v.f().b(this.f);
    }
}
