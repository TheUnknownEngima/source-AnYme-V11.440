package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sq0  reason: default package */
public final class sq0 extends m80 {
    public static final Parcelable.Creator<sq0> CREATOR = new vq0();
    public final long e;
    public final long f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final Bundle k;

    public sq0(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.o(parcel, 1, this.e);
        o80.o(parcel, 2, this.f);
        o80.c(parcel, 3, this.g);
        o80.s(parcel, 4, this.h, false);
        o80.s(parcel, 5, this.i, false);
        o80.s(parcel, 6, this.j, false);
        o80.e(parcel, 7, this.k, false);
        o80.b(parcel, a);
    }
}
