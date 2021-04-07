package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.z;
import defpackage.e00;
import defpackage.f00;
import defpackage.k40;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

final class d0 implements Handler.Callback, e00.a, k40.a, f00.b, z.a, s0.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private int H;
    private e I;
    private long J;
    private int K;
    private boolean L;
    private final u0[] e;
    private final w0[] f;
    private final k40 g;
    private final l40 h;
    private final i0 i;
    private final f j;
    private final a50 k;
    private final HandlerThread l;
    private final Handler m;
    private final b1.c n;
    private final b1.b o;
    private final long p;
    private final boolean q;
    private final z r;
    private final d s;
    private final ArrayList<c> t;
    private final r40 u;
    private final l0 v = new l0();
    private z0 w;
    private n0 x;
    private f00 y;
    private u0[] z;

    private static final class b {
        public final f00 a;
        public final b1 b;

        public b(f00 f00, b1 b1Var) {
            this.a = f00;
            this.b = b1Var;
        }
    }

    private static final class c implements Comparable<c> {
        public final s0 e;
        public int f;
        public long g;
        public Object h;

        public c(s0 s0Var) {
            this.e = s0Var;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            if ((this.h == null) != (cVar.h == null)) {
                return this.h != null ? -1 : 1;
            }
            if (this.h == null) {
                return 0;
            }
            int i = this.f - cVar.f;
            return i != 0 ? i : v50.m(this.g, cVar.g);
        }

        public void e(int i, long j, Object obj) {
            this.f = i;
            this.g = j;
            this.h = obj;
        }
    }

    private static final class d {
        private n0 a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public boolean c;
        /* access modifiers changed from: private */
        public int d;

        private d() {
        }

        public boolean d(n0 n0Var) {
            return n0Var != this.a || this.b > 0 || this.c;
        }

        public void e(int i) {
            this.b += i;
        }

        public void f(n0 n0Var) {
            this.a = n0Var;
            this.b = 0;
            this.c = false;
        }

        public void g(int i) {
            boolean z = true;
            if (!this.c || this.d == 4) {
                this.c = true;
                this.d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            q40.a(z);
        }
    }

    private static final class e {
        public final b1 a;
        public final int b;
        public final long c;

        public e(b1 b1Var, int i, long j) {
            this.a = b1Var;
            this.b = i;
            this.c = j;
        }
    }

    public d0(u0[] u0VarArr, k40 k40, l40 l40, i0 i0Var, f fVar, boolean z2, int i2, boolean z3, Handler handler, r40 r40) {
        this.e = u0VarArr;
        this.g = k40;
        this.h = l40;
        this.i = i0Var;
        this.j = fVar;
        this.B = z2;
        this.E = i2;
        this.F = z3;
        this.m = handler;
        this.u = r40;
        this.p = i0Var.c();
        this.q = i0Var.b();
        this.w = z0.d;
        this.x = n0.h(-9223372036854775807L, l40);
        this.s = new d();
        this.f = new w0[u0VarArr.length];
        for (int i3 = 0; i3 < u0VarArr.length; i3++) {
            u0VarArr[i3].h(i3);
            this.f[i3] = u0VarArr[i3].n();
        }
        this.r = new z(this, r40);
        this.t = new ArrayList<>();
        this.z = new u0[0];
        this.n = new b1.c();
        this.o = new b1.b();
        k40.b(this, fVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.l = handlerThread;
        handlerThread.start();
        this.k = r40.c(this.l.getLooper(), this);
        this.L = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A(com.google.android.exoplayer2.d0.b r12) {
        /*
            r11 = this;
            f00 r0 = r12.a
            f00 r1 = r11.y
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            com.google.android.exoplayer2.d0$d r0 = r11.s
            int r1 = r11.H
            r0.e(r1)
            r0 = 0
            r11.H = r0
            com.google.android.exoplayer2.n0 r1 = r11.x
            com.google.android.exoplayer2.b1 r1 = r1.a
            com.google.android.exoplayer2.b1 r12 = r12.b
            com.google.android.exoplayer2.l0 r2 = r11.v
            r2.y(r12)
            com.google.android.exoplayer2.n0 r2 = r11.x
            com.google.android.exoplayer2.n0 r2 = r2.f(r12)
            r11.x = r2
            r11.W()
            com.google.android.exoplayer2.n0 r2 = r11.x
            f00$a r2 = r2.b
            boolean r3 = r2.a()
            if (r3 == 0) goto L_0x0036
            com.google.android.exoplayer2.n0 r3 = r11.x
            long r3 = r3.d
            goto L_0x003a
        L_0x0036:
            com.google.android.exoplayer2.n0 r3 = r11.x
            long r3 = r3.m
        L_0x003a:
            com.google.android.exoplayer2.d0$e r5 = r11.I
            if (r5 == 0) goto L_0x0060
            r12 = 1
            android.util.Pair r12 = r11.X(r5, r12)
            r1 = 0
            r11.I = r1
            if (r12 != 0) goto L_0x004c
            r11.z()
            return
        L_0x004c:
            java.lang.Object r1 = r12.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            com.google.android.exoplayer2.l0 r5 = r11.v
            java.lang.Object r12 = r12.first
            f00$a r12 = r5.v(r12, r1)
            r6 = r12
            r9 = r1
            goto L_0x00e0
        L_0x0060:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x009c
            boolean r7 = r12.q()
            if (r7 != 0) goto L_0x009c
            boolean r1 = r11.F
            int r1 = r12.a(r1)
            android.util.Pair r12 = r11.r(r12, r1, r5)
            com.google.android.exoplayer2.l0 r1 = r11.v
            java.lang.Object r2 = r12.first
            java.lang.Object r5 = r12.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            f00$a r1 = r1.v(r2, r5)
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x0098
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r5 = r12.longValue()
            goto L_0x0099
        L_0x0098:
            r5 = r3
        L_0x0099:
            r9 = r5
            r6 = r1
            goto L_0x00e0
        L_0x009c:
            java.lang.Object r7 = r2.a
            int r7 = r12.b(r7)
            r8 = -1
            if (r7 != r8) goto L_0x00be
            java.lang.Object r2 = r2.a
            java.lang.Object r1 = r11.Y(r2, r1, r12)
            if (r1 != 0) goto L_0x00b1
            r11.z()
            return
        L_0x00b1:
            com.google.android.exoplayer2.b1$b r2 = r11.o
            com.google.android.exoplayer2.b1$b r1 = r12.h(r1, r2)
            int r1 = r1.c
            android.util.Pair r12 = r11.r(r12, r1, r5)
            goto L_0x004c
        L_0x00be:
            com.google.android.exoplayer2.l0 r12 = r11.v
            com.google.android.exoplayer2.n0 r1 = r11.x
            f00$a r1 = r1.b
            java.lang.Object r1 = r1.a
            f00$a r12 = r12.v(r1, r3)
            com.google.android.exoplayer2.n0 r1 = r11.x
            f00$a r1 = r1.b
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00de
            boolean r1 = r12.a()
            if (r1 != 0) goto L_0x00de
            com.google.android.exoplayer2.n0 r12 = r11.x
            f00$a r12 = r12.b
        L_0x00de:
            r6 = r12
            r9 = r3
        L_0x00e0:
            com.google.android.exoplayer2.n0 r12 = r11.x
            f00$a r12 = r12.b
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0100
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0100
            com.google.android.exoplayer2.l0 r12 = r11.v
            long r1 = r11.J
            long r3 = r11.q()
            boolean r12 = r12.B(r1, r3)
            if (r12 != 0) goto L_0x013c
            r11.b0(r0)
            goto L_0x013c
        L_0x0100:
            com.google.android.exoplayer2.l0 r12 = r11.v
            com.google.android.exoplayer2.j0 r12 = r12.n()
            if (r12 == 0) goto L_0x0127
        L_0x0108:
            com.google.android.exoplayer2.j0 r1 = r12.j()
            if (r1 == 0) goto L_0x0127
            com.google.android.exoplayer2.j0 r12 = r12.j()
            com.google.android.exoplayer2.k0 r1 = r12.f
            f00$a r1 = r1.a
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0108
            com.google.android.exoplayer2.l0 r1 = r11.v
            com.google.android.exoplayer2.k0 r2 = r12.f
            com.google.android.exoplayer2.k0 r1 = r1.p(r2)
            r12.f = r1
            goto L_0x0108
        L_0x0127:
            boolean r12 = r6.a()
            if (r12 == 0) goto L_0x0130
            r1 = 0
            goto L_0x0131
        L_0x0130:
            r1 = r9
        L_0x0131:
            long r7 = r11.d0(r6, r1)
            r5 = r11
            com.google.android.exoplayer2.n0 r12 = r5.e(r6, r7, r9)
            r11.x = r12
        L_0x013c:
            r11.w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.A(com.google.android.exoplayer2.d0$b):void");
    }

    private void A0() {
        this.r.h();
        for (u0 n2 : this.z) {
            n(n2);
        }
    }

    private boolean B() {
        j0 o2 = this.v.o();
        if (!o2.d) {
            return false;
        }
        int i2 = 0;
        while (true) {
            u0[] u0VarArr = this.e;
            if (i2 >= u0VarArr.length) {
                return true;
            }
            u0 u0Var = u0VarArr[i2];
            l00 l00 = o2.c[i2];
            if (u0Var.d() != l00 || (l00 != null && !u0Var.k())) {
                return false;
            }
            i2++;
        }
        return false;
    }

    private void B0() {
        j0 i2 = this.v.i();
        boolean z2 = this.D || (i2 != null && i2.a.d());
        n0 n0Var = this.x;
        if (z2 != n0Var.g) {
            this.x = n0Var.a(z2);
        }
    }

    private boolean C() {
        j0 i2 = this.v.i();
        return (i2 == null || i2.k() == Long.MIN_VALUE) ? false : true;
    }

    private void C0(p00 p00, l40 l40) {
        this.i.f(this.e, p00, l40.c);
    }

    private boolean D() {
        j0 n2 = this.v.n();
        long j2 = n2.f.e;
        return n2.d && (j2 == -9223372036854775807L || this.x.m < j2);
    }

    private void D0() {
        f00 f00 = this.y;
        if (f00 != null) {
            if (this.H > 0) {
                f00.h();
                return;
            }
            J();
            L();
            K();
        }
    }

    private void E0() {
        j0 n2 = this.v.n();
        if (n2 != null) {
            long q2 = n2.d ? n2.a.q() : -9223372036854775807L;
            if (q2 != -9223372036854775807L) {
                U(q2);
                if (q2 != this.x.m) {
                    n0 n0Var = this.x;
                    this.x = e(n0Var.b, q2, n0Var.d);
                    this.s.g(4);
                }
            } else {
                long i2 = this.r.i(n2 != this.v.o());
                this.J = i2;
                long y2 = n2.y(i2);
                I(this.x.m, y2);
                this.x.m = y2;
            }
            this.x.k = this.v.i().i();
            this.x.l = t();
        }
    }

    private void F() {
        boolean w0 = w0();
        this.D = w0;
        if (w0) {
            this.v.i().d(this.J);
        }
        B0();
    }

    private void F0(j0 j0Var) {
        j0 n2 = this.v.n();
        if (n2 != null && j0Var != n2) {
            boolean[] zArr = new boolean[this.e.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                u0[] u0VarArr = this.e;
                if (i2 < u0VarArr.length) {
                    u0 u0Var = u0VarArr[i2];
                    zArr[i2] = u0Var.getState() != 0;
                    if (n2.o().c(i2)) {
                        i3++;
                    }
                    if (zArr[i2] && (!n2.o().c(i2) || (u0Var.w() && u0Var.d() == j0Var.c[i2]))) {
                        g(u0Var);
                    }
                    i2++;
                } else {
                    this.x = this.x.g(n2.n(), n2.o());
                    k(zArr, i3);
                    return;
                }
            }
        }
    }

    private void G() {
        if (this.s.d(this.x)) {
            this.m.obtainMessage(0, this.s.b, this.s.c ? this.s.d : -1, this.x).sendToTarget();
            this.s.f(this.x);
        }
    }

    private void G0(float f2) {
        for (j0 n2 = this.v.n(); n2 != null; n2 = n2.j()) {
            for (h40 h40 : n2.o().c.b()) {
                if (h40 != null) {
                    h40.n(f2);
                }
            }
        }
    }

    private void H() {
        if (this.v.i() != null) {
            u0[] u0VarArr = this.z;
            int length = u0VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (u0VarArr[i2].k()) {
                    i2++;
                } else {
                    return;
                }
            }
        }
        this.y.h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r1 > 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r3 = r7.t.get(r1 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r3 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r4 = r3.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r4 > r0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4 != r0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r3.g <= r8) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r1 <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r1 >= r7.t.size()) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r3 = r7.t.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        if (r3 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r3.h == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r4 = r3.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r4 < r0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r4 != r0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r3.g > r8) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r1 >= r7.t.size()) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        if (r3 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
        if (r3.h == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r3.f != r0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r4 = r3.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        if (r4 <= r8) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r4 > r10) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        g0(r3.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r3.e.b() != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3.e.j() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b9, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        r7.t.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r1 >= r7.t.size()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r3 = r7.t.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d2, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        r7.t.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r7.K = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I(long r8, long r10) {
        /*
            r7 = this;
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r0 = r7.t
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ed
            com.google.android.exoplayer2.n0 r0 = r7.x
            f00$a r0 = r0.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0014
            goto L_0x00ed
        L_0x0014:
            com.google.android.exoplayer2.n0 r0 = r7.x
            long r0 = r0.c
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0023
            boolean r0 = r7.L
            if (r0 == 0) goto L_0x0023
            r0 = 1
            long r8 = r8 - r0
        L_0x0023:
            r0 = 0
            r7.L = r0
            com.google.android.exoplayer2.n0 r0 = r7.x
            com.google.android.exoplayer2.b1 r1 = r0.a
            f00$a r0 = r0.b
            java.lang.Object r0 = r0.a
            int r0 = r1.b(r0)
            int r1 = r7.K
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r2 = r7.t
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x004c
        L_0x0041:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.exoplayer2.d0$c r3 = (com.google.android.exoplayer2.d0.c) r3
            goto L_0x004d
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0060
            int r4 = r3.f
            if (r4 > r0) goto L_0x005b
            if (r4 != r0) goto L_0x0060
            long r3 = r3.g
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0060
        L_0x005b:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x004c
            goto L_0x0041
        L_0x0060:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0071
        L_0x0068:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.d0$c r3 = (com.google.android.exoplayer2.d0.c) r3
            goto L_0x0072
        L_0x0071:
            r3 = r2
        L_0x0072:
            if (r3 == 0) goto L_0x008f
            java.lang.Object r4 = r3.h
            if (r4 == 0) goto L_0x008f
            int r4 = r3.f
            if (r4 < r0) goto L_0x0084
            if (r4 != r0) goto L_0x008f
            long r4 = r3.g
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x008f
        L_0x0084:
            int r1 = r1 + 1
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0071
            goto L_0x0068
        L_0x008f:
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.h
            if (r4 == 0) goto L_0x00eb
            int r4 = r3.f
            if (r4 != r0) goto L_0x00eb
            long r4 = r3.g
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00eb
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            com.google.android.exoplayer2.s0 r4 = r3.e     // Catch:{ all -> 0x00d4 }
            r7.g0(r4)     // Catch:{ all -> 0x00d4 }
            com.google.android.exoplayer2.s0 r4 = r3.e
            boolean r4 = r4.b()
            if (r4 != 0) goto L_0x00bc
            com.google.android.exoplayer2.s0 r3 = r3.e
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00bc:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            r3.remove(r1)
        L_0x00c1:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00d2
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r3 = r7.t
            java.lang.Object r3 = r3.get(r1)
            com.google.android.exoplayer2.d0$c r3 = (com.google.android.exoplayer2.d0.c) r3
            goto L_0x008f
        L_0x00d2:
            r3 = r2
            goto L_0x008f
        L_0x00d4:
            r8 = move-exception
            com.google.android.exoplayer2.s0 r9 = r3.e
            boolean r9 = r9.b()
            if (r9 != 0) goto L_0x00e5
            com.google.android.exoplayer2.s0 r9 = r3.e
            boolean r9 = r9.j()
            if (r9 == 0) goto L_0x00ea
        L_0x00e5:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r9 = r7.t
            r9.remove(r1)
        L_0x00ea:
            throw r8
        L_0x00eb:
            r7.K = r1
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.I(long, long):void");
    }

    private void J() {
        this.v.t(this.J);
        if (this.v.z()) {
            k0 m2 = this.v.m(this.J, this.x);
            if (m2 == null) {
                H();
            } else {
                j0 f2 = this.v.f(this.f, this.g, this.i.h(), this.y, m2, this.h);
                f2.a.r(this, m2.b);
                if (this.v.n() == f2) {
                    U(f2.m());
                }
                w(false);
            }
        }
        if (this.D) {
            this.D = C();
            B0();
            return;
        }
        F();
    }

    private void K() {
        boolean z2 = false;
        while (v0()) {
            if (z2) {
                G();
            }
            j0 n2 = this.v.n();
            if (n2 == this.v.o()) {
                j0();
            }
            j0 a2 = this.v.a();
            F0(n2);
            k0 k0Var = a2.f;
            this.x = e(k0Var.a, k0Var.b, k0Var.c);
            this.s.g(n2.f.f ? 0 : 3);
            E0();
            z2 = true;
        }
    }

    private void L() {
        j0 o2 = this.v.o();
        if (o2 != null) {
            int i2 = 0;
            if (o2.j() == null) {
                if (o2.f.g) {
                    while (true) {
                        u0[] u0VarArr = this.e;
                        if (i2 < u0VarArr.length) {
                            u0 u0Var = u0VarArr[i2];
                            l00 l00 = o2.c[i2];
                            if (l00 != null && u0Var.d() == l00 && u0Var.k()) {
                                u0Var.m();
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (B() && o2.j().d) {
                l40 o3 = o2.o();
                j0 b2 = this.v.b();
                l40 o4 = b2.o();
                if (b2.a.q() != -9223372036854775807L) {
                    j0();
                    return;
                }
                int i3 = 0;
                while (true) {
                    u0[] u0VarArr2 = this.e;
                    if (i3 < u0VarArr2.length) {
                        u0 u0Var2 = u0VarArr2[i3];
                        if (o3.c(i3) && !u0Var2.w()) {
                            h40 a2 = o4.c.a(i3);
                            boolean c2 = o4.c(i3);
                            boolean z2 = this.f[i3].j() == 6;
                            x0 x0Var = o3.b[i3];
                            x0 x0Var2 = o4.b[i3];
                            if (!c2 || !x0Var2.equals(x0Var) || z2) {
                                u0Var2.m();
                            } else {
                                u0Var2.y(p(a2), b2.c[i3], b2.l());
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void M() {
        for (j0 n2 = this.v.n(); n2 != null; n2 = n2.j()) {
            for (h40 h40 : n2.o().c.b()) {
                if (h40 != null) {
                    h40.p();
                }
            }
        }
    }

    private void P(f00 f00, boolean z2, boolean z3) {
        this.H++;
        T(false, true, z2, z3, true);
        this.i.a();
        this.y = f00;
        u0(2);
        f00.j(this, this.j.c());
        this.k.b(2);
    }

    private void R() {
        T(true, true, true, true, false);
        this.i.g();
        u0(1);
        this.l.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    private void S() {
        boolean[] zArr;
        j0 j0Var;
        float f2 = this.r.e().a;
        j0 n2 = this.v.n();
        j0 o2 = this.v.o();
        boolean z2 = true;
        while (n2 != null && n2.d) {
            l40 v2 = n2.v(f2, this.x.a);
            if (!v2.a(n2.o())) {
                l0 l0Var = this.v;
                if (z2) {
                    j0 n3 = l0Var.n();
                    boolean u2 = this.v.u(n3);
                    boolean[] zArr2 = new boolean[this.e.length];
                    long b2 = n3.b(v2, this.x.m, u2, zArr2);
                    n0 n0Var = this.x;
                    if (n0Var.e == 4 || b2 == n0Var.m) {
                        j0Var = n3;
                        zArr = zArr2;
                    } else {
                        n0 n0Var2 = this.x;
                        j0Var = n3;
                        zArr = zArr2;
                        this.x = e(n0Var2.b, b2, n0Var2.d);
                        this.s.g(4);
                        U(b2);
                    }
                    boolean[] zArr3 = new boolean[this.e.length];
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        u0[] u0VarArr = this.e;
                        if (i2 >= u0VarArr.length) {
                            break;
                        }
                        u0 u0Var = u0VarArr[i2];
                        zArr3[i2] = u0Var.getState() != 0;
                        l00 l00 = j0Var.c[i2];
                        if (l00 != null) {
                            i3++;
                        }
                        if (zArr3[i2]) {
                            if (l00 != u0Var.d()) {
                                g(u0Var);
                            } else if (zArr[i2]) {
                                u0Var.v(this.J);
                            }
                        }
                        i2++;
                    }
                    this.x = this.x.g(j0Var.n(), j0Var.o());
                    k(zArr3, i3);
                } else {
                    l0Var.u(n2);
                    if (n2.d) {
                        n2.a(v2, Math.max(n2.f.b, n2.y(this.J)), false);
                    }
                }
                w(true);
                if (this.x.e != 4) {
                    F();
                    E0();
                    this.k.b(2);
                    return;
                }
                return;
            }
            if (n2 == o2) {
                z2 = false;
            }
            n2 = n2.j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125 A[SYNTHETIC, Splitter:B:66:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T(boolean r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r26 = this;
            r1 = r26
            a50 r0 = r1.k
            r2 = 2
            r0.e(r2)
            r2 = 0
            r1.C = r2
            com.google.android.exoplayer2.z r0 = r1.r
            r0.h()
            r3 = 0
            r1.J = r3
            com.google.android.exoplayer2.u0[] r3 = r1.z
            int r4 = r3.length
            r5 = 0
        L_0x0018:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002d
            r0 = r3[r5]
            r1.g(r0)     // Catch:{ b0 -> 0x0024, RuntimeException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r0 = move-exception
            goto L_0x0025
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            java.lang.String r7 = "Disable failed."
            defpackage.b50.d(r6, r7, r0)
        L_0x002a:
            int r5 = r5 + 1
            goto L_0x0018
        L_0x002d:
            if (r27 == 0) goto L_0x0045
            com.google.android.exoplayer2.u0[] r3 = r1.e
            int r4 = r3.length
            r5 = 0
        L_0x0033:
            if (r5 >= r4) goto L_0x0045
            r0 = r3[r5]
            r0.a()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            defpackage.b50.d(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0045:
            com.google.android.exoplayer2.u0[] r0 = new com.google.android.exoplayer2.u0[r2]
            r1.z = r0
            r3 = 0
            if (r29 == 0) goto L_0x004f
            r1.I = r3
            goto L_0x0086
        L_0x004f:
            if (r30 == 0) goto L_0x0086
            com.google.android.exoplayer2.d0$e r0 = r1.I
            if (r0 != 0) goto L_0x0084
            com.google.android.exoplayer2.n0 r0 = r1.x
            com.google.android.exoplayer2.b1 r0 = r0.a
            boolean r0 = r0.q()
            if (r0 != 0) goto L_0x0084
            com.google.android.exoplayer2.n0 r0 = r1.x
            com.google.android.exoplayer2.b1 r4 = r0.a
            f00$a r0 = r0.b
            java.lang.Object r0 = r0.a
            com.google.android.exoplayer2.b1$b r5 = r1.o
            r4.h(r0, r5)
            com.google.android.exoplayer2.n0 r0 = r1.x
            long r4 = r0.m
            com.google.android.exoplayer2.b1$b r0 = r1.o
            long r7 = r0.l()
            long r4 = r4 + r7
            com.google.android.exoplayer2.d0$e r0 = new com.google.android.exoplayer2.d0$e
            com.google.android.exoplayer2.b1 r7 = com.google.android.exoplayer2.b1.a
            com.google.android.exoplayer2.b1$b r8 = r1.o
            int r8 = r8.c
            r0.<init>(r7, r8, r4)
            r1.I = r0
        L_0x0084:
            r0 = 1
            goto L_0x0088
        L_0x0086:
            r0 = r29
        L_0x0088:
            com.google.android.exoplayer2.l0 r4 = r1.v
            r5 = r30 ^ 1
            r4.e(r5)
            r1.D = r2
            if (r30 == 0) goto L_0x00b7
            com.google.android.exoplayer2.l0 r4 = r1.v
            com.google.android.exoplayer2.b1 r5 = com.google.android.exoplayer2.b1.a
            r4.y(r5)
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r4 = r1.t
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()
            com.google.android.exoplayer2.d0$c r5 = (com.google.android.exoplayer2.d0.c) r5
            com.google.android.exoplayer2.s0 r5 = r5.e
            r5.k(r2)
            goto L_0x00a0
        L_0x00b2:
            java.util.ArrayList<com.google.android.exoplayer2.d0$c> r2 = r1.t
            r2.clear()
        L_0x00b7:
            com.google.android.exoplayer2.n0 r2 = r1.x
            if (r0 == 0) goto L_0x00c6
            boolean r4 = r1.F
            com.google.android.exoplayer2.b1$c r5 = r1.n
            com.google.android.exoplayer2.b1$b r7 = r1.o
            f00$a r2 = r2.i(r4, r5, r7)
            goto L_0x00c8
        L_0x00c6:
            f00$a r2 = r2.b
        L_0x00c8:
            r19 = r2
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00d4
            r24 = r4
            goto L_0x00da
        L_0x00d4:
            com.google.android.exoplayer2.n0 r2 = r1.x
            long r7 = r2.m
            r24 = r7
        L_0x00da:
            if (r0 == 0) goto L_0x00dd
            goto L_0x00e1
        L_0x00dd:
            com.google.android.exoplayer2.n0 r0 = r1.x
            long r4 = r0.d
        L_0x00e1:
            r12 = r4
            com.google.android.exoplayer2.n0 r0 = new com.google.android.exoplayer2.n0
            if (r30 == 0) goto L_0x00e9
            com.google.android.exoplayer2.b1 r2 = com.google.android.exoplayer2.b1.a
            goto L_0x00ed
        L_0x00e9:
            com.google.android.exoplayer2.n0 r2 = r1.x
            com.google.android.exoplayer2.b1 r2 = r2.a
        L_0x00ed:
            r8 = r2
            com.google.android.exoplayer2.n0 r2 = r1.x
            int r14 = r2.e
            if (r31 == 0) goto L_0x00f6
            r15 = r3
            goto L_0x00f9
        L_0x00f6:
            com.google.android.exoplayer2.b0 r2 = r2.f
            r15 = r2
        L_0x00f9:
            r16 = 0
            if (r30 == 0) goto L_0x0100
            p00 r2 = defpackage.p00.h
            goto L_0x0104
        L_0x0100:
            com.google.android.exoplayer2.n0 r2 = r1.x
            p00 r2 = r2.h
        L_0x0104:
            r17 = r2
            if (r30 == 0) goto L_0x010b
            l40 r2 = r1.h
            goto L_0x010f
        L_0x010b:
            com.google.android.exoplayer2.n0 r2 = r1.x
            l40 r2 = r2.i
        L_0x010f:
            r18 = r2
            r22 = 0
            r7 = r0
            r9 = r19
            r10 = r24
            r20 = r24
            r7.<init>(r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r22, r24)
            r1.x = r0
            if (r28 == 0) goto L_0x0132
            f00 r0 = r1.y
            if (r0 == 0) goto L_0x0132
            r0.b(r1)     // Catch:{ RuntimeException -> 0x0129 }
            goto L_0x0130
        L_0x0129:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "Failed to release child source."
            defpackage.b50.d(r6, r0, r2)
        L_0x0130:
            r1.y = r3
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.T(boolean, boolean, boolean, boolean, boolean):void");
    }

    private void U(long j2) {
        j0 n2 = this.v.n();
        if (n2 != null) {
            j2 = n2.z(j2);
        }
        this.J = j2;
        this.r.c(j2);
        for (u0 v2 : this.z) {
            v2.v(this.J);
        }
        M();
    }

    private boolean V(c cVar) {
        Object obj = cVar.h;
        if (obj == null) {
            Pair<Object, Long> X = X(new e(cVar.e.g(), cVar.e.i(), v.a(cVar.e.e())), false);
            if (X == null) {
                return false;
            }
            cVar.e(this.x.a.b(X.first), ((Long) X.second).longValue(), X.first);
            return true;
        }
        int b2 = this.x.a.b(obj);
        if (b2 == -1) {
            return false;
        }
        cVar.f = b2;
        return true;
    }

    private void W() {
        for (int size = this.t.size() - 1; size >= 0; size--) {
            if (!V(this.t.get(size))) {
                this.t.get(size).e.k(false);
                this.t.remove(size);
            }
        }
        Collections.sort(this.t);
    }

    private Pair<Object, Long> X(e eVar, boolean z2) {
        Object Y;
        b1 b1Var = this.x.a;
        b1 b1Var2 = eVar.a;
        if (b1Var.q()) {
            return null;
        }
        if (b1Var2.q()) {
            b1Var2 = b1Var;
        }
        try {
            Pair<Object, Long> j2 = b1Var2.j(this.n, this.o, eVar.b, eVar.c);
            if (b1Var == b1Var2 || b1Var.b(j2.first) != -1) {
                return j2;
            }
            if (z2 && (Y = Y(j2.first, b1Var2, b1Var)) != null) {
                return r(b1Var, b1Var.h(Y, this.o).c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private Object Y(Object obj, b1 b1Var, b1 b1Var2) {
        int b2 = b1Var.b(obj);
        int i2 = b1Var.i();
        int i3 = b2;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = b1Var.d(i3, this.o, this.n, this.E, this.F);
            if (i3 == -1) {
                break;
            }
            i4 = b1Var2.b(b1Var.m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return b1Var2.m(i4);
    }

    private void Z(long j2, long j3) {
        this.k.e(2);
        this.k.d(2, j2 + j3);
    }

    private void b0(boolean z2) {
        f00.a aVar = this.v.n().f.a;
        long e0 = e0(aVar, this.x.m, true);
        if (e0 != this.x.m) {
            this.x = e(aVar, e0, this.x.d);
            if (z2) {
                this.s.g(4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c0(com.google.android.exoplayer2.d0.e r17) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            com.google.android.exoplayer2.d0$d r1 = r7.s
            r2 = 1
            r1.e(r2)
            android.util.Pair r1 = r7.X(r0, r2)
            r4 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0028
            com.google.android.exoplayer2.n0 r1 = r7.x
            boolean r6 = r7.F
            com.google.android.exoplayer2.b1$c r10 = r7.n
            com.google.android.exoplayer2.b1$b r11 = r7.o
            f00$a r1 = r1.i(r6, r10, r11)
            r11 = r1
            r12 = r8
            r14 = r12
            r10 = 1
            goto L_0x0057
        L_0x0028:
            java.lang.Object r6 = r1.first
            java.lang.Object r10 = r1.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            com.google.android.exoplayer2.l0 r12 = r7.v
            f00$a r6 = r12.v(r6, r10)
            boolean r12 = r6.a()
            if (r12 == 0) goto L_0x0043
            r12 = r4
            r14 = r10
            r10 = 1
        L_0x0041:
            r11 = r6
            goto L_0x0057
        L_0x0043:
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r12 = r1.longValue()
            long r14 = r0.c
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r14 = r10
            r10 = r1
            goto L_0x0041
        L_0x0057:
            r6 = 2
            f00 r1 = r7.y     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x00d1
            int r1 = r7.H     // Catch:{ all -> 0x00e9 }
            if (r1 <= 0) goto L_0x0062
            goto L_0x00d1
        L_0x0062:
            int r0 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            r0 = 4
            r7.u0(r0)     // Catch:{ all -> 0x00e9 }
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r0 = 1
            r1 = r16
            r8 = 2
            r6 = r0
            r1.T(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d4
        L_0x0077:
            r8 = 2
            com.google.android.exoplayer2.n0 r0 = r7.x     // Catch:{ all -> 0x00e7 }
            f00$a r0 = r0.b     // Catch:{ all -> 0x00e7 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00c2
            com.google.android.exoplayer2.l0 r0 = r7.v     // Catch:{ all -> 0x00e7 }
            com.google.android.exoplayer2.j0 r0 = r0.n()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x009b
            boolean r1 = r0.d     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x009b
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x009b
            e00 r0 = r0.a     // Catch:{ all -> 0x00e7 }
            com.google.android.exoplayer2.z0 r1 = r7.w     // Catch:{ all -> 0x00e7 }
            long r0 = r0.e(r12, r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x009c
        L_0x009b:
            r0 = r12
        L_0x009c:
            long r4 = com.google.android.exoplayer2.v.b(r0)     // Catch:{ all -> 0x00e7 }
            com.google.android.exoplayer2.n0 r6 = r7.x     // Catch:{ all -> 0x00e7 }
            long r2 = r6.m     // Catch:{ all -> 0x00e7 }
            long r2 = com.google.android.exoplayer2.v.b(r2)     // Catch:{ all -> 0x00e7 }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00c3
            com.google.android.exoplayer2.n0 r0 = r7.x     // Catch:{ all -> 0x00e7 }
            long r3 = r0.m     // Catch:{ all -> 0x00e7 }
            r1 = r16
            r2 = r11
            r5 = r14
            com.google.android.exoplayer2.n0 r0 = r1.e(r2, r3, r5)
            r7.x = r0
            if (r10 == 0) goto L_0x00c1
            com.google.android.exoplayer2.d0$d r0 = r7.s
            r0.g(r8)
        L_0x00c1:
            return
        L_0x00c2:
            r0 = r12
        L_0x00c3:
            long r0 = r7.d0(r11, r0)     // Catch:{ all -> 0x00e7 }
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00cd
            r2 = 1
            goto L_0x00ce
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            r10 = r10 | r2
            r3 = r0
            goto L_0x00d5
        L_0x00d1:
            r8 = 2
            r7.I = r0     // Catch:{ all -> 0x00e7 }
        L_0x00d4:
            r3 = r12
        L_0x00d5:
            r1 = r16
            r2 = r11
            r5 = r14
            com.google.android.exoplayer2.n0 r0 = r1.e(r2, r3, r5)
            r7.x = r0
            if (r10 == 0) goto L_0x00e6
            com.google.android.exoplayer2.d0$d r0 = r7.s
            r0.g(r8)
        L_0x00e6:
            return
        L_0x00e7:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e9:
            r0 = move-exception
            r8 = 2
        L_0x00eb:
            r1 = r16
            r2 = r11
            r3 = r12
            r5 = r14
            com.google.android.exoplayer2.n0 r1 = r1.e(r2, r3, r5)
            r7.x = r1
            if (r10 == 0) goto L_0x00fd
            com.google.android.exoplayer2.d0$d r1 = r7.s
            r1.g(r8)
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.c0(com.google.android.exoplayer2.d0$e):void");
    }

    private long d0(f00.a aVar, long j2) {
        return e0(aVar, j2, this.v.n() != this.v.o());
    }

    private n0 e(f00.a aVar, long j2, long j3) {
        this.L = true;
        return this.x.c(aVar, j2, j3, t());
    }

    private long e0(f00.a aVar, long j2, boolean z2) {
        A0();
        this.C = false;
        n0 n0Var = this.x;
        if (n0Var.e != 1 && !n0Var.a.q()) {
            u0(2);
        }
        j0 n2 = this.v.n();
        j0 j0Var = n2;
        while (true) {
            if (j0Var != null) {
                if (aVar.equals(j0Var.f.a) && j0Var.d) {
                    this.v.u(j0Var);
                    break;
                }
                j0Var = this.v.a();
            } else {
                break;
            }
        }
        if (z2 || n2 != j0Var || (j0Var != null && j0Var.z(j2) < 0)) {
            for (u0 g2 : this.z) {
                g(g2);
            }
            this.z = new u0[0];
            n2 = null;
            if (j0Var != null) {
                j0Var.x(0);
            }
        }
        if (j0Var != null) {
            F0(n2);
            if (j0Var.e) {
                long o2 = j0Var.a.o(j2);
                j0Var.a.u(o2 - this.p, this.q);
                j2 = o2;
            }
            U(j2);
            F();
        } else {
            this.v.e(true);
            this.x = this.x.g(p00.h, this.h);
            U(j2);
        }
        w(false);
        this.k.b(2);
        return j2;
    }

    private void f(s0 s0Var) {
        if (!s0Var.j()) {
            try {
                s0Var.f().r(s0Var.h(), s0Var.d());
            } finally {
                s0Var.k(true);
            }
        }
    }

    private void f0(s0 s0Var) {
        if (s0Var.e() == -9223372036854775807L) {
            g0(s0Var);
        } else if (this.y == null || this.H > 0) {
            this.t.add(new c(s0Var));
        } else {
            c cVar = new c(s0Var);
            if (V(cVar)) {
                this.t.add(cVar);
                Collections.sort(this.t);
                return;
            }
            s0Var.k(false);
        }
    }

    private void g(u0 u0Var) {
        this.r.a(u0Var);
        n(u0Var);
        u0Var.i();
    }

    private void g0(s0 s0Var) {
        if (s0Var.c().getLooper() == this.k.g()) {
            f(s0Var);
            int i2 = this.x.e;
            if (i2 == 3 || i2 == 2) {
                this.k.b(2);
                return;
            }
            return;
        }
        this.k.f(16, s0Var).sendToTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r16 = this;
            r0 = r16
            r40 r1 = r0.u
            long r1 = r1.b()
            r16.D0()
            com.google.android.exoplayer2.n0 r3 = r0.x
            int r3 = r3.e
            r5 = 1
            if (r3 == r5) goto L_0x0155
            r6 = 4
            if (r3 != r6) goto L_0x0017
            goto L_0x0155
        L_0x0017:
            com.google.android.exoplayer2.l0 r3 = r0.v
            com.google.android.exoplayer2.j0 r3 = r3.n()
            r7 = 10
            if (r3 != 0) goto L_0x0025
            r0.Z(r1, r7)
            return
        L_0x0025:
            java.lang.String r9 = "doSomeWork"
            defpackage.t50.a(r9)
            r16.E0()
            boolean r9 = r3.d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00ae
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            e00 r9 = r3.a
            com.google.android.exoplayer2.n0 r15 = r0.x
            long r10 = r15.m
            long r7 = r0.p
            long r10 = r10 - r7
            boolean r7 = r0.q
            r9.u(r10, r7)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x004b:
            com.google.android.exoplayer2.u0[] r10 = r0.e
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00ab
            r10 = r10[r7]
            int r11 = r10.getState()
            if (r11 != 0) goto L_0x0059
            goto L_0x00a7
        L_0x0059:
            long r4 = r0.J
            r10.q(r4, r13)
            if (r8 == 0) goto L_0x0068
            boolean r4 = r10.c()
            if (r4 == 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            l00[] r4 = r3.c
            r4 = r4[r7]
            l00 r5 = r10.d()
            if (r4 == r5) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 != 0) goto L_0x0086
            com.google.android.exoplayer2.j0 r5 = r3.j()
            if (r5 == 0) goto L_0x0086
            boolean r5 = r10.k()
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r4 != 0) goto L_0x009a
            if (r5 != 0) goto L_0x009a
            boolean r4 = r10.f()
            if (r4 != 0) goto L_0x009a
            boolean r4 = r10.c()
            if (r4 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r4 = 0
            goto L_0x009b
        L_0x009a:
            r4 = 1
        L_0x009b:
            if (r9 == 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            r9 = 1
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            if (r4 != 0) goto L_0x00a7
            r10.t()
        L_0x00a7:
            int r7 = r7 + 1
            r5 = 1
            goto L_0x004b
        L_0x00ab:
            r5 = r8
            r15 = r9
            goto L_0x00b5
        L_0x00ae:
            e00 r4 = r3.a
            r4.n()
            r5 = 1
            r15 = 1
        L_0x00b5:
            com.google.android.exoplayer2.k0 r4 = r3.f
            long r7 = r4.e
            r4 = 3
            if (r5 == 0) goto L_0x00de
            boolean r5 = r3.d
            if (r5 == 0) goto L_0x00de
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00d1
            com.google.android.exoplayer2.n0 r5 = r0.x
            long r9 = r5.m
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x00de
        L_0x00d1:
            com.google.android.exoplayer2.k0 r3 = r3.f
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x00de
            r0.u0(r6)
            r16.A0()
            goto L_0x0116
        L_0x00de:
            com.google.android.exoplayer2.n0 r3 = r0.x
            int r3 = r3.e
            r5 = 2
            if (r3 != r5) goto L_0x00f6
            boolean r3 = r0.x0(r15)
            if (r3 == 0) goto L_0x00f6
            r0.u0(r4)
            boolean r3 = r0.B
            if (r3 == 0) goto L_0x0116
            r16.y0()
            goto L_0x0116
        L_0x00f6:
            com.google.android.exoplayer2.n0 r3 = r0.x
            int r3 = r3.e
            if (r3 != r4) goto L_0x0116
            com.google.android.exoplayer2.u0[] r3 = r0.z
            int r3 = r3.length
            if (r3 != 0) goto L_0x0108
            boolean r3 = r16.D()
            if (r3 == 0) goto L_0x010a
            goto L_0x0116
        L_0x0108:
            if (r15 != 0) goto L_0x0116
        L_0x010a:
            boolean r3 = r0.B
            r0.C = r3
            r3 = 2
            r0.u0(r3)
            r16.A0()
            goto L_0x0117
        L_0x0116:
            r3 = 2
        L_0x0117:
            com.google.android.exoplayer2.n0 r5 = r0.x
            int r5 = r5.e
            if (r5 != r3) goto L_0x012a
            com.google.android.exoplayer2.u0[] r3 = r0.z
            int r5 = r3.length
        L_0x0120:
            if (r12 >= r5) goto L_0x012a
            r7 = r3[r12]
            r7.t()
            int r12 = r12 + 1
            goto L_0x0120
        L_0x012a:
            boolean r3 = r0.B
            if (r3 == 0) goto L_0x0134
            com.google.android.exoplayer2.n0 r3 = r0.x
            int r3 = r3.e
            if (r3 == r4) goto L_0x013b
        L_0x0134:
            com.google.android.exoplayer2.n0 r3 = r0.x
            int r3 = r3.e
            r4 = 2
            if (r3 != r4) goto L_0x0141
        L_0x013b:
            r3 = 10
        L_0x013d:
            r0.Z(r1, r3)
            goto L_0x0151
        L_0x0141:
            com.google.android.exoplayer2.u0[] r4 = r0.z
            int r4 = r4.length
            if (r4 == 0) goto L_0x014b
            if (r3 == r6) goto L_0x014b
            r3 = 1000(0x3e8, double:4.94E-321)
            goto L_0x013d
        L_0x014b:
            a50 r1 = r0.k
            r2 = 2
            r1.e(r2)
        L_0x0151:
            defpackage.t50.c()
            return
        L_0x0155:
            r2 = 2
            a50 r1 = r0.k
            r1.e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.h():void");
    }

    private void h0(s0 s0Var) {
        Handler c2 = s0Var.c();
        if (!c2.getLooper().getThread().isAlive()) {
            b50.h("TAG", "Trying to send message on a dead thread.");
            s0Var.k(false);
            return;
        }
        c2.post(new q(this, s0Var));
    }

    private void i(int i2, boolean z2, int i3) {
        j0 n2 = this.v.n();
        u0 u0Var = this.e[i2];
        this.z[i3] = u0Var;
        if (u0Var.getState() == 0) {
            l40 o2 = n2.o();
            x0 x0Var = o2.b[i2];
            f0[] p2 = p(o2.c.a(i2));
            boolean z3 = this.B && this.x.e == 3;
            u0Var.l(x0Var, p2, n2.c[i2], this.J, !z2 && z3, n2.l());
            this.r.b(u0Var);
            if (z3) {
                u0Var.start();
            }
        }
    }

    private void i0(o0 o0Var, boolean z2) {
        this.k.c(17, z2 ? 1 : 0, 0, o0Var).sendToTarget();
    }

    private void j0() {
        for (u0 u0Var : this.e) {
            if (u0Var.d() != null) {
                u0Var.m();
            }
        }
    }

    private void k(boolean[] zArr, int i2) {
        this.z = new u0[i2];
        l40 o2 = this.v.n().o();
        for (int i3 = 0; i3 < this.e.length; i3++) {
            if (!o2.c(i3)) {
                this.e[i3].a();
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.e.length; i5++) {
            if (o2.c(i5)) {
                i(i5, zArr[i5], i4);
                i4++;
            }
        }
    }

    private void k0(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.G != z2) {
            this.G = z2;
            if (!z2) {
                for (u0 u0Var : this.e) {
                    if (u0Var.getState() == 0) {
                        u0Var.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void m0(boolean z2) {
        this.C = false;
        this.B = z2;
        if (!z2) {
            A0();
            E0();
            return;
        }
        int i2 = this.x.e;
        if (i2 == 3) {
            y0();
        } else if (i2 != 2) {
            return;
        }
        this.k.b(2);
    }

    private void n(u0 u0Var) {
        if (u0Var.getState() == 2) {
            u0Var.stop();
        }
    }

    private String o(b0 b0Var) {
        if (b0Var.e != 1) {
            return "Playback error.";
        }
        int i2 = b0Var.f;
        String Y = v50.Y(this.e[i2].j());
        String valueOf = String.valueOf(b0Var.g);
        String e2 = v0.e(b0Var.h);
        StringBuilder sb = new StringBuilder(String.valueOf(Y).length() + 67 + String.valueOf(valueOf).length() + String.valueOf(e2).length());
        sb.append("Renderer error: index=");
        sb.append(i2);
        sb.append(", type=");
        sb.append(Y);
        sb.append(", format=");
        sb.append(valueOf);
        sb.append(", rendererSupport=");
        sb.append(e2);
        return sb.toString();
    }

    private void o0(o0 o0Var) {
        this.r.g(o0Var);
        i0(this.r.e(), true);
    }

    private static f0[] p(h40 h40) {
        int length = h40 != null ? h40.length() : 0;
        f0[] f0VarArr = new f0[length];
        for (int i2 = 0; i2 < length; i2++) {
            f0VarArr[i2] = h40.d(i2);
        }
        return f0VarArr;
    }

    private long q() {
        j0 o2 = this.v.o();
        if (o2 == null) {
            return 0;
        }
        long l2 = o2.l();
        if (!o2.d) {
            return l2;
        }
        int i2 = 0;
        while (true) {
            u0[] u0VarArr = this.e;
            if (i2 >= u0VarArr.length) {
                return l2;
            }
            if (u0VarArr[i2].getState() != 0 && this.e[i2].d() == o2.c[i2]) {
                long u2 = this.e[i2].u();
                if (u2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l2 = Math.max(u2, l2);
            }
            i2++;
        }
    }

    private void q0(int i2) {
        this.E = i2;
        if (!this.v.C(i2)) {
            b0(true);
        }
        w(false);
    }

    private Pair<Object, Long> r(b1 b1Var, int i2, long j2) {
        return b1Var.j(this.n, this.o, i2, j2);
    }

    private void r0(z0 z0Var) {
        this.w = z0Var;
    }

    private long t() {
        return u(this.x.k);
    }

    private void t0(boolean z2) {
        this.F = z2;
        if (!this.v.D(z2)) {
            b0(true);
        }
        w(false);
    }

    private long u(long j2) {
        j0 i2 = this.v.i();
        if (i2 == null) {
            return 0;
        }
        return Math.max(0, j2 - i2.y(this.J));
    }

    private void u0(int i2) {
        n0 n0Var = this.x;
        if (n0Var.e != i2) {
            this.x = n0Var.e(i2);
        }
    }

    private void v(e00 e00) {
        if (this.v.s(e00)) {
            this.v.t(this.J);
            F();
        }
    }

    private boolean v0() {
        j0 n2;
        j0 j2;
        if (!this.B || (n2 = this.v.n()) == null || (j2 = n2.j()) == null) {
            return false;
        }
        return (n2 != this.v.o() || B()) && this.J >= j2.m();
    }

    private void w(boolean z2) {
        j0 i2 = this.v.i();
        f00.a aVar = i2 == null ? this.x.b : i2.f.a;
        boolean z3 = !this.x.j.equals(aVar);
        if (z3) {
            this.x = this.x.b(aVar);
        }
        n0 n0Var = this.x;
        n0Var.k = i2 == null ? n0Var.m : i2.i();
        this.x.l = t();
        if ((z3 || z2) && i2 != null && i2.d) {
            C0(i2.n(), i2.o());
        }
    }

    private boolean w0() {
        if (!C()) {
            return false;
        }
        return this.i.e(u(this.v.i().k()), this.r.e().a);
    }

    private void x(e00 e00) {
        if (this.v.s(e00)) {
            j0 i2 = this.v.i();
            i2.p(this.r.e().a, this.x.a);
            C0(i2.n(), i2.o());
            if (i2 == this.v.n()) {
                U(i2.f.b);
                F0((j0) null);
            }
            F();
        }
    }

    private boolean x0(boolean z2) {
        if (this.z.length == 0) {
            return D();
        }
        if (!z2) {
            return false;
        }
        if (!this.x.g) {
            return true;
        }
        j0 i2 = this.v.i();
        return (i2.q() && i2.f.g) || this.i.d(t(), this.r.e().a, this.C);
    }

    private void y(o0 o0Var, boolean z2) {
        this.m.obtainMessage(1, z2 ? 1 : 0, 0, o0Var).sendToTarget();
        G0(o0Var.a);
        for (u0 u0Var : this.e) {
            if (u0Var != null) {
                u0Var.s(o0Var.a);
            }
        }
    }

    private void y0() {
        this.C = false;
        this.r.f();
        for (u0 start : this.z) {
            start.start();
        }
    }

    private void z() {
        if (this.x.e != 1) {
            u0(4);
        }
        T(false, false, true, false, true);
    }

    private void z0(boolean z2, boolean z3, boolean z4) {
        T(z2 || !this.G, true, z3, z3, z3);
        this.s.e(this.H + (z4 ? 1 : 0));
        this.H = 0;
        this.i.i();
        u0(1);
    }

    public /* synthetic */ void E(s0 s0Var) {
        try {
            f(s0Var);
        } catch (b0 e2) {
            b50.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: N */
    public void j(e00 e00) {
        this.k.f(10, e00).sendToTarget();
    }

    public void O(f00 f00, boolean z2, boolean z3) {
        this.k.c(0, z2 ? 1 : 0, z3 ? 1 : 0, f00).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void Q() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x002a
            android.os.HandlerThread r0 = r2.l     // Catch:{ all -> 0x002c }
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x000e
            goto L_0x002a
        L_0x000e:
            a50 r0 = r2.k     // Catch:{ all -> 0x002c }
            r1 = 7
            r0.b(r1)     // Catch:{ all -> 0x002c }
            r0 = 0
        L_0x0015:
            boolean r1 = r2.A     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001f
            r2.wait()     // Catch:{ InterruptedException -> 0x001d }
            goto L_0x0015
        L_0x001d:
            r0 = 1
            goto L_0x0015
        L_0x001f:
            if (r0 == 0) goto L_0x0028
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
            r0.interrupt()     // Catch:{ all -> 0x002c }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.d0.Q():void");
    }

    public void a0(b1 b1Var, int i2, long j2) {
        this.k.f(3, new e(b1Var, i2, j2)).sendToTarget();
    }

    public void b(f00 f00, b1 b1Var) {
        this.k.f(8, new b(f00, b1Var)).sendToTarget();
    }

    public void c(o0 o0Var) {
        i0(o0Var, false);
    }

    public synchronized void d(s0 s0Var) {
        if (!this.A) {
            if (this.l.isAlive()) {
                this.k.f(15, s0Var).sendToTarget();
                return;
            }
        }
        b50.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        s0Var.k(false);
    }

    public boolean handleMessage(Message message) {
        n0 n0Var;
        try {
            switch (message.what) {
                case 0:
                    P((f00) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    m0(message.arg1 != 0);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    c0((e) message.obj);
                    break;
                case 4:
                    o0((o0) message.obj);
                    break;
                case 5:
                    r0((z0) message.obj);
                    break;
                case 6:
                    z0(false, message.arg1 != 0, true);
                    break;
                case 7:
                    R();
                    return true;
                case 8:
                    A((b) message.obj);
                    break;
                case 9:
                    x((e00) message.obj);
                    break;
                case 10:
                    v((e00) message.obj);
                    break;
                case 11:
                    S();
                    break;
                case 12:
                    q0(message.arg1);
                    break;
                case 13:
                    t0(message.arg1 != 0);
                    break;
                case 14:
                    k0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    f0((s0) message.obj);
                    break;
                case 16:
                    h0((s0) message.obj);
                    break;
                case 17:
                    y((o0) message.obj, message.arg1 != 0);
                    break;
                default:
                    return false;
            }
            G();
        } catch (b0 e2) {
            e = e2;
            b50.d("ExoPlayerImplInternal", o(e), e);
            z0(true, false, false);
            n0Var = this.x;
            this.x = n0Var.d(e);
            G();
            return true;
        } catch (IOException e3) {
            b50.d("ExoPlayerImplInternal", "Source error", e3);
            z0(false, false, false);
            n0Var = this.x;
            e = b0.c(e3);
            this.x = n0Var.d(e);
            G();
            return true;
        } catch (OutOfMemoryError | RuntimeException e4) {
            b50.d("ExoPlayerImplInternal", "Internal runtime error", e4);
            e = e4 instanceof OutOfMemoryError ? b0.a((OutOfMemoryError) e4) : b0.d((RuntimeException) e4);
            z0(true, false, false);
            n0Var = this.x;
            this.x = n0Var.d(e);
            G();
            return true;
        }
        return true;
    }

    public void l0(boolean z2) {
        this.k.a(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void m(e00 e00) {
        this.k.f(9, e00).sendToTarget();
    }

    public void n0(o0 o0Var) {
        this.k.f(4, o0Var).sendToTarget();
    }

    public void p0(int i2) {
        this.k.a(12, i2, 0).sendToTarget();
    }

    public Looper s() {
        return this.l.getLooper();
    }

    public void s0(boolean z2) {
        this.k.a(13, z2 ? 1 : 0, 0).sendToTarget();
    }
}
