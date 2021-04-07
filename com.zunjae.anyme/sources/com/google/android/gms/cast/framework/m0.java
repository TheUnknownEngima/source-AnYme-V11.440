package com.google.android.gms.cast.framework;

import android.os.Parcel;
import defpackage.w80;

public abstract class m0 extends m90 implements j0 {
    public m0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                w80 C = C();
                parcel2.writeNoException();
                cb0.c(parcel2, C);
                return true;
            case 2:
                s2(w80.a.q3(parcel.readStrongBinder()));
                break;
            case 3:
                s0(w80.a.q3(parcel.readStrongBinder()), parcel.readString());
                break;
            case 4:
                H2(w80.a.q3(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 5:
                G1(w80.a.q3(parcel.readStrongBinder()));
                break;
            case 6:
                X2(w80.a.q3(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                N(w80.a.q3(parcel.readStrongBinder()), parcel.readString());
                break;
            case 8:
                n3(w80.a.q3(parcel.readStrongBinder()), cb0.e(parcel));
                break;
            case 9:
                R(w80.a.q3(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                q0(w80.a.q3(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 11:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
