package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.r;

public final class t4 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ p4 e;

    public t4(p4 p4Var, String str, long j) {
        this.e = p4Var;
        r.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.D().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
