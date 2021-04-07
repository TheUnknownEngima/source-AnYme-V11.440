package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: d71  reason: default package */
public abstract class d71 extends is0 implements a71 {
    public d71() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        p((Bundle) ir0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
