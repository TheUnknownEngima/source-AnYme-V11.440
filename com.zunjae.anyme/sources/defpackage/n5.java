package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: n5  reason: default package */
class n5 {
    public static final ThreadLocal<n5> g = new ThreadLocal<>();
    private final h0<b, Long> a = new h0<>();
    final ArrayList<b> b = new ArrayList<>();
    private final a c = new a();
    private c d;
    long e = 0;
    private boolean f = false;

    /* renamed from: n5$a */
    class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            n5.this.e = SystemClock.uptimeMillis();
            n5 n5Var = n5.this;
            n5Var.c(n5Var.e);
            if (n5.this.b.size() > 0) {
                n5.this.e().a();
            }
        }
    }

    /* renamed from: n5$b */
    interface b {
        boolean a(long j);
    }

    /* renamed from: n5$c */
    static abstract class c {
        final a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    /* renamed from: n5$d */
    private static class d extends c {
        private final Runnable b = new a();
        private final Handler c = new Handler(Looper.myLooper());
        long d = -1;

        /* renamed from: n5$d$a */
        class a implements Runnable {
            a() {
            }

            public void run() {
                d.this.d = SystemClock.uptimeMillis();
                d.this.a.a();
            }
        }

        d(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.c.postDelayed(this.b, Math.max(10 - (SystemClock.uptimeMillis() - this.d), 0));
        }
    }

    /* renamed from: n5$e */
    private static class e extends c {
        private final Choreographer b = Choreographer.getInstance();
        private final Choreographer.FrameCallback c = new a();

        /* renamed from: n5$e$a */
        class a implements Choreographer.FrameCallback {
            a() {
            }

            public void doFrame(long j) {
                e.this.a.a();
            }
        }

        e(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    n5() {
    }

    private void b() {
        if (this.f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public static n5 d() {
        if (g.get() == null) {
            g.set(new n5());
        }
        return g.get();
    }

    private boolean f(b bVar, long j) {
        Long l = this.a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j);
            }
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public c e() {
        if (this.d == null) {
            this.d = Build.VERSION.SDK_INT >= 16 ? new e(this.c) : new d(this.c);
        }
        return this.d;
    }

    public void g(b bVar) {
        this.a.remove(bVar);
        int indexOf = this.b.indexOf(bVar);
        if (indexOf >= 0) {
            this.b.set(indexOf, (Object) null);
            this.f = true;
        }
    }
}
