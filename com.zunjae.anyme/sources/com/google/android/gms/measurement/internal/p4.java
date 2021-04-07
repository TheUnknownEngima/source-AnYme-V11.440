package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.c60;

final class p4 extends d6 {
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final v4 A = new v4(this, "deferred_attribution_cache", (String) null);
    public final t4 B = new t4(this, "deferred_attribution_cache_timestamp", 0);
    public final q4 C = new q4(this, "default_event_parameters", (Bundle) null);
    private SharedPreferences c;
    public s4 d;
    public final t4 e = new t4(this, "last_upload", 0);
    public final t4 f = new t4(this, "last_upload_attempt", 0);
    public final t4 g = new t4(this, "backoff", 0);
    public final t4 h = new t4(this, "last_delete_stale", 0);
    public final t4 i = new t4(this, "midnight_offset", 0);
    public final t4 j = new t4(this, "first_open_time", 0);
    public final t4 k = new t4(this, "app_install_time", 0);
    public final v4 l = new v4(this, "app_instance_id", (String) null);
    private String m;
    private boolean n;
    private long o;
    public final t4 p = new t4(this, "time_before_start", 10000);
    public final t4 q = new t4(this, "session_timeout", 1800000);
    public final r4 r = new r4(this, "start_new_session", true);
    public final v4 s = new v4(this, "non_personalized_ads", (String) null);
    public final r4 t = new r4(this, "allow_remote_dynamite", false);
    public final t4 u = new t4(this, "last_pause_time", 0);
    public boolean v;
    public r4 w = new r4(this, "app_backgrounded", false);
    public r4 x = new r4(this, "deep_link_retrieval_complete", false);
    public t4 y = new t4(this, "deep_link_retrieval_attempts", 0);
    public final v4 z = new v4(this, "firebase_feature_rollouts", (String) null);

    p4(h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: package-private */
    public final void A(String str) {
        b();
        SharedPreferences.Editor edit = D().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void B(boolean z2) {
        b();
        h().M().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void C(String str) {
        b();
        SharedPreferences.Editor edit = D().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences D() {
        b();
        m();
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        b();
        return D().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String F() {
        b();
        return D().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final Boolean G() {
        b();
        if (!D().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(D().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        b();
        Boolean I = I();
        SharedPreferences.Editor edit = D().edit();
        edit.clear();
        edit.apply();
        if (I != null) {
            u(I);
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean I() {
        b();
        if (D().contains("measurement_enabled")) {
            return Boolean.valueOf(D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean J() {
        if (!c31.a() || !j().s(u.P0)) {
            return null;
        }
        b();
        if (D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final e K() {
        b();
        return e.b(D().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: protected */
    public final String L() {
        b();
        String string = D().getString("previous_os_version", (String) null);
        c().m();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = D().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final boolean M() {
        return this.c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: protected */
    public final void k() {
        SharedPreferences sharedPreferences = n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new s4(this, "health_monitor", Math.max(0, u.c.a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> t(String str) {
        b();
        long a = l().a();
        if (this.m != null && a < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = a + j().A(str);
        c60.d(true);
        try {
            c60.a b = c60.b(n());
            if (b != null) {
                this.m = b.a();
                this.n = b.b();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e2) {
            h().L().b("Unable to get advertising id", e2);
            this.m = "";
        }
        c60.d(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    /* access modifiers changed from: package-private */
    public final void u(Boolean bool) {
        b();
        SharedPreferences.Editor edit = D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void v(boolean z2) {
        b();
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean w(int i2) {
        return e.g(i2, D().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final boolean x(long j2) {
        return j2 - this.q.a() > this.u.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean y(e eVar, int i2) {
        if (!c31.a() || !j().s(u.P0)) {
            return false;
        }
        b();
        if (!w(i2)) {
            return false;
        }
        SharedPreferences.Editor edit = D().edit();
        edit.putString("consent_settings", eVar.e());
        edit.putInt("consent_source", i2);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void z(Boolean bool) {
        if (c31.a() && j().s(u.P0)) {
            b();
            SharedPreferences.Editor edit = D().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
    }
}
