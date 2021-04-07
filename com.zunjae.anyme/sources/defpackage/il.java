package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: il  reason: default package */
public abstract class il<T> implements pl<T> {
    private final int e;
    private final int f;
    private zk g;

    public il() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public il(int i, int i2) {
        if (km.s(i, i2)) {
            this.e = i;
            this.f = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    public final zk c() {
        return this.g;
    }

    public final void d(ol olVar) {
    }

    public final void f(zk zkVar) {
        this.g = zkVar;
    }

    public void g(Drawable drawable) {
    }

    public void h(Drawable drawable) {
    }

    public final void j(ol olVar) {
        olVar.e(this.e, this.f);
    }

    public void n() {
    }

    public void x() {
    }

    public void y() {
    }
}
