package defpackage;

/* renamed from: u3  reason: default package */
public final class u3 {
    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T c(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
