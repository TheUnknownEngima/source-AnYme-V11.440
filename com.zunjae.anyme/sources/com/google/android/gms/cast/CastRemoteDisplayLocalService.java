package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.view.Display;
import androidx.mediarouter.media.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final u60 q = new u60("CastRemoteDisplayLocalService");
    private static final Object r = new Object();
    private static AtomicBoolean s = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService t;
    /* access modifiers changed from: private */
    public WeakReference<a> e;
    private c f;
    /* access modifiers changed from: private */
    public CastDevice g;
    /* access modifiers changed from: private */
    public Display h;
    private Context i;
    private ServiceConnection j;
    private Handler k;
    private h l;
    /* access modifiers changed from: private */
    public boolean m = false;
    private h n;
    private final h.a o = new c2(this);
    private final IBinder p = new b(this);

    public interface a {
        void a(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void b(Status status);
    }

    class b extends Binder {
        b(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        }
    }

    static final class c extends BroadcastReceiver {
    }

    public static void b() {
        j(false);
    }

    /* access modifiers changed from: private */
    public final void h(boolean z) {
        ServiceConnection serviceConnection;
        k("Stopping Service");
        r.e("stopServiceInstanceInternal must be called on the main thread");
        if (!z && this.l != null) {
            k("Setting default route");
            h hVar = this.l;
            hVar.n(hVar.f());
        }
        if (this.f != null) {
            k("Unregistering notification receiver");
            unregisterReceiver(this.f);
        }
        k("stopRemoteDisplaySession");
        k("stopRemoteDisplay");
        this.n.x().b(new v(this));
        if (this.e.get() != null) {
            ((a) this.e.get()).a(this);
        }
        a();
        k("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
        if (this.l != null) {
            r.e("CastRemoteDisplayLocalService calls must be done on the main thread");
            k("removeMediaRouterCallback");
            this.l.l(this.o);
        }
        Context context = this.i;
        if (context != null && (serviceConnection = this.j) != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException unused) {
                k("No need to unbind service, already unbound");
            }
            this.j = null;
            this.i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1.k == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1.k.post(new com.google.android.gms.cast.d2(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r1.h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(boolean r4) {
        /*
            u60 r0 = q
            java.lang.String r1 = "Stopping Service"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.a(r1, r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = s
            r0.set(r2)
            java.lang.Object r0 = r
            monitor-enter(r0)
            com.google.android.gms.cast.CastRemoteDisplayLocalService r1 = t     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x0021
            u60 r4 = q     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "Service is already being stopped"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0044 }
            r4.c(r1, r2)     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x0021:
            com.google.android.gms.cast.CastRemoteDisplayLocalService r1 = t     // Catch:{ all -> 0x0044 }
            r2 = 0
            t = r2     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            android.os.Handler r0 = r1.k
            if (r0 == 0) goto L_0x0043
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r0 == r2) goto L_0x0040
            android.os.Handler r0 = r1.k
            com.google.android.gms.cast.d2 r2 = new com.google.android.gms.cast.d2
            r2.<init>(r1, r4)
            r0.post(r2)
            return
        L_0x0040:
            r1.h(r4)
        L_0x0043:
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.j(boolean):void");
    }

    /* access modifiers changed from: private */
    public final void k(String str) {
        q.a("[Instance: %s] %s", this, str);
    }

    /* access modifiers changed from: private */
    public final void l(String str) {
        q.c("[Instance: %s] %s", this, str);
    }

    public abstract void a();

    public IBinder onBind(Intent intent) {
        k("onBind");
        return this.p;
    }

    public void onCreate() {
        k("onCreate");
        super.onCreate();
        mb0 mb0 = new mb0(getMainLooper());
        this.k = mb0;
        mb0.postDelayed(new b2(this), 100);
        if (this.n == null) {
            this.n = g.a(this);
        }
        if (m.k()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_remote_display_local_service", getString(R$string.cast_notification_default_channel_name), 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        k("onStartCommand");
        this.m = true;
        return 2;
    }
}
