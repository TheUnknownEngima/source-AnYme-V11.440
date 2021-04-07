package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.bv;
import defpackage.tt;
import defpackage.vt;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: iv  reason: default package */
public final class iv implements ht, tt {
    private final int a;
    private final i50 b;
    private final i50 c;
    private final i50 d;
    private final i50 e;
    private final ArrayDeque<bv.a> f;
    private int g;
    private int h;
    private long i;
    private int j;
    private i50 k;
    private int l;
    private int m;
    private int n;
    private int o;
    private jt p;
    private a[] q;
    private long[][] r;
    private int s;
    private long t;
    private boolean u;

    /* renamed from: iv$a */
    private static final class a {
        public final lv a;
        public final ov b;
        public final vt c;
        public int d;

        public a(lv lvVar, ov ovVar, vt vtVar) {
            this.a = lvVar;
            this.b = ovVar;
            this.c = vtVar;
        }
    }

    static {
        av avVar = av.a;
    }

    public iv() {
        this(0);
    }

    public iv(int i2) {
        this.a = i2;
        this.e = new i50(16);
        this.f = new ArrayDeque<>();
        this.b = new i50(f50.a);
        this.c = new i50(4);
        this.d = new i50();
        this.l = -1;
    }

    private void A(long j2) {
        for (a aVar : this.q) {
            ov ovVar = aVar.b;
            int a2 = ovVar.a(j2);
            if (a2 == -1) {
                a2 = ovVar.b(j2);
            }
            aVar.d = a2;
        }
    }

