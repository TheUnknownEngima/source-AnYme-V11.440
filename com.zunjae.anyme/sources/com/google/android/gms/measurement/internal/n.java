package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class n extends m80 implements Iterable<String> {
    public static final Parcelable.Creator<n> CREATOR = new p();
    /* access modifiers changed from: private */
    public final Bundle e;

    n(Bundle bundle) {
        this.e = bundle;
    }

    public final int i() {
        return this.e.size();
    }

    public final Iterator<String> iterator() {
        return new q(this);
    }

    /* access modifiers changed from: package-private */
    public final Object k(String str) {
        return this.e.get(str);
    }

    public final Bundle l() {
        return new Bundle(this.e);
    }

    /* access modifiers changed from: package-private */
    public final Long m(String str) {
        return Long.valueOf(this.e.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double n(String str) {
        return Double.valueOf(this.e.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String o(String str) {
        return this.e.getString(str);
    }

    public final String toString() {
        return this.e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.e(parcel, 2, l(), false);
        o80.b(parcel, a);
    }
}
