package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;

/* renamed from: wo  reason: default package */
public final class wo implements n02<g> {
    private final j12<kq> a;

    public wo(j12<kq> j12) {
        this.a = j12;
    }

    public static g a(kq kqVar) {
        g a2 = vo.a(kqVar);
        p02.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public static wo b(j12<kq> j12) {
        return new wo(j12);
    }

    /* renamed from: c */
    public g get() {
        return a(this.a.get());
    }
}
