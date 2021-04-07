package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class r {
    private final Context a;
    private final a b;
    /* access modifiers changed from: private */
    public boolean c;

    private final class a extends BroadcastReceiver implements Runnable {
        private final b e;
        private final Handler f;

        public a(Handler handler, b bVar) {
            this.f = handler;
            this.e = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f.post(this);
            }
        }

        public void run() {
            if (r.this.c) {
                this.e.k();
            }
        }
    }

    public interface b {
        void k();
    }

    public r(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void b(boolean z) {
        boolean z2;
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z2 = true;
        } else if (!z && this.c) {
            this.a.unregisterReceiver(this.b);
            z2 = false;
        } else {
            return;
        }
        this.c = z2;
    }
}
