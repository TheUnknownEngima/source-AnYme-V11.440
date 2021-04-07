package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.vt;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: lx  reason: default package */
public final class lx implements ht {
    private jt a;
    private vt b;
    private b c;
    private int d = -1;
    private long e = -1;

    /* renamed from: lx$a */
    private static final class a implements b {
        private static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final jt a;
        private final vt b;
        private final mx c;
        private final int d;
        private final byte[] e;
        private final i50 f;
        private final int g;
        private final f0 h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(jt jtVar, vt vtVar, mx mxVar) {
            mx mxVar2 = mxVar;
            this.a = jtVar;
            this.b = vtVar;
            this.c = mxVar2;
            this.g = Math.max(1, mxVar2.c / 10);
            i50 i50 = new i50(mxVar2.f);
            i50.r();
            int r = i50.r();
            this.d = r;
            int i2 = mxVar2.b;
            int i3 = (((mxVar2.d - (i2 * 4)) * 8) / (mxVar2.e * i2)) + 1;
            if (r == i3) {
                int i4 = v50.i(this.g, r);
                this.e = new byte[(mxVar2.d * i4)];
                this.f = new i50(i4 * h(this.d, i2));
                this.h = f0.o((String) null, "audio/raw", (String) null, ((mxVar2.c * mxVar2.d) * 8) / this.d, h(this.g, i2), mxVar2.b, mxVar2.c, 2, (List<byte[]>) null, (ns) null, 0, (String) null);
                return;
            }
            int i5 = this.d;
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i3);
            sb.append("; got: ");
            sb.append(i5);
            throw new m0(sb.toString());
        }

