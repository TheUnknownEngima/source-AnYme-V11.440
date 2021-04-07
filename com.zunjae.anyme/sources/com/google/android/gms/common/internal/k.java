package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface k extends IInterface {

    public static abstract class a extends cp0 implements k {

        /* renamed from: com.google.android.gms.common.internal.k$a$a  reason: collision with other inner class name */
        public static class C0091a extends dp0 implements k {
            C0091a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account z() {
                Parcel q3 = q3(2, p3());
                Account account = (Account) ep0.b(q3, Account.CREATOR);
                q3.recycle();
                return account;
            }
        }

        public static k q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof k ? (k) queryLocalInterface : new C0091a(iBinder);
        }
    }

    Account z();
}
