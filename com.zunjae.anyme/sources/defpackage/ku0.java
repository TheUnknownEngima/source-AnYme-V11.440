package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ku0  reason: default package */
public final class ku0 implements ot0 {
    private static final Map<String, ku0> f = new b0();
    private final SharedPreferences a;
    private final SharedPreferences.OnSharedPreferenceChangeListener b = new ju0(this);
    private final Object c = new Object();
    private volatile Map<String, ?> d;
    private final List<pt0> e = new ArrayList();

    private ku0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ku0, java.lang.Object, java.lang.String] */
    static ku0 a(Context context, String str) {
        ku0 ku0;
        ? r0 = 0;
        if (!((!it0.a() || r0.startsWith("direct_boot:")) ? true : it0.b(context))) {
            return r0;
        }
        synchronized (ku0.class) {
            ku0 = f.get(r0);
            if (ku0 == null) {
                ku0 = new ku0(d(context, r0));
                f.put(r0, ku0);
            }
        }
        return ku0;
    }

    static synchronized void b() {
        synchronized (ku0.class) {
            for (ku0 next : f.values()) {
                next.a.unregisterOnSharedPreferenceChangeListener(next.b);
            }
            f.clear();
        }
    }

    private static SharedPreferences d(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (it0.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.c) {
            this.d = null;
            zt0.g();
        }
        synchronized (this) {
            for (pt0 zza : this.e) {
                zza.zza();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object f(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.c) {
                map = this.d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.a.getAll();
                        this.d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
