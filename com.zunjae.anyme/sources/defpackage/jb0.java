package defpackage;

import android.os.Parcel;
import android.view.Surface;

/* renamed from: jb0  reason: default package */
public abstract class jb0 extends m90 implements hb0 {
    public jb0() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i == 2) {
                l3(parcel.readInt());
            } else if (i == 3) {
                c2();
            } else if (i != 4) {
                return false;
            } else {
                r();
                throw null;
            }
            parcel2.writeNoException();
            return true;
        }
        t1(parcel.readInt(), parcel.readInt(), (Surface) cb0.b(parcel, Surface.CREATOR));
        throw null;
    }
}
