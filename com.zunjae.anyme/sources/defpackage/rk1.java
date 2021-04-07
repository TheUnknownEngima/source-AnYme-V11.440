package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.aj1;
import defpackage.ej1;
import defpackage.hk1;
import defpackage.rl1;
import defpackage.sl1;
import defpackage.xj1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: rk1  reason: default package */
final class rk1<T> implements el1<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = pl1.B();
    private final int[] a;
    private final Object[] b;
    private final int c;
    private final int d;
    private final ok1 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final tk1 m;
    private final ek1 n;
    private final ll1<?, ?> o;
    private final nj1<?> p;
    private final jk1 q;

    /* renamed from: rk1$a */
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
                rl1$b r1 = defpackage.rl1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                rl1$b r1 = defpackage.rl1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
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
                rl1$b r1 = defpackage.rl1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                rl1$b r1 = defpackage.rl1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                rl1$b r1 = defpackage.rl1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                rl1$b r1 = defpackage.rl1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                rl1$b r1 = defpackage.rl1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                rl1$b r1 = defpackage.rl1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                rl1$b r1 = defpackage.rl1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                rl1$b r1 = defpackage.rl1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                rl1$b r1 = defpackage.rl1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                rl1$b r1 = defpackage.rl1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                rl1$b r1 = defpackage.rl1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.a.<clinit>():void");
        }
    }

    private rk1(int[] iArr, Object[] objArr, int i2, int i3, ok1 ok1, boolean z, boolean z2, int[] iArr2, int i4, int i5, tk1 tk1, ek1 ek1, ll1<?, ?> ll1, nj1<?> nj1, jk1 jk1) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.g = ok1 instanceof vj1;
        this.h = z;
        this.f = nj1 != null && nj1.e(ok1);
        this.i = z2;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = tk1;
        this.n = ek1;
        this.o = ll1;
        this.p = nj1;
        this.e = ok1;
        this.q = jk1;
    }

    private static <T> int A(T t, long j2) {
        return pl1.x(t, j2);
    }

    private static boolean B(int i2) {
        return (i2 & 536870912) != 0;
    }

    private boolean C(T t, int i2) {
        if (this.h) {
            int t0 = t0(i2);
            long V = V(t0);
            switch (s0(t0)) {
                case 0:
                    return pl1.v(t, V) != Utils.DOUBLE_EPSILON;
                case 1:
                    return pl1.w(t, V) != Utils.FLOAT_EPSILON;
                case 2:
                    return pl1.y(t, V) != 0;
                case 3:
                    return pl1.y(t, V) != 0;
                case 4:
                    return pl1.x(t, V) != 0;
                case 5:
                    return pl1.y(t, V) != 0;
                case 6:
                    return pl1.x(t, V) != 0;
                case 7:
                    return pl1.p(t, V);
                case 8:
                    Object A = pl1.A(t, V);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof ej1) {
                        return !ej1.f.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return pl1.A(t, V) != null;
                case 10:
                    return !ej1.f.equals(pl1.A(t, V));
                case 11:
                    return pl1.x(t, V) != 0;
                case 12:
                    return pl1.x(t, V) != 0;
                case 13:
                    return pl1.x(t, V) != 0;
                case 14:
                    return pl1.y(t, V) != 0;
                case 15:
                    return pl1.x(t, V) != 0;
                case 16:
                    return pl1.y(t, V) != 0;
                case 17:
                    return pl1.A(t, V) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i0 = i0(i2);
            return (pl1.x(t, (long) (i0 & 1048575)) & (1 << (i0 >>> 20))) != 0;
        }
    }

    private boolean D(T t, int i2, int i3, int i4) {
        return this.h ? C(t, i2) : (i3 & i4) != 0;
    }

    private static boolean E(Object obj, int i2, el1 el1) {
        return el1.f(pl1.A(obj, V(i2)));
    }

    private <N> boolean F(Object obj, int i2, int i3) {
        List list = (List) pl1.A(obj, V(i2));
        if (list.isEmpty()) {
            return true;
        }
        el1 v = v(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!v.f(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private boolean G(T t, int i2, int i3) {
        Map<?, ?> h2 = this.q.h(pl1.A(t, V(i2)));
        if (h2.isEmpty()) {
            return true;
        }
        if (this.q.c(u(i3)).c.getJavaType() != rl1.c.MESSAGE) {
            return true;
        }
        el1<?> el1 = null;
        for (Object next : h2.values()) {
            if (el1 == null) {
                el1 = al1.a().d(next.getClass());
            }
            if (!el1.f(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t, T t2, int i2) {
        long i0 = (long) (i0(i2) & 1048575);
        return pl1.x(t, i0) == pl1.x(t2, i0);
    }

    private boolean I(T t, int i2, int i3) {
        return pl1.x(t, (long) (i0(i3) & 1048575)) == i2;
    }

    private static boolean J(int i2) {
        return (i2 & 268435456) != 0;
    }

    private static List<?> K(Object obj, long j2) {
        return (List) pl1.A(obj, j2);
    }

    private static <T> long L(T t, long j2) {
        return pl1.y(t, j2);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private <UT, UB, ET extends defpackage.rj1.b<ET>> void M(defpackage.ll1<UT, UB> r17, defpackage.nj1<ET> r18, T r19, defpackage.dl1 r20, defpackage.mj1 r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.B()     // Catch:{ all -> 0x0568 }
            int r3 = r8.g0(r1)     // Catch:{ all -> 0x0568 }
            if (r3 >= 0) goto L_0x008c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.k
        L_0x001e:
            int r1 = r8.l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f     // Catch:{ all -> 0x0568 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            ok1 r2 = r8.e     // Catch:{ all -> 0x0568 }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x0568 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005b
            if (r14 != 0) goto L_0x004c
            rj1 r14 = r18.d(r19)     // Catch:{ all -> 0x0568 }
        L_0x004c:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0568 }
            goto L_0x000d
        L_0x005b:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x0568 }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r20.J()     // Catch:{ all -> 0x0568 }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0068:
            if (r13 != 0) goto L_0x006e
            java.lang.Object r13 = r9.f(r10)     // Catch:{ all -> 0x0568 }
        L_0x006e:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x0568 }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0075:
            int r0 = r8.k
        L_0x0077:
            int r1 = r8.l
            if (r0 >= r1) goto L_0x0086
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0086:
            if (r13 == 0) goto L_0x008b
            r9.o(r10, r13)
        L_0x008b:
            return
        L_0x008c:
            r15 = r18
            int r4 = r8.t0(r3)     // Catch:{ all -> 0x0568 }
            int r2 = s0(r4)     // Catch:{ a -> 0x0521 }
            switch(r2) {
                case 0: goto L_0x04f7;
                case 1: goto L_0x04ea;
                case 2: goto L_0x04dd;
                case 3: goto L_0x04d0;
                case 4: goto L_0x04c3;
                case 5: goto L_0x04b6;
                case 6: goto L_0x04a9;
                case 7: goto L_0x049c;
                case 8: goto L_0x0497;
                case 9: goto L_0x0466;
                case 10: goto L_0x045a;
                case 11: goto L_0x044e;
                case 12: goto L_0x0436;
                case 13: goto L_0x042a;
                case 14: goto L_0x041e;
                case 15: goto L_0x0412;
                case 16: goto L_0x0406;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c3;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ab;
                case 21: goto L_0x039f;
                case 22: goto L_0x0393;
                case 23: goto L_0x0387;
                case 24: goto L_0x037b;
                case 25: goto L_0x036f;
                case 26: goto L_0x036a;
                case 27: goto L_0x0358;
                case 28: goto L_0x0349;
                case 29: goto L_0x033d;
                case 30: goto L_0x032a;
                case 31: goto L_0x031e;
                case 32: goto L_0x0312;
                case 33: goto L_0x0306;
                case 34: goto L_0x02fa;
                case 35: goto L_0x02eb;
                case 36: goto L_0x02dc;
                case 37: goto L_0x02cd;
                case 38: goto L_0x02be;
                case 39: goto L_0x02af;
                case 40: goto L_0x02a0;
                case 41: goto L_0x0291;
                case 42: goto L_0x0282;
                case 43: goto L_0x0273;
                case 44: goto L_0x025c;
                case 45: goto L_0x024d;
                case 46: goto L_0x023e;
                case 47: goto L_0x022f;
                case 48: goto L_0x0220;
                case 49: goto L_0x020a;
                case 50: goto L_0x01f9;
                case 51: goto L_0x01e8;
                case 52: goto L_0x01d7;
                case 53: goto L_0x01c6;
                case 54: goto L_0x01b5;
                case 55: goto L_0x01a4;
                case 56: goto L_0x0193;
                case 57: goto L_0x0182;
                case 58: goto L_0x0171;
                case 59: goto L_0x016c;
                case 60: goto L_0x0135;
                case 61: goto L_0x0128;
                case 62: goto L_0x0118;
                case 63: goto L_0x00f5;
                case 64: goto L_0x00e5;
                case 65: goto L_0x00d5;
                case 66: goto L_0x00c5;
                case 67: goto L_0x00b5;
                case 68: goto L_0x00a1;
                default: goto L_0x0099;
            }     // Catch:{ a -> 0x0521 }
        L_0x0099:
            if (r13 != 0) goto L_0x0504
            java.lang.Object r13 = r17.n()     // Catch:{ a -> 0x0521 }
            goto L_0x0504
        L_0x00a1:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            el1 r2 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = r0.n(r2, r11)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
        L_0x00b0:
            r8.p0(r10, r1, r3)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x00b5:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            long r6 = r20.x()     // Catch:{ a -> 0x0521 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x00c5:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            int r2 = r20.w()     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x00d5:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            long r6 = r20.l()     // Catch:{ a -> 0x0521 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x00e5:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            int r2 = r20.K()     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x00f5:
            int r2 = r20.u()     // Catch:{ a -> 0x0521 }
            xj1$e r5 = r8.t(r3)     // Catch:{ a -> 0x0521 }
            if (r5 == 0) goto L_0x010c
            boolean r5 = r5.a(r2)     // Catch:{ a -> 0x0521 }
            if (r5 == 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            java.lang.Object r13 = defpackage.gl1.L(r1, r2, r13, r9)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x010c:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0118:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            int r2 = r20.p()     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0128:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            ej1 r2 = r20.G()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0135:
            boolean r2 = r8.I(r10, r1, r3)     // Catch:{ a -> 0x0521 }
            if (r2 == 0) goto L_0x0158
            long r5 = V(r4)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = defpackage.pl1.A(r10, r5)     // Catch:{ a -> 0x0521 }
            el1 r5 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r5 = r0.D(r5, r11)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = defpackage.xj1.h(r2, r5)     // Catch:{ a -> 0x0521 }
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0158:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            el1 r2 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = r0.D(r2, r11)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            r8.o0(r10, r3)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x016c:
            r8.l0(r10, r4, r0)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0171:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            boolean r2 = r20.j()     // Catch:{ a -> 0x0521 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0182:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            int r2 = r20.i()     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x0193:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            long r6 = r20.c()     // Catch:{ a -> 0x0521 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01a4:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            int r2 = r20.I()     // Catch:{ a -> 0x0521 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01b5:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            long r6 = r20.b()     // Catch:{ a -> 0x0521 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01c6:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            long r6 = r20.N()     // Catch:{ a -> 0x0521 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01d7:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x0521 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01e8:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x0521 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x00b0
        L_0x01f9:
            java.lang.Object r4 = r8.u(r3)     // Catch:{ a -> 0x0521 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.N(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x020a:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            el1 r6 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.j0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0220:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x022a:
            r0.e(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x022f:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x0239:
            r0.a(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x023e:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x0248:
            r0.r(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x024d:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x0257:
            r0.d(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x025c:
            ek1 r2 = r8.n     // Catch:{ a -> 0x0521 }
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0521 }
            r0.t(r2)     // Catch:{ a -> 0x0521 }
            xj1$e r3 = r8.t(r3)     // Catch:{ a -> 0x0521 }
        L_0x026d:
            java.lang.Object r13 = defpackage.gl1.A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0273:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x027d:
            r0.g(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0282:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x028c:
            r0.y(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0291:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x029b:
            r0.v(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02a0:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02aa:
            r0.P(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02af:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02b9:
            r0.s(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02be:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02c8:
            r0.m(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02cd:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02d7:
            r0.q(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02dc:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02e6:
            r0.H(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02eb:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
        L_0x02f5:
            r0.M(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x02fa:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x022a
        L_0x0306:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x0239
        L_0x0312:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x0248
        L_0x031e:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x0257
        L_0x032a:
            ek1 r2 = r8.n     // Catch:{ a -> 0x0521 }
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0521 }
            r0.t(r2)     // Catch:{ a -> 0x0521 }
            xj1$e r3 = r8.t(r3)     // Catch:{ a -> 0x0521 }
            goto L_0x026d
        L_0x033d:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x027d
        L_0x0349:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            r0.L(r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0358:
            el1 r5 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.k0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x036a:
            r8.m0(r10, r4, r0)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x036f:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x028c
        L_0x037b:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x029b
        L_0x0387:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02aa
        L_0x0393:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02b9
        L_0x039f:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02c8
        L_0x03ab:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02d7
        L_0x03b7:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02e6
        L_0x03c3:
            ek1 r1 = r8.n     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x02f5
        L_0x03cf:
            boolean r1 = r8.C(r10, r3)     // Catch:{ a -> 0x0521 }
            if (r1 == 0) goto L_0x03f2
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            java.lang.Object r1 = defpackage.pl1.A(r10, r1)     // Catch:{ a -> 0x0521 }
            el1 r2 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = r0.n(r2, r11)     // Catch:{ a -> 0x0521 }
            java.lang.Object r1 = defpackage.xj1.h(r1, r2)     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
        L_0x03ed:
            defpackage.pl1.P(r10, r2, r1)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x03f2:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            el1 r4 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r4 = r0.n(r4, r11)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r1, r4)     // Catch:{ a -> 0x0521 }
        L_0x0401:
            r8.o0(r10, r3)     // Catch:{ a -> 0x0521 }
            goto L_0x000d
        L_0x0406:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            long r4 = r20.x()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.O(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x0412:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            int r4 = r20.w()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x041e:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            long r4 = r20.l()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.O(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x042a:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            int r4 = r20.K()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x0436:
            int r2 = r20.u()     // Catch:{ a -> 0x0521 }
            xj1$e r5 = r8.t(r3)     // Catch:{ a -> 0x0521 }
            if (r5 == 0) goto L_0x0446
            boolean r5 = r5.a(r2)     // Catch:{ a -> 0x0521 }
            if (r5 == 0) goto L_0x0106
        L_0x0446:
            long r4 = V(r4)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r4, r2)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x044e:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            int r4 = r20.p()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x045a:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            ej1 r4 = r20.G()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x0466:
            boolean r1 = r8.C(r10, r3)     // Catch:{ a -> 0x0521 }
            if (r1 == 0) goto L_0x0486
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            java.lang.Object r1 = defpackage.pl1.A(r10, r1)     // Catch:{ a -> 0x0521 }
            el1 r2 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r2 = r0.D(r2, r11)     // Catch:{ a -> 0x0521 }
            java.lang.Object r1 = defpackage.xj1.h(r1, r2)     // Catch:{ a -> 0x0521 }
            long r2 = V(r4)     // Catch:{ a -> 0x0521 }
            goto L_0x03ed
        L_0x0486:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            el1 r4 = r8.v(r3)     // Catch:{ a -> 0x0521 }
            java.lang.Object r4 = r0.D(r4, r11)     // Catch:{ a -> 0x0521 }
            defpackage.pl1.P(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x0497:
            r8.l0(r10, r4, r0)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x049c:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            boolean r4 = r20.j()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.F(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04a9:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            int r4 = r20.i()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04b6:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            long r4 = r20.c()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.O(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04c3:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            int r4 = r20.I()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.N(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04d0:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            long r4 = r20.b()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.O(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04dd:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            long r4 = r20.N()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.O(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04ea:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.M(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x04f7:
            long r1 = V(r4)     // Catch:{ a -> 0x0521 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x0521 }
            defpackage.pl1.L(r10, r1, r4)     // Catch:{ a -> 0x0521 }
            goto L_0x0401
        L_0x0504:
            boolean r1 = r9.m(r13, r0)     // Catch:{ a -> 0x0521 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x050c:
            int r1 = r8.l
            if (r0 >= r1) goto L_0x051b
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x050c
        L_0x051b:
            if (r13 == 0) goto L_0x0520
            r9.o(r10, r13)
        L_0x0520:
            return
        L_0x0521:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x0568 }
            if (r1 == 0) goto L_0x0544
            boolean r1 = r20.J()     // Catch:{ all -> 0x0568 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x052f:
            int r1 = r8.l
            if (r0 >= r1) goto L_0x053e
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x052f
        L_0x053e:
            if (r13 == 0) goto L_0x0543
            r9.o(r10, r13)
        L_0x0543:
            return
        L_0x0544:
            if (r13 != 0) goto L_0x054b
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x0568 }
            r13 = r1
        L_0x054b:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x0568 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.k
        L_0x0553:
            int r1 = r8.l
            if (r0 >= r1) goto L_0x0562
            int[] r1 = r8.j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0553
        L_0x0562:
            if (r13 == 0) goto L_0x0567
            r9.o(r10, r13)
        L_0x0567:
            return
        L_0x0568:
            r0 = move-exception
            int r1 = r8.k
        L_0x056b:
            int r2 = r8.l
            if (r1 >= r2) goto L_0x057a
            int[] r2 = r8.j
            r2 = r2[r1]
            java.lang.Object r13 = r8.q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x056b
        L_0x057a:
            if (r13 == 0) goto L_0x057f
            r9.o(r10, r13)
        L_0x057f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.M(ll1, nj1, java.lang.Object, dl1, mj1):void");
    }

    private final <K, V> void N(Object obj, int i2, Object obj2, mj1 mj1, dl1 dl1) {
        long V = V(t0(i2));
        Object A = pl1.A(obj, V);
        if (A == null) {
            A = this.q.e(obj2);
            pl1.P(obj, V, A);
        } else if (this.q.g(A)) {
            Object e2 = this.q.e(obj2);
            this.q.a(e2, A);
            pl1.P(obj, V, e2);
            A = e2;
        }
        dl1.E(this.q.d(A), this.q.c(obj2), mj1);
    }

    private void O(T t, T t2, int i2) {
        long V = V(t0(i2));
        if (C(t2, i2)) {
            Object A = pl1.A(t, V);
            Object A2 = pl1.A(t2, V);
            if (A != null && A2 != null) {
                A2 = xj1.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            pl1.P(t, V, A2);
            o0(t, i2);
        }
    }

    private void P(T t, T t2, int i2) {
        int t0 = t0(i2);
        int U = U(i2);
        long V = V(t0);
        if (I(t2, U, i2)) {
            Object A = pl1.A(t, V);
            Object A2 = pl1.A(t2, V);
            if (A != null && A2 != null) {
                A2 = xj1.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            pl1.P(t, V, A2);
            p0(t, U, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        defpackage.pl1.P(r6, r1, defpackage.pl1.A(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        defpackage.pl1.N(r6, r1, defpackage.pl1.x(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        defpackage.pl1.O(r6, r1, defpackage.pl1.y(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        o0(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        defpackage.pl1.P(r6, r1, defpackage.pl1.A(r7, r1));
        p0(r6, r3, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Q(T r6, T r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.t0(r8)
            long r1 = V(r0)
            int r3 = r5.U(r8)
            int r0 = s0(r0)
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009c;
                case 6: goto L_0x0095;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x0066;
                case 12: goto L_0x005f;
                case 13: goto L_0x0058;
                case 14: goto L_0x0050;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0074;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x0033;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x001c;
                case 61: goto L_0x0015;
                case 62: goto L_0x0015;
                case 63: goto L_0x0015;
                case 64: goto L_0x0015;
                case 65: goto L_0x0015;
                case 66: goto L_0x0015;
                case 67: goto L_0x0015;
                case 68: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e4
        L_0x0015:
            boolean r0 = r5.I(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0027
        L_0x001c:
            r5.P(r6, r7, r8)
            goto L_0x00e4
        L_0x0021:
            boolean r0 = r5.I(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0027:
            java.lang.Object r7 = defpackage.pl1.A(r7, r1)
            defpackage.pl1.P(r6, r1, r7)
            r5.p0(r6, r3, r8)
            goto L_0x00e4
        L_0x0033:
            jk1 r8 = r5.q
            defpackage.gl1.F(r8, r6, r7, r1)
            goto L_0x00e4
        L_0x003a:
            ek1 r8 = r5.n
            r8.d(r6, r7, r1)
            goto L_0x00e4
        L_0x0041:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0049:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x0050:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0058:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x005f:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0065:
            goto L_0x00a9
        L_0x0066:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x006d:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x007f
        L_0x0074:
            r5.O(r6, r7, r8)
            goto L_0x00e4
        L_0x0079:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x007f:
            java.lang.Object r7 = defpackage.pl1.A(r7, r1)
            defpackage.pl1.P(r6, r1, r7)
            goto L_0x00e1
        L_0x0087:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            boolean r7 = defpackage.pl1.p(r7, r1)
            defpackage.pl1.F(r6, r1, r7)
            goto L_0x00e1
        L_0x0095:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00a3:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            int r7 = defpackage.pl1.x(r7, r1)
            defpackage.pl1.N(r6, r1, r7)
            goto L_0x00e1
        L_0x00b1:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00b8:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00be:
            long r3 = defpackage.pl1.y(r7, r1)
            defpackage.pl1.O(r6, r1, r3)
            goto L_0x00e1
        L_0x00c6:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            float r7 = defpackage.pl1.w(r7, r1)
            defpackage.pl1.M(r6, r1, r7)
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r5.C(r7, r8)
            if (r0 == 0) goto L_0x00e4
            double r3 = defpackage.pl1.v(r7, r1)
            defpackage.pl1.L(r6, r1, r3)
        L_0x00e1:
            r5.o0(r6, r8)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.Q(java.lang.Object, java.lang.Object, int):void");
    }

    static <T> rk1<T> R(Class<T> cls, mk1 mk1, tk1 tk1, ek1 ek1, ll1<?, ?> ll1, nj1<?> nj1, jk1 jk1) {
        return mk1 instanceof cl1 ? T((cl1) mk1, tk1, ek1, ll1, nj1, jk1) : S((il1) mk1, tk1, ek1, ll1, nj1, jk1);
    }

    static <T> rk1<T> S(il1 il1, tk1 tk1, ek1 ek1, ll1<?, ?> ll1, nj1<?> nj1, jk1 jk1) {
        int i2;
        int i3;
        int i4;
        boolean z = il1.c() == zk1.PROTO3;
        qj1[] e2 = il1.e();
        if (e2.length == 0) {
            i3 = 0;
            i2 = 0;
        } else {
            i3 = e2[0].h();
            i2 = e2[e2.length - 1].h();
        }
        int length = e2.length;
        int[] iArr = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i5 = 0;
        int i6 = 0;
        for (qj1 qj1 : e2) {
            if (qj1.r() == sj1.MAP) {
                i5++;
            } else if (qj1.r().id() >= 18 && qj1.r().id() <= 49) {
                i6++;
            }
        }
        int[] iArr2 = null;
        int[] iArr3 = i5 > 0 ? new int[i5] : null;
        if (i6 > 0) {
            iArr2 = new int[i6];
        }
        int[] d2 = il1.d();
        if (d2 == null) {
            d2 = r;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < e2.length) {
            qj1 qj12 = e2[i7];
            int h2 = qj12.h();
            r0(qj12, iArr, i8, z, objArr);
            if (i9 < d2.length && d2[i9] == h2) {
                d2[i9] = i8;
                i9++;
            }
            if (qj12.r() == sj1.MAP) {
                iArr3[i10] = i8;
                i10++;
            } else if (qj12.r().id() >= 18 && qj12.r().id() <= 49) {
                i4 = i8;
                iArr2[i11] = (int) pl1.E(qj12.f());
                i11++;
                i7++;
                i8 = i4 + 3;
            }
            i4 = i8;
            i7++;
            i8 = i4 + 3;
        }
        if (iArr3 == null) {
            iArr3 = r;
        }
        if (iArr2 == null) {
            iArr2 = r;
        }
        int[] iArr4 = new int[(d2.length + iArr3.length + iArr2.length)];
        System.arraycopy(d2, 0, iArr4, 0, d2.length);
        System.arraycopy(iArr3, 0, iArr4, d2.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d2.length + iArr3.length, iArr2.length);
        return new rk1(iArr, objArr, i3, i2, il1.b(), z, true, iArr4, d2.length, d2.length + iArr3.length, tk1, ek1, ll1, nj1, jk1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> defpackage.rk1<T> T(defpackage.cl1 r36, defpackage.tk1 r37, defpackage.ek1 r38, defpackage.ll1<?, ?> r39, defpackage.nj1<?> r40, defpackage.jk1 r41) {
        /*
            zk1 r0 = r36.c()
            zk1 r1 = defpackage.zk1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = r
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = s
            java.lang.Object[] r18 = r36.d()
            ok1 r19 = r36.b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = n0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = n0(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = n0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = n0(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            rk1 r0 = new rk1
            ok1 r9 = r36.b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.T(cl1, tk1, ek1, ll1, nj1, jk1):rk1");
    }

    private int U(int i2) {
        return this.a[i2];
    }

    private static long V(int i2) {
        return (long) (i2 & 1048575);
    }

    private static <T> boolean W(T t, long j2) {
        return ((Boolean) pl1.A(t, j2)).booleanValue();
    }

    private static <T> double X(T t, long j2) {
        return ((Double) pl1.A(t, j2)).doubleValue();
    }

    private static <T> float Y(T t, long j2) {
        return ((Float) pl1.A(t, j2)).floatValue();
    }

    private static <T> int Z(T t, long j2) {
        return ((Integer) pl1.A(t, j2)).intValue();
    }

    private static <T> long a0(T t, long j2) {
        return ((Long) pl1.A(t, j2)).longValue();
    }

    private <K, V> int b0(T t, byte[] bArr, int i2, int i3, int i4, long j2, aj1.b bVar) {
        T t2 = t;
        long j3 = j2;
        Unsafe unsafe = s;
        int i5 = i4;
        Object u = u(i4);
        Object object = unsafe.getObject(t, j3);
        if (this.q.g(object)) {
            Object e2 = this.q.e(u);
            this.q.a(e2, object);
            unsafe.putObject(t, j3, e2);
            object = e2;
        }
        return m(bArr, i2, i3, this.q.c(u), this.q.d(object), bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0153, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0164, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c0(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, defpackage.aj1.b r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = s
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0159;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0139;
                case 55: goto L_0x012c;
                case 56: goto L_0x0120;
                case 57: goto L_0x0115;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a3;
                case 62: goto L_0x012c;
                case 63: goto L_0x0074;
                case 64: goto L_0x0115;
                case 65: goto L_0x0120;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x016d
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x016d
            r2 = r2 & -8
            r7 = r2 | 4
            el1 r2 = r0.v(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = defpackage.aj1.n(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x0052
            goto L_0x0145
        L_0x0052:
            java.lang.Object r3 = defpackage.xj1.h(r15, r3)
            goto L_0x0145
        L_0x0058:
            if (r5 != 0) goto L_0x016d
            int r2 = defpackage.aj1.L(r3, r4, r11)
            long r3 = r11.b
            long r3 = defpackage.fj1.c(r3)
            goto L_0x0141
        L_0x0066:
            if (r5 != 0) goto L_0x016d
            int r2 = defpackage.aj1.I(r3, r4, r11)
            int r3 = r11.a
            int r3 = defpackage.fj1.b(r3)
            goto L_0x0134
        L_0x0074:
            if (r5 != 0) goto L_0x016d
            int r3 = defpackage.aj1.I(r3, r4, r11)
            int r4 = r11.a
            xj1$e r5 = r0.t(r6)
            if (r5 == 0) goto L_0x0096
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0096
        L_0x0089:
            ml1 r1 = w(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.n(r2, r4)
            goto L_0x00a0
        L_0x0096:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00a0:
            r2 = r3
            goto L_0x016e
        L_0x00a3:
            if (r5 != r15) goto L_0x016d
            int r2 = defpackage.aj1.b(r3, r4, r11)
            java.lang.Object r3 = r11.c
            goto L_0x0145
        L_0x00ad:
            if (r5 != r15) goto L_0x016d
            el1 r2 = r0.v(r6)
            r5 = r20
            int r2 = defpackage.aj1.p(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00cb
            goto L_0x0145
        L_0x00cb:
            java.lang.Object r3 = defpackage.xj1.h(r15, r3)
            goto L_0x0145
        L_0x00d1:
            if (r5 != r15) goto L_0x016d
            int r2 = defpackage.aj1.I(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00de
            java.lang.String r3 = ""
            goto L_0x0145
        L_0x00de:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f2
            int r5 = r2 + r4
            boolean r5 = defpackage.ql1.n(r3, r2, r5)
            if (r5 == 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            yj1 r1 = defpackage.yj1.c()
            throw r1
        L_0x00f2:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = defpackage.xj1.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0169
        L_0x00ff:
            if (r5 != 0) goto L_0x016d
            int r2 = defpackage.aj1.L(r3, r4, r11)
            long r3 = r11.b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x010f
            r15 = 1
            goto L_0x0110
        L_0x010f:
            r15 = 0
        L_0x0110:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0145
        L_0x0115:
            if (r5 != r7) goto L_0x016d
            int r2 = defpackage.aj1.h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0153
        L_0x0120:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            long r2 = defpackage.aj1.j(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0164
        L_0x012c:
            if (r5 != 0) goto L_0x016d
            int r2 = defpackage.aj1.I(r3, r4, r11)
            int r3 = r11.a
        L_0x0134:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0145
        L_0x0139:
            if (r5 != 0) goto L_0x016d
            int r2 = defpackage.aj1.L(r3, r4, r11)
            long r3 = r11.b
        L_0x0141:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0145:
            r12.putObject(r1, r9, r3)
            goto L_0x0169
        L_0x0149:
            if (r5 != r7) goto L_0x016d
            float r2 = defpackage.aj1.l(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0153:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0169
        L_0x0159:
            r2 = 1
            if (r5 != r2) goto L_0x016d
            double r2 = defpackage.aj1.d(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0164:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0169:
            r12.putInt(r1, r13, r8)
            goto L_0x016e
        L_0x016d:
            r2 = r4
        L_0x016e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.c0(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, aj1$b):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r6 == 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r1 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        if (r6 == 0) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
        r0 = defpackage.aj1.I(r12, r8, r11);
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r0.putLong(r1, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c2, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f0, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020d, code lost:
        if (r0 != r15) goto L_0x0221;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e0(T r28, byte[] r29, int r30, int r31, defpackage.aj1.b r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0013:
            if (r0 >= r13) goto L_0x0234
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0025
            int r0 = defpackage.aj1.H(r0, r12, r3, r11)
            int r3 = r11.a
            r8 = r0
            r17 = r3
            goto L_0x0028
        L_0x0025:
            r17 = r0
            r8 = r3
        L_0x0028:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0035
            int r2 = r2 / 3
            int r0 = r15.h0(r7, r2)
            goto L_0x0039
        L_0x0035:
            int r0 = r15.g0(r7)
        L_0x0039:
            r4 = r0
            if (r4 != r10) goto L_0x0047
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0211
        L_0x0047:
            int[] r0 = r15.a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = s0(r5)
            long r1 = V(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0147
            r0 = 1
            switch(r3) {
                case 0: goto L_0x012e;
                case 1: goto L_0x011f;
                case 2: goto L_0x010d;
                case 3: goto L_0x010d;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00ef;
                case 6: goto L_0x00de;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00b6;
                case 9: goto L_0x009b;
                case 10: goto L_0x008e;
                case 11: goto L_0x00ff;
                case 12: goto L_0x0088;
                case 13: goto L_0x00de;
                case 14: goto L_0x00ef;
                case 15: goto L_0x0078;
                case 16: goto L_0x0060;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0184
        L_0x0060:
            if (r6 != 0) goto L_0x0184
            int r6 = defpackage.aj1.L(r12, r8, r11)
            r19 = r1
            long r0 = r11.b
            long r21 = defpackage.fj1.c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            goto L_0x011a
        L_0x0078:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            int r0 = defpackage.aj1.I(r12, r8, r11)
            int r1 = r11.a
            int r1 = defpackage.fj1.b(r1)
            goto L_0x0109
        L_0x0088:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            goto L_0x0103
        L_0x008e:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            int r0 = defpackage.aj1.b(r12, r8, r11)
        L_0x0095:
            java.lang.Object r1 = r11.c
        L_0x0097:
            r9.putObject(r14, r2, r1)
            goto L_0x00eb
        L_0x009b:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            el1 r0 = r15.v(r4)
            int r0 = defpackage.aj1.p(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00af
            java.lang.Object r1 = r11.c
            goto L_0x0097
        L_0x00af:
            java.lang.Object r5 = r11.c
            java.lang.Object r1 = defpackage.xj1.h(r1, r5)
            goto L_0x0097
        L_0x00b6:
            r2 = r1
            if (r6 != r10) goto L_0x0184
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00c3
            int r0 = defpackage.aj1.C(r12, r8, r11)
            goto L_0x0095
        L_0x00c3:
            int r0 = defpackage.aj1.F(r12, r8, r11)
            goto L_0x0095
        L_0x00c8:
            r2 = r1
            if (r6 != 0) goto L_0x0184
            int r1 = defpackage.aj1.L(r12, r8, r11)
            long r5 = r11.b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            defpackage.pl1.F(r14, r2, r0)
            r0 = r1
            goto L_0x00eb
        L_0x00de:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0184
            int r0 = defpackage.aj1.h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x00eb:
            r2 = r4
            r1 = r7
            goto L_0x0231
        L_0x00ef:
            r2 = r1
            if (r6 != r0) goto L_0x0184
            long r5 = defpackage.aj1.j(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0139
        L_0x00ff:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
        L_0x0103:
            int r0 = defpackage.aj1.I(r12, r8, r11)
            int r1 = r11.a
        L_0x0109:
            r9.putInt(r14, r2, r1)
            goto L_0x013b
        L_0x010d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x013f
            int r6 = defpackage.aj1.L(r12, r8, r11)
            long r4 = r11.b
            r0 = r9
            r1 = r28
        L_0x011a:
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x013b
        L_0x011f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x013f
            float r0 = defpackage.aj1.l(r12, r8)
            defpackage.pl1.M(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x013b
        L_0x012e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x013f
            double r0 = defpackage.aj1.d(r12, r8)
            defpackage.pl1.L(r14, r2, r0)
        L_0x0139:
            int r0 = r8 + 8
        L_0x013b:
            r1 = r7
            r2 = r10
            goto L_0x0231
        L_0x013f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x018b
        L_0x0147:
            r0 = 27
            if (r3 != r0) goto L_0x018f
            if (r6 != r10) goto L_0x0184
            java.lang.Object r0 = r9.getObject(r14, r1)
            xj1$i r0 = (defpackage.xj1.i) r0
            boolean r3 = r0.t0()
            if (r3 != 0) goto L_0x016b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0162
            r3 = 10
            goto L_0x0164
        L_0x0162:
            int r3 = r3 * 2
        L_0x0164:
            xj1$i r0 = r0.w(r3)
            r9.putObject(r14, r1, r0)
        L_0x016b:
            r5 = r0
            el1 r0 = r15.v(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = defpackage.aj1.q(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0231
        L_0x0184:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x018b:
            r26 = -1
            goto L_0x01f3
        L_0x018f:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01c6
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0210
        L_0x01c4:
            goto L_0x0221
        L_0x01c6:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            r7 = r30
            if (r9 != r0) goto L_0x01f5
            if (r7 != r10) goto L_0x01f3
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0210
            goto L_0x01c4
        L_0x01f3:
            r2 = r15
            goto L_0x0211
        L_0x01f5:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0210
            goto L_0x01c4
        L_0x0210:
            r2 = r0
        L_0x0211:
            ml1 r4 = w(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = defpackage.aj1.G(r0, r1, r2, r3, r4, r5)
        L_0x0221:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0231:
            r10 = -1
            goto L_0x0013
        L_0x0234:
            r1 = r13
            if (r0 != r1) goto L_0x0238
            return r0
        L_0x0238:
            yj1 r0 = defpackage.yj1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.e0(java.lang.Object, byte[], int, int, aj1$b):int");
    }

    private int f0(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, aj1.b bVar) {
        int i9;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i6;
        int i12 = i7;
        long j4 = j3;
        aj1.b bVar2 = bVar;
        xj1.i iVar = (xj1.i) s.getObject(t, j4);
        if (!iVar.t0()) {
            int size = iVar.size();
            iVar = iVar.w(size == 0 ? 10 : size * 2);
            s.putObject(t, j4, iVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return aj1.s(bArr, i2, iVar, bVar2);
                }
                if (i11 == 1) {
                    return aj1.e(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return aj1.v(bArr, i2, iVar, bVar2);
                }
                if (i11 == 5) {
                    return aj1.m(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return aj1.z(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return aj1.M(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return aj1.y(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return aj1.J(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return aj1.u(bArr, i2, iVar, bVar2);
                }
                if (i11 == 1) {
                    return aj1.k(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return aj1.t(bArr, i2, iVar, bVar2);
                }
                if (i11 == 5) {
                    return aj1.i(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return aj1.r(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return aj1.a(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    int i13 = ((j2 & 536870912) > 0 ? 1 : ((j2 & 536870912) == 0 ? 0 : -1));
                    byte[] bArr3 = bArr;
                    int i14 = i2;
                    int i15 = i3;
                    xj1.i iVar2 = iVar;
                    aj1.b bVar3 = bVar;
                    return i13 == 0 ? aj1.D(i4, bArr3, i14, i15, iVar2, bVar3) : aj1.E(i4, bArr3, i14, i15, iVar2, bVar3);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return aj1.q(v(i12), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return aj1.c(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    i9 = aj1.y(bArr, i2, iVar, bVar2);
                } else if (i11 == 0) {
                    i9 = aj1.J(i4, bArr, i2, i3, iVar, bVar);
                }
                vj1 vj1 = (vj1) t2;
                ml1 ml1 = vj1.f;
                if (ml1 == ml1.e()) {
                    ml1 = null;
                }
                ml1 ml12 = (ml1) gl1.A(i5, iVar, t(i12), ml1, this.o);
                if (ml12 != null) {
                    vj1.f = ml12;
                }
                return i9;
            case 33:
            case 47:
                if (i11 == 2) {
                    return aj1.w(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return aj1.A(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return aj1.x(bArr, i2, iVar, bVar2);
                }
                if (i11 == 0) {
                    return aj1.B(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return aj1.o(v(i12), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    private int g0(int i2) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return q0(i2, 0);
    }

    private int h0(int i2, int i3) {
        if (i2 < this.c || i2 > this.d) {
            return -1;
        }
        return q0(i2, i3);
    }

    private int i0(int i2) {
        return this.a[i2 + 2];
    }

    private <E> void j0(Object obj, long j2, dl1 dl1, el1<E> el1, mj1 mj1) {
        dl1.f(this.n.e(obj, j2), el1, mj1);
    }

    private boolean k(T t, T t2, int i2) {
        return C(t, i2) == C(t2, i2);
    }

    private <E> void k0(Object obj, int i2, dl1 dl1, el1<E> el1, mj1 mj1) {
        dl1.k(this.n.e(obj, V(i2)), el1, mj1);
    }

    private static <T> boolean l(T t, long j2) {
        return pl1.p(t, j2);
    }

    private void l0(Object obj, int i2, dl1 dl1) {
        long V;
        Object G;
        if (B(i2)) {
            V = V(i2);
            G = dl1.O();
        } else if (this.g) {
            V = V(i2);
            G = dl1.z();
        } else {
            V = V(i2);
            G = dl1.G();
        }
        pl1.P(obj, V, G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int m(byte[] r15, int r16, int r17, defpackage.hk1.a<K, V> r18, java.util.Map<K, V> r19, defpackage.aj1.b r20) {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = defpackage.aj1.I(r15, r0, r10)
            int r1 = r10.a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.b
            V r2 = r9.d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = defpackage.aj1.H(r0, r15, r1, r10)
            int r1 = r10.a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            rl1$b r1 = r9.c
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x006f
            rl1$b r4 = r9.c
            V r0 = r9.d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.c
            goto L_0x001d
        L_0x0057:
            rl1$b r1 = r9.a
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x006f
            rl1$b r4 = r9.a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.c
            goto L_0x001d
        L_0x006f:
            int r0 = defpackage.aj1.N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            yj1 r0 = defpackage.yj1.g()
            throw r0
        L_0x0081:
            yj1 r0 = defpackage.yj1.k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.m(byte[], int, int, hk1$a, java.util.Map, aj1$b):int");
    }

    private void m0(Object obj, int i2, dl1 dl1) {
        if (B(i2)) {
            dl1.F(this.n.e(obj, V(i2)));
        } else {
            dl1.C(this.n.e(obj, V(i2)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r7.c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r7.c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r7.c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n(byte[] r2, int r3, int r4, defpackage.rl1.b r5, java.lang.Class<?> r6, defpackage.aj1.b r7) {
        /*
            r1 = this;
            int[] r0 = defpackage.rk1.a.a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = defpackage.aj1.F(r2, r3, r7)
            goto L_0x0099
        L_0x0019:
            int r2 = defpackage.aj1.L(r2, r3, r7)
            long r3 = r7.b
            long r3 = defpackage.fj1.c(r3)
            goto L_0x0042
        L_0x0024:
            int r2 = defpackage.aj1.I(r2, r3, r7)
            int r3 = r7.a
            int r3 = defpackage.fj1.b(r3)
            goto L_0x004d
        L_0x002f:
            al1 r5 = defpackage.al1.a()
            el1 r5 = r5.d(r6)
            int r2 = defpackage.aj1.p(r5, r2, r3, r4, r7)
            goto L_0x0099
        L_0x003c:
            int r2 = defpackage.aj1.L(r2, r3, r7)
            long r3 = r7.b
        L_0x0042:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0051
        L_0x0047:
            int r2 = defpackage.aj1.I(r2, r3, r7)
            int r3 = r7.a
        L_0x004d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0051:
            r7.c = r3
            goto L_0x0099
        L_0x0054:
            float r2 = defpackage.aj1.l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x006e
        L_0x005d:
            long r4 = defpackage.aj1.j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x007b
        L_0x0066:
            int r2 = defpackage.aj1.h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x006e:
            r7.c = r2
            int r2 = r3 + 4
            goto L_0x0099
        L_0x0073:
            double r4 = defpackage.aj1.d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
        L_0x007b:
            r7.c = r2
            int r2 = r3 + 8
            goto L_0x0099
        L_0x0080:
            int r2 = defpackage.aj1.b(r2, r3, r7)
            goto L_0x0099
        L_0x0085:
            int r2 = defpackage.aj1.L(r2, r3, r7)
            long r3 = r7.b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r3 = 1
            goto L_0x0094
        L_0x0093:
            r3 = 0
        L_0x0094:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0051
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.n(byte[], int, int, rl1$b, java.lang.Class, aj1$b):int");
    }

    private static Field n0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double o(T t, long j2) {
        return pl1.v(t, j2);
    }

    private void o0(T t, int i2) {
        if (!this.h) {
            int i0 = i0(i2);
            long j2 = (long) (i0 & 1048575);
            pl1.N(t, j2, pl1.x(t, j2) | (1 << (i0 >>> 20)));
        }
    }

    private boolean p(T t, T t2, int i2) {
        int t0 = t0(i2);
        long V = V(t0);
        switch (s0(t0)) {
            case 0:
                return k(t, t2, i2) && Double.doubleToLongBits(pl1.v(t, V)) == Double.doubleToLongBits(pl1.v(t2, V));
            case 1:
                return k(t, t2, i2) && Float.floatToIntBits(pl1.w(t, V)) == Float.floatToIntBits(pl1.w(t2, V));
            case 2:
                return k(t, t2, i2) && pl1.y(t, V) == pl1.y(t2, V);
            case 3:
                return k(t, t2, i2) && pl1.y(t, V) == pl1.y(t2, V);
            case 4:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 5:
                return k(t, t2, i2) && pl1.y(t, V) == pl1.y(t2, V);
            case 6:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 7:
                return k(t, t2, i2) && pl1.p(t, V) == pl1.p(t2, V);
            case 8:
                return k(t, t2, i2) && gl1.K(pl1.A(t, V), pl1.A(t2, V));
            case 9:
                return k(t, t2, i2) && gl1.K(pl1.A(t, V), pl1.A(t2, V));
            case 10:
                return k(t, t2, i2) && gl1.K(pl1.A(t, V), pl1.A(t2, V));
            case 11:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 12:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 13:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 14:
                return k(t, t2, i2) && pl1.y(t, V) == pl1.y(t2, V);
            case 15:
                return k(t, t2, i2) && pl1.x(t, V) == pl1.x(t2, V);
            case 16:
                return k(t, t2, i2) && pl1.y(t, V) == pl1.y(t2, V);
            case 17:
                return k(t, t2, i2) && gl1.K(pl1.A(t, V), pl1.A(t2, V));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return gl1.K(pl1.A(t, V), pl1.A(t2, V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return H(t, t2, i2) && gl1.K(pl1.A(t, V), pl1.A(t2, V));
            default:
                return true;
        }
    }

    private void p0(T t, int i2, int i3) {
        pl1.N(t, (long) (i0(i3) & 1048575), i2);
    }

    private final <UT, UB> UB q(Object obj, int i2, UB ub, ll1<UT, UB> ll1) {
        xj1.e t;
        int U = U(i2);
        Object A = pl1.A(obj, V(t0(i2)));
        if (A == null || (t = t(i2)) == null) {
            return ub;
        }
        return r(i2, U, this.q.d(A), t, ub, ll1);
    }

    private int q0(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int U = U(i5);
            if (i2 == U) {
                return i5;
            }
            if (i2 < U) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB r(int i2, int i3, Map<K, V> map, xj1.e eVar, UB ub, ll1<UT, UB> ll1) {
        hk1.a<?, ?> c2 = this.q.c(u(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = ll1.n();
                }
                ej1.g n2 = ej1.n(hk1.b(c2, next.getKey(), next.getValue()));
                try {
                    hk1.d(n2.b(), c2, next.getKey(), next.getValue());
                    ll1.d(ub, i3, n2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void r0(defpackage.qj1 r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            wk1 r0 = r8.l()
            r1 = 0
            if (r0 == 0) goto L_0x0026
            sj1 r11 = r8.r()
            int r11 = r11.id()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.b()
            long r2 = defpackage.pl1.E(r2)
            int r3 = (int) r2
            java.lang.reflect.Field r0 = r0.a()
            long r4 = defpackage.pl1.E(r0)
            int r0 = (int) r4
        L_0x0023:
            r2 = r0
            r0 = 0
            goto L_0x0070
        L_0x0026:
            sj1 r0 = r8.r()
            java.lang.reflect.Field r2 = r8.f()
            long r2 = defpackage.pl1.E(r2)
            int r3 = (int) r2
            int r2 = r0.id()
            if (r11 != 0) goto L_0x005b
            boolean r11 = r0.isList()
            if (r11 != 0) goto L_0x005b
            boolean r11 = r0.isMap()
            if (r11 != 0) goto L_0x005b
            java.lang.reflect.Field r11 = r8.m()
            long r4 = defpackage.pl1.E(r11)
            int r0 = (int) r4
            int r11 = r8.q()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r2
            r2 = r7
            goto L_0x0070
        L_0x005b:
            java.lang.reflect.Field r11 = r8.a()
            if (r11 != 0) goto L_0x0065
            r11 = r2
            r0 = 0
            r2 = 0
            goto L_0x0070
        L_0x0065:
            java.lang.reflect.Field r11 = r8.a()
            long r4 = defpackage.pl1.E(r11)
            int r0 = (int) r4
            r11 = r2
            goto L_0x0023
        L_0x0070:
            int r4 = r8.h()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.s()
            if (r5 == 0) goto L_0x0081
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            boolean r6 = r8.t()
            if (r6 == 0) goto L_0x008a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x008a:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.k()
            java.lang.Object r11 = r8.i()
            if (r11 == 0) goto L_0x00c2
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.i()
            r12[r10] = r11
            if (r9 == 0) goto L_0x00b3
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00df
        L_0x00b3:
            xj1$e r9 = r8.e()
            if (r9 == 0) goto L_0x00df
            int r10 = r10 + 1
            xj1$e r8 = r8.e()
            r12[r10] = r8
            goto L_0x00df
        L_0x00c2:
            if (r9 == 0) goto L_0x00cd
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00df
        L_0x00cd:
            xj1$e r9 = r8.e()
            if (r9 == 0) goto L_0x00df
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            xj1$e r8 = r8.e()
            r12[r10] = r8
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.r0(qj1, int[], int, boolean, java.lang.Object[]):void");
    }

    private static <T> float s(T t, long j2) {
        return pl1.w(t, j2);
    }

    private static int s0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    private xj1.e t(int i2) {
        return (xj1.e) this.b[((i2 / 3) * 2) + 1];
    }

    private int t0(int i2) {
        return this.a[i2 + 1];
    }

    private Object u(int i2) {
        return this.b[(i2 / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u0(T r18, defpackage.sl1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f
            if (r3 == 0) goto L_0x0021
            nj1<?> r3 = r0.p
            rj1 r3 = r3.c(r1)
            boolean r5 = r3.n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.a
            int r7 = r7.length
            sun.misc.Unsafe r8 = s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.t0(r10)
            int r13 = r0.U(r10)
            int r14 = s0(r12)
            boolean r15 = r0.h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            nj1<?> r9 = r0.p
            int r9 = r9.a(r5)
            if (r9 > r13) goto L_0x0081
            nj1<?> r9 = r0.p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = V(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            el1 r5 = r0.v(r10)
            r2.s(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.F(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.N(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.z(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.t(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.J(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.d(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            ej1 r4 = (defpackage.ej1) r4
            r2.v(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            el1 r5 = r0.v(r10)
            r2.j(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.y0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = W(r1, r5)
            r2.r(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.f(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.k(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = Z(r1, r5)
            r2.w(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.o(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = a0(r1, r5)
            r2.q(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = Y(r1, r5)
            r2.G(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.I(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = X(r1, r5)
            r2.g(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.x0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            el1 r6 = r0.v(r10)
            defpackage.gl1.U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            defpackage.gl1.b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            defpackage.gl1.b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            el1 r6 = r0.v(r10)
            defpackage.gl1.X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            defpackage.gl1.N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.U(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            defpackage.gl1.P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            el1 r5 = r0.v(r10)
            r2.s(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.F(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.N(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.z(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.t(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.J(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.d(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            ej1 r4 = (defpackage.ej1) r4
            r2.v(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            el1 r5 = r0.v(r10)
            r2.j(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.y0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = l(r1, r5)
            r2.r(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.f(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.k(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.w(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.o(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.q(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = s(r1, r5)
            r2.G(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = o(r1, r5)
            r2.g(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            nj1<?> r4 = r0.p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            ll1<?, ?> r3 = r0.o
            r0.z0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.u0(java.lang.Object, sl1):void");
    }

    private el1 v(int i2) {
        int i3 = (i2 / 3) * 2;
        el1 el1 = (el1) this.b[i3];
        if (el1 != null) {
            return el1;
        }
        el1 d2 = al1.a().d((Class) this.b[i3 + 1]);
        this.b[i3] = d2;
        return d2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d0, code lost:
        r14.s(r7, defpackage.pl1.A(r13, V(r6)), v(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ef, code lost:
        r14.F(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0402, code lost:
        r14.N(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        r14.z(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0428, code lost:
        r14.t(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043b, code lost:
        r14.J(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044e, code lost:
        r14.d(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0459, code lost:
        r14.v(r7, (defpackage.ej1) defpackage.pl1.A(r13, V(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046e, code lost:
        r14.j(r7, defpackage.pl1.A(r13, V(r6)), v(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        y0(r7, defpackage.pl1.A(r13, V(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a0, code lost:
        r14.r(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b3, code lost:
        r14.f(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c5, code lost:
        r14.k(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r14.w(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e9, code lost:
        r14.o(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04fb, code lost:
        r14.q(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        r14.G(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051f, code lost:
        r14.g(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(T r13, defpackage.sl1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            nj1<?> r0 = r12.p
            rj1 r0 = r0.c(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0526
            int r6 = r12.t0(r5)
            int r7 = r12.U(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            nj1<?> r8 = r12.p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            nj1<?> r8 = r12.p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = s0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04b7;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0492;
                case 8: goto L_0x047f;
                case 9: goto L_0x0468;
                case 10: goto L_0x0453;
                case 11: goto L_0x0440;
                case 12: goto L_0x042d;
                case 13: goto L_0x041a;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f4;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ca;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0391;
                case 21: goto L_0x037e;
                case 22: goto L_0x036b;
                case 23: goto L_0x0358;
                case 24: goto L_0x0345;
                case 25: goto L_0x0332;
                case 26: goto L_0x031f;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e2;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0296;
                case 34: goto L_0x0283;
                case 35: goto L_0x0270;
                case 36: goto L_0x025d;
                case 37: goto L_0x024a;
                case 38: goto L_0x0237;
                case 39: goto L_0x0224;
                case 40: goto L_0x0211;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b2;
                case 46: goto L_0x019f;
                case 47: goto L_0x018c;
                case 48: goto L_0x0179;
                case 49: goto L_0x0162;
                case 50: goto L_0x0155;
                case 51: goto L_0x0145;
                case 52: goto L_0x0135;
                case 53: goto L_0x0125;
                case 54: goto L_0x0115;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00bd;
                case 62: goto L_0x00ad;
                case 63: goto L_0x009d;
                case 64: goto L_0x008d;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0522
        L_0x0055:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x03d0
        L_0x005d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            goto L_0x03ef
        L_0x006d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x0402
        L_0x007d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            goto L_0x0415
        L_0x008d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x0428
        L_0x009d:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x043b
        L_0x00ad:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x044e
        L_0x00bd:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0459
        L_0x00c5:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x046e
        L_0x00cd:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0485
        L_0x00d5:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            boolean r6 = W(r13, r8)
            goto L_0x04a0
        L_0x00e5:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x04b3
        L_0x00f5:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            goto L_0x04c5
        L_0x0105:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = Z(r13, r8)
            goto L_0x04d7
        L_0x0115:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            goto L_0x04e9
        L_0x0125:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = a0(r13, r8)
            goto L_0x04fb
        L_0x0135:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            float r6 = Y(r13, r8)
            goto L_0x050d
        L_0x0145:
            boolean r8 = r12.I(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            double r8 = X(r13, r8)
            goto L_0x051f
        L_0x0155:
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            r12.x0(r14, r7, r6, r5)
            goto L_0x0522
        L_0x0162:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            el1 r8 = r12.v(r5)
            defpackage.gl1.U(r7, r6, r14, r8)
            goto L_0x0522
        L_0x0179:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.b0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x018c:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.a0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x019f:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Z(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01b2:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Y(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01c5:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Q(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01d8:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.d0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01eb:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.N(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01fe:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.R(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0211:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.S(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0224:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.V(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0237:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.e0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x024a:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.W(r7, r6, r14, r9)
            goto L_0x0522
        L_0x025d:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.T(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0270:
            int r7 = r12.U(r5)
            long r10 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.P(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0283:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.b0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0296:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.a0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02a9:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Z(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02bc:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Y(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02cf:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.Q(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02e2:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.d0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02f5:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.O(r7, r6, r14)
            goto L_0x0522
        L_0x0308:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            el1 r8 = r12.v(r5)
            defpackage.gl1.X(r7, r6, r14, r8)
            goto L_0x0522
        L_0x031f:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.c0(r7, r6, r14)
            goto L_0x0522
        L_0x0332:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.N(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0345:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.R(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0358:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.S(r7, r6, r14, r4)
            goto L_0x0522
        L_0x036b:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.V(r7, r6, r14, r4)
            goto L_0x0522
        L_0x037e:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.e0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0391:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.W(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03a4:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.T(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03b7:
            int r7 = r12.U(r5)
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.gl1.P(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03ca:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x03d0:
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            el1 r8 = r12.v(r5)
            r14.s(r7, r6, r8)
            goto L_0x0522
        L_0x03e1:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = L(r13, r8)
        L_0x03ef:
            r14.F(r7, r8)
            goto L_0x0522
        L_0x03f4:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x0402:
            r14.N(r7, r6)
            goto L_0x0522
        L_0x0407:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = L(r13, r8)
        L_0x0415:
            r14.z(r7, r8)
            goto L_0x0522
        L_0x041a:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x0428:
            r14.t(r7, r6)
            goto L_0x0522
        L_0x042d:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x043b:
            r14.J(r7, r6)
            goto L_0x0522
        L_0x0440:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x044e:
            r14.d(r7, r6)
            goto L_0x0522
        L_0x0453:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0459:
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            ej1 r6 = (defpackage.ej1) r6
            r14.v(r7, r6)
            goto L_0x0522
        L_0x0468:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x046e:
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            el1 r8 = r12.v(r5)
            r14.j(r7, r6, r8)
            goto L_0x0522
        L_0x047f:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0485:
            long r8 = V(r6)
            java.lang.Object r6 = defpackage.pl1.A(r13, r8)
            r12.y0(r7, r6, r14)
            goto L_0x0522
        L_0x0492:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            boolean r6 = l(r13, r8)
        L_0x04a0:
            r14.r(r7, r6)
            goto L_0x0522
        L_0x04a5:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x04b3:
            r14.f(r7, r6)
            goto L_0x0522
        L_0x04b7:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = L(r13, r8)
        L_0x04c5:
            r14.k(r7, r8)
            goto L_0x0522
        L_0x04c9:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            int r6 = A(r13, r8)
        L_0x04d7:
            r14.w(r7, r6)
            goto L_0x0522
        L_0x04db:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = L(r13, r8)
        L_0x04e9:
            r14.o(r7, r8)
            goto L_0x0522
        L_0x04ed:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            long r8 = L(r13, r8)
        L_0x04fb:
            r14.q(r7, r8)
            goto L_0x0522
        L_0x04ff:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            float r6 = s(r13, r8)
        L_0x050d:
            r14.G(r7, r6)
            goto L_0x0522
        L_0x0511:
            boolean r8 = r12.C(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = V(r6)
            double r8 = o(r13, r8)
        L_0x051f:
            r14.g(r7, r8)
        L_0x0522:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0526:
            if (r2 == 0) goto L_0x053c
            nj1<?> r3 = r12.p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x053a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0526
        L_0x053a:
            r2 = r1
            goto L_0x0526
        L_0x053c:
            ll1<?, ?> r0 = r12.o
            r12.z0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.v0(java.lang.Object, sl1):void");
    }

    static ml1 w(Object obj) {
        vj1 vj1 = (vj1) obj;
        ml1 ml1 = vj1.f;
        if (ml1 != ml1.e()) {
            return ml1;
        }
        ml1 l2 = ml1.l();
        vj1.f = l2;
        return l2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d6, code lost:
        r12.s(r5, defpackage.pl1.A(r11, V(r4)), v(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f5, code lost:
        r12.F(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        r12.N(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r12.z(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042e, code lost:
        r12.t(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0441, code lost:
        r12.J(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0454, code lost:
        r12.d(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        r12.v(r5, (defpackage.ej1) defpackage.pl1.A(r11, V(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0474, code lost:
        r12.j(r5, defpackage.pl1.A(r11, V(r4)), v(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        y0(r5, defpackage.pl1.A(r11, V(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a6, code lost:
        r12.r(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b9, code lost:
        r12.f(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r12.k(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04dd, code lost:
        r12.w(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        r12.o(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0501, code lost:
        r12.q(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r12.G(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0525, code lost:
        r12.g(r5, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w0(T r11, defpackage.sl1 r12) {
        /*
            r10 = this;
            ll1<?, ?> r0 = r10.o
            r10.z0(r0, r11, r12)
            boolean r0 = r10.f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            nj1<?> r0 = r10.p
            rj1 r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x052c
            int r4 = r10.t0(r3)
            int r5 = r10.U(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            nj1<?> r6 = r10.p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            nj1<?> r6 = r10.p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = s0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cf;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04ab;
                case 7: goto L_0x0498;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x0459;
                case 11: goto L_0x0446;
                case 12: goto L_0x0433;
                case 13: goto L_0x0420;
                case 14: goto L_0x040d;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03bd;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0397;
                case 21: goto L_0x0384;
                case 22: goto L_0x0371;
                case 23: goto L_0x035e;
                case 24: goto L_0x034b;
                case 25: goto L_0x0338;
                case 26: goto L_0x0325;
                case 27: goto L_0x030e;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02e8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02af;
                case 33: goto L_0x029c;
                case 34: goto L_0x0289;
                case 35: goto L_0x0276;
                case 36: goto L_0x0263;
                case 37: goto L_0x0250;
                case 38: goto L_0x023d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0217;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b8;
                case 46: goto L_0x01a5;
                case 47: goto L_0x0192;
                case 48: goto L_0x017f;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014b;
                case 52: goto L_0x013b;
                case 53: goto L_0x012b;
                case 54: goto L_0x011b;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00db;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00cb;
                case 61: goto L_0x00c3;
                case 62: goto L_0x00b3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x0093;
                case 65: goto L_0x0083;
                case 66: goto L_0x0073;
                case 67: goto L_0x0063;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0528
        L_0x005b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x03d6
        L_0x0063:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            goto L_0x03f5
        L_0x0073:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x0408
        L_0x0083:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            goto L_0x041b
        L_0x0093:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x042e
        L_0x00a3:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x0441
        L_0x00b3:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x0454
        L_0x00c3:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x045f
        L_0x00cb:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x0474
        L_0x00d3:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x048b
        L_0x00db:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            boolean r4 = W(r11, r6)
            goto L_0x04a6
        L_0x00eb:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x04b9
        L_0x00fb:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            goto L_0x04cb
        L_0x010b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = Z(r11, r6)
            goto L_0x04dd
        L_0x011b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            goto L_0x04ef
        L_0x012b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = a0(r11, r6)
            goto L_0x0501
        L_0x013b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            float r4 = Y(r11, r6)
            goto L_0x0513
        L_0x014b:
            boolean r6 = r10.I(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            double r6 = X(r11, r6)
            goto L_0x0525
        L_0x015b:
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            r10.x0(r12, r5, r4, r3)
            goto L_0x0528
        L_0x0168:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            el1 r6 = r10.v(r3)
            defpackage.gl1.U(r5, r4, r12, r6)
            goto L_0x0528
        L_0x017f:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.b0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0192:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.a0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01a5:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Z(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01b8:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Y(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01cb:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Q(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01de:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.d0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01f1:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.N(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0204:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.R(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0217:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.S(r5, r4, r12, r7)
            goto L_0x0528
        L_0x022a:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.V(r5, r4, r12, r7)
            goto L_0x0528
        L_0x023d:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.e0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0250:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.W(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0263:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.T(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0276:
            int r5 = r10.U(r3)
            long r8 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r8)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.P(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0289:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.b0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x029c:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.a0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02af:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Z(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02c2:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Y(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02d5:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.Q(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02e8:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.d0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02fb:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.O(r5, r4, r12)
            goto L_0x0528
        L_0x030e:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            el1 r6 = r10.v(r3)
            defpackage.gl1.X(r5, r4, r12, r6)
            goto L_0x0528
        L_0x0325:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.c0(r5, r4, r12)
            goto L_0x0528
        L_0x0338:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.N(r5, r4, r12, r8)
            goto L_0x0528
        L_0x034b:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.R(r5, r4, r12, r8)
            goto L_0x0528
        L_0x035e:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.S(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0371:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.V(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0384:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.e0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0397:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.W(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03aa:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.T(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03bd:
            int r5 = r10.U(r3)
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            java.util.List r4 = (java.util.List) r4
            defpackage.gl1.P(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03d0:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x03d6:
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            el1 r6 = r10.v(r3)
            r12.s(r5, r4, r6)
            goto L_0x0528
        L_0x03e7:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = L(r11, r6)
        L_0x03f5:
            r12.F(r5, r6)
            goto L_0x0528
        L_0x03fa:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x0408:
            r12.N(r5, r4)
            goto L_0x0528
        L_0x040d:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = L(r11, r6)
        L_0x041b:
            r12.z(r5, r6)
            goto L_0x0528
        L_0x0420:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x042e:
            r12.t(r5, r4)
            goto L_0x0528
        L_0x0433:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x0441:
            r12.J(r5, r4)
            goto L_0x0528
        L_0x0446:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x0454:
            r12.d(r5, r4)
            goto L_0x0528
        L_0x0459:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x045f:
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            ej1 r4 = (defpackage.ej1) r4
            r12.v(r5, r4)
            goto L_0x0528
        L_0x046e:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x0474:
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            el1 r6 = r10.v(r3)
            r12.j(r5, r4, r6)
            goto L_0x0528
        L_0x0485:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x048b:
            long r6 = V(r4)
            java.lang.Object r4 = defpackage.pl1.A(r11, r6)
            r10.y0(r5, r4, r12)
            goto L_0x0528
        L_0x0498:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            boolean r4 = l(r11, r6)
        L_0x04a6:
            r12.r(r5, r4)
            goto L_0x0528
        L_0x04ab:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x04b9:
            r12.f(r5, r4)
            goto L_0x0528
        L_0x04bd:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = L(r11, r6)
        L_0x04cb:
            r12.k(r5, r6)
            goto L_0x0528
        L_0x04cf:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            int r4 = A(r11, r6)
        L_0x04dd:
            r12.w(r5, r4)
            goto L_0x0528
        L_0x04e1:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = L(r11, r6)
        L_0x04ef:
            r12.o(r5, r6)
            goto L_0x0528
        L_0x04f3:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            long r6 = L(r11, r6)
        L_0x0501:
            r12.q(r5, r6)
            goto L_0x0528
        L_0x0505:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            float r4 = s(r11, r6)
        L_0x0513:
            r12.G(r5, r4)
            goto L_0x0528
        L_0x0517:
            boolean r6 = r10.C(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = V(r4)
            double r6 = o(r11, r6)
        L_0x0525:
            r12.g(r5, r6)
        L_0x0528:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x052c:
            if (r2 == 0) goto L_0x0543
            nj1<?> r11 = r10.p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0541
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x052c
        L_0x0541:
            r2 = r1
            goto L_0x052c
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.w0(java.lang.Object, sl1):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e0, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f2, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0203, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0214, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0225, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0236, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0247, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0258, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025a, code lost:
        r2.putInt(r1, (long) r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025e, code lost:
        r4 = (defpackage.hj1.U(r9) + defpackage.hj1.W(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030f, code lost:
        if ((r7 & r14) != 0) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0311, code lost:
        r3 = defpackage.hj1.s(r9, (defpackage.ok1) r2.getObject(r1, r12), v(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0328, code lost:
        r3 = defpackage.hj1.Q(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0335, code lost:
        r3 = defpackage.hj1.O(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033c, code lost:
        if ((r7 & r14) != 0) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033e, code lost:
        r3 = defpackage.hj1.M(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0345, code lost:
        if ((r7 & r14) != 0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0347, code lost:
        r4 = defpackage.hj1.K(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034c, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0356, code lost:
        r3 = defpackage.hj1.k(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0363, code lost:
        r3 = defpackage.hj1.V(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036a, code lost:
        if ((r7 & r14) != 0) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x036c, code lost:
        r3 = defpackage.hj1.g(r9, (defpackage.ej1) r2.getObject(r1, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0379, code lost:
        if ((r7 & r14) != 0) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x037b, code lost:
        r3 = defpackage.gl1.o(r9, r2.getObject(r1, r12), v(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a6, code lost:
        if ((r7 & r14) != 0) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a8, code lost:
        r3 = defpackage.hj1.d(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0403, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (I(r1, r9, r5) != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (I(r1, r9, r5) != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (I(r1, r9, r5) != false) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (I(r1, r9, r5) != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b9, code lost:
        if (I(r1, r9, r5) != false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (I(r1, r9, r5) != false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0174, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0186, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0198, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01aa, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bc, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ce, code lost:
        if (r0.i != false) goto L_0x025a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0409
            int r8 = r0.t0(r5)
            int r9 = r0.U(r5)
            int r10 = s0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.i
            if (r11 == 0) goto L_0x0055
            sj1 r11 = defpackage.sj1.DOUBLE_LIST_PACKED
            int r11 = r11.id()
            if (r10 < r11) goto L_0x0055
            sj1 r11 = defpackage.sj1.SINT64_LIST_PACKED
            int r11 = r11.id()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = V(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x03f7;
                case 1: goto L_0x03ed;
                case 2: goto L_0x03df;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03c3;
                case 5: goto L_0x03b9;
                case 6: goto L_0x03af;
                case 7: goto L_0x03a4;
                case 8: goto L_0x0388;
                case 9: goto L_0x0377;
                case 10: goto L_0x0368;
                case 11: goto L_0x035b;
                case 12: goto L_0x034e;
                case 13: goto L_0x0343;
                case 14: goto L_0x033a;
                case 15: goto L_0x032d;
                case 16: goto L_0x0320;
                case 17: goto L_0x030d;
                case 18: goto L_0x02fe;
                case 19: goto L_0x02f2;
                case 20: goto L_0x02e6;
                case 21: goto L_0x02da;
                case 22: goto L_0x02ce;
                case 23: goto L_0x02fe;
                case 24: goto L_0x02f2;
                case 25: goto L_0x02c2;
                case 26: goto L_0x02b7;
                case 27: goto L_0x02a8;
                case 28: goto L_0x029d;
                case 29: goto L_0x0291;
                case 30: goto L_0x0284;
                case 31: goto L_0x02f2;
                case 32: goto L_0x02fe;
                case 33: goto L_0x0277;
                case 34: goto L_0x026a;
                case 35: goto L_0x024a;
                case 36: goto L_0x0239;
                case 37: goto L_0x0228;
                case 38: goto L_0x0217;
                case 39: goto L_0x0206;
                case 40: goto L_0x01f5;
                case 41: goto L_0x01e4;
                case 42: goto L_0x01d2;
                case 43: goto L_0x01c0;
                case 44: goto L_0x01ae;
                case 45: goto L_0x019c;
                case 46: goto L_0x018a;
                case 47: goto L_0x0178;
                case 48: goto L_0x0166;
                case 49: goto L_0x0156;
                case 50: goto L_0x0146;
                case 51: goto L_0x0138;
                case 52: goto L_0x012c;
                case 53: goto L_0x011c;
                case 54: goto L_0x010c;
                case 55: goto L_0x00fc;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e3;
                case 58: goto L_0x00db;
                case 59: goto L_0x00bd;
                case 60: goto L_0x00b5;
                case 61: goto L_0x00ad;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0095;
                case 64: goto L_0x008d;
                case 65: goto L_0x0085;
                case 66: goto L_0x0079;
                case 67: goto L_0x006d;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x030a
        L_0x0065:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0311
        L_0x006d:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = a0(r1, r12)
            goto L_0x0328
        L_0x0079:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = Z(r1, r12)
            goto L_0x0335
        L_0x0085:
            boolean r8 = r0.I(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            goto L_0x033e
        L_0x008d:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x0347
        L_0x0095:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = Z(r1, r12)
            goto L_0x0356
        L_0x00a1:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = Z(r1, r12)
            goto L_0x0363
        L_0x00ad:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x036c
        L_0x00b5:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x037b
        L_0x00bd:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof defpackage.ej1
            if (r4 == 0) goto L_0x00d3
            ej1 r3 = (defpackage.ej1) r3
            int r3 = defpackage.hj1.g(r9, r3)
            goto L_0x0309
        L_0x00d3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = defpackage.hj1.S(r9, r3)
            goto L_0x0309
        L_0x00db:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            goto L_0x03a8
        L_0x00e3:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r4 = defpackage.hj1.m(r9, r3)
            goto L_0x034c
        L_0x00f0:
            boolean r8 = r0.I(r1, r9, r5)
            if (r8 == 0) goto L_0x030a
            int r3 = defpackage.hj1.o(r9, r3)
            goto L_0x0309
        L_0x00fc:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = Z(r1, r12)
            int r3 = defpackage.hj1.v(r9, r3)
            goto L_0x0309
        L_0x010c:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = a0(r1, r12)
            int r3 = defpackage.hj1.X(r9, r3)
            goto L_0x0309
        L_0x011c:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            long r3 = a0(r1, r12)
            int r3 = defpackage.hj1.x(r9, r3)
            goto L_0x0309
        L_0x012c:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            int r3 = defpackage.hj1.q(r9, r8)
            goto L_0x0309
        L_0x0138:
            boolean r3 = r0.I(r1, r9, r5)
            if (r3 == 0) goto L_0x030a
            r3 = 0
            int r3 = defpackage.hj1.i(r9, r3)
            goto L_0x0309
        L_0x0146:
            jk1 r3 = r0.q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.u(r5)
            int r3 = r3.f(r9, r4, r8)
            goto L_0x0309
        L_0x0156:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            el1 r4 = r0.v(r5)
            int r3 = defpackage.gl1.j(r9, r3, r4)
            goto L_0x0309
        L_0x0166:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.t(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0178:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.r(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x018a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x019c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01ae:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.e(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.w(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01d2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.b(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0206:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.l(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0217:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.y(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0228:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.n(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x0239:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.g(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
            goto L_0x025a
        L_0x024a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.i(r3)
            if (r3 <= 0) goto L_0x030a
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x025e
        L_0x025a:
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x025e:
            int r4 = defpackage.hj1.U(r9)
            int r8 = defpackage.hj1.W(r3)
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x034c
        L_0x026a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = defpackage.gl1.s(r9, r3, r4)
            goto L_0x0309
        L_0x0277:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.q(r9, r3, r4)
            goto L_0x0309
        L_0x0284:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.d(r9, r3, r4)
            goto L_0x0309
        L_0x0291:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.v(r9, r3, r4)
            goto L_0x0309
        L_0x029d:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.c(r9, r3)
            goto L_0x0309
        L_0x02a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            el1 r4 = r0.v(r5)
            int r3 = defpackage.gl1.p(r9, r3, r4)
            goto L_0x0309
        L_0x02b7:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.u(r9, r3)
            goto L_0x0309
        L_0x02c2:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = defpackage.gl1.a(r9, r3, r4)
            goto L_0x0309
        L_0x02ce:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.k(r9, r3, r4)
            goto L_0x0309
        L_0x02da:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.x(r9, r3, r4)
            goto L_0x0309
        L_0x02e6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.m(r9, r3, r4)
            goto L_0x0309
        L_0x02f2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.f(r9, r3, r4)
            goto L_0x0309
        L_0x02fe:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.gl1.h(r9, r3, r4)
        L_0x0309:
            int r6 = r6 + r3
        L_0x030a:
            r10 = 0
            goto L_0x0403
        L_0x030d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r12)
            ok1 r3 = (defpackage.ok1) r3
            el1 r4 = r0.v(r5)
            int r3 = defpackage.hj1.s(r9, r3, r4)
            goto L_0x0309
        L_0x0320:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            long r3 = r2.getLong(r1, r12)
        L_0x0328:
            int r3 = defpackage.hj1.Q(r9, r3)
            goto L_0x0309
        L_0x032d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0335:
            int r3 = defpackage.hj1.O(r9, r3)
            goto L_0x0309
        L_0x033a:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x030a
        L_0x033e:
            int r3 = defpackage.hj1.M(r9, r3)
            goto L_0x0309
        L_0x0343:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x0347:
            r3 = 0
            int r4 = defpackage.hj1.K(r9, r3)
        L_0x034c:
            int r6 = r6 + r4
            goto L_0x030a
        L_0x034e:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0356:
            int r3 = defpackage.hj1.k(r9, r3)
            goto L_0x0309
        L_0x035b:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            int r3 = r2.getInt(r1, r12)
        L_0x0363:
            int r3 = defpackage.hj1.V(r9, r3)
            goto L_0x0309
        L_0x0368:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x036c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            ej1 r3 = (defpackage.ej1) r3
            int r3 = defpackage.hj1.g(r9, r3)
            goto L_0x0309
        L_0x0377:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x037b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            el1 r4 = r0.v(r5)
            int r3 = defpackage.gl1.o(r9, r3, r4)
            goto L_0x0309
        L_0x0388:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof defpackage.ej1
            if (r4 == 0) goto L_0x039c
            ej1 r3 = (defpackage.ej1) r3
            int r3 = defpackage.hj1.g(r9, r3)
            goto L_0x0309
        L_0x039c:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = defpackage.hj1.S(r9, r3)
            goto L_0x0309
        L_0x03a4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
        L_0x03a8:
            r3 = 1
            int r3 = defpackage.hj1.d(r9, r3)
            goto L_0x0309
        L_0x03af:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x030a
            r10 = 0
            int r3 = defpackage.hj1.m(r9, r10)
            goto L_0x0402
        L_0x03b9:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0403
            int r3 = defpackage.hj1.o(r9, r3)
            goto L_0x0402
        L_0x03c3:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = r2.getInt(r1, r12)
            int r3 = defpackage.hj1.v(r9, r3)
            goto L_0x0402
        L_0x03d1:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = defpackage.hj1.X(r9, r3)
            goto L_0x0402
        L_0x03df:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            long r3 = r2.getLong(r1, r12)
            int r3 = defpackage.hj1.x(r9, r3)
            goto L_0x0402
        L_0x03ed:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            int r3 = defpackage.hj1.q(r9, r8)
            goto L_0x0402
        L_0x03f7:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0403
            r3 = 0
            int r3 = defpackage.hj1.i(r9, r3)
        L_0x0402:
            int r6 = r6 + r3
        L_0x0403:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x0409:
            ll1<?, ?> r2 = r0.o
            int r2 = r0.z(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x041f
            nj1<?> r2 = r0.p
            rj1 r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x041f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.x(java.lang.Object):int");
    }

    private <K, V> void x0(sl1 sl1, int i2, Object obj, int i3) {
        if (obj != null) {
            sl1.C(i2, this.q.c(u(i3)), this.q.h(obj));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ec, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0210, code lost:
        r2.putInt(r1, (long) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        r6 = (defpackage.hj1.U(r8) + defpackage.hj1.W(r7)) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0299, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r6 = defpackage.hj1.s(r8, (defpackage.ok1) defpackage.pl1.A(r1, r9), v(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bb, code lost:
        r6 = defpackage.hj1.Q(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ca, code lost:
        r6 = defpackage.hj1.O(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d5, code lost:
        r6 = defpackage.hj1.M(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e0, code lost:
        r6 = defpackage.hj1.K(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ef, code lost:
        r6 = defpackage.hj1.k(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fe, code lost:
        r6 = defpackage.hj1.V(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0309, code lost:
        r6 = defpackage.pl1.A(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030d, code lost:
        r6 = defpackage.hj1.g(r8, (defpackage.ej1) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031a, code lost:
        r6 = defpackage.gl1.o(r8, defpackage.pl1.A(r1, r9), v(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        if ((r6 instanceof defpackage.ej1) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x033e, code lost:
        r6 = defpackage.hj1.d(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034a, code lost:
        r6 = defpackage.hj1.m(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0356, code lost:
        r6 = defpackage.hj1.o(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0366, code lost:
        r6 = defpackage.hj1.v(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0376, code lost:
        r6 = defpackage.hj1.X(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0386, code lost:
        r6 = defpackage.hj1.x(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0392, code lost:
        r6 = defpackage.hj1.q(r8, com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x039e, code lost:
        r6 = defpackage.hj1.i(r8, com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a6, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if ((r6 instanceof defpackage.ej1) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r6 = defpackage.hj1.S(r8, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0184, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b9, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        if (r0.i != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int y(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x03aa
            int r6 = r15.t0(r4)
            int r7 = s0(r6)
            int r8 = r15.U(r4)
            long r9 = V(r6)
            sj1 r6 = defpackage.sj1.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r7 < r6) goto L_0x0038
            sj1 r6 = defpackage.sj1.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0398;
                case 1: goto L_0x038c;
                case 2: goto L_0x037c;
                case 3: goto L_0x036c;
                case 4: goto L_0x035c;
                case 5: goto L_0x0350;
                case 6: goto L_0x0344;
                case 7: goto L_0x0338;
                case 8: goto L_0x0328;
                case 9: goto L_0x0314;
                case 10: goto L_0x0303;
                case 11: goto L_0x02f4;
                case 12: goto L_0x02e5;
                case 13: goto L_0x02da;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02b1;
                case 17: goto L_0x029c;
                case 18: goto L_0x0291;
                case 19: goto L_0x0288;
                case 20: goto L_0x027f;
                case 21: goto L_0x0276;
                case 22: goto L_0x026d;
                case 23: goto L_0x0291;
                case 24: goto L_0x0288;
                case 25: goto L_0x0264;
                case 26: goto L_0x025b;
                case 27: goto L_0x024e;
                case 28: goto L_0x0245;
                case 29: goto L_0x023c;
                case 30: goto L_0x0233;
                case 31: goto L_0x0288;
                case 32: goto L_0x0291;
                case 33: goto L_0x022a;
                case 34: goto L_0x0220;
                case 35: goto L_0x0200;
                case 36: goto L_0x01ef;
                case 37: goto L_0x01de;
                case 38: goto L_0x01cd;
                case 39: goto L_0x01bc;
                case 40: goto L_0x01ab;
                case 41: goto L_0x019a;
                case 42: goto L_0x0188;
                case 43: goto L_0x0176;
                case 44: goto L_0x0164;
                case 45: goto L_0x0152;
                case 46: goto L_0x0140;
                case 47: goto L_0x012e;
                case 48: goto L_0x011c;
                case 49: goto L_0x010e;
                case 50: goto L_0x00fe;
                case 51: goto L_0x00f6;
                case 52: goto L_0x00ee;
                case 53: goto L_0x00e2;
                case 54: goto L_0x00d6;
                case 55: goto L_0x00ca;
                case 56: goto L_0x00c2;
                case 57: goto L_0x00ba;
                case 58: goto L_0x00b2;
                case 59: goto L_0x009a;
                case 60: goto L_0x0092;
                case 61: goto L_0x008a;
                case 62: goto L_0x007e;
                case 63: goto L_0x0072;
                case 64: goto L_0x006a;
                case 65: goto L_0x0062;
                case 66: goto L_0x0056;
                case 67: goto L_0x004a;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03a6
        L_0x0042:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02a2
        L_0x004a:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = a0(r1, r9)
            goto L_0x02bb
        L_0x0056:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Z(r1, r9)
            goto L_0x02ca
        L_0x0062:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02d5
        L_0x006a:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02e0
        L_0x0072:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Z(r1, r9)
            goto L_0x02ef
        L_0x007e:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Z(r1, r9)
            goto L_0x02fe
        L_0x008a:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0309
        L_0x0092:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x031a
        L_0x009a:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = defpackage.pl1.A(r1, r9)
            boolean r7 = r6 instanceof defpackage.ej1
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            goto L_0x030d
        L_0x00aa:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = defpackage.hj1.S(r8, r6)
            goto L_0x0299
        L_0x00b2:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x033e
        L_0x00ba:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x034a
        L_0x00c2:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0356
        L_0x00ca:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Z(r1, r9)
            goto L_0x0366
        L_0x00d6:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = a0(r1, r9)
            goto L_0x0376
        L_0x00e2:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = a0(r1, r9)
            goto L_0x0386
        L_0x00ee:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0392
        L_0x00f6:
            boolean r6 = r15.I(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x039e
        L_0x00fe:
            jk1 r6 = r0.q
            java.lang.Object r7 = defpackage.pl1.A(r1, r9)
            java.lang.Object r9 = r15.u(r4)
            int r6 = r6.f(r8, r7, r9)
            goto L_0x0299
        L_0x010e:
            java.util.List r6 = K(r1, r9)
            el1 r7 = r15.v(r4)
            int r6 = defpackage.gl1.j(r8, r6, r7)
            goto L_0x0299
        L_0x011c:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.t(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x012e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.r(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0140:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0152:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0164:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.e(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0176:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.w(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0188:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.b(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x019a:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ab:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.l(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01cd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.y(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01de:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.n(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ef:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0200:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = defpackage.gl1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x0214
        L_0x0210:
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0214:
            int r6 = defpackage.hj1.U(r8)
            int r8 = defpackage.hj1.W(r7)
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0299
        L_0x0220:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.s(r8, r6, r3)
            goto L_0x0299
        L_0x022a:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.q(r8, r6, r3)
            goto L_0x0299
        L_0x0233:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.d(r8, r6, r3)
            goto L_0x0299
        L_0x023c:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.v(r8, r6, r3)
            goto L_0x0299
        L_0x0245:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.c(r8, r6)
            goto L_0x0299
        L_0x024e:
            java.util.List r6 = K(r1, r9)
            el1 r7 = r15.v(r4)
            int r6 = defpackage.gl1.p(r8, r6, r7)
            goto L_0x0299
        L_0x025b:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.u(r8, r6)
            goto L_0x0299
        L_0x0264:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.a(r8, r6, r3)
            goto L_0x0299
        L_0x026d:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.k(r8, r6, r3)
            goto L_0x0299
        L_0x0276:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.x(r8, r6, r3)
            goto L_0x0299
        L_0x027f:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.m(r8, r6, r3)
            goto L_0x0299
        L_0x0288:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.f(r8, r6, r3)
            goto L_0x0299
        L_0x0291:
            java.util.List r6 = K(r1, r9)
            int r6 = defpackage.gl1.h(r8, r6, r3)
        L_0x0299:
            int r5 = r5 + r6
            goto L_0x03a6
        L_0x029c:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02a2:
            java.lang.Object r6 = defpackage.pl1.A(r1, r9)
            ok1 r6 = (defpackage.ok1) r6
            el1 r7 = r15.v(r4)
            int r6 = defpackage.hj1.s(r8, r6, r7)
            goto L_0x0299
        L_0x02b1:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = defpackage.pl1.y(r1, r9)
        L_0x02bb:
            int r6 = defpackage.hj1.Q(r8, r6)
            goto L_0x0299
        L_0x02c0:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = defpackage.pl1.x(r1, r9)
        L_0x02ca:
            int r6 = defpackage.hj1.O(r8, r6)
            goto L_0x0299
        L_0x02cf:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02d5:
            int r6 = defpackage.hj1.M(r8, r13)
            goto L_0x0299
        L_0x02da:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02e0:
            int r6 = defpackage.hj1.K(r8, r3)
            goto L_0x0299
        L_0x02e5:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = defpackage.pl1.x(r1, r9)
        L_0x02ef:
            int r6 = defpackage.hj1.k(r8, r6)
            goto L_0x0299
        L_0x02f4:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = defpackage.pl1.x(r1, r9)
        L_0x02fe:
            int r6 = defpackage.hj1.V(r8, r6)
            goto L_0x0299
        L_0x0303:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0309:
            java.lang.Object r6 = defpackage.pl1.A(r1, r9)
        L_0x030d:
            ej1 r6 = (defpackage.ej1) r6
            int r6 = defpackage.hj1.g(r8, r6)
            goto L_0x0299
        L_0x0314:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x031a:
            java.lang.Object r6 = defpackage.pl1.A(r1, r9)
            el1 r7 = r15.v(r4)
            int r6 = defpackage.gl1.o(r8, r6, r7)
            goto L_0x0299
        L_0x0328:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = defpackage.pl1.A(r1, r9)
            boolean r7 = r6 instanceof defpackage.ej1
            if (r7 == 0) goto L_0x00aa
            goto L_0x00a8
        L_0x0338:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x033e:
            int r6 = defpackage.hj1.d(r8, r11)
            goto L_0x0299
        L_0x0344:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x034a:
            int r6 = defpackage.hj1.m(r8, r3)
            goto L_0x0299
        L_0x0350:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0356:
            int r6 = defpackage.hj1.o(r8, r13)
            goto L_0x0299
        L_0x035c:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = defpackage.pl1.x(r1, r9)
        L_0x0366:
            int r6 = defpackage.hj1.v(r8, r6)
            goto L_0x0299
        L_0x036c:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = defpackage.pl1.y(r1, r9)
        L_0x0376:
            int r6 = defpackage.hj1.X(r8, r6)
            goto L_0x0299
        L_0x037c:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = defpackage.pl1.y(r1, r9)
        L_0x0386:
            int r6 = defpackage.hj1.x(r8, r6)
            goto L_0x0299
        L_0x038c:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0392:
            int r6 = defpackage.hj1.q(r8, r12)
            goto L_0x0299
        L_0x0398:
            boolean r6 = r15.C(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x039e:
            r6 = 0
            int r6 = defpackage.hj1.i(r8, r6)
            goto L_0x0299
        L_0x03a6:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x03aa:
            ll1<?, ?> r2 = r0.o
            int r1 = r15.z(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.y(java.lang.Object):int");
    }

    private void y0(int i2, Object obj, sl1 sl1) {
        if (obj instanceof String) {
            sl1.n(i2, (String) obj);
        } else {
            sl1.v(i2, (ej1) obj);
        }
    }

    private <UT, UB> int z(ll1<UT, UB> ll1, T t) {
        return ll1.h(ll1.g(t));
    }

    private <UT, UB> void z0(ll1<UT, UB> ll1, T t, sl1 sl1) {
        ll1.t(ll1.g(t), sl1);
    }

    public void a(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.a.length; i2 += 3) {
                Q(t, t2, i2);
            }
            gl1.G(this.o, t, t2);
            if (this.f) {
                gl1.E(this.p, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    public boolean b(T t, T t2) {
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!p(t, t2, i2)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = defpackage.pl1.A(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = Z(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r2 = r2 * 53;
        r3 = a0(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = r2 * 53;
        r3 = defpackage.pl1.A(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) defpackage.pl1.A(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = defpackage.xj1.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = defpackage.xj1.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.t0(r1)
            int r4 = r8.U(r1)
            long r5 = V(r3)
            int r3 = s0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00cf;
                case 21: goto L_0x00cf;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00cf;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00cf;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00cf;
                case 30: goto L_0x00cf;
                case 31: goto L_0x00cf;
                case 32: goto L_0x00cf;
                case 33: goto L_0x00cf;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00cf;
                case 36: goto L_0x00cf;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00cf;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00cf;
                case 43: goto L_0x00cf;
                case 44: goto L_0x00cf;
                case 45: goto L_0x00cf;
                case 46: goto L_0x00cf;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00cf;
                case 49: goto L_0x00cf;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00bb;
                case 52: goto L_0x00ae;
                case 53: goto L_0x00a0;
                case 54: goto L_0x0099;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0128
        L_0x001e:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x002d:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0034:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x003c:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0043:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0049:
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00cf
        L_0x0059:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x005f:
            java.lang.Object r3 = defpackage.pl1.A(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d5
        L_0x0067:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00e8
        L_0x006f:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = W(r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x008b:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0091:
            int r2 = r2 * 53
            int r3 = Z(r9, r5)
            goto L_0x0127
        L_0x0099:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x00a6:
            int r2 = r2 * 53
            long r3 = a0(r9, r5)
            goto L_0x0123
        L_0x00ae:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = Y(r9, r5)
            goto L_0x0114
        L_0x00bb:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = X(r9, r5)
            goto L_0x011f
        L_0x00c8:
            java.lang.Object r3 = defpackage.pl1.A(r9, r5)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e0
        L_0x00cf:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.pl1.A(r9, r5)
        L_0x00d5:
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00da:
            java.lang.Object r3 = defpackage.pl1.A(r9, r5)
            if (r3 == 0) goto L_0x00e4
        L_0x00e0:
            int r7 = r3.hashCode()
        L_0x00e4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00e8:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.pl1.A(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = defpackage.pl1.p(r9, r5)
        L_0x00fb:
            int r3 = defpackage.xj1.c(r3)
            goto L_0x0127
        L_0x0100:
            int r2 = r2 * 53
            int r3 = defpackage.pl1.x(r9, r5)
            goto L_0x0127
        L_0x0107:
            int r2 = r2 * 53
            long r3 = defpackage.pl1.y(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = defpackage.pl1.w(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0127
        L_0x0119:
            int r2 = r2 * 53
            double r3 = defpackage.pl1.v(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = defpackage.xj1.f(r3)
        L_0x0127:
            int r2 = r2 + r3
        L_0x0128:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            ll1<?, ?> r0 = r8.o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            nj1<?> r0 = r8.p
            rj1 r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.c(java.lang.Object):int");
    }

    public void d(T t, sl1 sl1) {
        if (sl1.l() == sl1.a.DESCENDING) {
            w0(t, sl1);
        } else if (this.h) {
            v0(t, sl1);
        } else {
            u0(t, sl1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x032c, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0375, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0396, code lost:
        if (r0 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0399, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        r12 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e2, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020a, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0221, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023a, code lost:
        r10.putLong(r30, r2, r4);
        r6 = r6 | r20;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r1 = r17;
        r13 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0249, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027b, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027d, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027f, code lost:
        r11 = r34;
        r2 = r8;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0287, code lost:
        r0 = r34;
        r22 = r6;
        r19 = r7;
        r20 = r8;
        r28 = r10;
        r2 = r11;
        r8 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d0(T r30, byte[] r31, int r32, int r33, int r34, defpackage.aj1.b r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = s
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x03f2
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = defpackage.aj1.H(r0, r12, r3, r9)
            int r3 = r9.a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.h0(r3, r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.g0(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004e
            r17 = r3
            r2 = r4
            r8 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r0 = r11
            r20 = 0
            goto L_0x039e
        L_0x004e:
            int[] r1 = r15.a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = s0(r1)
            long r11 = V(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x0295
            int[] r5 = r15.a
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r22
            if (r5 == r7) goto L_0x0086
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x007f
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x007f:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x0089
        L_0x0086:
            r17 = r2
            r13 = -1
        L_0x0089:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0265;
                case 1: goto L_0x024d;
                case 2: goto L_0x0226;
                case 3: goto L_0x0226;
                case 4: goto L_0x020d;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a8;
                case 8: goto L_0x0183;
                case 9: goto L_0x0153;
                case 10: goto L_0x0137;
                case 11: goto L_0x020d;
                case 12: goto L_0x010a;
                case 13: goto L_0x01ca;
                case 14: goto L_0x01eb;
                case 15: goto L_0x00f3;
                case 16: goto L_0x00d9;
                case 17: goto L_0x009a;
                default: goto L_0x008d;
            }
        L_0x008d:
            r12 = r31
            r11 = r4
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            goto L_0x0287
        L_0x009a:
            r2 = 3
            if (r0 != r2) goto L_0x00d2
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            el1 r0 = r15.v(r2)
            r1 = r31
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r33
            r4 = r5
            r13 = r18
            r5 = r35
            int r0 = defpackage.aj1.n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00bf
            java.lang.Object r1 = r9.c
            goto L_0x00c9
        L_0x00bf:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.c
            java.lang.Object r1 = defpackage.xj1.h(r1, r2)
        L_0x00c9:
            r10.putObject(r14, r11, r1)
            r6 = r6 | r20
            r12 = r31
            goto L_0x027f
        L_0x00d2:
            r8 = r17
            r13 = r18
            r17 = r3
            goto L_0x00f0
        L_0x00d9:
            r8 = r17
            r13 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00f0
            r2 = r11
            r12 = r31
            int r11 = defpackage.aj1.L(r12, r4, r9)
            long r0 = r9.b
            long r4 = defpackage.fj1.c(r0)
            goto L_0x023a
        L_0x00f0:
            r12 = r31
            goto L_0x014e
        L_0x00f3:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x014e
            int r0 = defpackage.aj1.I(r12, r4, r9)
            int r1 = r9.a
            int r1 = defpackage.fj1.b(r1)
            goto L_0x0221
        L_0x010a:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != 0) goto L_0x014e
            int r0 = defpackage.aj1.I(r12, r4, r9)
            int r1 = r9.a
            xj1$e r4 = r15.t(r8)
            if (r4 == 0) goto L_0x0221
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x0129
            goto L_0x0221
        L_0x0129:
            ml1 r2 = w(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.n(r13, r1)
            goto L_0x027f
        L_0x0137:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x014e
            int r0 = defpackage.aj1.b(r12, r4, r9)
            java.lang.Object r1 = r9.c
            r10.putObject(r14, r2, r1)
            goto L_0x027d
        L_0x014e:
            r11 = r4
            r18 = -1
            goto L_0x0287
        L_0x0153:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r31
            if (r0 != r1) goto L_0x017d
            el1 r0 = r15.v(r8)
            r11 = r33
            r18 = -1
            int r0 = defpackage.aj1.p(r0, r12, r4, r11, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x0172
            java.lang.Object r1 = r9.c
            goto L_0x01a4
        L_0x0172:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.c
            java.lang.Object r1 = defpackage.xj1.h(r1, r4)
            goto L_0x01a4
        L_0x017d:
            r11 = r33
            r18 = -1
            goto L_0x020a
        L_0x0183:
            r8 = r17
            r13 = r18
            r1 = 2
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x019e
            int r0 = defpackage.aj1.C(r12, r4, r9)
            goto L_0x01a2
        L_0x019e:
            int r0 = defpackage.aj1.F(r12, r4, r9)
        L_0x01a2:
            java.lang.Object r1 = r9.c
        L_0x01a4:
            r10.putObject(r14, r2, r1)
            goto L_0x01e2
        L_0x01a8:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != 0) goto L_0x020a
            int r0 = defpackage.aj1.L(r12, r4, r9)
            long r4 = r9.b
            r23 = 0
            int r1 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x01c5
            r1 = 1
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            defpackage.pl1.F(r14, r2, r1)
            goto L_0x01e2
        L_0x01ca:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            int r0 = defpackage.aj1.h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x01e2:
            r6 = r6 | r20
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            goto L_0x0249
        L_0x01eb:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r33
            if (r0 != r1) goto L_0x020a
            long r21 = defpackage.aj1.j(r12, r4)
            r0 = r10
            r1 = r30
            r11 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x027b
        L_0x020a:
            r11 = r4
            goto L_0x0287
        L_0x020d:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x0287
            int r0 = defpackage.aj1.I(r12, r11, r9)
            int r1 = r9.a
        L_0x0221:
            r10.putInt(r14, r2, r1)
            goto L_0x027d
        L_0x0226:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != 0) goto L_0x0287
            int r11 = defpackage.aj1.L(r12, r11, r9)
            long r4 = r9.b
        L_0x023a:
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r2 = r8
            r0 = r11
            r3 = r13
            r1 = r17
            r13 = r33
        L_0x0249:
            r11 = r34
            goto L_0x0017
        L_0x024d:
            r8 = r17
            r13 = r18
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x0287
            float r0 = defpackage.aj1.l(r12, r11)
            defpackage.pl1.M(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x027d
        L_0x0265:
            r8 = r17
            r13 = r18
            r1 = 1
            r18 = -1
            r17 = r3
            r2 = r11
            r12 = r31
            r11 = r4
            if (r0 != r1) goto L_0x0287
            double r0 = defpackage.aj1.d(r12, r11)
            defpackage.pl1.L(r14, r2, r0)
        L_0x027b:
            int r0 = r11 + 8
        L_0x027d:
            r6 = r6 | r20
        L_0x027f:
            r11 = r34
            r2 = r8
            r3 = r13
            r1 = r17
            goto L_0x02e4
        L_0x0287:
            r0 = r34
            r22 = r6
            r19 = r7
            r20 = r8
            r28 = r10
            r2 = r11
            r8 = r13
            goto L_0x039e
        L_0x0295:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r18
            r18 = -1
            r12 = r31
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x02f5
            r1 = 2
            if (r0 != r1) goto L_0x02e8
            java.lang.Object r0 = r10.getObject(r14, r2)
            xj1$i r0 = (defpackage.xj1.i) r0
            boolean r1 = r0.t0()
            if (r1 != 0) goto L_0x02c5
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02bc
            r1 = 10
            goto L_0x02be
        L_0x02bc:
            int r1 = r1 * 2
        L_0x02be:
            xj1$i r0 = r0.w(r1)
            r10.putObject(r14, r2, r0)
        L_0x02c5:
            r8 = r0
            el1 r0 = r15.v(r5)
            r1 = r13
            r2 = r31
            r3 = r11
            r4 = r33
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r35
            int r0 = defpackage.aj1.q(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r3 = r13
            r1 = r17
            r2 = r20
            r6 = r22
        L_0x02e4:
            r13 = r33
            goto L_0x0017
        L_0x02e8:
            r20 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r15 = r11
            r18 = r13
            goto L_0x0378
        L_0x02f5:
            r20 = r5
            r22 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0348
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r11
            r32 = r4
            r4 = r33
            r25 = r5
            r5 = r13
            r6 = r17
            r19 = r7
            r7 = r32
            r27 = r8
            r8 = r20
            r28 = r10
            r9 = r25
            r15 = r11
            r11 = r27
            r18 = r13
            r12 = r23
            r14 = r35
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0399
        L_0x032e:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r17
            r3 = r18
            r7 = r19
            r2 = r20
            r6 = r22
        L_0x0344:
            r10 = r28
            goto L_0x0017
        L_0x0348:
            r32 = r0
            r23 = r2
            r27 = r8
            r28 = r10
            r15 = r11
            r18 = r13
            r1 = r19
            r19 = r7
            r0 = 50
            r9 = r27
            r7 = r32
            if (r9 != r0) goto L_0x037e
            r0 = 2
            if (r7 != r0) goto L_0x0378
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r20
            r6 = r23
            r8 = r35
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0399
            goto L_0x032e
        L_0x0378:
            r0 = r34
            r2 = r15
            r8 = r18
            goto L_0x039e
        L_0x037e:
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r17
            r10 = r23
            r12 = r20
            r13 = r35
            int r0 = r0.c0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0399
            goto L_0x032e
        L_0x0399:
            r2 = r0
            r8 = r18
            r0 = r34
        L_0x039e:
            if (r8 != r0) goto L_0x03ac
            if (r0 == 0) goto L_0x03ac
            r9 = r29
            r10 = r0
            r0 = r2
            r3 = r8
            r7 = r19
            r6 = r22
            goto L_0x03fa
        L_0x03ac:
            r9 = r29
            r10 = r0
            boolean r0 = r9.f
            r11 = r35
            if (r0 == 0) goto L_0x03cf
            mj1 r0 = r11.d
            mj1 r1 = defpackage.mj1.b()
            if (r0 == r1) goto L_0x03cf
            ok1 r5 = r9.e
            ll1<?, ?> r6 = r9.o
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r7 = r35
            int r0 = defpackage.aj1.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03de
        L_0x03cf:
            ml1 r4 = w(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = defpackage.aj1.G(r0, r1, r2, r3, r4, r5)
        L_0x03de:
            r14 = r30
            r12 = r31
            r13 = r33
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r7 = r19
            r2 = r20
            r6 = r22
            r11 = r10
            goto L_0x0344
        L_0x03f2:
            r22 = r6
            r19 = r7
            r28 = r10
            r10 = r11
            r9 = r15
        L_0x03fa:
            r1 = -1
            if (r7 == r1) goto L_0x0406
            long r1 = (long) r7
            r4 = r30
            r5 = r28
            r5.putInt(r4, r1, r6)
            goto L_0x0408
        L_0x0406:
            r4 = r30
        L_0x0408:
            r1 = 0
            int r2 = r9.k
        L_0x040b:
            int r5 = r9.l
            if (r2 >= r5) goto L_0x041e
            int[] r5 = r9.j
            r5 = r5[r2]
            ll1<?, ?> r6 = r9.o
            java.lang.Object r1 = r9.q(r4, r5, r1, r6)
            ml1 r1 = (defpackage.ml1) r1
            int r2 = r2 + 1
            goto L_0x040b
        L_0x041e:
            if (r1 == 0) goto L_0x0425
            ll1<?, ?> r2 = r9.o
            r2.o(r4, r1)
        L_0x0425:
            r1 = r33
            if (r10 != 0) goto L_0x0431
            if (r0 != r1) goto L_0x042c
            goto L_0x0435
        L_0x042c:
            yj1 r0 = defpackage.yj1.g()
            throw r0
        L_0x0431:
            if (r0 > r1) goto L_0x0436
            if (r3 != r10) goto L_0x0436
        L_0x0435:
            return r0
        L_0x0436:
            yj1 r0 = defpackage.yj1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.d0(java.lang.Object, byte[], int, int, int, aj1$b):int");
    }

    public void e(T t) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long V = V(t0(this.j[i3]));
            Object A = pl1.A(t, V);
            if (A != null) {
                pl1.P(t, V, this.q.b(A));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.c(t, (long) this.j[i2]);
            i2++;
        }
        this.o.j(t);
        if (this.f) {
            this.p.f(t);
        }
    }

    public final boolean f(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.k; i5++) {
            int i6 = this.j[i5];
            int U = U(i6);
            int t0 = t0(i6);
            if (!this.h) {
                int i7 = this.a[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = s.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i2 = 0;
            }
            if (J(t0) && !D(t, i6, i4, i2)) {
                return false;
            }
            int s0 = s0(t0);
            if (s0 != 9 && s0 != 17) {
                if (s0 != 27) {
                    if (s0 == 60 || s0 == 68) {
                        if (I(t, U, i6) && !E(t, t0, v(i6))) {
                            return false;
                        }
                    } else if (s0 != 49) {
                        if (s0 == 50 && !G(t, t0, i6)) {
                            return false;
                        }
                    }
                }
                if (!F(t, t0, i6)) {
                    return false;
                }
            } else if (D(t, i6, i4, i2) && !E(t, t0, v(i6))) {
                return false;
            }
        }
        return !this.f || this.p.c(t).p();
    }

    public void g(T t, dl1 dl1, mj1 mj1) {
        if (mj1 != null) {
            M(this.o, this.p, t, dl1, mj1);
            return;
        }
        throw null;
    }

    public void h(T t, byte[] bArr, int i2, int i3, aj1.b bVar) {
        if (this.h) {
            e0(t, bArr, i2, i3, bVar);
        } else {
            d0(t, bArr, i2, i3, 0, bVar);
        }
    }

    public int i(T t) {
        return this.h ? y(t) : x(t);
    }

    public T j() {
        return this.m.a(this.e);
    }
}
