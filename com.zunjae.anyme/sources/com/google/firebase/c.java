package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.m;
import com.google.android.gms.common.util.n;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.f;
import com.google.firebase.components.h;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

public class c {
    /* access modifiers changed from: private */
    public static final Object i = new Object();
    private static final Executor j = new d();
    @GuardedBy("LOCK")
    static final Map<String, c> k = new b0();
    private final Context a;
    private final String b;
    private final e c;
    private final l d;
    /* access modifiers changed from: private */
    public final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final s<hi1> g;
    private final List<b> h = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c  reason: collision with other inner class name */
    private static class C0108c implements c.a {
        private static AtomicReference<C0108c> a = new AtomicReference<>();

        private C0108c() {
        }

        /* access modifiers changed from: private */
        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0108c cVar = new C0108c();
                    if (a.compareAndSet((Object) null, cVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(cVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (c.i) {
                Iterator it = new ArrayList(c.k.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {
        private static final Handler e = new Handler(Looper.getMainLooper());

        private d() {
        }

        public void execute(Runnable runnable) {
            e.post(runnable);
        }
    }

    @TargetApi(24)
    private static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (c.i) {
                for (c b2 : c.k.values()) {
                    b2.l();
                }
            }
            c();
        }
    }

    protected c(Context context, String str, e eVar) {
        new CopyOnWriteArrayList();
        r.j(context);
        this.a = context;
        r.f(str);
        this.b = str;
        r.j(eVar);
        this.c = eVar;
        List<h> a2 = f.b(context, ComponentDiscoveryService.class).a();
        String a3 = mi1.a();
        Executor executor = j;
        com.google.firebase.components.d[] dVarArr = new com.google.firebase.components.d[8];
        dVarArr[0] = com.google.firebase.components.d.n(context, Context.class, new Class[0]);
        dVarArr[1] = com.google.firebase.components.d.n(this, c.class, new Class[0]);
        dVarArr[2] = com.google.firebase.components.d.n(eVar, e.class, new Class[0]);
        dVarArr[3] = oi1.a("fire-android", "");
        dVarArr[4] = oi1.a("fire-core", "19.3.1");
        dVarArr[5] = a3 != null ? oi1.a("kotlin", a3) : null;
        dVarArr[6] = ki1.b();
        dVarArr[7] = th1.b();
        this.d = new l(executor, a2, dVarArr);
        this.g = new s<>(b.a(this, context));
    }

    private void e() {
        r.n(!this.f.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (i) {
            cVar = k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!d3.a(this.a)) {
            "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + i();
            e.b(this.a);
            return;
        }
        "Device unlocked: initializing all Firebase APIs for app " + i();
        this.d.e(q());
    }

    public static c m(Context context) {
        synchronized (i) {
            if (k.containsKey("[DEFAULT]")) {
                c h2 = h();
                return h2;
            }
            e a2 = e.a(context);
            if (a2 == null) {
                return null;
            }
            c n = n(context, a2);
            return n;
        }
    }

    public static c n(Context context, e eVar) {
        return o(context, eVar, "[DEFAULT]");
    }

    public static c o(Context context, e eVar, String str) {
        c cVar;
        C0108c.c(context);
        String s = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (i) {
            boolean z = !k.containsKey(s);
            r.n(z, "FirebaseApp name " + s + " already exists!");
            r.k(context, "Application context cannot be null.");
            cVar = new c(context, s, eVar);
            k.put(s, cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ hi1 r(c cVar, Context context) {
        return new hi1(context, cVar.k(), (qh1) cVar.d.a(qh1.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    public void t(boolean z) {
        for (b a2 : this.h) {
            a2.a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.b.equals(((c) obj).i());
    }

    public <T> T f(Class<T> cls) {
        e();
        return this.d.a(cls);
    }

    public Context g() {
        e();
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String i() {
        e();
        return this.b;
    }

    public e j() {
        e();
        return this.c;
    }

    public String k() {
        return com.google.android.gms.common.util.c.a(i().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(j().c().getBytes(Charset.defaultCharset()));
    }

    public boolean p() {
        e();
        return this.g.get().b();
    }

    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        q.a c2 = q.c(this);
        c2.a("name", this.b);
        c2.a("options", this.c);
        return c2.toString();
    }
}
