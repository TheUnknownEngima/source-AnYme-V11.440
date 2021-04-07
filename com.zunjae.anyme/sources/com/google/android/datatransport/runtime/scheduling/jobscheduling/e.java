package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class e implements s {
    private final Context a;
    private final bp b;
    private final g c;

    public e(Context context, bp bpVar, g gVar) {
        this.a = context;
        this.b = bpVar;
        this.c = gVar;
    }

    private boolean c(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    public void a(eo eoVar, int i) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int b2 = b(eoVar);
        if (c(jobScheduler, b2, i)) {
            mo.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", eoVar);
            return;
        }
        long x0 = this.b.x0(eoVar);
        g gVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(b2, componentName);
        gVar.c(builder, eoVar.d(), x0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", eoVar.b());
        persistableBundle.putInt("priority", qq.a(eoVar.d()));
        if (eoVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(eoVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        mo.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", eoVar, Integer.valueOf(b2), Long.valueOf(this.c.g(eoVar.d(), x0, i)), Long.valueOf(x0), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    /* access modifiers changed from: package-private */
    public int b(eo eoVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(eoVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(qq.a(eoVar.d())).array());
        if (eoVar.c() != null) {
            adler32.update(eoVar.c());
        }
        return (int) adler32.getValue();
    }
}
