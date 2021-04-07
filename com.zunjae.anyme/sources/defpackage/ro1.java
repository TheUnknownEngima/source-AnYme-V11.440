package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: ro1  reason: default package */
public class ro1 {
    private Uri a;
    private Drawable b;
    private Bitmap c;
    private int d = -1;

    public ro1(int i) {
        this.d = i;
    }

    public ro1(Bitmap bitmap) {
        this.c = bitmap;
    }

    public ro1(String str) {
        this.a = Uri.parse(str);
    }

    public static void a(Drawable drawable, int i, Drawable drawable2, int i2, boolean z, ImageView imageView) {
        int i3;
        if (drawable != null) {
            if (drawable2 != null) {
                if (z) {
                    imageView.setImageDrawable(new oo1(drawable, drawable2, i, i2));
                    i3 = 0;
                } else {
                    drawable = to1.c(drawable, drawable2);
                }
            } else if (z) {
                imageView.setImageDrawable(new oo1(drawable, i, i2));
                i3 = 0;
            }
            imageView.setImageDrawable(drawable);
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
    }

    public static boolean c(ro1 ro1, ImageView imageView, String str) {
        if (ro1 == null || imageView == null) {
            return false;
        }
        return ro1.b(imageView, str);
    }

    public static void d(ro1 ro1, ImageView imageView) {
        e(ro1, imageView, (String) null);
    }

    public static void e(ro1 ro1, ImageView imageView, String str) {
        boolean c2 = c(ro1, imageView, str);
        if (imageView != null) {
            imageView.setVisibility(c2 ? 0 : 4);
        }
    }

    public abstract boolean b(ImageView imageView, String str);

    public Bitmap f() {
        return this.c;
    }

    public Drawable g() {
        return this.b;
    }

    public int h() {
        return this.d;
    }

    public Uri i() {
        return this.a;
    }
}
