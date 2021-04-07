package defpackage;

/* renamed from: vh2  reason: default package */
public final class vh2 {
    public static final <T> l22<T, Double> a(o52<? extends T> o52) {
        v62.f(o52, "code");
        return new l22<>(o52.invoke(), Double.valueOf(((double) (System.nanoTime() - System.nanoTime())) / 1000000.0d));
    }

    public static final double b(o52<u22> o52) {
        v62.f(o52, "code");
        long nanoTime = System.nanoTime();
        o52.invoke();
        return ((double) (System.nanoTime() - nanoTime)) / 1000000.0d;
    }
}
