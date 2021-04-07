package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import com.google.android.gms.common.internal.k;

public class g extends m80 {
    public static final Parcelable.Creator<g> CREATOR = new i0();
    private final int e;
    private final int f;
    private int g;
    String h;
    IBinder i;
    Scope[] j;
    Bundle k;
    Account l;
    d[] m;
    d[] n;
    private boolean o;
    private int p;

    public g(int i2) {
        this.e = 4;
        this.g = f.a;
        this.f = i2;
        this.o = true;
    }

    g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z, int i5) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
        if ("com.google.android.gms".equals(str)) {
            this.h = "com.google.android.gms";
        } else {
            this.h = str;
        }
        if (i2 < 2) {
            this.l = iBinder != null ? a.r3(k.a.q3(iBinder)) : null;
        } else {
            this.i = iBinder;
            this.l = account;
        }
        this.j = scopeArr;
        this.k = bundle;
        this.m = dVarArr;
        this.n = dVarArr2;
        this.o = z;
        this.p = i5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.l(parcel, 2, this.f);
        o80.l(parcel, 3, this.g);
        o80.s(parcel, 4, this.h, false);
        o80.k(parcel, 5, this.i, false);
        o80.v(parcel, 6, this.j, i2, false);
        o80.e(parcel, 7, this.k, false);
        o80.r(parcel, 8, this.l, i2, false);
        o80.v(parcel, 10, this.m, i2, false);
        o80.v(parcel, 11, this.n, i2, false);
        o80.c(parcel, 12, this.o);
        o80.l(parcel, 13, this.p);
        o80.b(parcel, a);
    }
}
