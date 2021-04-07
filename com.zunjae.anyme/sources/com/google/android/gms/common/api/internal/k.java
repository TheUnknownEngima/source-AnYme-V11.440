package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.r;

public class k {
    public static <L> j<L> a(L l, Looper looper, String str) {
        r.k(l, "Listener must not be null");
        r.k(looper, "Looper must not be null");
        r.k(str, "Listener type must not be null");
        return new j<>(looper, l, str);
    }
}
