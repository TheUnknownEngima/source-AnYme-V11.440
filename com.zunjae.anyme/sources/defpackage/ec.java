package defpackage;

import defpackage.ib;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ec  reason: default package */
public class ec<T> implements Callable<Boolean> {
    private final ac a;
    private final ic<T> b;
    private final nc<T> c;
    private final kb d;
    private final AtomicLong e;
    private final T f;

    public ec(ac acVar, nc<T> ncVar, T t, kb kbVar, ic<T> icVar, AtomicLong atomicLong) {
        this.a = acVar;
        this.c = ncVar;
        this.f = t;
        this.d = kbVar;
        this.b = icVar;
        this.e = atomicLong;
    }

    private ib a() {
        Date date = new Date(System.currentTimeMillis());
        ib.b bVar = new ib.b();
        bVar.f(0);
        bVar.a(ib.c.E.a());
        bVar.b(this.e.getAndIncrement());
        bVar.d(date);
        bVar.h("bf_disk_error");
        bVar.g("");
        bVar.c("");
        bVar.i("Bugfender couldn't store the entry in disk due to an error.");
        bVar.k("");
        bVar.j("");
        return bVar.e();
    }

    /* renamed from: b */
    public Boolean call() {
        boolean c2 = this.c.a().c(this.b.a(this.f));
        if (!c2) {
            new wc(this.a, this.d, a()).call();
        }
        return Boolean.valueOf(c2);
    }
}
