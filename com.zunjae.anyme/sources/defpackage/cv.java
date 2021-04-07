package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.video.h;
import com.google.android.exoplayer2.video.i;
import com.google.android.exoplayer2.video.j;
import com.google.android.exoplayer2.video.l;
import defpackage.bv;
import defpackage.ev;
import defpackage.yx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: cv  reason: default package */
final class cv {
    private static final byte[] a = v50.Z("OpusHead");

    /* renamed from: cv$a */
    private static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        private final boolean e;
        private final i50 f;
        private final i50 g;
        private int h;
        private int i;

        public a(i50 i50, i50 i502, boolean z) {
            this.g = i50;
            this.f = i502;
            this.e = z;
            i502.M(12);
            this.a = i502.D();
            i50.M(12);
            this.i = i50.D();
            q40.g(i50.k() != 1 ? false : true, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            this.d = this.e ? this.f.E() : this.f.B();
            if (this.b == this.h) {
                this.c = this.g.D();
                this.g.N(4);
                int i3 = this.i - 1;
                this.i = i3;
                this.h = i3 > 0 ? this.g.D() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: cv$b */
    private interface b {
        boolean a();

        int b();

        int c();
    }

    /* renamed from: cv$c */
    private static final class c {
        public final mv[] a;
        public f0 b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new mv[i];
        }
    }

    /* renamed from: cv$d */
    static final class d implements b {
        private final int a = this.c.D();
        private final int b = this.c.D();
        private final i50 c;

        public d(bv.b bVar) {
            i50 i50 = bVar.b;
            this.c = i50;
            i50.M(12);
        }

        public boolean a() {
            return this.a != 0;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            int i = this.a;
            return i == 0 ? this.c.D() : i;
        }
    }

    /* renamed from: cv$e */
    static final class e implements b {
        private final i50 a;
        private final int b = this.a.D();
        private final int c = (this.a.D() & 255);
        private int d;
        private int e;

        public e(bv.b bVar) {
            i50 i50 = bVar.b;
            this.a = i50;
            i50.M(12);
        }

        public boolean a() {
            return false;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.a.z();
            }
            if (i == 16) {
                return this.a.F();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int z = this.a.z();
            this.e = z;
            return (z & 240) >> 4;
        }
    }

    /* renamed from: cv$f */
    private static final class f {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[v50.o(4, 0, length)] && jArr[v50.o(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static int b(i50 i50, int i, int i2) {
        int c2 = i50.c();
        while (c2 - i < i2) {
            i50.M(c2);
            int k = i50.k();
            q40.b(k > 0, "childAtomSize should be positive");
            if (i50.k() == 1702061171) {
                return c2;
            }
            c2 += k;
        }
        return -1;
    }

    private static int c(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 4 : -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void d(defpackage.i50 r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, defpackage.ns r35, defpackage.cv.c r36, int r37) {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r14 = r33
            r3 = r35
            r15 = r36
            int r4 = r1 + 8
            r5 = 8
            int r4 = r4 + r5
            r0.M(r4)
            r4 = 6
            r13 = 0
            if (r34 == 0) goto L_0x0020
            int r5 = r28.F()
            r0.N(r4)
            goto L_0x0024
        L_0x0020:
            r0.N(r5)
            r5 = 0
        L_0x0024:
            r6 = 16
            r12 = 2
            r11 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 != r11) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r5 != r12) goto L_0x0045
            r0.N(r6)
            double r4 = r28.i()
            long r4 = java.lang.Math.round(r4)
            int r5 = (int) r4
            int r4 = r28.D()
            r6 = 20
            r0.N(r6)
            goto L_0x0058
        L_0x0045:
            return
        L_0x0046:
            int r7 = r28.F()
            r0.N(r4)
            int r4 = r28.A()
            if (r5 != r11) goto L_0x0056
            r0.N(r6)
        L_0x0056:
            r5 = r4
            r4 = r7
        L_0x0058:
            int r6 = r28.c()
            r7 = 1701733217(0x656e6361, float:7.0359778E22)
            r16 = 0
            r8 = r29
            if (r8 != r7) goto L_0x008d
            android.util.Pair r7 = p(r0, r1, r2)
            if (r7 == 0) goto L_0x008a
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0078
            r3 = r16
            goto L_0x0082
        L_0x0078:
            java.lang.Object r9 = r7.second
            mv r9 = (defpackage.mv) r9
            java.lang.String r9 = r9.b
            ns r3 = r3.c(r9)
        L_0x0082:
            mv[] r9 = r15.a
            java.lang.Object r7 = r7.second
            mv r7 = (defpackage.mv) r7
            r9[r37] = r7
        L_0x008a:
            r0.M(r6)
        L_0x008d:
            r10 = r3
            r3 = 1633889587(0x61632d33, float:2.6191674E20)
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r7 = "audio/raw"
            r12 = -1
            if (r8 != r3) goto L_0x009f
            java.lang.String r7 = "audio/ac3"
        L_0x009b:
            r18 = -1
            goto L_0x0129
        L_0x009f:
            r3 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r8 != r3) goto L_0x00a7
            java.lang.String r7 = "audio/eac3"
            goto L_0x009b
        L_0x00a7:
            r3 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r8 != r3) goto L_0x00af
            java.lang.String r7 = "audio/ac4"
            goto L_0x009b
        L_0x00af:
            r3 = 1685353315(0x64747363, float:1.803728E22)
            if (r8 != r3) goto L_0x00b7
            java.lang.String r7 = "audio/vnd.dts"
            goto L_0x009b
        L_0x00b7:
            r3 = 1685353320(0x64747368, float:1.8037286E22)
            if (r8 == r3) goto L_0x0125
            r3 = 1685353324(0x6474736c, float:1.803729E22)
            if (r8 != r3) goto L_0x00c3
            goto L_0x0125
        L_0x00c3:
            r3 = 1685353317(0x64747365, float:1.8037282E22)
            if (r8 != r3) goto L_0x00cb
            java.lang.String r7 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009b
        L_0x00cb:
            r3 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r8 != r3) goto L_0x00d3
            java.lang.String r7 = "audio/3gpp"
            goto L_0x009b
        L_0x00d3:
            r3 = 1935767394(0x73617762, float:1.7863284E31)
            if (r8 != r3) goto L_0x00db
            java.lang.String r7 = "audio/amr-wb"
            goto L_0x009b
        L_0x00db:
            r3 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r8 == r3) goto L_0x0122
            r3 = 1936684916(0x736f7774, float:1.89725E31)
            if (r8 != r3) goto L_0x00e6
            goto L_0x0122
        L_0x00e6:
            r3 = 1953984371(0x74776f73, float:7.841539E31)
            if (r8 != r3) goto L_0x00f0
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r18 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0129
        L_0x00f0:
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r8 != r3) goto L_0x00f8
            java.lang.String r7 = "audio/mpeg"
            goto L_0x009b
        L_0x00f8:
            if (r8 != r9) goto L_0x00fd
            java.lang.String r7 = "audio/alac"
            goto L_0x009b
        L_0x00fd:
            r3 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r8 != r3) goto L_0x0105
            java.lang.String r7 = "audio/g711-alaw"
            goto L_0x009b
        L_0x0105:
            r3 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r8 != r3) goto L_0x010d
            java.lang.String r7 = "audio/g711-mlaw"
            goto L_0x009b
        L_0x010d:
            r3 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r8 != r3) goto L_0x0115
            java.lang.String r7 = "audio/opus"
            goto L_0x009b
        L_0x0115:
            r3 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r8 != r3) goto L_0x011e
            java.lang.String r7 = "audio/flac"
            goto L_0x009b
        L_0x011e:
            r7 = r16
            goto L_0x009b
        L_0x0122:
            r18 = 2
            goto L_0x0129
        L_0x0125:
            java.lang.String r7 = "audio/vnd.dts.hd"
            goto L_0x009b
        L_0x0129:
            r20 = r4
            r21 = r5
            r8 = r6
            r19 = r7
            r22 = r16
        L_0x0132:
            int r3 = r8 - r1
            if (r3 >= r2) goto L_0x02b5
            r0.M(r8)
            int r7 = r28.k()
            if (r7 <= 0) goto L_0x0141
            r3 = 1
            goto L_0x0142
        L_0x0141:
            r3 = 0
        L_0x0142:
            java.lang.String r4 = "childAtomSize should be positive"
            defpackage.q40.b(r3, r4)
            int r3 = r28.k()
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r3 == r4) goto L_0x0264
            if (r34 == 0) goto L_0x0159
            r5 = 2002876005(0x77617665, float:4.5729223E33)
            if (r3 != r5) goto L_0x0159
            goto L_0x0264
        L_0x0159:
            r4 = 1684103987(0x64616333, float:1.6630662E22)
            if (r3 != r4) goto L_0x017b
            int r3 = r8 + 8
            r0.M(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.f0 r3 = defpackage.zq.c(r0, r3, r14, r10)
        L_0x016b:
            r15.b = r3
            r5 = r7
            r6 = r8
            r23 = r10
            r1 = 0
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            r17 = 2
            r24 = 1
            goto L_0x0262
        L_0x017b:
            r4 = 1684366131(0x64656333, float:1.692581E22)
            if (r3 != r4) goto L_0x018e
            int r3 = r8 + 8
            r0.M(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.f0 r3 = defpackage.zq.g(r0, r3, r14, r10)
            goto L_0x016b
        L_0x018e:
            r4 = 1684103988(0x64616334, float:1.6630663E22)
            if (r3 != r4) goto L_0x01a1
            int r3 = r8 + 8
            r0.M(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.f0 r3 = defpackage.ar.b(r0, r3, r14, r10)
            goto L_0x016b
        L_0x01a1:
            r4 = 1684305011(0x64647473, float:1.6856995E22)
            if (r3 != r4) goto L_0x01dc
            java.lang.String r3 = java.lang.Integer.toString(r32)
            r5 = 0
            r6 = -1
            r23 = -1
            r24 = 0
            r25 = 0
            r4 = r19
            r26 = r7
            r7 = r23
            r27 = r8
            r8 = r20
            r9 = r21
            r23 = r10
            r10 = r24
            r24 = 1
            r11 = r23
            r17 = 2
            r12 = r25
            r1 = 0
            r13 = r33
            com.google.android.exoplayer2.f0 r3 = com.google.android.exoplayer2.f0.p(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.b = r3
            r5 = r26
            r6 = r27
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0262
        L_0x01dc:
            r26 = r7
            r27 = r8
            r23 = r10
            r1 = 0
            r17 = 2
            r24 = 1
            r4 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r3 != r4) goto L_0x020f
            r5 = r26
            int r7 = r5 + -8
            byte[] r3 = a
            int r4 = r3.length
            int r4 = r4 + r7
            byte[] r4 = new byte[r4]
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r1, r4, r1, r6)
            r6 = r27
            int r8 = r6 + 8
            r0.M(r8)
            byte[] r3 = a
            int r3 = r3.length
            r0.h(r4, r3, r7)
            r22 = r4
        L_0x0209:
            r3 = -1
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x02a7
        L_0x020f:
            r5 = r26
            r6 = r27
            r4 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r3 != r4) goto L_0x023b
            int r7 = r5 + -12
            int r3 = r7 + 4
            byte[] r3 = new byte[r3]
            r4 = 102(0x66, float:1.43E-43)
            r3[r1] = r4
            r4 = 76
            r3[r24] = r4
            r4 = 97
            r3[r17] = r4
            r4 = 3
            r8 = 67
            r3[r4] = r8
            int r8 = r6 + 12
            r0.M(r8)
            r4 = 4
            r0.h(r3, r4, r7)
            r22 = r3
            goto L_0x0209
        L_0x023b:
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r3 != r7) goto L_0x0262
            int r3 = r5 + -12
            byte[] r4 = new byte[r3]
            int r8 = r6 + 12
            r0.M(r8)
            r0.h(r4, r1, r3)
            android.util.Pair r3 = defpackage.s40.k(r4)
            java.lang.Object r8 = r3.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r21 = r8.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r20 = r3.intValue()
            r22 = r4
        L_0x0262:
            r3 = -1
            goto L_0x02a7
        L_0x0264:
            r5 = r7
            r6 = r8
            r23 = r10
            r1 = 0
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            r17 = 2
            r24 = 1
            if (r3 != r4) goto L_0x0274
            r8 = r6
            goto L_0x0278
        L_0x0274:
            int r8 = b(r0, r6, r5)
        L_0x0278:
            r3 = -1
            if (r8 == r3) goto L_0x02a7
            android.util.Pair r4 = g(r0, r8)
            java.lang.Object r8 = r4.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r4.second
            r22 = r4
            byte[] r22 = (byte[]) r22
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x02a5
            android.util.Pair r4 = defpackage.s40.j(r22)
            java.lang.Object r9 = r4.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r21 = r9.intValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r20 = r4.intValue()
        L_0x02a5:
            r19 = r8
        L_0x02a7:
            int r8 = r6 + r5
            r1 = r30
            r10 = r23
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            r11 = 1
            r12 = -1
            r13 = 0
            goto L_0x0132
        L_0x02b5:
            r23 = r10
            com.google.android.exoplayer2.f0 r0 = r15.b
            if (r0 != 0) goto L_0x02e1
            if (r19 == 0) goto L_0x02e1
            java.lang.String r0 = java.lang.Integer.toString(r32)
            r2 = 0
            r3 = -1
            r4 = -1
            if (r22 != 0) goto L_0x02c9
            r8 = r16
            goto L_0x02ce
        L_0x02c9:
            java.util.List r1 = java.util.Collections.singletonList(r22)
            r8 = r1
        L_0x02ce:
            r10 = 0
            r1 = r19
            r5 = r20
            r6 = r21
            r7 = r18
            r9 = r23
            r11 = r33
            com.google.android.exoplayer2.f0 r0 = com.google.android.exoplayer2.f0.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.b = r0
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv.d(i50, int, int, int, int, java.lang.String, boolean, ns, cv$c, int):void");
    }

    static Pair<Integer, mv> e(i50 i50, int i, int i2) {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            i50.M(i3);
            int k = i50.k();
            int k2 = i50.k();
            if (k2 == 1718775137) {
                num = Integer.valueOf(i50.k());
            } else if (k2 == 1935894637) {
                i50.N(4);
                str = i50.w(4);
            } else if (k2 == 1935894633) {
                i4 = i3;
                i5 = k;
            }
            i3 += k;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        q40.b(num != null, "frma atom is mandatory");
        q40.b(i4 != -1, "schi atom is mandatory");
        mv q = q(i50, i4, i5, str);
        if (q != null) {
            z = true;
        }
        q40.b(z, "tenc atom is mandatory");
        return Pair.create(num, q);
    }

    private static Pair<long[], long[]> f(bv.a aVar) {
        bv.b g;
        if (aVar == null || (g = aVar.g(1701606260)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        i50 i50 = g.b;
        i50.M(8);
        int c2 = bv.c(i50.k());
        int D = i50.D();
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        int i = 0;
        while (i < D) {
            jArr[i] = c2 == 1 ? i50.E() : i50.B();
            jArr2[i] = c2 == 1 ? i50.s() : (long) i50.k();
            if (i50.v() == 1) {
                i50.N(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> g(i50 i50, int i) {
        i50.M(i + 8 + 4);
        i50.N(1);
        h(i50);
        i50.N(2);
        int z = i50.z();
        if ((z & 128) != 0) {
            i50.N(2);
        }
        if ((z & 64) != 0) {
            i50.N(i50.F());
        }
        if ((z & 32) != 0) {
            i50.N(2);
        }
        i50.N(1);
        h(i50);
        String f2 = e50.f(i50.z());
        if ("audio/mpeg".equals(f2) || "audio/vnd.dts".equals(f2) || "audio/vnd.dts.hd".equals(f2)) {
            return Pair.create(f2, (Object) null);
        }
        i50.N(12);
        i50.N(1);
        int h = h(i50);
        byte[] bArr = new byte[h];
        i50.h(bArr, 0, h);
        return Pair.create(f2, bArr);
    }

    private static int h(i50 i50) {
        int z = i50.z();
        int i = z & 127;
        while ((z & 128) == 128) {
            z = i50.z();
            i = (i << 7) | (z & 127);
        }
        return i;
    }

    private static int i(i50 i50) {
        i50.M(16);
        return i50.k();
    }

    private static yx j(i50 i50, int i) {
        i50.N(8);
        ArrayList arrayList = new ArrayList();
        while (i50.c() < i) {
            yx.b d2 = hv.d(i50);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new yx((List<? extends yx.b>) arrayList);
    }

    private static Pair<Long, String> k(i50 i50) {
        int i = 8;
        i50.M(8);
        int c2 = bv.c(i50.k());
        i50.N(c2 == 0 ? 8 : 16);
        long B = i50.B();
        if (c2 == 0) {
            i = 4;
        }
        i50.N(i);
        int F = i50.F();
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) (((F >> 10) & 31) + 96));
        sb.append((char) (((F >> 5) & 31) + 96));
        sb.append((char) ((F & 31) + 96));
        return Pair.create(Long.valueOf(B), sb.toString());
    }

    public static yx l(bv.a aVar) {
        bv.b g = aVar.g(1751411826);
        bv.b g2 = aVar.g(1801812339);
        bv.b g3 = aVar.g(1768715124);
        if (g == null || g2 == null || g3 == null || i(g.b) != 1835299937) {
            return null;
        }
        i50 i50 = g2.b;
        i50.M(12);
        int k = i50.k();
        String[] strArr = new String[k];
        for (int i = 0; i < k; i++) {
            int k2 = i50.k();
            i50.N(4);
            strArr[i] = i50.w(k2 - 8);
        }
        i50 i502 = g3.b;
        i502.M(8);
        ArrayList arrayList = new ArrayList();
        while (i502.a() > 8) {
            int c2 = i502.c();
            int k3 = i502.k();
            int k4 = i502.k() - 1;
            if (k4 < 0 || k4 >= k) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(k4);
                b50.h("AtomParsers", sb.toString());
            } else {
                gv g4 = hv.g(i502, c2 + k3, strArr[k4]);
                if (g4 != null) {
                    arrayList.add(g4);
                }
            }
            i502.M(c2 + k3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new yx((List<? extends yx.b>) arrayList);
    }

    private static long m(i50 i50) {
        int i = 8;
        i50.M(8);
        if (bv.c(i50.k()) != 0) {
            i = 16;
        }
        i50.N(i);
        return i50.B();
    }

    private static float n(i50 i50, int i) {
        i50.M(i + 8);
        return ((float) i50.D()) / ((float) i50.D());
    }

    private static byte[] o(i50 i50, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            i50.M(i3);
            int k = i50.k();
            if (i50.k() == 1886547818) {
                return Arrays.copyOfRange(i50.a, i3, k + i3);
            }
            i3 += k;
        }
        return null;
    }

    private static Pair<Integer, mv> p(i50 i50, int i, int i2) {
        Pair<Integer, mv> e2;
        int c2 = i50.c();
        while (c2 - i < i2) {
            i50.M(c2);
            int k = i50.k();
            q40.b(k > 0, "childAtomSize should be positive");
            if (i50.k() == 1936289382 && (e2 = e(i50, c2, k)) != null) {
                return e2;
            }
            c2 += k;
        }
        return null;
    }

    private static mv q(i50 i50, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            i50.M(i5);
            int k = i50.k();
            if (i50.k() == 1952804451) {
                int c2 = bv.c(i50.k());
                i50.N(1);
                if (c2 == 0) {
                    i50.N(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int z = i50.z();
                    i3 = z & 15;
                    i4 = (z & 240) >> 4;
                }
                boolean z2 = i50.z() == 1;
                int z3 = i50.z();
                byte[] bArr2 = new byte[16];
                i50.h(bArr2, 0, 16);
                if (z2 && z3 == 0) {
                    int z4 = i50.z();
                    bArr = new byte[z4];
                    i50.h(bArr, 0, z4);
                }
                return new mv(z2, str, z3, bArr2, i4, i3, bArr);
            }
            i5 += k;
        }
    }

    public static ov r(lv lvVar, bv.a aVar, pt ptVar) {
        b bVar;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        long j;
        int[] iArr;
        long[] jArr;
        lv lvVar2;
        int[] iArr2;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        lv lvVar3 = lvVar;
        bv.a aVar2 = aVar;
        pt ptVar2 = ptVar;
        bv.b g = aVar2.g(1937011578);
        if (g != null) {
            bVar = new d(g);
        } else {
            bv.b g2 = aVar2.g(1937013298);
            if (g2 != null) {
                bVar = new e(g2);
            } else {
                throw new m0("Track has no sample table size information");
            }
        }
        int b2 = bVar.b();
        if (b2 == 0) {
            return new ov(lvVar, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        bv.b g3 = aVar2.g(1937007471);
        if (g3 == null) {
            g3 = aVar2.g(1668232756);
            z = true;
        } else {
            z = false;
        }
        i50 i50 = g3.b;
        i50 i502 = aVar2.g(1937011555).b;
        i50 i503 = aVar2.g(1937011827).b;
        bv.b g4 = aVar2.g(1937011571);
        i50 i504 = null;
        i50 i505 = g4 != null ? g4.b : null;
        bv.b g5 = aVar2.g(1668576371);
        i50 i506 = g5 != null ? g5.b : null;
        a aVar3 = new a(i502, i50, z);
        i503.M(12);
        int D = i503.D() - 1;
        int D2 = i503.D();
        int D3 = i503.D();
        if (i506 != null) {
            i506.M(12);
            i = i506.D();
        } else {
            i = 0;
        }
        int i15 = -1;
        if (i505 != null) {
            i505.M(12);
            i2 = i505.D();
            if (i2 > 0) {
                i15 = i505.D() - 1;
                i504 = i505;
            }
        } else {
            i504 = i505;
            i2 = 0;
        }
        if (bVar.a() && "audio/raw".equals(lvVar3.f.m) && D == 0 && i == 0 && i2 == 0) {
            i3 = D;
            z2 = true;
        } else {
            i3 = D;
            z2 = false;
        }
        if (!z2) {
            long[] jArr3 = new long[b2];
            int[] iArr4 = new int[b2];
            long[] jArr4 = new long[b2];
            int[] iArr5 = new int[b2];
            i50 i507 = i503;
            int i16 = i15;
            int i17 = 0;
            i4 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            long j2 = 0;
            long j3 = 0;
            int i21 = i;
            int i22 = D3;
            int i23 = D2;
            while (true) {
                if (i17 >= b2) {
                    int i24 = b2;
                    i9 = i23;
                    i10 = i18;
                    i11 = i19;
                    break;
                }
                long j4 = j3;
                int i25 = i19;
                boolean z4 = true;
                while (i25 == 0) {
                    z4 = aVar3.a();
                    if (!z4) {
                        break;
                    }
                    int i26 = i23;
                    long j5 = aVar3.d;
                    i25 = aVar3.c;
                    j4 = j5;
                    i23 = i26;
                    i22 = i22;
                    b2 = b2;
                }
                int i27 = b2;
                i9 = i23;
                int i28 = i22;
                if (!z4) {
                    b50.h("AtomParsers", "Unexpected end of chunk data");
                    jArr3 = Arrays.copyOf(jArr3, i17);
                    iArr4 = Arrays.copyOf(iArr4, i17);
                    jArr4 = Arrays.copyOf(jArr4, i17);
                    iArr5 = Arrays.copyOf(iArr5, i17);
                    b2 = i17;
                    i10 = i18;
                    i11 = i25;
                    break;
                }
                if (i506 != null) {
                    while (i20 == 0 && i21 > 0) {
                        i20 = i506.D();
                        i18 = i506.k();
                        i21--;
                    }
                    i20--;
                }
                int i29 = i18;
                jArr3[i17] = j4;
                iArr4[i17] = bVar.c();
                if (iArr4[i17] > i4) {
                    i4 = iArr4[i17];
                }
                jArr4[i17] = j2 + ((long) i29);
                iArr5[i17] = i504 == null ? 1 : 0;
                if (i17 == i16) {
                    iArr5[i17] = 1;
                    i2--;
                    if (i2 > 0) {
                        i16 = i504.D() - 1;
                    }
                }
                int i30 = i16;
                int i31 = i29;
                int i32 = i28;
                j2 += (long) i32;
                int i33 = i9 - 1;
                if (i33 != 0 || i3 <= 0) {
                    i14 = i32;
                    i13 = i3;
                } else {
                    i33 = i507.D();
                    i14 = i507.k();
                    i13 = i3 - 1;
                }
                int i34 = i33;
                i19 = i25 - 1;
                i17++;
                j3 = j4 + ((long) iArr4[i17]);
                i16 = i30;
                i22 = i14;
                b2 = i27;
                i18 = i31;
                int i35 = i13;
                i23 = i34;
                i3 = i35;
            }
            long j6 = j2 + ((long) i10);
            while (true) {
                if (i21 <= 0) {
                    z3 = true;
                    break;
                } else if (i506.D() != 0) {
                    z3 = false;
                    break;
                } else {
                    i506.k();
                    i21--;
                }
            }
            if (i2 == 0 && i9 == 0 && i11 == 0 && i3 == 0) {
                i12 = i20;
                if (i12 == 0 && z3) {
                    lvVar2 = lvVar;
                    i5 = b2;
                    jArr2 = jArr3;
                    jArr = jArr4;
                    iArr = iArr5;
                    iArr2 = iArr4;
                    j = j6;
                }
            } else {
                i12 = i20;
            }
            lvVar2 = lvVar;
            int i36 = lvVar2.a;
            String str = !z3 ? ", ctts invalid" : "";
            StringBuilder sb = new StringBuilder(str.length() + 262);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i36);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i2);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i9);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i11);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i3);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i12);
            sb.append(str);
            b50.h("AtomParsers", sb.toString());
            i5 = b2;
            jArr2 = jArr3;
            jArr = jArr4;
            iArr = iArr5;
            iArr2 = iArr4;
            j = j6;
        } else {
            lvVar2 = lvVar3;
            int i37 = b2;
            int i38 = aVar3.a;
            long[] jArr5 = new long[i38];
            int[] iArr6 = new int[i38];
            while (aVar3.a()) {
                int i39 = aVar3.b;
                jArr5[i39] = aVar3.d;
                iArr6[i39] = aVar3.c;
            }
            f0 f0Var = lvVar2.f;
            ev.b a2 = ev.a(v50.Q(f0Var.B, f0Var.z), jArr5, iArr6, (long) D3);
            long[] jArr6 = a2.a;
            int[] iArr7 = a2.b;
            int i40 = a2.c;
            jArr = a2.d;
            iArr = a2.e;
            j = a2.f;
            i4 = i40;
            i5 = i37;
            iArr2 = iArr7;
            jArr2 = jArr6;
        }
        long w0 = v50.w0(j, 1000000, lvVar2.c);
        long[] jArr7 = lvVar2.h;
        if (jArr7 == null) {
            v50.y0(jArr, 1000000, lvVar2.c);
            return new ov(lvVar, jArr2, iArr2, i4, jArr, iArr, w0);
        }
        if (jArr7.length == 1 && lvVar2.b == 1 && jArr.length >= 2) {
            long j7 = lvVar2.i[0];
            i6 = i4;
            long w02 = v50.w0(jArr7[0], lvVar2.c, lvVar2.d) + j7;
            if (a(jArr, j, j7, w02)) {
                long j8 = j - w02;
                long w03 = v50.w0(j7 - jArr[0], (long) lvVar2.f.A, lvVar2.c);
                long w04 = v50.w0(j8, (long) lvVar2.f.A, lvVar2.c);
                if (!(w03 == 0 && w04 == 0) && w03 <= 2147483647L && w04 <= 2147483647L) {
                    pt ptVar3 = ptVar;
                    ptVar3.a = (int) w03;
                    ptVar3.b = (int) w04;
                    v50.y0(jArr, 1000000, lvVar2.c);
                    return new ov(lvVar, jArr2, iArr2, i6, jArr, iArr, v50.w0(lvVar2.h[0], 1000000, lvVar2.d));
                }
            }
        } else {
            i6 = i4;
        }
        long[] jArr8 = lvVar2.h;
        if (jArr8.length == 1 && jArr8[0] == 0) {
            long j9 = lvVar2.i[0];
            for (int i41 = 0; i41 < jArr.length; i41++) {
                jArr[i41] = v50.w0(jArr[i41] - j9, 1000000, lvVar2.c);
            }
            return new ov(lvVar, jArr2, iArr2, i6, jArr, iArr, v50.w0(j - j9, 1000000, lvVar2.c));
        }
        boolean z5 = lvVar2.b == 1;
        long[] jArr9 = lvVar2.h;
        int[] iArr8 = new int[jArr9.length];
        int[] iArr9 = new int[jArr9.length];
        boolean z6 = false;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        while (true) {
            long[] jArr10 = lvVar2.h;
            if (i43 >= jArr10.length) {
                break;
            }
            long[] jArr11 = jArr2;
            int[] iArr10 = iArr2;
            long j10 = lvVar2.i[i43];
            if (j10 != -1) {
                i8 = i43;
                long w05 = v50.w0(jArr10[i43], lvVar2.c, lvVar2.d);
                iArr8[i8] = v50.f(jArr, j10, true, true);
                iArr9[i8] = v50.d(jArr, j10 + w05, z5, false);
                while (iArr8[i8] < iArr9[i8] && (iArr[iArr8[i8]] & 1) == 0) {
                    iArr8[i8] = iArr8[i8] + 1;
                }
                i42 += iArr9[i8] - iArr8[i8];
                z6 = (i44 != iArr8[i8]) | z6;
                i44 = iArr9[i8];
            } else {
                i8 = i43;
            }
            i43 = i8 + 1;
            jArr2 = jArr11;
            iArr2 = iArr10;
        }
        long[] jArr12 = jArr2;
        int[] iArr11 = iArr2;
        boolean z7 = true;
        if (i42 == i5) {
            z7 = false;
        }
        boolean z8 = z6 | z7;
        long[] jArr13 = z8 ? new long[i42] : jArr12;
        int[] iArr12 = z8 ? new int[i42] : iArr11;
        int i45 = z8 ? 0 : i6;
        int[] iArr13 = z8 ? new int[i42] : iArr;
        long[] jArr14 = new long[i42];
        int i46 = i45;
        int i47 = 0;
        int i48 = 0;
        long j11 = 0;
        while (i47 < lvVar2.h.length) {
            long j12 = lvVar2.i[i47];
            int i49 = iArr8[i47];
            int[] iArr14 = iArr8;
            int i51 = iArr9[i47];
            int[] iArr15 = iArr9;
            if (z8) {
                int i52 = i51 - i49;
                i7 = i46;
                System.arraycopy(jArr12, i49, jArr13, i48, i52);
                iArr3 = iArr11;
                System.arraycopy(iArr3, i49, iArr12, i48, i52);
                System.arraycopy(iArr, i49, iArr13, i48, i52);
            } else {
                i7 = i46;
                iArr3 = iArr11;
            }
            int i53 = i7;
            while (i49 < i51) {
                int i54 = i51;
                int[] iArr16 = iArr13;
                long[] jArr15 = jArr;
                int[] iArr17 = iArr;
                long j13 = j11;
                jArr14[i48] = v50.w0(j11, 1000000, lvVar2.d) + v50.w0(Math.max(0, jArr[i49] - j12), 1000000, lvVar2.c);
                if (z8 && iArr12[i48] > i53) {
                    i53 = iArr3[i49];
                }
                i48++;
                i49++;
                i51 = i54;
                iArr13 = iArr16;
                j11 = j13;
                jArr = jArr15;
                iArr = iArr17;
            }
            i47++;
            j11 += lvVar2.h[i47];
            iArr8 = iArr14;
            iArr13 = iArr13;
            jArr = jArr;
            iArr = iArr;
            iArr11 = iArr3;
            i46 = i53;
            iArr9 = iArr15;
        }
        return new ov(lvVar, jArr13, iArr12, i46, jArr14, iArr13, v50.w0(j11, 1000000, lvVar2.d));
    }

    private static c s(i50 i50, int i, int i2, String str, ns nsVar, boolean z) {
        i50 i502 = i50;
        i502.M(12);
        int k = i50.k();
        c cVar = new c(k);
        for (int i3 = 0; i3 < k; i3++) {
            int c2 = i50.c();
            int k2 = i50.k();
            q40.b(k2 > 0, "childAtomSize should be positive");
            int k3 = i50.k();
            if (k3 == 1635148593 || k3 == 1635148595 || k3 == 1701733238 || k3 == 1836070006 || k3 == 1752589105 || k3 == 1751479857 || k3 == 1932670515 || k3 == 1987063864 || k3 == 1987063865 || k3 == 1635135537 || k3 == 1685479798 || k3 == 1685479729 || k3 == 1685481573 || k3 == 1685481521) {
                y(i50, k3, c2, k2, i, i2, nsVar, cVar, i3);
            } else if (k3 == 1836069985 || k3 == 1701733217 || k3 == 1633889587 || k3 == 1700998451 || k3 == 1633889588 || k3 == 1685353315 || k3 == 1685353317 || k3 == 1685353320 || k3 == 1685353324 || k3 == 1935764850 || k3 == 1935767394 || k3 == 1819304813 || k3 == 1936684916 || k3 == 1953984371 || k3 == 778924083 || k3 == 1634492771 || k3 == 1634492791 || k3 == 1970037111 || k3 == 1332770163 || k3 == 1716281667) {
                d(i50, k3, c2, k2, i, str, z, nsVar, cVar, i3);
            } else if (k3 == 1414810956 || k3 == 1954034535 || k3 == 2004251764 || k3 == 1937010800 || k3 == 1664495672) {
                t(i50, k3, c2, k2, i, str, cVar);
            } else if (k3 == 1667329389) {
                cVar.b = f0.v(Integer.toString(i), "application/x-camera-motion", (String) null, -1, (ns) null);
            }
            i502.M(c2 + k2);
        }
        return cVar;
    }

    private static void t(i50 i50, int i, int i2, int i3, int i4, String str, c cVar) {
        i50 i502 = i50;
        int i5 = i;
        c cVar2 = cVar;
        i502.M(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 != 1414810956) {
            if (i5 == 1954034535) {
                int i6 = (i3 - 8) - 8;
                byte[] bArr = new byte[i6];
                i502.h(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i5 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i5 == 1937010800) {
                j = 0;
            } else if (i5 == 1664495672) {
                cVar2.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.b = f0.D(Integer.toString(i4), str2, (String) null, -1, 0, str, -1, (ns) null, j, list);
    }

    private static f u(i50 i50) {
        boolean z;
        int i = 8;
        i50.M(8);
        int c2 = bv.c(i50.k());
        i50.N(c2 == 0 ? 8 : 16);
        int k = i50.k();
        i50.N(4);
        int c3 = i50.c();
        if (c2 == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (i50.a[c3 + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            i50.N(i);
        } else {
            long B = c2 == 0 ? i50.B() : i50.E();
            if (B != 0) {
                j = B;
            }
        }
        i50.N(16);
        int k2 = i50.k();
        int k3 = i50.k();
        i50.N(4);
        int k4 = i50.k();
        int k5 = i50.k();
        if (k2 == 0 && k3 == 65536 && k4 == -65536 && k5 == 0) {
            i2 = 90;
        } else if (k2 == 0 && k3 == -65536 && k4 == 65536 && k5 == 0) {
            i2 = 270;
        } else if (k2 == -65536 && k3 == 0 && k4 == 0 && k5 == -65536) {
            i2 = 180;
        }
        return new f(k, j, i2);
    }

    public static lv v(bv.a aVar, bv.b bVar, long j, ns nsVar, boolean z, boolean z2) {
        long j2;
        bv.b bVar2;
        long[] jArr;
        long[] jArr2;
        bv.a aVar2 = aVar;
        bv.a f2 = aVar2.f(1835297121);
        int c2 = c(i(f2.g(1751411826).b));
        if (c2 == -1) {
            return null;
        }
        f u = u(aVar2.g(1953196132).b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = u.b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long m = m(bVar2.b);
        if (j2 != -9223372036854775807L) {
            j3 = v50.w0(j2, 1000000, m);
        }
        long j4 = j3;
        bv.a f3 = f2.f(1835626086).f(1937007212);
        Pair<Long, String> k = k(f2.g(1835296868).b);
        c s = s(f3.g(1937011556).b, u.a, u.c, (String) k.second, nsVar, z2);
        if (!z) {
            Pair<long[], long[]> f4 = f(aVar2.f(1701082227));
            jArr = (long[]) f4.second;
            jArr2 = (long[]) f4.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (s.b == null) {
            return null;
        }
        return new lv(u.a, c2, ((Long) k.first).longValue(), m, j4, s.b, s.d, s.a, s.c, jArr2, jArr);
    }

    public static yx w(bv.b bVar, boolean z) {
        if (z) {
            return null;
        }
        i50 i50 = bVar.b;
        i50.M(8);
        while (i50.a() >= 8) {
            int c2 = i50.c();
            int k = i50.k();
            if (i50.k() == 1835365473) {
                i50.M(c2);
                return x(i50, c2 + k);
            }
            i50.M(c2 + k);
        }
        return null;
    }

    private static yx x(i50 i50, int i) {
        i50.N(12);
        while (i50.c() < i) {
            int c2 = i50.c();
            int k = i50.k();
            if (i50.k() == 1768715124) {
                i50.M(c2);
                return j(i50, c2 + k);
            }
            i50.M(c2 + k);
        }
        return null;
    }

    private static void y(i50 i50, int i, int i2, int i3, int i4, int i5, ns nsVar, c cVar, int i6) {
        i50 i502 = i50;
        int i7 = i2;
        int i8 = i3;
        ns nsVar2 = nsVar;
        c cVar2 = cVar;
        i502.M(i7 + 8 + 8);
        i502.N(16);
        int F = i50.F();
        int F2 = i50.F();
        i502.N(50);
        int c2 = i50.c();
        int i9 = i;
        if (i9 == 1701733238) {
            Pair<Integer, mv> p = p(i502, i7, i8);
            if (p != null) {
                i9 = ((Integer) p.first).intValue();
                nsVar2 = nsVar2 == null ? null : nsVar2.c(((mv) p.second).b);
                cVar2.a[i6] = (mv) p.second;
            }
            i502.M(c2);
        }
        ns nsVar3 = nsVar2;
        String str = null;
        String str2 = null;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f2 = 1.0f;
        int i10 = -1;
        while (c2 - i7 < i8) {
            i502.M(c2);
            int c3 = i50.c();
            int k = i50.k();
            if (k == 0 && i50.c() - i7 == i8) {
                break;
            }
            q40.b(k > 0, "childAtomSize should be positive");
            int k2 = i50.k();
            if (k2 == 1635148611) {
                q40.f(str == null);
                i502.M(c3 + 8);
                h b2 = h.b(i50);
                list = b2.a;
                cVar2.c = b2.b;
                if (!z) {
                    f2 = b2.e;
                }
                str = "video/avc";
            } else if (k2 == 1752589123) {
                q40.f(str == null);
                i502.M(c3 + 8);
                l a2 = l.a(i50);
                list = a2.a;
                cVar2.c = a2.b;
                str = "video/hevc";
            } else if (k2 == 1685480259 || k2 == 1685485123) {
                j a3 = j.a(i50);
                if (a3 != null) {
                    str2 = a3.a;
                    str = "video/dolby-vision";
                }
            } else if (k2 == 1987076931) {
                q40.f(str == null);
                str = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (k2 == 1635135811) {
                q40.f(str == null);
                str = "video/av01";
            } else if (k2 == 1681012275) {
                q40.f(str == null);
                str = "video/3gpp";
            } else if (k2 == 1702061171) {
                q40.f(str == null);
                Pair<String, byte[]> g = g(i502, c3);
                str = (String) g.first;
                list = Collections.singletonList((byte[]) g.second);
            } else if (k2 == 1885434736) {
                f2 = n(i502, c3);
                z = true;
            } else if (k2 == 1937126244) {
                bArr = o(i502, c3, k);
            } else if (k2 == 1936995172) {
                int z2 = i50.z();
                i502.N(3);
                if (z2 == 0) {
                    int z3 = i50.z();
                    if (z3 == 0) {
                        i10 = 0;
                    } else if (z3 == 1) {
                        i10 = 1;
                    } else if (z3 == 2) {
                        i10 = 2;
                    } else if (z3 == 3) {
                        i10 = 3;
                    }
                }
            }
            c2 += k;
            i7 = i2;
        }
        if (str != null) {
            cVar2.b = f0.I(Integer.toString(i4), str, str2, -1, -1, F, F2, -1.0f, list, i5, f2, bArr, i10, (i) null, nsVar3);
        }
    }
}
