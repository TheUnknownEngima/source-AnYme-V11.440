package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e70  reason: default package */
public final class e70 extends fa0 implements f70 {
    e70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void G0(z60 z60, String[] strArr) {
        Parcel p3 = p3();
        cb0.c(p3, z60);
        p3.writeStringArray(strArr);
        s3(6, p3);
    }

    public final void a1(z60 z60, String[] strArr) {
        Parcel p3 = p3();
        cb0.c(p3, z60);
        p3.writeStringArray(strArr);
        s3(5, p3);
    }
}
