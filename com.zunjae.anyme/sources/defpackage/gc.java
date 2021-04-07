package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gc  reason: default package */
public class gc implements Callable<fb> {
    private final kb a;
    private final ab<String> b;
    private final eb c;

    public gc(kb kbVar, eb ebVar, ab<String> abVar) {
        this.a = kbVar;
        this.c = ebVar;
        this.b = abVar;
    }

    /* renamed from: a */
    public fb call() {
        try {
            return this.a.b(this.c.a(), this.c, this.b.e(true));
        } catch (ka e) {
            if (!(e instanceof ja)) {
                return fb.d;
            }
            throw e;
        }
    }
}
