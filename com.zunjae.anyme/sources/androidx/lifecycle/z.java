package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.h;

public class z {
    private final o a;
    private final Handler b = new Handler();
    private a c;

    static class a implements Runnable {
        private final o e;
        final h.a f;
        private boolean g = false;

        a(o oVar, h.a aVar) {
            this.e = oVar;
            this.f = aVar;
        }

        public void run() {
            if (!this.g) {
                this.e.i(this.f);
                this.g = true;
            }
        }
    }

    public z(n nVar) {
        this.a = new o(nVar);
    }

    private void f(h.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.b.postAtFrontOfQueue(aVar3);
    }

    public h a() {
        return this.a;
    }

    public void b() {
        f(h.a.ON_START);
    }

    public void c() {
        f(h.a.ON_CREATE);
    }

    public void d() {
        f(h.a.ON_STOP);
        f(h.a.ON_DESTROY);
    }

    public void e() {
        f(h.a.ON_START);
    }
}
