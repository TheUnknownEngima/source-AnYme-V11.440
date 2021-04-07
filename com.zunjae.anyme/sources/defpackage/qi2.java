package defpackage;

import javax.annotation.Nullable;

/* renamed from: qi2  reason: default package */
public final class qi2<T> {
    private final cb2 a;
    @Nullable
    private final T b;

    private qi2(cb2 cb2, @Nullable T t, @Nullable db2 db2) {
        this.a = cb2;
        this.b = t;
    }

    public static <T> qi2<T> c(db2 db2, cb2 cb2) {
        vi2.b(db2, "body == null");
        vi2.b(cb2, "rawResponse == null");
        if (!cb2.r()) {
            return new qi2<>(cb2, (Object) null, db2);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> qi2<T> f(@Nullable T t, cb2 cb2) {
        vi2.b(cb2, "rawResponse == null");
        if (cb2.r()) {
            return new qi2<>(cb2, t, (db2) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.b;
    }

    public int b() {
        return this.a.h();
    }

    public boolean d() {
        return this.a.r();
    }

    public String e() {
        return this.a.t();
    }

    public String toString() {
        return this.a.toString();
    }
}
