package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.i;

/* renamed from: sj  reason: default package */
public final class sj implements uj<Drawable, byte[]> {
    private final rf a;
    private final uj<Bitmap, byte[]> b;
    private final uj<ij, byte[]> c;

    public sj(rf rfVar, uj<Bitmap, byte[]> ujVar, uj<ij, byte[]> ujVar2) {
        this.a = rfVar;
        this.b = ujVar;
        this.c = ujVar2;
    }

    private static Cif<ij> b(Cif<Drawable> ifVar) {
        return ifVar;
    }

    public Cif<byte[]> a(Cif<Drawable> ifVar, i iVar) {
        Drawable drawable = ifVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(yh.f(((BitmapDrawable) drawable).getBitmap(), this.a), iVar);
        }
        if (!(drawable instanceof ij)) {
            return null;
        }
        uj<ij, byte[]> ujVar = this.c;
        b(ifVar);
        return ujVar.a(ifVar, iVar);
    }
}
