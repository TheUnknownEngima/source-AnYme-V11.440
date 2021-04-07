package defpackage;

/* renamed from: sd2  reason: default package */
public abstract class sd2 implements de2 {
    private final de2 e;

    public sd2(de2 de2) {
        if (de2 != null) {
            this.e = de2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final de2 a() {
        return this.e;
    }

    public ee2 c() {
        return this.e.c();
    }

    public void close() {
        this.e.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.e.toString() + ")";
    }

    public long y0(nd2 nd2, long j) {
        return this.e.y0(nd2, j);
    }
}
