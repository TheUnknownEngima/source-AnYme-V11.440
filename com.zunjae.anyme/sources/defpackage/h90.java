package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: h90  reason: default package */
public final class h90 extends c90 implements f90 {
    h90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean Z0(boolean z) {
        Parcel p3 = p3();
        e90.a(p3, true);
        Parcel q3 = q3(2, p3);
        boolean b = e90.b(q3);
        q3.recycle();
        return b;
    }

    public final String f() {
        Parcel q3 = q3(1, p3());
        String readString = q3.readString();
        q3.recycle();
        return readString;
    }
}
