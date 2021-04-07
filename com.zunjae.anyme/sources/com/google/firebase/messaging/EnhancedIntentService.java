package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.iid.t0;
import com.google.firebase.iid.v0;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    final ExecutorService e = g.b();
    private Binder f;
    private final Object g = new Object();
    private int h;
    private int i = 0;

    class a implements v0.a {
        a() {
        }

        public e81<Void> a(Intent intent) {
            return EnhancedIntentService.this.h(intent);
        }
    }

    private void b(Intent intent) {
        if (intent != null) {
            t0.b(intent);
        }
        synchronized (this.g) {
            int i2 = this.i - 1;
            this.i = i2;
            if (i2 == 0) {
                i(this.h);
            }
        }
    }

    /* access modifiers changed from: private */
    public e81<Void> h(Intent intent) {
        if (e(intent)) {
            return h81.e(null);
        }
        f81 f81 = new f81();
        this.e.execute(new d(this, intent, f81));
        return f81.a();
    }

    /* access modifiers changed from: protected */
    public Intent c(Intent intent) {
        return intent;
    }

    public abstract void d(Intent intent);

    public boolean e(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Intent intent, e81 e81) {
        b(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(Intent intent, f81 f81) {
        try {
            d(intent);
        } finally {
            f81.c(null);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i2) {
        return stopSelfResult(i2);
    }

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable("EnhancedIntentService", 3);
        if (this.f == null) {
            this.f = new v0(new a());
        }
        return this.f;
    }

    public void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.g) {
            this.h = i3;
            this.i++;
        }
        Intent c = c(intent);
        if (c == null) {
            b(intent);
            return 2;
        }
        e81<Void> h2 = h(c);
        if (h2.p()) {
            b(intent);
            return 2;
        }
        h2.c(e.e, new f(this, intent));
        return 3;
    }
}
