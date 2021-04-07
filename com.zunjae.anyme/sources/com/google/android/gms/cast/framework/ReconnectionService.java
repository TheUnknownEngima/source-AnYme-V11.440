package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class ReconnectionService extends Service {
    private static final u60 f = new u60("ReconnectionService");
    private d0 e;

    public IBinder onBind(Intent intent) {
        try {
            return this.e.B(intent);
        } catch (RemoteException e2) {
            f.b(e2, "Unable to call %s on %s.", "onBind", d0.class.getSimpleName());
            return null;
        }
    }

    public void onCreate() {
        a d = a.d(this);
        d0 d2 = t90.d(this, d.b().f(), d.m().a());
        this.e = d2;
        try {
            d2.m();
        } catch (RemoteException e2) {
            f.b(e2, "Unable to call %s on %s.", "onCreate", d0.class.getSimpleName());
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.e.x();
        } catch (RemoteException e2) {
            f.b(e2, "Unable to call %s on %s.", "onDestroy", d0.class.getSimpleName());
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.e.K2(intent, i, i2);
        } catch (RemoteException e2) {
            f.b(e2, "Unable to call %s on %s.", "onStartCommand", d0.class.getSimpleName());
            return 1;
        }
    }
}
