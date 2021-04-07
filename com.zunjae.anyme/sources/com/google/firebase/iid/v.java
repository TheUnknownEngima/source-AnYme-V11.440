package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ExecutorService;

class v implements a {
    private final ExecutorService a;

    v(ExecutorService executorService) {
        this.a = executorService;
    }

    private static int c(Intent intent) {
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra == null) {
            return -1;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
            sb.append("Received command: ");
            sb.append(stringExtra);
            sb.append(" - ");
            sb.append(valueOf);
            sb.toString();
        }
        if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
            FirebaseInstanceId.l().E();
            return -1;
        } else if (!"SYNC".equals(stringExtra)) {
            return -1;
        } else {
            FirebaseInstanceId.l().h();
            return -1;
        }
    }

    public e81<Integer> a(Intent intent) {
        return h81.c(this.a, new u(intent));
    }
}
