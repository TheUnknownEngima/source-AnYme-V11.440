package com.zunjae.anyme.features.browsers.native_streaming;

import java.util.List;

public final class c {
    private final List<oz1> a;
    private final nz1 b;

    public c(List<oz1> list, nz1 nz1) {
        v62.e(list, "hosts");
        v62.e(nz1, "episode");
        this.a = list;
        this.b = nz1;
    }

    public final nz1 a() {
        return this.b;
    }

    public final List<oz1> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b);
    }

    public int hashCode() {
        List<oz1> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        nz1 nz1 = this.b;
        if (nz1 != null) {
            i = nz1.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "LoadProvidersForHostWrapper(hosts=" + this.a + ", episode=" + this.b + ")";
    }
}
