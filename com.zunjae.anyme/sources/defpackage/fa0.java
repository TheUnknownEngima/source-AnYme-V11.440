package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fa0  reason: default package */
public class fa0 implements IInterface {
    private final IBinder a;
    private final String b;

    protected fa0(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Parcel p3() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel q3(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void r3(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void s3(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
