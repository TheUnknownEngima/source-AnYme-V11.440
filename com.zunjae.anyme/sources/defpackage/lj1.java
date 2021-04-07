package defpackage;

/* renamed from: lj1  reason: default package */
final class lj1 {
    static final Class<?> a = c();

    public static mj1 a() {
        mj1 b = b("getEmptyRegistry");
        return b != null ? b : mj1.d;
    }

    private static final mj1 b(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (mj1) cls.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
