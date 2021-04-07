package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o71  reason: default package */
public final class o71 extends j90 implements m71 {
    o71(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void b3(q71 q71, k71 k71) {
        Parcel p3 = p3();
        k90.c(p3, q71);
        k90.b(p3, k71);
        r3(12, p3);
    }
}
