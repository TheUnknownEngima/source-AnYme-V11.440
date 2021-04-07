package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public final class w0 extends m80 {
    public static final Parcelable.Creator<w0> CREATOR = new y0();
    private int e;

    public w0() {
        this(0);
    }

    w0(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof w0) && this.e == ((w0) obj).e;
    }

    public final int hashCode() {
        return q.b(Integer.valueOf(this.e));
    }

    public final String toString() {
        int i = this.e;
        return String.format("joinOptions(connectionType=%s)", new Object[]{i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG"});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 2, this.e);
        o80.b(parcel, a);
    }
}
