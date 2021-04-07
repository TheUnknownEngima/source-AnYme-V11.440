package defpackage;

import defpackage.ak1;
import defpackage.ok1;
import defpackage.rj1.b;
import defpackage.rl1;
import defpackage.xj1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: rj1  reason: default package */
final class rj1<T extends b<T>> {
    private static final rj1 d = new rj1(true);
    private final hl1<T, Object> a;
    private boolean b;
    private boolean c;

    /* renamed from: rj1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                rl1$b[] r0 = defpackage.rl1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                rl1$b r2 = defpackage.rl1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                rl1$b r3 = defpackage.rl1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                rl1$b r4 = defpackage.rl1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                rl1$b r5 = defpackage.rl1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                rl1$b r6 = defpackage.rl1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = b     // Catch:{ NoSuchFieldError -> 0x0049 }
                rl1$b r7 = defpackage.rl1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = b     // Catch:{ NoSuchFieldError -> 0x0054 }
                rl1$b r8 = defpackage.rl1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = b     // Catch:{ NoSuchFieldError -> 0x0060 }
                rl1$b r9 = defpackage.rl1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x006c }
                rl1$b r10 = defpackage.rl1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0078 }
                rl1$b r10 = defpackage.rl1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0084 }
                rl1$b r10 = defpackage.rl1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x0090 }
                rl1$b r10 = defpackage.rl1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x009c }
                rl1$b r10 = defpackage.rl1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                rl1$b r10 = defpackage.rl1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                rl1$b r10 = defpackage.rl1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                rl1$b r10 = defpackage.rl1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00cc }
                rl1$b r10 = defpackage.rl1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                rl1$b r10 = defpackage.rl1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                rl1$c[] r9 = defpackage.rl1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                a = r9
                rl1$c r10 = defpackage.rl1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                rl1$c r9 = defpackage.rl1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00fd }
                rl1$c r1 = defpackage.rl1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0107 }
                rl1$c r1 = defpackage.rl1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0111 }
                rl1$c r1 = defpackage.rl1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x011b }
                rl1$c r1 = defpackage.rl1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0125 }
                rl1$c r1 = defpackage.rl1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x012f }
                rl1$c r1 = defpackage.rl1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0139 }
                rl1$c r1 = defpackage.rl1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rj1.a.<clinit>():void");
        }
    }

    /* renamed from: rj1$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        ok1.a D(ok1.a aVar, ok1 ok1);

        boolean isPacked();

        int j();

        rl1.c o0();

        boolean p();

        rl1.b u();
    }

    private rj1() {
        this.a = hl1.q(16);
    }

    private rj1(hl1<T, Object> hl1) {
        this.a = hl1;
        t();
    }

    private rj1(boolean z) {
        this(hl1.q(0));
        t();
    }

    static void A(hj1 hj1, rl1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                hj1.o0(((Double) obj).doubleValue());
                return;
            case 2:
                hj1.w0(((Float) obj).floatValue());
                return;
            case 3:
                hj1.E0(((Long) obj).longValue());
                return;
            case 4:
                hj1.X0(((Long) obj).longValue());
                return;
            case 5:
                hj1.C0(((Integer) obj).intValue());
                return;
            case 6:
                hj1.u0(((Long) obj).longValue());
                return;
            case 7:
                hj1.s0(((Integer) obj).intValue());
                return;
            case 8:
                hj1.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                hj1.z0((ok1) obj);
                return;
            case 10:
                hj1.G0((ok1) obj);
                return;
            case 11:
                if (!(obj instanceof ej1)) {
                    hj1.S0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof ej1)) {
                    hj1.j0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                hj1.V0(((Integer) obj).intValue());
                return;
            case 14:
                hj1.K0(((Integer) obj).intValue());
                return;
            case 15:
                hj1.M0(((Long) obj).longValue());
                return;
            case 16:
                hj1.O0(((Integer) obj).intValue());
                return;
            case 17:
                hj1.Q0(((Long) obj).longValue());
                return;
            case 18:
                hj1.q0(obj instanceof xj1.c ? ((xj1.c) obj).j() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        hj1.m0((ej1) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(rl1.b bVar, int i, Object obj) {
        int U = hj1.U(i);
        if (bVar == rl1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(rl1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return hj1.j(((Double) obj).doubleValue());
            case 2:
                return hj1.r(((Float) obj).floatValue());
            case 3:
                return hj1.y(((Long) obj).longValue());
            case 4:
                return hj1.Y(((Long) obj).longValue());
            case 5:
                return hj1.w(((Integer) obj).intValue());
            case 6:
                return hj1.p(((Long) obj).longValue());
            case 7:
                return hj1.n(((Integer) obj).intValue());
            case 8:
                return hj1.e(((Boolean) obj).booleanValue());
            case 9:
                return hj1.t((ok1) obj);
            case 10:
                return obj instanceof ak1 ? hj1.B((ak1) obj) : hj1.G((ok1) obj);
            case 11:
                return obj instanceof ej1 ? hj1.h((ej1) obj) : hj1.T((String) obj);
            case 12:
                return obj instanceof ej1 ? hj1.h((ej1) obj) : hj1.f((byte[]) obj);
            case 13:
                return hj1.W(((Integer) obj).intValue());
            case 14:
                return hj1.L(((Integer) obj).intValue());
            case 15:
                return hj1.N(((Long) obj).longValue());
            case 16:
                return hj1.P(((Integer) obj).intValue());
            case 17:
                return hj1.R(((Long) obj).longValue());
            case 18:
                return obj instanceof xj1.c ? hj1.l(((xj1.c) obj).j()) : hj1.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        rl1.b u = bVar.u();
        int j = bVar.j();
        if (!bVar.p()) {
            return d(u, j, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (bVar.isPacked()) {
            for (Object e : list) {
                i += e(u, e);
            }
            return hj1.U(j) + i + hj1.J(i);
        }
        for (Object d2 : list) {
            i += d(u, j, d2);
        }
        return i;
    }

    public static <T extends b<T>> rj1<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.o0() != rl1.c.MESSAGE || bVar.p() || bVar.isPacked()) {
            return f(bVar, value);
        }
        boolean z = value instanceof ak1;
        int j = ((b) entry.getKey()).j();
        return z ? hj1.z(j, (ak1) value) : hj1.D(j, (ok1) value);
    }

    static int m(rl1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.o0() == rl1.c.MESSAGE) {
            boolean p = bVar.p();
            Object value = entry.getValue();
            if (p) {
                for (ok1 b2 : (List) value) {
                    if (!b2.b()) {
                        return false;
                    }
                }
            } else if (value instanceof ok1) {
                if (!((ok1) value).b()) {
                    return false;
                }
            } else if (value instanceof ak1) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static boolean r(rl1.b bVar, Object obj) {
        xj1.a(obj);
        switch (a.a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ej1) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof xj1.c);
            case 9:
                return (obj instanceof ok1) || (obj instanceof ak1);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        Object obj;
        hl1<T, Object> hl1;
        Object i;
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ak1) {
            value = ((ak1) value).f();
        }
        if (bVar.p()) {
            Object i2 = i(bVar);
            if (i2 == null) {
                i2 = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) i2).add(c(c2));
            }
            this.a.put(bVar, i2);
            return;
        }
        if (bVar.o0() != rl1.c.MESSAGE || (i = i(bVar)) == null) {
            hl1 = this.a;
            obj = c(value);
        } else {
            obj = bVar.D(((ok1) i).d(), (ok1) value).a();
            hl1 = this.a;
        }
        hl1.put(bVar, obj);
    }

    public static <T extends b<T>> rj1<T> w() {
        return new rj1<>();
    }

    private void y(rl1.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(hj1 hj1, rl1.b bVar, int i, Object obj) {
        if (bVar == rl1.b.GROUP) {
            hj1.x0(i, (ok1) obj);
            return;
        }
        hj1.T0(i, m(bVar, false));
        A(hj1, bVar, obj);
    }

    public void a(T t, Object obj) {
        List list;
        if (t.p()) {
            y(t.u(), obj);
            Object i = i(t);
            if (i == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) i;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public rj1<T> clone() {
        rj1<T> w = w();
        for (int i = 0; i < this.a.k(); i++) {
            Map.Entry<T, Object> j = this.a.j(i);
            w.x((b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            w.x((b) next.getKey(), next.getValue());
        }
        w.c = this.c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj1)) {
            return false;
        }
        return this.a.equals(((rj1) obj).a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new ak1.c(this.a.h().iterator()) : this.a.h().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        return obj instanceof ak1 ? ((ak1) obj).f() : obj;
    }

    public int j() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            i += k(this.a.j(i2));
        }
        for (Map.Entry<T, Object> k : this.a.m()) {
            i += k(k);
        }
        return i;
    }

    public int l() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.k(); i2++) {
            Map.Entry<T, Object> j = this.a.j(i2);
            i += f((b) j.getKey(), j.getValue());
        }
        for (Map.Entry next : this.a.m()) {
            i += f((b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i = 0; i < this.a.k(); i++) {
            if (!q(this.a.j(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q : this.a.m()) {
            if (!q(q)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.c ? new ak1.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void t() {
        if (!this.b) {
            this.a.p();
            this.b = true;
        }
    }

    public void u(rj1<T> rj1) {
        for (int i = 0; i < rj1.a.k(); i++) {
            v(rj1.a.j(i));
        }
        for (Map.Entry<T, Object> v : rj1.a.m()) {
            v(v);
        }
    }

    public void x(T t, Object obj) {
        if (!t.p()) {
            y(t.u(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object y : arrayList) {
                y(t.u(), y);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof ak1) {
            this.c = true;
        }
        this.a.put(t, obj);
    }
}
