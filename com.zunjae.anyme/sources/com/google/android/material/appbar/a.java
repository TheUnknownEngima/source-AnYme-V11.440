package com.google.android.material.appbar;

import android.view.View;

class a {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public a(View view) {
        this.a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.a;
        o4.U(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        o4.T(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean e(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean f(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
