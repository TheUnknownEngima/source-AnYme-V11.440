package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class f0 extends fa0 implements d0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    public final int[] R1() {
        Parcel q3 = q3(4, p3());
        int[] createIntArray = q3.createIntArray();
        q3.recycle();
        return createIntArray;
    }

    public final List<f> e0() {
        Parcel q3 = q3(3, p3());
        ArrayList<f> createTypedArrayList = q3.createTypedArrayList(f.CREATOR);
        q3.recycle();
        return createTypedArrayList;
    }
}
