package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;

/* renamed from: ri  reason: default package */
public class ri implements k<Uri, Bitmap> {
    private final cj a;
    private final rf b;

    public ri(cj cjVar, rf rfVar) {
        this.a = cjVar;
        this.b = rfVar;
    }

    /* renamed from: c */
    public Cif<Bitmap> b(Uri uri, int i, int i2, i iVar) {
        Cif<Drawable> c = this.a.b(uri, i, i2, iVar);
        if (c == null) {
            return null;
        }
        return hi.a(this.b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean a(Uri uri, i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
