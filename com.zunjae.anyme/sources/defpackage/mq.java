package defpackage;

/* renamed from: mq  reason: default package */
public final class mq implements n02<kq> {
    private static final mq a = new mq();

    public static mq a() {
        return a;
    }

    public static kq b() {
        kq a2 = lq.a();
        p02.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public kq get() {
        return b();
    }
}
