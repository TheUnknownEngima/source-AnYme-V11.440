package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.g0;

final class n implements l00 {
    private final int e;
    private final o f;
    private int g = -1;

    public n(o oVar, int i) {
        this.f = oVar;
        this.e = i;
    }

    private boolean c() {
        int i = this.g;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public void a() {
        int i = this.g;
        if (i == -2) {
            throw new q(this.f.s().a(this.e).a(0).m);
        } else if (i == -1) {
            this.f.Q();
        } else if (i != -3) {
            this.f.R(i);
        }
    }

    public void b() {
        q40.a(this.g == -1);
        this.g = this.f.w(this.e);
    }

    public void d() {
        if (this.g != -1) {
            this.f.k0(this.e);
            this.g = -1;
        }
    }

    public boolean f() {
        return this.g == -3 || (c() && this.f.L(this.g));
    }

    public int j(g0 g0Var, as asVar, boolean z) {
        if (this.g == -3) {
            asVar.addFlag(4);
            return -4;
        } else if (c()) {
            return this.f.Z(this.g, g0Var, asVar, z);
        } else {
            return -3;
        }
    }

    public int p(long j) {
        if (c()) {
            return this.f.j0(this.g, j);
        }
        return 0;
    }
}
