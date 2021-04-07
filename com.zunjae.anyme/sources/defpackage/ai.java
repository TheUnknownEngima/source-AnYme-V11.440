package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.nio.ByteBuffer;

/* renamed from: ai  reason: default package */
public class ai implements k<ByteBuffer, Bitmap> {
    private final gi a;

    public ai(gi giVar) {
        this.a = giVar;
    }

    /* renamed from: c */
    public Cif<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, i iVar) {
        return this.a.f(am.f(byteBuffer), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ByteBuffer byteBuffer, i iVar) {
        return this.a.q(byteBuffer);
    }
}
