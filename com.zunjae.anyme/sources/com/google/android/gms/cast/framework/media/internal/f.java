package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

public interface f extends IInterface {

    public static abstract class a extends m90 implements f {
        public static f q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
        }
    }

    Bitmap P2(Uri uri);
}
