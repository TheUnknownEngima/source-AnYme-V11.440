package defpackage;

import defpackage.vj1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: oj1  reason: default package */
final class oj1 extends nj1<vj1.d> {

    /* renamed from: oj1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
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
                rl1$b r1 = defpackage.rl1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                rl1$b r1 = defpackage.rl1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rl1$b r1 = defpackage.rl1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rl1$b r1 = defpackage.rl1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                rl1$b r1 = defpackage.rl1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
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
                rl1$b r1 = defpackage.rl1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                rl1$b r1 = defpackage.rl1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                rl1$b r1 = defpackage.rl1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                rl1$b r1 = defpackage.rl1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0084 }
                rl1$b r1 = defpackage.rl1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0090 }
                rl1$b r1 = defpackage.rl1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009c }
                rl1$b r1 = defpackage.rl1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                rl1$b r1 = defpackage.rl1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                rl1$b r1 = defpackage.rl1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                rl1$b r1 = defpackage.rl1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00cc }
                rl1$b r1 = defpackage.rl1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                rl1$b r1 = defpackage.rl1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oj1.a.<clinit>():void");
        }
    }

    oj1() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((vj1.d) entry.getKey()).j();
    }

    /* access modifiers changed from: package-private */
    public Object b(mj1 mj1, ok1 ok1, int i) {
        return mj1.a(ok1, i);
    }

    /* access modifiers changed from: package-private */
    public rj1<vj1.d> c(Object obj) {
        return ((vj1.c) obj).i;
    }

    /* access modifiers changed from: package-private */
    public rj1<vj1.d> d(Object obj) {
        return ((vj1.c) obj).H();
    }

