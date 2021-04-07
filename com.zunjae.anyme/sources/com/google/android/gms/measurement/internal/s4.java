package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.r;

public final class s4 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ p4 e;

    private s4(p4 p4Var, String str, long j) {
        this.e = p4Var;
        r.f(str);
        r.a(j > 0);
        this.a = String.valueOf(str).concat(":start");
        this.b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.d = j;
    }

    private final void c() {
        this.e.b();
        long c2 = this.e.l().c();
        SharedPreferences.Editor edit = this.e.D().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, c2);
        edit.apply();
    }

    private final long d() {
        return this.e.D().getLong(this.a, 0);
    }

    public final Pair<String, Long> a() {
        long j;
        this.e.b();
        this.e.b();
        long d2 = d();
        if (d2 == 0) {
            c();
            j = 0;
        } else {
            j = Math.abs(d2 - this.e.l().c());
        }
        long j2 = this.d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            c();
            return null;
        }
        String string = this.e.D().getString(this.c, (String) null);
        long j3 = this.e.D().getLong(this.b, 0);
        c();
        return (string == null || j3 <= 0) ? p4.D : new Pair<>(string, Long.valueOf(j3));
    }

    public final void b(String str, long j) {
        this.e.b();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.D().getLong(this.b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.D().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.e.g().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.e.D().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }
}
