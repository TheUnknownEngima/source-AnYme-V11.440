package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class q implements Iterator<String> {
    private Iterator<String> e = this.f.e.keySet().iterator();
    private final /* synthetic */ n f;

    q(n nVar) {
        this.f = nVar;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
