package io.karn.notify;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.h;

public final class a {
    /* access modifiers changed from: private */
    public static y02 b = new y02((NotificationManager) null, (b12) null, (z02) null, 7, (r62) null);
    public static final C0244a c = new C0244a((r62) null);
    private Context a;

    /* renamed from: io.karn.notify.a$a  reason: collision with other inner class name */
    public static final class C0244a {
        private C0244a() {
        }

        public /* synthetic */ C0244a(r62 r62) {
            this();
        }

        public final y02 a() {
            return a.b;
        }

        public final b b(Context context) {
            v62.f(context, "context");
            return new b(new a(context));
        }
    }

    public a(Context context) {
        v62.f(context, "context");
        this.a = context;
        Context applicationContext = context.getApplicationContext();
        v62.b(applicationContext, "context.applicationContext");
        this.a = applicationContext;
        if (b.c() == null) {
            y02 y02 = b;
            Object systemService = this.a.getSystemService("notification");
            if (systemService != null) {
                y02.d((NotificationManager) systemService);
            } else {
                throw new r22("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        e12.a.a(b.a());
    }

    public final h.e b(h12 h12) {
        v62.f(h12, "payload");
        return f12.a.a(this, h12);
    }

    public final Context c() {
        return this.a;
    }

    public final int d(Integer num, h.e eVar) {
        v62.f(eVar, "builder");
        f12 f12 = f12.a;
        NotificationManager c2 = b.c();
        if (c2 != null) {
            return f12.c(c2, num, eVar);
        }
        v62.l();
        throw null;
    }
}
