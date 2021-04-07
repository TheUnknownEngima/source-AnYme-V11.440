package defpackage;

import android.graphics.Bitmap;

/* renamed from: yh  reason: default package */
public class yh implements Cif<Bitmap>, ef {
    private final Bitmap e;
    private final rf f;

    public yh(Bitmap bitmap, rf rfVar) {
        jm.e(bitmap, "Bitmap must not be null");
        this.e = bitmap;
        jm.e(rfVar, "BitmapPool must not be null");
        this.f = rfVar;
    }

    public static yh f(Bitmap bitmap, rf rfVar) {
        if (bitmap == null) {
            return null;
        }
        return new yh(bitmap, rfVar);
    }

    public void a() {
        this.f.c(this.e);
    }

    public void b() {
        this.e.prepareToDraw();
    }

    public int c() {
        return km.h(this.e);
    }

    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    /* renamed from: e */
    public Bitmap get() {
        return this.e;
    }
}
