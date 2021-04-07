package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

@Deprecated
/* renamed from: fb0  reason: default package */
public final class fb0 extends h<ib0> implements IBinder.DeathRecipient {
    private static final u60 z = new u60("CastRemoteDisplayClientImpl");

    public fb0(Context context, Looper looper, d dVar, CastDevice castDevice, Bundle bundle, g.b bVar, f.a aVar, f.b bVar2) {
        super(context, looper, 83, dVar, aVar, bVar2);
        z.a("instance created", new Object[0]);
    }

    public final void binderDied() {
    }

    public final void d() {
        z.a("disconnect", new Object[0]);
        try {
            ((ib0) D()).d();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.d();
        }
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    public final /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        return queryLocalInterface instanceof ib0 ? (ib0) queryLocalInterface : new lb0(iBinder);
    }

    public final int m() {
        return i.a;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }
}
