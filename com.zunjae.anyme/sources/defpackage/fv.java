package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.bv;
import defpackage.ns;
import defpackage.vt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: fv  reason: default package */
public class fv implements ht {
    private static final byte[] I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final f0 J = f0.u((String) null, "application/x-emsg", Long.MAX_VALUE);
    private int A;
    private int B;
    private int C;
    private boolean D;
    private jt E;
    private vt[] F;
    private vt[] G;
    private boolean H;
    private final int a;
    private final lv b;
    private final List<f0> c;
    private final SparseArray<b> d;
    private final i50 e;
    private final i50 f;
    private final i50 g;
    private final byte[] h;
    private final i50 i;
    private final s50 j;
    private final hy k;
    private final i50 l;
    private final ArrayDeque<bv.a> m;
    private final ArrayDeque<a> n;
    private final vt o;
    private int p;
    private int q;
    private long r;
    private int s;
    private i50 t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private b z;

    /* renamed from: fv$a */
    private static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* renamed from: fv$b */
    private static final class b {
        public final vt a;
        public final nv b = new nv();
        public final i50 c = new i50();
        public lv d;
        public dv e;
        public int f;
        public int g;
        public int h;
        public int i;
        private final i50 j = new i50(1);
        private final i50 k = new i50();

        public b(vt vtVar) {
            this.a = vtVar;
        }

        /* access modifiers changed from: private */
        public mv c() {
            nv nvVar = this.b;
            int i2 = nvVar.a.a;
            mv mvVar = nvVar.o;
            if (mvVar == null) {
                mvVar = this.d.a(i2);
            }
            if (mvVar == null || !mvVar.a) {
                return null;
            }
            return mvVar;
        }

        /* access modifiers changed from: private */
        public void i() {
            mv c2 = c();
            if (c2 != null) {
                i50 i50 = this.b.q;
                int i2 = c2.d;
                if (i2 != 0) {
                    i50.N(i2);
                }
                if (this.b.g(this.f)) {
                    i50.N(i50.F() * 6);
                }
            }
        }

        public void d(lv lvVar, dv dvVar) {
            q40.e(lvVar);
            this.d = lvVar;
            q40.e(dvVar);
            this.e = dvVar;
            this.a.d(lvVar.f);
            g();
        }

        public boolean e() {
            this.f++;
            int i2 = this.g + 1;
            this.g = i2;
            int[] iArr = this.b.h;
            int i3 = this.h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.h = i3 + 1;
            this.g = 0;
            return false;
        }

