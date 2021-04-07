package com.zunjae.anyme.features.discover.seasonal;

import com.zunjae.vresult.c;
import java.util.List;

public final class f implements c<sx1> {
    private final List<sx1> a;
    private final List<Long> b;

    public f(List<sx1> list, List<Long> list2) {
        v62.e(list2, "alreadyAddedIDs");
        this.a = list;
        this.b = list2;
    }

    public List<sx1> a() {
        return this.a;
    }

    public final List<Long> b() {
        return this.b;
    }

    public final List<sx1> c() {
        return this.a;
    }
}
