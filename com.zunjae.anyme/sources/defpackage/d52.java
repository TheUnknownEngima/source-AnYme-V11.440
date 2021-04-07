package defpackage;

/* renamed from: d52  reason: default package */
public abstract class d52 extends w42 implements s62<Object> {
    private final int h;

    public d52(int i, k42<Object> k42) {
        super(k42);
        this.h = i;
    }

    public int i() {
        return this.h;
    }

    public String toString() {
        if (h() != null) {
            return super.toString();
        }
        String g = f72.g(this);
        v62.d(g, "Reflection.renderLambdaToString(this)");
        return g;
    }
}
