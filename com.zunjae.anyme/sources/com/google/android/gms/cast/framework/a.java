package com.google.android.gms.cast.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.h;
import com.google.android.gms.common.internal.r;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class a {
    private static final u60 k = new u60("CastContext");
    private static a l;
    private static final Object m = new Object();
    private final Context a;
    private final x b;
    private final g c;
    private final w d;
    private final b e;
    private aa0 f;
    private s90 g;
    private final List<i> h;
    private ob0 i;
    private SharedPreferences j;

    private a(Context context, b bVar, List<i> list, aa0 aa0) {
        c0 c0Var;
        h0 h0Var;
        this.a = context.getApplicationContext();
        this.e = bVar;
        this.f = aa0;
        this.h = list;
        k();
        x b2 = t90.b(this.a, bVar, aa0, j());
        this.b = b2;
        g gVar = null;
        try {
            c0Var = b2.I0();
        } catch (RemoteException e2) {
            k.b(e2, "Unable to call %s on %s.", "getDiscoveryManagerImpl", x.class.getSimpleName());
            c0Var = null;
        }
        this.d = c0Var == null ? null : new w(c0Var);
        try {
            h0Var = this.b.s();
        } catch (RemoteException e3) {
            k.b(e3, "Unable to call %s on %s.", "getSessionManagerImpl", x.class.getSimpleName());
            h0Var = null;
        }
        this.c = h0Var != null ? new g(h0Var, this.a) : gVar;
        g gVar2 = this.c;
        if (gVar2 != null) {
            new e(this.e, gVar2, i(this.a));
        }
        i(this.a).x(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).f(new j(this));
    }

    public static a c() {
        r.e("Must be called from the main thread.");
        return l;
    }

    public static a d(Context context) {
        r.e("Must be called from the main thread.");
        if (l == null) {
            synchronized (m) {
                if (l == null) {
                    d g2 = g(context.getApplicationContext());
                    try {
                        l = new a(context, g2.b(context.getApplicationContext()), g2.a(context.getApplicationContext()), new aa0(h.g(context)));
                    } catch (n e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return l;
    }

    public static a e(Context context) {
        r.e("Must be called from the main thread.");
        try {
            return d(context);
        } catch (RuntimeException e2) {
            k.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e2);
            return null;
        }
    }

    private static d g(Context context) {
        try {
            Bundle bundle = v80.a(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                k.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (d) Class.forName(string).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    private static r70 i(Context context) {
        return new r70(context);
    }

    private final Map<String, IBinder> j() {
        HashMap hashMap = new HashMap();
        s90 s90 = this.g;
        if (s90 != null) {
            hashMap.put(s90.b(), this.g.e());
        }
        List<i> list = this.h;
        if (list != null) {
            for (i next : list) {
                r.k(next, "Additional SessionProvider must not be null.");
                String b2 = next.b();
                r.g(b2, "Category for SessionProvider must not be null or empty string.");
                r.b(!hashMap.containsKey(b2), String.format("SessionProvider for category %s already added", new Object[]{b2}));
                hashMap.put(b2, next.e());
            }
        }
        return hashMap;
    }

    private final void k() {
        this.g = !TextUtils.isEmpty(this.e.l()) ? new s90(this.a, this.e, this.f) : null;
    }

    public b a() {
        r.e("Must be called from the main thread.");
        return this.e;
    }

    public g b() {
        r.e("Must be called from the main thread.");
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Bundle bundle) {
        if (ob0.d) {
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && this.c != null;
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
            if (z || z2) {
                String packageName = this.a.getPackageName();
                this.j = this.a.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", new Object[]{this.a.getPackageName(), "client_cast_analytics_data"}), 0);
                jo.f(this.a);
                this.i = ob0.a(this.j, jo.c().g(com.google.android.datatransport.cct.a.g).a("CAST_SENDER_SDK", yi0.class, r.a), bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"));
                if (z) {
                    i(this.a).y(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}).f(new s(this));
                }
                if (z2) {
                    bn0.b(this.j, this.i, packageName);
                    bn0.c(vh0.CAST_CONTEXT);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(Bundle bundle) {
        new jf0(this.j, this.i, bundle, this.a.getPackageName()).d(this.c);
    }

    public final boolean l() {
        r.e("Must be called from the main thread.");
        try {
            return this.b.k();
        } catch (RemoteException e2) {
            k.b(e2, "Unable to call %s on %s.", "hasActivityInRecents", x.class.getSimpleName());
            return false;
        }
    }

    public final w m() {
        r.e("Must be called from the main thread.");
        return this.d;
    }
}
