package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;

public final class Status extends m80 implements j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new p();
    public static final Status i = new Status(0);
    public static final Status j = new Status(8);
    public static final Status k = new Status(15);
    public static final Status l = new Status(16);
    private final int e;
    private final int f;
    private final String g;
    private final PendingIntent h;

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.e == status.e && this.f == status.f && q.a(this.g, status.g) && q.a(this.h, status.h);
    }

    public final Status g() {
        return this;
    }

    public final int hashCode() {
        return q.b(Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h);
    }

    public final int i() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final boolean k() {
        return this.h != null;
    }

    public final boolean l() {
        return this.f <= 0;
    }

    public final String m() {
        String str = this.g;
        return str != null ? str : d.a(this.f);
    }

    public final String toString() {
        q.a c = q.c(this);
        c.a("statusCode", m());
        c.a("resolution", this.h);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, i());
        o80.s(parcel, 2, j(), false);
        o80.r(parcel, 3, this.h, i2, false);
        o80.l(parcel, 1000, this.e);
        o80.b(parcel, a);
    }
}
