package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: j32  reason: default package */
class j32 extends i32 {
    public static final <T extends Comparable<? super T>> void o(List<T> list) {
        v62.e(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void p(List<T> list, Comparator<? super T> comparator) {
        v62.e(list, "$this$sortWith");
        v62.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
