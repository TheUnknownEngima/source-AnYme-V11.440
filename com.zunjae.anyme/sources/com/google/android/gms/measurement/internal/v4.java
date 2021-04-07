package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.r;

public final class v4 {
    private final String a;
    private boolean b;
    private String c;
    private final /* synthetic */ p4 d;

    public v4(p4 p4Var, String str, String str2) {
        this.d = p4Var;
        r.f(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.D().getString(this.a, (String) null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.D().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
