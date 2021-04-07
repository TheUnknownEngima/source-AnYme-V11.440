package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.FileNotFoundException;

/* renamed from: kn1  reason: default package */
public class kn1 extends ro1 {
    private zm1 e;

    public kn1(int i) {
        super(i);
    }

    public kn1(String str) {
        super(str);
    }

    public kn1(zm1 zm1) {
        super((Bitmap) null);
        this.e = zm1;
    }

    public static void j(kn1 kn1, ImageView imageView, int i, boolean z, int i2) {
        if (kn1 != null && imageView != null) {
            Drawable l = l(kn1, imageView.getContext(), i, z, i2);
            if (l != null) {
                imageView.setImageDrawable(l);
            } else if (kn1.f() != null) {
                imageView.setImageBitmap(kn1.f());
            }
            imageView.setVisibility(0);
            return;
        } else if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    public static Drawable l(kn1 kn1, Context context, int i, boolean z, int i2) {
        if (kn1 == null) {
            return null;
        }
        return kn1.k(context, i, z, i2);
    }

    public boolean b(ImageView imageView, String str) {
        Drawable drawable;
        if (i() == null) {
            if (g() != null) {
                drawable = g();
            } else if (f() != null) {
                imageView.setImageBitmap(f());
                return true;
            } else if (h() != -1) {
                imageView.setImageResource(h());
                return true;
            } else if (this.e != null) {
                tm1 tm1 = new tm1(imageView.getContext(), this.e);
                tm1.a();
                drawable = tm1;
            } else {
                imageView.setImageBitmap((Bitmap) null);
                return false;
            }
            imageView.setImageDrawable(drawable);
            return true;
        } else if (mo1.c().e(imageView, i(), str)) {
            return true;
        } else {
            imageView.setImageURI(i());
            return true;
        }
    }

    public Drawable k(Context context, int i, boolean z, int i2) {
        tm1 tm1;
        Drawable g = g();
        if (this.e != null) {
            tm1 tm12 = new tm1(context, this.e);
            tm12.h(i);
            tm12.E(24);
            tm12.w(i2);
            tm1 = tm12;
        } else if (h() != -1) {
            tm1 = f.d(context, h());
        } else {
            tm1 = g;
            if (i() != null) {
                try {
                    tm1 = Drawable.createFromStream(context.getContentResolver().openInputStream(i()), i().toString());
                } catch (FileNotFoundException unused) {
                    tm1 = g;
                }
            }
        }
        if (tm1 == null || !z || this.e != null) {
            return tm1;
        }
        Drawable mutate = tm1.mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        return mutate;
    }
}
