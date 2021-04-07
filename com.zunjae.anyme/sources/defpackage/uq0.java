package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.j6;
import com.google.android.gms.measurement.internal.r7;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: uq0  reason: default package */
public class uq0 {
    private static volatile uq0 i = null;
    /* access modifiers changed from: private */
    public static Boolean j = null;
    private static String k = "allow_remote_dynamite";
    /* access modifiers changed from: private */
    public final String a;
    protected final e b;
    private final ExecutorService c;
    private final f71 d;
    /* access modifiers changed from: private */
    public List<Pair<j6, c>> e;
    private int f;
    /* access modifiers changed from: private */
    public boolean g;
    /* access modifiers changed from: private */
    public z61 h;

    /* renamed from: uq0$a */
    abstract class a implements Runnable {
        final long e;
        final long f;
        private final boolean g;

        a(uq0 uq0) {
            this(true);
        }

        a(boolean z) {
            this.e = uq0.this.b.c();
            this.f = uq0.this.b.a();
            this.g = z;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (uq0.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                uq0.this.o(e2, false, this.g);
                b();
            }
        }
    }

    /* renamed from: uq0$b */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            uq0.this.k(new sr0(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            uq0.this.k(new xr0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            uq0.this.k(new tr0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            uq0.this.k(new ur0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            x61 x61 = new x61();
            uq0.this.k(new vr0(this, activity, x61));
            Bundle s3 = x61.s3(50);
            if (s3 != null) {
                bundle.putAll(s3);
            }
        }

        public final void onActivityStarted(Activity activity) {
            uq0.this.k(new rr0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            uq0.this.k(new wr0(this, activity));
        }
    }

    /* renamed from: uq0$c */
    static class c extends oq0 {
        private final j6 a;

        c(j6 j6Var) {
            this.a = j6Var;
        }

        public final void V1(String str, String str2, Bundle bundle, long j) {
            this.a.a(str, str2, bundle, j);
        }

        public final int zza() {
            return System.identityHashCode(this.a);
        }
    }

    private uq0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.a = (str == null || !H(str2, str3)) ? "FA" : str;
        this.b = h.d();
        this.c = xy0.a().a(new br0(this), w61.a);
        this.d = new f71(this);
        boolean z = false;
        if (!(!N(context) || U())) {
            this.g = true;
            return;
        }
        if (!H(str2, str3) && (str2 == null || str3 == null)) {
            boolean z2 = (str2 == null) ^ (str3 == null ? true : z);
        }
        k(new xq0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* access modifiers changed from: private */
    public static boolean H(String str, String str2) {
        return (str2 == null || str == null || U()) ? false : true;
    }

    private static boolean N(Context context) {
        try {
            return r7.b(context, "google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int O(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static int Q(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void S(android.content.Context r3) {
        /*
            java.lang.Class<uq0> r0 = defpackage.uq0.class
            monitor-enter(r0)
            java.lang.Boolean r1 = j     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0009:
            java.lang.String r1 = "app_measurement_internal_disable_startup_flags"
            boolean r1 = v(r3, r1)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0017
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0039 }
            j = r3     // Catch:{ Exception -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0017:
            java.lang.String r1 = "com.google.android.gms.measurement.prefs"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = k     // Catch:{ Exception -> 0x0039 }
            boolean r1 = r3.getBoolean(r1, r2)     // Catch:{ Exception -> 0x0039 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0039 }
            j = r1     // Catch:{ Exception -> 0x0039 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = k     // Catch:{ Exception -> 0x0039 }
            r3.remove(r1)     // Catch:{ Exception -> 0x0039 }
            r3.apply()     // Catch:{ Exception -> 0x0039 }
            goto L_0x003d
        L_0x0037:
            r3 = move-exception
            goto L_0x003f
        L_0x0039:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            j = r3     // Catch:{ all -> 0x0037 }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq0.S(android.content.Context):void");
    }

    private static boolean U() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static uq0 a(Context context) {
        return b(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static uq0 b(Context context, String str, String str2, String str3, Bundle bundle) {
        r.j(context);
        if (i == null) {
            synchronized (uq0.class) {
                if (i == null) {
                    i = new uq0(context, str, str2, str3, bundle);
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final void k(a aVar) {
        this.c.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void o(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            h(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
    }

    private final void r(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        k(new qr0(this, l, str, str2, bundle, z, z2));
    }

    private final void t(String str, String str2, Object obj, boolean z) {
        k(new pr0(this, str, str2, obj, z));
    }

    private static boolean v(Context context, String str) {
        r.f(str);
        try {
            ApplicationInfo c2 = v80.a(context).c(context.getPackageName(), 128);
            if (c2 != null) {
                if (c2.metaData != null) {
                    return c2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void B(String str) {
        k(new dr0(this, str));
    }

    public final void C(String str, String str2, Bundle bundle) {
        k(new zq0(this, str, str2, bundle));
    }

    public final String F() {
        x61 x61 = new x61();
        k(new fr0(this, x61));
        return x61.r3(500);
    }

    public final void G(String str) {
        k(new cr0(this, str));
    }

    public final int J(String str) {
        x61 x61 = new x61();
        k(new mr0(this, str, x61));
        Integer num = (Integer) x61.q3(x61.s3(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String K() {
        x61 x61 = new x61();
        k(new er0(this, x61));
        return x61.r3(50);
    }

    public final long M() {
        x61 x61 = new x61();
        k(new hr0(this, x61));
        Long l = (Long) x61.q3(x61.s3(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.c()).nextLong();
        int i2 = this.f + 1;
        this.f = i2;
        return nextLong + ((long) i2);
    }

    public final String P() {
        x61 x61 = new x61();
        k(new gr0(this, x61));
        return x61.r3(500);
    }

    public final String R() {
        x61 x61 = new x61();
        k(new kr0(this, x61));
        return x61.r3(500);
    }

    /* access modifiers changed from: protected */
    public final z61 c(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.l;
            } catch (DynamiteModule.a e2) {
                o(e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.j;
        }
        return y61.asInterface(DynamiteModule.d(context, bVar, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final f71 e() {
        return this.d;
    }

    public final Map<String, Object> g(String str, String str2, boolean z) {
        x61 x61 = new x61();
        k(new jr0(this, str, str2, z, x61));
        Bundle s3 = x61.s3(5000);
        if (s3 == null || s3.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(s3.size());
        for (String str3 : s3.keySet()) {
            Object obj = s3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void h(int i2, String str, Object obj, Object obj2, Object obj3) {
        k(new lr0(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void i(Activity activity, String str, String str2) {
        k(new ar0(this, activity, str, str2));
    }

    public final void j(Bundle bundle) {
        k(new wq0(this, bundle));
    }

    public final void n(j6 j6Var) {
        r.j(j6Var);
        k(new or0(this, j6Var));
    }

    public final void p(String str, String str2) {
        t((String) null, str, str2, false);
    }

    public final void q(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, (Long) null);
    }

    public final void s(String str, String str2, Object obj) {
        t(str, str2, obj, true);
    }

    public final void u(boolean z) {
        k(new nr0(this, z));
    }

    public final List<Bundle> z(String str, String str2) {
        x61 x61 = new x61();
        k(new yq0(this, str, str2, x61));
        List<Bundle> list = (List) x61.q3(x61.s3(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
