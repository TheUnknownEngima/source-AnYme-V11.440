package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: ii2  reason: default package */
public final class ii2 {
    private final Method a;
    private final List<?> b;

    ii2(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.a.getDeclaringClass().getName(), this.a.getName(), this.b});
    }
}
