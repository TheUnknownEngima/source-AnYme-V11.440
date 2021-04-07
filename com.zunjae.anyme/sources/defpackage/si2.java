package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: si2  reason: default package */
abstract class si2<T> {
    si2() {
    }

    static <T> si2<T> b(ri2 ri2, Method method) {
        pi2 b = pi2.b(ri2, method);
        Type genericReturnType = method.getGenericReturnType();
        if (vi2.k(genericReturnType)) {
            throw vi2.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return hi2.f(ri2, method, b);
        } else {
            throw vi2.n(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract T a(Object[] objArr);
}
