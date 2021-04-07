package defpackage;

import android.content.Context;

/* renamed from: hq  reason: default package */
public final class hq implements n02<gq> {
    private final j12<Context> a;
    private final j12<String> b;
    private final j12<Integer> c;

    public hq(j12<Context> j12, j12<String> j122, j12<Integer> j123) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
    }

    public static hq a(j12<Context> j12, j12<String> j122, j12<Integer> j123) {
        return new hq(j12, j122, j123);
    }

    /* renamed from: b */
    public gq get() {
        return new gq(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
