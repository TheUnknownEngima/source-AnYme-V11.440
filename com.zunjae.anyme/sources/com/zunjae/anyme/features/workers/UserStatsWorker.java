package com.zunjae.anyme.features.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.zunjae.anyme.features.firebase.f;
import com.zunjae.anyme.features.kanon.e;
import com.zunjae.anyme.features.kanon.l;
import com.zunjae.anyme.features.kanon.m;
import defpackage.og2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class UserStatsWorker extends Worker implements og2 {
    private final d22 i = g22.b(new a(m().c(), (oh2) null, (o52) null));
    private final d22 j = g22.b(new b(m().c(), (oh2) null, (o52) null));
    private final Context k;

    public static final class a extends w62 implements o52<e> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final e invoke() {
            return this.f.e(f72.b(e.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<ov1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, ov1] */
        public final ov1 invoke() {
            return this.f.e(f72.b(ov1.class), this.g, this.h);
        }
    }

    static final class c extends w62 implements z52<l, CharSequence> {
        public static final c f = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence r(l lVar) {
            v62.e(lVar, "it");
            return lVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        v62.e(context, "context");
        v62.e(workerParameters, "workerParams");
        this.k = context;
    }

    private final ov1 p() {
        return (ov1) this.j.getValue();
    }

    private final e q() {
        return (e) this.i.getValue();
    }

    public mg2 m() {
        return og2.a.a(this);
    }

    public ListenableWorker.a o() {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(this.k);
        v62.d(instance, "FirebaseAnalytics.getInstance(context)");
        try {
            f.a.a(com.zunjae.anyme.features.firebase.c.PatchInstalled, Boolean.valueOf(qv1.a.z(this.k)), instance);
        } catch (Exception e) {
            uj2.d(e);
        }
        try {
            List a2 = q().s(new m(p().j(6))).h().a();
            if (a2 != null && (!a2.isEmpty())) {
                f.a.a(com.zunjae.anyme.features.firebase.c.PTWShowCount, n32.G(n32.X(a2, 3), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f, 30, (Object) null), instance);
            }
        } catch (Exception e2) {
            uj2.d(e2);
        }
        try {
            List<sy1> h = p().h();
            f.a.a(com.zunjae.anyme.features.firebase.c.ProfileShowCount, Integer.valueOf(h.size()), instance);
            f fVar = f.a;
            com.zunjae.anyme.features.firebase.c cVar = com.zunjae.anyme.features.firebase.c.PTWShowCount;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = h.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((sy1) next).n() == 6) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            fVar.a(cVar, Integer.valueOf(arrayList.size()), instance);
            f fVar2 = f.a;
            com.zunjae.anyme.features.firebase.c cVar2 = com.zunjae.anyme.features.firebase.c.WatchingShowCount;
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : h) {
                if (((sy1) next2).n() == 1) {
                    arrayList2.add(next2);
                }
            }
            fVar2.a(cVar2, Integer.valueOf(arrayList2.size()), instance);
            ListenableWorker.a c2 = ListenableWorker.a.c();
            v62.d(c2, "Result.success()");
            return c2;
        } catch (Exception unused) {
            ListenableWorker.a a3 = ListenableWorker.a.a();
            v62.d(a3, "Result.failure()");
            return a3;
        }
    }
}
