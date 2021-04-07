package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: c71  reason: default package */
public final class c71 extends nq0 implements a71 {
    c71(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void p(Bundle bundle) {
        Parcel p3 = p3();
        ir0.c(p3, bundle);
        r3(1, p3);
    }
}
