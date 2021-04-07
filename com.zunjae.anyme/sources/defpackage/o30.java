package defpackage;

import android.text.Layout;

/* renamed from: o30  reason: default package */
final class o30 {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private o30 m;
    private Layout.Alignment n;

    private o30 l(o30 o30, boolean z) {
        if (o30 != null) {
            if (!this.c && o30.c) {
                q(o30.b);
            }
            if (this.h == -1) {
                this.h = o30.h;
            }
            if (this.i == -1) {
                this.i = o30.i;
            }
            if (this.a == null) {
                this.a = o30.a;
            }
            if (this.f == -1) {
                this.f = o30.f;
            }
            if (this.g == -1) {
                this.g = o30.g;
            }
            if (this.n == null) {
                this.n = o30.n;
            }
            if (this.j == -1) {
                this.j = o30.j;
                this.k = o30.k;
            }
            if (z && !this.e && o30.e) {
                o(o30.d);
            }
        }
        return this;
    }

    public o30 a(o30 o30) {
        l(o30, true);
        return this;
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public int h() {
        if (this.h == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.h == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public Layout.Alignment i() {
        return this.n;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public boolean m() {
        return this.f == 1;
    }

    public boolean n() {
        return this.g == 1;
    }

    public o30 o(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public o30 p(boolean z) {
        q40.f(this.m == null);
        this.h = z ? 1 : 0;
        return this;
    }

    public o30 q(int i2) {
        q40.f(this.m == null);
        this.b = i2;
        this.c = true;
        return this;
    }

    public o30 r(String str) {
        q40.f(this.m == null);
        this.a = str;
        return this;
    }

    public o30 s(float f2) {
        this.k = f2;
        return this;
    }

    public o30 t(int i2) {
        this.j = i2;
        return this;
    }

    public o30 u(String str) {
        this.l = str;
        return this;
    }

    public o30 v(boolean z) {
        q40.f(this.m == null);
        this.i = z ? 1 : 0;
        return this;
    }

    public o30 w(boolean z) {
        q40.f(this.m == null);
        this.f = z ? 1 : 0;
        return this;
    }

    public o30 x(Layout.Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public o30 y(boolean z) {
        q40.f(this.m == null);
        this.g = z ? 1 : 0;
        return this;
    }
}
