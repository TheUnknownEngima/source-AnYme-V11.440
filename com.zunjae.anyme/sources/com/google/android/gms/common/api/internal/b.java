package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.q;

public final class b<O extends a.d> {
    private final boolean a = false;
    private final int b;
    private final a<O> c;
    private final O d;

    private b(a<O> aVar, O o) {
        this.c = aVar;
        this.d = o;
        this.b = q.b(aVar, o);
    }

    public static <O extends a.d> b<O> b(a<O> aVar, O o) {
        return new b<>(aVar, o);
    }

    public final String a() {
        return this.c.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return !this.a && !bVar.a && q.a(this.c, bVar.c) && q.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
