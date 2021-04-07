package org.koin.androidx.viewmodel;

import androidx.lifecycle.e0;
import androidx.lifecycle.n;

public final class a<T> {
    private final y72<T> a;
    private final n b;
    private final oh2 c;
    private final o52<e0> d;
    private final o52<mh2> e;

    public a(y72<T> y72, n nVar, oh2 oh2, o52<? extends e0> o52, o52<mh2> o522) {
        v62.f(y72, "clazz");
        v62.f(nVar, "owner");
        this.a = y72;
        this.b = nVar;
        this.c = oh2;
        this.d = o52;
        this.e = o522;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(y72 y72, n nVar, oh2 oh2, o52 o52, o52 o522, int i, r62 r62) {
        this(y72, nVar, (i & 4) != 0 ? null : oh2, (i & 8) != 0 ? null : o52, (i & 16) != 0 ? null : o522);
    }

    public final y72<T> a() {
        return this.a;
    }

    public final o52<e0> b() {
        return this.d;
    }

    public final n c() {
        return this.b;
    }

    public final o52<mh2> d() {
        return this.e;
    }

    public final oh2 e() {
        return this.c;
    }
}
