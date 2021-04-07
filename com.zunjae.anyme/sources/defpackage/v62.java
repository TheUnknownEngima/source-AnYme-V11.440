package defpackage;

import java.util.Arrays;

/* renamed from: v62  reason: default package */
public class v62 {
    private v62() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " must not be null");
            i(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            k();
            throw null;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            i(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            n(str);
            throw null;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            m(str);
            throw null;
        }
    }

    public static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private static String h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    private static <T extends Throwable> T i(T t) {
        j(t, v62.class.getName());
        return t;
    }

    static <T extends Throwable> T j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void k() {
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void l() {
        b22 b22 = new b22();
        i(b22);
        throw b22;
    }

    private static void m(String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(h(str));
        i(illegalArgumentException);
        throw illegalArgumentException;
    }

    private static void n(String str) {
        NullPointerException nullPointerException = new NullPointerException(h(str));
        i(nullPointerException);
        throw nullPointerException;
    }

    public static void o(String str) {
        t22 t22 = new t22(str);
        i(t22);
        throw t22;
    }

    public static void p(String str) {
        o("lateinit property " + str + " has not been initialized");
        throw null;
    }
}
