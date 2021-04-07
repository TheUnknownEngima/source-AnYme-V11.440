package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: zi  reason: default package */
public abstract class zi<T extends Drawable> implements Cif<T>, ef {
    protected final T e;

    public zi(T t) {
        jm.d(t);
        this.e = (Drawable) t;
    }

    public void b() {
        Bitmap e2;
        T t = this.e;
        if (t instanceof BitmapDrawable) {
            e2 = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof ij) {
            e2 = ((ij) t).e();
        } else {
            return;
        }
        e2.prepareToDraw();
    }

    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.e.getConstantState();
        return constantState == null ? this.e : constantState.newDrawable();
    }
}
