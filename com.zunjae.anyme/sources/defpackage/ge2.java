package defpackage;

import java.lang.reflect.Array;

/* renamed from: ge2  reason: default package */
public class ge2 {
    public static final Object[] a = new Object[0];

    public static <T> T[] a(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (Object[]) tArr.clone();
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean c(char[] cArr) {
        return b(cArr) == 0;
    }
}
