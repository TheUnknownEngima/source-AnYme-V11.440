package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.Map;

public abstract class LiveData<T> {
    static final Object j = new Object();
    final Object a = new Object();
    private z<u<? super T>, LiveData<T>.defpackage.c> b = new z<>();
    int c = 0;
    private volatile Object d = j;
    volatile Object e = j;
    private int f = -1;
    private boolean g;
    private boolean h;
    private final Runnable i = new a();

    class LifecycleBoundObserver extends LiveData<T>.defpackage.c implements l {
        final n i;

        LifecycleBoundObserver(n nVar, u<? super T> uVar) {
            super(uVar);
            this.i = nVar;
        }

        public void c(n nVar, h.a aVar) {
            if (this.i.a().b() == h.b.DESTROYED) {
                LiveData.this.l(this.e);
            } else {
                h(k());
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.i.a().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean j(n nVar) {
            return this.i == nVar;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.i.a().b().isAtLeast(h.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.j;
            }
            LiveData.this.m(obj);
        }
    }

    private class b extends LiveData<T>.defpackage.c {
        b(LiveData liveData, u<? super T> uVar) {
            super(uVar);
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return true;
        }
    }

    private abstract class c {
        final u<? super T> e;
        boolean f;
        int g = -1;

        c(u<? super T> uVar) {
            this.e = uVar;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z) {
            if (z != this.f) {
                this.f = z;
                int i = 1;
                boolean z2 = LiveData.this.c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.c;
                if (!this.f) {
                    i = -1;
                }
                liveData.c = i2 + i;
                if (z2 && this.f) {
                    LiveData.this.i();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.c == 0 && !this.f) {
                    liveData2.j();
                }
                if (this.f) {
                    LiveData.this.c(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i() {
        }

        /* access modifiers changed from: package-private */
        public boolean j(n nVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public abstract boolean k();
    }

    static void a(String str) {
        if (!v.f().c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void b(LiveData<T>.defpackage.c cVar) {
        if (cVar.f) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i2 = cVar.g;
            int i3 = this.f;
            if (i2 < i3) {
                cVar.g = i3;
                cVar.e.a(this.d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(LiveData<T>.defpackage.c cVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (cVar == null) {
                z<K, V>.d g2 = this.b.g();
                while (g2.hasNext()) {
                    b((c) ((Map.Entry) g2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public T d() {
        T t = this.d;
        if (t != j) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f;
    }

    public boolean f() {
        return this.c > 0;
    }

    public void g(n nVar, u<? super T> uVar) {
        a("observe");
        if (nVar.a().b() != h.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(nVar, uVar);
            c j2 = this.b.j(uVar, lifecycleBoundObserver);
            if (j2 != null && !j2.j(nVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (j2 == null) {
                nVar.a().a(lifecycleBoundObserver);
            }
        }
    }

    public void h(u<? super T> uVar) {
        a("observeForever");
        b bVar = new b(this, uVar);
        c j2 = this.b.j(uVar, bVar);
        if (j2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (j2 == null) {
            bVar.h(true);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.e == j;
            this.e = t;
        }
        if (z) {
            v.f().d(this.i);
        }
    }

    public void l(u<? super T> uVar) {
        a("removeObserver");
        c k = this.b.k(uVar);
        if (k != null) {
            k.i();
            k.h(false);
        }
    }

    /* access modifiers changed from: protected */
    public void m(T t) {
        a("setValue");
        this.f++;
        this.d = t;
        c((LiveData<T>.defpackage.c) null);
    }
}
