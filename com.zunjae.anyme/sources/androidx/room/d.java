package androidx.room;

public abstract class d<T> extends s {
    public d(l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public abstract void g(q6 q6Var, T t);

    public final int h(T t) {
        q6 a = a();
        try {
            g(a, t);
            return a.executeUpdateDelete();
        } finally {
            f(a);
        }
    }
}
