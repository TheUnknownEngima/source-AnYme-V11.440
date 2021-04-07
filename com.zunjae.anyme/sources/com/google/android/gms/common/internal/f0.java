package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

final class f0 implements Parcelable.Creator<BinderWrapper> {
    f0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (f0) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
