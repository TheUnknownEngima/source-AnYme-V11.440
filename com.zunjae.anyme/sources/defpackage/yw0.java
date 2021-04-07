package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: yw0  reason: default package */
public abstract class yw0 extends is0 implements wt0 {
    public static wt0 q3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof wt0 ? (wt0) queryLocalInterface : new xv0(iBinder);
    }
}