        public int f(int i2, int i3) {
            i50 i50;
            mv c2 = c();
            if (c2 == null) {
                return 0;
            }
            int i4 = c2.d;
            if (i4 != 0) {
                i50 = this.b.q;
            } else {
                byte[] bArr = c2.e;
                this.k.K(bArr, bArr.length);
                i50 i502 = this.k;
                i4 = bArr.length;
                i50 = i502;
            }
            boolean g2 = this.b.g(this.f);
            boolean z = g2 || i3 != 0;
            this.j.a[0] = (byte) ((z ? 128 : 0) | i4);
            this.j.M(0);
            this.a.b(this.j, 1);
            this.a.b(i50, i4);
            if (!z) {
                return i4 + 1;
            }
            if (!g2) {
                this.c.I(8);
                i50 i503 = this.c;
                byte[] bArr2 = i503.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i3 >> 8) & 255);
                bArr2[3] = (byte) (i3 & 255);
                bArr2[4] = (byte) ((i2 >> 24) & 255);
                bArr2[5] = (byte) ((i2 >> 16) & 255);
                bArr2[6] = (byte) ((i2 >> 8) & 255);
                bArr2[7] = (byte) (i2 & 255);
                this.a.b(i503, 8);
                return i4 + 1 + 8;
            }
            i50 i504 = this.b.q;
            int F = i504.F();
            i504.N(-2);
            int i5 = (F * 6) + 2;
            if (i3 != 0) {
                this.c.I(i5);
                this.c.h(i504.a, 0, i5);
                i504.N(i5);
                i504 = this.c;
                byte[] bArr3 = i504.a;
                int i6 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
                bArr3[2] = (byte) ((i6 >> 8) & 255);
                bArr3[3] = (byte) (i6 & 255);
            }
            this.a.b(i504, i5);
            return i4 + 1 + i5;
        }

        public void g() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
        }

        public void h(long j2) {
            int i2 = this.f;
            while (true) {
                nv nvVar = this.b;
                if (i2 < nvVar.f && nvVar.c(i2) < j2) {
                    if (this.b.l[i2]) {
                        this.i = i2;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }

        public void j(ns nsVar) {
            mv a2 = this.d.a(this.b.a.a);
            this.a.d(this.d.f.d(nsVar.c(a2 != null ? a2.b : null)));
        }
    }

    static {
        zu zuVar = zu.a;
    }

    public fv() {
        this(0);
    }

    public fv(int i2) {
        this(i2, (s50) null);
    }

    public fv(int i2, s50 s50) {
        this(i2, s50, (lv) null, Collections.emptyList());
    }

    public fv(int i2, s50 s50, lv lvVar) {
        this(i2, s50, lvVar, Collections.emptyList());
    }

    public fv(int i2, s50 s50, lv lvVar, List<f0> list) {
        this(i2, s50, lvVar, list, (vt) null);
    }

    public fv(int i2, s50 s50, lv lvVar, List<f0> list, vt vtVar) {
        this.a = i2 | (lvVar != null ? 8 : 0);
        this.j = s50;
        this.b = lvVar;
        this.c = Collections.unmodifiableList(list);
        this.o = vtVar;
        this.k = new hy();
        this.l = new i50(16);
        this.e = new i50(f50.a);
        this.f = new i50(5);
        this.g = new i50();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new i50(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.d = new SparseArray<>();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        c();
    }

    private static void A(i50 i50, i50 i502, String str, nv nvVar) {
        byte[] bArr;
        i50 i503 = i50;
        i50 i504 = i502;
        nv nvVar2 = nvVar;
        i503.M(8);
        int k2 = i50.k();
        if (i50.k() == 1936025959) {
            if (bv.c(k2) == 1) {
                i503.N(4);
            }
            if (i50.k() == 1) {
                i504.M(8);
                int k3 = i502.k();
                if (i502.k() == 1936025959) {
                    int c2 = bv.c(k3);
                    if (c2 == 1) {
                        if (i502.B() == 0) {
                            throw new m0("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c2 >= 2) {
                        i504.N(4);
                    }
                    if (i502.B() == 1) {
                        i504.N(1);
                        int z2 = i502.z();
                        int i2 = (z2 & 240) >> 4;
                        int i3 = z2 & 15;
                        boolean z3 = i502.z() == 1;
                        if (z3) {
                            int z4 = i502.z();
                            byte[] bArr2 = new byte[16];
                            i504.h(bArr2, 0, 16);
                            if (z4 == 0) {
                                int z5 = i502.z();
                                byte[] bArr3 = new byte[z5];
                                i504.h(bArr3, 0, z5);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            nvVar2.m = true;
                            nvVar2.o = new mv(z3, str, z4, bArr2, i2, i3, bArr);
                            return;
                        }
                        return;
                    }
                    throw new m0("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new m0("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static Pair<Long, ct> B(i50 i50, long j2) {
        long j3;
        long j4;
        i50 i502 = i50;
        i502.M(8);
        int c2 = bv.c(i50.k());
        i502.N(4);
        long B2 = i50.B();
        if (c2 == 0) {
            j4 = i50.B();
            j3 = i50.B();
        } else {
            j4 = i50.E();
            j3 = i50.E();
        }
        long j5 = j4;
        long j6 = j2 + j3;
        long w0 = v50.w0(j5, 1000000, B2);
        i502.N(2);
        int F2 = i50.F();
        int[] iArr = new int[F2];
        long[] jArr = new long[F2];
        long[] jArr2 = new long[F2];
        long[] jArr3 = new long[F2];
        long j7 = j5;
        long j8 = w0;
        int i2 = 0;
        while (i2 < F2) {
            int k2 = i50.k();
            if ((k2 & Integer.MIN_VALUE) == 0) {
                long B3 = i50.B();
                iArr[i2] = k2 & Integer.MAX_VALUE;
                jArr[i2] = j6;
                jArr3[i2] = j8;
                long j9 = j7 + B3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = F2;
                int[] iArr2 = iArr;
                long w02 = v50.w0(j9, 1000000, B2);
                jArr4[i2] = w02 - jArr5[i2];
                i502.N(4);
                j6 += (long) iArr2[i2];
                i2++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                F2 = i3;
                long j10 = w02;
                j7 = j9;
                j8 = j10;
            } else {
                throw new m0("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(w0), new ct(iArr, jArr, jArr2, jArr3));
    }

    private static long C(i50 i50) {
        i50.M(8);
        return bv.c(i50.k()) == 1 ? i50.E() : i50.B();
    }

    private static b D(i50 i50, SparseArray<b> sparseArray) {
        i50.M(8);
        int b2 = bv.b(i50.k());
        b k2 = k(sparseArray, i50.k());
        if (k2 == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long E2 = i50.E();
            nv nvVar = k2.b;
            nvVar.c = E2;
            nvVar.d = E2;
        }
        dv dvVar = k2.e;
        k2.b.a = new dv((b2 & 2) != 0 ? i50.k() - 1 : dvVar.a, (b2 & 8) != 0 ? i50.k() : dvVar.b, (b2 & 16) != 0 ? i50.k() : dvVar.c, (b2 & 32) != 0 ? i50.k() : dvVar.d);
        return k2;
    }

    private static void E(bv.a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        b D2 = D(aVar.g(1952868452).b, sparseArray);
        if (D2 != null) {
            nv nvVar = D2.b;
            long j2 = nvVar.s;
            D2.g();
            if (aVar.g(1952867444) != null && (i2 & 2) == 0) {
                j2 = C(aVar.g(1952867444).b);
            }
            H(aVar, D2, j2, i2);
            mv a2 = D2.d.a(nvVar.a.a);
            bv.b g2 = aVar.g(1935763834);
            if (g2 != null) {
                x(a2, g2.b, nvVar);
            }
            bv.b g3 = aVar.g(1935763823);
            if (g3 != null) {
                w(g3.b, nvVar);
            }
            bv.b g4 = aVar.g(1936027235);
            if (g4 != null) {
                z(g4.b, nvVar);
            }
            bv.b g5 = aVar.g(1935828848);
            bv.b g6 = aVar.g(1936158820);
            if (!(g5 == null || g6 == null)) {
                A(g5.b, g6.b, a2 != null ? a2.b : null, nvVar);
            }
            int size = aVar.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                bv.b bVar = aVar.c.get(i3);
                if (bVar.a == 1970628964) {
                    I(bVar.b, nvVar, bArr);
                }
            }
        }
    }

    private static Pair<Integer, dv> F(i50 i50) {
        i50.M(12);
        return Pair.create(Integer.valueOf(i50.k()), new dv(i50.k() - 1, i50.k(), i50.k(), i50.k()));
    }

    private static int G(b bVar, int i2, long j2, int i3, i50 i50, int i4) {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        b bVar2 = bVar;
        i50.M(8);
        int b2 = bv.b(i50.k());
        lv lvVar = bVar2.d;
        nv nvVar = bVar2.b;
        dv dvVar = nvVar.a;
        nvVar.h[i2] = i50.D();
        long[] jArr = nvVar.g;
        jArr[i2] = nvVar.c;
        if ((b2 & 1) != 0) {
            jArr[i2] = jArr[i2] + ((long) i50.k());
        }
        boolean z6 = (b2 & 4) != 0;
        int i7 = dvVar.d;
        if (z6) {
            i7 = i50.k();
        }
        boolean z7 = (b2 & 256) != 0;
        boolean z8 = (b2 & 512) != 0;
        boolean z9 = (b2 & 1024) != 0;
        boolean z10 = (b2 & 2048) != 0;
        long[] jArr2 = lvVar.h;
        long j3 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j3 = v50.w0(lvVar.i[0], 1000000, lvVar.c);
        }
        int[] iArr = nvVar.i;
        int[] iArr2 = nvVar.j;
        long[] jArr3 = nvVar.k;
        boolean[] zArr = nvVar.l;
        int i8 = i7;
        boolean z11 = lvVar.b == 2 && (i3 & 1) != 0;
        int i9 = i4 + nvVar.h[i2];
        long j4 = lvVar.c;
        long j5 = j3;
        boolean[] zArr2 = zArr;
        long j6 = i2 > 0 ? nvVar.s : j2;
        int i10 = i4;
        while (i10 < i9) {
            int k2 = z7 ? i50.k() : dvVar.b;
            b(k2);
            if (z8) {
                z2 = z7;
                i5 = i50.k();
            } else {
                z2 = z7;
                i5 = dvVar.c;
            }
            b(i5);
            if (i10 == 0 && z6) {
                z3 = z6;
                i6 = i8;
            } else if (z9) {
                z3 = z6;
                i6 = i50.k();
            } else {
                z3 = z6;
                i6 = dvVar.d;
            }
            boolean z12 = z10;
            if (z10) {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = (int) ((((long) i50.k()) * 1000000) / j4);
            } else {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = 0;
            }
            jArr3[i10] = v50.w0(j6, 1000000, j4) - j5;
            iArr[i10] = i5;
            zArr2[i10] = ((i6 >> 16) & 1) == 0 && (!z11 || i10 == 0);
            i10++;
            j6 += (long) k2;
            j4 = j4;
            z7 = z2;
            z6 = z3;
            z10 = z12;
            z8 = z5;
            z9 = z4;
        }
        nvVar.s = j6;
        return i9;
    }

    private static void H(bv.a aVar, b bVar, long j2, int i2) {
        b bVar2 = bVar;
        List<bv.b> list = aVar.c;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            bv.b bVar3 = list.get(i5);
            if (bVar3.a == 1953658222) {
                i50 i50 = bVar3.b;
                i50.M(12);
                int D2 = i50.D();
                if (D2 > 0) {
                    i4 += D2;
                    i3++;
                }
            }
        }
        bVar2.h = 0;
        bVar2.g = 0;
        bVar2.f = 0;
        bVar2.b.e(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            bv.b bVar4 = list.get(i8);
            if (bVar4.a == 1953658222) {
                i7 = G(bVar, i6, j2, i2, bVar4.b, i7);
                i6++;
            }
        }
    }

    private static void I(i50 i50, nv nvVar, byte[] bArr) {
        i50.M(8);
        i50.h(bArr, 0, 16);
        if (Arrays.equals(bArr, I)) {
            y(i50, 16, nvVar);
        }
    }

    private void J(long j2) {
        while (!this.m.isEmpty() && this.m.peek().b == j2) {
            o(this.m.pop());
        }
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean K(defpackage.it r9) {
        /*
            r8 = this;
            int r0 = r8.s
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002a
            i50 r0 = r8.l
            byte[] r0 = r0.a
            boolean r0 = r9.b(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            r8.s = r1
            i50 r0 = r8.l
            r0.M(r2)
            i50 r0 = r8.l
            long r4 = r0.B()
            r8.r = r4
            i50 r0 = r8.l
            int r0 = r0.k()
            r8.q = r0
        L_0x002a:
            long r4 = r8.r
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            i50 r0 = r8.l
            byte[] r0 = r0.a
            r9.readFully(r0, r1, r1)
            int r0 = r8.s
            int r0 = r0 + r1
            r8.s = r0
            i50 r0 = r8.l
            long r4 = r0.E()
        L_0x0044:
            r8.r = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.g()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<bv$a> r0 = r8.m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<bv$a> r0 = r8.m
            java.lang.Object r0 = r0.peek()
            bv$a r0 = (defpackage.bv.a) r0
            long r4 = r0.b
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.m()
            long r4 = r4 - r6
            int r0 = r8.s
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.r
            int r0 = r8.s
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0147
            long r4 = r9.m()
            int r0 = r8.s
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r8.q
            r6 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r0 != r6) goto L_0x00ab
            android.util.SparseArray<fv$b> r0 = r8.d
            int r0 = r0.size()
            r6 = 0
        L_0x0096:
            if (r6 >= r0) goto L_0x00ab
            android.util.SparseArray<fv$b> r7 = r8.d
            java.lang.Object r7 = r7.valueAt(r6)
            fv$b r7 = (defpackage.fv.b) r7
            nv r7 = r7.b
            r7.b = r4
            r7.d = r4
            r7.c = r4
            int r6 = r6 + 1
            goto L_0x0096
        L_0x00ab:
            int r0 = r8.q
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r7 = 0
            if (r0 != r6) goto L_0x00d0
            r8.z = r7
            long r0 = r8.r
            long r0 = r0 + r4
            r8.u = r0
            boolean r9 = r8.H
            if (r9 != 0) goto L_0x00cc
            jt r9 = r8.E
            tt$b r0 = new tt$b
            long r1 = r8.x
            r0.<init>(r1, r4)
            r9.f(r0)
            r8.H = r3
        L_0x00cc:
            r9 = 2
            r8.p = r9
            return r3
        L_0x00d0:
            boolean r0 = O(r0)
            if (r0 == 0) goto L_0x00fd
            long r0 = r9.m()
            long r4 = r8.r
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.ArrayDeque<bv$a> r9 = r8.m
            bv$a r2 = new bv$a
            int r4 = r8.q
            r2.<init>(r4, r0)
            r9.push(r2)
            long r4 = r8.r
            int r9 = r8.s
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f9
            r8.J(r0)
            goto L_0x013e
        L_0x00f9:
            r8.c()
            goto L_0x013e
        L_0x00fd:
            int r9 = r8.q
            boolean r9 = P(r9)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r9 == 0) goto L_0x0134
            int r9 = r8.s
            if (r9 != r1) goto L_0x012c
            long r6 = r8.r
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0124
            i50 r9 = new i50
            int r0 = (int) r6
            r9.<init>((int) r0)
            r8.t = r9
            i50 r0 = r8.l
            byte[] r0 = r0.a
            byte[] r9 = r9.a
            java.lang.System.arraycopy(r0, r2, r9, r2, r1)
            goto L_0x013c
        L_0x0124:
            com.google.android.exoplayer2.m0 r9 = new com.google.android.exoplayer2.m0
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x012c:
            com.google.android.exoplayer2.m0 r9 = new com.google.android.exoplayer2.m0
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x0134:
            long r0 = r8.r
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x013f
            r8.t = r7
        L_0x013c:
            r8.p = r3
        L_0x013e:
            return r3
        L_0x013f:
            com.google.android.exoplayer2.m0 r9 = new com.google.android.exoplayer2.m0
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x0147:
            com.google.android.exoplayer2.m0 r9 = new com.google.android.exoplayer2.m0
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.K(it):boolean");
    }

    private void L(it itVar) {
        int i2 = ((int) this.r) - this.s;
        i50 i50 = this.t;
        if (i50 != null) {
            itVar.readFully(i50.a, 8, i2);
            q(new bv.b(this.q, this.t), itVar.m());
        } else {
            itVar.j(i2);
        }
        J(itVar.m());
    }

    private void M(it itVar) {
        int size = this.d.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            nv nvVar = this.d.valueAt(i2).b;
            if (nvVar.r) {
                long j3 = nvVar.d;
                if (j3 < j2) {
                    bVar = this.d.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (bVar == null) {
            this.p = 3;
            return;
        }
        int m2 = (int) (j2 - itVar.m());
        if (m2 >= 0) {
            itVar.j(m2);
            bVar.b.a(itVar);
            return;
        }
        throw new m0("Offset to encryption data was negative.");
    }

    private boolean N(it itVar) {
        vt.a aVar;
        boolean z2;
        int i2;
        int i3;
        it itVar2 = itVar;
        int i4 = 4;
        int i5 = 1;
        int i6 = 0;
        if (this.p == 3) {
            if (this.z == null) {
                b j2 = j(this.d);
                if (j2 == null) {
                    int m2 = (int) (this.u - itVar.m());
                    if (m2 >= 0) {
                        itVar2.j(m2);
                        c();
                        return false;
                    }
                    throw new m0("Offset to end of mdat was negative.");
                }
                int m3 = (int) (j2.b.g[j2.h] - itVar.m());
                if (m3 < 0) {
                    b50.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    m3 = 0;
                }
                itVar2.j(m3);
                this.z = j2;
            }
            b bVar = this.z;
            int[] iArr = bVar.b.i;
            int i7 = bVar.f;
            int i8 = iArr[i7];
            this.A = i8;
            if (i7 < bVar.i) {
                itVar2.j(i8);
                this.z.i();
                if (!this.z.e()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVar.d.g == 1) {
                this.A = i8 - 8;
                itVar2.j(8);
            }
            if ("audio/ac4".equals(this.z.d.f.m)) {
                this.B = this.z.f(this.A, 7);
                ar.a(this.A, this.i);
                this.z.a.b(this.i, 7);
                i3 = this.B + 7;
            } else {
                i3 = this.z.f(this.A, 0);
            }
            this.B = i3;
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        b bVar2 = this.z;
        nv nvVar = bVar2.b;
        lv lvVar = bVar2.d;
        vt vtVar = bVar2.a;
        int i9 = bVar2.f;
        long c2 = nvVar.c(i9);
        s50 s50 = this.j;
        if (s50 != null) {
            c2 = s50.a(c2);
        }
        long j3 = c2;
        int i10 = lvVar.j;
        if (i10 == 0) {
            while (true) {
                int i11 = this.B;
                int i12 = this.A;
                if (i11 >= i12) {
                    break;
                }
                this.B += vtVar.a(itVar2, i12 - i11, false);
            }
        } else {
            byte[] bArr = this.f.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i13 = i10 + 1;
            int i14 = 4 - i10;
            while (this.B < this.A) {
                int i15 = this.C;
                if (i15 == 0) {
                    itVar2.readFully(bArr, i14, i13);
                    this.f.M(i6);
                    int k2 = this.f.k();
                    if (k2 >= i5) {
                        this.C = k2 - 1;
                        this.e.M(i6);
                        vtVar.b(this.e, i4);
                        vtVar.b(this.f, i5);
                        this.D = this.G.length > 0 && f50.g(lvVar.f.m, bArr[i4]);
                        this.B += 5;
                        this.A += i14;
                    } else {
                        throw new m0("Invalid NAL length");
                    }
                } else {
                    if (this.D) {
                        this.g.I(i15);
                        itVar2.readFully(this.g.a, i6, this.C);
                        vtVar.b(this.g, this.C);
                        i2 = this.C;
                        i50 i50 = this.g;
                        int k3 = f50.k(i50.a, i50.d());
                        this.g.M("video/hevc".equals(lvVar.f.m) ? 1 : 0);
                        this.g.L(k3);
                        y20.a(j3, this.g, this.G);
                    } else {
                        i2 = vtVar.a(itVar2, i15, false);
                    }
                    this.B += i2;
                    this.C -= i2;
                    i4 = 4;
                    i5 = 1;
                    i6 = 0;
                }
            }
        }
        boolean z3 = nvVar.l[i9];
        mv b2 = this.z.c();
        if (b2 != null) {
            z2 = z3 | true;
            aVar = b2.c;
        } else {
            z2 = z3;
            aVar = null;
        }
        vtVar.c(j3, z2 ? 1 : 0, this.A, 0, aVar);
        t(j3);
        if (!this.z.e()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    private static boolean O(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    private static boolean P(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    private static int b(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected negtive value: ");
        sb.append(i2);
        throw new m0(sb.toString());
    }

    private void c() {
        this.p = 0;
        this.s = 0;
    }

    private dv e(SparseArray<dv> sparseArray, int i2) {
        dv dvVar;
        if (sparseArray.size() == 1) {
            dvVar = sparseArray.valueAt(0);
        } else {
            dvVar = sparseArray.get(i2);
            q40.e(dvVar);
        }
        return dvVar;
    }

    private static ns i(List<bv.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            bv.b bVar = list.get(i2);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                UUID d2 = jv.d(bArr);
                if (d2 == null) {
                    b50.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new ns.b(d2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new ns((List<ns.b>) arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b valueAt = sparseArray.valueAt(i2);
            int i3 = valueAt.h;
            nv nvVar = valueAt.b;
            if (i3 != nvVar.e) {
                long j3 = nvVar.g[i3];
                if (j3 < j2) {
                    bVar = valueAt;
                    j2 = j3;
                }
            }
        }
        return bVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.util.SparseArray, android.util.SparseArray<fv$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.fv.b k(android.util.SparseArray<defpackage.fv.b> r2, int r3) {
        /*
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L_0x000f
            r3 = 0
            java.lang.Object r2 = r2.valueAt(r3)
        L_0x000c:
            fv$b r2 = (defpackage.fv.b) r2
            return r2
        L_0x000f:
            java.lang.Object r2 = r2.get(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.k(android.util.SparseArray, int):fv$b");
    }

    static /* synthetic */ ht[] l() {
        return new ht[]{new fv()};
    }

    private void m() {
        int i2;
        if (this.F == null) {
            vt[] vtVarArr = new vt[2];
            this.F = vtVarArr;
            vt vtVar = this.o;
            if (vtVar != null) {
                vtVarArr[0] = vtVar;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.a & 4) != 0) {
                this.F[i2] = this.E.a(this.d.size(), 4);
                i2++;
            }
            vt[] vtVarArr2 = (vt[]) Arrays.copyOf(this.F, i2);
            this.F = vtVarArr2;
            for (vt d2 : vtVarArr2) {
                d2.d(J);
            }
        }
        if (this.G == null) {
            this.G = new vt[this.c.size()];
            for (int i3 = 0; i3 < this.G.length; i3++) {
                vt a2 = this.E.a(this.d.size() + 1 + i3, 3);
                a2.d(this.c.get(i3));
                this.G[i3] = a2;
            }
        }
    }

    private void o(bv.a aVar) {
        int i2 = aVar.a;
        if (i2 == 1836019574) {
            s(aVar);
        } else if (i2 == 1836019558) {
            r(aVar);
        } else if (!this.m.isEmpty()) {
            this.m.peek().d(aVar);
        }
    }

    private void p(i50 i50) {
        long j2;
        long j3;
        String str;
        String str2;
        long j4;
        long j5;
        i50 i502 = i50;
        vt[] vtVarArr = this.F;
        if (vtVarArr != null && vtVarArr.length != 0) {
            i502.M(8);
            int c2 = bv.c(i50.k());
            if (c2 == 0) {
                String t2 = i50.t();
                q40.e(t2);
                String str3 = t2;
                String t3 = i50.t();
                q40.e(t3);
                String str4 = t3;
                long B2 = i50.B();
                j5 = v50.w0(i50.B(), 1000000, B2);
                long j6 = this.y;
                long j7 = j6 != -9223372036854775807L ? j6 + j5 : -9223372036854775807L;
                str2 = str3;
                j3 = v50.w0(i50.B(), 1000, B2);
                str = str4;
                j2 = i50.B();
                j4 = j7;
            } else if (c2 != 1) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Skipping unsupported emsg version: ");
                sb.append(c2);
                b50.h("FragmentedMp4Extractor", sb.toString());
                return;
            } else {
                long B3 = i50.B();
                j4 = v50.w0(i50.E(), 1000000, B3);
                long w0 = v50.w0(i50.B(), 1000, B3);
                long B4 = i50.B();
                String t4 = i50.t();
                q40.e(t4);
                String t5 = i50.t();
                q40.e(t5);
                str2 = t4;
                j3 = w0;
                j2 = B4;
                str = t5;
                j5 = -9223372036854775807L;
            }
            byte[] bArr = new byte[i50.a()];
            i502.h(bArr, 0, i50.a());
            i50 i503 = new i50(this.k.a(new fy(str2, str, j3, j2, bArr)));
            int a2 = i503.a();
            for (vt b2 : this.F) {
                i503.M(0);
                b2.b(i503, a2);
            }
            if (j4 == -9223372036854775807L) {
                this.n.addLast(new a(j5, a2));
                this.v += a2;
                return;
            }
            s50 s50 = this.j;
            if (s50 != null) {
                j4 = s50.a(j4);
            }
            for (vt c3 : this.F) {
                c3.c(j4, 1, a2, 0, (vt.a) null);
            }
        }
    }

    private void q(bv.b bVar, long j2) {
        if (!this.m.isEmpty()) {
            this.m.peek().e(bVar);
            return;
        }
        int i2 = bVar.a;
        if (i2 == 1936286840) {
            Pair<Long, ct> B2 = B(bVar.b, j2);
            this.y = ((Long) B2.first).longValue();
            this.E.f((tt) B2.second);
            this.H = true;
        } else if (i2 == 1701671783) {
            p(bVar.b);
        }
    }

    private void r(bv.a aVar) {
        v(aVar, this.d, this.a, this.h);
        ns i2 = i(aVar.c);
        if (i2 != null) {
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.d.valueAt(i3).j(i2);
            }
        }
        if (this.w != -9223372036854775807L) {
            int size2 = this.d.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.d.valueAt(i4).h(this.w);
            }
            this.w = -9223372036854775807L;
        }
    }

    private void s(bv.a aVar) {
        int i2;
        int i3;
        bv.a aVar2 = aVar;
        boolean z2 = true;
        int i4 = 0;
        q40.g(this.b == null, "Unexpected moov box.");
        ns i5 = i(aVar2.c);
        bv.a f2 = aVar2.f(1836475768);
        SparseArray sparseArray = new SparseArray();
        int size = f2.c.size();
        long j2 = -9223372036854775807L;
        for (int i6 = 0; i6 < size; i6++) {
            bv.b bVar = f2.c.get(i6);
            int i7 = bVar.a;
            if (i7 == 1953654136) {
                Pair<Integer, dv> F2 = F(bVar.b);
                sparseArray.put(((Integer) F2.first).intValue(), (dv) F2.second);
            } else if (i7 == 1835362404) {
                j2 = u(bVar.b);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.d.size();
        int i8 = 0;
        while (i8 < size2) {
            bv.a aVar3 = aVar2.d.get(i8);
            if (aVar3.a == 1953653099) {
                i2 = i8;
                i3 = size2;
                lv v2 = cv.v(aVar3, aVar2.g(1836476516), j2, i5, (this.a & 16) != 0, false);
                n(v2);
                if (v2 != null) {
                    sparseArray2.put(v2.a, v2);
                }
            } else {
                i2 = i8;
                i3 = size2;
            }
            i8 = i2 + 1;
            size2 = i3;
        }
        int size3 = sparseArray2.size();
        if (this.d.size() == 0) {
            while (i4 < size3) {
                lv lvVar = (lv) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.E.a(i4, lvVar.b));
                bVar2.d(lvVar, e(sparseArray, lvVar.a));
                this.d.put(lvVar.a, bVar2);
                this.x = Math.max(this.x, lvVar.e);
                i4++;
            }
            m();
            this.E.p();
            return;
        }
        if (this.d.size() != size3) {
            z2 = false;
        }
        q40.f(z2);
        while (i4 < size3) {
            lv lvVar2 = (lv) sparseArray2.valueAt(i4);
            this.d.get(lvVar2.a).d(lvVar2, e(sparseArray, lvVar2.a));
            i4++;
        }
    }

    private void t(long j2) {
        while (!this.n.isEmpty()) {
            a removeFirst = this.n.removeFirst();
            this.v -= removeFirst.b;
            long j3 = removeFirst.a + j2;
            s50 s50 = this.j;
            if (s50 != null) {
                j3 = s50.a(j3);
            }
            for (vt c2 : this.F) {
                c2.c(j3, 1, removeFirst.b, this.v, (vt.a) null);
            }
        }
    }

    private static long u(i50 i50) {
        i50.M(8);
        return bv.c(i50.k()) == 0 ? i50.B() : i50.E();
    }

    private static void v(bv.a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) {
        int size = aVar.d.size();
        for (int i3 = 0; i3 < size; i3++) {
            bv.a aVar2 = aVar.d.get(i3);
            if (aVar2.a == 1953653094) {
                E(aVar2, sparseArray, i2, bArr);
            }
        }
    }

    private static void w(i50 i50, nv nvVar) {
        i50.M(8);
        int k2 = i50.k();
        if ((bv.b(k2) & 1) == 1) {
            i50.N(8);
        }
        int D2 = i50.D();
        if (D2 == 1) {
            nvVar.d += bv.c(k2) == 0 ? i50.B() : i50.E();
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Unexpected saio entry count: ");
        sb.append(D2);
        throw new m0(sb.toString());
    }

    private static void x(mv mvVar, i50 i50, nv nvVar) {
        int i2;
        int i3 = mvVar.d;
        i50.M(8);
        boolean z2 = true;
        if ((bv.b(i50.k()) & 1) == 1) {
            i50.N(8);
        }
        int z3 = i50.z();
        int D2 = i50.D();
        if (D2 == nvVar.f) {
            if (z3 == 0) {
                boolean[] zArr = nvVar.n;
                i2 = 0;
                for (int i4 = 0; i4 < D2; i4++) {
                    int z4 = i50.z();
                    i2 += z4;
                    zArr[i4] = z4 > i3;
                }
            } else {
                if (z3 <= i3) {
                    z2 = false;
                }
                i2 = (z3 * D2) + 0;
                Arrays.fill(nvVar.n, 0, D2, z2);
            }
            nvVar.d(i2);
            return;
        }
        int i5 = nvVar.f;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(D2);
        sb.append(", ");
        sb.append(i5);
        throw new m0(sb.toString());
    }

    private static void y(i50 i50, int i2, nv nvVar) {
        i50.M(i2 + 8);
        int b2 = bv.b(i50.k());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int D2 = i50.D();
            if (D2 == nvVar.f) {
                Arrays.fill(nvVar.n, 0, D2, z2);
                nvVar.d(i50.a());
                nvVar.b(i50);
                return;
            }
            int i3 = nvVar.f;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(D2);
            sb.append(", ");
            sb.append(i3);
            throw new m0(sb.toString());
        }
        throw new m0("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void z(i50 i50, nv nvVar) {
        y(i50, 0, nvVar);
    }

    public void a() {
    }

    public boolean d(it itVar) {
        return kv.b(itVar);
    }

    public int f(it itVar, st stVar) {
        while (true) {
            int i2 = this.p;
            if (i2 != 0) {
                if (i2 == 1) {
                    L(itVar);
                } else if (i2 == 2) {
                    M(itVar);
                } else if (N(itVar)) {
                    return 0;
                }
            } else if (!K(itVar)) {
                return -1;
            }
        }
    }

    public void g(jt jtVar) {
        this.E = jtVar;
        lv lvVar = this.b;
        if (lvVar != null) {
            b bVar = new b(jtVar.a(0, lvVar.b));
            bVar.d(this.b, new dv(0, 0, 0, 0));
            this.d.put(0, bVar);
            m();
            this.E.p();
        }
    }

    public void h(long j2, long j3) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.valueAt(i2).g();
        }
        this.n.clear();
        this.v = 0;
        this.w = j3;
        this.m.clear();
        c();
    }

    /* access modifiers changed from: protected */
    public lv n(lv lvVar) {
        return lvVar;
    }
}
