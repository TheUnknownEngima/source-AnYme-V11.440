package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rq0  reason: default package */
public final class rq0 extends nq0 implements pq0 {
    rq0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void V1(String str, String str2, Bundle bundle, long j) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        ir0.c(p3, bundle);
        p3.writeLong(j);
        r3(1, p3);
    }

    public final int zza() {
        Parcel q3 = q3(2, p3());
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }
}
