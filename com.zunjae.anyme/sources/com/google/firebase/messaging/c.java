package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.h;
import com.google.android.gms.common.util.m;
import com.google.firebase.messaging.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class c {
    private final Executor a;
    private final Context b;
    private final q c;

    public c(Context context, q qVar, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = qVar;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!m.h()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(a.C0110a aVar) {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.c, aVar.a.d());
    }

    private o d() {
        o h = o.h(this.c.p("gcm.n.image"));
        if (h != null) {
            h.k(this.a);
        }
        return h;
    }

    private void e(h.e eVar, o oVar) {
        if (oVar != null) {
            try {
                Bitmap bitmap = (Bitmap) h81.b(oVar.i(), 5, TimeUnit.SECONDS);
                eVar.v(bitmap);
                h.b bVar = new h.b();
                bVar.m(bitmap);
                bVar.l((Bitmap) null);
                eVar.E(bVar);
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getCause());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(valueOf);
                sb.toString();
            } catch (InterruptedException unused) {
                oVar.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                oVar.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        o d = d();
        a.C0110a d2 = a.d(this.b, this.c);
        e(d2.a, d);
        c(d2);
        return true;
    }
}
