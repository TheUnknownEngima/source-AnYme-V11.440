package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: v02  reason: default package */
public final class v02 {
    public static final Method a(Class<?> cls, String str) {
        v62.f(cls, "receiver$0");
        v62.f(str, "methodName");
        for (Method method : cls.getMethods()) {
            v62.b(method, "method");
            if (v62.a(method.getName(), str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static final void b(Method method, Object obj, Object... objArr) {
        v62.f(obj, "target");
        v62.f(objArr, "args");
        if (method != null) {
            try {
                method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static final void c(Field field, Object obj, Object obj2) {
        v62.f(field, "receiver$0");
        v62.f(obj, "obj");
        v62.f(obj2, "value");
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException unused) {
        }
    }
}
