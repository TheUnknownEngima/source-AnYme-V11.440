package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.zunjae.anyme.features.kanon.e;
import defpackage.og2;
import java.util.List;

public final class KitsuWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final d22 j = g22.b(new b(m().c(), (oh2) null, (o52) null));
    private final d22 k = g22.b(new c(m().c(), (oh2) null, (o52) null));

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

    public static final class b extends w62 implements o52<tv1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, tv1] */
        public final tv1 invoke() {
            return this.f.e(f72.b(tv1.class), this.g, this.h);
        }
    }

    public static final class c extends w62 implements o52<e> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(sh2 sh2, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final e invoke() {
            return this.f.e(f72.b(e.class), this.g, this.h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KitsuWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
    }

    private final ov1 p() {
        return (ov1) this.i.getValue();
    }

    private final tv1 q() {
        return (tv1) this.j.getValue();
    }

    private final e r() {
        return (e) this.k.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        try {
            List<Integer> k2 = p().k();
            if (k2.isEmpty()) {
                ListenableWorker.a c2 = ListenableWorker.a.c();
                v62.d(c2, "Result.success()");
                return c2;
            }
            List a2 = r().c(k2).h().a();
            if (a2 != null) {
                q().e(a2);
                p().H(a2);
            }
            ListenableWorker.a c3 = ListenableWorker.a.c();
            v62.d(c3, "Result.success()");
            return c3;
        } catch (Exception e) {
            uj2.d(e);
            ListenableWorker.a a3 = ListenableWorker.a.a();
            v62.d(a3, "Result.failure()");
            return a3;
        }
    }
}
