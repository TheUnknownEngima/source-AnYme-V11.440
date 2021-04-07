package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public final class w extends m80 {
    public static final Parcelable.Creator<w> CREATOR = new z();
    private final float e;
    private final float f;
    private final float g;

    public w(float f2, float f3, float f4) {
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.e == wVar.e && this.f == wVar.f && this.g == wVar.g;
    }

    public final int hashCode() {
        return q.b(Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.i(parcel, 2, this.e);
        o80.i(parcel, 3, this.f);
        o80.i(parcel, 4, this.g);
        o80.b(parcel, a);
    }
}
