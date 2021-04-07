package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.d;

/* renamed from: c70  reason: default package */
public abstract class c70 extends m90 implements d70 {
    public c70() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                e(parcel.readInt());
                return true;
            case 2:
                w((d) cb0.b(parcel, d.CREATOR), parcel.readString(), parcel.readString(), cb0.e(parcel));
                return true;
            case 3:
                K(parcel.readInt());
                return true;
            case 4:
                U(parcel.readString(), parcel.readDouble(), cb0.e(parcel));
                return true;
            case 5:
                A2(parcel.readString(), parcel.readString());
                return true;
            case 6:
                Y1(parcel.readString(), parcel.createByteArray());
                return true;
            case 7:
                m2(parcel.readInt());
                return true;
            case 8:
                U1(parcel.readInt());
                return true;
            case 9:
                U2(parcel.readInt());
                return true;
            case 10:
                U0(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                d3(parcel.readString(), parcel.readLong());
                return true;
            case 12:
                Z((x60) cb0.b(parcel, x60.CREATOR));
                return true;
            case 13:
                E2((j80) cb0.b(parcel, j80.CREATOR));
                return true;
            case 14:
                H0(parcel.readInt());
                return true;
            case 15:
                Q2(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
