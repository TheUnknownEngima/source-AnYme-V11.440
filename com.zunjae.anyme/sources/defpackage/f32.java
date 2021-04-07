package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: f32  reason: default package */
class f32 extends e32 {
    public static <T> ArrayList<T> d(T... tArr) {
        v62.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new w22(tArr, true));
    }

    public static final <T> Collection<T> e(T[] tArr) {
        v62.e(tArr, "$this$asCollection");
        return new w22(tArr, false);
    }

    public static <T> List<T> f() {
        return p32.e;
    }

    public static <T> int g(List<? extends T> list) {
        v62.e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static <T> List<T> h(T... tArr) {
        v62.e(tArr, "elements");
        return tArr.length > 0 ? a32.a(tArr) : f();
    }

    public static <T> List<T> i(T... tArr) {
        v62.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new w22(tArr, true));
    }

    public static <T> List<T> j(List<? extends T> list) {
        v62.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : e32.b(list.get(0)) : f();
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
