package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

/* renamed from: gb0  reason: default package */
public final class gb0 extends h<ib0> {
    public gb0(Context context, Looper looper, d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 83, dVar, aVar, bVar);
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
