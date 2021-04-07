package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: e32  reason: default package */
class e32 {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        v62.e(tArr, "$this$copyToArrayOfAny");
        if (!z || !v62.a(tArr.getClass(), cls)) {
            tArr = Arrays.copyOf(tArr, tArr.length, cls);
        }
        v62.d(tArr, "if (isVarargs && this.ja… Array<Any?>::class.java)");
        return tArr;
    }

    public static <T> List<T> b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        v62.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static <T> List<T> c(Iterable<? extends T> iterable) {
        v62.e(iterable, "$this$shuffled");
        List<T> c0 = n32.c0(iterable);
        Collections.shuffle(c0);
        return c0;
    }
}
