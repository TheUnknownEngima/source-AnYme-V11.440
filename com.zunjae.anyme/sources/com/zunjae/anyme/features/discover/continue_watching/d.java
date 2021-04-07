package com.zunjae.anyme.features.discover.continue_watching;

import java.util.List;

public final class d {
    private final xy1 a;
    private final List<c> b;

    public d(xy1 xy1, List<c> list) {
        v62.e(list, "relatedAnimes");
        this.a = xy1;
        this.b = list;
    }

    public final xy1 a() {
        return this.a;
    }

    public final List<c> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return v62.a(this.a, dVar.a) && v62.a(this.b, dVar.b);
    }

    public int hashCode() {
        xy1 xy1 = this.a;
        int i = 0;
        int hashCode = (xy1 != null ? xy1.hashCode() : 0) * 31;
        List<c> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ContinueWatchingWrapper(anime=" + this.a + ", relatedAnimes=" + this.b + ")";
    }
}
