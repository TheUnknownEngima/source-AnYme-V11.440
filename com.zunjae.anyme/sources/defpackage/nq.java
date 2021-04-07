package defpackage;

/* renamed from: nq  reason: default package */
public final class nq implements n02<kq> {
    private static final nq a = new nq();

    public static nq a() {
        return a;
    }

    public static kq c() {
        kq b = lq.b();
        p02.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: b */
    public kq get() {
        return c();
    }
}