    private static long[][] k(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].b.b];
            jArr2[i2] = aVarArr[i2].b.f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].b.d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].b.f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private void l() {
        this.g = 0;
        this.j = 0;
    }

    private static int m(ov ovVar, long j2) {
        int a2 = ovVar.a(j2);
        return a2 == -1 ? ovVar.b(j2) : a2;
    }

    private int n(long j2) {
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        long j4 = Long.MAX_VALUE;
        boolean z2 = true;
        long j5 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.q;
            if (i4 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i4];
            int i5 = aVar.d;
            ov ovVar = aVar.b;
            if (i5 != ovVar.b) {
                long j6 = ovVar.c[i5];
                long j7 = this.r[i4][i5];
                long j8 = j6 - j2;
                boolean z3 = j8 < 0 || j8 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j8 < j5)) {
                    z2 = z3;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z = z3;
                    i2 = i4;
                    j3 = j7;
                }
            }
            i4++;
        }
        return (j3 == Long.MAX_VALUE || !z || j4 < j3 + 10485760) ? i3 : i2;
    }

    private ArrayList<ov> o(bv.a aVar, pt ptVar, boolean z) {
        lv v;
        ArrayList<ov> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < aVar.d.size(); i2++) {
            bv.a aVar2 = aVar.d.get(i2);
            if (aVar2.a == 1953653099 && (v = cv.v(aVar2, aVar.g(1836476516), -9223372036854775807L, (ns) null, z, this.u)) != null) {
                ov r2 = cv.r(v, aVar2.f(1835297121).f(1835626086).f(1937007212), ptVar);
                if (r2.b != 0) {
                    arrayList.add(r2);
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ ht[] p() {
        return new ht[]{new iv()};
    }

    private static long q(ov ovVar, long j2, long j3) {
        int m2 = m(ovVar, j2);
        return m2 == -1 ? j3 : Math.min(ovVar.c[m2], j3);
    }

    private void r(it itVar) {
        this.d.I(8);
        itVar.l(this.d.a, 0, 8);
        this.d.N(4);
        if (this.d.k() == 1751411826) {
            itVar.i();
        } else {
            itVar.j(4);
        }
    }

    private void s(long j2) {
        while (!this.f.isEmpty() && this.f.peek().b == j2) {
            bv.a pop = this.f.pop();
            if (pop.a == 1836019574) {
                u(pop);
                this.f.clear();
                this.g = 2;
            } else if (!this.f.isEmpty()) {
                this.f.peek().d(pop);
            }
        }
        if (this.g != 2) {
            l();
        }
    }

    private static boolean t(i50 i50) {
        i50.M(8);
        if (i50.k() == 1903435808) {
            return true;
        }
        i50.N(4);
        while (i50.a() > 0) {
            if (i50.k() == 1903435808) {
                return true;
            }
        }
        return false;
    }

    private void u(bv.a aVar) {
        yx yxVar;
        long j2;
        ov ovVar;
        bv.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        pt ptVar = new pt();
        bv.b g2 = aVar2.g(1969517665);
        yx yxVar2 = null;
        if (g2 != null) {
            yxVar = cv.w(g2, this.u);
            if (yxVar != null) {
                ptVar.c(yxVar);
            }
        } else {
            yxVar = null;
        }
        bv.a f2 = aVar2.f(1835365473);
        if (f2 != null) {
            yxVar2 = cv.l(f2);
        }
        ArrayList<ov> o2 = o(aVar2, ptVar, (this.a & 1) != 0);
        int size = o2.size();
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        int i2 = 0;
        int i3 = -1;
        while (i2 < size) {
            ov ovVar2 = o2.get(i2);
            lv lvVar = ovVar2.a;
            ov ovVar3 = ovVar2;
            long j5 = lvVar.e;
            if (j5 != j3) {
                j2 = j5;
                ovVar = ovVar3;
            } else {
                ovVar = ovVar3;
                j2 = ovVar.h;
            }
            long max = Math.max(j4, j2);
            ArrayList<ov> arrayList2 = o2;
            int i4 = size;
            a aVar3 = new a(lvVar, ovVar, this.p.a(i2, lvVar.b));
            f0 j6 = lvVar.f.j(ovVar.e + 30);
            long j7 = max;
            if (lvVar.b == 2 && j2 > 0) {
                int i5 = ovVar.b;
                if (i5 > 1) {
                    j6 = j6.f(((float) i5) / (((float) j2) / 1000000.0f));
                }
            }
            aVar3.c.d(hv.a(lvVar.b, j6, yxVar, yxVar2, ptVar));
            if (lvVar.b == 2) {
                if (i3 == -1) {
                    i3 = arrayList.size();
                }
            }
            arrayList.add(aVar3);
            i2++;
            o2 = arrayList2;
            size = i4;
            j4 = j7;
            j3 = -9223372036854775807L;
        }
        this.s = i3;
        this.t = j4;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.q = aVarArr;
        this.r = k(aVarArr);
        this.p.p();
        this.p.f(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean v(defpackage.it r9) {
        /*
            r8 = this;
            int r0 = r8.j
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002a
            i50 r0 = r8.e
            byte[] r0 = r0.a
            boolean r0 = r9.b(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r8.j = r2
            i50 r0 = r8.e
            r0.M(r3)
            i50 r0 = r8.e
            long r4 = r0.B()
            r8.i = r4
            i50 r0 = r8.e
            int r0 = r0.k()
            r8.h = r0
        L_0x002a:
            long r4 = r8.i
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            i50 r0 = r8.e
            byte[] r0 = r0.a
            r9.readFully(r0, r2, r2)
            int r0 = r8.j
            int r0 = r0 + r2
            r8.j = r0
            i50 r0 = r8.e
            long r4 = r0.E()
        L_0x0044:
            r8.i = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.g()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<bv$a> r0 = r8.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<bv$a> r0 = r8.f
            java.lang.Object r0 = r0.peek()
            bv$a r0 = (defpackage.bv.a) r0
            long r4 = r0.b
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.m()
            long r4 = r4 - r6
            int r0 = r8.j
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.i
            int r0 = r8.j
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            int r0 = r8.h
            boolean r0 = y(r0)
            if (r0 == 0) goto L_0x00bf
            long r2 = r9.m()
            long r4 = r8.i
            long r2 = r2 + r4
            int r0 = r8.j
            long r6 = (long) r0
            long r2 = r2 - r6
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            int r0 = r8.h
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r0 != r4) goto L_0x00a2
            r8.r(r9)
        L_0x00a2:
            java.util.ArrayDeque<bv$a> r9 = r8.f
            bv$a r0 = new bv$a
            int r4 = r8.h
            r0.<init>(r4, r2)
            r9.push(r0)
            long r4 = r8.i
            int r9 = r8.j
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00bb
            r8.s(r2)
            goto L_0x00f9
        L_0x00bb:
            r8.l()
            goto L_0x00f9
        L_0x00bf:
            int r9 = r8.h
            boolean r9 = z(r9)
            if (r9 == 0) goto L_0x00f4
            int r9 = r8.j
            if (r9 != r2) goto L_0x00cd
            r9 = 1
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            defpackage.q40.f(r9)
            long r4 = r8.i
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00dc
            r9 = 1
            goto L_0x00dd
        L_0x00dc:
            r9 = 0
        L_0x00dd:
            defpackage.q40.f(r9)
            i50 r9 = new i50
            long r4 = r8.i
            int r0 = (int) r4
            r9.<init>((int) r0)
            r8.k = r9
            i50 r0 = r8.e
            byte[] r0 = r0.a
            byte[] r9 = r9.a
            java.lang.System.arraycopy(r0, r3, r9, r3, r2)
            goto L_0x00f7
        L_0x00f4:
            r9 = 0
            r8.k = r9
        L_0x00f7:
            r8.g = r1
        L_0x00f9:
            return r1
        L_0x00fa:
            com.google.android.exoplayer2.m0 r9 = new com.google.android.exoplayer2.m0
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.v(it):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean w(defpackage.it r10, defpackage.st r11) {
        /*
            r9 = this;
            long r0 = r9.i
            int r2 = r9.j
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.m()
            long r2 = r2 + r0
            i50 r4 = r9.k
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0046
            byte[] r11 = r4.a
            int r4 = r9.j
            int r1 = (int) r0
            r10.readFully(r11, r4, r1)
            int r10 = r9.h
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            i50 r10 = r9.k
            boolean r10 = t(r10)
            r9.u = r10
            goto L_0x0051
        L_0x0029:
            java.util.ArrayDeque<bv$a> r10 = r9.f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0051
            java.util.ArrayDeque<bv$a> r10 = r9.f
            java.lang.Object r10 = r10.peek()
            bv$a r10 = (defpackage.bv.a) r10
            bv$b r11 = new bv$b
            int r0 = r9.h
            i50 r1 = r9.k
            r11.<init>(r0, r1)
            r10.e(r11)
            goto L_0x0051
        L_0x0046:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0053
            int r11 = (int) r0
            r10.j(r11)
        L_0x0051:
            r10 = 0
            goto L_0x005b
        L_0x0053:
            long r7 = r10.m()
            long r7 = r7 + r0
            r11.a = r7
            r10 = 1
        L_0x005b:
            r9.s(r2)
            if (r10 == 0) goto L_0x0066
            int r10 = r9.g
            r11 = 2
            if (r10 == r11) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.w(it, st):boolean");
    }

    private int x(it itVar, st stVar) {
        long m2 = itVar.m();
        if (this.l == -1) {
            int n2 = n(m2);
            this.l = n2;
            if (n2 == -1) {
                return -1;
            }
        }
        a aVar = this.q[this.l];
        vt vtVar = aVar.c;
        int i2 = aVar.d;
        ov ovVar = aVar.b;
        long j2 = ovVar.c[i2];
        int i3 = ovVar.d[i2];
        long j3 = (j2 - m2) + ((long) this.m);
        if (j3 < 0 || j3 >= 262144) {
            stVar.a = j2;
            return 1;
        }
        if (aVar.a.g == 1) {
            j3 += 8;
            i3 -= 8;
        }
        itVar.j((int) j3);
        lv lvVar = aVar.a;
        int i4 = lvVar.j;
        if (i4 == 0) {
            if ("audio/ac4".equals(lvVar.f.m)) {
                if (this.n == 0) {
                    ar.a(i3, this.d);
                    vtVar.b(this.d, 7);
                    this.n += 7;
                }
                i3 += 7;
            }
            while (true) {
                int i5 = this.n;
                if (i5 >= i3) {
                    break;
                }
                int a2 = vtVar.a(itVar, i3 - i5, false);
                this.m += a2;
                this.n += a2;
                this.o -= a2;
            }
        } else {
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i6 = 4 - i4;
            while (this.n < i3) {
                int i7 = this.o;
                if (i7 == 0) {
                    itVar.readFully(bArr, i6, i4);
                    this.m += i4;
                    this.c.M(0);
                    int k2 = this.c.k();
                    if (k2 >= 0) {
                        this.o = k2;
                        this.b.M(0);
                        vtVar.b(this.b, 4);
                        this.n += 4;
                        i3 += i6;
                    } else {
                        throw new m0("Invalid NAL length");
                    }
                } else {
                    int a3 = vtVar.a(itVar, i7, false);
                    this.m += a3;
                    this.n += a3;
                    this.o -= a3;
                }
            }
        }
        ov ovVar2 = aVar.b;
        vtVar.c(ovVar2.f[i2], ovVar2.g[i2], i3, 0, (vt.a) null);
        aVar.d++;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        return 0;
    }

    private static boolean y(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    private static boolean z(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        return kv.d(itVar);
    }

    public boolean e() {
        return true;
    }

    public int f(it itVar, st stVar) {
        while (true) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return x(itVar, stVar);
                    }
                    throw new IllegalStateException();
                } else if (w(itVar, stVar)) {
                    return 1;
                }
            } else if (!v(itVar)) {
                return -1;
            }
        }
    }

    public void g(jt jtVar) {
        this.p = jtVar;
    }

    public void h(long j2, long j3) {
        this.f.clear();
        this.j = 0;
        this.l = -1;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        if (j2 == 0) {
            l();
        } else if (this.q != null) {
            A(j3);
        }
    }

    public tt.a i(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int b2;
        a[] aVarArr = this.q;
        if (aVarArr.length == 0) {
            return new tt.a(ut.c);
        }
        int i2 = this.s;
        if (i2 != -1) {
            ov ovVar = aVarArr[i2].b;
            int m2 = m(ovVar, j2);
            if (m2 == -1) {
                return new tt.a(ut.c);
            }
            long j7 = ovVar.f[m2];
            j3 = ovVar.c[m2];
            if (j7 >= j2 || m2 >= ovVar.b - 1 || (b2 = ovVar.b(j2)) == -1 || b2 == m2) {
                j6 = -1;
                j5 = -9223372036854775807L;
            } else {
                j5 = ovVar.f[b2];
                j6 = ovVar.c[b2];
            }
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.q;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.s) {
                ov ovVar2 = aVarArr2[i3].b;
                long q2 = q(ovVar2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = q(ovVar2, j5, j4);
                }
                j3 = q2;
            }
            i3++;
        }
        ut utVar = new ut(j2, j3);
        return j5 == -9223372036854775807L ? new tt.a(utVar) : new tt.a(utVar, new ut(j5, j4));
    }

    public long j() {
        return this.t;
    }
}
