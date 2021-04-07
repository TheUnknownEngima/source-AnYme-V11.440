package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

public interface x extends IInterface {

    public static abstract class a extends m90 implements x {
        public static x q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            return queryLocalInterface instanceof x ? (x) queryLocalInterface : new z(iBinder);
        }
    }

    c0 I0();

    boolean k();

    h0 s();
}
