package kotlinx.coroutines;

import defpackage.m22;

public final class l0 {
    public static final String a(Object obj) {
        v62.f(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        v62.b(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    public static final String b(Object obj) {
        v62.f(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        v62.b(hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    public static final String c(k42<?> k42) {
        String str;
        v62.f(k42, "$this$toDebugString");
        if (k42 instanceof q0) {
            return k42.toString();
        }
        try {
            m22.a aVar = m22.e;
            String str2 = k42 + '@' + b(k42);
            m22.a(str2);
            str = str2;
        } catch (Throwable th) {
            m22.a aVar2 = m22.e;
            Object a = n22.a(th);
            m22.a(a);
            str = a;
        }
        Throwable b = m22.b(str);
        String str3 = str;
        if (b != null) {
            str3 = k42.getClass().getName() + '@' + b(k42);
        }
        return (String) str3;
    }
}
