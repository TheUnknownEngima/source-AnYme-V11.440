package defpackage;

/* renamed from: tz0  reason: default package */
final class tz0 implements c01 {
    private c01[] a;

    tz0(c01... c01Arr) {
        this.a = c01Arr;
    }

    public final boolean a(Class<?> cls) {
        for (c01 a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final d01 b(Class<?> cls) {
        for (c01 c01 : this.a) {
            if (c01.a(cls)) {
                return c01.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
