package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class k0 extends fa0 implements h0 {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    public final w80 I() {
        Parcel q3 = q3(7, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final void O0(j0 j0Var) {
        Parcel p3 = p3();
        cb0.c(p3, j0Var);
        r3(3, p3);
    }

    public final void P(boolean z, boolean z2) {
        Parcel p3 = p3();
        cb0.a(p3, true);
        cb0.a(p3, z2);
        r3(6, p3);
    }

    public final w80 R2() {
        Parcel q3 = q3(1, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final void u0(j0 j0Var) {
        Parcel p3 = p3();
        cb0.c(p3, j0Var);
        r3(2, p3);
    }
}
