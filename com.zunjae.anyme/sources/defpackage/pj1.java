package defpackage;

/* renamed from: pj1  reason: default package */
final class pj1 {
    private static final nj1<?> a = new oj1();
    private static final nj1<?> b = c();

    static nj1<?> a() {
        nj1<?> nj1 = b;
        if (nj1 != null) {
            return nj1;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static nj1<?> b() {
        return a;
    }

    private static nj1<?> c() {
        try {
            return (nj1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
