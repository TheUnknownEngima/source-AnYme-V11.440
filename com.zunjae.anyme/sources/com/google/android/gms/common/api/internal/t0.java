package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.f;

abstract class t0<T> extends w {
    protected final f81<T> a;

    public t0(int i, f81<T> f81) {
        super(i);
        this.a = f81;
    }

    public void b(Status status) {
        this.a.d(new b(status));
    }

    public void d(RuntimeException runtimeException) {
        this.a.d(runtimeException);
    }

    public final void f(f.a<?> aVar) {
        try {
            i(aVar);
        } catch (DeadObjectException e) {
            b(i0.a(e));
            throw e;
        } catch (RemoteException e2) {
            b(i0.a(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void i(f.a<?> aVar);
}
