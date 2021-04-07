package defpackage;

import defpackage.sy0;

/* renamed from: rz0  reason: default package */
final class rz0 implements w01 {
    private static final c01 b = new uz0();
    private final c01 a;

    public rz0() {
        this(new tz0(ty0.c(), b()));
    }

    private rz0(c01 c01) {
        uy0.f(c01, "messageInfoFactory");
        this.a = c01;
    }

    private static c01 b() {
        try {
            return (c01) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean c(d01 d01) {
        return d01.zza() == sy0.e.i;
    }

    public final <T> u01<T> a(Class<T> cls) {
        Class<sy0> cls2 = sy0.class;
        v01.p(cls);
        d01 b2 = this.a.b(cls);
        if (b2.b()) {
            return cls2.isAssignableFrom(cls) ? l01.i(v01.B(), iy0.a(), b2.c()) : l01.i(v01.f(), iy0.b(), b2.c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean c = c(b2);
            n01 b3 = p01.b();
            oz0 c2 = oz0.c();
            m11<?, ?> B = v01.B();
            if (c) {
                return j01.p(cls, b2, b3, c2, B, iy0.a(), a01.b());
            }
            return j01.p(cls, b2, b3, c2, B, (hy0<?>) null, a01.b());
        }
        boolean c3 = c(b2);
        n01 a2 = p01.a();
        oz0 a3 = oz0.a();
        if (c3) {
            return j01.p(cls, b2, a2, a3, v01.f(), iy0.b(), a01.a());
        }
        return j01.p(cls, b2, a2, a3, v01.v(), (hy0<?>) null, a01.a());
    }
}
