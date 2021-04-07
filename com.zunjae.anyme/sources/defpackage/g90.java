package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g90  reason: default package */
public abstract class g90 extends d90 implements f90 {
    public static f90 p3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof f90 ? (f90) queryLocalInterface : new h90(iBinder);
    }
}
