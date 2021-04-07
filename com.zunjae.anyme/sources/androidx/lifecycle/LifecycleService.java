package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements n {
    private final z e = new z(this);

    public h a() {
        return this.e.a();
    }

    public IBinder onBind(Intent intent) {
        this.e.b();
        return null;
    }

    public void onCreate() {
        this.e.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.e.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.e.e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
