package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class i extends dp0 implements j {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final w80 g0(w80 w80, String str, int i, w80 w802) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        p3.writeInt(i);
        ep0.c(p3, w802);
        Parcel q3 = q3(2, p3);
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final w80 k0(w80 w80, String str, int i, w80 w802) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        p3.writeInt(i);
        ep0.c(p3, w802);
        Parcel q3 = q3(3, p3);
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }
}
