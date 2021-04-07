package defpackage;

import java.util.Collection;

/* renamed from: k32  reason: default package */
class k32 extends j32 {
    public static <T> boolean q(Collection<? super T> collection, Iterable<? extends T> iterable) {
        v62.e(collection, "$this$addAll");
        v62.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean r(Collection<? super T> collection, Iterable<? extends T> iterable) {
        v62.e(collection, "$this$removeAll");
        v62.e(iterable, "elements");
        return i72.a(collection).removeAll(g32.m(iterable, collection));
    }
}
