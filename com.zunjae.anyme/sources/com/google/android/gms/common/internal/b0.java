package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class b0 extends j90 implements p {
    b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final w80 l1(w80 w80, u uVar) {
        Parcel p3 = p3();
        k90.b(p3, w80);
        k90.c(p3, uVar);
        Parcel q3 = q3(2, p3);
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }
}
