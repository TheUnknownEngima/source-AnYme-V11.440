package com.afollestad.assent;

import com.afollestad.assent.rationale.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class f {
    public static final e a(int i, g gVar, d dVar) {
        v62.f(gVar, "forPermission");
        v62.f(dVar, "shouldShowRationale");
        return dVar.b(gVar) ? e.PERMANENTLY_DENIED : i != 0 ? e.DENIED : e.GRANTED;
    }

    public static final List<e> b(int[] iArr, Set<? extends g> set, d dVar) {
        v62.f(iArr, "$this$mapGrantResults");
        v62.f(set, "permissions");
        v62.f(dVar, "shouldShowRationale");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(a(iArr[i], (g) n32.w(set, i2), dVar));
            i++;
            i2++;
        }
        return arrayList;
    }
}
