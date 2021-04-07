package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class w<T extends IInterface> extends h<T> {
    private final a.h<T> z;

    /* access modifiers changed from: protected */
    public void K(int i, T t) {
        this.z.h(i, t);
    }

    /* access modifiers changed from: protected */
    public String j() {
        return this.z.j();
    }

    /* access modifiers changed from: protected */
    public T k(IBinder iBinder) {
        return this.z.k(iBinder);
    }

    public a.h<T> n0() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    public String p() {
        return this.z.p();
    }
}
