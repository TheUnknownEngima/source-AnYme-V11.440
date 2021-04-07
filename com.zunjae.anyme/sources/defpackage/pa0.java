package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.internal.a;

/* renamed from: pa0  reason: default package */
final class pa0 implements a {
    private final /* synthetic */ oa0 a;

    pa0(oa0 oa0) {
        this.a = oa0;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.a.e != null) {
                this.a.e.setVisibility(4);
            }
            this.a.b.setVisibility(0);
            this.a.b.setImageBitmap(bitmap);
        }
    }
}
