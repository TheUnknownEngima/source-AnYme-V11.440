package defpackage;

/* renamed from: rd2  reason: default package */
public abstract class rd2 implements ce2 {
    private final ce2 e;

    public rd2(ce2 ce2) {
        if (ce2 != null) {
            this.e = ce2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void X(nd2 nd2, long j) {
        this.e.X(nd2, j);
    }

    public ee2 c() {
        return this.e.c();
    }

    public void close() {
        this.e.close();
    }

    public void flush() {
        this.e.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.e.toString() + ")";
    }
}
