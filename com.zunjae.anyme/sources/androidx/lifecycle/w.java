package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.x;

public class w implements n {
    private static final w m = new w();
    private int e = 0;
    private int f = 0;
    private boolean g = true;
    private boolean h = true;
    private Handler i;
    private final o j = new o(this);
    private Runnable k = new a();
    x.a l = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            w.this.h();
            w.this.i();
        }
    }

    class b implements x.a {
        b() {
        }

        public void m() {
        }

        public void n() {
            w.this.e();
        }

        public void o() {
            w.this.d();
        }
    }

    class c extends e {

        class a extends e {
            a() {
            }

            public void onActivityPostResumed(Activity activity) {
                w.this.d();
            }

            public void onActivityPostStarted(Activity activity) {
                w.this.e();
            }
        }

        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                x.f(activity).h(w.this.l);
            }
        }

        public void onActivityPaused(Activity activity) {
            w.this.b();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityStopped(Activity activity) {
            w.this.f();
        }
    }

    private w() {
    }

    static void k(Context context) {
        m.g(context);
    }

    public h a() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2 = this.f - 1;
        this.f = i2;
        if (i2 == 0) {
            this.i.postDelayed(this.k, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i2 = this.f + 1;
        this.f = i2;
        if (i2 != 1) {
            return;
        }
        if (this.g) {
            this.j.i(h.a.ON_RESUME);
            this.g = false;
            return;
        }
        this.i.removeCallbacks(this.k);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 == 1 && this.h) {
            this.j.i(h.a.ON_START);
            this.h = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.e--;
        i();
    }

    /* access modifiers changed from: package-private */
    public void g(Context context) {
        this.i = new Handler();
        this.j.i(h.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (this.f == 0) {
            this.g = true;
            this.j.i(h.a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.e == 0 && this.g) {
            this.j.i(h.a.ON_STOP);
            this.h = true;
        }
    }
}
