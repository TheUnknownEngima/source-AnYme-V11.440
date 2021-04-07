package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new f0();
    private IBinder e;

    public BinderWrapper(IBinder iBinder) {
        this.e = null;
        this.e = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.e = null;
        this.e = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, f0 f0Var) {
        this(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.e);
    }
}
