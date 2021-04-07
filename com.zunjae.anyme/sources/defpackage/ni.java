package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.InputStream;

/* renamed from: ni  reason: default package */
public final class ni implements k<InputStream, Bitmap> {
    private final xh a = new xh();

    /* renamed from: c */
    public Cif<Bitmap> b(InputStream inputStream, int i, int i2, i iVar) {
        return this.a.b(ImageDecoder.createSource(am.b(inputStream)), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(InputStream inputStream, i iVar) {
        return true;
    }
}
