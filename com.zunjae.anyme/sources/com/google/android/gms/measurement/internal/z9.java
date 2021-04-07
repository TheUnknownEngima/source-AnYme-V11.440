package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class z9 implements i4 {
    private final /* synthetic */ String a;
    private final /* synthetic */ x9 b;

    z9(x9 x9Var, String str) {
        this.b = x9Var;
        this.a = str;
    }

    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.b.i(i, th, bArr, this.a);
    }
}
