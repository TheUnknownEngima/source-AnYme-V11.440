package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.k;

public class t extends m80 {
    public static final Parcelable.Creator<t> CREATOR = new d0();
    private final int e;
    private IBinder f;
    private b g;
    private boolean h;
    private boolean i;

    t(int i2, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.e = i2;
        this.f = iBinder;
        this.g = bVar;
        this.h = z;
        this.i = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.g.equals(tVar.g) && i().equals(tVar.i());
    }

    public k i() {
        return k.a.q3(this.f);
    }

    public b j() {
        return this.g;
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.k(parcel, 2, this.f, false);
        o80.r(parcel, 3, j(), i2, false);
        o80.c(parcel, 4, k());
        o80.c(parcel, 5, l());
        o80.b(parcel, a);
    }
}
