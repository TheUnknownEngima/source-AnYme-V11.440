package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: kq0  reason: default package */
public class kq0 extends Binder implements IInterface {
    protected kq0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return p3(i, parcel, parcel2, i2);
    }

    /* access modifiers changed from: protected */
    public abstract boolean p3(int i, Parcel parcel, Parcel parcel2, int i2);
}
