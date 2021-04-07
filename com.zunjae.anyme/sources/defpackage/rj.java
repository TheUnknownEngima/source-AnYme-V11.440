package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;

/* renamed from: rj  reason: default package */
public class rj implements uj<Bitmap, BitmapDrawable> {
    private final Resources a;

    public rj(Resources resources) {
        jm.d(resources);
        this.a = resources;
    }

    public Cif<BitmapDrawable> a(Cif<Bitmap> ifVar, i iVar) {
        return oi.f(this.a, ifVar);
    }
}
