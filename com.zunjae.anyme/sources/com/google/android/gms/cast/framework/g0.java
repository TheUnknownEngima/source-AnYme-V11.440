package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;

public interface g0 extends IInterface {

    public static abstract class a extends m90 implements g0 {
        public static g0 q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            return queryLocalInterface instanceof g0 ? (g0) queryLocalInterface : new i0(iBinder);
        }
    }

    void C2(int i);

    w80 F();

    void Y0(int i);

    void f2(int i);

    boolean u();

    boolean w2();

    boolean y();
}
