package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.cast.a0;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

/* renamed from: x70  reason: default package */
public final class x70 extends h<f70> {
    public x70(Context context, Looper looper, d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 161, dVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    public final /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof f70 ? (f70) queryLocalInterface : new e70(iBinder);
    }

    public final int m() {
        return i.a;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final com.google.android.gms.common.d[] v() {
        return a0.h;
    }
}
