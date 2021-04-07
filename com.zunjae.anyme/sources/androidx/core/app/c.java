package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class c {
    protected static final Class<?> a = a();
    protected static final Field b = b();
    protected static final Field c = f();
    protected static final Method d = d(a);
    protected static final Method e = c(a);
    protected static final Method f = e(a);
    private static final Handler g = new Handler(Looper.getMainLooper());

    static class a implements Runnable {
        final /* synthetic */ d e;
        final /* synthetic */ Object f;

        a(d dVar, Object obj) {
            this.e = dVar;
            this.f = obj;
        }

        public void run() {
            this.e.e = this.f;
        }
    }

    static class b implements Runnable {
        final /* synthetic */ Application e;
        final /* synthetic */ d f;

        b(Application application, d dVar) {
            this.e = application;
            this.f = dVar;
        }

        public void run() {
            this.e.unregisterActivityLifecycleCallbacks(this.f);
        }
    }

    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    static class C0018c implements Runnable {
        final /* synthetic */ Object e;
        final /* synthetic */ Object f;

        C0018c(Object obj, Object obj2) {
            this.e = obj;
            this.f = obj2;
        }

        public void run() {
            try {
                if (c.d != null) {
                    c.d.invoke(this.e, new Object[]{this.f, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                c.e.invoke(this.e, new Object[]{this.f, Boolean.FALSE});
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {
        Object e;
        private Activity f;
        private boolean g = false;
        private boolean h = false;
        private boolean i = false;

        d(Activity activity) {
            this.f = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f == activity) {
                this.f = null;
                this.h = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.h && !this.i && !this.g && c.h(this.e, activity)) {
                this.i = true;
                this.e = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f == activity) {
                this.g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new C0018c(b.get(activity), obj2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                g.post(new a(dVar, obj2));
                if (g()) {
                    f.invoke(obj, new Object[]{obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE});
                } else {
                    activity.recreate();
                }
                g.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
