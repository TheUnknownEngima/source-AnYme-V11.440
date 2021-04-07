package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class s implements Parcelable.Creator<r> {
    static void c(r rVar, Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.e(parcel, 2, rVar.e, false);
        o80.b(parcel, a);
    }

    /* renamed from: a */
    public r createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            if (n80.l(s) != 2) {
                n80.z(parcel, s);
            } else {
                bundle = n80.a(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new r(bundle);
    }

    /* renamed from: b */
    public r[] newArray(int i) {
        return new r[i];
    }
}
