package com.google.firebase;

import com.google.android.gms.common.internal.r;

public class d extends Exception {
    @Deprecated
    protected d() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        r.g(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, Throwable th) {
        super(str, th);
        r.g(str, "Detail message must not be empty");
    }
}
