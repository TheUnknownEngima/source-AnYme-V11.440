package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class d {
    final b a;
    final a b = new a();
    final List<View> c = new ArrayList();

    static class a {
        long a = 0;
        a b;

        a() {
        }

        private void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        /* access modifiers changed from: package-private */
        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.a;
            this.a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.a & j) != 0;
            long j2 = this.a & (~j);
            this.a = j2;
            long j3 = j - 1;
            this.a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i) {
            if (i >= 64) {
                c();
                this.b.h(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    interface b {
        View a(int i);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.c0 f(View view);

        void g(int i);

        void h(View view);

        void i(View view, int i);

        void j(int i);

        void k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    d(b bVar) {
        this.a = bVar;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c2 = this.a.c();
        int i2 = i;
        while (i2 < c2) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.h(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int c2 = i < 0 ? this.a.c() : h(i);
        this.b.e(c2, z);
        if (z) {
            l(view);
        }
        this.a.i(view, c2);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int c2 = i < 0 ? this.a.c() : h(i);
        this.b.e(c2, z);
        if (z) {
            l(view);
        }
        this.a.k(view, c2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i) {
        int h = h(i);
        this.b.f(h);
        this.a.g(h);
    }

    /* access modifiers changed from: package-private */
    public View e(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.c.get(i2);
            RecyclerView.c0 f = this.a.f(view);
            if (f.m() == i && !f.t() && !f.v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i) {
        return this.a.a(h(i));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.a.c() - this.c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i) {
        return this.a.a(i);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.a.c();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int e = this.a.e(view);
        if (e >= 0) {
            this.b.h(e);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int e = this.a.e(view);
        if (e != -1 && !this.b.d(e)) {
            return e - this.b.b(e);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.b.g();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.h(this.c.get(size));
            this.c.remove(size);
        }
        this.a.d();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int e = this.a.e(view);
        if (e >= 0) {
            if (this.b.f(e)) {
                t(view);
            }
            this.a.j(e);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i) {
        int h = h(i);
        View a2 = this.a.a(h);
        if (a2 != null) {
            if (this.b.f(h)) {
                t(a2);
            }
            this.a.j(h);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int e = this.a.e(view);
        if (e == -1) {
            t(view);
            return true;
        } else if (!this.b.d(e)) {
            return false;
        } else {
            this.b.f(e);
            t(view);
            this.a.j(e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int e = this.a.e(view);
        if (e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.b.d(e)) {
            this.b.a(e);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
