package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.a;

final class w4 implements Runnable {
    private final /* synthetic */ wt0 e;
    private final /* synthetic */ ServiceConnection f;
    private final /* synthetic */ x4 g;

    w4(x4 x4Var, wt0 wt0, ServiceConnection serviceConnection) {
        this.g = x4Var;
        this.e = wt0;
        this.f = serviceConnection;
    }

    public final void run() {
        e4 E;
        String str;
        x4 x4Var = this.g;
        u4 u4Var = x4Var.b;
        String a = x4Var.a;
        wt0 wt0 = this.e;
        ServiceConnection serviceConnection = this.f;
        Bundle a2 = u4Var.a(a, wt0);
        u4Var.a.f().b();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                E = u4Var.a.h().H();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    E = u4Var.a.h().E();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    u4Var.a.h().M().b("InstallReferrer API result", string);
                    fa G = u4Var.a.G();
                    String valueOf = String.valueOf(string);
                    Bundle A = G.A(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (A == null) {
                        E = u4Var.a.h().E();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = A.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                E = u4Var.a.h().E();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                A.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == u4Var.a.x().k.a()) {
                            E = u4Var.a.h().M();
                            str = "Install Referrer campaign has already been logged";
                        } else if (!u31.a() || !u4Var.a.b().s(u.v0) || u4Var.a.p()) {
                            u4Var.a.x().k.b(j);
                            u4Var.a.h().M().b("Logging Install Referrer campaign from sdk with ", "referrer API");
                            A.putString("_cis", "referrer API");
                            u4Var.a.F().X("auto", "_cmp", A);
                        }
                    }
                }
            }
            E.a(str);
        }
        if (serviceConnection != null) {
            a.b().c(u4Var.a.n(), serviceConnection);
        }
    }
}
