package com.google.android.exoplayer2;

import com.google.android.exoplayer2.b1;
import defpackage.f00;

final class n0 {
    private static final f00.a n = new f00.a(new Object());
    public final b1 a;
    public final f00.a b;
    public final long c;
    public final long d;
    public final int e;
    public final b0 f;
    public final boolean g;
    public final p00 h;
    public final l40 i;
    public final f00.a j;
    public volatile long k;
    public volatile long l;
    public volatile long m;

    public n0(b1 b1Var, f00.a aVar, long j2, long j3, int i2, b0 b0Var, boolean z, p00 p00, l40 l40, f00.a aVar2, long j4, long j5, long j6) {
        this.a = b1Var;
        this.b = aVar;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = b0Var;
        this.g = z;
        this.h = p00;
        this.i = l40;
        this.j = aVar2;
        this.k = j4;
        this.l = j5;
        this.m = j6;
    }

    public static n0 h(long j2, l40 l40) {
        l40 l402 = l40;
        return new n0(b1.a, n, j2, -9223372036854775807L, 1, (b0) null, false, p00.h, l402, n, j2, 0, j2);
    }

    public n0 a(boolean z) {
        b1 b1Var = this.a;
        return new n0(b1Var, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public n0 b(f00.a aVar) {
        b1 b1Var = this.a;
        return new n0(b1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, aVar, this.k, this.l, this.m);
    }

    public n0 c(f00.a aVar, long j2, long j3, long j4) {
        return new n0(this.a, aVar, j2, aVar.a() ? j3 : -9223372036854775807L, this.e, this.f, this.g, this.h, this.i, this.j, this.k, j4, j2);
    }

    public n0 d(b0 b0Var) {
        b1 b1Var = this.a;
        return new n0(b1Var, this.b, this.c, this.d, this.e, b0Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public n0 e(int i2) {
        b1 b1Var = this.a;
        return new n0(b1Var, this.b, this.c, this.d, i2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public n0 f(b1 b1Var) {
        b1 b1Var2 = b1Var;
        return new n0(b1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public n0 g(p00 p00, l40 l40) {
        b1 b1Var = this.a;
        return new n0(b1Var, this.b, this.c, this.d, this.e, this.f, this.g, p00, l40, this.j, this.k, this.l, this.m);
    }

    public f00.a i(boolean z, b1.c cVar, b1.b bVar) {
        if (this.a.q()) {
            return n;
        }
        int a2 = this.a.a(z);
        int i2 = this.a.n(a2, cVar).i;
        int b2 = this.a.b(this.b.a);
        long j2 = -1;
        if (b2 != -1 && a2 == this.a.f(b2, bVar).c) {
            j2 = this.b.d;
        }
        return new f00.a(this.a.m(i2), j2);
    }
}
