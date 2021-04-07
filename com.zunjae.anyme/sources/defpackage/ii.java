package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;

/* renamed from: ii  reason: default package */
public class ii implements m<Drawable> {
    private final m<Bitmap> b;
    private final boolean c;

    public ii(m<Bitmap> mVar, boolean z) {
        this.b = mVar;
        this.c = z;
    }

    private Cif<Drawable> d(Context context, Cif<Bitmap> ifVar) {
        return oi.f(context.getResources(), ifVar);
    }

    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    public Cif<Drawable> b(Context context, Cif<Drawable> ifVar, int i, int i2) {
        rf g = c.d(context).g();
        Drawable drawable = ifVar.get();
        Cif<Bitmap> a = hi.a(g, drawable, i, i2);
        if (a != null) {
            Cif<Bitmap> b2 = this.b.b(context, a, i, i2);
            if (!b2.equals(a)) {
                return d(context, b2);
            }
            b2.a();
            return ifVar;
        } else if (!this.c) {
            return ifVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public m<BitmapDrawable> c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ii) {
            return this.b.equals(((ii) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
