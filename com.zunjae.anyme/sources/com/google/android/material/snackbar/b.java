package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class b {
    private static b e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new a());
    private c c;
    private c d;

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    interface C0104b {
        void a(int i);

        void b();
    }

    private static class c {
        final WeakReference<C0104b> a;
        int b;
        boolean c;

        c(int i, C0104b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a(C0104b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i) {
        C0104b bVar = (C0104b) cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    static b c() {
        if (e == null) {
            e = new b();
        }
        return e;
    }

    private boolean g(C0104b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    private boolean h(C0104b bVar) {
        c cVar = this.d;
        return cVar != null && cVar.a(bVar);
    }

    private void m(c cVar) {
        int i = cVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.b.removeCallbacksAndMessages(cVar);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    private void o() {
        c cVar = this.d;
        if (cVar != null) {
            this.c = cVar;
            this.d = null;
            C0104b bVar = (C0104b) cVar.a.get();
            if (bVar != null) {
                bVar.b();
            } else {
                this.c = null;
            }
        }
    }

    public void b(C0104b bVar, int i) {
        c cVar;
        synchronized (this.a) {
            if (g(bVar)) {
                cVar = this.c;
            } else if (h(bVar)) {
                cVar = this.d;
            }
            a(cVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(C0104b bVar) {
        boolean g;
        synchronized (this.a) {
            g = g(bVar);
        }
        return g;
    }

    public boolean f(C0104b bVar) {
        boolean z;
        synchronized (this.a) {
            if (!g(bVar)) {
                if (!h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void i(C0104b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                this.c = null;
                if (this.d != null) {
                    o();
                }
            }
        }
    }

    public void j(C0104b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                m(this.c);
            }
        }
    }

    public void k(C0104b bVar) {
        synchronized (this.a) {
            if (g(bVar) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public void l(C0104b bVar) {
        synchronized (this.a) {
            if (g(bVar) && this.c.c) {
                this.c.c = false;
                m(this.c);
            }
        }
    }

    public void n(int i, C0104b bVar) {
        synchronized (this.a) {
            if (g(bVar)) {
                this.c.b = i;
                this.b.removeCallbacksAndMessages(this.c);
                m(this.c);
                return;
            }
            if (h(bVar)) {
                this.d.b = i;
            } else {
                this.d = new c(i, bVar);
            }
            if (this.c == null || !a(this.c, 4)) {
                this.c = null;
                o();
            }
        }
    }
}
