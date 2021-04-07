package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();
    private final int e;
    private final long f;
    private int g;
    private final String h;
    private final String i;
    private final String j;
    private final int k;
    private final List<String> l;
    private final String m;
    private final long n;
    private int o;
    private final String p;
    private final float q;
    private final long r;
    private final boolean s;
    private long t;

    WakeLockEvent(int i2, long j2, int i3, String str, int i4, List<String> list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.e = i2;
        this.f = j2;
        this.g = i3;
        this.h = str;
        this.i = str3;
        this.j = str5;
        this.k = i4;
        this.t = -1;
        this.l = list;
        this.m = str2;
        this.n = j3;
        this.o = i5;
        this.p = str4;
        this.q = f2;
        this.r = j4;
        this.s = z;
    }

    public WakeLockEvent(long j2, int i2, String str, int i3, List<String> list, String str2, long j3, int i4, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this(2, j2, i2, str, i3, list, str2, j3, i4, str3, str4, f2, j4, str5, z);
    }

    public final long i() {
        return this.t;
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.f;
    }

    public final String l() {
        String str = this.h;
        int i2 = this.k;
        List<String> list = this.l;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i3 = this.o;
        String str3 = this.i;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.p;
        if (str4 == null) {
            str4 = str2;
        }
        float f2 = this.q;
        String str5 = this.j;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.o(parcel, 2, k());
        o80.s(parcel, 4, this.h, false);
        o80.l(parcel, 5, this.k);
        o80.u(parcel, 6, this.l, false);
        o80.o(parcel, 8, this.n);
        o80.s(parcel, 10, this.i, false);
        o80.l(parcel, 11, j());
        o80.s(parcel, 12, this.m, false);
        o80.s(parcel, 13, this.p, false);
        o80.l(parcel, 14, this.o);
        o80.i(parcel, 15, this.q);
        o80.o(parcel, 16, this.r);
        o80.s(parcel, 17, this.j, false);
        o80.c(parcel, 18, this.s);
        o80.b(parcel, a);
    }
}
