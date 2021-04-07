package defpackage;

/* renamed from: q9  reason: default package */
public final class q9<IT> implements r9<IT> {
    private d9<?> e;
    private final int f;

    public q9(d9<?> d9Var, int i) {
        v62.f(d9Var, "dataSource");
        this.f = i;
        this.e = d9Var;
    }

    private final d9<?> a() {
        d9<?> d9Var = this.e;
        if (d9Var != null) {
            return d9Var;
        }
        throw new IllegalStateException("Already disposed.".toString());
    }

    public void close() {
        this.e = null;
    }

    public IT getItem() {
        return a().get(this.f);
    }
}
