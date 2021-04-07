package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: oq0  reason: default package */
public abstract class oq0 extends is0 implements pq0 {
    public oq0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            V1(parcel.readString(), parcel.readString(), (Bundle) ir0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int zza = zza();
            parcel2.writeNoException();
            parcel2.writeInt(zza);
        }
        return true;
    }
}
