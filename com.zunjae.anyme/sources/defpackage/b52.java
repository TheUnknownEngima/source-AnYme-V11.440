package defpackage;

import java.lang.reflect.Method;

/* renamed from: b52  reason: default package */
final class b52 {
    private static final a a = new a((Method) null, (Method) null, (Method) null);
    public static a b;
    public static final b52 c = new b52();

    /* renamed from: b52$a */
    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private b52() {
    }

    private final a a(t42 t42) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), t42.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), t42.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            b = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = a;
            b = aVar2;
            return aVar2;
        }
    }

    public final String b(t42 t42) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        v62.e(t42, "continuation");
        a aVar = b;
        if (aVar == null) {
            aVar = a(t42);
        }
        Object obj = null;
        if (aVar == a || (method = aVar.a) == null || (invoke = method.invoke(t42.getClass(), new Object[0])) == null || (method2 = aVar.b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVar.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            obj = invoke3;
        }
        return (String) obj;
    }
}
