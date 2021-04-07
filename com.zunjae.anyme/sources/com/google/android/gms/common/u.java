package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.n0;
import javax.annotation.Nullable;

public final class u extends m80 {
    public static final Parcelable.Creator<u> CREATOR = new x();
    private final String e;
    @Nullable
    private final o f;
    private final boolean g;
    private final boolean h;

    u(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.e = str;
        this.f = i(iBinder);
        this.g = z;
        this.h = z2;
    }

    u(String str, @Nullable o oVar, boolean z, boolean z2) {
        this.e = str;
        this.f = oVar;
        this.g = z;
        this.h = z2;
    }

    @Nullable
    private static o i(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            w80 b = n0.q3(iBinder).b();
            byte[] bArr = b == null ? null : (byte[]) x80.r3(b);
            if (bArr != null) {
                return new r(bArr);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = o80.a(parcel);
        o80.s(parcel, 1, this.e, false);
        o oVar = this.f;
        if (oVar == null) {
            oVar = null;
        } else {
            oVar.asBinder();
        }
        o80.k(parcel, 2, oVar, false);
        o80.c(parcel, 3, this.g);
        o80.c(parcel, 4, this.h);
        o80.b(parcel, a);
    }
}
