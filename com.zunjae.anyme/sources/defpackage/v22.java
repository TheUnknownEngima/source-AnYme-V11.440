package defpackage;

import java.io.Serializable;

/* renamed from: v22  reason: default package */
public final class v22<T> implements d22<T>, Serializable {
    private o52<? extends T> e;
    private Object f = s22.a;

    public v22(o52<? extends T> o52) {
        v62.e(o52, "initializer");
        this.e = o52;
    }

    public boolean a() {
        return this.f != s22.a;
    }

    public T getValue() {
        if (this.f == s22.a) {
            o52<? extends T> o52 = this.e;
            v62.c(o52);
            this.f = o52.invoke();
            this.e = null;
        }
        return this.f;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
