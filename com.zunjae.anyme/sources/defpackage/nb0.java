package defpackage;

import android.os.Parcel;

/* renamed from: nb0  reason: default package */
public abstract class nb0 extends m90 implements kb0 {
    public nb0() {
        super("com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        r1(parcel.readInt());
        return true;
    }
}
