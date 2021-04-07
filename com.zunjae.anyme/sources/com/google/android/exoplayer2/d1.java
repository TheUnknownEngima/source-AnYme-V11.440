package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

final class d1 {
    private WifiManager.WifiLock a;
    private boolean b;
    private boolean c;

    public d1(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void b() {
        WifiManager.WifiLock wifiLock = this.a;
        if (wifiLock != null) {
            if (!this.b || !this.c) {
                this.a.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z) {
        this.c = z;
        b();
    }
}
