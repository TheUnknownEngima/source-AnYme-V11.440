package kotlinx.coroutines;

public final class z {
    private static final boolean a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.v.d(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.z.<clinit>():void");
    }

    public static final a0 a() {
        return a ? n92.k : q.g;
    }

    public static final String b(n42 n42) {
        d0 d0Var;
        String str;
        v62.f(n42, "$this$coroutineName");
        if (!k0.c() || (d0Var = (d0) n42.get(d0.f)) == null) {
            return null;
        }
        e0 e0Var = (e0) n42.get(e0.f);
        if (e0Var == null || (str = e0Var.N()) == null) {
            str = "coroutine";
        }
        return str + '#' + d0Var.N();
    }

    public static final n42 c(f0 f0Var, n42 n42) {
        v62.f(f0Var, "$this$newCoroutineContext");
        v62.f(n42, "context");
        n42 plus = f0Var.i().plus(n42);
        n42 plus2 = k0.c() ? plus.plus(new d0(k0.b().incrementAndGet())) : plus;
        return (plus == v0.a() || plus.get(l42.b) != null) ? plus2 : plus2.plus(v0.a());
    }
}
