package com.google.android.gms.measurement.internal;

final class b6 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ long h;
    private final /* synthetic */ i5 i;

    b6(i5 i5Var, String str, String str2, String str3, long j) {
        this.i = i5Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = j;
    }

    public final void run() {
        String str = this.e;
        if (str == null) {
            this.i.a.k0().O().R(this.f, (u7) null);
            return;
        }
        this.i.a.k0().O().R(this.f, new u7(this.g, str, this.h));
    }
}
