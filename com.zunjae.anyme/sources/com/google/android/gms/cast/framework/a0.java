package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.b;

public interface a0 extends IInterface {

    public static abstract class a extends m90 implements a0 {
        public static a0 q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            return queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new b0(iBinder);
        }
    }

    void K(int i);

    void i(int i);

    void j(Bundle bundle);

    void q(b bVar);

    void w(d dVar, String str, String str2, boolean z);

    void z1(boolean z, int i);
}
