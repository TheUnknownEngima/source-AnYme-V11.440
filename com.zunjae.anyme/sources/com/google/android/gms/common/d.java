package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;

public class d extends m80 {
    public static final Parcelable.Creator<d> CREATOR = new m();
    private final String e;
    @Deprecated
    private final int f;
    private final long g;

    public d(String str, int i, long j) {
        this.e = str;
        this.f = i;
        this.g = j;
    }

    public d(String str, long j) {
        this.e = str;
        this.g = j;
        this.f = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return ((i() != null && i().equals(dVar.i())) || (i() == null && dVar.i() == null)) && j() == dVar.j();
        }
    }

    public int hashCode() {
        return q.b(i(), Long.valueOf(j()));
    }

    public String i() {
        return this.e;
    }

    public long j() {
        long j = this.g;
        return j == -1 ? (long) this.f : j;
    }

    public String toString() {
        q.a c = q.c(this);
        c.a("name", i());
        c.a("version", Long.valueOf(j()));
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 1, i(), false);
        o80.l(parcel, 2, this.f);
        o80.o(parcel, 3, j());
        o80.b(parcel, a);
    }
}
