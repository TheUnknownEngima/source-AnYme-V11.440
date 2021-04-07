package defpackage;

/* renamed from: bq  reason: default package */
public final class bq implements n02<aq> {
    private final j12<kq> a;
    private final j12<kq> b;
    private final j12<cp> c;
    private final j12<gq> d;

    public bq(j12<kq> j12, j12<kq> j122, j12<cp> j123, j12<gq> j124) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
    }

    public static bq a(j12<kq> j12, j12<kq> j122, j12<cp> j123, j12<gq> j124) {
        return new bq(j12, j122, j123, j124);
    }

    /* renamed from: b */
    public aq get() {
        return new aq(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
