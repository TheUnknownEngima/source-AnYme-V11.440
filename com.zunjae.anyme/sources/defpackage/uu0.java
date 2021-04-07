package defpackage;

import java.io.Serializable;

/* renamed from: uu0  reason: default package */
public abstract class uu0<T> implements Serializable {
    uu0() {
    }

    public static <T> uu0<T> a(T t) {
        tu0.b(t);
        return new wu0(t);
    }

    public static <T> uu0<T> d() {
        return qu0.e;
    }

    public abstract boolean b();

    public abstract T c();
}
