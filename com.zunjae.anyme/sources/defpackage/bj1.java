package defpackage;

import defpackage.rl1;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: bj1  reason: default package */
abstract class bj1 implements dl1 {

    /* renamed from: bj1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                rl1$b[] r0 = defpackage.rl1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                rl1$b r1 = defpackage.rl1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                rl1$b r1 = defpackage.rl1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rl1$b r1 = defpackage.rl1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rl1$b r1 = defpackage.rl1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                rl1$b r1 = defpackage.rl1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                rl1$b r1 = defpackage.rl1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                rl1$b r1 = defpackage.rl1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                rl1$b r1 = defpackage.rl1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                rl1$b r1 = defpackage.rl1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                rl1$b r1 = defpackage.rl1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                rl1$b r1 = defpackage.rl1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                rl1$b r1 = defpackage.rl1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                rl1$b r1 = defpackage.rl1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                rl1$b r1 = defpackage.rl1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                rl1$b r1 = defpackage.rl1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                rl1$b r1 = defpackage.rl1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                rl1$b r1 = defpackage.rl1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bj1.a.<clinit>():void");
        }
    }

    /* renamed from: bj1$b */
    private static final class b extends bj1 {
        private final boolean a;
        private final byte[] b;
        private int c;
        private int d;
        private int e;
        private int f;

        public b(ByteBuffer byteBuffer, boolean z) {
            super((a) null);
            this.a = z;
            this.b = byteBuffer.array();
            this.c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.c == this.d;
        }

        private byte S() {
            int i = this.c;
            if (i != this.d) {
                byte[] bArr = this.b;
                this.c = i + 1;
                return bArr[i];
            }
            throw yj1.k();
        }

