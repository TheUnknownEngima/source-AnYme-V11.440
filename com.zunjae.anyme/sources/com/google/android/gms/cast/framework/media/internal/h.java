package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

public final class h extends fa0 implements f {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    public final Bitmap P2(Uri uri) {
        Parcel p3 = p3();
        cb0.d(p3, uri);
        Parcel q3 = q3(1, p3);
        Bitmap bitmap = (Bitmap) cb0.b(q3, Bitmap.CREATOR);
        q3.recycle();
        return bitmap;
    }
}
