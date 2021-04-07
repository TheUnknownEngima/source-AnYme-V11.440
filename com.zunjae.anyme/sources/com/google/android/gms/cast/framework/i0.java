package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class i0 extends fa0 implements g0 {
    i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    public final void C2(int i) {
        Parcel p3 = p3();
        p3.writeInt(i);
        r3(15, p3);
    }

    public final w80 F() {
        Parcel q3 = q3(1, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final void Y0(int i) {
        Parcel p3 = p3();
        p3.writeInt(i);
        r3(13, p3);
    }

    public final void f2(int i) {
        Parcel p3 = p3();
        p3.writeInt(i);
        r3(12, p3);
    }

    public final boolean u() {
        Parcel q3 = q3(6, p3());
        boolean e = cb0.e(q3);
        q3.recycle();
        return e;
    }

    public final boolean w2() {
        Parcel q3 = q3(9, p3());
        boolean e = cb0.e(q3);
        q3.recycle();
        return e;
    }

    public final boolean y() {
        Parcel q3 = q3(5, p3());
        boolean e = cb0.e(q3);
        q3.recycle();
        return e;
    }
}
