package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import defpackage.mo1;

/* renamed from: lo1  reason: default package */
public abstract class lo1 implements mo1.b {
    public void a(ImageView imageView, Uri uri, Drawable drawable, String str) {
        e(imageView, uri, drawable);
    }

    public Drawable b(Context context, String str) {
        return d(context);
    }

    public void c(ImageView imageView) {
    }

    public Drawable d(Context context) {
        return no1.c(context);
    }

    public void e(ImageView imageView, Uri uri, Drawable drawable) {
    }
}
