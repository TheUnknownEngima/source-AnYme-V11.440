package defpackage;

/* renamed from: ll1  reason: default package */
abstract class ll1<T, B> {
    ll1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    public abstract void d(B b, int i, ej1 ej1);

    /* access modifiers changed from: package-private */
    public abstract void e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(T t);

    /* access modifiers changed from: package-private */
    public abstract int i(T t);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(B r3, defpackage.dl1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.B()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll1.l(java.lang.Object, dl1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(B b, dl1 dl1) {
        int o = dl1.o();
        int a = rl1.a(o);
        int b2 = rl1.b(o);
        if (b2 == 0) {
            e(b, a, dl1.N());
            return true;
        } else if (b2 == 1) {
            b(b, a, dl1.c());
            return true;
        } else if (b2 == 2) {
            d(b, a, dl1.G());
            return true;
        } else if (b2 == 3) {
            Object n = n();
            int c = rl1.c(a, 4);
            l(n, dl1);
            if (c == dl1.o()) {
                c(b, a, r(n));
                return true;
            }
            throw yj1.a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(b, a, dl1.i());
                return true;
            }
            throw yj1.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, B b);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean q(dl1 dl1);

    /* access modifiers changed from: package-private */
    public abstract T r(B b);

    /* access modifiers changed from: package-private */
    public abstract void s(T t, sl1 sl1);

    /* access modifiers changed from: package-private */
    public abstract void t(T t, sl1 sl1);
}
