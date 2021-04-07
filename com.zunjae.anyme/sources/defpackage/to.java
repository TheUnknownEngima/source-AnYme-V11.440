package defpackage;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;

/* renamed from: to  reason: default package */
public final class to implements n02<so> {
    private final j12<Executor> a;
    private final j12<e> b;
    private final j12<s> c;
    private final j12<bp> d;
    private final j12<jq> e;

    public to(j12<Executor> j12, j12<e> j122, j12<s> j123, j12<bp> j124, j12<jq> j125) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
        this.e = j125;
    }

    public static to a(j12<Executor> j12, j12<e> j122, j12<s> j123, j12<bp> j124, j12<jq> j125) {
        return new to(j12, j122, j123, j124, j125);
    }

    /* renamed from: b */
    public so get() {
        return new so(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
