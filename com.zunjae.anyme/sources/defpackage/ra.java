package defpackage;

/* renamed from: ra  reason: default package */
public final class ra {
    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
