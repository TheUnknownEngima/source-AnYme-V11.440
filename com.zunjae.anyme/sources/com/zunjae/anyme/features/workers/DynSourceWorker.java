package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.zunjae.dynsourcegen.b;
import com.zunjae.dynsourcegen.c;
import defpackage.og2;
import java.io.IOException;
import java.util.List;

public final class DynSourceWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<ut1> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [ut1, java.lang.Object] */
        public final ut1 invoke() {
            return this.f.e(f72.b(ut1.class), this.g, this.h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynSourceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    private final ut1 p() {
        return (ut1) this.i.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        try {
            qi2<com.zunjae.dynsourcegen.a> h = p().a().h();
            v62.d(h, "call");
            if (!h.d()) {
                ListenableWorker.a b = ListenableWorker.a.b();
                v62.d(b, "Result.retry()");
                return b;
            }
            com.zunjae.dynsourcegen.a a2 = h.a();
            if (a2 != null) {
                v62.d(a2, "call.body() ?: return Result.failure()");
                if (n32.t(a2.a())) {
                    b.x.c(a2.a());
                }
                List<c> b2 = a2.b();
                if (b2 != null && n32.t(b2)) {
                    c.i.c(b2);
                }
                ListenableWorker.a c = ListenableWorker.a.c();
                v62.d(c, "Result.success()");
                return c;
            }
            ListenableWorker.a a3 = ListenableWorker.a.a();
            v62.d(a3, "Result.failure()");
            return a3;
        } catch (IOException e) {
            uj2.d(e);
            ListenableWorker.a b3 = ListenableWorker.a.b();
            v62.d(b3, "Result.retry()");
            return b3;
        } catch (Exception e2) {
            uj2.d(e2);
            ListenableWorker.a a4 = ListenableWorker.a.a();
            v62.d(a4, "Result.failure()");
            return a4;
        }
    }
}
