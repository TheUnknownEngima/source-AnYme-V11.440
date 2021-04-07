package defpackage;

/* renamed from: yj0  reason: default package */
final class yj0 {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return a != null && !b;
    }

    static Class<?> c() {
        return a;
    }
}
