package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kt0  reason: default package */
public final class kt0 implements ot0 {
    private static final Map<Uri, kt0> g = new b0();
    private static final String[] h = {"key", "value"};
    private final ContentResolver a;
    private final Uri b;
    private final ContentObserver c = new mt0(this, (Handler) null);
    private final Object d = new Object();
    private volatile Map<String, String> e;
    private final List<pt0> f = new ArrayList();

    private kt0(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kt0 a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<kt0> r0 = defpackage.kt0.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, kt0> r1 = g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            kt0 r1 = (defpackage.kt0) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            kt0 r2 = new kt0     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, kt0> r3 = g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt0.a(android.content.ContentResolver, android.net.Uri):kt0");
    }

    static synchronized void d() {
        synchronized (kt0.class) {
            for (kt0 next : g.values()) {
                next.a.unregisterContentObserver(next.c);
            }
            g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) rt0.a(new nt0(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                map = this.e;
                if (map == null) {
                    map = g();
                    this.e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.d) {
            this.e = null;
            zt0.g();
        }
        synchronized (this) {
            for (pt0 zza : this.f) {
                zza.zza();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map e() {
        Cursor query = this.a.query(this.b, h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map b0Var = count <= 256 ? new b0(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                b0Var.put(query.getString(0), query.getString(1));
            }
            query.close();
            return b0Var;
        } finally {
            query.close();
        }
    }

    public final /* synthetic */ Object f(String str) {
        return b().get(str);
    }
}
