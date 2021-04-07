package defpackage;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mc1  reason: default package */
class mc1 implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final eg1 b;
    private final Thread.UncaughtExceptionHandler c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: mc1$a */
    interface a {
        void a(eg1 eg1, Thread thread, Throwable th);
    }

    public mc1(a aVar, eg1 eg1, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.b = eg1;
        this.c = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.d.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        jb1 f;
        String str;
        this.d.set(true);
        if (thread == null) {
            try {
                f = jb1.f();
                str = "Could not handle uncaught exception; null thread";
            } catch (Exception e) {
                jb1.f().e("An error occurred in the uncaught exception handler", e);
            } catch (Throwable th2) {
                jb1.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.d.set(false);
                throw th2;
            }
        } else if (th == null) {
            f = jb1.f();
            str = "Could not handle uncaught exception; null throwable";
        } else {
            this.a.a(this.b, thread, th);
            jb1.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.d.set(false);
        }
        f.d(str);
        jb1.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, th);
        this.d.set(false);
    }
}
