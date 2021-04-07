package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.d;

public final class u0<ResultT> extends w {
    private final q<a.b, ResultT> a;
    private final f81<ResultT> b;
    private final p c;

    public u0(int i, q<a.b, ResultT> qVar, f81<ResultT> f81, p pVar) {
        super(i);
        this.b = f81;
        this.a = qVar;
        this.c = pVar;
    }

    public final void b(Status status) {
        this.b.d(this.c.a(status));
    }

    public final void c(a1 a1Var, boolean z) {
        a1Var.a(this.b, z);
    }

    public final void d(RuntimeException runtimeException) {
        this.b.d(runtimeException);
    }

    public final void f(f.a<?> aVar) {
        try {
            this.a.b(aVar.n(), this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            b(i0.a(e2));
        } catch (RuntimeException e3) {
            d(e3);
        }
    }

    public final d[] g(f.a<?> aVar) {
        return this.a.d();
    }

    public final boolean h(f.a<?> aVar) {
        return this.a.c();
    }
}
