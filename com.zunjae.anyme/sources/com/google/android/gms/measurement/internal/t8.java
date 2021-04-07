package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class t8 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ la j;
    private final /* synthetic */ c8 k;

    t8(c8 c8Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, la laVar) {
        this.k = c8Var;
        this.e = atomicReference;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
        this.j = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<ea> v0;
        synchronized (this.e) {
            try {
                u3 l0 = this.k.d;
                if (l0 == null) {
                    this.k.h().E().d("(legacy) Failed to get user properties; not connected to service", c4.w(this.f), this.g, this.h);
                    this.e.set(Collections.emptyList());
                    this.e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f)) {
                    atomicReference2 = this.e;
                    v0 = l0.E1(this.g, this.h, this.i, this.j);
                } else {
                    atomicReference2 = this.e;
                    v0 = l0.v0(this.f, this.g, this.h, this.i);
                }
                atomicReference2.set(v0);
                this.k.e0();
                atomicReference = this.e;
                atomicReference.notify();
            } catch (RemoteException e2) {
                try {
                    this.k.h().E().d("(legacy) Failed to get user properties; remote exception", c4.w(this.f), this.g, e2);
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
