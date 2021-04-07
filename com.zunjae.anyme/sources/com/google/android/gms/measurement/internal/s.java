package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

public final class s extends m80 {
    public static final Parcelable.Creator<s> CREATOR = new r();
    public final String e;
    public final n f;
    public final String g;
    public final long h;

    s(s sVar, long j) {
        r.j(sVar);
        this.e = sVar.e;
        this.f = sVar.f;
        this.g = sVar.g;
        this.h = j;
    }

    public s(String str, n nVar, String str2, long j) {
        this.e = str;
        this.f = nVar;
        this.g = str2;
        this.h = j;
    }

    public final String toString() {
        String str = this.g;
        String str2 = this.e;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, this.e, false);
        o80.r(parcel, 3, this.f, i, false);
        o80.s(parcel, 4, this.g, false);
        o80.o(parcel, 5, this.h);
        o80.b(parcel, a);
    }
}
