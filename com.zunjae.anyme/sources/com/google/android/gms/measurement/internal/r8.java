package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class r8 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ la i;
    private final /* synthetic */ c8 j;

    r8(c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, la laVar) {
        this.j = c8Var;
        this.e = atomicReference;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<ua> o1;
        synchronized (this.e) {
            try {
                u3 l0 = this.j.d;
                if (l0 == null) {
                    this.j.h().E().d("(legacy) Failed to get conditional properties; not connected to service", c4.w(this.f), this.g, this.h);
                    this.e.set(Collections.emptyList());
                    this.e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f)) {
                    atomicReference2 = this.e;
                    o1 = l0.p1(this.g, this.h, this.i);
                } else {
                    atomicReference2 = this.e;
                    o1 = l0.o1(this.f, this.g, this.h);
                }
                atomicReference2.set(o1);
                this.j.e0();
                atomicReference = this.e;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.j.h().E().d("(legacy) Failed to get conditional properties; remote exception", c4.w(this.f), this.g, e2);
                    this.e.set(Collections.emptyList());
                    atomicReference = this.e;
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            }
        }
    }
}
