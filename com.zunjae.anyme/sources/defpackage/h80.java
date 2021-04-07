package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.a0;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

/* renamed from: h80  reason: default package */
public final class h80 extends h<b70> {
    private static final u60 D = new u60("CastClientImplCxless");
    private final long A;
    private final Bundle B;
    private final String C;
    private final CastDevice z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h80(Context context, Looper looper, d dVar, CastDevice castDevice, long j, Bundle bundle, String str, f.a aVar, f.b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.z = castDevice;
        this.A = j;
        this.B = bundle;
        this.C = str;
    }

    public final void d() {
        try {
            ((b70) D()).d();
        } catch (RemoteException | IllegalStateException e) {
            D.b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.d();
        }
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof b70 ? (b70) queryLocalInterface : new a70(iBinder);
    }

    public final int m() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final com.google.android.gms.common.d[] v() {
        return a0.h;
    }

    /* access modifiers changed from: protected */
    public final Bundle z() {
        Bundle bundle = new Bundle();
        D.a("getRemoteService()", new Object[0]);
        this.z.u(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.A);
        bundle.putString("connectionless_client_record_id", this.C);
        Bundle bundle2 = this.B;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }
}
