package com.google.firebase;

import android.content.Context;

final /* synthetic */ class b implements xh1 {
    private final c a;
    private final Context b;

    private b(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
    }

    public static xh1 a(c cVar, Context context) {
        return new b(cVar, context);
    }

    public Object get() {
        return c.r(this.a, this.b);
    }
}
