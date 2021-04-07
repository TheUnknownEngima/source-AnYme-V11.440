package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

final /* synthetic */ class f implements Runnable {
    private final JobInfoSchedulerService e;
    private final JobParameters f;

    private f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.e = jobInfoSchedulerService;
        this.f = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.e.jobFinished(this.f, false);
    }
}
