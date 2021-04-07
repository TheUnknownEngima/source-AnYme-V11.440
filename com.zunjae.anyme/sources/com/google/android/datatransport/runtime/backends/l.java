package com.google.android.datatransport.runtime.backends;

import android.content.Context;

public final class l implements n02<k> {
    private final j12<Context> a;
    private final j12<i> b;

    public l(j12<Context> j12, j12<i> j122) {
        this.a = j12;
        this.b = j122;
    }

    public static l a(j12<Context> j12, j12<i> j122) {
        return new l(j12, j122);
    }

    /* renamed from: b */
    public k get() {
        return new k(this.a.get(), this.b.get());
    }
}
