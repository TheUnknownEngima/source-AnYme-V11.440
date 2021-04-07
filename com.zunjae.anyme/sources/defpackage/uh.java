package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;

/* renamed from: uh  reason: default package */
public class uh<DataType> implements k<DataType, BitmapDrawable> {
    private final k<DataType, Bitmap> a;
    private final Resources b;

    public uh(Resources resources, k<DataType, Bitmap> kVar) {
        jm.d(resources);
        this.b = resources;
        jm.d(kVar);
        this.a = kVar;
    }

    public boolean a(DataType datatype, i iVar) {
        return this.a.a(datatype, iVar);
    }

    public Cif<BitmapDrawable> b(DataType datatype, int i, int i2, i iVar) {
        return oi.f(this.b, this.a.b(datatype, i, i2, iVar));
    }
}
