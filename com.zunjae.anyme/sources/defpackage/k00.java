package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.upstream.e;
import defpackage.ps;
import defpackage.vt;

/* renamed from: k00  reason: default package */
public class k00 implements vt {
    private int A;
    private boolean B;
    private f0 C;
    private long D;
    private boolean E;
    private final j00 a;
    private final a b = new a();
    private final rs<?> c;
    private b d;
    private final Looper e;
    private f0 f;
    private ps<?> g;
    private int h = 1000;
    private int[] i = new int[1000];
    private long[] j = new long[1000];
    private int[] k = new int[1000];
    private int[] l = new int[1000];
    private long[] m = new long[1000];
    private vt.a[] n = new vt.a[1000];
    private f0[] o = new f0[1000];
    private int p;
    private int q;
    private int r;
    private int s;
    private long t = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private boolean v;
    private boolean w = true;
    private boolean x = true;
    private f0 y;
    private f0 z;

    /* renamed from: k00$a */
    static final class a {
        public int a;
        public long b;
        public vt.a c;

        a() {
        }
    }

    /* renamed from: k00$b */
    public interface b {
        void j(f0 f0Var);
    }

    public k00(e eVar, Looper looper, rs<?> rsVar) {
        this.a = new j00(eVar);
        this.e = looper;
        this.c = rsVar;
    }

    private boolean B() {
        return this.s != this.p;
    }

    private boolean F(int i2) {
        ps<?> psVar;
        if (this.c == rs.a || (psVar = this.g) == null || psVar.getState() == 4) {
            return true;
        }
        return (this.l[i2] & 1073741824) == 0 && this.g.c();
    }

