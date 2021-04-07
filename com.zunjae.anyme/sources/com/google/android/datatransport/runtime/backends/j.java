package com.google.android.datatransport.runtime.backends;

import android.content.Context;

public final class j implements n02<i> {
    private final j12<Context> a;
    private final j12<kq> b;
    private final j12<kq> c;

    public j(j12<Context> j12, j12<kq> j122, j12<kq> j123) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
    }

    public static j a(j12<Context> j12, j12<kq> j122, j12<kq> j123) {
        return new j(j12, j122, j123);
    }

    /* renamed from: b */
    public i get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
