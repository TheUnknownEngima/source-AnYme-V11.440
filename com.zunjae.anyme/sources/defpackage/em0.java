package defpackage;

/* renamed from: em0  reason: default package */
final class em0 implements mm0 {
    private mm0[] a;

    em0(mm0... mm0Arr) {
        this.a = mm0Arr;
    }

    public final boolean b(Class<?> cls) {
        for (mm0 b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public final nm0 c(Class<?> cls) {
        for (mm0 mm0 : this.a) {
            if (mm0.b(cls)) {
                return mm0.c(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
