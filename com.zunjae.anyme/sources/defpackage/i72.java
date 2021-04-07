package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: i72  reason: default package */
public class i72 {
    public static Collection a(Object obj) {
        if (!(obj instanceof j72)) {
            return d(obj);
        }
        j(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(Object obj) {
        if (!(obj instanceof j72) || (obj instanceof k72)) {
            return e(obj);
        }
        j(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Object c(Object obj, int i) {
        if (obj == null || g(obj, i)) {
            return obj;
        }
        j(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static Collection d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            i(e);
            throw null;
        }
    }

    public static Map e(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            i(e);
            throw null;
        }
    }

    public static int f(Object obj) {
        if (obj instanceof s62) {
            return ((s62) obj).i();
        }
        if (obj instanceof o52) {
            return 0;
        }
        if (obj instanceof z52) {
            return 1;
        }
        if (obj instanceof d62) {
            return 2;
        }
        if (obj instanceof e62) {
            return 3;
        }
        if (obj instanceof f62) {
            return 4;
        }
        if (obj instanceof g62) {
            return 5;
        }
        if (obj instanceof h62) {
            return 6;
        }
        if (obj instanceof i62) {
            return 7;
        }
        if (obj instanceof j62) {
            return 8;
        }
        if (obj instanceof k62) {
            return 9;
        }
        if (obj instanceof p52) {
            return 10;
        }
        if (obj instanceof q52) {
            return 11;
        }
        if (obj instanceof r52) {
            return 12;
        }
        if (obj instanceof s52) {
            return 13;
        }
        if (obj instanceof t52) {
            return 14;
        }
        if (obj instanceof u52) {
            return 15;
        }
        if (obj instanceof v52) {
            return 16;
        }
        if (obj instanceof w52) {
            return 17;
        }
        if (obj instanceof x52) {
            return 18;
        }
        if (obj instanceof y52) {
            return 19;
        }
        if (obj instanceof a62) {
            return 20;
        }
        if (obj instanceof b62) {
            return 21;
        }
        return obj instanceof c62 ? 22 : -1;
    }

    public static boolean g(Object obj, int i) {
        return (obj instanceof a22) && f(obj) == i;
    }

    private static <T extends Throwable> T h(T t) {
        v62.j(t, i72.class.getName());
        return t;
    }

    public static ClassCastException i(ClassCastException classCastException) {
        h(classCastException);
        throw classCastException;
    }

    public static void j(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        k(name + " cannot be cast to " + str);
        throw null;
    }

    public static void k(String str) {
        i(new ClassCastException(str));
        throw null;
    }
}
