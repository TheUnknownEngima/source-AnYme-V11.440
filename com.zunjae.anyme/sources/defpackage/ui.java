package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;

/* renamed from: ui  reason: default package */
public final class ui implements k<Bitmap, Bitmap> {

    /* renamed from: ui$a */
    private static final class a implements Cif<Bitmap> {
        private final Bitmap e;

        a(Bitmap bitmap) {
            this.e = bitmap;
        }

        public void a() {
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.e;
        }

        public int c() {
            return km.h(this.e);
        }

        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public Cif<Bitmap> b(Bitmap bitmap, int i, int i2, i iVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean a(Bitmap bitmap, i iVar) {
        return true;
    }
}
