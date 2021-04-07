package defpackage;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: so  reason: default package */
public class so implements uo {
    private static final Logger f = Logger.getLogger(jo.class.getName());
    private final s a;
    private final Executor b;
    private final e c;
    private final bp d;
    private final jq e;

    public so(Executor executor, e eVar, s sVar, bp bpVar, jq jqVar) {
        this.b = executor;
        this.c = eVar;
        this.a = sVar;
        this.d = bpVar;
        this.e = jqVar;
    }

    static /* synthetic */ Object b(so soVar, eo eoVar, zn znVar) {
        soVar.d.q0(eoVar, znVar);
        soVar.a.a(eoVar, 1);
        return null;
    }

    static /* synthetic */ void c(so soVar, eo eoVar, bn bnVar, zn znVar) {
        try {
            m a2 = soVar.c.a(eoVar.b());
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{eoVar.b()});
                f.warning(format);
                bnVar.a(new IllegalArgumentException(format));
                return;
            }
            soVar.e.a(ro.a(soVar, eoVar, a2.b(znVar)));
            bnVar.a((Exception) null);
        } catch (Exception e2) {
            Logger logger = f;
            logger.warning("Error scheduling event " + e2.getMessage());
            bnVar.a(e2);
        }
    }

    public void a(eo eoVar, zn znVar, bn bnVar) {
        this.b.execute(qo.a(this, eoVar, bnVar, znVar));
    }
}
