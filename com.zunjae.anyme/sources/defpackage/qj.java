package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import java.io.ByteArrayOutputStream;

/* renamed from: qj  reason: default package */
public class qj implements uj<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public qj() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public qj(Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }

    public Cif<byte[]> a(Cif<Bitmap> ifVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ifVar.get().compress(this.a, this.b, byteArrayOutputStream);
        ifVar.a();
        return new xi(byteArrayOutputStream.toByteArray());
    }
}
