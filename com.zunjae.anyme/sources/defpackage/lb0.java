package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: lb0  reason: default package */
public final class lb0 extends fa0 implements ib0 {
    lb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
    }

    public final void d() {
        s3(3, p3());
    }

    public final void z2(hb0 hb0) {
        Parcel p3 = p3();
        cb0.c(p3, hb0);
        s3(6, p3);
    }
}
