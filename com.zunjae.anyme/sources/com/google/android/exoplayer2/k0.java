package com.google.android.exoplayer2;

import defpackage.f00;

final class k0 {
    public final f00.a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    k0(f00.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public k0 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new k0(this.a, this.b, j, this.d, this.e, this.f, this.g);
    }

    public k0 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new k0(this.a, j, this.c, this.d, this.e, this.f, this.g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && this.e == k0Var.e && this.f == k0Var.f && this.g == k0Var.g && v50.b(this.a, k0Var.a);
    }

    public int hashCode() {
        return ((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
