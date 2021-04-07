package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

final class c1 {
    private PowerManager.WakeLock a;
    private boolean b;
    private boolean c;

    public c1(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void b() {
        PowerManager.WakeLock wakeLock = this.a;
        if (wakeLock != null) {
            if (!this.b || !this.c) {
                this.a.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z) {
        this.c = z;
        b();
    }
}
