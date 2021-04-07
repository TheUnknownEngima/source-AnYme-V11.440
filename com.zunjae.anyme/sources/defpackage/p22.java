package defpackage;

import java.io.Serializable;

/* renamed from: p22  reason: default package */
final class p22<T> implements d22<T>, Serializable {
    private o52<? extends T> e;
    private volatile Object f;
    private final Object g;

    public p22(o52<? extends T> o52, Object obj) {
        v62.e(o52, "initializer");
        this.e = o52;
        this.f = s22.a;
        this.g = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p22(o52 o52, Object obj, int i, r62 r62) {
        this(o52, (i & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f != s22.a;
    }

    public T getValue() {
        T t;
        T t2 = this.f;
        if (t2 != s22.a) {
            return t2;
        }
        synchronized (this.g) {
            t = this.f;
            if (t == s22.a) {
                o52 o52 = this.e;
                v62.c(o52);
                t = o52.invoke();
                this.f = t;
                this.e = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
