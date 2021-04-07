package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    static final HashMap<ComponentName, h> k = new HashMap<>();
    b e;
    h f;
    a g;
    boolean h = false;
    boolean i = false;
    final ArrayList<d> j;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a2 = JobIntentService.this.a();
                if (a2 == null) {
                    return null;
                }
                JobIntentService.this.e(a2.getIntent());
                a2.a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.g();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {
        private final PowerManager.WakeLock d;
        private final PowerManager.WakeLock e;
        boolean f;
        boolean g;

        c(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.d = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.e = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void b() {
            synchronized (this) {
                if (this.g) {
                    if (this.f) {
                        this.d.acquire(60000);
                    }
                    this.g = false;
                    this.e.release();
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (!this.g) {
                    this.g = true;
                    this.e.acquire(600000);
                    this.d.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                this.f = false;
            }
        }
    }

    final class d implements e {
        final Intent a;
        final int b;

        d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public void a() {
            JobIntentService.this.stopSelf(this.b);
        }

        public Intent getIntent() {
            return this.a;
        }
    }

    interface e {
        void a();

        Intent getIntent();
    }

    static final class f extends JobServiceEngine implements b {
        final JobIntentService a;
        final Object b = new Object();
        JobParameters c;

        final class a implements e {
            final JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public void a() {
                synchronized (f.this.b) {
                    if (f.this.c != null) {
                        f.this.c.completeWork(this.a);
                    }
                }
            }

            public Intent getIntent() {
                return this.a.getIntent();
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.a = jobIntentService;
        }

        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.JobIntentService.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.e b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.f.b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.a.c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b2 = this.a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return b2;
        }
    }

    static final class g extends h {
        g(Context context, ComponentName componentName, int i) {
            super(componentName);
            a(i);
            new JobInfo.Builder(i, this.a).setOverrideDeadline(0).build();
            JobScheduler jobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    static abstract class h {
        final ComponentName a;
        boolean b;
        int c;

        h(ComponentName componentName) {
            this.a = componentName;
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.c);
            }
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public JobIntentService() {
        this.j = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    static h d(Context context, ComponentName componentName, boolean z, int i2) {
        h hVar;
        h hVar2 = k.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        k.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    public e a() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.j) {
            if (this.j.size() <= 0) {
                return null;
            }
            e remove = this.j.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.cancel(this.h);
        }
        return f();
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        if (this.g == null) {
            this.g = new a();
            h hVar = this.f;
            if (hVar != null && z) {
                hVar.c();
            }
            this.g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void e(Intent intent);

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        ArrayList<d> arrayList = this.j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.g = null;
                if (this.j != null && this.j.size() > 0) {
                    c(false);
                } else if (!this.i) {
                    this.f.b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.e;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = new f(this);
            this.f = null;
            return;
        }
        this.e = null;
        this.f = d(this, new ComponentName(this, JobIntentService.class), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.i = true;
                this.f.b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.j == null) {
            return 2;
        }
        this.f.d();
        synchronized (this.j) {
            ArrayList<d> arrayList = this.j;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            c(true);
        }
        return 3;
    }
}
