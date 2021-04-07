package com.google.firebase.iid;

import android.content.BroadcastReceiver;

final /* synthetic */ class q implements z71 {
    private final boolean a;
    private final BroadcastReceiver.PendingResult b;

    q(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = z;
        this.b = pendingResult;
    }

    public final void a(e81 e81) {
        FirebaseInstanceIdReceiver.d(this.a, this.b, e81);
    }
}
