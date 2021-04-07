package defpackage;

/* renamed from: f72  reason: default package */
public class f72 {
    private static final g72 a;

    static {
        g72 g72 = null;
        try {
            g72 = (g72) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g72 == null) {
            g72 = new g72();
        }
        a = g72;
    }

    public static a82 a(t62 t62) {
        a.a(t62);
        return t62;
    }

    public static y72 b(Class cls) {
        return a.b(cls);
    }

    public static z72 c(Class cls) {
        return a.c(cls, "");
    }

    public static z72 d(Class cls, String str) {
        return a.c(cls, str);
    }

    public static b82 e(x62 x62) {
        a.d(x62);
        return x62;
    }

    public static c82 f(b72 b72) {
        a.e(b72);
        return b72;
    }

    public static String g(s62 s62) {
        return a.f(s62);
    }

    public static String h(w62 w62) {
        return a.g(w62);
    }
}
