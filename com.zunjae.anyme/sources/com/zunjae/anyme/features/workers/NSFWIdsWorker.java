package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.og2;
import java.util.ArrayList;
import java.util.List;

public final class NSFWIdsWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final d22 j = g22.b(new b(m().c(), (oh2) null, (o52) null));

    public static final class a extends w62 implements o52<ov1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ov1] */
        public final ov1 invoke() {
            return this.f.e(f72.b(ov1.class), this.g, this.h);
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
    public NSFWIdsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    private final ov1 p() {
        return (ov1) this.i.getValue();
    }

    private final ut1 q() {
        return (ut1) this.j.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        try {
            wt1 a2 = q().d().h().a();
            if (a2 != null) {
                v62.d(a2, "try {\n      gistService.…turn Result.retry()\n    }");
                ArrayList arrayList = new ArrayList();
                List<Integer> a3 = a2.a();
                if (a3 != null) {
                    for (Number intValue : a3) {
                        arrayList.add(new zy1(intValue.intValue()));
                    }
                }
                p().T(arrayList);
                ListenableWorker.a c = ListenableWorker.a.c();
                v62.d(c, "Result.success()");
                return c;
            }
            ListenableWorker.a b2 = ListenableWorker.a.b();
            v62.d(b2, "Result.retry()");
            return b2;
        } catch (Exception e) {
            uj2.d(e);
            ListenableWorker.a b3 = ListenableWorker.a.b();
            v62.d(b3, "Result.retry()");
            return b3;
        }
    }
}
