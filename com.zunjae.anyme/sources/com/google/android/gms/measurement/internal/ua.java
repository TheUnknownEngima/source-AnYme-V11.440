package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

public final class ua extends m80 {
    public static final Parcelable.Creator<ua> CREATOR = new xa();
    public String e;
    public String f;
    public ea g;
    public long h;
    public boolean i;
    public String j;
    public s k;
    public long l;
    public s m;
    public long n;
    public s o;

    ua(ua uaVar) {
        r.j(uaVar);
        this.e = uaVar.e;
        this.f = uaVar.f;
        this.g = uaVar.g;
        this.h = uaVar.h;
        this.i = uaVar.i;
        this.j = uaVar.j;
        this.k = uaVar.k;
        this.l = uaVar.l;
        this.m = uaVar.m;
        this.n = uaVar.n;
        this.o = uaVar.o;
    }

    ua(String str, String str2, ea eaVar, long j2, boolean z, String str3, s sVar, long j3, s sVar2, long j4, s sVar3) {
        this.e = str;
        this.f = str2;
        this.g = eaVar;
        this.h = j2;
        this.i = z;
        this.j = str3;
        this.k = sVar;
        this.l = j3;
        this.m = sVar2;
        this.n = j4;
        this.o = sVar3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, this.e, false);
        o80.s(parcel, 3, this.f, false);
        o80.r(parcel, 4, this.g, i2, false);
        o80.o(parcel, 5, this.h);
        o80.c(parcel, 6, this.i);
        o80.s(parcel, 7, this.j, false);
        o80.r(parcel, 8, this.k, i2, false);
        o80.o(parcel, 9, this.l);
        o80.r(parcel, 10, this.m, i2, false);
        o80.o(parcel, 11, this.n);
        o80.r(parcel, 12, this.o, i2, false);
        o80.b(parcel, a);
    }
}
