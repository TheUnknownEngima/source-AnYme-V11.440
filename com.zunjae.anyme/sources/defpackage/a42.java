package defpackage;

import java.util.Set;

/* renamed from: a42  reason: default package */
class a42 extends z32 {
    public static final <T> Set<T> b() {
        return r32.e;
    }

    public static final <T> Set<T> c(Set<? extends T> set) {
        v62.e(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        return size != 0 ? size != 1 ? set : z32.a(set.iterator().next()) : b();
    }

    public static <T> Set<T> d(T... tArr) {
        v62.e(tArr, "elements");
        return tArr.length > 0 ? b32.s(tArr) : b();
    }
}
