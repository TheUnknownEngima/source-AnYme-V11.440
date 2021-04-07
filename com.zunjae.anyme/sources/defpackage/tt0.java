package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.content.b;
import javax.annotation.Nullable;

/* renamed from: tt0  reason: default package */
final class tt0 implements ot0 {
    private static tt0 c;
    @Nullable
    private final Context a;
    @Nullable
    private final ContentObserver b;

    private tt0() {
        this.a = null;
        this.b = null;
    }

    private tt0(Context context) {
        this.a = context;
        this.b = new vt0(this, (Handler) null);
        context.getContentResolver().registerContentObserver(gt0.a, true, this.b);
    }

    static tt0 a(Context context) {
        tt0 tt0;
        synchronized (tt0.class) {
            if (c == null) {
                c = b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new tt0(context) : new tt0();
            }
            tt0 = c;
        }
        return tt0;
    }

    static synchronized void b() {
        synchronized (tt0.class) {
            if (!(c == null || c.a == null || c.b == null)) {
                c.a.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String f(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) rt0.a(new st0(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            } else {
                new String("Unable to read GServices for: ");
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return gt0.a(this.a.getContentResolver(), str, (String) null);
    }
}
