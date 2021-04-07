package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.io.File;

/* renamed from: vh  reason: default package */
public class vh implements l<BitmapDrawable> {
    private final rf a;
    private final l<Bitmap> b;

    public vh(rf rfVar, l<Bitmap> lVar) {
        this.a = rfVar;
        this.b = lVar;
    }

    public c b(i iVar) {
        return this.b.b(iVar);
    }

    /* renamed from: c */
    public boolean a(Cif<BitmapDrawable> ifVar, File file, i iVar) {
        return this.b.a(new yh(ifVar.get().getBitmap(), this.a), file, iVar);
    }
}
