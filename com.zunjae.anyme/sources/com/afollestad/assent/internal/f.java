package com.afollestad.assent.internal;

import com.afollestad.assent.b;
import com.afollestad.assent.g;
import java.util.List;
import java.util.Set;

public final class f {
    private final Set<g> a;
    private int b;
    private final List<z52<b, u22>> c;

    public f(Set<? extends g> set, int i, List<z52<b, u22>> list) {
        v62.f(set, "permissions");
        v62.f(list, "callbacks");
        this.a = set;
        this.b = i;
        this.c = list;
    }

    public final List<z52<b, u22>> a() {
        return this.c;
    }

    public final Set<g> b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final void d(int i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof f) && b.b(this.a, ((f) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "PendingRequest(permissions=" + this.a + ", requestCode=" + this.b + ", callbacks=" + this.c + ")";
    }
}
