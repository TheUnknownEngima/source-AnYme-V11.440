package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.List;

final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;
    private final h5 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    f4(h5 h5Var, String str) {
        r.j(h5Var);
        r.f(str);
        this.a = h5Var;
        this.b = str;
        h5Var.f().b();
    }

    public final String A() {
        this.a.f().b();
        return this.d;
    }

    public final void B(long j2) {
        this.a.f().b();
        this.E |= this.n != j2;
        this.n = j2;
    }

    public final void C(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.e, str);
        this.e = str;
    }

    public final String D() {
        this.a.f().b();
        return this.s;
    }

    public final void E(long j2) {
        this.a.f().b();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void F(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.f, str);
        this.f = str;
    }

    public final String G() {
        this.a.f().b();
        return this.w;
    }

    public final void H(long j2) {
        boolean z2 = true;
        r.a(j2 >= 0);
        this.a.f().b();
        boolean z3 = this.E;
        if (this.g == j2) {
            z2 = false;
        }
        this.E = z2 | z3;
        this.g = j2;
    }

    public final void I(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.j, str);
        this.j = str;
    }

    public final String J() {
        this.a.f().b();
        return this.e;
    }

    public final void K(long j2) {
        this.a.f().b();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void L(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.l, str);
        this.l = str;
    }

    public final String M() {
        this.a.f().b();
        return this.f;
    }

    public final void N(long j2) {
        this.a.f().b();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void O(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.D, str);
        this.D = str;
    }

    public final long P() {
        this.a.f().b();
        return this.h;
    }

    public final void Q(long j2) {
        this.a.f().b();
        this.E |= this.x != j2;
        this.x = j2;
    }

    public final long R() {
        this.a.f().b();
        return this.i;
    }

    public final void S(long j2) {
        this.a.f().b();
        this.E |= this.y != j2;
        this.y = j2;
    }

    public final String T() {
        this.a.f().b();
        return this.j;
    }

    public final void U(long j2) {
        this.a.f().b();
        this.E |= this.z != j2;
        this.z = j2;
    }

    public final long V() {
        this.a.f().b();
        return this.k;
    }

    public final void W(long j2) {
        this.a.f().b();
        this.E |= this.A != j2;
        this.A = j2;
    }

    public final String X() {
        this.a.f().b();
        return this.l;
    }

    public final void Y(long j2) {
        this.a.f().b();
        this.E |= this.C != j2;
        this.C = j2;
    }

    public final long Z() {
        this.a.f().b();
        return this.m;
    }

    public final void a(long j2) {
        this.a.f().b();
        this.E |= this.h != j2;
        this.h = j2;
    }

    public final void a0(long j2) {
        this.a.f().b();
        this.E |= this.B != j2;
        this.B = j2;
    }

    public final void b(Boolean bool) {
        this.a.f().b();
        this.E |= !fa.b0(this.t, bool);
        this.t = bool;
    }

    public final long b0() {
        this.a.f().b();
        return this.n;
    }

    public final void c(String str) {
        this.a.f().b();
        this.E |= !fa.B0(this.c, str);
        this.c = str;
    }

    public final void c0(long j2) {
        this.a.f().b();
        this.E |= this.p != j2;
        this.p = j2;
    }

    public final void d(List<String> list) {
        this.a.f().b();
        if (!fa.n0(this.v, list)) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final long d0() {
        this.a.f().b();
        return this.u;
    }

    public final void e(boolean z2) {
        this.a.f().b();
        this.E |= this.o != z2;
        this.o = z2;
    }

    public final boolean e0() {
        this.a.f().b();
        return this.o;
    }

    public final boolean f() {
        this.a.f().b();
        return this.E;
    }

    public final long f0() {
        this.a.f().b();
        return this.g;
    }

    public final long g() {
        this.a.f().b();
        return this.C;
    }

    public final long g0() {
        this.a.f().b();
        return this.F;
    }

    public final long h() {
        this.a.f().b();
        return this.B;
    }

    public final long h0() {
        this.a.f().b();
        return this.G;
    }

    public final String i() {
        this.a.f().b();
        return this.D;
    }

    public final void i0() {
        this.a.f().b();
        long j2 = this.g + 1;
        if (j2 > 2147483647L) {
            this.a.h().H().b("Bundle index overflow. appId", c4.w(this.b));
            j2 = 0;
        }
        this.E = true;
        this.g = j2;
    }

    public final String j() {
        this.a.f().b();
        String str = this.D;
        O((String) null);
        return str;
    }

    public final long j0() {
        this.a.f().b();
        return this.x;
    }

    public final long k() {
        this.a.f().b();
        return this.p;
    }

    public final long k0() {
        this.a.f().b();
        return this.y;
    }

    public final boolean l() {
        this.a.f().b();
        return this.q;
    }

    public final long l0() {
        this.a.f().b();
        return this.z;
    }

    public final boolean m() {
        this.a.f().b();
        return this.r;
    }

    public final long m0() {
        this.a.f().b();
        return this.A;
    }

    public final Boolean n() {
        this.a.f().b();
        return this.t;
    }

    public final List<String> o() {
        this.a.f().b();
        return this.v;
    }

    public final void p() {
        this.a.f().b();
        this.E = false;
    }

    public final void q(long j2) {
        this.a.f().b();
        this.E |= this.i != j2;
        this.i = j2;
    }

    public final void r(String str) {
        this.a.f().b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.d, str);
        this.d = str;
    }

    public final void s(boolean z2) {
        this.a.f().b();
        this.E |= this.q != z2;
        this.q = z2;
    }

    public final String t() {
        this.a.f().b();
        return this.b;
    }

    public final void u(long j2) {
        this.a.f().b();
        this.E |= this.k != j2;
        this.k = j2;
    }

    public final void v(String str) {
        this.a.f().b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.s, str);
        this.s = str;
    }

    public final void w(boolean z2) {
        this.a.f().b();
        this.E |= this.r != z2;
        this.r = z2;
    }

    public final String x() {
        this.a.f().b();
        return this.c;
    }

    public final void y(long j2) {
        this.a.f().b();
        this.E |= this.m != j2;
        this.m = j2;
    }

    public final void z(String str) {
        this.a.f().b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !fa.B0(this.w, str);
        this.w = str;
    }
}
