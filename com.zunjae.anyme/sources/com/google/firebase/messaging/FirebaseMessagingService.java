package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.q0;
import com.google.firebase.iid.y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends EnhancedIntentService {
    private static final Queue<String> j = new ArrayDeque(10);

    private e81<Void> j(String str) {
        if (TextUtils.isEmpty(str)) {
            return h81.e(null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", str);
        return y.c(this).e(2, bundle);
    }

    private boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!j.contains(str)) {
            if (j.size() >= 10) {
                j.remove();
            }
            j.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Received duplicate message: ".concat(valueOf);
                return true;
            }
            new String("Received duplicate message: ");
            return true;
        }
    }

    private void l(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (q.t(extras)) {
            q qVar = new q(extras);
            ExecutorService c = g.c();
            try {
                if (!new c(this, qVar, c).a()) {
                    if (p.B(intent)) {
                        p.u(intent);
                    }
                } else {
                    return;
                }
            } finally {
                c.shutdown();
            }
        }
        r(new r(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void o(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        e81<Void> j2 = j(stringExtra);
        if (!k(stringExtra)) {
            v(intent);
        }
        try {
            h81.b(j2, m(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            sb.toString();
        }
    }

    private void p(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        if (p.B(intent)) {
            p.v(intent);
        }
    }

    private void v(Intent intent) {
        an b;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            if (p.B(intent)) {
                p.w(intent, (zm<String>) null);
            }
            if (p.A(intent) && (b = FirebaseMessaging.b()) != null) {
                p.w(intent, b.b("FCM_CLIENT_EVENT_LOGGING", String.class, vm.b("json"), l.a));
            }
            l(intent);
        } else if (c == 1) {
            q();
        } else if (c == 2) {
            s(intent.getStringExtra("google.message_id"));
        } else if (c != 3) {
            String valueOf = String.valueOf(stringExtra);
            if (valueOf.length() != 0) {
                "Received message with unknown type: ".concat(valueOf);
            } else {
                new String("Received message with unknown type: ");
            }
        } else {
            u(n(intent), new t(intent.getStringExtra("error")));
        }
    }

    /* access modifiers changed from: protected */
    public Intent c(Intent intent) {
        return q0.b().c();
    }

    public void d(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            o(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (p.B(intent)) {
                p.t(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown intent action: ".concat(valueOf);
            } else {
                new String("Unknown intent action: ");
            }
        }
    }

    public boolean e(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        p(intent);
        return true;
    }

    /* access modifiers changed from: package-private */
    public long m() {
        return TimeUnit.SECONDS.toMillis(1);
    }

    public void q() {
    }

    public void r(r rVar) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }
}