    private void H(f0 f0Var, g0 g0Var) {
        g0Var.c = f0Var;
        boolean z2 = this.f == null;
        ns nsVar = z2 ? null : this.f.p;
        this.f = f0Var;
        if (this.c != rs.a) {
            ns nsVar2 = f0Var.p;
            g0Var.a = true;
            g0Var.b = this.g;
            if (z2 || !v50.b(nsVar, nsVar2)) {
                ps<?> psVar = this.g;
                ps<?> d2 = nsVar2 != null ? this.c.d(this.e, nsVar2) : this.c.c(this.e, e50.h(f0Var.m));
                this.g = d2;
                g0Var.b = d2;
                if (psVar != null) {
                    psVar.a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int L(com.google.android.exoplayer2.g0 r7, defpackage.as r8, boolean r9, boolean r10, long r11, defpackage.k00.a r13) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r8.g = r0     // Catch:{ all -> 0x00ad }
            r0 = -1
        L_0x0005:
            boolean r1 = r6.B()     // Catch:{ all -> 0x00ad }
            r2 = 1
            if (r1 == 0) goto L_0x002c
            int r0 = r6.s     // Catch:{ all -> 0x00ad }
            int r0 = r6.y(r0)     // Catch:{ all -> 0x00ad }
            long[] r3 = r6.m     // Catch:{ all -> 0x00ad }
            r4 = r3[r0]     // Catch:{ all -> 0x00ad }
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x002c
            com.google.android.exoplayer2.f0[] r3 = r6.o     // Catch:{ all -> 0x00ad }
            r3 = r3[r0]     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = r3.m     // Catch:{ all -> 0x00ad }
            boolean r3 = defpackage.e50.a(r3)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x002c
            int r1 = r6.s     // Catch:{ all -> 0x00ad }
            int r1 = r1 + r2
            r6.s = r1     // Catch:{ all -> 0x00ad }
            goto L_0x0005
        L_0x002c:
            r3 = -3
            r4 = -5
            r5 = -4
            if (r1 != 0) goto L_0x0058
            if (r10 != 0) goto L_0x0052
            boolean r10 = r6.v     // Catch:{ all -> 0x00ad }
            if (r10 == 0) goto L_0x0038
            goto L_0x0052
        L_0x0038:
            com.google.android.exoplayer2.f0 r8 = r6.y     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x0050
            if (r9 != 0) goto L_0x0044
            com.google.android.exoplayer2.f0 r8 = r6.y     // Catch:{ all -> 0x00ad }
            com.google.android.exoplayer2.f0 r9 = r6.f     // Catch:{ all -> 0x00ad }
            if (r8 == r9) goto L_0x0050
        L_0x0044:
            com.google.android.exoplayer2.f0 r8 = r6.y     // Catch:{ all -> 0x00ad }
            defpackage.q40.e(r8)     // Catch:{ all -> 0x00ad }
            com.google.android.exoplayer2.f0 r8 = (com.google.android.exoplayer2.f0) r8     // Catch:{ all -> 0x00ad }
            r6.H(r8, r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r4
        L_0x0050:
            monitor-exit(r6)
            return r3
        L_0x0052:
            r7 = 4
            r8.setFlags(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r5
        L_0x0058:
            if (r9 != 0) goto L_0x00a4
            com.google.android.exoplayer2.f0[] r9 = r6.o     // Catch:{ all -> 0x00ad }
            r9 = r9[r0]     // Catch:{ all -> 0x00ad }
            com.google.android.exoplayer2.f0 r10 = r6.f     // Catch:{ all -> 0x00ad }
            if (r9 == r10) goto L_0x0063
            goto L_0x00a4
        L_0x0063:
            boolean r7 = r6.F(r0)     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x006d
            r8.g = r2     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r3
        L_0x006d:
            int[] r7 = r6.l     // Catch:{ all -> 0x00ad }
            r7 = r7[r0]     // Catch:{ all -> 0x00ad }
            r8.setFlags(r7)     // Catch:{ all -> 0x00ad }
            long[] r7 = r6.m     // Catch:{ all -> 0x00ad }
            r9 = r7[r0]     // Catch:{ all -> 0x00ad }
            r8.h = r9     // Catch:{ all -> 0x00ad }
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8.addFlag(r7)     // Catch:{ all -> 0x00ad }
        L_0x0083:
            boolean r7 = r8.q()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x008b
            monitor-exit(r6)
            return r5
        L_0x008b:
            int[] r7 = r6.k     // Catch:{ all -> 0x00ad }
            r7 = r7[r0]     // Catch:{ all -> 0x00ad }
            r13.a = r7     // Catch:{ all -> 0x00ad }
            long[] r7 = r6.j     // Catch:{ all -> 0x00ad }
            r8 = r7[r0]     // Catch:{ all -> 0x00ad }
            r13.b = r8     // Catch:{ all -> 0x00ad }
            vt$a[] r7 = r6.n     // Catch:{ all -> 0x00ad }
            r7 = r7[r0]     // Catch:{ all -> 0x00ad }
            r13.c = r7     // Catch:{ all -> 0x00ad }
            int r7 = r6.s     // Catch:{ all -> 0x00ad }
            int r7 = r7 + r2
            r6.s = r7     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r5
        L_0x00a4:
            com.google.android.exoplayer2.f0[] r8 = r6.o     // Catch:{ all -> 0x00ad }
            r8 = r8[r0]     // Catch:{ all -> 0x00ad }
            r6.H(r8, r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r6)
            return r4
        L_0x00ad:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.L(com.google.android.exoplayer2.g0, as, boolean, boolean, long, k00$a):int");
    }

    private void N() {
        ps<?> psVar = this.g;
        if (psVar != null) {
            psVar.a();
            this.g = null;
            this.f = null;
        }
    }

    private synchronized void Q() {
        this.s = 0;
        this.a.m();
    }

    private synchronized boolean U(f0 f0Var) {
        if (f0Var == null) {
            this.x = true;
            return false;
        }
        this.x = false;
        if (v50.b(f0Var, this.y)) {
            return false;
        }
        if (v50.b(f0Var, this.z)) {
            this.y = this.z;
            return true;
        }
        this.y = f0Var;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean g(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.p     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.t     // Catch:{ all -> 0x004a }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.t     // Catch:{ all -> 0x004a }
            int r0 = r7.s     // Catch:{ all -> 0x004a }
            long r5 = r7.w(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.p     // Catch:{ all -> 0x004a }
            int r1 = r7.p     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            int r1 = r7.y(r1)     // Catch:{ all -> 0x004a }
        L_0x002b:
            int r3 = r7.s     // Catch:{ all -> 0x004a }
            if (r0 <= r3) goto L_0x0042
            long[] r3 = r7.m     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0042
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002b
            int r1 = r7.h     // Catch:{ all -> 0x004a }
            int r1 = r1 - r2
            goto L_0x002b
        L_0x0042:
            int r8 = r7.q     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.p(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.g(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void h(long r6, int r8, long r9, int r11, defpackage.vt.a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.w     // Catch:{ all -> 0x00df }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.w = r1     // Catch:{ all -> 0x00df }
        L_0x000e:
            boolean r0 = r5.x     // Catch:{ all -> 0x00df }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            defpackage.q40.f(r0)     // Catch:{ all -> 0x00df }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r5.v = r0     // Catch:{ all -> 0x00df }
            long r3 = r5.u     // Catch:{ all -> 0x00df }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00df }
            r5.u = r3     // Catch:{ all -> 0x00df }
            int r0 = r5.p     // Catch:{ all -> 0x00df }
            int r0 = r5.y(r0)     // Catch:{ all -> 0x00df }
            long[] r3 = r5.m     // Catch:{ all -> 0x00df }
            r3[r0] = r6     // Catch:{ all -> 0x00df }
            long[] r6 = r5.j     // Catch:{ all -> 0x00df }
            r6[r0] = r9     // Catch:{ all -> 0x00df }
            int[] r6 = r5.k     // Catch:{ all -> 0x00df }
            r6[r0] = r11     // Catch:{ all -> 0x00df }
            int[] r6 = r5.l     // Catch:{ all -> 0x00df }
            r6[r0] = r8     // Catch:{ all -> 0x00df }
            vt$a[] r6 = r5.n     // Catch:{ all -> 0x00df }
            r6[r0] = r12     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0[] r6 = r5.o     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0 r7 = r5.y     // Catch:{ all -> 0x00df }
            r6[r0] = r7     // Catch:{ all -> 0x00df }
            int[] r6 = r5.i     // Catch:{ all -> 0x00df }
            int r7 = r5.A     // Catch:{ all -> 0x00df }
            r6[r0] = r7     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0 r6 = r5.y     // Catch:{ all -> 0x00df }
            r5.z = r6     // Catch:{ all -> 0x00df }
            int r6 = r5.p     // Catch:{ all -> 0x00df }
            int r6 = r6 + r2
            r5.p = r6     // Catch:{ all -> 0x00df }
            int r7 = r5.h     // Catch:{ all -> 0x00df }
            if (r6 != r7) goto L_0x00dd
            int r6 = r5.h     // Catch:{ all -> 0x00df }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00df }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00df }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00df }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00df }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00df }
            vt$a[] r12 = new defpackage.vt.a[r6]     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0[] r0 = new com.google.android.exoplayer2.f0[r6]     // Catch:{ all -> 0x00df }
            int r2 = r5.h     // Catch:{ all -> 0x00df }
            int r3 = r5.r     // Catch:{ all -> 0x00df }
            int r2 = r2 - r3
            long[] r3 = r5.j     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00df }
            long[] r3 = r5.m     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.l     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.k     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00df }
            vt$a[] r3 = r5.n     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0[] r3 = r5.o     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00df }
            int[] r3 = r5.i     // Catch:{ all -> 0x00df }
            int r4 = r5.r     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00df }
            int r3 = r5.r     // Catch:{ all -> 0x00df }
            long[] r4 = r5.j     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00df }
            long[] r4 = r5.m     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.l     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.k     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00df }
            vt$a[] r4 = r5.n     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00df }
            com.google.android.exoplayer2.f0[] r4 = r5.o     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00df }
            int[] r4 = r5.i     // Catch:{ all -> 0x00df }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00df }
            r5.j = r8     // Catch:{ all -> 0x00df }
            r5.m = r9     // Catch:{ all -> 0x00df }
            r5.l = r10     // Catch:{ all -> 0x00df }
            r5.k = r11     // Catch:{ all -> 0x00df }
            r5.n = r12     // Catch:{ all -> 0x00df }
            r5.o = r0     // Catch:{ all -> 0x00df }
            r5.i = r7     // Catch:{ all -> 0x00df }
            r5.r = r1     // Catch:{ all -> 0x00df }
            r5.h = r6     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r5)
            return
        L_0x00df:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.h(long, int, long, int, vt$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r9.p     // Catch:{ all -> 0x0038 }
            r1 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r9.m     // Catch:{ all -> 0x0038 }
            int r3 = r9.r     // Catch:{ all -> 0x0038 }
            r3 = r0[r3]     // Catch:{ all -> 0x0038 }
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            goto L_0x0036
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            int r13 = r9.s     // Catch:{ all -> 0x0038 }
            int r0 = r9.p     // Catch:{ all -> 0x0038 }
            if (r13 == r0) goto L_0x001f
            int r13 = r9.s     // Catch:{ all -> 0x0038 }
            int r13 = r13 + 1
            goto L_0x0021
        L_0x001f:
            int r13 = r9.p     // Catch:{ all -> 0x0038 }
        L_0x0021:
            r5 = r13
            int r4 = r9.r     // Catch:{ all -> 0x0038 }
            r3 = r9
            r6 = r10
            r8 = r12
            int r10 = r3.r(r4, r5, r6, r8)     // Catch:{ all -> 0x0038 }
            r11 = -1
            if (r10 != r11) goto L_0x0030
            monitor-exit(r9)
            return r1
        L_0x0030:
            long r10 = r9.l(r10)     // Catch:{ all -> 0x0038 }
            monitor-exit(r9)
            return r10
        L_0x0036:
            monitor-exit(r9)
            return r1
        L_0x0038:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.i(long, boolean, boolean):long");
    }

    private synchronized long j() {
        if (this.p == 0) {
            return -1;
        }
        return l(this.p);
    }

    private long l(int i2) {
        this.t = Math.max(this.t, w(i2));
        this.p -= i2;
        this.q += i2;
        int i3 = this.r + i2;
        this.r = i3;
        int i4 = this.h;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i2;
        this.s = i5;
        if (i5 < 0) {
            this.s = 0;
        }
        if (this.p != 0) {
            return this.j[this.r];
        }
        int i6 = this.r;
        if (i6 == 0) {
            i6 = this.h;
        }
        int i7 = i6 - 1;
        return this.j[i7] + ((long) this.k[i7]);
    }

    private long p(int i2) {
        int A2 = A() - i2;
        boolean z2 = false;
        q40.a(A2 >= 0 && A2 <= this.p - this.s);
        int i3 = this.p - A2;
        this.p = i3;
        this.u = Math.max(this.t, w(i3));
        if (A2 == 0 && this.v) {
            z2 = true;
        }
        this.v = z2;
        int i4 = this.p;
        if (i4 == 0) {
            return 0;
        }
        int y2 = y(i4 - 1);
        return this.j[y2] + ((long) this.k[y2]);
    }

    private int r(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3 && this.m[i2] <= j2; i5++) {
            if (!z2 || (this.l[i2] & 1) != 0) {
                i4 = i5;
            }
            i2++;
            if (i2 == this.h) {
                i2 = 0;
            }
        }
        return i4;
    }

    private long w(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int y2 = y(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.m[y2]);
            if ((this.l[y2] & 1) != 0) {
                break;
            }
            y2--;
            if (y2 == -1) {
                y2 = this.h - 1;
            }
        }
        return j2;
    }

