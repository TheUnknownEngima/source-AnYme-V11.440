package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.og2;

public final class UserProfileWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<or1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, or1] */
        public final or1 invoke() {
            return this.f.e(f72.b(or1.class), this.g, this.h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    private final or1 p() {
        return (or1) this.i.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        String t = fz1.a.t();
        if (t != null) {
            try {
                wy1 d = p().d(t);
                if (d != null) {
                    fz1.a.o(d);
                }
                ListenableWorker.a c = ListenableWorker.a.c();
                v62.d(c, "Result.success()");
                return c;
            } catch (Exception e) {
                uj2.d(e);
                ListenableWorker.a a2 = ListenableWorker.a.a();
                v62.d(a2, "Result.failure()");
                return a2;
            }
        } else {
            ListenableWorker.a c2 = ListenableWorker.a.c();
            v62.d(c2, "Result.success()");
            return c2;
        }
    }
}
