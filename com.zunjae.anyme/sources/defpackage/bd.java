package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bd  reason: default package */
public class bd {
    private final ThreadPoolExecutor a;
    private final int b;
    private final int c;
    private boolean d = true;
    private int e;
    private final c f;
    private final b g;

    /* renamed from: bd$b */
    private static class b {
        /* access modifiers changed from: private */
        public float a;
        /* access modifiers changed from: private */
        public final Handler b;
        /* access modifiers changed from: private */
        public final Runnable c;
        private boolean d;

        /* renamed from: bd$b$a */
        class a implements Runnable {
            a() {
            }

            public void run() {
                long maxMemory = Runtime.getRuntime().maxMemory();
                float unused = b.this.a = (1.0f - (((float) Runtime.getRuntime().totalMemory()) / ((float) maxMemory))) * 100.0f;
                b.this.b.postDelayed(b.this.c, TimeUnit.SECONDS.toMillis(1));
            }
        }

        private b() {
            this.a = 100.0f;
            this.b = new Handler();
            this.c = new a();
            this.d = false;
        }

        /* access modifiers changed from: package-private */
        public float a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (!this.d) {
                this.d = true;
                this.c.run();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            if (this.d) {
                this.b.removeCallbacksAndMessages((Object) null);
                this.d = false;
            }
        }
    }

    /* renamed from: bd$c */
    public interface c {
        void a(ThreadPoolExecutor threadPoolExecutor, boolean z);
    }

    public bd(ThreadPoolExecutor threadPoolExecutor, int i, int i2, c cVar) {
        this.a = threadPoolExecutor;
        this.b = i;
        this.c = i2;
        this.f = cVar;
        this.g = new b();
    }

    private float c() {
        this.g.e();
        return this.g.a();
    }

    private void d() {
        ThreadPoolExecutor threadPoolExecutor;
        c cVar;
        int size = this.a.getQueue().size();
        boolean z = true;
        if (this.d && size >= this.b && c() < ((float) this.c)) {
            this.e = size;
            this.d = false;
            cVar = this.f;
            if (cVar != null) {
                threadPoolExecutor = this.a;
            } else {
                return;
            }
        } else if (!this.d && size < this.e / 2) {
            this.d = true;
            this.g.f();
            cVar = this.f;
            if (cVar != null) {
                threadPoolExecutor = this.a;
                z = true ^ this.d;
            } else {
                return;
            }
        } else {
            return;
        }
        cVar.a(threadPoolExecutor, z);
    }

    public synchronized <T> Future<T> a(Callable<T> callable) {
        d();
        if (!this.d) {
            return null;
        }
        return this.a.submit(callable);
    }

    public void b() {
        ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
