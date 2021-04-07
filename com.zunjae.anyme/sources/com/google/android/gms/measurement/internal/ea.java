package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

public final class ea extends m80 {
    public static final Parcelable.Creator<ea> CREATOR = new da();
    private final int e;
    public final String f;
    public final long g;
    public final Long h;
    public final String i;
    public final String j;
    public final Double k;

    ea(int i2, String str, long j2, Long l, Float f2, String str2, String str3, Double d) {
        this.e = i2;
        this.f = str;
        this.g = j2;
        this.h = l;
        if (i2 == 1) {
            this.k = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.k = d;
        }
        this.i = str2;
        this.j = str3;
    }

    ea(ga gaVar) {
        this(gaVar.c, gaVar.d, gaVar.e, gaVar.b);
    }

    ea(String str, long j2, Object obj, String str2) {
        r.f(str);
        this.e = 2;
        this.f = str;
        this.g = j2;
        this.j = str2;
        if (obj == null) {
            this.h = null;
            this.k = null;
            this.i = null;
        } else if (obj instanceof Long) {
            this.h = (Long) obj;
            this.k = null;
            this.i = null;
        } else if (obj instanceof String) {
            this.h = null;
            this.k = null;
            this.i = (String) obj;
        } else if (obj instanceof Double) {
            this.h = null;
            this.k = (Double) obj;
            this.i = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object i() {
        Long l = this.h;
        if (l != null) {
            return l;
        }
        Double d = this.k;
        if (d != null) {
            return d;
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.s(parcel, 2, this.f, false);
        o80.o(parcel, 3, this.g);
        o80.q(parcel, 4, this.h, false);
        o80.j(parcel, 5, (Float) null, false);
        o80.s(parcel, 6, this.i, false);
        o80.s(parcel, 7, this.j, false);
        o80.h(parcel, 8, this.k, false);
        o80.b(parcel, a);
    }
}
