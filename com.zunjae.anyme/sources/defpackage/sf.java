package defpackage;

import android.graphics.Bitmap;

/* renamed from: sf  reason: default package */
public class sf implements rf {
    public void a(int i) {
    }

    public void b() {
    }

    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public Bitmap e(int i, int i2, Bitmap.Config config) {
        return d(i, i2, config);
    }
}
