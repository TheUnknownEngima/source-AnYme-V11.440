package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.m;

public class h implements Runnable {
    private static final String g = androidx.work.h.f("StopWorkRunnable");
    private androidx.work.impl.h e;
    private String f;

    public h(androidx.work.impl.h hVar, String str) {
        this.e = hVar;
        this.f = str;
    }

    public void run() {
        WorkDatabase m = this.e.m();
        j8 D = m.D();
        m.c();
        try {
            if (D.l(this.f) == m.a.RUNNING) {
                D.a(m.a.ENQUEUED, this.f);
            }
            boolean i = this.e.k().i(this.f);
            androidx.work.h.c().a(g, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f, Boolean.valueOf(i)}), new Throwable[0]);
            m.v();
        } finally {
            m.h();
        }
    }
}
