package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.l;
import defpackage.w80;

public final class e0 extends fa0 implements w {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final w80 V() {
        Parcel q3 = q3(2, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final int a() {
        Parcel q3 = q3(3, p3());
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final k80 a2(l lVar, int i) {
        Parcel p3 = p3();
        cb0.d(p3, lVar);
        p3.writeInt(i);
        Parcel q3 = q3(1, p3);
        k80 k80 = (k80) cb0.b(q3, k80.CREATOR);
        q3.recycle();
        return k80;
    }

    public final k80 g2(l lVar, b bVar) {
        Parcel p3 = p3();
        cb0.d(p3, lVar);
        cb0.d(p3, bVar);
        Parcel q3 = q3(4, p3);
        k80 k80 = (k80) cb0.b(q3, k80.CREATOR);
        q3.recycle();
        return k80;
    }
}
