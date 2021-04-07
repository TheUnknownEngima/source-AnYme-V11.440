package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements i7 {
    private static final String m = h.f("ConstraintTrkngWrkr");
    private WorkerParameters h;
    final Object i = new Object();
    volatile boolean j = false;
    r8<ListenableWorker.a> k = r8.t();
    private ListenableWorker l;

    class a implements Runnable {
        a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.r();
        }
    }

    class b implements Runnable {
        final /* synthetic */ db1 e;

        b(db1 db1) {
            this.e = db1;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.i) {
                if (ConstraintTrackingWorker.this.j) {
                    ConstraintTrackingWorker.this.q();
                } else {
                    ConstraintTrackingWorker.this.k.r(this.e);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.h = workerParameters;
    }

    public void b(List<String> list) {
        h.c().a(m, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.i) {
            this.j = true;
        }
    }

    public void e(List<String> list) {
    }

    public void j() {
        super.j();
        ListenableWorker listenableWorker = this.l;
        if (listenableWorker != null) {
            listenableWorker.n();
        }
    }

    public db1<ListenableWorker.a> l() {
        c().execute(new a());
        return this.k;
    }

    public WorkDatabase o() {
        return androidx.work.impl.h.i().m();
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.k.p(ListenableWorker.a.a());
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.k.p(ListenableWorker.a.b());
    }

    /* access modifiers changed from: package-private */
    public void r() {
        String h2 = f().h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(h2)) {
            h.c().b(m, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b2 = h().b(a(), h2, this.h);
            this.l = b2;
            if (b2 == null) {
                h.c().a(m, "No worker to delegate to.", new Throwable[0]);
            } else {
                i8 m2 = o().D().m(d().toString());
                if (m2 == null) {
                    p();
                    return;
                }
                j7 j7Var = new j7(a(), this);
                j7Var.d(Collections.singletonList(m2));
                if (j7Var.c(d().toString())) {
                    h.c().a(m, String.format("Constraints met for delegate %s", new Object[]{h2}), new Throwable[0]);
                    try {
                        db1<ListenableWorker.a> l2 = this.l.l();
                        l2.a(new b(l2), c());
                        return;
                    } catch (Throwable th) {
                        h.c().a(m, String.format("Delegated worker %s threw exception in startWork.", new Object[]{h2}), th);
                        synchronized (this.i) {
                            if (this.j) {
                                h.c().a(m, "Constraints were unmet, Retrying.", new Throwable[0]);
                                q();
                            } else {
                                p();
                            }
                            return;
                        }
                    }
                } else {
                    h.c().a(m, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{h2}), new Throwable[0]);
                    q();
                    return;
                }
            }
        }
        p();
    }
}
