package defpackage;

import java.lang.reflect.Field;

/* renamed from: z42  reason: default package */
public final class z42 {
    private static final void a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final y42 b(t42 t42) {
        return (y42) t42.getClass().getAnnotation(y42.class);
    }

    private static final int c(t42 t42) {
        try {
            Field declaredField = t42.getClass().getDeclaredField("label");
            v62.d(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(t42);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(t42 t42) {
        String str;
        v62.e(t42, "$this$getStackTraceElementImpl");
        y42 b = b(t42);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(t42);
        int i = c < 0 ? -1 : b.l()[c];
        String b2 = b52.c.b(t42);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
