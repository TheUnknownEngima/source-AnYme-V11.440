package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bo  reason: default package */
public final class bo implements n02<Executor> {
    private static final bo a = new bo();

    public static bo a() {
        return a;
    }

    public static Executor b() {
        Executor a2 = ao.a();
        p02.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
