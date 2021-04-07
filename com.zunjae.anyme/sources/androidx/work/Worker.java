package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

public abstract class Worker extends ListenableWorker {
    r8<ListenableWorker.a> h;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Worker.this.h.p(Worker.this.o());
            } catch (Throwable th) {
                Worker.this.h.q(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final db1<ListenableWorker.a> l() {
        this.h = r8.t();
        c().execute(new a());
        return this.h;
    }

    public abstract ListenableWorker.a o();
}
