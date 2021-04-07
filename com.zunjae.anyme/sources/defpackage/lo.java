package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;

/* renamed from: lo  reason: default package */
public final class lo implements n02<jo> {
    private final j12<kq> a;
    private final j12<kq> b;
    private final j12<uo> c;
    private final j12<m> d;
    private final j12<q> e;

    public lo(j12<kq> j12, j12<kq> j122, j12<uo> j123, j12<m> j124, j12<q> j125) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
        this.e = j125;
    }

    public static lo a(j12<kq> j12, j12<kq> j122, j12<uo> j123, j12<m> j124, j12<q> j125) {
        return new lo(j12, j122, j123, j124, j125);
    }

    /* renamed from: b */
    public jo get() {
        return new jo(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
