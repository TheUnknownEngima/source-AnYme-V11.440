package defpackage;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;

/* renamed from: pi  reason: default package */
public final class pi implements k<ParcelFileDescriptor, Bitmap> {
    private final gi a;

    public pi(gi giVar) {
        this.a = giVar;
    }

    /* renamed from: c */
    public Cif<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, i iVar) {
        return this.a.d(parcelFileDescriptor, i, i2, iVar);
    }

    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, i iVar) {
        return this.a.o(parcelFileDescriptor);
    }
}
