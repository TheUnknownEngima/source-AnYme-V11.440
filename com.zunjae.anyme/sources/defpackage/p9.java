package defpackage;

/* renamed from: p9  reason: default package */
public final class p9<IT> implements r9<IT> {
    private a9<?> e;
    private final int f;

    public p9(a9<?> a9Var, int i) {
        this.e = a9Var;
        this.f = i;
    }

    public void close() {
        this.e = null;
    }

    public IT getItem() {
        a9<?> a9Var = this.e;
        if (a9Var == null) {
            throw new IllegalStateException("Already disposed".toString());
        } else if (a9Var != null) {
            return a9Var.get(this.f);
        } else {
            v62.l();
            throw null;
        }
    }
}
