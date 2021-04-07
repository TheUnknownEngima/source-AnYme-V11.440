package defpackage;

import android.util.SparseArray;
import java.util.EnumMap;

/* renamed from: qq  reason: default package */
public final class qq {
    private static SparseArray<xm> a = new SparseArray<>();
    private static EnumMap<xm, Integer> b;

    static {
        EnumMap<xm, Integer> enumMap = new EnumMap<>(xm.class);
        b = enumMap;
        enumMap.put(xm.DEFAULT, 0);
        b.put(xm.VERY_LOW, 1);
        b.put(xm.HIGHEST, 2);
        for (xm next : b.keySet()) {
            a.append(b.get(next).intValue(), next);
        }
    }

    public static int a(xm xmVar) {
        Integer num = b.get(xmVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + xmVar);
    }

    public static xm b(int i) {
        xm xmVar = a.get(i);
        if (xmVar != null) {
            return xmVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
