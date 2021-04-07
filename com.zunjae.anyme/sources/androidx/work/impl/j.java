package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.g;
import androidx.work.h;
import androidx.work.m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class j implements Runnable {
    static final String w = h.f("WorkerWrapper");
    private Context e;
    private String f;
    private List<d> g;
    private WorkerParameters.a h;
    i8 i;
    ListenableWorker j;
    ListenableWorker.a k = ListenableWorker.a.a();
    private androidx.work.b l;
    private s8 m;
    private WorkDatabase n;
    private j8 o;
    private a8 p;
    private m8 q;
    private List<String> r;
    private String s;
    private r8<Boolean> t = r8.t();
    db1<ListenableWorker.a> u = null;
    private volatile boolean v;

    class a implements Runnable {
        final /* synthetic */ r8 e;

        a(r8 r8Var) {
            this.e = r8Var;
        }

        public void run() {
            try {
                h.c().a(j.w, String.format("Starting work for %s", new Object[]{j.this.i.c}), new Throwable[0]);
                j.this.u = j.this.j.l();
                this.e.r(j.this.u);
            } catch (Throwable th) {
                this.e.q(th);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ r8 e;
        final /* synthetic */ String f;

        b(r8 r8Var, String str) {
            this.e = r8Var;
            this.f = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.e.get();
                if (aVar == null) {
                    h.c().b(j.w, String.format("%s returned a null result. Treating it as a failure.", new Object[]{j.this.i.c}), new Throwable[0]);
                } else {
                    h.c().a(j.w, String.format("%s returned a %s result.", new Object[]{j.this.i.c, aVar}), new Throwable[0]);
                    j.this.k = aVar;
                }
            } catch (CancellationException e2) {
                h.c().d(j.w, String.format("%s was cancelled", new Object[]{this.f}), e2);
            } catch (InterruptedException | ExecutionException e3) {
                h.c().b(j.w, String.format("%s failed because it threw an exception/error", new Object[]{this.f}), e3);
            } catch (Throwable th) {
                j.this.f();
                throw th;
            }
            j.this.f();
        }
    }

    public static class c {
        Context a;
        ListenableWorker b;
        s8 c;
        androidx.work.b d;
        WorkDatabase e;
        String f;
        List<d> g;
        WorkerParameters.a h = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, s8 s8Var, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = s8Var;
            this.d = bVar;
            this.e = workDatabase;
            this.f = str;
        }

        public j a() {
            return new j(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.h = aVar;
            }
            return this;
        }

        public c c(List<d> list) {
            this.g = list;
            return this;
        }
    }

    j(c cVar) {
        this.e = cVar.a;
        this.m = cVar.c;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.j = cVar.b;
        this.l = cVar.d;
        WorkDatabase workDatabase = cVar.e;
        this.n = workDatabase;
        this.o = workDatabase.D();
        this.p = this.n.x();
        this.q = this.n.E();
    }

    private void a() {
        if (this.m.a() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be executed on the Background executor thread.");
        }
    }

    private String b(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void d(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            h.c().d(w, String.format("Worker result SUCCESS for %s", new Object[]{this.s}), new Throwable[0]);
            if (!this.i.d()) {
                n();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            h.c().d(w, String.format("Worker result RETRY for %s", new Object[]{this.s}), new Throwable[0]);
            h();
            return;
        } else {
            h.c().d(w, String.format("Worker result FAILURE for %s", new Object[]{this.s}), new Throwable[0]);
            if (!this.i.d()) {
                m();
                return;
            }
        }
        i();
    }

    private void g(String str) {
        for (String g2 : this.p.b(str)) {
            g(g2);
        }
        if (this.o.l(str) != m.a.CANCELLED) {
            this.o.a(m.a.FAILED, str);
        }
    }

    private void h() {
        this.n.c();
        try {
            this.o.a(m.a.ENQUEUED, this.f);
            this.o.r(this.f, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT < 23) {
                this.o.b(this.f, -1);
            }
            this.n.v();
        } finally {
            this.n.h();
            j(true);
        }
    }

    private void i() {
        this.n.c();
        try {
            this.o.r(this.f, System.currentTimeMillis());
            this.o.a(m.a.ENQUEUED, this.f);
            this.o.n(this.f);
            if (Build.VERSION.SDK_INT < 23) {
                this.o.b(this.f, -1);
            }
            this.n.v();
        } finally {
            this.n.h();
            j(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[Catch:{ all -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j(boolean r4) {
        /*
            r3 = this;
            androidx.work.impl.WorkDatabase r0 = r3.n     // Catch:{ all -> 0x0039 }
            r0.c()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.n     // Catch:{ all -> 0x0039 }
            j8 r0 = r0.D()     // Catch:{ all -> 0x0039 }
            java.util.List r0 = r0.j()     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r3.e     // Catch:{ all -> 0x0039 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            androidx.work.impl.utils.e.a(r0, r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            androidx.work.impl.WorkDatabase r0 = r3.n     // Catch:{ all -> 0x0039 }
            r0.v()     // Catch:{ all -> 0x0039 }
            androidx.work.impl.WorkDatabase r0 = r3.n
            r0.h()
            r8<java.lang.Boolean> r0 = r3.t
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.p(r4)
            return
        L_0x0039:
            r4 = move-exception
            androidx.work.impl.WorkDatabase r0 = r3.n
            r0.h()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.j.j(boolean):void");
    }

    private void k() {
        m.a l2 = this.o.l(this.f);
        if (l2 == m.a.RUNNING) {
            h.c().a(w, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f}), new Throwable[0]);
            j(true);
            return;
        }
        h.c().a(w, String.format("Status for %s is %s; not doing any work", new Object[]{this.f, l2}), new Throwable[0]);
        j(false);
    }

    private void l() {
        e b2;
        if (!o()) {
            this.n.c();
            try {
                i8 m2 = this.o.m(this.f);
                this.i = m2;
                if (m2 == null) {
                    h.c().b(w, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f}), new Throwable[0]);
                    j(false);
                } else if (m2.b != m.a.ENQUEUED) {
                    k();
                    this.n.v();
                    h.c().a(w, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.i.c}), new Throwable[0]);
                    this.n.h();
                } else {
                    if (m2.d() || this.i.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(Build.VERSION.SDK_INT < 23 && this.i.h != this.i.i && this.i.n == 0) && currentTimeMillis < this.i.a()) {
                            h.c().a(w, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.i.c}), new Throwable[0]);
                            j(true);
                            this.n.h();
                            return;
                        }
                    }
                    this.n.v();
                    this.n.h();
                    if (this.i.d()) {
                        b2 = this.i.e;
                    } else {
                        g a2 = g.a(this.i.d);
                        if (a2 == null) {
                            h.c().b(w, String.format("Could not create Input Merger %s", new Object[]{this.i.d}), new Throwable[0]);
                            m();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.i.e);
                        arrayList.addAll(this.o.p(this.f));
                        b2 = a2.b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f), b2, this.r, this.h, this.i.k, this.l.b(), this.m, this.l.g());
                    if (this.j == null) {
                        this.j = this.l.g().b(this.e, this.i.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.j;
                    if (listenableWorker == null) {
                        h.c().b(w, String.format("Could not create Worker %s", new Object[]{this.i.c}), new Throwable[0]);
                        m();
                    } else if (listenableWorker.i()) {
                        h.c().b(w, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.i.c}), new Throwable[0]);
                        m();
                    } else {
                        this.j.k();
                        if (!p()) {
                            k();
                        } else if (!o()) {
                            r8 t2 = r8.t();
                            this.m.b().execute(new a(t2));
                            t2.a(new b(t2, this.s), this.m.d());
                        }
                    }
                }
            } finally {
                this.n.h();
            }
        }
    }

    private void m() {
        this.n.c();
        try {
            g(this.f);
            this.o.h(this.f, ((ListenableWorker.a.C0062a) this.k).e());
            this.n.v();
        } finally {
            this.n.h();
            j(false);
        }
    }

    private void n() {
        this.n.c();
        try {
            this.o.a(m.a.SUCCEEDED, this.f);
            this.o.h(this.f, ((ListenableWorker.a.c) this.k).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.p.b(this.f)) {
                if (this.o.l(next) == m.a.BLOCKED && this.p.c(next)) {
                    h.c().d(w, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.o.a(m.a.ENQUEUED, next);
                    this.o.r(next, currentTimeMillis);
                }
            }
            this.n.v();
        } finally {
            this.n.h();
            j(false);
        }
    }

    private boolean o() {
        if (!this.v) {
            return false;
        }
        h.c().a(w, String.format("Work interrupted for %s", new Object[]{this.s}), new Throwable[0]);
        m.a l2 = this.o.l(this.f);
        if (l2 == null) {
            j(false);
        } else {
            j(!l2.isFinished());
        }
        return true;
    }

    private boolean p() {
        this.n.c();
        try {
            boolean z = true;
            if (this.o.l(this.f) == m.a.ENQUEUED) {
                this.o.a(m.a.RUNNING, this.f);
                this.o.q(this.f);
            } else {
                z = false;
            }
            this.n.v();
            return z;
        } finally {
            this.n.h();
        }
    }

    public db1<Boolean> c() {
        return this.t;
    }

    public void e(boolean z) {
        this.v = true;
        o();
        db1<ListenableWorker.a> db1 = this.u;
        if (db1 != null) {
            db1.cancel(true);
        }
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker != null) {
            listenableWorker.n();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a();
        boolean z = false;
        if (!o()) {
            try {
                this.n.c();
                m.a l2 = this.o.l(this.f);
                if (l2 == null) {
                    j(false);
                    z = true;
                } else if (l2 == m.a.RUNNING) {
                    d(this.k);
                    z = this.o.l(this.f).isFinished();
                } else if (!l2.isFinished()) {
                    h();
                }
                this.n.v();
            } finally {
                this.n.h();
            }
        }
        List<d> list = this.g;
        if (list != null) {
            if (z) {
                for (d d : list) {
                    d.d(this.f);
                }
            }
            e.b(this.l, this.n, this.g);
        }
    }

    public void run() {
        List<String> b2 = this.q.b(this.f);
        this.r = b2;
        this.s = b(b2);
        l();
    }
}
