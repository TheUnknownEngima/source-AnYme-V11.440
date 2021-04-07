package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: a32  reason: default package */
class a32 extends z22 {
    public static <T> List<T> a(T[] tArr) {
        v62.e(tArr, "$this$asList");
        List<T> a = c32.a(tArr);
        v62.d(a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        v62.e(tArr, "$this$copyInto");
        v62.e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        b(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    public static final <T> void d(T[] tArr) {
        v62.e(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void e(T[] tArr, Comparator<? super T> comparator) {
        v62.e(tArr, "$this$sortWith");
        v62.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
