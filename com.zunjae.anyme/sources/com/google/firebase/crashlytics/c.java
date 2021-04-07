package com.google.firebase.crashlytics;

import defpackage.eb1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class c {
    private final ic1 a;

    class a implements Callable<Void> {
        final /* synthetic */ mb1 a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ dg1 c;
        final /* synthetic */ boolean d;
        final /* synthetic */ ic1 e;

        a(mb1 mb1, ExecutorService executorService, dg1 dg1, boolean z, ic1 ic1) {
            this.a = mb1;
            this.b = executorService;
            this.c = dg1;
            this.d = z;
            this.e = ic1;
        }

        /* renamed from: a */
        public Void call() {
            this.a.c(this.b, this.c);
            if (!this.d) {
                return null;
            }
            this.e.g(this.c);
            return null;
        }
    }

    private c(ic1 ic1) {
        this.a = ic1;
    }

    public static c a() {
        c cVar = (c) com.google.firebase.c.h().f(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: sb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: rb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: sb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: sb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: sb1} */
    /* JADX WARNING: type inference failed for: r0v16, types: [qb1, ob1] */
    /* JADX WARNING: type inference failed for: r6v2, types: [pb1, ob1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.crashlytics.c b(com.google.firebase.c r16, com.google.firebase.installations.g r17, defpackage.ib1 r18, defpackage.eb1 r19) {
        /*
            r8 = r16
            r0 = r19
            android.content.Context r9 = r16.g()
            java.lang.String r1 = r9.getPackageName()
            tc1 r2 = new tc1
            r3 = r17
            r2.<init>(r9, r1, r3)
            oc1 r4 = new oc1
            r4.<init>(r8)
            if (r18 != 0) goto L_0x0021
            kb1 r1 = new kb1
            r1.<init>()
            r3 = r1
            goto L_0x0023
        L_0x0021:
            r3 = r18
        L_0x0023:
            mb1 r11 = new mb1
            r11.<init>(r8, r9, r2, r4)
            if (r0 == 0) goto L_0x0071
            jb1 r1 = defpackage.jb1.f()
            java.lang.String r5 = "Firebase Analytics is available."
            r1.b(r5)
            rb1 r1 = new rb1
            r1.<init>(r0)
            com.google.firebase.crashlytics.a r5 = new com.google.firebase.crashlytics.a
            r5.<init>()
            eb1$a r0 = e(r0, r5)
            if (r0 == 0) goto L_0x0062
            jb1 r0 = defpackage.jb1.f()
            java.lang.String r6 = "Firebase Analytics listener registered successfully."
            r0.b(r6)
            qb1 r0 = new qb1
            r0.<init>()
            pb1 r6 = new pb1
            r7 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.<init>(r1, r7, r10)
            r5.d(r0)
            r5.e(r6)
            r1 = r6
            goto L_0x0084
        L_0x0062:
            jb1 r0 = defpackage.jb1.f()
            java.lang.String r5 = "Firebase Analytics listener registration failed."
            r0.b(r5)
            vb1 r0 = new vb1
            r0.<init>()
            goto L_0x0084
        L_0x0071:
            jb1 r0 = defpackage.jb1.f()
            java.lang.String r1 = "Firebase Analytics is unavailable."
            r0.b(r1)
            vb1 r0 = new vb1
            r0.<init>()
            sb1 r1 = new sb1
            r1.<init>()
        L_0x0084:
            r5 = r0
            r6 = r1
            java.lang.String r0 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r7 = defpackage.rc1.c(r0)
            ic1 r15 = new ic1
            r0 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.h()
            if (r0 != 0) goto L_0x00a5
            jb1 r0 = defpackage.jb1.f()
            java.lang.String r1 = "Unable to start Crashlytics."
            r0.d(r1)
            r0 = 0
            return r0
        L_0x00a5:
            java.lang.String r0 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r0 = defpackage.rc1.c(r0)
            dg1 r13 = r11.l(r9, r8, r0)
            boolean r14 = r15.o(r13)
            com.google.firebase.crashlytics.c$a r1 = new com.google.firebase.crashlytics.c$a
            r10 = r1
            r12 = r0
            r2 = r15
            r10.<init>(r11, r12, r13, r14, r15)
            defpackage.h81.c(r0, r1)
            com.google.firebase.crashlytics.c r0 = new com.google.firebase.crashlytics.c
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.c.b(com.google.firebase.c, com.google.firebase.installations.g, ib1, eb1):com.google.firebase.crashlytics.c");
    }

    private static eb1.a e(eb1 eb1, a aVar) {
        eb1.a g = eb1.g("clx", aVar);
        if (g == null) {
            jb1.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g = eb1.g("crash", aVar);
            if (g != null) {
                jb1.f().i("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g;
    }

    public void c(Throwable th) {
        if (th == null) {
            jb1.f().i("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.a.l(th);
        }
    }

    public void d(String str, String str2) {
        this.a.p(str, str2);
    }
}
