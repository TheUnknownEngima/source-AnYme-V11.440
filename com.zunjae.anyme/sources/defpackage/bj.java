package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: bj  reason: default package */
final class bj extends zi<Drawable> {
    private bj(Drawable drawable) {
        super(drawable);
    }

    static Cif<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new bj(drawable);
        }
        return null;
    }

    public void a() {
    }

    public int c() {
        return Math.max(1, this.e.getIntrinsicWidth() * this.e.getIntrinsicHeight() * 4);
    }

    public Class<Drawable> d() {
        return this.e.getClass();
    }
}
