package butterknife;

import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ButterKnife {
    private static boolean a = false;
    static final Map<Class<?>, Constructor<? extends Unbinder>> b = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder a(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (a) {
            "Looking up binding for " + cls.getName();
        }
        Constructor<? extends Unbinder> b2 = b(cls);
        if (b2 == null) {
            return Unbinder.a;
        }
        try {
            return (Unbinder) b2.newInstance(new Object[]{obj, view});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + b2, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + b2, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
        }
    }

    private static Constructor<? extends Unbinder> b(Class<?> cls) {
        Constructor<? extends Unbinder> constructor;
        Constructor<? extends Unbinder> constructor2 = b.get(cls);
        if (constructor2 != null || b.containsKey(cls)) {
            boolean z = a;
            return constructor2;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            boolean z2 = a;
            return null;
        }
        try {
            constructor = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(new Class[]{cls, View.class});
            boolean z3 = a;
        } catch (ClassNotFoundException unused) {
            if (a) {
                "Not found. Trying superclass " + cls.getSuperclass().getName();
            }
            constructor = b(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e);
        }
        b.put(cls, constructor);
        return constructor;
    }
}
