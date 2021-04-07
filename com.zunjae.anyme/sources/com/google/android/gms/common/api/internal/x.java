package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

final class x implements c.a {
    private final /* synthetic */ f a;

    x(f fVar) {
        this.a = fVar;
    }

    public final void a(boolean z) {
        this.a.q.sendMessage(this.a.q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
