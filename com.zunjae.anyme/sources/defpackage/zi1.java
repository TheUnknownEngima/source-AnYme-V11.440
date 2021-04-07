package defpackage;

/* renamed from: zi1  reason: default package */
final class zi1 {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return a;
    }

    static boolean c() {
        return a != null && !b;
    }
}
