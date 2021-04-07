package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.util.List;
import java.util.Map;

final class l4 implements Runnable {
    private final i4 e;
    private final int f;
    private final Throwable g;
    private final byte[] h;
    private final String i;
    private final Map<String, List<String>> j;

    private l4(String str, i4 i4Var, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        r.j(i4Var);
        this.e = i4Var;
        this.f = i2;
        this.g = th;
        this.h = bArr;
        this.i = str;
        this.j = map;
    }

    public final void run() {
        this.e.a(this.i, this.f, this.g, this.h, this.j);
    }
}
