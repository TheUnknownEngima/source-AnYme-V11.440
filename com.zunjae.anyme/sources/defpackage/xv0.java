package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: xv0  reason: default package */
public final class xv0 extends nq0 implements wt0 {
    xv0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle p(Bundle bundle) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        Parcel q3 = q3(1, p3);
        Bundle bundle2 = (Bundle) ir0.a(q3, Bundle.CREATOR);
        q3.recycle();
        return bundle2;
    }
}
