package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: g32  reason: default package */
class g32 extends f32 {
    public static <T> int l(Iterable<? extends T> iterable, int i) {
        v62.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static final <T> Collection<T> m(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        v62.e(iterable, "$this$convertToSetForSetOperationWith");
        v62.e(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!n(collection)) {
                        return collection;
                    }
                }
            }
            return n32.Z(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean n(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }
}
