package defpackage;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;

/* renamed from: rh  reason: default package */
public abstract class rh<T> implements k<ImageDecoder.Source, T> {
    final li a = li.a();

    /* renamed from: rh$a */
    class a implements ImageDecoder.OnHeaderDecodedListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ boolean c;
        final /* synthetic */ b d;
        final /* synthetic */ fi e;
        final /* synthetic */ j f;

        /* renamed from: rh$a$a  reason: collision with other inner class name */
        class C0138a implements ImageDecoder.OnPartialImageListener {
            C0138a(a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        a(int i, int i2, boolean z, b bVar, fi fiVar, j jVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = bVar;
            this.e = fiVar;
            this.f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (rh.this.a.c(this.a, this.b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0138a(this));
            Size size = imageInfo.getSize();
            int i = this.a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b2 = this.e.b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            if (Log.isLoggable("ImageDecoder", 2)) {
                "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b2;
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f == j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* access modifiers changed from: protected */
    public abstract Cif<T> c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    /* renamed from: d */
    public final Cif<T> b(ImageDecoder.Source source, int i, int i2, i iVar) {
        return c(source, i, i2, new a(i, i2, iVar.c(gi.i) != null && ((Boolean) iVar.c(gi.i)).booleanValue(), (b) iVar.c(gi.f), (fi) iVar.c(fi.f), (j) iVar.c(gi.g)));
    }

    /* renamed from: e */
    public final boolean a(ImageDecoder.Source source, i iVar) {
        return true;
    }
}
