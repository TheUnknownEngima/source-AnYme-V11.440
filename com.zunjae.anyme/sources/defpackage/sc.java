package defpackage;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: sc  reason: default package */
public class sc implements Callable<pc<Boolean>> {
    private final ac a;
    private final kb b;
    private final String c;

    public sc(ac acVar, kb kbVar, String str) {
        this.a = acVar;
        this.b = kbVar;
        this.c = str;
    }

    /* renamed from: a */
    public pc<Boolean> call() {
        jb c2 = this.a.c();
        bc<gb> b2 = this.a.b();
        zb<gb> i = b2.i();
        if (i.c()) {
            if (c2.l() <= 0) {
                try {
                    long a2 = this.b.a(c2);
                    c2.b(a2);
                    this.a.l(a2);
                } catch (ka e) {
                    return new pc<>(Boolean.FALSE, e);
                }
            }
            boolean z = false;
            for (gb next : i.a()) {
                next.b((long) ((int) c2.l()));
                next.c(new cb(this.c));
                try {
                    this.b.d(next);
                    z = true;
                } catch (ka e2) {
                    return new pc<>(Boolean.FALSE, e2);
                }
            }
            if (z) {
                b2.e(i.b());
            }
            return new pc<>(Boolean.valueOf(z));
        }
        if (i.b().size() > 0) {
            for (File delete : i.b()) {
                delete.delete();
            }
        }
        return new pc<>(Boolean.TRUE);
    }
}
