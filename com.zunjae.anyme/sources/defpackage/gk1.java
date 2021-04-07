package defpackage;

/* renamed from: gk1  reason: default package */
final class gk1 implements fl1 {
    private static final nk1 b = new a();
    private final nk1 a;

    /* renamed from: gk1$a */
    static class a implements nk1 {
        a() {
        }

        public mk1 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: gk1$b */
    private static class b implements nk1 {
        private nk1[] a;

        b(nk1... nk1Arr) {
            this.a = nk1Arr;
        }

        public mk1 a(Class<?> cls) {
            for (nk1 nk1 : this.a) {
                if (nk1.b(cls)) {
                    return nk1.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (nk1 b : this.a) {
                if (b.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public gk1() {
        this(b());
    }

    private gk1(nk1 nk1) {
        xj1.b(nk1, "messageInfoFactory");
        this.a = nk1;
    }

    private static nk1 b() {
        return new b(uj1.c(), c());
    }

    private static nk1 c() {
        try {
            return (nk1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(mk1 mk1) {
        return mk1.c() == zk1.PROTO2;
    }

    private static <T> el1<T> e(Class<T> cls, mk1 mk1) {
        if (vj1.class.isAssignableFrom(cls)) {
            if (d(mk1)) {
                return rk1.R(cls, mk1, vk1.b(), ek1.b(), gl1.M(), pj1.b(), lk1.b());
            }
            return rk1.R(cls, mk1, vk1.b(), ek1.b(), gl1.M(), (nj1<?>) null, lk1.b());
        } else if (d(mk1)) {
            return rk1.R(cls, mk1, vk1.a(), ek1.a(), gl1.H(), pj1.a(), lk1.a());
        } else {
            return rk1.R(cls, mk1, vk1.a(), ek1.a(), gl1.I(), (nj1<?>) null, lk1.a());
        }
    }

    public <T> el1<T> a(Class<T> cls) {
        ll1<?, ?> H;
        nj1<?> a2;
        gl1.J(cls);
        mk1 a3 = this.a.a(cls);
        if (!a3.a()) {
            return e(cls, a3);
        }
        if (vj1.class.isAssignableFrom(cls)) {
            H = gl1.M();
            a2 = pj1.b();
        } else {
            H = gl1.H();
            a2 = pj1.a();
        }
        return sk1.m(H, a2, a3.b());
    }
}
