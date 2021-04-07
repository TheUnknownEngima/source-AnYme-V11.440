package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class y extends w {
    private final Callable<String> e;

    private y(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.e = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return this.e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
