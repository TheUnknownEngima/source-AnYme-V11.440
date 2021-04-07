package com.google.android.exoplayer2;

import android.os.Looper;

public abstract class u implements u0, w0 {
    private final int e;
    private final g0 f = new g0();
    private x0 g;
    private int h;
    private int i;
    private l00 j;
    private f0[] k;
    private long l;
    private long m = Long.MIN_VALUE;
    private boolean n;
    private boolean o;

    public u(int i2) {
        this.e = i2;
    }

    protected static boolean P(rs<?> rsVar, ns nsVar) {
        if (nsVar == null) {
            return true;
        }
        if (rsVar == null) {
            return false;
        }
        return rsVar.e(nsVar);
    }

    /* access modifiers changed from: protected */
    public final x0 A() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final g0 B() {
        this.f.a();
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final int C() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final f0[] D() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final <T extends ts> ps<T> E(f0 f0Var, f0 f0Var2, rs<T> rsVar, ps<T> psVar) {
        ps<T> psVar2 = null;
        if (!(!v50.b(f0Var2.p, f0Var == null ? null : f0Var.p))) {
            return psVar;
        }
        if (f0Var2.p != null) {
            if (rsVar != null) {
                Looper myLooper = Looper.myLooper();
                q40.e(myLooper);
                psVar2 = rsVar.d(myLooper, f0Var2.p);
            } else {
                throw z(new IllegalStateException("Media requires a DrmSessionManager"), f0Var2);
            }
        }
        if (psVar != null) {
            psVar.a();
        }
        return psVar2;
    }

    /* access modifiers changed from: protected */
    public final boolean F() {
        return k() ? this.n : this.j.f();
    }

    /* access modifiers changed from: protected */
    public abstract void G();

    /* access modifiers changed from: protected */
    public void H(boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void I(long j2, boolean z);

    /* access modifiers changed from: protected */
    public void J() {
    }

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    public void L() {
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j2) {
    }

    /* access modifiers changed from: protected */
    public final int N(g0 g0Var, as asVar, boolean z) {
        int j2 = this.j.j(g0Var, asVar, z);
        if (j2 == -4) {
            if (asVar.isEndOfStream()) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j3 = asVar.h + this.l;
            asVar.h = j3;
            this.m = Math.max(this.m, j3);
        } else if (j2 == -5) {
            f0 f0Var = g0Var.c;
            long j4 = f0Var.q;
            if (j4 != Long.MAX_VALUE) {
                g0Var.c = f0Var.l(j4 + this.l);
            }
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    public int O(long j2) {
        return this.j.p(j2 - this.l);
    }

    public final void a() {
        q40.f(this.i == 0);
        this.f.a();
        J();
    }

    public final l00 d() {
        return this.j;
    }

    public final int getState() {
        return this.i;
    }

    public final void h(int i2) {
        this.h = i2;
    }

    public final void i() {
        boolean z = true;
        if (this.i != 1) {
            z = false;
        }
        q40.f(z);
        this.f.a();
        this.i = 0;
        this.j = null;
        this.k = null;
        this.n = false;
        G();
    }

    public final int j() {
        return this.e;
    }

    public final boolean k() {
        return this.m == Long.MIN_VALUE;
    }

    public final void l(x0 x0Var, f0[] f0VarArr, l00 l00, long j2, boolean z, long j3) {
        q40.f(this.i == 0);
        this.g = x0Var;
        this.i = 1;
        H(z);
        y(f0VarArr, l00, j3);
        I(j2, z);
    }

    public final void m() {
        this.n = true;
    }

    public final w0 n() {
        return this;
    }

    public int p() {
        return 0;
    }

    public void r(int i2, Object obj) {
    }

    public /* synthetic */ void s(float f2) {
        t0.a(this, f2);
    }

    public final void start() {
        boolean z = true;
        if (this.i != 1) {
            z = false;
        }
        q40.f(z);
        this.i = 2;
        K();
    }

    public final void stop() {
        q40.f(this.i == 2);
        this.i = 1;
        L();
    }

    public final void t() {
        this.j.a();
    }

    public final long u() {
        return this.m;
    }

    public final void v(long j2) {
        this.n = false;
        this.m = j2;
        I(j2, false);
    }

    public final boolean w() {
        return this.n;
    }

    public d50 x() {
        return null;
    }

    public final void y(f0[] f0VarArr, l00 l00, long j2) {
        q40.f(!this.n);
        this.j = l00;
        this.m = j2;
        this.k = f0VarArr;
        this.l = j2;
        M(f0VarArr, j2);
    }

    /* access modifiers changed from: protected */
    public final b0 z(Exception exc, f0 f0Var) {
        int i2;
        if (f0Var != null && !this.o) {
            this.o = true;
            try {
                i2 = v0.d(b(f0Var));
            } catch (b0 unused) {
            } finally {
                this.o = false;
            }
            return b0.b(exc, C(), f0Var, i2);
        }
        i2 = 4;
        return b0.b(exc, C(), f0Var, i2);
    }
}
