package defpackage;

import defpackage.cl0;

/* renamed from: cm0  reason: default package */
final class cm0 implements gn0 {
    private static final mm0 b = new fm0();
    private final mm0 a;

    public cm0() {
        this(new em0(dl0.a(), c()));
    }

    private cm0(mm0 mm0) {
        gl0.d(mm0, "messageInfoFactory");
        this.a = mm0;
    }

    private static boolean b(nm0 nm0) {
        return nm0.c() == cl0.e.i;
    }

    private static mm0 c() {
        try {
            return (mm0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    public final <T> dn0<T> a(Class<T> cls) {
        Class<cl0> cls2 = cl0.class;
        fn0.u(cls);
        nm0 c = this.a.c(cls);
        if (c.a()) {
            return cls2.isAssignableFrom(cls) ? sm0.a(fn0.J(), tk0.b(), c.b()) : sm0.a(fn0.H(), tk0.c(), c.b());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b2 = b(c);
            um0 b3 = wm0.b();
            yl0 d = yl0.d();
            vn0<?, ?> J = fn0.J();
            if (b2) {
                return tm0.i(cls, c, b3, d, J, tk0.b(), km0.b());
            }
            return tm0.i(cls, c, b3, d, J, (rk0<?>) null, km0.b());
        }
        boolean b4 = b(c);
        um0 a2 = wm0.a();
        yl0 c2 = yl0.c();
        if (b4) {
            return tm0.i(cls, c, a2, c2, fn0.H(), tk0.c(), km0.a());
        }
        return tm0.i(cls, c, a2, c2, fn0.I(), (rk0<?>) null, km0.a());
    }
}
