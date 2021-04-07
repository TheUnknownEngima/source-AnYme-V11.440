package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class c0 implements Parcelable.Creator<s> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                account = (Account) n80.e(parcel, s, Account.CREATOR);
            } else if (l == 3) {
                i2 = n80.u(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                googleSignInAccount = (GoogleSignInAccount) n80.e(parcel, s, GoogleSignInAccount.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new s(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s[i];
    }
}