    private int y(int i2) {
        int i3 = this.r + i2;
        int i4 = this.h;
        return i3 < i4 ? i3 : i3 - i4;
    }

    public final int A() {
        return this.q + this.p;
    }

    /* access modifiers changed from: protected */
    public final void C() {
        this.B = true;
    }

    public final synchronized boolean D() {
        return this.v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean E(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.B()     // Catch:{ all -> 0x0032 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r4 != 0) goto L_0x001a
            boolean r4 = r3.v     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x001a
            com.google.android.exoplayer2.f0 r4 = r3.y     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0019
            com.google.android.exoplayer2.f0 r4 = r3.y     // Catch:{ all -> 0x0032 }
            com.google.android.exoplayer2.f0 r0 = r3.f     // Catch:{ all -> 0x0032 }
            if (r4 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            int r4 = r3.s     // Catch:{ all -> 0x0032 }
            int r4 = r3.y(r4)     // Catch:{ all -> 0x0032 }
            com.google.android.exoplayer2.f0[] r0 = r3.o     // Catch:{ all -> 0x0032 }
            r0 = r0[r4]     // Catch:{ all -> 0x0032 }
            com.google.android.exoplayer2.f0 r2 = r3.f     // Catch:{ all -> 0x0032 }
            if (r0 == r2) goto L_0x002c
            monitor-exit(r3)
            return r1
        L_0x002c:
            boolean r4 = r3.F(r4)     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.E(boolean):boolean");
    }

    public void G() {
        ps<?> psVar = this.g;
        if (psVar != null && psVar.getState() == 1) {
            ps.a f2 = this.g.f();
            q40.e(f2);
            throw f2;
        }
    }

    public final synchronized int I() {
        return B() ? this.i[y(this.s)] : this.A;
    }

    public void J() {
        n();
        N();
    }

    public int K(g0 g0Var, as asVar, boolean z2, boolean z3, long j2) {
        int L = L(g0Var, asVar, z2, z3, j2, this.b);
        if (L == -4 && !asVar.isEndOfStream() && !asVar.q()) {
            this.a.k(asVar, this.b);
        }
        return L;
    }

    public void M() {
        P(true);
        N();
    }

    public final void O() {
        P(false);
    }

    public void P(boolean z2) {
        this.a.l();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.w = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = false;
        this.z = null;
        if (z2) {
            this.C = null;
            this.y = null;
            this.x = true;
        }
    }

    public final synchronized boolean R(int i2) {
        boolean z2;
        Q();
        if (i2 >= this.q) {
            if (i2 <= this.q + this.p) {
                this.s = i2 - this.q;
                z2 = true;
            }
        }
        z2 = false;
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean S(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.Q()     // Catch:{ all -> 0x003e }
            int r0 = r8.s     // Catch:{ all -> 0x003e }
            int r2 = r8.y(r0)     // Catch:{ all -> 0x003e }
            boolean r0 = r8.B()     // Catch:{ all -> 0x003e }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.m     // Catch:{ all -> 0x003e }
            r3 = r0[r2]     // Catch:{ all -> 0x003e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            long r0 = r8.u     // Catch:{ all -> 0x003e }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x003c
        L_0x0022:
            int r11 = r8.p     // Catch:{ all -> 0x003e }
            int r0 = r8.s     // Catch:{ all -> 0x003e }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.r(r2, r3, r4, r6)     // Catch:{ all -> 0x003e }
            r10 = -1
            if (r9 != r10) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            int r10 = r8.s     // Catch:{ all -> 0x003e }
            int r10 = r10 + r9
            r8.s = r10     // Catch:{ all -> 0x003e }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.S(long, boolean):boolean");
    }

    public final void T(long j2) {
        if (this.D != j2) {
            this.D = j2;
            C();
        }
    }

    public final void V(b bVar) {
        this.d = bVar;
    }

    public final void W(int i2) {
        this.A = i2;
    }

    public final void X() {
        this.E = true;
    }

    public final int a(it itVar, int i2, boolean z2) {
        return this.a.n(itVar, i2, z2);
    }

    public final void b(i50 i50, int i2) {
        this.a.o(i50, i2);
    }

    public final void c(long j2, int i2, int i3, int i4, vt.a aVar) {
        if (this.B) {
            d(this.C);
        }
        long j3 = j2 + this.D;
        if (this.E) {
            if ((i2 & 1) != 0 && g(j3)) {
                this.E = false;
            } else {
                return;
            }
        }
        int i5 = i3;
        h(j3, i2, (this.a.e() - ((long) i5)) - ((long) i4), i5, aVar);
    }

    public final void d(f0 f0Var) {
        f0 s2 = s(f0Var);
        this.B = false;
        this.C = f0Var;
        boolean U = U(s2);
        b bVar = this.d;
        if (bVar != null && U) {
            bVar.j(s2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int e(long r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.s     // Catch:{ all -> 0x0032 }
            int r2 = r8.y(r0)     // Catch:{ all -> 0x0032 }
            boolean r0 = r8.B()     // Catch:{ all -> 0x0032 }
            r7 = 0
            if (r0 == 0) goto L_0x0030
            long[] r0 = r8.m     // Catch:{ all -> 0x0032 }
            r3 = r0[r2]     // Catch:{ all -> 0x0032 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            int r0 = r8.p     // Catch:{ all -> 0x0032 }
            int r1 = r8.s     // Catch:{ all -> 0x0032 }
            int r3 = r0 - r1
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.r(r2, r3, r4, r6)     // Catch:{ all -> 0x0032 }
            r10 = -1
            if (r9 != r10) goto L_0x0029
            monitor-exit(r8)
            return r7
        L_0x0029:
            int r10 = r8.s     // Catch:{ all -> 0x0032 }
            int r10 = r10 + r9
            r8.s = r10     // Catch:{ all -> 0x0032 }
            monitor-exit(r8)
            return r9
        L_0x0030:
            monitor-exit(r8)
            return r7
        L_0x0032:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k00.e(long):int");
    }

    public final synchronized int f() {
        int i2;
        i2 = this.p - this.s;
        this.s = this.p;
        return i2;
    }

    public synchronized long k() {
        if (this.s == 0) {
            return -1;
        }
        return l(this.s);
    }

    public final void m(long j2, boolean z2, boolean z3) {
        this.a.c(i(j2, z2, z3));
    }

    public final void n() {
        this.a.c(j());
    }

    public final void o() {
        this.a.c(k());
    }

    public final void q(int i2) {
        this.a.d(p(i2));
    }

    /* access modifiers changed from: protected */
    public f0 s(f0 f0Var) {
        long j2 = this.D;
        if (j2 == 0) {
            return f0Var;
        }
        long j3 = f0Var.q;
        return j3 != Long.MAX_VALUE ? f0Var.l(j3 + j2) : f0Var;
    }

    public final int t() {
        return this.q;
    }

    public final synchronized long u() {
        return this.p == 0 ? Long.MIN_VALUE : this.m[this.r];
    }

    public final synchronized long v() {
        return this.u;
    }

    public final int x() {
        return this.q + this.s;
    }

    public final synchronized f0 z() {
        return this.x ? null : this.y;
    }
}
