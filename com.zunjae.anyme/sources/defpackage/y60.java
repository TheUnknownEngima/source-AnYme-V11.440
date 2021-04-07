package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: y60  reason: default package */
public abstract class y60 extends m90 implements z60 {
    public y60() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Y2((Bundle) cb0.b(parcel, Bundle.CREATOR));
        return true;
    }
}
