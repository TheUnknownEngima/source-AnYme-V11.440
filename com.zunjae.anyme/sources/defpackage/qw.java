package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.f0;
import defpackage.f50;
import defpackage.hx;
import defpackage.vt;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: qw  reason: default package */
public final class qw implements ow {
    private final cx a;
    private final boolean b;
    private final boolean c;
    private final vw d = new vw(7, 128);
    private final vw e = new vw(8, 128);
    private final vw f = new vw(6, 128);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private vt j;
    private b k;
    private boolean l;
    private long m;
    private boolean n;
    private final i50 o = new i50();

    /* renamed from: qw$b */
    private static final class b {
        private final vt a;
        private final boolean b;
        private final boolean c;
        private final SparseArray<f50.b> d = new SparseArray<>();
        private final SparseArray<f50.a> e = new SparseArray<>();
        private final j50 f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private a m = new a();
        private a n = new a();
        private boolean o;
        private long p;
        private long q;
        private boolean r;

        /* renamed from: qw$b$a */
        private static final class a {
            private boolean a;
            private boolean b;
            private f50.b c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;

            private a() {
            }

            /* access modifiers changed from: private */
            public boolean c(a aVar) {
                boolean z;
                boolean z2;
                if (this.a) {
                    if (!aVar.a || this.f != aVar.f || this.g != aVar.g || this.h != aVar.h) {
                        return true;
                    }
                    if (this.i && aVar.i && this.j != aVar.j) {
                        return true;
                    }
                    int i2 = this.d;
                    int i3 = aVar.d;
                    if (i2 != i3 && (i2 == 0 || i3 == 0)) {
                        return true;
                    }
                    if (this.c.k == 0 && aVar.c.k == 0 && (this.m != aVar.m || this.n != aVar.n)) {
                        return true;
                    }
                    if ((this.c.k != 1 || aVar.c.k != 1 || (this.o == aVar.o && this.p == aVar.p)) && (z = this.k) == (z2 = aVar.k)) {
                        return z && z2 && this.l != aVar.l;
                    }
                    return true;
                }
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                r0 = r2.e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean d() {
                /*
                    r2 = this;
                    boolean r0 = r2.b
                    if (r0 == 0) goto L_0x000e
                    int r0 = r2.e
                    r1 = 7
                    if (r0 == r1) goto L_0x000c
                    r1 = 2
                    if (r0 != r1) goto L_0x000e
                L_0x000c:
                    r0 = 1
                    goto L_0x000f
                L_0x000e:
                    r0 = 0
                L_0x000f:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.b.a.d():boolean");
            }

            public void e(f50.b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.c = bVar;
                this.d = i2;
                this.e = i3;
                this.f = i4;
                this.g = i5;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = i6;
                this.m = i7;
                this.n = i8;
                this.o = i9;
                this.p = i10;
                this.a = true;
                this.b = true;
            }

            public void f(int i2) {
                this.e = i2;
                this.b = true;
            }
        }

        public b(vt vtVar, boolean z, boolean z2) {
            this.a = vtVar;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new j50(bArr, 0, 0);
            g();
        }

        private void d(int i2) {
            boolean z = this.r;
            int i3 = (int) (this.j - this.p);
            this.a.c(this.q, z ? 1 : 0, i3, i2, (vt.a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.g
                int r4 = r3.length
                int r5 = r0.h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001e
                int r5 = r5 + r2
                int r5 = r5 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.g = r3
            L_0x001e:
                byte[] r3 = r0.g
                int r4 = r0.h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.h
                int r1 = r1 + r2
                r0.h = r1
                j50 r2 = r0.f
                byte[] r3 = r0.g
                r4 = 0
                r2.i(r3, r4, r1)
                j50 r1 = r0.f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003f
                return
            L_0x003f:
                j50 r1 = r0.f
                r1.k()
                j50 r1 = r0.f
                int r10 = r1.e(r7)
                j50 r1 = r0.f
                r2 = 5
                r1.l(r2)
                j50 r1 = r0.f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0059
                return
            L_0x0059:
                j50 r1 = r0.f
                r1.h()
                j50 r1 = r0.f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0067
                return
            L_0x0067:
                j50 r1 = r0.f
                int r11 = r1.h()
                boolean r1 = r0.c
                if (r1 != 0) goto L_0x0079
                r0.k = r4
                qw$b$a r1 = r0.n
                r1.f(r11)
                return
            L_0x0079:
                j50 r1 = r0.f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0082
                return
            L_0x0082:
                j50 r1 = r0.f
                int r13 = r1.h()
                android.util.SparseArray<f50$a> r1 = r0.e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0093
                r0.k = r4
                return
            L_0x0093:
                android.util.SparseArray<f50$a> r1 = r0.e
                java.lang.Object r1 = r1.get(r13)
                f50$a r1 = (defpackage.f50.a) r1
                android.util.SparseArray<f50$b> r3 = r0.d
                int r5 = r1.b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                f50$b r9 = (defpackage.f50.b) r9
                boolean r3 = r9.h
                if (r3 == 0) goto L_0x00b8
                j50 r3 = r0.f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b3
                return
            L_0x00b3:
                j50 r3 = r0.f
                r3.l(r7)
            L_0x00b8:
                j50 r3 = r0.f
                int r5 = r9.j
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c3
                return
            L_0x00c3:
                j50 r3 = r0.f
                int r5 = r9.j
                int r12 = r3.e(r5)
                boolean r3 = r9.i
                r5 = 1
                if (r3 != 0) goto L_0x00f7
                j50 r3 = r0.f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d9
                return
            L_0x00d9:
                j50 r3 = r0.f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f5
                j50 r6 = r0.f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00ea
                return
            L_0x00ea:
                j50 r6 = r0.f
                boolean r6 = r6.d()
                r14 = r3
                r16 = r6
                r15 = 1
                goto L_0x00fb
            L_0x00f5:
                r14 = r3
                goto L_0x00f8
            L_0x00f7:
                r14 = 0
            L_0x00f8:
                r15 = 0
                r16 = 0
            L_0x00fb:
                int r3 = r0.i
                if (r3 != r2) goto L_0x0102
                r17 = 1
                goto L_0x0104
            L_0x0102:
                r17 = 0
            L_0x0104:
                if (r17 == 0) goto L_0x0118
                j50 r2 = r0.f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x010f
                return
            L_0x010f:
                j50 r2 = r0.f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011a
            L_0x0118:
                r18 = 0
            L_0x011a:
                int r2 = r9.k
                if (r2 != 0) goto L_0x014e
                j50 r2 = r0.f
                int r3 = r9.l
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x0129
                return
            L_0x0129:
                j50 r2 = r0.f
                int r3 = r9.l
                int r2 = r2.e(r3)
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x014b
                if (r14 != 0) goto L_0x014b
                j50 r1 = r0.f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0140
                return
            L_0x0140:
                j50 r1 = r0.f
                int r1 = r1.g()
                r20 = r1
                r19 = r2
                goto L_0x018c
            L_0x014b:
                r19 = r2
                goto L_0x018a
            L_0x014e:
                if (r2 != r5) goto L_0x0188
                boolean r2 = r9.m
                if (r2 != 0) goto L_0x0188
                j50 r2 = r0.f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x015d
                return
            L_0x015d:
                j50 r2 = r0.f
                int r2 = r2.g()
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x0181
                if (r14 != 0) goto L_0x0181
                j50 r1 = r0.f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0172
                return
            L_0x0172:
                j50 r1 = r0.f
                int r1 = r1.g()
                r22 = r1
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x0190
            L_0x0181:
                r21 = r2
                r19 = 0
                r20 = 0
                goto L_0x018e
            L_0x0188:
                r19 = 0
            L_0x018a:
                r20 = 0
            L_0x018c:
                r21 = 0
            L_0x018e:
                r22 = 0
            L_0x0190:
                qw$b$a r8 = r0.n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qw.b.a(byte[], int, int):void");
        }

        public boolean b(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.i == 9 || (this.c && this.n.c(this.m))) {
                if (z && this.o) {
                    d(i2 + ((int) (j2 - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            if (this.b) {
                z2 = this.n.d();
            }
            boolean z4 = this.r;
            int i3 = this.i;
            if (i3 == 5 || (z2 && i3 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public boolean c() {
            return this.c;
        }

        public void e(f50.a aVar) {
            this.e.append(aVar.a, aVar);
        }

        public void f(f50.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void g() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        public void h(long j2, int i2, long j3) {
            this.i = i2;
            this.l = j3;
            this.j = j2;
            if (!this.b || i2 != 1) {
                if (this.c) {
                    int i3 = this.i;
                    if (!(i3 == 5 || i3 == 1 || i3 == 2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            a aVar = this.m;
            this.m = this.n;
            this.n = aVar;
            aVar.b();
            this.h = 0;
            this.k = true;
        }
    }

    public qw(cx cxVar, boolean z, boolean z2) {
        this.a = cxVar;
        this.b = z;
        this.c = z2;
    }

    private void a(long j2, int i2, int i3, long j3) {
        vw vwVar;
        int i4 = i3;
        if (!this.l || this.k.c()) {
            this.d.b(i4);
            this.e.b(i4);
            if (!this.l) {
                if (this.d.c() && this.e.c()) {
                    ArrayList arrayList = new ArrayList();
                    vw vwVar2 = this.d;
                    arrayList.add(Arrays.copyOf(vwVar2.d, vwVar2.e));
                    vw vwVar3 = this.e;
                    arrayList.add(Arrays.copyOf(vwVar3.d, vwVar3.e));
                    vw vwVar4 = this.d;
                    f50.b i5 = f50.i(vwVar4.d, 3, vwVar4.e);
                    vw vwVar5 = this.e;
                    f50.a h2 = f50.h(vwVar5.d, 3, vwVar5.e);
                    this.j.d(f0.H(this.i, "video/avc", s40.c(i5.a, i5.b, i5.c), -1, -1, i5.e, i5.f, -1.0f, arrayList, -1, i5.g, (ns) null));
                    this.l = true;
                    this.k.f(i5);
                    this.k.e(h2);
                    this.d.d();
                    vwVar = this.e;
                }
            } else if (this.d.c()) {
                vw vwVar6 = this.d;
                this.k.f(f50.i(vwVar6.d, 3, vwVar6.e));
                vwVar = this.d;
            } else if (this.e.c()) {
                vw vwVar7 = this.e;
                this.k.e(f50.h(vwVar7.d, 3, vwVar7.e));
                vwVar = this.e;
            }
            vwVar.d();
        }
        if (this.f.b(i3)) {
            vw vwVar8 = this.f;
            this.o.K(this.f.d, f50.k(vwVar8.d, vwVar8.e));
            this.o.M(4);
            this.a.a(j3, this.o);
        }
        if (this.k.b(j2, i2, this.l, this.n)) {
            this.n = false;
        }
    }

    private void g(byte[] bArr, int i2, int i3) {
        if (!this.l || this.k.c()) {
            this.d.a(bArr, i2, i3);
            this.e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void h(long j2, int i2, long j3) {
        if (!this.l || this.k.c()) {
            this.d.e(i2);
            this.e.e(i2);
        }
        this.f.e(i2);
        this.k.h(j2, i2, j3);
    }

    public void b(i50 i50) {
        int c2 = i50.c();
        int d2 = i50.d();
        byte[] bArr = i50.a;
        this.g += (long) i50.a();
        this.j.b(i50, i50.a());
        while (true) {
            int c3 = f50.c(bArr, c2, d2, this.h);
            if (c3 == d2) {
                g(bArr, c2, d2);
                return;
            }
            int f2 = f50.f(bArr, c3);
            int i2 = c3 - c2;
            if (i2 > 0) {
                g(bArr, c2, c3);
            }
            int i3 = d2 - c3;
            long j2 = this.g - ((long) i3);
            a(j2, i3, i2 < 0 ? -i2 : 0, this.m);
            h(j2, f2, this.m);
            c2 = c3 + 3;
        }
    }

    public void c() {
        f50.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.k.g();
        this.g = 0;
        this.n = false;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.i = dVar.b();
        vt a2 = jtVar.a(dVar.c(), 2);
        this.j = a2;
        this.k = new b(a2, this.b, this.c);
        this.a.b(jtVar, dVar);
    }

    public void f(long j2, int i2) {
        this.m = j2;
        this.n |= (i2 & 2) != 0;
    }
}
