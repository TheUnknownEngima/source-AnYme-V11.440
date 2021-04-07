package defpackage;

/* renamed from: gp  reason: default package */
public final class gp implements n02<cp> {
    private static final gp a = new gp();

    public static gp a() {
        return a;
    }

    public static cp c() {
        cp c = dp.c();
        p02.c(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    /* renamed from: b */
    public cp get() {
        return c();
    }
}
