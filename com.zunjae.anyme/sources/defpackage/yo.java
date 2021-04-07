package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;

/* renamed from: yo  reason: default package */
public final class yo implements n02<s> {
    private final j12<Context> a;
    private final j12<bp> b;
    private final j12<g> c;
    private final j12<kq> d;

    public yo(j12<Context> j12, j12<bp> j122, j12<g> j123, j12<kq> j124) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
    }

    public static yo a(j12<Context> j12, j12<bp> j122, j12<g> j123, j12<kq> j124) {
        return new yo(j12, j122, j123, j124);
    }

    public static s c(Context context, bp bpVar, g gVar, kq kqVar) {
        s a2 = xo.a(context, bpVar, gVar, kqVar);
        p02.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: b */
    public s get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
