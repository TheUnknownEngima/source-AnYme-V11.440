package com.google.android.material.progressindicator;

import android.animation.Animator;

public abstract class g<T extends Animator> {
    protected h a;
    protected final float[] b;
    protected final int[] c;

    protected g(int i) {
        this.b = new float[(i * 2)];
        this.c = new int[i];
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    public abstract void b();

    public abstract void c(x6 x6Var);

    /* access modifiers changed from: protected */
    public void d(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: package-private */
    public abstract void g();

    public abstract void h();
}
