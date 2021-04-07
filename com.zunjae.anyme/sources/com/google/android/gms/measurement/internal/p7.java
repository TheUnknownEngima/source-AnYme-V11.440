package com.google.android.gms.measurement.internal;

import java.util.Map;

final /* synthetic */ class p7 implements Runnable {
    private final q7 e;
    private final int f;
    private final Exception g;
    private final byte[] h;
    private final Map i;

    p7(q7 q7Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.e = q7Var;
        this.f = i2;
        this.g = exc;
        this.h = bArr;
        this.i = map;
    }

    public final void run() {
        this.e.a(this.f, this.g, this.h, this.i);
    }
}
