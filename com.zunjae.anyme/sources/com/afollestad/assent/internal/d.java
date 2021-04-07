package com.afollestad.assent.internal;

import androidx.lifecycle.h;
import androidx.lifecycle.n;

public final class d {
    public static final Lifecycle a(Object obj, h.a[] aVarArr, z52<? super h.a, u22> z52) {
        v62.f(aVarArr, "watchFor");
        v62.f(z52, "onEvent");
        if (obj instanceof n) {
            return new Lifecycle((n) obj, aVarArr, z52);
        }
        return null;
    }
}
