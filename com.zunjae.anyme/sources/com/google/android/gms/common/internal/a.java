package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.k;

public class a extends k.a {
    public static Account r3(k kVar) {
        if (kVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return kVar.z();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
