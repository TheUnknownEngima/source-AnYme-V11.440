package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;

final class i implements l00 {
    private final f0 e;
    private final hy f = new hy();
    private long[] g;
    private boolean h;
    private k10 i;
    private boolean j;
    private int k;
    private long l = -9223372036854775807L;

    public i(k10 k10, f0 f0Var, boolean z) {
        this.e = f0Var;
        this.i = k10;
        this.g = k10.b;
        d(k10, z);
    }

    public void a() {
    }

    public String b() {
        return this.i.a();
    }

    public void c(long j2) {
        boolean z = true;
        int d = v50.d(this.g, j2, true, false);
        this.k = d;
        if (!this.h || d != this.g.length) {
            z = false;
        }
        if (!z) {
            j2 = -9223372036854775807L;
        }
        this.l = j2;
    }

    public void d(k10 k10, boolean z) {
        int i2 = this.k;
        long j2 = i2 == 0 ? -9223372036854775807L : this.g[i2 - 1];
        this.h = z;
        this.i = k10;
        long[] jArr = k10.b;
        this.g = jArr;
        long j3 = this.l;
        if (j3 != -9223372036854775807L) {
            c(j3);
        } else if (j2 != -9223372036854775807L) {
            this.k = v50.d(jArr, j2, false, false);
        }
    }

    public boolean f() {
        return true;
    }

    public int j(g0 g0Var, as asVar, boolean z) {
        if (z || !this.j) {
            g0Var.c = this.e;
            this.j = true;
            return -5;
        }
        int i2 = this.k;
        if (i2 != this.g.length) {
            this.k = i2 + 1;
            byte[] a = this.f.a(this.i.a[i2]);
            if (a == null) {
                return -3;
            }
            asVar.k(a.length);
            asVar.f.put(a);
            asVar.h = this.g[i2];
            asVar.setFlags(1);
            return -4;
        } else if (this.h) {
            return -3;
        } else {
            asVar.setFlags(4);
            return -4;
        }
    }

    public int p(long j2) {
        int max = Math.max(this.k, v50.d(this.g, j2, true, false));
        int i2 = max - this.k;
        this.k = max;
        return i2;
    }
}
