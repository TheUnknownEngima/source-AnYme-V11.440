package com.google.firebase.messaging;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.f0;
import com.google.firebase.iid.s;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

final /* synthetic */ class y implements Callable {
    private final Context a;
    private final ScheduledExecutorService b;
    private final FirebaseInstanceId c;
    private final f0 d;
    private final s e;

    y(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, f0 f0Var, s sVar) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseInstanceId;
        this.d = f0Var;
        this.e = sVar;
    }

    public final Object call() {
        return z.j(this.a, this.b, this.c, this.d, this.e);
    }
}
