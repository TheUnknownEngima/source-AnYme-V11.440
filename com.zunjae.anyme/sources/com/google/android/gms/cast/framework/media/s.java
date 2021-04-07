package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;

final class s implements k<Status> {
    private final long a;
    private final /* synthetic */ i.f b;

    s(i.f fVar, long j) {
        this.b = fVar;
        this.a = j;
    }

    public final /* synthetic */ void a(j jVar) {
        Status status = (Status) jVar;
        if (!status.l()) {
            i.this.c.D(this.a, status.i());
        }
    }
}
