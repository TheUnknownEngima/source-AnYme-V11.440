package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public class u extends m80 {
    public static final Parcelable.Creator<u> CREATOR = new e0();
    private final int e;
    private final int f;
    private final int g;
    @Deprecated
    private final Scope[] h;

    u(int i, int i2, int i3, Scope[] scopeArr) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = scopeArr;
    }

    public u(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, (Scope[]) null);
    }

    public int i() {
        return this.f;
    }

    public int j() {
        return this.g;
    }

    @Deprecated
    public Scope[] k() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.l(parcel, 2, i());
        o80.l(parcel, 3, j());
        o80.v(parcel, 4, k(), i, false);
        o80.b(parcel, a);
    }
}
