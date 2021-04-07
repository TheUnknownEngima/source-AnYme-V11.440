package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;

final class o {
    private final Context a;
    private final c b;
    private final Handler c;
    private final PackageManager d;
    private final ArrayList<n> e = new ArrayList<>();
    private boolean f;
    private final BroadcastReceiver g = new a();
    private final Runnable h = new b();

    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            o.this.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            o.this.b();
        }
    }

    public interface c {
        void b(d dVar);

        void c(d dVar);
    }

    public o(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
        this.c = new Handler();
        this.d = context.getPackageManager();
    }

    private int a(String str, String str2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (this.e.get(i).G(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i;
        if (this.f) {
            int i2 = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    int a2 = a(serviceInfo.packageName, serviceInfo.name);
                    if (a2 < 0) {
                        n nVar = new n(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        nVar.P();
                        i = i2 + 1;
                        this.e.add(i2, nVar);
                        this.b.b(nVar);
                    } else if (a2 >= i2) {
                        n nVar2 = this.e.get(a2);
                        nVar2.P();
                        nVar2.N();
                        i = i2 + 1;
                        Collections.swap(this.e, a2, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.e.size()) {
                for (int size = this.e.size() - 1; size >= i2; size--) {
                    n nVar3 = this.e.get(size);
                    this.b.c(nVar3);
                    this.e.remove(nVar3);
                    nVar3.Q();
                }
            }
        }
    }

    public void c() {
        if (!this.f) {
            this.f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.a.registerReceiver(this.g, intentFilter, (String) null, this.c);
            this.c.post(this.h);
        }
    }
}
