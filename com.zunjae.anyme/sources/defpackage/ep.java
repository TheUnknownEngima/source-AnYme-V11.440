package defpackage;

/* renamed from: ep  reason: default package */
public final class ep implements n02<String> {
    private static final ep a = new ep();

    public static ep a() {
        return a;
    }

    public static String b() {
        String a2 = dp.a();
        p02.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
