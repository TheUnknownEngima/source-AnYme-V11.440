package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.utils.c;
import androidx.work.m;
import java.util.List;

public class b implements d {
    private static final String i = h.f("SystemJobScheduler");
    private final JobScheduler e;
    private final androidx.work.impl.h f;
    private final c g;
    private final a h;

    public b(Context context, androidx.work.impl.h hVar) {
        this(context, hVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, androidx.work.impl.h hVar, JobScheduler jobScheduler, a aVar) {
        this.f = hVar;
        this.e = jobScheduler;
        this.g = new c(context);
        this.h = aVar;
    }

    private static JobInfo b(JobScheduler jobScheduler, String str) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs == null) {
            return null;
        }
        for (JobInfo next : allPendingJobs) {
            PersistableBundle extras = next.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                return next;
            }
        }
        return null;
    }

    public static void c(Context context) {
        List<JobInfo> allPendingJobs;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (allPendingJobs = jobScheduler.getAllPendingJobs()) != null) {
            for (JobInfo next : allPendingJobs) {
                if (next.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                    jobScheduler.cancel(next.getId());
                }
            }
        }
    }

    public void a(i8... i8VarArr) {
        WorkDatabase m = this.f.m();
        int length = i8VarArr.length;
        int i2 = 0;
        while (i2 < length) {
            i8 i8Var = i8VarArr[i2];
            m.c();
            try {
                i8 m2 = m.D().m(i8Var.a);
                if (m2 == null) {
                    h c = h.c();
                    String str = i;
                    c.h(str, "Skipping scheduling " + i8Var.a + " because it's no longer in the DB", new Throwable[0]);
                } else if (m2.b != m.a.ENQUEUED) {
                    h c2 = h.c();
                    String str2 = i;
                    c2.h(str2, "Skipping scheduling " + i8Var.a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    c8 b = m.B().b(i8Var.a);
                    if (b == null || b(this.e, i8Var.a) == null) {
                        int d = b != null ? b.b : this.g.d(this.f.h().e(), this.f.h().c());
                        if (b == null) {
                            this.f.m().B().a(new c8(i8Var.a, d));
                        }
                        e(i8Var, d);
                        if (Build.VERSION.SDK_INT == 23) {
                            e(i8Var, this.g.d(this.f.h().e(), this.f.h().c()));
                        }
                        m.v();
                    } else {
                        h.c().a(i, String.format("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{i8Var.a}), new Throwable[0]);
                    }
                }
                i2++;
            } finally {
                m.h();
            }
        }
    }

    public void d(String str) {
        List<JobInfo> allPendingJobs = this.e.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo next : allPendingJobs) {
                if (str.equals(next.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f.m().B().c(str);
                    this.e.cancel(next.getId());
                    if (Build.VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    public void e(i8 i8Var, int i2) {
        JobInfo a = this.h.a(i8Var, i2);
        h.c().a(i, String.format("Scheduling work ID %s Job ID %s", new Object[]{i8Var.a, Integer.valueOf(i2)}), new Throwable[0]);
        this.e.schedule(a);
    }
}
