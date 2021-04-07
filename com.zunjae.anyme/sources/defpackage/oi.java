package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: oi  reason: default package */
public final class oi implements Cif<BitmapDrawable>, ef {
    private final Resources e;
    private final Cif<Bitmap> f;

    private oi(Resources resources, Cif<Bitmap> ifVar) {
        jm.d(resources);
        this.e = resources;
        jm.d(ifVar);
        this.f = ifVar;
    }

    public static Cif<BitmapDrawable> f(Resources resources, Cif<Bitmap> ifVar) {
        if (ifVar == null) {
            return null;
        }
        return new oi(resources, ifVar);
    }

    public void a() {
        this.f.a();
    }

    public void b() {
        Cif<Bitmap> ifVar = this.f;
        if (ifVar instanceof ef) {
            ((ef) ifVar).b();
        }
    }

    public int c() {
        return this.f.c();
    }

    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.e, this.f.get());
    }
}
