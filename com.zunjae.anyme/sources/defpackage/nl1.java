package defpackage;

/* renamed from: nl1  reason: default package */
class nl1 extends ll1<ml1, ml1> {
    nl1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public ml1 g(Object obj) {
        return ((vj1) obj).f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(ml1 ml1) {
        return ml1.f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(ml1 ml1) {
        return ml1.g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public ml1 k(ml1 ml1, ml1 ml12) {
        return ml12.equals(ml1.e()) ? ml1 : ml1.k(ml1, ml12);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public ml1 n() {
        return ml1.l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, ml1 ml1) {
        p(obj, ml1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, ml1 ml1) {
        ((vj1) obj).f = ml1;
    }

    /* access modifiers changed from: package-private */
    public ml1 H(ml1 ml1) {
        ml1.j();
        return ml1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(ml1 ml1, sl1 sl1) {
        ml1.o(sl1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(ml1 ml1, sl1 sl1) {
        ml1.q(sl1);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).j();
    }

    /* access modifiers changed from: package-private */
    public boolean q(dl1 dl1) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public /* bridge */ /* synthetic */ Object r(Object obj) {
        ml1 ml1 = (ml1) obj;
        H(ml1);
        return ml1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(ml1 ml1, int i, int i2) {
        ml1.n(rl1.c(i, 5), Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(ml1 ml1, int i, long j) {
        ml1.n(rl1.c(i, 1), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(ml1 ml1, int i, ml1 ml12) {
        ml1.n(rl1.c(i, 3), ml12);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(ml1 ml1, int i, ej1 ej1) {
        ml1.n(rl1.c(i, 2), ej1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(ml1 ml1, int i, long j) {
        ml1.n(rl1.c(i, 0), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public ml1 f(Object obj) {
        ml1 A = g(obj);
        if (A != ml1.e()) {
            return A;
        }
        ml1 l = ml1.l();
        p(obj, l);
        return l;
    }
}
