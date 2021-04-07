package defpackage;

import defpackage.rl1;
import java.util.List;

/* renamed from: gj1  reason: default package */
final class gj1 implements dl1 {
    private final fj1 a;
    private int b;
    private int c;
    private int d = 0;

    /* renamed from: gj1$a */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gj1.a.<clinit>():void");
        }
    }

    private gj1(fj1 fj1) {
        xj1.b(fj1, "input");
        fj1 fj12 = fj1;
        this.a = fj12;
        fj12.d = this;
    }

    public static gj1 Q(fj1 fj1) {
        gj1 gj1 = fj1.d;
        return gj1 != null ? gj1 : new gj1(fj1);
    }

    private Object R(rl1.b bVar, Class<?> cls, mj1 mj1) {
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

    private <T> T S(el1<T> el1, mj1 mj1) {
        int i = this.c;
        this.c = rl1.c(rl1.a(this.b), 4);
        try {
            T j = el1.j();
            el1.g(j, this, mj1);
            el1.e(j);
            if (this.b == this.c) {
                return j;
            }
            throw yj1.g();
        } finally {
            this.c = i;
        }
    }

    private <T> T T(el1<T> el1, mj1 mj1) {
        int C = this.a.C();
        fj1 fj1 = this.a;
        if (fj1.a < fj1.b) {
            int l = fj1.l(C);
            T j = el1.j();
            this.a.a++;
            el1.g(j, this, mj1);
            el1.e(j);
            this.a.a(0);
            fj1 fj12 = this.a;
            fj12.a--;
            fj12.k(l);
            return j;
        }
        throw yj1.h();
    }

    private void V(int i) {
        if (this.a.d() != i) {
            throw yj1.k();
        }
    }

    private void W(int i) {
        if (rl1.b(this.b) != i) {
            throw yj1.d();
        }
    }

    private void X(int i) {
        if ((i & 3) != 0) {
            throw yj1.g();
        }
    }

    private void Y(int i) {
        if ((i & 7) != 0) {
            throw yj1.g();
        }
    }

    public <T> T A(Class<T> cls, mj1 mj1) {
        W(3);
        return S(al1.a().d(cls), mj1);
    }

    public int B() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return rl1.a(i2);
    }

    public void C(List<String> list) {
        U(list, false);
    }

    public <T> T D(el1<T> el1, mj1 mj1) {
        W(2);
        return T(el1, mj1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (J() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new defpackage.yj1("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void E(java.util.Map<K, V> r8, defpackage.hk1.a<K, V> r9, defpackage.mj1 r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            fj1 r1 = r7.a
            int r1 = r1.C()
            fj1 r2 = r7.a
            int r1 = r2.l(r1)
            K r2 = r9.b
            V r3 = r9.d
        L_0x0014:
            int r4 = r7.B()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            fj1 r5 = r7.a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.J()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            yj1 r4 = new yj1     // Catch:{ a -> 0x004f }
            r4.<init>(r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            rl1$b r4 = r9.c     // Catch:{ a -> 0x004f }
            V r5 = r9.d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            rl1$b r4 = r9.a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.J()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            yj1 r8 = new yj1     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            fj1 r8 = r7.a
            r8.k(r1)
            return
        L_0x0065:
            r8 = move-exception
            fj1 r9 = r7.a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj1.E(java.util.Map, hk1$a, mj1):void");
    }

    public void F(List<String> list) {
        U(list, true);
    }

    public ej1 G() {
        W(2);
        return this.a.n();
    }

    public void H(List<Float> list) {
        int B;
        int B2;
        if (list instanceof tj1) {
            tj1 tj1 = (tj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 2) {
                int C = this.a.C();
                X(C);
                int d2 = this.a.d() + C;
                do {
                    tj1.g(this.a.s());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    tj1.g(this.a.s());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 2) {
                int C2 = this.a.C();
                X(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Float.valueOf(this.a.s()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Float.valueOf(this.a.s()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else {
                throw yj1.d();
            }
        }
    }

    public int I() {
        W(0);
        return this.a.t();
    }

    public boolean J() {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }

    public int K() {
        W(5);
        return this.a.v();
    }

    public void L(List<ej1> list) {
        int B;
        if (rl1.b(this.b) == 2) {
            do {
                list.add(G());
                if (!this.a.e()) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw yj1.d();
    }

    public void M(List<Double> list) {
        int B;
        int B2;
        if (list instanceof jj1) {
            jj1 jj1 = (jj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 1) {
                do {
                    jj1.g(this.a.o());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else if (b2 == 2) {
                int C = this.a.C();
                Y(C);
                int d2 = this.a.d() + C;
                do {
                    jj1.g(this.a.o());
                } while (this.a.d() < d2);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.a.o()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else if (b3 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Double.valueOf(this.a.o()));
                } while (this.a.d() < d3);
            } else {
                throw yj1.d();
            }
        }
    }

    public long N() {
        W(0);
        return this.a.u();
    }

    public String O() {
        W(2);
        return this.a.A();
    }

    public void P(List<Long> list) {
        int B;
        int B2;
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 1) {
                do {
                    fk1.h(this.a.r());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else if (b2 == 2) {
                int C = this.a.C();
                Y(C);
                int d2 = this.a.d() + C;
                do {
                    fk1.h(this.a.r());
                } while (this.a.d() < d2);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else if (b3 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.d() < d3);
            } else {
                throw yj1.d();
            }
        }
    }

    public void U(List<String> list, boolean z) {
        int B;
        int B2;
        if (rl1.b(this.b) != 2) {
            throw yj1.d();
        } else if (!(list instanceof dk1) || z) {
            do {
                list.add(z ? O() : z());
                if (!this.a.e()) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == this.b);
            this.d = B;
        } else {
            dk1 dk1 = (dk1) list;
            do {
                dk1.x(G());
                if (!this.a.e()) {
                    B2 = this.a.B();
                } else {
                    return;
                }
            } while (B2 == this.b);
            this.d = B2;
        }
    }

    public void a(List<Integer> list) {
        int i;
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    wj1.g(this.a.x());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    wj1.g(this.a.x());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.x()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.x()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public long b() {
        W(0);
        return this.a.D();
    }

    public long c() {
        W(1);
        return this.a.r();
    }

    public void d(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 2) {
                int C = this.a.C();
                X(C);
                int d2 = this.a.d() + C;
                do {
                    wj1.g(this.a.v());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    wj1.g(this.a.v());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 2) {
                int C2 = this.a.C();
                X(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else {
                throw yj1.d();
            }
        }
    }

    public void e(List<Long> list) {
        int i;
        int B;
        int B2;
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    fk1.h(this.a.y());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    fk1.h(this.a.y());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.y()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.y()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public <T> void f(List<T> list, el1<T> el1, mj1 mj1) {
        int B;
        if (rl1.b(this.b) == 3) {
            int i = this.b;
            do {
                list.add(S(el1, mj1));
                if (!this.a.e() && this.d == 0) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == i);
            this.d = B;
            return;
        }
        throw yj1.d();
    }

    public void g(List<Integer> list) {
        int i;
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    wj1.g(this.a.C());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    wj1.g(this.a.C());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.C()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.C()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public <T> T h(Class<T> cls, mj1 mj1) {
        W(2);
        return T(al1.a().d(cls), mj1);
    }

    public int i() {
        W(5);
        return this.a.q();
    }

    public boolean j() {
        W(0);
        return this.a.m();
    }

    public <T> void k(List<T> list, el1<T> el1, mj1 mj1) {
        int B;
        if (rl1.b(this.b) == 2) {
            int i = this.b;
            do {
                list.add(T(el1, mj1));
                if (!this.a.e() && this.d == 0) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == i);
            this.d = B;
            return;
        }
        throw yj1.d();
    }

    public long l() {
        W(1);
        return this.a.w();
    }

    public void m(List<Long> list) {
        int i;
        int B;
        int B2;
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    fk1.h(this.a.D());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    fk1.h(this.a.D());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.D()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.D()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public <T> T n(el1<T> el1, mj1 mj1) {
        W(3);
        return S(el1, mj1);
    }

    public int o() {
        return this.b;
    }

    public int p() {
        W(0);
        return this.a.C();
    }

    public void q(List<Long> list) {
        int i;
        int B;
        int B2;
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    fk1.h(this.a.u());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    fk1.h(this.a.u());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public void r(List<Long> list) {
        int B;
        int B2;
        if (list instanceof fk1) {
            fk1 fk1 = (fk1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 1) {
                do {
                    fk1.h(this.a.w());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else if (b2 == 2) {
                int C = this.a.C();
                Y(C);
                int d2 = this.a.d() + C;
                do {
                    fk1.h(this.a.w());
                } while (this.a.d() < d2);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else if (b3 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < d3);
            } else {
                throw yj1.d();
            }
        }
    }

    public double readDouble() {
        W(1);
        return this.a.o();
    }

    public float readFloat() {
        W(5);
        return this.a.s();
    }

    public void s(List<Integer> list) {
        int i;
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    wj1.g(this.a.t());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    wj1.g(this.a.t());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public void t(List<Integer> list) {
        int i;
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    wj1.g(this.a.p());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    wj1.g(this.a.p());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public int u() {
        W(0);
        return this.a.p();
    }

    public void v(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof wj1) {
            wj1 wj1 = (wj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 2) {
                int C = this.a.C();
                X(C);
                int d2 = this.a.d() + C;
                do {
                    wj1.g(this.a.q());
                } while (this.a.d() < d2);
            } else if (b2 == 5) {
                do {
                    wj1.g(this.a.q());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 2) {
                int C2 = this.a.C();
                X(C2);
                int d3 = this.a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
            } else {
                throw yj1.d();
            }
        }
    }

    public int w() {
        W(0);
        return this.a.x();
    }

    public long x() {
        W(0);
        return this.a.y();
    }

    public void y(List<Boolean> list) {
        int i;
        int B;
        int B2;
        if (list instanceof cj1) {
            cj1 cj1 = (cj1) list;
            int b2 = rl1.b(this.b);
            if (b2 == 0) {
                do {
                    cj1.h(this.a.m());
                    if (!this.a.e()) {
                        B2 = this.a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.b);
                this.d = B2;
                return;
            } else if (b2 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    cj1.h(this.a.m());
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        } else {
            int b3 = rl1.b(this.b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.m()));
                    if (!this.a.e()) {
                        B = this.a.B();
                    } else {
                        return;
                    }
                } while (B == this.b);
                this.d = B;
                return;
            } else if (b3 == 2) {
                i = this.a.d() + this.a.C();
                do {
                    list.add(Boolean.valueOf(this.a.m()));
                } while (this.a.d() < i);
            } else {
                throw yj1.d();
            }
        }
        V(i);
    }

    public String z() {
        W(2);
        return this.a.z();
    }
}
