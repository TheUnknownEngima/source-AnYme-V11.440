package androidx.room;

public abstract class e<T> extends s {
    public e(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public abstract void g(q6 q6Var, T t);

    public final void h(Iterable<? extends T> iterable) {
        q6 a = a();
        try {
            for (Object g : iterable) {
                g(a, g);
                a.executeInsert();
            }
        } finally {
            f(a);
        }
    }

    public final void i(T t) {
        q6 a = a();
        try {
            g(a, t);
            a.executeInsert();
        } finally {
            f(a);
        }
    }
}
