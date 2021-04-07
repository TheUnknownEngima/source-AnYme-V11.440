package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: fj1  reason: default package */
public abstract class fj1 {
    int a;
    int b;
    int c;
    gj1 d;

    /* renamed from: fj1$b */
    private static final class b extends fj1 {
        private final byte[] e;
        private final boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private boolean l;
        private int m;

        private b(byte[] bArr, int i2, int i3, boolean z) {
            super();
            this.m = Integer.MAX_VALUE;
            this.e = bArr;
            this.g = i3 + i2;
            this.i = i2;
            this.j = i2;
            this.f = z;
        }

        private void M() {
            int i2 = this.g + this.h;
            this.g = i2;
            int i3 = i2 - this.j;
            int i4 = this.m;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.h = i5;
                this.g = i2 - i5;
                return;
            }
            this.h = 0;
        }

        private void P() {
            if (this.g - this.i >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.e;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw yj1.e();
        }

        private void R() {
            int i2 = 0;
            while (i2 < 10) {
                if (F() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw yj1.e();
        }

        public String A() {
            int J = J();
            if (J > 0) {
                int i2 = this.g;
                int i3 = this.i;
                if (J <= i2 - i3) {
                    String e2 = ql1.e(this.e, i3, J);
                    this.i += J;
                    return e2;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw yj1.f();
            }
            throw yj1.k();
        }

        public int B() {
            if (e()) {
                this.k = 0;
                return 0;
            }
            int J = J();
            this.k = J;
            if (rl1.a(J) != 0) {
                return this.k;
            }
            throw yj1.b();
        }

        public int C() {
            return J();
        }

        public long D() {
            return K();
        }

        public boolean E(int i2) {
            int b = rl1.b(i2);
            if (b == 0) {
                P();
                return true;
            } else if (b == 1) {
                O(8);
                return true;
            } else if (b == 2) {
                O(J());
                return true;
            } else if (b == 3) {
                N();
                a(rl1.c(rl1.a(i2), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    O(4);
                    return true;
                }
                throw yj1.d();
            }
        }

        public byte F() {
            int i2 = this.i;
            if (i2 != this.g) {
                byte[] bArr = this.e;
                this.i = i2 + 1;
                return bArr[i2];
            }
            throw yj1.k();
        }

        public byte[] G(int i2) {
            if (i2 > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.i = i5;
                    return Arrays.copyOfRange(this.e, i4, i5);
                }
            }
            if (i2 > 0) {
                throw yj1.k();
            } else if (i2 == 0) {
                return xj1.b;
            } else {
                throw yj1.f();
            }
        }

        public int H() {
            int i2 = this.i;
            if (this.g - i2 >= 4) {
                byte[] bArr = this.e;
                this.i = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw yj1.k();
        }

        public long I() {
            int i2 = this.i;
            if (this.g - i2 >= 8) {
                byte[] bArr = this.e;
                this.i = i2 + 8;
                return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
            }
            throw yj1.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int J() {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.L()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.b.J():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long K() {
            /*
                r11 = this;
                int r0 = r11.i
                int r1 = r11.g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.L()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.b.K():long");
        }

        /* access modifiers changed from: package-private */
        public long L() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte F = F();
                j2 |= ((long) (F & Byte.MAX_VALUE)) << i2;
                if ((F & 128) == 0) {
                    return j2;
                }
            }
            throw yj1.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void N() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.b.N():void");
        }

        public void O(int i2) {
            if (i2 >= 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (i2 <= i3 - i4) {
                    this.i = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw yj1.f();
            }
            throw yj1.k();
        }

        public void a(int i2) {
            if (this.k != i2) {
                throw yj1.a();
            }
        }

        public int d() {
            return this.i - this.j;
        }

        public boolean e() {
            return this.i == this.g;
        }

        public void k(int i2) {
            this.m = i2;
            M();
        }

        public int l(int i2) {
            if (i2 >= 0) {
                int d = i2 + d();
                int i3 = this.m;
                if (d <= i3) {
                    this.m = d;
                    M();
                    return i3;
                }
                throw yj1.k();
            }
            throw yj1.f();
        }

        public boolean m() {
            return K() != 0;
        }

        public ej1 n() {
            int J = J();
            if (J > 0) {
                int i2 = this.g;
                int i3 = this.i;
                if (J <= i2 - i3) {
                    ej1 h2 = (!this.f || !this.l) ? ej1.h(this.e, this.i, J) : ej1.D(this.e, i3, J);
                    this.i += J;
                    return h2;
                }
            }
            return J == 0 ? ej1.f : ej1.C(G(J));
        }

        public double o() {
            return Double.longBitsToDouble(I());
        }

        public int p() {
            return J();
        }

        public int q() {
            return H();
        }

        public long r() {
            return I();
        }

        public float s() {
            return Float.intBitsToFloat(H());
        }

        public int t() {
            return J();
        }

        public long u() {
            return K();
        }

        public int v() {
            return H();
        }

        public long w() {
            return I();
        }

        public int x() {
            return fj1.b(J());
        }

        public long y() {
            return fj1.c(K());
        }

        public String z() {
            int J = J();
            if (J > 0 && J <= this.g - this.i) {
                String str = new String(this.e, this.i, J, xj1.a);
                this.i += J;
                return str;
            } else if (J == 0) {
                return "";
            } else {
                if (J < 0) {
                    throw yj1.f();
                }
                throw yj1.k();
            }
        }
    }

    /* renamed from: fj1$c */
    private static final class c extends fj1 {
        private final InputStream e;
        private final byte[] f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private a m;

        /* renamed from: fj1$c$a */
        private interface a {
            void a();
        }

        private c(InputStream inputStream, int i2) {
            super();
            this.l = Integer.MAX_VALUE;
            this.m = null;
            xj1.b(inputStream, "input");
            this.e = inputStream;
            this.f = new byte[i2];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        private ej1 F(int i2) {
            byte[] I = I(i2);
            if (I != null) {
                return ej1.g(I);
            }
            int i3 = this.i;
            int i4 = this.g;
            int i5 = i4 - i3;
            this.k += i4;
            this.i = 0;
            this.g = 0;
            List<byte[]> J = J(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f, i3, bArr, 0, i5);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i5, next.length);
                i5 += next.length;
            }
            return ej1.C(bArr);
        }

        private byte[] H(int i2, boolean z) {
            byte[] I = I(i2);
            if (I != null) {
                return z ? (byte[]) I.clone() : I;
            }
            int i3 = this.i;
            int i4 = this.g;
            int i5 = i4 - i3;
            this.k += i4;
            this.i = 0;
            this.g = 0;
            List<byte[]> J = J(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f, i3, bArr, 0, i5);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i5, next.length);
                i5 += next.length;
            }
            return bArr;
        }

        private byte[] I(int i2) {
            if (i2 == 0) {
                return xj1.b;
            }
            if (i2 >= 0) {
                int i3 = this.k;
                int i4 = this.i;
                int i5 = i3 + i4 + i2;
                if (i5 - this.c <= 0) {
                    int i6 = this.l;
                    if (i5 <= i6) {
                        int i7 = this.g - i4;
                        int i8 = i2 - i7;
                        if (i8 >= 4096 && i8 > this.e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i2];
                        System.arraycopy(this.f, this.i, bArr, 0, i7);
                        this.k += this.g;
                        this.i = 0;
                        this.g = 0;
                        while (i7 < i2) {
                            int read = this.e.read(bArr, i7, i2 - i7);
                            if (read != -1) {
                                this.k += read;
                                i7 += read;
                            } else {
                                throw yj1.k();
                            }
                        }
                        return bArr;
                    }
                    S((i6 - i3) - i4);
                    throw yj1.k();
                }
                throw yj1.j();
            }
            throw yj1.f();
        }

        private List<byte[]> J(int i2) {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, 4096);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.e.read(bArr, i3, min - i3);
                    if (read != -1) {
                        this.k += read;
                        i3 += read;
                    } else {
                        throw yj1.k();
                    }
                }
                i2 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i2 = this.g + this.h;
            this.g = i2;
            int i3 = this.k + i2;
            int i4 = this.l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.h = i5;
                this.g = i2 - i5;
                return;
            }
            this.h = 0;
        }

        private void Q(int i2) {
            if (X(i2)) {
                return;
            }
            if (i2 > (this.c - this.k) - this.i) {
                throw yj1.j();
            }
            throw yj1.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.e.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void T(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0094
                int r0 = r8.k
                int r1 = r8.i
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.l
                if (r2 > r3) goto L_0x008a
                fj1$c$a r2 = r8.m
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.k = r0
                int r0 = r8.g
                int r0 = r0 - r1
                r8.g = r3
                r8.i = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.e     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.e     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.k
                int r0 = r0 + r3
                r8.k = r0
                r8.P()
                throw r9
            L_0x0067:
                int r0 = r8.k
                int r0 = r0 + r3
                r8.k = r0
                r8.P()
            L_0x006f:
                if (r3 >= r9) goto L_0x0089
                int r0 = r8.g
                int r1 = r8.i
                int r1 = r0 - r1
                r8.i = r0
                r0 = 1
            L_0x007a:
                r8.Q(r0)
                int r2 = r9 - r1
                int r3 = r8.g
                if (r2 <= r3) goto L_0x0087
                int r1 = r1 + r3
                r8.i = r3
                goto L_0x007a
            L_0x0087:
                r8.i = r2
            L_0x0089:
                return
            L_0x008a:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.S(r3)
                yj1 r9 = defpackage.yj1.k()
                throw r9
            L_0x0094:
                yj1 r9 = defpackage.yj1.f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.c.T(int):void");
        }

        private void U() {
            if (this.g - this.i >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw yj1.e();
        }

        private void W() {
            int i2 = 0;
            while (i2 < 10) {
                if (G() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw yj1.e();
        }

        private boolean X(int i2) {
            int i3 = this.i;
            if (i3 + i2 > this.g) {
                int i4 = this.c;
                int i5 = this.k;
                if (i2 > (i4 - i5) - i3 || i5 + i3 + i2 > this.l) {
                    return false;
                }
                a aVar = this.m;
                if (aVar != null) {
                    aVar.a();
                }
                int i6 = this.i;
                if (i6 > 0) {
                    int i7 = this.g;
                    if (i7 > i6) {
                        byte[] bArr = this.f;
                        System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                    }
                    this.k += i6;
                    this.g -= i6;
                    this.i = 0;
                }
                InputStream inputStream = this.e;
                byte[] bArr2 = this.f;
                int i8 = this.g;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.c - this.k) - i8));
                if (read == 0 || read < -1 || read > this.f.length) {
                    throw new IllegalStateException(this.e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.g += read;
                    P();
                    if (this.g >= i2) {
                        return true;
                    }
                    return X(i2);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
        }

        public String A() {
            byte[] bArr;
            int M = M();
            int i2 = this.i;
            if (M <= this.g - i2 && M > 0) {
                bArr = this.f;
                this.i = i2 + M;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= this.g) {
                    Q(M);
                    bArr = this.f;
                    this.i = M + 0;
                } else {
                    bArr = H(M, false);
                }
                i2 = 0;
            }
            return ql1.e(bArr, i2, M);
        }

        public int B() {
            if (e()) {
                this.j = 0;
                return 0;
            }
            int M = M();
            this.j = M;
            if (rl1.a(M) != 0) {
                return this.j;
            }
            throw yj1.b();
        }

        public int C() {
            return M();
        }

        public long D() {
            return N();
        }

        public boolean E(int i2) {
            int b = rl1.b(i2);
            if (b == 0) {
                U();
                return true;
            } else if (b == 1) {
                S(8);
                return true;
            } else if (b == 2) {
                S(M());
                return true;
            } else if (b == 3) {
                R();
                a(rl1.c(rl1.a(i2), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    S(4);
                    return true;
                }
                throw yj1.d();
            }
        }

        public byte G() {
            if (this.i == this.g) {
                Q(1);
            }
            byte[] bArr = this.f;
            int i2 = this.i;
            this.i = i2 + 1;
            return bArr[i2];
        }

        public int K() {
            int i2 = this.i;
            if (this.g - i2 < 4) {
                Q(4);
                i2 = this.i;
            }
            byte[] bArr = this.f;
            this.i = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public long L() {
            int i2 = this.i;
            if (this.g - i2 < 8) {
                Q(8);
                i2 = this.i;
            }
            byte[] bArr = this.f;
            this.i = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int M() {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.c.M():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long N() {
            /*
                r11 = this;
                int r0 = r11.i
                int r1 = r11.g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.O()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.c.N():long");
        }

        /* access modifiers changed from: package-private */
        public long O() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte G = G();
                j2 |= ((long) (G & Byte.MAX_VALUE)) << i2;
                if ((G & 128) == 0) {
                    return j2;
                }
            }
            throw yj1.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.c.R():void");
        }

        public void S(int i2) {
            int i3 = this.g;
            int i4 = this.i;
            if (i2 > i3 - i4 || i2 < 0) {
                T(i2);
            } else {
                this.i = i4 + i2;
            }
        }

        public void a(int i2) {
            if (this.j != i2) {
                throw yj1.a();
            }
        }

        public int d() {
            return this.k + this.i;
        }

        public boolean e() {
            return this.i == this.g && !X(1);
        }

        public void k(int i2) {
            this.l = i2;
            P();
        }

        public int l(int i2) {
            if (i2 >= 0) {
                int i3 = i2 + this.k + this.i;
                int i4 = this.l;
                if (i3 <= i4) {
                    this.l = i3;
                    P();
                    return i4;
                }
                throw yj1.k();
            }
            throw yj1.f();
        }

        public boolean m() {
            return N() != 0;
        }

        public ej1 n() {
            int M = M();
            int i2 = this.g;
            int i3 = this.i;
            if (M > i2 - i3 || M <= 0) {
                return M == 0 ? ej1.f : F(M);
            }
            ej1 h2 = ej1.h(this.f, i3, M);
            this.i += M;
            return h2;
        }

        public double o() {
            return Double.longBitsToDouble(L());
        }

        public int p() {
            return M();
        }

        public int q() {
            return K();
        }

        public long r() {
            return L();
        }

        public float s() {
            return Float.intBitsToFloat(K());
        }

        public int t() {
            return M();
        }

        public long u() {
            return N();
        }

        public int v() {
            return K();
        }

        public long w() {
            return L();
        }

        public int x() {
            return fj1.b(M());
        }

        public long y() {
            return fj1.c(N());
        }

        public String z() {
            int M = M();
            if (M > 0 && M <= this.g - this.i) {
                String str = new String(this.f, this.i, M, xj1.a);
                this.i += M;
                return str;
            } else if (M == 0) {
                return "";
            } else {
                if (M > this.g) {
                    return new String(H(M, false), xj1.a);
                }
                Q(M);
                String str2 = new String(this.f, this.i, M, xj1.a);
                this.i += M;
                return str2;
            }
        }
    }

    private fj1() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static fj1 f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static fj1 g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? h(xj1.b) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static fj1 h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static fj1 i(byte[] bArr, int i, int i2) {
        return j(bArr, i, i2, false);
    }

    static fj1 j(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (yj1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i);

    public abstract int l(int i);

    public abstract boolean m();

    public abstract ej1 n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
