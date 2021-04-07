package defpackage;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: wc  reason: default package */
public class wc implements Callable<pc<Boolean>> {
    private final ac a;
    private final kb b;
    private final ib c;

    public wc(ac acVar, kb kbVar) {
        this.a = acVar;
        this.b = kbVar;
        this.c = null;
    }

    public wc(ac acVar, kb kbVar, ib ibVar) {
        this.c = ibVar;
        this.a = acVar;
        this.b = kbVar;
    }

    private zb<ib> a(bc<ib> bcVar) {
        return bcVar.g(1);
    }

    /* renamed from: b */
    public pc<Boolean> call() {
        try {
            jb c2 = this.a.c();
            if (c2.l() <= 0) {
                long a2 = this.b.a(c2);
                c2.b(a2);
                this.a.l(a2);
            }
            bc<ib> f = this.a.f();
            zb<ib> a3 = a(f);
            if (this.c != null) {
                a3.a().add(this.c);
            }
            if (a3.c() || a3.b().size() <= 0) {
                boolean z = true;
                while (a3.c()) {
                    try {
                        this.b.c(c2.l(), a3.a());
                        z &= f.e(a3.b());
                        a3 = a(f);
                    } catch (ka e) {
                        if (!(e instanceof ma)) {
                            e.printStackTrace();
                        }
                        return new pc<>(Boolean.FALSE, e);
                    }
                }
                return new pc<>(Boolean.valueOf(z));
            }
            for (File delete : a3.b()) {
                delete.delete();
            }
            return new pc<>(Boolean.TRUE, (Throwable) null);
        } catch (ka e2) {
            if (!(e2 instanceof ma)) {
                e2.printStackTrace();
            }
            return new pc<>(Boolean.FALSE, e2);
        } catch (Throwable th) {
            if (!(th instanceof ma) || !(th instanceof vb)) {
                th.printStackTrace();
            }
            return new pc<>(Boolean.FALSE, th);
        }
    }
}
