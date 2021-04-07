package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.og2;
import defpackage.qv1;

public final class AppUpdaterWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final d22 j = g22.b(new b(m().c(), (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<tr1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [tr1, java.lang.Object] */
        public final tr1 invoke() {
            return this.f.e(f72.b(tr1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<ut1> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(sh2 sh2, oh2 oh2, o52 o52) {
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
    public AppUpdaterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    private final tr1 p() {
        return (tr1) this.i.getValue();
    }

    private final ut1 q() {
        return (ut1) this.j.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        ListenableWorker.a b2;
        String str;
        qv1.a C = qv1.a.C(q(), p());
        if (C instanceof qv1.a.c) {
            b2 = ListenableWorker.a.c();
            str = "Result.success()";
        } else if (C instanceof qv1.a.C0260a) {
            b2 = ListenableWorker.a.a();
            str = "Result.failure()";
        } else if (C instanceof qv1.a.b) {
            b2 = ListenableWorker.a.b();
            str = "Result.retry()";
        } else {
            throw new j22();
        }
        v62.d(b2, str);
        return b2;
    }
}
