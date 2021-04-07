package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.upstream.f;
import defpackage.f00;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class c0 extends t implements r0 {
    final l40 b;
    private final u0[] c;
    private final k40 d;
    private final Handler e;
    private final d0 f;
    private final Handler g;
    private final CopyOnWriteArrayList<t.a> h;
    private final b1.b i;
    private final ArrayDeque<Runnable> j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private o0 s;
    private n0 t;
    private int u;
    private int v;
    private long w;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            c0.this.d0(message);
        }
    }

    private static final class b implements Runnable {
        private final n0 e;
        private final CopyOnWriteArrayList<t.a> f;
        private final k40 g;
        private final boolean h;
        private final int i;
        private final int j;
        private final boolean k;
        private final boolean l;
        private final boolean m;
        private final boolean n;
        private final boolean o;
        private final boolean p;
        private final boolean q;
        private final boolean r;

        public b(n0 n0Var, n0 n0Var2, CopyOnWriteArrayList<t.a> copyOnWriteArrayList, k40 k40, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
            this.e = n0Var;
            this.f = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.g = k40;
            this.h = z;
            this.i = i2;
            this.j = i3;
            this.k = z2;
            this.q = z3;
            this.r = z4;
            boolean z5 = true;
            this.l = n0Var2.e != n0Var.e;
            b0 b0Var = n0Var2.f;
            b0 b0Var2 = n0Var.f;
            this.m = (b0Var == b0Var2 || b0Var2 == null) ? false : true;
            this.n = n0Var2.a != n0Var.a;
            this.o = n0Var2.g != n0Var.g;
            this.p = n0Var2.i == n0Var.i ? false : z5;
        }

        public /* synthetic */ void a(r0.a aVar) {
            aVar.n(this.e.a, this.j);
        }

        public /* synthetic */ void b(r0.a aVar) {
            aVar.f(this.i);
        }

        public /* synthetic */ void c(r0.a aVar) {
            aVar.j(this.e.f);
        }

        public /* synthetic */ void d(r0.a aVar) {
            n0 n0Var = this.e;
            aVar.L(n0Var.h, n0Var.i.c);
        }

        public /* synthetic */ void e(r0.a aVar) {
            aVar.e(this.e.g);
        }

        public /* synthetic */ void f(r0.a aVar) {
            aVar.z(this.q, this.e.e);
        }

        public /* synthetic */ void g(r0.a aVar) {
            aVar.R(this.e.e == 3);
        }

        public void run() {
            if (this.n || this.j == 0) {
                c0.g0(this.f, new g(this));
            }
            if (this.h) {
                c0.g0(this.f, new f(this));
            }
            if (this.m) {
                c0.g0(this.f, new j(this));
            }
            if (this.p) {
                this.g.c(this.e.i.d);
                c0.g0(this.f, new i(this));
            }
            if (this.o) {
                c0.g0(this.f, new k(this));
            }
            if (this.l) {
                c0.g0(this.f, new e(this));
            }
            if (this.r) {
                c0.g0(this.f, new h(this));
            }
            if (this.k) {
                c0.g0(this.f, a.a);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public c0(u0[] u0VarArr, k40 k40, i0 i0Var, f fVar, r40 r40, Looper looper) {
        u0[] u0VarArr2 = u0VarArr;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = v50.e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.11.7");
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        b50.f("ExoPlayerImpl", sb.toString());
        q40.f(u0VarArr2.length > 0);
        q40.e(u0VarArr);
        this.c = u0VarArr2;
        q40.e(k40);
        this.d = k40;
        this.k = false;
        this.m = 0;
        this.n = false;
        this.h = new CopyOnWriteArrayList<>();
        this.b = new l40(new x0[u0VarArr2.length], new h40[u0VarArr2.length], (Object) null);
        this.i = new b1.b();
        this.s = o0.e;
        z0 z0Var = z0.d;
        this.l = 0;
        this.e = new a(looper);
        this.t = n0.h(0, this.b);
        this.j = new ArrayDeque<>();
        this.f = new d0(u0VarArr, k40, this.b, i0Var, fVar, this.k, this.m, this.n, this.e, r40);
        this.g = new Handler(this.f.s());
    }

    private n0 c0(boolean z, boolean z2, boolean z3, int i2) {
        long j2 = 0;
        boolean z4 = false;
        if (z) {
            this.u = 0;
            this.v = 0;
            this.w = 0;
        } else {
            this.u = w();
            this.v = n();
            this.w = V();
        }
        if (z || z2) {
            z4 = true;
        }
        n0 n0Var = this.t;
        f00.a i3 = z4 ? n0Var.i(this.n, this.a, this.i) : n0Var.b;
        if (!z4) {
            j2 = this.t.m;
        }
        long j3 = j2;
        return new n0(z2 ? b1.a : this.t.a, i3, j3, z4 ? -9223372036854775807L : this.t.d, i2, z3 ? null : this.t.f, false, z2 ? p00.h : this.t.h, z2 ? this.b : this.t.i, i3, j3, 0, j3);
    }

    private void e0(n0 n0Var, int i2, boolean z, int i3) {
        int i4 = this.o - i2;
        this.o = i4;
        if (i4 == 0) {
            if (n0Var.c == -9223372036854775807L) {
                n0Var = n0Var.c(n0Var.b, 0, n0Var.d, n0Var.l);
            }
            n0 n0Var2 = n0Var;
            if (!this.t.a.q() && n0Var2.a.q()) {
                this.v = 0;
                this.u = 0;
                this.w = 0;
            }
            int i5 = this.p ? 0 : 2;
            boolean z2 = this.q;
            this.p = false;
            this.q = false;
            w0(n0Var2, z, i3, i5, z2);
        }
    }

    private void f0(o0 o0Var, boolean z) {
        if (z) {
            this.r--;
        }
        if (this.r == 0 && !this.s.equals(o0Var)) {
            this.s = o0Var;
            o0(new o(o0Var));
        }
    }

    /* access modifiers changed from: private */
    public static void g0(CopyOnWriteArrayList<t.a> copyOnWriteArrayList, t.b bVar) {
        Iterator<t.a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    static /* synthetic */ void k0(boolean z, boolean z2, int i2, boolean z3, int i3, boolean z4, boolean z5, r0.a aVar) {
        if (z) {
            aVar.z(z2, i2);
        }
        if (z3) {
            aVar.d(i3);
        }
        if (z4) {
            aVar.R(z5);
        }
    }

    private void o0(t.b bVar) {
        p0(new c(new CopyOnWriteArrayList(this.h), bVar));
    }

    private void p0(Runnable runnable) {
        boolean z = !this.j.isEmpty();
        this.j.addLast(runnable);
        if (!z) {
            while (!this.j.isEmpty()) {
                this.j.peekFirst().run();
                this.j.removeFirst();
            }
        }
    }

    private long q0(f00.a aVar, long j2) {
        long b2 = v.b(j2);
        this.t.a.h(aVar.a, this.i);
        return b2 + this.i.k();
    }

    private boolean v0() {
        return this.t.a.q() || this.o > 0;
    }

    private void w0(n0 n0Var, boolean z, int i2, int i3, boolean z2) {
        boolean C = C();
        n0 n0Var2 = this.t;
        this.t = n0Var;
        p0(new b(n0Var, n0Var2, this.h, this.d, z, i2, i3, z2, this.k, C != C()));
    }

    public long A() {
        if (!f()) {
            return V();
        }
        n0 n0Var = this.t;
        n0Var.a.h(n0Var.b.a, this.i);
        n0 n0Var2 = this.t;
        return n0Var2.d == -9223372036854775807L ? n0Var2.a.n(w(), this.a).a() : this.i.k() + v.b(this.t.d);
    }

    public void E(int i2) {
        if (this.m != i2) {
            this.m = i2;
            this.f.p0(i2);
            o0(new p(i2));
        }
    }

    public int F() {
        if (f()) {
            return this.t.b.b;
        }
        return -1;
    }

    public int G() {
        return this.m;
    }

    public int K() {
        return this.l;
    }

    public p00 L() {
        return this.t.h;
    }

    public long M() {
        if (!f()) {
            return X();
        }
        n0 n0Var = this.t;
        f00.a aVar = n0Var.b;
        n0Var.a.h(aVar.a, this.i);
        return v.b(this.i.b(aVar.b, aVar.c));
    }

    public b1 N() {
        return this.t.a;
    }

    public Looper O() {
        return this.e.getLooper();
    }

    public boolean P() {
        return this.n;
    }

    public long Q() {
        if (v0()) {
            return this.w;
        }
        n0 n0Var = this.t;
        if (n0Var.j.d != n0Var.b.d) {
            return n0Var.a.n(w(), this.a).c();
        }
        long j2 = n0Var.k;
        if (this.t.j.a()) {
            n0 n0Var2 = this.t;
            b1.b h2 = n0Var2.a.h(n0Var2.j.a, this.i);
            long f2 = h2.f(this.t.j.b);
            j2 = f2 == Long.MIN_VALUE ? h2.d : f2;
        }
        return q0(this.t.j, j2);
    }

    public i40 S() {
        return this.t.i.c;
    }

    public int T(int i2) {
        return this.c[i2].j();
    }

    public long V() {
        if (v0()) {
            return this.w;
        }
        if (this.t.b.a()) {
            return v.b(this.t.m);
        }
        n0 n0Var = this.t;
        return q0(n0Var.b, n0Var.m);
    }

    public r0.b W() {
        return null;
    }

    public s0 b0(s0.b bVar) {
        return new s0(this.f, bVar, this.t.a, w(), this.g);
    }

    /* access modifiers changed from: package-private */
    public void d0(Message message) {
        int i2 = message.what;
        boolean z = false;
        if (i2 == 0) {
            n0 n0Var = (n0) message.obj;
            int i3 = message.arg1;
            if (message.arg2 != -1) {
                z = true;
            }
            e0(n0Var, i3, z, message.arg2);
        } else if (i2 == 1) {
            o0 o0Var = (o0) message.obj;
            if (message.arg1 != 0) {
                z = true;
            }
            f0(o0Var, z);
        } else {
            throw new IllegalStateException();
        }
    }

    public o0 e() {
        return this.s;
    }

    public boolean f() {
        return !v0() && this.t.b.a();
    }

    public long g() {
        return v.b(this.t.l);
    }

    public int h() {
        return this.t.e;
    }

    public void i(int i2, long j2) {
        b1 b1Var = this.t.a;
        if (i2 < 0 || (!b1Var.q() && i2 >= b1Var.p())) {
            throw new h0(b1Var, i2, j2);
        }
        this.q = true;
        this.o++;
        if (f()) {
            b50.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.e.obtainMessage(0, 1, -1, this.t).sendToTarget();
            return;
        }
        this.u = i2;
        if (b1Var.q()) {
            this.w = j2 == -9223372036854775807L ? 0 : j2;
            this.v = 0;
        } else {
            long b2 = j2 == -9223372036854775807L ? b1Var.n(i2, this.a).b() : v.a(j2);
            Pair<Object, Long> j3 = b1Var.j(this.a, this.i, i2, b2);
            this.w = v.b(b2);
            this.v = b1Var.b(j3.first);
        }
        this.f.a0(b1Var, i2, v.a(j2));
        o0(d.a);
    }

    public boolean j() {
        return this.k;
    }

    public void k(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.f.s0(z);
            o0(new l(z));
        }
    }

    public b0 l() {
        return this.t.f;
    }

    public int n() {
        if (v0()) {
            return this.v;
        }
        n0 n0Var = this.t;
        return n0Var.a.b(n0Var.b.a);
    }

    public void q(r0.a aVar) {
        this.h.addIfAbsent(new t.a(aVar));
    }

    public void r0(f00 f00, boolean z, boolean z2) {
        n0 c0 = c0(z, z2, true, 2);
        this.p = true;
        this.o++;
        this.f.O(f00, z, z2);
        w0(c0, false, 4, 1, false);
    }

    public int s() {
        if (f()) {
            return this.t.b.c;
        }
        return -1;
    }

    public void s0() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = v50.e;
        String b2 = e0.b();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b2).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.11.7");
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(b2);
        sb.append("]");
        b50.f("ExoPlayerImpl", sb.toString());
        this.f.Q();
        this.e.removeCallbacksAndMessages((Object) null);
        this.t = c0(false, false, false, 1);
    }

    public void t0(boolean z, int i2) {
        boolean C = C();
        boolean z2 = this.k && this.l == 0;
        boolean z3 = z && i2 == 0;
        if (z2 != z3) {
            this.f.l0(z3);
        }
        boolean z4 = this.k != z;
        boolean z5 = this.l != i2;
        this.k = z;
        this.l = i2;
        boolean C2 = C();
        boolean z6 = C != C2;
        if (z4 || z5 || z6) {
            o0(new n(z4, z, this.t.e, z5, i2, z6, C2));
        }
    }

    public void u0(o0 o0Var) {
        if (o0Var == null) {
            o0Var = o0.e;
        }
        if (!this.s.equals(o0Var)) {
            this.r++;
            this.s = o0Var;
            this.f.n0(o0Var);
            o0(new m(o0Var));
        }
    }

    public void v(r0.a aVar) {
        Iterator<t.a> it = this.h.iterator();
        while (it.hasNext()) {
            t.a next = it.next();
            if (next.a.equals(aVar)) {
                next.b();
                this.h.remove(next);
            }
        }
    }

    public int w() {
        if (v0()) {
            return this.u;
        }
        n0 n0Var = this.t;
        return n0Var.a.h(n0Var.b.a, this.i).c;
    }

    public void y(boolean z) {
        t0(z, 0);
    }

    public r0.c z() {
        return null;
    }
}
