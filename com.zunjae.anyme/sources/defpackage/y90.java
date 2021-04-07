package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: y90  reason: default package */
public final class y90 extends fa0 implements z90 {
    y90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    public final void D1(String str, Bundle bundle, int i) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, bundle);
        p3.writeInt(i);
        r3(6, p3);
    }

    public final void L2(String str, Bundle bundle) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, bundle);
        r3(3, p3);
    }

    public final void Y(String str, Bundle bundle) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, bundle);
        r3(1, p3);
    }

    public final void f3(String str, Bundle bundle) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, bundle);
        r3(2, p3);
    }

    public final void o2(String str, Bundle bundle) {
        Parcel p3 = p3();
        p3.writeString(str);
        cb0.d(p3, bundle);
        r3(4, p3);
    }
}
