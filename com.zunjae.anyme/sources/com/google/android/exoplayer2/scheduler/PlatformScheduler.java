package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

@TargetApi(21)
public final class PlatformScheduler implements e {

    public static final class PlatformSchedulerService extends JobService {
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.c("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new c(extras.getInt("requirements")).a(this)) {
                PlatformScheduler.c("Requirements are met");
                String string = extras.getString("service_action");
                String string2 = extras.getString("service_package");
                q40.e(string);
                Intent intent = new Intent(string).setPackage(string2);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 35 + String.valueOf(string2).length());
                sb.append("Starting service action: ");
                sb.append(string);
                sb.append(" package: ");
                sb.append(string2);
                PlatformScheduler.c(sb.toString());
                v50.C0(this, intent);
                return false;
            }
            PlatformScheduler.c("Requirements are not met");
            jobFinished(jobParameters, true);
            return false;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static void c(String str) {
    }
}
