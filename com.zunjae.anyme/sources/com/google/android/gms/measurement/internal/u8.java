package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

final class u8 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ la g;
    private final /* synthetic */ a71 h;
    private final /* synthetic */ c8 i;

    u8(c8 c8Var, String str, String str2, la laVar, a71 a71) {
        this.i = c8Var;
        this.e = str;
        this.f = str2;
        this.g = laVar;
        this.h = a71;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            u3 l0 = this.i.d;
            if (l0 == null) {
                this.i.h().E().c("Failed to get conditional properties; not connected to service", this.e, this.f);
            } else {
                arrayList = fa.s0(l0.p1(this.e, this.f, this.g));
                this.i.e0();
            }
        } catch (RemoteException e2) {
            this.i.h().E().d("Failed to get conditional properties; remote exception", this.e, this.f, e2);
        } catch (Throwable th) {
            this.i.g().S(this.h, arrayList);
            throw th;
        }
        this.i.g().S(this.h, arrayList);
    }
}
