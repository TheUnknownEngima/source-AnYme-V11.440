package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;

public class r {
    public static void a(Status status, f81<Void> f81) {
        b(status, (Object) null, f81);
    }

    public static <TResult> void b(Status status, TResult tresult, f81<TResult> f81) {
        if (status.l()) {
            f81.c(tresult);
        } else {
            f81.b(new b(status));
        }
    }
}
