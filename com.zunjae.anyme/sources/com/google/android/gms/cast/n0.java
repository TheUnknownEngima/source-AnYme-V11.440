package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

final class n0 extends c70 {
    final /* synthetic */ c0 a;

    n0(c0 c0Var) {
        this.a = c0Var;
    }

    public final void A2(String str, String str2) {
        c0.E.a("Receive (type=text, ns=%s) %s", str, str2);
        this.a.j.post(new x0(this, str, str2));
    }

    public final void E2(j80 j80) {
        this.a.j.post(new v0(this, j80));
    }

    public final void H0(int i) {
        this.a.j.post(new p0(this, i));
    }

    public final void K(int i) {
        this.a.b0(i);
    }

    public final void Q2(int i) {
        this.a.j.post(new t0(this, i));
    }

    public final void U(String str, double d, boolean z) {
        c0.E.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    public final void U0(String str, long j, int i) {
        this.a.D(j, i);
    }

    public final void U1(int i) {
        this.a.e0(i);
    }

    public final void U2(int i) {
        this.a.e0(i);
        if (this.a.C != null) {
            this.a.j.post(new s0(this, i));
        }
    }

    public final void Y1(String str, byte[] bArr) {
        c0.E.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    public final void Z(x60 x60) {
        this.a.j.post(new u0(this, x60));
    }

    public final void d3(String str, long j) {
        this.a.D(j, 0);
    }

    public final void e(int i) {
        this.a.j.post(new r0(this, i));
    }

    public final void m2(int i) {
        this.a.e0(i);
    }

    public final void w(d dVar, String str, String str2, boolean z) {
        d unused = this.a.s = dVar;
        String unused2 = this.a.t = str;
        this.a.E(new c80(new Status(0), dVar, str, str2, z));
    }
}
