package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final c i = new c();
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean();
    @GuardedBy("sInstance")
    private final ArrayList<a> g = new ArrayList<>();
    @GuardedBy("sInstance")
    private boolean h = false;

    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static c b() {
        return i;
    }

    public static void c(Application application) {
        synchronized (i) {
            if (!i.h) {
                application.registerActivityLifecycleCallbacks(i);
                application.registerComponentCallbacks(i);
                i.h = true;
            }
        }
    }

    private final void e(boolean z) {
        synchronized (i) {
            ArrayList<a> arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (i) {
            this.g.add(aVar);
        }
    }

    public final boolean d() {
        return this.e.get();
    }

    @TargetApi(16)
    public final boolean f(boolean z) {
        if (!this.f.get()) {
            if (!m.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.e.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.e.compareAndSet(true, false);
        this.f.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.e.compareAndSet(true, false);
        this.f.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.e.compareAndSet(false, true)) {
            this.f.set(true);
            e(true);
        }
    }
}
