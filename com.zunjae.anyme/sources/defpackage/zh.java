package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;

/* renamed from: zh  reason: default package */
public abstract class zh implements m<Bitmap> {
    public final Cif<Bitmap> b(Context context, Cif<Bitmap> ifVar, int i, int i2) {
        if (km.s(i, i2)) {
            rf g = c.d(context).g();
            Bitmap bitmap = ifVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(g, bitmap, i, i2);
            return bitmap.equals(c) ? ifVar : yh.f(c, g);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(rf rfVar, Bitmap bitmap, int i, int i2);
}
