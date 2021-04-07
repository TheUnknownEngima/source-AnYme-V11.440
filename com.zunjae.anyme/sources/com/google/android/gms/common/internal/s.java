package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class s extends m80 {
    public static final Parcelable.Creator<s> CREATOR = new c0();
    private final int e;
    private final Account f;
    private final int g;
    private final GoogleSignInAccount h;

    s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.e = i;
        this.f = account;
        this.g = i2;
        this.h = googleSignInAccount;
    }

    public s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account i() {
        return this.f;
    }

    public int j() {
        return this.g;
    }

    public GoogleSignInAccount k() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.l(parcel, 1, this.e);
        o80.r(parcel, 2, i(), i, false);
        o80.l(parcel, 3, j());
        o80.r(parcel, 4, k(), i, false);
        o80.b(parcel, a);
    }
}
