package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;

public final class Scope extends m80 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o();
    private final int e;
    private final String f;

    Scope(int i, String str) {
        r.g(str, "scopeUri must not be null or empty");
        this.e = i;
        this.f = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f.equals(((Scope) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String i() {
        return this.f;
    }

    public final String toString() {
        return this.f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.s(parcel, 2, i(), false);
        o80.b(parcel, a);
    }
}
