package com.google.firebase.iid;

import java.util.concurrent.ScheduledFuture;

final /* synthetic */ class x0 implements z71 {
    private final ScheduledFuture a;

    x0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void a(e81 e81) {
        this.a.cancel(false);
    }
}
