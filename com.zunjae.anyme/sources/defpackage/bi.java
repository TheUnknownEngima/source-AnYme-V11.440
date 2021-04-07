package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.nio.ByteBuffer;

/* renamed from: bi  reason: default package */
public final class bi implements k<ByteBuffer, Bitmap> {
    private final xh a = new xh();

    /* renamed from: c */
    public Cif<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, i iVar) {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return true;
    }
}
