package defpackage;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: xc  reason: default package */
public class xc implements Callable<pc<Boolean>> {
    private final kb a;
    private final ac b;
    private final String c;
    private final qc d;
    private final List<jb> e;

    public xc(kb kbVar, ac acVar, String str, List<jb> list) {
        this.a = kbVar;
        this.b = acVar;
        this.c = str;
        this.d = null;
        this.e = list;
    }

    public xc(kb kbVar, ac acVar, String str, qc qcVar) {
        this.a = kbVar;
        this.b = acVar;
        this.c = str;
        this.d = qcVar;
        this.e = null;
    }

    private List<jb> a() {
        List<jb> list = this.e;
        return (list == null || list.size() <= 0) ? this.b.a() : this.e;
    }

    private static boolean b(jb jbVar, int i) {
        return new Date().getTime() - jbVar.n().getTime() >= TimeUnit.DAYS.toMillis((long) i);
    }

    /* renamed from: c */
    public pc<Boolean> call() {
        ac acVar;
        long g;
        try {
            List<jb> a2 = a();
            boolean z = false;
            int i = 0;
            for (jb next : a2) {
                try {
                    if (b(next, 30)) {
                        acVar = this.b;
                        g = next.g();
                    } else {
                        bc<ib> f = this.b.f(next);
                        bc<gb> c2 = this.b.c(next);
                        bc<String> g2 = this.b.g(next);
                        zb<ib> a3 = f.a(1);
                        zb<gb> h = c2.h();
                        zb<String> h2 = g2.h();
                        if (a3.c() || h.c() || h2.c()) {
                            if (next.l() <= 0) {
                                long a4 = this.a.a(next);
                                next.b(a4);
                                this.b.m(next.g(), a4);
                            }
                            if (h.c()) {
                                for (gb next2 : h.a()) {
                                    next2.b(next.l());
                                    next2.c(new cb(this.c));
                                    this.a.d(next2);
                                }
                            }
                            while (a3.c()) {
                                this.a.c(next.l(), a3.a());
                                f.e(a3.b());
                                a3 = f.a(1);
                            }
                            if (h2.c()) {
                                this.d.a(next, h2.a());
                            }
                            this.b.i(next.g());
                            i++;
                        } else {
                            acVar = this.b;
                            g = next.g();
                        }
                    }
                    acVar.i(g);
                } catch (Exception e2) {
                    "There was a problem sending the old session " + next.g();
                    if (!(e2 instanceof ma) && !(e2 instanceof vb)) {
                        this.b.i(next.g());
                    }
                }
            }
            if (a2.size() == 0 || i > 0) {
                z = true;
            }
            return new pc<>(Boolean.valueOf(z));
        } catch (Exception e3) {
            return new pc<>(Boolean.FALSE, e3);
        }
    }
}
