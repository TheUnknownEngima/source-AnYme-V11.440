package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class a {
    private static final Object a = new Object();
    private static TypedValue b;

    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    private static class C0021a implements Executor {
        private final Handler e;

        C0021a(Handler handler) {
            this.e = handler;
        }

        public void execute(Runnable runnable) {
            if (!this.e.post(runnable)) {
                throw new RejectedExecutionException(this.e + " is shutting down");
            }
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File c(java.io.File r3) {
        /*
            java.lang.Class<androidx.core.content.a> r0 = androidx.core.content.a.class
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r3
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x0030 }
            r1.append(r3)     // Catch:{ all -> 0x0030 }
            r1.toString()     // Catch:{ all -> 0x0030 }
            r3 = 0
            monitor-exit(r0)
            return r3
        L_0x002e:
            monitor-exit(r0)
            return r3
        L_0x0030:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.a.c(java.io.File):java.io.File");
    }

    public static int d(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static ColorStateList e(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    public static Drawable f(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (a) {
                if (b == null) {
                    b = new TypedValue();
                }
                context.getResources().getValue(i, b, true);
                i = b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    public static File[] g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor i(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new C0021a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }
}
