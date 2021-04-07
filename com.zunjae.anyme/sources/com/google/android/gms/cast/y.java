package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public final class y extends m80 {
    public static final Parcelable.Creator<y> CREATOR = new b0();
    private final w e;
    private final w f;

    public y(w wVar, w wVar2) {
        this.e = wVar;
        this.f = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return t60.f(this.e, yVar.e) && t60.f(this.f, yVar.f);
    }

    public final int hashCode() {
        return q.b(this.e, this.f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.r(parcel, 2, this.e, i, false);
        o80.r(parcel, 3, this.f, i, false);
        o80.b(parcel, a);
    }
}
