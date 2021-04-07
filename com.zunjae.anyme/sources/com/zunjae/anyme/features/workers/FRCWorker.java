package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.zunjae.anyme.features.firebase.a;

public final class FRCWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FRCWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    public ListenableWorker.a o() {
        try {
            a.a.a();
            ListenableWorker.a c = ListenableWorker.a.c();
            v62.d(c, "Result.success()");
            return c;
        } catch (Exception e) {
            uj2.d(e);
            ListenableWorker.a b = ListenableWorker.a.b();
            v62.d(b, "Result.retry()");
            return b;
        }
    }
}
