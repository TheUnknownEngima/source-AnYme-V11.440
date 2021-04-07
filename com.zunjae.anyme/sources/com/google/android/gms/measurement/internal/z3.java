package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.c;

public final class z3 extends c<u3> {
    public z3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final String j() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final /* synthetic */ IInterface k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof u3 ? (u3) queryLocalInterface : new w3(iBinder);
    }

    public final int m() {
        return i.a;
    }

    /* access modifiers changed from: protected */
    public final String p() {
        return "com.google.android.gms.measurement.START";
    }
}