        private void d(byte[] bArr, int i2, i50 i50) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.c.b; i4++) {
                    e(bArr, i3, i4, i50.a);
                }
            }
            i50.I(g(this.d * i2));
        }

        private void e(byte[] bArr, int i2, int i3, byte[] bArr2) {
            mx mxVar = this.c;
            int i4 = mxVar.d;
            int i5 = mxVar.b;
            int i6 = (i2 * i4) + (i3 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int i9 = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int min = Math.min(bArr[i6 + 2] & 255, 88);
            int i10 = n[min];
            int i11 = ((i2 * this.d * i5) + i3) * 2;
            bArr2[i11] = (byte) (i9 & 255);
            bArr2[i11 + 1] = (byte) (i9 >> 8);
            for (int i12 = 0; i12 < i8 * 2; i12++) {
                byte b2 = bArr[((i12 / 8) * i5 * 4) + i7 + ((i12 / 2) % 4)] & 255;
                int i13 = i12 % 2 == 0 ? b2 & 15 : b2 >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i10) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                i9 = v50.o(i9 + i14, -32768, 32767);
                i11 += i5 * 2;
                bArr2[i11] = (byte) (i9 & 255);
                bArr2[i11 + 1] = (byte) (i9 >> 8);
                min = v50.o(min + m[i13], 0, n.length - 1);
                i10 = n[min];
            }
        }

        private int f(int i2) {
            return i2 / (this.c.b * 2);
        }

        private int g(int i2) {
            return h(i2, this.c.b);
        }

        private static int h(int i2, int i3) {
            return i2 * 2 * i3;
        }

        private void i(int i2) {
            long w0 = this.j + v50.w0(this.l, 1000000, (long) this.c.c);
            int g2 = g(i2);
            this.b.c(w0, 1, g2, this.k - g2, (vt.a) null);
            this.l += (long) i2;
            this.k -= g2;
        }

        public void a(long j2) {
            this.i = 0;
            this.j = j2;
            this.k = 0;
            this.l = 0;
        }

        public void b(int i2, long j2) {
            this.a.f(new ox(this.c, this.d, (long) i2, j2));
            this.b.d(this.h);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(defpackage.it r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.g
                int r1 = r6.k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.d
                int r0 = defpackage.v50.i(r0, r1)
                mx r1 = r6.c
                int r1 = r1.d
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.i
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.e
                int r5 = r6.i
                int r3 = r7.a(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.i
                int r4 = r4 + r3
                r6.i = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.i
                mx r8 = r6.c
                int r8 = r8.d
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.e
                i50 r9 = r6.f
                r6.d(r8, r7, r9)
                int r8 = r6.i
                mx r9 = r6.c
                int r9 = r9.d
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.i = r8
                i50 r7 = r6.f
                int r7 = r7.d()
                vt r8 = r6.b
                i50 r9 = r6.f
                r8.b(r9, r7)
                int r8 = r6.k
                int r8 = r8 + r7
                r6.k = r8
                int r7 = r6.f(r8)
                int r8 = r6.g
                if (r7 < r8) goto L_0x0077
                r6.i(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L_0x0084
                r6.i(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lx.a.c(it, long):boolean");
        }
    }

    /* renamed from: lx$b */
    private interface b {
        void a(long j);

        void b(int i, long j);

        boolean c(it itVar, long j);
    }

    /* renamed from: lx$c */
    private static final class c implements b {
        private final jt a;
        private final vt b;
        private final mx c;
        private final f0 d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(jt jtVar, vt vtVar, mx mxVar, String str, int i) {
            mx mxVar2 = mxVar;
            this.a = jtVar;
            this.b = vtVar;
            this.c = mxVar2;
            int i2 = (mxVar2.b * mxVar2.e) / 8;
            if (mxVar2.d == i2) {
                int max = Math.max(i2, (mxVar2.c * i2) / 10);
                this.e = max;
                int i3 = mxVar2.c;
                this.d = f0.o((String) null, str, (String) null, i2 * i3 * 8, max, mxVar2.b, i3, i, (List<byte[]>) null, (ns) null, 0, (String) null);
                return;
            }
            int i4 = mxVar2.d;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i2);
            sb.append("; got: ");
            sb.append(i4);
            throw new m0(sb.toString());
        }

        public void a(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0;
        }

        public void b(int i, long j) {
            this.a.f(new ox(this.c, 1, (long) i, j));
            this.b.d(this.d);
        }

        public boolean c(it itVar, long j) {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                    mx mxVar = this.c;
                    int i4 = mxVar.d;
                    int i5 = this.g / i4;
                } else {
                    int a2 = this.b.a(itVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (a2 == -1) {
                        j2 = 0;
                    } else {
                        this.g += a2;
                        j2 -= (long) a2;
                    }
                }
            }
            mx mxVar2 = this.c;
            int i42 = mxVar2.d;
            int i52 = this.g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.g - i6;
                this.b.c(this.f + v50.w0(this.h, 1000000, (long) mxVar2.c), 1, i6, i7, (vt.a) null);
                this.h += (long) i52;
                this.g = i7;
            }
            return i <= 0;
        }
    }

    static {
        kx kxVar = kx.a;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void b() {
        q40.h(this.b);
        v50.g(this.a);
    }

    static /* synthetic */ ht[] c() {
        return new ht[]{new lx()};
    }

    public void a() {
    }

    public boolean d(it itVar) {
        return nx.a(itVar) != null;
    }

    /* JADX WARNING: type inference failed for: r8v18, types: [lx$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(defpackage.it r7, defpackage.st r8) {
        /*
            r6 = this;
            r6.b()
            lx$b r8 = r6.c
            if (r8 != 0) goto L_0x0079
            mx r3 = defpackage.nx.a(r7)
            if (r3 == 0) goto L_0x0071
            int r8 = r3.a
            r0 = 17
            if (r8 != r0) goto L_0x001f
            lx$a r8 = new lx$a
            jt r0 = r6.a
            vt r1 = r6.b
            r8.<init>(r0, r1, r3)
        L_0x001c:
            r6.c = r8
            goto L_0x0079
        L_0x001f:
            r0 = 6
            if (r8 != r0) goto L_0x0030
            lx$c r8 = new lx$c
            jt r1 = r6.a
            vt r2 = r6.b
            r5 = -1
            java.lang.String r4 = "audio/g711-alaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0030:
            r0 = 7
            if (r8 != r0) goto L_0x0041
            lx$c r8 = new lx$c
            jt r1 = r6.a
            vt r2 = r6.b
            r5 = -1
            java.lang.String r4 = "audio/g711-mlaw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0041:
            int r0 = r3.e
            int r5 = defpackage.vr.a(r8, r0)
            if (r5 == 0) goto L_0x0056
            lx$c r8 = new lx$c
            jt r1 = r6.a
            vt r2 = r6.b
            java.lang.String r4 = "audio/raw"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x001c
        L_0x0056:
            com.google.android.exoplayer2.m0 r7 = new com.google.android.exoplayer2.m0
            int r8 = r3.a
            r0 = 40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unsupported WAV format type: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0071:
            com.google.android.exoplayer2.m0 r7 = new com.google.android.exoplayer2.m0
            java.lang.String r8 = "Unsupported or unrecognized wav header."
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0079:
            int r8 = r6.d
            r0 = -1
            if (r8 != r0) goto L_0x009e
            android.util.Pair r8 = defpackage.nx.b(r7)
            java.lang.Object r1 = r8.first
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            r6.d = r1
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            r6.e = r1
            lx$b r8 = r6.c
            int r3 = r6.d
            r8.b(r3, r1)
            goto L_0x00ad
        L_0x009e:
            long r1 = r7.m()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00ad
            int r8 = r6.d
            r7.j(r8)
        L_0x00ad:
            long r1 = r6.e
            r3 = -1
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b8
            r1 = 1
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            defpackage.q40.f(r1)
            long r1 = r6.e
            long r3 = r7.m()
            long r1 = r1 - r3
            lx$b r3 = r6.c
            boolean r7 = r3.c(r7, r1)
            if (r7 == 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx.f(it, st):int");
    }

    public void g(jt jtVar) {
        this.a = jtVar;
        this.b = jtVar.a(0, 1);
        jtVar.p();
    }

    public void h(long j, long j2) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(j2);
        }
    }
}
