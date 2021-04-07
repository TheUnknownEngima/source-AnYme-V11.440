package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.l7;
import java.util.List;
import java.util.Map;

final class a implements l7 {
    private final /* synthetic */ uq0 a;

    a(uq0 uq0) {
        this.a = uq0;
    }

    public final int a(String str) {
        return this.a.J(str);
    }

    public final String b() {
        return this.a.R();
    }

    public final String c() {
        return this.a.K();
    }

    public final String d() {
        return this.a.F();
    }

    public final List<Bundle> e(String str, String str2) {
        return this.a.z(str, str2);
    }

    public final void f(String str) {
        this.a.B(str);
    }

    public final long g() {
        return this.a.M();
    }

    public final void h(String str) {
        this.a.G(str);
    }

    public final Map<String, Object> i(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    public final void j(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    public final void k(String str, String str2, Bundle bundle) {
        this.a.q(str, str2, bundle);
    }

    public final void p(Bundle bundle) {
        this.a.j(bundle);
    }

    public final String zza() {
        return this.a.P();
    }
}
