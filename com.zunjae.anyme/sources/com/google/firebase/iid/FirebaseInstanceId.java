package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.firebase.c;
import com.google.firebase.iid.r0;
import com.google.firebase.installations.g;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static r0 j;
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    @GuardedBy("FirebaseInstanceId.class")
    static ScheduledExecutorService l;
    final Executor a;
    /* access modifiers changed from: private */
    public final c b;
    private final f0 c;
    private final s d;
    private final j0 e;
    private final g f;
    @GuardedBy("this")
    private boolean g;
    private final a h;

    private class a {
        private boolean a;
        private final rh1 b;
        @GuardedBy("this")
        private boolean c;
        @GuardedBy("this")
        private ph1<com.google.firebase.a> d;
        @GuardedBy("this")
        private Boolean e;

        a(rh1 rh1) {
            this.b = rh1;
        }

        private boolean c() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context g = FirebaseInstanceId.this.b.g();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(g.getPackageName());
                ResolveInfo resolveService = g.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Context g = FirebaseInstanceId.this.b.g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void a() {
            if (!this.c) {
                this.a = c();
                Boolean e2 = e();
                this.e = e2;
                if (e2 == null && this.a) {
                    p pVar = new p(this);
                    this.d = pVar;
                    this.b.a(com.google.firebase.a.class, pVar);
                }
                this.c = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            return r1.a && com.google.firebase.iid.FirebaseInstanceId.a(r1.f).p();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean b() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.a()     // Catch:{ all -> 0x0025 }
                java.lang.Boolean r0 = r1.e     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.a     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0025 }
                com.google.firebase.c r0 = r0.b     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.p()     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                r0 = 1
            L_0x0021:
                monitor-exit(r1)
                return r0
            L_0x0023:
                r0 = 0
                goto L_0x0021
            L_0x0025:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.b():boolean");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void d(oh1 oh1) {
            synchronized (this) {
                if (b()) {
                    FirebaseInstanceId.this.H();
                }
            }
        }
    }

    FirebaseInstanceId(c cVar, f0 f0Var, Executor executor, Executor executor2, rh1 rh1, pi1 pi1, uh1 uh1, g gVar) {
        this.g = false;
        if (f0.c(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (j == null) {
                    j = new r0(cVar.g());
                }
            }
            this.b = cVar;
            this.c = f0Var;
            this.d = new s(cVar, f0Var, pi1, uh1, gVar);
            this.a = executor2;
            this.h = new a(rh1);
            this.e = new j0(executor);
            this.f = gVar;
            executor2.execute(new j(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    FirebaseInstanceId(c cVar, rh1 rh1, pi1 pi1, uh1 uh1, g gVar) {
        this(cVar, new f0(cVar.g()), h.b(), h.b(), rh1, pi1, uh1, gVar);
    }

    private static String D(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: private */
    public void H() {
        if (J(r())) {
            G();
        }
    }

    private <T> T c(e81<T> e81) {
        try {
            return h81.b(e81, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    E();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static <T> T d(e81<T> e81) {
        r.k(e81, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e81.c(l.e, new m(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return o(e81);
    }

    private static void f(c cVar) {
        r.g(cVar.j().e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        r.g(cVar.j().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        r.g(cVar.j().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        r.b(x(cVar.j().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(w(cVar.j().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(c cVar) {
        f(cVar);
        return (FirebaseInstanceId) cVar.f(FirebaseInstanceId.class);
    }

    public static FirebaseInstanceId l() {
        return getInstance(c.h());
    }

    private e81<w> n(String str, String str2) {
        return h81.e(null).k(this.a, new k(this, str, D(str2)));
    }

    private static <T> T o(e81<T> e81) {
        if (e81.q()) {
            return e81.m();
        }
        if (e81.o()) {
            throw new CancellationException("Task is already canceled");
        } else if (e81.p()) {
            throw new IllegalStateException(e81.l());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    private String p() {
        return "[DEFAULT]".equals(this.b.i()) ? "" : this.b.k();
    }

    static boolean t() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    static boolean w(@Nonnull String str) {
        return k.matcher(str).matches();
    }

    static boolean x(@Nonnull String str) {
        return str.contains(":");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e81 A(String str, String str2, String str3) {
        return this.d.d(str, str2, str3).s(this.a, new o(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e81 B(String str, String str2, e81 e81) {
        String k2 = k();
        r0.a s = s(str, str2);
        return !J(s) ? h81.e(new x(k2, s.a)) : this.e.a(str, str2, new n(this, k2, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void C() {
        if (u()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void E() {
        j.d();
        if (u()) {
            G();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void F(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public synchronized void G() {
        if (!this.g) {
            I(0);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void I(long j2) {
        g(new s0(this, Math.min(Math.max(30, j2 << 1), i)), j2);
        this.g = true;
    }

    /* access modifiers changed from: package-private */
    public boolean J(r0.a aVar) {
        return aVar == null || aVar.b(this.c.a());
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return q(f0.c(this.b), "*");
    }

    /* access modifiers changed from: package-private */
    public void g(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (l == null) {
                l = new ScheduledThreadPoolExecutor(1, new r80("FirebaseInstanceId"));
            }
            l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        j.f(p());
        G();
    }

    /* access modifiers changed from: package-private */
    public c i() {
        return this.b;
    }

    public String j() {
        f(this.b);
        H();
        return k();
    }

    /* access modifiers changed from: package-private */
    public String k() {
        try {
            j.k(this.b.k());
            return (String) d(this.f.f());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public e81<w> m() {
        f(this.b);
        return n(f0.c(this.b), "*");
    }

    public String q(String str, String str2) {
        f(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((w) c(n(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public r0.a r() {
        return s(f0.c(this.b), "*");
    }

    /* access modifiers changed from: package-private */
    public r0.a s(String str, String str2) {
        return j.h(p(), str, str2);
    }

    public boolean u() {
        return this.h.b();
    }

    public boolean v() {
        return this.c.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e81 z(String str, String str2, String str3, String str4) {
        j.j(p(), str, str2, str4, this.c.a());
        return h81.e(new x(str3, str4));
    }
}
