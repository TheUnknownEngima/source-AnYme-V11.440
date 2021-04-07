package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* renamed from: c60  reason: default package */
public class c60 {
    @GuardedBy("this")
    private com.google.android.gms.common.a a;
    @GuardedBy("this")
    private f90 b;
    @GuardedBy("this")
    private boolean c;
    private final Object d = new Object();
    @GuardedBy("mAutoDisconnectTaskLock")
    private b e;
    @GuardedBy("this")
    private final Context f;
    private final boolean g;
    private final long h;

    /* renamed from: c60$a */
    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: c60$b */
    static class b extends Thread {
        private WeakReference<c60> e;
        private long f;
        CountDownLatch g = new CountDownLatch(1);
        boolean h = false;

        public b(c60 c60, long j) {
            this.e = new WeakReference<>(c60);
            this.f = j;
            start();
        }

        private final void a() {
            c60 c60 = (c60) this.e.get();
            if (c60 != null) {
                c60.a();
                this.h = true;
            }
        }

        public final void run() {
            try {
                if (!this.g.await(this.f, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private c60(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        r.j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.h = j;
        this.g = z2;
    }

    public static a b(Context context) {
        e60 e60 = new e60(context);
        boolean a2 = e60.a("gads:ad_id_app_context:enabled", false);
        float b2 = e60.b("gads:ad_id_app_context:ping_ratio", Utils.FLOAT_EPSILON);
        String c2 = e60.c("gads:ad_id_use_shared_preference:experiment_id", "");
        c60 c60 = new c60(context, -1, a2, e60.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c60.h(false);
            a c3 = c60.c();
            c60.i(c3, a2, b2, SystemClock.elapsedRealtime() - elapsedRealtime, c2, (Throwable) null);
            c60.a();
            return c3;
        } catch (Throwable th) {
            c60.a();
            throw th;
        }
    }

    public static void d(boolean z) {
    }

    private static com.google.android.gms.common.a e(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h2 = f.f().h(context, i.a);
            if (h2 == 0 || h2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (com.google.android.gms.common.stats.a.b().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static f90 f(Context context, com.google.android.gms.common.a aVar) {
        try {
            return g90.p3(aVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            c60$b r1 = r6.e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            c60$b r1 = r6.e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.g     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            c60$b r1 = r6.e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            c60$b r1 = new c60$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c60.g():void");
    }

    private final void h(boolean z) {
        r.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            com.google.android.gms.common.a e2 = e(this.f, this.g);
            this.a = e2;
            this.b = f(this.f, e2);
            this.c = true;
            if (z) {
                g();
            }
        }
    }

    private final boolean i(a aVar, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new d60(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.r.i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            com.google.android.gms.common.a r0 = r3.a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.a.b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.a r2 = r3.a     // Catch:{ all -> 0x001e }
            r0.c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x002a }
            r3.a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c60.a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.c60.a c() {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.r.i(r0)
            monitor-enter(r4)
            boolean r0 = r4.c     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r4.d     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)     // Catch:{ all -> 0x0066 }
            c60$b r1 = r4.e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            c60$b r1 = r4.e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.h     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r4.h(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r4.c     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x003d:
            com.google.android.gms.common.a r0 = r4.a     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.r.j(r0)     // Catch:{ all -> 0x0066 }
            f90 r0 = r4.b     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.r.j(r0)     // Catch:{ all -> 0x0066 }
            c60$a r0 = new c60$a     // Catch:{ RemoteException -> 0x005e }
            f90 r1 = r4.b     // Catch:{ RemoteException -> 0x005e }
            java.lang.String r1 = r1.f()     // Catch:{ RemoteException -> 0x005e }
            f90 r2 = r4.b     // Catch:{ RemoteException -> 0x005e }
            r3 = 1
            boolean r2 = r2.Z0(r3)     // Catch:{ RemoteException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            r4.g()
            return r0
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c60.c():c60$a");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }
}
