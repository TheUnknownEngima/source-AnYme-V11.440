package com.afollestad.assent.internal;

import com.afollestad.assent.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class b {
    public static final String[] a(Set<? extends g> set) {
        v62.f(set, "$this$allValues");
        ArrayList arrayList = new ArrayList(g32.l(set, 10));
        for (g value : set) {
            arrayList.add(value.getValue());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new r22("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean b(Set<? extends g> set, Set<? extends g> set2) {
        v62.f(set, "$this$equalsPermissions");
        v62.f(set2, "permissions");
        if (set.size() != set2.size()) {
            return false;
        }
        int i = 0;
        for (g value : set) {
            if (!v62.a(value.getValue(), ((g) n32.w(set2, i)).getValue())) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final boolean c(Set<? extends g> set, g... gVarArr) {
        v62.f(set, "$this$equalsPermissions");
        v62.f(gVarArr, "permissions");
        return b(set, b32.s(gVarArr));
    }

    public static final boolean d(Set<? extends g> set, String[] strArr) {
        v62.f(set, "$this$equalsStrings");
        v62.f(strArr, "strings");
        if (set.size() != strArr.length) {
            return false;
        }
        int i = 0;
        for (g value : set) {
            if (!v62.a(value.getValue(), strArr[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final void e(List<? extends z52<? super com.afollestad.assent.b, u22>> list, com.afollestad.assent.b bVar) {
        v62.f(list, "$this$invokeAll");
        v62.f(bVar, "result");
        for (z52 r : list) {
            r.r(bVar);
        }
    }

    public static final Set<g> f(String[] strArr) {
        v62.f(strArr, "$this$toPermissions");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(g.Companion.a(a));
        }
        return n32.f0(arrayList);
    }
}
