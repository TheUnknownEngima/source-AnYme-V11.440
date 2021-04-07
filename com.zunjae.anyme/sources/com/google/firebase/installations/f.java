package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.firebase.c;
import com.google.firebase.installations.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class f implements g {
    private static final Object l = new Object();
    private static final ThreadFactory m = new a();
    private final c a;
    private final ei1 b;
    private final ai1 c;
    private final o d;
    private final zh1 e;
    private final m f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;
    private final List<n> k;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                gi1$b[] r0 = defpackage.gi1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                gi1$b r2 = defpackage.gi1.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                gi1$b r3 = defpackage.gi1.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                gi1$b r3 = defpackage.gi1.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                fi1$b[] r2 = defpackage.fi1.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                fi1$b r3 = defpackage.fi1.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                fi1$b r2 = defpackage.fi1.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.f.b.<clinit>():void");
        }
    }

    f(c cVar, pi1 pi1, uh1 uh1) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), m), cVar, new ei1(cVar.g(), pi1, uh1), new ai1(cVar), new o(), new zh1(cVar), new m());
    }

    f(ExecutorService executorService, c cVar, ei1 ei1, ai1 ai1, o oVar, zh1 zh1, m mVar) {
        this.g = new Object();
        this.k = new ArrayList();
        this.a = cVar;
        this.b = ei1;
        this.c = ai1;
        this.d = oVar;
        this.e = zh1;
        this.f = mVar;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), m);
    }

    private e81<l> b() {
        f81 f81 = new f81();
        d(new j(this.d, f81));
        return f81.a();
    }

    private e81<String> c() {
        f81 f81 = new f81();
        d(new k(f81));
        return f81.a();
    }

    private void d(n nVar) {
        synchronized (this.g) {
            this.k.add(nVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(boolean r3) {
        /*
            r2 = this;
            bi1 r0 = r2.n()
            boolean r1 = r0.i()     // Catch:{ h -> 0x0059 }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ h -> 0x0059 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.o r3 = r2.d     // Catch:{ h -> 0x0059 }
            boolean r3 = r3.b(r0)     // Catch:{ h -> 0x0059 }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            bi1 r3 = r2.h(r0)     // Catch:{ h -> 0x0059 }
            goto L_0x0026
        L_0x0022:
            bi1 r3 = r2.w(r0)     // Catch:{ h -> 0x0059 }
        L_0x0026:
            r2.q(r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.d()
            r2.z(r0)
        L_0x0036:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x0047
            com.google.firebase.installations.h r0 = new com.google.firebase.installations.h
            com.google.firebase.installations.h$a r1 = com.google.firebase.installations.h.a.BAD_CONFIG
            r0.<init>(r1)
        L_0x0043:
            r2.x(r3, r0)
            goto L_0x0058
        L_0x0047:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0055
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            goto L_0x0043
        L_0x0055:
            r2.y(r3)
        L_0x0058:
            return
        L_0x0059:
            r3 = move-exception
            r2.x(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.f.e(boolean):void");
    }

    /* access modifiers changed from: private */
    public final void g(boolean z) {
        bi1 o = o();
        if (z) {
            o = o.p();
        }
        y(o);
        this.i.execute(e.a(this, z));
    }

    private bi1 h(bi1 bi1) {
        gi1 e2 = this.b.e(i(), bi1.d(), p(), bi1.f());
        int i2 = b.b[e2.b().ordinal()];
        if (i2 == 1) {
            return bi1.o(e2.c(), e2.d(), this.d.a());
        } else if (i2 == 2) {
            return bi1.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                z((String) null);
                return bi1.r();
            }
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
    }

    private synchronized String k() {
        return this.j;
    }

    public static f l() {
        return m(c.h());
    }

    public static f m(c cVar) {
        r.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (f) cVar.f(g.class);
    }

    private bi1 n() {
        bi1 c2;
        synchronized (l) {
            b a2 = b.a(this.a.g(), "generatefid.lock");
            try {
                c2 = this.c.c();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private bi1 o() {
        bi1 c2;
        synchronized (l) {
            b a2 = b.a(this.a.g(), "generatefid.lock");
            try {
                c2 = this.c.c();
                if (c2.j()) {
                    String v = v(c2);
                    ai1 ai1 = this.c;
                    c2 = c2.t(v);
                    ai1.a(c2);
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private void q(bi1 bi1) {
        synchronized (l) {
            b a2 = b.a(this.a.g(), "generatefid.lock");
            try {
                this.c.a(bi1);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
    }

    private void u() {
        r.g(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(o.d(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(o.c(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String v(bi1 bi1) {
        if ((!this.a.i().equals("CHIME_ANDROID_SDK") && !this.a.q()) || !bi1.m()) {
            return this.f.a();
        }
        String f2 = this.e.f();
        return TextUtils.isEmpty(f2) ? this.f.a() : f2;
    }

    private bi1 w(bi1 bi1) {
        fi1 d2 = this.b.d(i(), bi1.d(), p(), j(), (bi1.d() == null || bi1.d().length() != 11) ? null : this.e.i());
        int i2 = b.a[d2.e().ordinal()];
        if (i2 == 1) {
            return bi1.s(d2.c(), d2.d(), this.d.a(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return bi1.q("BAD CONFIG");
        } else {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
    }

    private void x(bi1 bi1, Exception exc) {
        synchronized (this.g) {
            Iterator<n> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(bi1, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void y(bi1 bi1) {
        synchronized (this.g) {
            Iterator<n> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().b(bi1)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void z(String str) {
        this.j = str;
    }

    public e81<l> a(boolean z) {
        u();
        e81<l> b2 = b();
        this.h.execute(d.a(this, z));
        return b2;
    }

    public e81<String> f() {
        u();
        String k2 = k();
        if (k2 != null) {
            return h81.e(k2);
        }
        e81<String> c2 = c();
        this.h.execute(c.a(this));
        return c2;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.a.j().b();
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.a.j().c();
    }

    /* access modifiers changed from: package-private */
    public String p() {
        return this.a.j().e();
    }
}