    /* access modifiers changed from: package-private */
    public boolean e(ok1 ok1) {
        return ok1 instanceof vj1.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).t();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016d, code lost:
        r1 = java.lang.Long.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UT, UB> UB g(defpackage.dl1 r5, java.lang.Object r6, defpackage.mj1 r7, defpackage.rj1<defpackage.vj1.d> r8, UB r9, defpackage.ll1<UT, UB> r10) {
        /*
            r4 = this;
            vj1$e r6 = (defpackage.vj1.e) r6
            int r0 = r6.c()
            vj1$d r1 = r6.b
            boolean r1 = r1.p()
            if (r1 == 0) goto L_0x00d2
            vj1$d r1 = r6.b
            boolean r1 = r1.isPacked()
            if (r1 == 0) goto L_0x00d2
            int[] r7 = defpackage.oj1.a.a
            rl1$b r1 = r6.a()
            int r1 = r1.ordinal()
            r7 = r7[r1]
            switch(r7) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009f;
                case 6: goto L_0x0096;
                case 7: goto L_0x008d;
                case 8: goto L_0x0084;
                case 9: goto L_0x007b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0069;
                case 12: goto L_0x0060;
                case 13: goto L_0x0056;
                case 14: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Type cannot be packed: "
            r7.append(r8)
            vj1$d r6 = r6.b
            rl1$b r6 = r6.u()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x0042:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.t(r7)
            vj1$d r5 = r6.b
            xj1$d r5 = r5.e()
            java.lang.Object r9 = defpackage.gl1.z(r0, r7, r5, r9, r10)
            goto L_0x00cb
        L_0x0056:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.e(r7)
            goto L_0x00cb
        L_0x0060:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.a(r7)
            goto L_0x00cb
        L_0x0069:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.r(r7)
            goto L_0x00cb
        L_0x0072:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.d(r7)
            goto L_0x00cb
        L_0x007b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.g(r7)
            goto L_0x00cb
        L_0x0084:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.y(r7)
            goto L_0x00cb
        L_0x008d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.v(r7)
            goto L_0x00cb
        L_0x0096:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.P(r7)
            goto L_0x00cb
        L_0x009f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.s(r7)
            goto L_0x00cb
        L_0x00a8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.m(r7)
            goto L_0x00cb
        L_0x00b1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.q(r7)
            goto L_0x00cb
        L_0x00ba:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.H(r7)
            goto L_0x00cb
        L_0x00c3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.M(r7)
        L_0x00cb:
            vj1$d r5 = r6.b
            r8.x(r5, r7)
            goto L_0x01b5
        L_0x00d2:
            r1 = 0
            rl1$b r2 = r6.a()
            rl1$b r3 = defpackage.rl1.b.ENUM
            if (r2 != r3) goto L_0x00f0
            int r5 = r5.I()
            vj1$d r7 = r6.b
            xj1$d r7 = r7.e()
            xj1$c r7 = r7.a(r5)
            if (r7 != 0) goto L_0x015f
            java.lang.Object r5 = defpackage.gl1.L(r0, r5, r9, r10)
            return r5
        L_0x00f0:
            int[] r10 = defpackage.oj1.a.a
            rl1$b r0 = r6.a()
            int r0 = r0.ordinal()
            r10 = r10[r0]
            switch(r10) {
                case 1: goto L_0x017b;
                case 2: goto L_0x0172;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015b;
                case 6: goto L_0x0156;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0143;
                case 10: goto L_0x013e;
                case 11: goto L_0x0139;
                case 12: goto L_0x0134;
                case 13: goto L_0x012f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0122;
                case 16: goto L_0x011d;
                case 17: goto L_0x010f;
                case 18: goto L_0x0101;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            goto L_0x0183
        L_0x0101:
            ok1 r10 = r6.b()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.h(r10, r7)
            goto L_0x0183
        L_0x010f:
            ok1 r10 = r6.b()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.A(r10, r7)
            goto L_0x0183
        L_0x011d:
            java.lang.String r1 = r5.z()
            goto L_0x0183
        L_0x0122:
            ej1 r1 = r5.G()
            goto L_0x0183
        L_0x0127:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Shouldn't reach here."
            r5.<init>(r6)
            throw r5
        L_0x012f:
            long r0 = r5.x()
            goto L_0x016d
        L_0x0134:
            int r5 = r5.w()
            goto L_0x015f
        L_0x0139:
            long r0 = r5.l()
            goto L_0x016d
        L_0x013e:
            int r5 = r5.K()
            goto L_0x015f
        L_0x0143:
            int r5 = r5.p()
            goto L_0x015f
        L_0x0148:
            boolean r5 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x0183
        L_0x0151:
            int r5 = r5.i()
            goto L_0x015f
        L_0x0156:
            long r0 = r5.c()
            goto L_0x016d
        L_0x015b:
            int r5 = r5.I()
        L_0x015f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0183
        L_0x0164:
            long r0 = r5.b()
            goto L_0x016d
        L_0x0169:
            long r0 = r5.N()
        L_0x016d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0183
        L_0x0172:
            float r5 = r5.readFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            goto L_0x0183
        L_0x017b:
            double r0 = r5.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0183:
            boolean r5 = r6.d()
            if (r5 == 0) goto L_0x018f
            vj1$d r5 = r6.b
            r8.a(r5, r1)
            goto L_0x01b5
        L_0x018f:
            int[] r5 = defpackage.oj1.a.a
            rl1$b r7 = r6.a()
            int r7 = r7.ordinal()
            r5 = r5[r7]
            r7 = 17
            if (r5 == r7) goto L_0x01a4
            r7 = 18
            if (r5 == r7) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            vj1$d r5 = r6.b
            java.lang.Object r5 = r8.i(r5)
            if (r5 == 0) goto L_0x01b0
            java.lang.Object r1 = defpackage.xj1.h(r5, r1)
        L_0x01b0:
            vj1$d r5 = r6.b
            r8.x(r5, r1)
        L_0x01b5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj1.g(dl1, java.lang.Object, mj1, rj1, java.lang.Object, ll1):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public void h(dl1 dl1, Object obj, mj1 mj1, rj1<vj1.d> rj1) {
        vj1.e eVar = (vj1.e) obj;
        rj1.x(eVar.b, dl1.h(eVar.b().getClass(), mj1));
    }

    /* access modifiers changed from: package-private */
    public void i(ej1 ej1, Object obj, mj1 mj1, rj1<vj1.d> rj1) {
        vj1.e eVar = (vj1.e) obj;
        ok1 j0 = eVar.b().j().j0();
        bj1 Q = bj1.Q(ByteBuffer.wrap(ej1.u()), true);
        al1.a().b(j0, Q, mj1);
        rj1.x(eVar.b, j0);
        if (Q.B() != Integer.MAX_VALUE) {
            throw yj1.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(sl1 sl1, Map.Entry<?, ?> entry) {
        vj1.d dVar = (vj1.d) entry.getKey();
        if (dVar.p()) {
            switch (a.a[dVar.u().ordinal()]) {
                case 1:
                    gl1.P(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 2:
                    gl1.T(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 3:
                    gl1.W(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 4:
                    gl1.e0(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 5:
                case 14:
                    gl1.V(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 6:
                    gl1.S(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 7:
                    gl1.R(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 8:
                    gl1.N(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 9:
                    gl1.d0(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 10:
                    gl1.Y(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 11:
                    gl1.Z(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 12:
                    gl1.a0(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 13:
                    gl1.b0(dVar.j(), (List) entry.getValue(), sl1, dVar.isPacked());
                    return;
                case 15:
                    gl1.O(dVar.j(), (List) entry.getValue(), sl1);
                    return;
                case 16:
                    gl1.c0(dVar.j(), (List) entry.getValue(), sl1);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        gl1.U(dVar.j(), (List) entry.getValue(), sl1, al1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        gl1.X(dVar.j(), (List) entry.getValue(), sl1, al1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.a[dVar.u().ordinal()]) {
                case 1:
                    sl1.g(dVar.j(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    sl1.G(dVar.j(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    sl1.q(dVar.j(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    sl1.o(dVar.j(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    sl1.w(dVar.j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    sl1.k(dVar.j(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    sl1.f(dVar.j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    sl1.r(dVar.j(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    sl1.d(dVar.j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    sl1.t(dVar.j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    sl1.z(dVar.j(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    sl1.N(dVar.j(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    sl1.F(dVar.j(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    sl1.v(dVar.j(), (ej1) entry.getValue());
                    return;
                case 16:
                    sl1.n(dVar.j(), (String) entry.getValue());
                    return;
                case 17:
                    sl1.s(dVar.j(), entry.getValue(), al1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    sl1.j(dVar.j(), entry.getValue(), al1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
