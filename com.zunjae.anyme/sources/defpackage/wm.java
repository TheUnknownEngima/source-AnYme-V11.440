package defpackage;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: wm  reason: default package */
public abstract class wm<T> {
    public static <T> wm<T> d(int i, T t) {
        return new um(Integer.valueOf(i), t, xm.DEFAULT);
    }

    public static <T> wm<T> e(int i, T t) {
        return new um(Integer.valueOf(i), t, xm.VERY_LOW);
    }

    public static <T> wm<T> f(T t) {
        return new um((Integer) null, t, xm.VERY_LOW);
    }

    public static <T> wm<T> g(T t) {
        return new um((Integer) null, t, xm.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract xm c();
}
