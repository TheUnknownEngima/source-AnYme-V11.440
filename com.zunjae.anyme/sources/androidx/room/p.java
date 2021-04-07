package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.i;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class p<T> extends LiveData<T> {
    final l k;
    final boolean l;
    final Callable<T> m;
    private final h n;
    final i.c o;
    final AtomicBoolean p = new AtomicBoolean(true);
    final AtomicBoolean q = new AtomicBoolean(false);
    final AtomicBoolean r = new AtomicBoolean(false);
    final Runnable s = new a();
    final Runnable t = new b();

    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.r
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x001b
                androidx.room.p r0 = androidx.room.p.this
                androidx.room.l r0 = r0.k
                androidx.room.i r0 = r0.k()
                androidx.room.p r3 = androidx.room.p.this
                androidx.room.i$c r3 = r3.o
                r0.b(r3)
            L_0x001b:
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.q
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x005c
                r0 = 0
                r3 = 0
            L_0x0027:
                androidx.room.p r4 = androidx.room.p.this     // Catch:{ all -> 0x0053 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.p     // Catch:{ all -> 0x0053 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0044
                androidx.room.p r0 = androidx.room.p.this     // Catch:{ Exception -> 0x003b }
                java.util.concurrent.Callable<T> r0 = r0.m     // Catch:{ Exception -> 0x003b }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x003b }
                r3 = 1
                goto L_0x0027
            L_0x003b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch:{ all -> 0x0053 }
                throw r2     // Catch:{ all -> 0x0053 }
            L_0x0044:
                if (r3 == 0) goto L_0x004b
                androidx.room.p r4 = androidx.room.p.this     // Catch:{ all -> 0x0053 }
                r4.k(r0)     // Catch:{ all -> 0x0053 }
            L_0x004b:
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.q
                r0.set(r1)
                goto L_0x005d
            L_0x0053:
                r0 = move-exception
                androidx.room.p r2 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.q
                r2.set(r1)
                throw r0
            L_0x005c:
                r3 = 0
            L_0x005d:
                if (r3 == 0) goto L_0x0069
                androidx.room.p r0 = androidx.room.p.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.p
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x001b
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.p.a.run():void");
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            boolean f = p.this.f();
            if (p.this.p.compareAndSet(false, true) && f) {
                p.this.o().execute(p.this.s);
            }
        }
    }

    class c extends i.c {
        c(String[] strArr) {
            super(strArr);
        }

        public void b(Set<String> set) {
            v.f().b(p.this.t);
        }
    }

    @SuppressLint({"RestrictedApi"})
    p(l lVar, h hVar, boolean z, Callable<T> callable, String[] strArr) {
        this.k = lVar;
        this.l = z;
        this.m = callable;
        this.n = hVar;
        this.o = new c(strArr);
    }

    /* access modifiers changed from: protected */
    public void i() {
        super.i();
        this.n.b(this);
        o().execute(this.s);
    }

    /* access modifiers changed from: protected */
    public void j() {
        super.j();
        this.n.c(this);
    }

    /* access modifiers changed from: package-private */
    public Executor o() {
        return this.l ? this.k.n() : this.k.m();
    }
}
