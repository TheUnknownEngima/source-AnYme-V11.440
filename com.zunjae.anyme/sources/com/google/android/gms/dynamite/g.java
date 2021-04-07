package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class g extends dp0 implements h {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int B1(w80 w80, String str, boolean z) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        ep0.a(p3, z);
        Parcel q3 = q3(5, p3);
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final int F() {
        Parcel q3 = q3(6, p3());
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final w80 V0(w80 w80, String str, int i) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        p3.writeInt(i);
        Parcel q3 = q3(2, p3);
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final int b2(w80 w80, String str, boolean z) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        ep0.a(p3, z);
        Parcel q3 = q3(3, p3);
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final w80 l2(w80 w80, String str, int i) {
        Parcel p3 = p3();
        ep0.c(p3, w80);
        p3.writeString(str);
        p3.writeInt(i);
        Parcel q3 = q3(4, p3);
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }
}
