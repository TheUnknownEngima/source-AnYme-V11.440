package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public class i extends m80 {
    public static final Parcelable.Creator<i> CREATOR = new x();
    private final String e;
    private final String f;

    public i(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return q.a(this.e, iVar.e) && q.a(this.f, iVar.f);
    }

    public int hashCode() {
        return q.b(this.e, this.f);
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 1, i(), false);
        o80.s(parcel, 2, j(), false);
        o80.b(parcel, a);
    }
}
