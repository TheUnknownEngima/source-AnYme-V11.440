package com.zunjae.anyme.features.discover.fast_search;

import java.util.List;

public final class c {
    private final List<a> a;
    private final List<Integer> b;
    private final List<Integer> c;

    public c(List<a> list, List<Integer> list2, List<Integer> list3) {
        v62.e(list, "animeMobileSearchResult");
        v62.e(list2, "nsfwIds");
        v62.e(list3, "alreadyAddedIds");
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List<Integer> a() {
        return this.c;
    }

    public final List<a> b() {
        return this.a;
    }

    public final List<Integer> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b) && v62.a(this.c, cVar.c);
    }

    public int hashCode() {
        List<a> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Integer> list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SearchResultsWrapper(animeMobileSearchResult=" + this.a + ", nsfwIds=" + this.b + ", alreadyAddedIds=" + this.c + ")";
    }
}
