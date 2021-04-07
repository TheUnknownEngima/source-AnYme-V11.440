package kotlinx.coroutines;

public final class t {
    public static final <T> Object a(Object obj) {
        if (m22.d(obj)) {
            n22.b(obj);
            return obj;
        }
        Throwable b = m22.b(obj);
        if (b != null) {
            return new s(b, false, 2, (r62) null);
        }
        v62.l();
        throw null;
    }
}
