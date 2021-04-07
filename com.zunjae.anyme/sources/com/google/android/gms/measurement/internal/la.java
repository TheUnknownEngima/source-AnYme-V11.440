package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.List;

public final class la extends m80 {
    public static final Parcelable.Creator<la> CREATOR = new ka();
    public final String A;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final String o;
    public final long p;
    public final long q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final Boolean w;
    public final long x;
    public final List<String> y;
    public final String z;

    la(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z2, boolean z3, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        r.f(str);
        this.e = str;
        this.f = TextUtils.isEmpty(str2) ? null : str2;
        this.g = str3;
        this.n = j2;
        this.h = str4;
        this.i = j3;
        this.j = j4;
        this.k = str5;
        this.l = z2;
        this.m = z3;
        this.o = str6;
        this.p = j5;
        this.q = j6;
        this.r = i2;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
        this.A = str9;
    }

    la(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z2, boolean z3, long j4, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.n = j4;
        this.h = str4;
        this.i = j2;
        this.j = j3;
        this.k = str5;
        this.l = z2;
        this.m = z3;
        this.o = str6;
        this.p = j5;
        this.q = j6;
        this.r = i2;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
        this.A = str9;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.s(parcel, 2, this.e, false);
        o80.s(parcel, 3, this.f, false);
        o80.s(parcel, 4, this.g, false);
        o80.s(parcel, 5, this.h, false);
        o80.o(parcel, 6, this.i);
        o80.o(parcel, 7, this.j);
        o80.s(parcel, 8, this.k, false);
        o80.c(parcel, 9, this.l);
        o80.c(parcel, 10, this.m);
        o80.o(parcel, 11, this.n);
        o80.s(parcel, 12, this.o, false);
        o80.o(parcel, 13, this.p);
        o80.o(parcel, 14, this.q);
        o80.l(parcel, 15, this.r);
        o80.c(parcel, 16, this.s);
        o80.c(parcel, 17, this.t);
        o80.c(parcel, 18, this.u);
        o80.s(parcel, 19, this.v, false);
        o80.d(parcel, 21, this.w, false);
        o80.o(parcel, 22, this.x);
        o80.u(parcel, 23, this.y, false);
        o80.s(parcel, 24, this.z, false);
        o80.s(parcel, 25, this.A, false);
        o80.b(parcel, a);
    }
}
