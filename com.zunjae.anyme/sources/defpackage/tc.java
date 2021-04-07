package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: tc  reason: default package */
public class tc implements Callable<pc<Boolean>> {
    private final kb a;
    private final ab<String> b;
    private final eb c;

    public tc(kb kbVar, ab<String> abVar, eb ebVar) {
        this.a = kbVar;
        this.b = abVar;
        this.c = ebVar;
    }

    /* renamed from: a */
    public pc<Boolean> call() {
        Map<String, ?> a2 = this.b.a();
        for (String next : a2.keySet()) {
            try {
                this.a.e(this.c.a(), this.c.l(), new hb(next, a2.get(next)));
                this.b.c(next);
            } catch (ka e) {
                return new pc<>(Boolean.FALSE, e);
            }
        }
        return new pc<>(Boolean.TRUE);
    }
}
