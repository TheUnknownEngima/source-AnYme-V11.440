package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    private final ExecutorService g = h.b();

    static final /* synthetic */ void d(boolean z, BroadcastReceiver.PendingResult pendingResult, e81 e81) {
        if (z) {
            pendingResult.setResultCode(e81.q() ? ((Integer) e81.m()).intValue() : 500);
        }
        pendingResult.finish();
    }

    private static Intent e(Context context, Intent intent) {
        Intent i = q0.i(intent);
        if (i != null) {
            intent = i;
        }
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        return intent;
    }

    private final void f(Context context, Intent intent) {
        ("google.com/iid".equals(intent.getStringExtra("from")) ? new v(this.g) : new f(context, this.g)).a(intent).c(this.g, new q(isOrderedBroadcast(), goAsync()));
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            f(context, e(context, intent));
        }
    }
}
