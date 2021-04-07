package com.zunjae.zasync;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public abstract class b<Result> {
    private boolean a = false;
    private Application.ActivityLifecycleCallbacks b;
    private Application c;
    /* access modifiers changed from: private */
    public boolean d = false;

    class a implements Application.ActivityLifecycleCallbacks {
        final /* synthetic */ Activity e;

        a(Activity activity) {
            this.e = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity.getClass() == this.e.getClass()) {
                b.this.c();
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.zunjae.zasync.b$b  reason: collision with other inner class name */
    class C0220b implements Runnable {
        C0220b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            if (java.lang.System.currentTimeMillis() > ((com.zunjae.zasync.a) r0).a()) goto L_0x0008;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                com.zunjae.zasync.b r0 = com.zunjae.zasync.b.this
                boolean r0 = r0.d
                if (r0 == 0) goto L_0x000f
            L_0x0008:
                com.zunjae.zasync.b r0 = com.zunjae.zasync.b.this
                java.lang.Object r0 = r0.f()
                goto L_0x0031
            L_0x000f:
                com.zunjae.zasync.b r0 = com.zunjae.zasync.b.this
                boolean r0 = r0.h()
                if (r0 == 0) goto L_0x0008
                com.zunjae.zasync.b r0 = com.zunjae.zasync.b.this
                java.lang.Object r0 = r0.l()
                boolean r1 = r0 instanceof com.zunjae.zasync.a
                if (r1 == 0) goto L_0x0031
                long r1 = java.lang.System.currentTimeMillis()
                r3 = r0
                com.zunjae.zasync.a r3 = (com.zunjae.zasync.a) r3
                long r3 = r3.a()
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x0031
                goto L_0x0008
            L_0x0031:
                com.zunjae.zasync.b r1 = com.zunjae.zasync.b.this
                r1.e(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.zasync.b.C0220b.run():void");
        }
    }

    class c implements Runnable {
        final /* synthetic */ Object e;

        c(Object obj) {
            this.e = obj;
        }

        public void run() {
            b.this.j(this.e);
        }
    }

    public b(Activity activity) {
        d(activity);
    }

    private void d(Activity activity) {
        this.c = activity.getApplication();
        a aVar = new a(activity);
        this.b = aVar;
        Application application = this.c;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(aVar);
        }
    }

    /* access modifiers changed from: private */
    public void e(Result result) {
        if (!this.a) {
            new Handler(Looper.getMainLooper()).post(new c(result));
            Application application = this.c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.b);
            }
        }
    }

    public void c() {
        this.a = true;
        i();
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public abstract Result f();

    public void g() {
        k();
        new Thread(new C0220b()).start();
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j(Result result) {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public Result l() {
        return null;
    }
}
