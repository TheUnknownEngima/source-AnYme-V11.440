package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;

public class f extends m80 {
    public static final Parcelable.Creator<f> CREATOR = new p0();
    private final String e;
    private final int f;
    private final String g;

    f(String str, int i, String str2) {
        this.e = str;
        this.f = i;
        this.g = str2;
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.g;
    }

    public int k() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, i(), false);
        o80.l(parcel, 3, k());
        o80.s(parcel, 4, j(), false);
        o80.b(parcel, a);
    }
}
