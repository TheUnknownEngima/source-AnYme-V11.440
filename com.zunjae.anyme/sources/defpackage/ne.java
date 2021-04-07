package defpackage;

import android.os.Process;
import com.bumptech.glide.load.g;
import defpackage.cf;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ne  reason: default package */
final class ne {
    private final boolean a;
    final Map<g, d> b;
    private final ReferenceQueue<cf<?>> c;
    private cf.a d;
    private volatile boolean e;
    private volatile c f;

    /* renamed from: ne$a */
    class a implements ThreadFactory {

        /* renamed from: ne$a$a  reason: collision with other inner class name */
        class C0132a implements Runnable {
            final /* synthetic */ Runnable e;

            C0132a(a aVar, Runnable runnable) {
                this.e = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.e.run();
            }
        }

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0132a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: ne$b */
    class b implements Runnable {
        b() {
        }

        public void run() {
            ne.this.b();
        }
    }

    /* renamed from: ne$c */
    interface c {
        void a();
    }

    /* renamed from: ne$d */
    static final class d extends WeakReference<cf<?>> {
        final g a;
        final boolean b;
        Cif<?> c;

        d(g gVar, cf<?> cfVar, ReferenceQueue<? super cf<?>> referenceQueue, boolean z) {
            super(cfVar, referenceQueue);
            Cif<?> ifVar;
            jm.d(gVar);
            this.a = gVar;
            if (!cfVar.f() || !z) {
                ifVar = null;
            } else {
                Cif<?> e = cfVar.e();
                jm.d(e);
                ifVar = e;
            }
            this.c = ifVar;
            this.b = cfVar.f();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.c = null;
            clear();
        }
    }

    ne(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    ne(boolean z, Executor executor) {
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = z;
        executor.execute(new b());
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(g gVar, cf<?> cfVar) {
        d put = this.b.put(gVar, new d(gVar, cfVar, this.c, this.a));
        if (put != null) {
            put.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        while (!this.e) {
            try {
                c((d) this.c.remove());
                c cVar = this.f;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(d dVar) {
        synchronized (this) {
            this.b.remove(dVar.a);
            if (dVar.b) {
                if (dVar.c != null) {
                    this.d.d(dVar.a, new cf(dVar.c, true, false, dVar.a, this.d));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(g gVar) {
        d remove = this.b.remove(gVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.cf<?> e(com.bumptech.glide.load.g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, ne$d> r0 = r1.b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            ne$d r2 = (defpackage.ne.d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            cf r0 = (defpackage.cf) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne.e(com.bumptech.glide.load.g):cf");
    }

    /* access modifiers changed from: package-private */
    public void f(cf.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.d = aVar;
            }
        }
    }
}
