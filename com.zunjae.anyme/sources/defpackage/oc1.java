package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.c;

/* renamed from: oc1  reason: default package */
public class oc1 {
    private final SharedPreferences a;
    private final c b;
    private final Object c = new Object();
    f81<Void> d = new f81<>();
    private boolean e = false;
    private Boolean f;
    private f81<Void> g = new f81<>();

    public oc1(c cVar) {
        Context g2 = cVar.g();
        this.b = cVar;
        this.a = dc1.t(g2);
        Boolean b2 = b();
        this.f = b2 == null ? a(g2) : b2;
        synchronized (this.c) {
            if (d()) {
                this.d.e(null);
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f2 = f(context);
        if (f2 == null) {
            this.e = false;
            return null;
        }
        this.e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f2));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.e = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private void e(boolean z) {
        jb1.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z ? "ENABLED" : "DISABLED", this.f == null ? "global Firebase setting" : this.e ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            jb1.f().c("Unable to get PackageManager. Falling through", e2);
            return null;
        }
    }

    public void c(boolean z) {
        if (z) {
            this.g.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean booleanValue;
        booleanValue = this.f != null ? this.f.booleanValue() : this.b.p();
        e(booleanValue);
        return booleanValue;
    }

    public e81<Void> g() {
        e81<Void> a2;
        synchronized (this.c) {
            a2 = this.d.a();
        }
        return a2;
    }

    public e81<Void> h() {
        return gd1.h(this.g.a(), g());
    }
}
