package androidx.fragment.app;

import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.lifecycle.o;

class w implements n {
    private o e = null;

    w() {
    }

    public h a() {
        d();
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void b(h.a aVar) {
        this.e.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.e == null) {
            this.e = new o(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.e != null;
    }

    /* access modifiers changed from: package-private */
    public void f(h.b bVar) {
        this.e.p(bVar);
    }
}
