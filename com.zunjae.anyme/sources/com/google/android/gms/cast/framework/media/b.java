package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;

public class b extends m80 {
    public static final Parcelable.Creator<b> CREATOR = new g0();
    private final int e;
    private final int f;
    private final int g;

    public b(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.e;
    }

    public int k() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 2, j());
        o80.l(parcel, 3, k());
        o80.l(parcel, 4, i());
        o80.b(parcel, a);
    }
}
