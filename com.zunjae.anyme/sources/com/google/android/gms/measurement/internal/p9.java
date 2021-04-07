package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class p9 {
    private long a;
    private long b;
    private final k c = new o9(this, this.d.a);
    private final /* synthetic */ j9 d;

    public p9(j9 j9Var) {
        this.d = j9Var;
        long a2 = j9Var.l().a();
        this.a = a2;
        this.b = a2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.d.b();
        d(false, false, this.d.l().a());
        this.d.m().v(this.d.l().a());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c.e();
        this.a = 0;
        this.b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        this.d.b();
        this.c.e();
        this.a = j;
        this.b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.b();
        this.d.w();
        if (!g41.a() || !this.d.j().s(u.s0) || this.d.a.p()) {
            this.d.i().u.b(this.d.l().c());
        }
        long j2 = j - this.a;
        if (z || j2 >= 1000) {
            if (this.d.j().s(u.U) && !z2) {
                j2 = (!h41.a() || !this.d.j().s(u.W)) ? e() : g(j);
            }
            this.d.h().M().b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            t7.O(this.d.s().D(!this.d.j().H().booleanValue()), bundle, true);
            if (this.d.j().s(u.U) && !this.d.j().s(u.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.d.j().s(u.V) || !z2) {
                this.d.p().X("auto", "_e", bundle);
            }
            this.a = j;
            this.c.e();
            this.c.c(3600000);
            return true;
        }
        this.d.h().M().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        long a2 = this.d.l().a();
        long j = a2 - this.b;
        this.b = a2;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final void f(long j) {
        this.c.e();
    }

    /* access modifiers changed from: package-private */
    public final long g(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }
}