        private Object T(rl1.b bVar, Class<?> cls, mj1 mj1) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(j());
                case 2:
                    return G();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(u());
                case 5:
                    return Integer.valueOf(i());
                case 6:
                    return Long.valueOf(c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(I());
                case 9:
                    return Long.valueOf(N());
                case 10:
                    return h(cls, mj1);
                case 11:
                    return Integer.valueOf(K());
                case 12:
                    return Long.valueOf(l());
                case 13:
                    return Integer.valueOf(w());
                case 14:
                    return Long.valueOf(x());
                case 15:
                    return O();
                case 16:
                    return Integer.valueOf(p());
                case 17:
                    return Long.valueOf(b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T U(el1<T> el1, mj1 mj1) {
            int i = this.f;
            this.f = rl1.c(rl1.a(this.e), 4);
            try {
                T j = el1.j();
                el1.g(j, this, mj1);
                el1.e(j);
                if (this.e == this.f) {
                    return j;
                }
                throw yj1.g();
            } finally {
                this.f = i;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        private <T> T Z(el1<T> el1, mj1 mj1) {
            int c0 = c0();
            f0(c0);
            int i = this.d;
            int i2 = this.c + c0;
            this.d = i2;
            try {
                T j = el1.j();
                el1.g(j, this, mj1);
                el1.e(j);
                if (this.c == i2) {
                    return j;
                }
                throw yj1.g();
            } finally {
                this.d = i;
            }
        }

        private int c0() {
            byte b2;
            int i = this.c;
            int i2 = this.d;
            if (i2 != i) {
                byte[] bArr = this.b;
                int i3 = i + 1;
                byte b3 = bArr[i];
                if (b3 >= 0) {
                    this.c = i3;
                    return b3;
                } else if (i2 - i3 < 9) {
                    return (int) e0();
                } else {
                    int i4 = i3 + 1;
                    byte b4 = b3 ^ (bArr[i3] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b5 = b4 ^ (bArr[i4] << 14);
                        if (b5 >= 0) {
                            b2 = b5 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b6 = b5 ^ (bArr[i5] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b7 = bArr[i4];
                                b2 = (b6 ^ (b7 << 28)) ^ 266354560;
                                if (b7 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw yj1.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.c = i4;
                    return b2;
                }
            } else {
                throw yj1.k();
            }
        }

        private long e0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = S();
                j |= ((long) (S & Byte.MAX_VALUE)) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw yj1.e();
        }

        private void f0(int i) {
            if (i < 0 || i > this.d - this.c) {
                throw yj1.k();
            }
        }

        private void g0(int i) {
            if (this.c != i) {
                throw yj1.k();
            }
        }

        private void h0(int i) {
            if (rl1.b(this.e) != i) {
                throw yj1.d();
            }
        }

        private void i0(int i) {
            f0(i);
            this.c += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void j0() {
            /*
                r3 = this;
                int r0 = r3.f
                int r1 = r3.e
                int r1 = defpackage.rl1.a(r1)
                r2 = 4
                int r1 = defpackage.rl1.c(r1, r2)
                r3.f = r1
            L_0x000f:
                int r1 = r3.B()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.J()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.e
                int r2 = r3.f
                if (r1 != r2) goto L_0x0027
                r3.f = r0
                return
            L_0x0027:
                yj1 r0 = defpackage.yj1.g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bj1.b.j0():void");
        }

        private void k0() {
            int i = this.d;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            l0();
        }

        private void l0() {
            int i = 0;
            while (i < 10) {
                if (S() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw yj1.e();
        }

        private void m0(int i) {
            f0(i);
            if ((i & 3) != 0) {
                throw yj1.g();
            }
        }

        private void n0(int i) {
            f0(i);
            if ((i & 7) != 0) {
                throw yj1.g();
            }
        }

        public <T> T A(Class<T> cls, mj1 mj1) {
            h0(3);
            return U(al1.a().d(cls), mj1);
        }

        public int B() {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int c0 = c0();
            this.e = c0;
            if (c0 == this.f) {
                return Integer.MAX_VALUE;
            }
            return rl1.a(c0);
        }

        public void C(List<String> list) {
            b0(list, false);
        }

        public <T> T D(el1<T> el1, mj1 mj1) {
            h0(2);
            return Z(el1, mj1);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (J() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new defpackage.yj1("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void E(java.util.Map<K, V> r8, defpackage.hk1.a<K, V> r9, defpackage.mj1 r10) {
            /*
                r7 = this;
                r0 = 2
                r7.h0(r0)
                int r1 = r7.c0()
                r7.f0(r1)
                int r2 = r7.d
                int r3 = r7.c
                int r3 = r3 + r1
                r7.d = r3
                K r1 = r9.b     // Catch:{ all -> 0x005b }
                V r3 = r9.d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.B()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.J()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                yj1 r4 = new yj1     // Catch:{ a -> 0x004e }
                r4.<init>(r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                rl1$b r4 = r9.c     // Catch:{ a -> 0x004e }
                V r5 = r9.d     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                rl1$b r4 = r9.a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.J()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                yj1 r8 = new yj1     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bj1.b.E(java.util.Map, hk1$a, mj1):void");
        }

        public void F(List<String> list) {
            b0(list, true);
        }

        public ej1 G() {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return ej1.f;
            }
            f0(c0);
            ej1 D = this.a ? ej1.D(this.b, this.c, c0) : ej1.h(this.b, this.c, c0);
            this.c += c0;
            return D;
        }

        public void H(List<Float> list) {
            int i;
            int i2;
            if (list instanceof tj1) {
                tj1 tj1 = (tj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        tj1.g(Float.intBitsToFloat(W()));
                    }
                } else if (b2 == 5) {
                    do {
                        tj1.g(readFloat());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else {
                    throw yj1.d();
                }
            }
        }

        public int I() {
            h0(0);
            return c0();
        }

        public boolean J() {
            int i;
            int i2;
            if (R() || (i = this.e) == this.f) {
                return false;
            }
            int b2 = rl1.b(i);
            if (b2 != 0) {
                if (b2 == 1) {
                    i2 = 8;
                } else if (b2 == 2) {
                    i2 = c0();
                } else if (b2 == 3) {
                    j0();
                    return true;
                } else if (b2 == 5) {
                    i2 = 4;
                } else {
                    throw yj1.d();
                }
                i0(i2);
                return true;
            }
            k0();
            return true;
        }

        public int K() {
            h0(5);
            return V();
        }

        public void L(List<ej1> list) {
            int i;
            if (rl1.b(this.e) == 2) {
                do {
                    list.add(G());
                    if (!R()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.e);
                this.c = i;
                return;
            }
            throw yj1.d();
        }

        public void M(List<Double> list) {
            int i;
            int i2;
            if (list instanceof jj1) {
                jj1 jj1 = (jj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 1) {
                    do {
                        jj1.g(readDouble());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        jj1.g(Double.longBitsToDouble(Y()));
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public long N() {
            h0(0);
            return d0();
        }

        public String O() {
            return a0(true);
        }

        public void P(List<Long> list) {
            int i;
            int i2;
            if (list instanceof fk1) {
                fk1 fk1 = (fk1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 1) {
                    do {
                        fk1.h(c());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        fk1.h(Y());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(c()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public void a(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        wj1.g(w());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        wj1.g(fj1.b(c0()));
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(w()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(fj1.b(c0())));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public String a0(boolean z) {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return "";
            }
            f0(c0);
            if (z) {
                byte[] bArr = this.b;
                int i = this.c;
                if (!ql1.n(bArr, i, i + c0)) {
                    throw yj1.c();
                }
            }
            String str = new String(this.b, this.c, c0, xj1.a);
            this.c += c0;
            return str;
        }

        public long b() {
            h0(0);
            return d0();
        }

        public void b0(List<String> list, boolean z) {
            int i;
            int i2;
            if (rl1.b(this.e) != 2) {
                throw yj1.d();
            } else if (!(list instanceof dk1) || z) {
                do {
                    list.add(a0(z));
                    if (!R()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.e);
                this.c = i;
            } else {
                dk1 dk1 = (dk1) list;
                do {
                    dk1.x(G());
                    if (!R()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (c0() == this.e);
                this.c = i2;
            }
        }

        public long c() {
            h0(1);
            return X();
        }

        public void d(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        wj1.g(W());
                    }
                } else if (b2 == 5) {
                    do {
                        wj1.g(K());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(K()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else {
                    throw yj1.d();
                }
            }
        }

        public long d0() {
            long j;
            int i;
            long j2;
            long j3;
            byte b2;
            int i2 = this.c;
            int i3 = this.d;
            if (i3 != i2) {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                byte b3 = bArr[i2];
                if (b3 >= 0) {
                    this.c = i4;
                    return (long) b3;
                } else if (i3 - i4 < 9) {
                    return e0();
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 7);
                    if (b4 < 0) {
                        b2 = b4 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 14);
                        if (b5 >= 0) {
                            i = i6;
                            j = (long) (b5 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b6 = b5 ^ (bArr[i6] << 21);
                            if (b6 < 0) {
                                b2 = b6 ^ -2080896;
                            } else {
                                long j4 = (long) b6;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw yj1.e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.c = i;
                        return j;
                    }
                    j = (long) b2;
                    this.c = i;
                    return j;
                }
            } else {
                throw yj1.k();
            }
        }

        public void e(List<Long> list) {
            int i;
            int i2;
            if (list instanceof fk1) {
                fk1 fk1 = (fk1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        fk1.h(x());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        fk1.h(fj1.c(d0()));
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(x()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Long.valueOf(fj1.c(d0())));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public <T> void f(List<T> list, el1<T> el1, mj1 mj1) {
            int i;
            if (rl1.b(this.e) == 3) {
                int i2 = this.e;
                do {
                    list.add(U(el1, mj1));
                    if (!R()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (c0() == i2);
                this.c = i;
                return;
            }
            throw yj1.d();
        }

        public void g(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        wj1.g(p());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        wj1.g(c0());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public <T> T h(Class<T> cls, mj1 mj1) {
            h0(2);
            return Z(al1.a().d(cls), mj1);
        }

        public int i() {
            h0(5);
            return V();
        }

        public boolean j() {
            h0(0);
            return c0() != 0;
        }

        public <T> void k(List<T> list, el1<T> el1, mj1 mj1) {
            int i;
            if (rl1.b(this.e) == 2) {
                int i2 = this.e;
                do {
                    list.add(Z(el1, mj1));
                    if (!R()) {
                        i = this.c;
                    } else {
                        return;
                    }
                } while (c0() == i2);
                this.c = i;
                return;
            }
            throw yj1.d();
        }

        public long l() {
            h0(1);
            return X();
        }

        public void m(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof fk1) {
                fk1 fk1 = (fk1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        fk1.h(b());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        fk1.h(d0());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                    return;
                } else if (b3 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw yj1.d();
                }
            }
            g0(i);
        }

        public <T> T n(el1<T> el1, mj1 mj1) {
            h0(3);
            return U(el1, mj1);
        }

        public int o() {
            return this.e;
        }

        public int p() {
            h0(0);
            return c0();
        }

        public void q(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof fk1) {
                fk1 fk1 = (fk1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        fk1.h(N());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        fk1.h(d0());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(N()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                    return;
                } else if (b3 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw yj1.d();
                }
            }
            g0(i);
        }

        public void r(List<Long> list) {
            int i;
            int i2;
            if (list instanceof fk1) {
                fk1 fk1 = (fk1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 1) {
                    do {
                        fk1.h(l());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = c0();
                    n0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        fk1.h(Y());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        public void s(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        wj1.g(I());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        wj1.g(c0());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(I()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                    return;
                } else if (b3 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw yj1.d();
                }
            }
            g0(i);
        }

        public void t(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        wj1.g(u());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int c0 = this.c + c0();
                    while (this.c < c0) {
                        wj1.g(c0());
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(u()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else if (b3 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw yj1.d();
                }
            }
        }

        public int u() {
            h0(0);
            return c0();
        }

        public void v(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof wj1) {
                wj1 wj1 = (wj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 2) {
                    int c0 = c0();
                    m0(c0);
                    int i3 = this.c + c0;
                    while (this.c < i3) {
                        wj1.g(W());
                    }
                } else if (b2 == 5) {
                    do {
                        wj1.g(i());
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(i()));
                        if (!R()) {
                            i = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i;
                } else {
                    throw yj1.d();
                }
            }
        }

        public int w() {
            h0(0);
            return fj1.b(c0());
        }

        public long x() {
            h0(0);
            return fj1.c(d0());
        }

        public void y(List<Boolean> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof cj1) {
                cj1 cj1 = (cj1) list;
                int b2 = rl1.b(this.e);
                if (b2 == 0) {
                    do {
                        cj1.h(j());
                        if (!R()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        cj1.h(c0() != 0);
                    }
                } else {
                    throw yj1.d();
                }
            } else {
                int b3 = rl1.b(this.e);
                if (b3 == 0) {
                    do {
                        list.add(Boolean.valueOf(j()));
                        if (!R()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (c0() == this.e);
                    this.c = i2;
                    return;
                } else if (b3 == 2) {
                    i = this.c + c0();
                    while (this.c < i) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                } else {
                    throw yj1.d();
                }
            }
            g0(i);
        }

        public String z() {
            return a0(false);
        }
    }

    private bj1() {
    }

    /* synthetic */ bj1(a aVar) {
        this();
    }

    public static bj1 Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
