package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: sg2  reason: default package */
public final class sg2<T> {
    private ArrayList<y72<?>> a = new ArrayList<>();
    private dh2<T> b;
    public d62<? super sh2, ? super mh2, ? extends T> c;
    private vg2 d = new vg2(false, false, 3, (r62) null);
    private wg2 e = new wg2((Map) null, 1, (r62) null);
    public ug2 f;
    private z52<? super T, u22> g;
    private z52<? super T, u22> h;
    private final oh2 i;
    private final oh2 j;
    private final y72<?> k;

    /* renamed from: sg2$a */
    static final class a extends w62 implements z52<y72<?>, String> {
        public static final a f = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String r(y72<?> y72) {
            v62.f(y72, "it");
            return yh2.a(y72);
        }
    }

    public sg2(oh2 oh2, oh2 oh22, y72<?> y72) {
        v62.f(y72, "primaryType");
        this.i = oh2;
        this.j = oh22;
        this.k = y72;
    }

    public final void a() {
        dh2<T> dh2 = this.b;
        if (dh2 != null) {
            dh2.a();
        }
        this.b = null;
    }

    public final void b() {
        dh2<T> dh2;
        ug2 ug2 = this.f;
        if (ug2 != null) {
            int i2 = rg2.a[ug2.ordinal()];
            if (i2 == 1) {
                dh2 = new hh2<>(this);
            } else if (i2 == 2) {
                dh2 = new eh2<>(this);
            } else if (i2 == 3) {
                dh2 = new gh2<>(this);
            } else {
                throw new j22();
            }
            this.b = dh2;
            return;
        }
        v62.p("kind");
        throw null;
    }

    public final d62<sh2, mh2, T> c() {
        d62<? super sh2, ? super mh2, ? extends T> d62 = this.c;
        if (d62 != null) {
            return d62;
        }
        v62.p("definition");
        throw null;
    }

    public final dh2<T> d() {
        return this.b;
    }

    public final z52<T, u22> e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!v62.a(sg2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            sg2 sg2 = (sg2) obj;
            return !(v62.a(this.i, sg2.i) ^ true) && !(v62.a(this.k, sg2.k) ^ true);
        }
        throw new r22("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    public final z52<T, u22> f() {
        return this.g;
    }

    public final vg2 g() {
        return this.d;
    }

    public final y72<?> h() {
        return this.k;
    }

    public int hashCode() {
        oh2 oh2 = this.i;
        return ((oh2 != null ? oh2.hashCode() : 0) * 31) + this.k.hashCode();
    }

    public final wg2 i() {
        return this.e;
    }

    public final oh2 j() {
        return this.i;
    }

    public final oh2 k() {
        return this.j;
    }

    public final ArrayList<y72<?>> l() {
        return this.a;
    }

    public final <T> T m(fh2 fh2) {
        T c2;
        v62.f(fh2, "context");
        dh2<T> dh2 = this.b;
        if (dh2 != null && (c2 = dh2.c(fh2)) != null) {
            return c2;
        }
        throw new IllegalStateException(("Definition without any InstanceContext - " + this).toString());
    }

    public final void n(d62<? super sh2, ? super mh2, ? extends T> d62) {
        v62.f(d62, "<set-?>");
        this.c = d62;
    }

    public final void o(ug2 ug2) {
        v62.f(ug2, "<set-?>");
        this.f = ug2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            ug2 r0 = r15.f
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r0.toString()
            oh2 r1 = r15.i
            java.lang.String r2 = "', "
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "name:'"
            r1.append(r4)
            oh2 r4 = r15.i
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            oh2 r4 = r15.j
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scope:'"
            r4.append(r5)
            oh2 r5 = r15.j
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "primary_type:'"
            r4.append(r5)
            y72<?> r5 = r15.k
            java.lang.String r5 = defpackage.yh2.a(r5)
            r4.append(r5)
            r5 = 39
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList<y72<?>> r5 = r15.a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0090
            java.util.ArrayList<y72<?>> r6 = r15.a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            sg2$a r12 = defpackage.sg2.a.f
            r13 = 30
            r14 = 0
            java.lang.String r7 = ","
            java.lang.String r3 = defpackage.n32.G(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", secondary_type:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x0090:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[type:"
            r5.append(r6)
            r5.append(r0)
            r0 = 44
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00b8:
            java.lang.String r0 = "kind"
            defpackage.v62.p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.toString():java.lang.String");
    }
}
