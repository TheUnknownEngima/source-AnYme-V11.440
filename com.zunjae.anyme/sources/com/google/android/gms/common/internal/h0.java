package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.d;

public final class h0 extends m80 {
    public static final Parcelable.Creator<h0> CREATOR = new g0();
    Bundle e;
    d[] f;
    private int g;

    public h0() {
    }

    h0(Bundle bundle, d[] dVarArr, int i) {
        this.e = bundle;
        this.f = dVarArr;
        this.g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.e(parcel, 1, this.e, false);
        o80.v(parcel, 2, this.f, i, false);
        o80.l(parcel, 3, this.g);
        o80.b(parcel, a);
    }
}
