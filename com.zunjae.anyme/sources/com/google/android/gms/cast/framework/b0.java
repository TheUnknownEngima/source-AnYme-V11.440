package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.b;

public final class b0 extends fa0 implements a0 {
    b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    public final void K(int i) {
        Parcel p3 = p3();
        p3.writeInt(i);
        r3(5, p3);
    }

    public final void i(int i) {
        Parcel p3 = p3();
        p3.writeInt(i);
        r3(2, p3);
    }

    public final void j(Bundle bundle) {
        Parcel p3 = p3();
        cb0.d(p3, (Parcelable) null);
        r3(1, p3);
    }

    public final void q(b bVar) {
        Parcel p3 = p3();
        cb0.d(p3, bVar);
        r3(3, p3);
    }

    public final void w(d dVar, String str, String str2, boolean z) {
        Parcel p3 = p3();
        cb0.d(p3, dVar);
        p3.writeString(str);
        p3.writeString(str2);
        cb0.a(p3, z);
        r3(4, p3);
    }

    public final void z1(boolean z, int i) {
        Parcel p3 = p3();
        cb0.a(p3, z);
        p3.writeInt(0);
        r3(6, p3);
    }
}
