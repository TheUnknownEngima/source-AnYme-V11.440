package defpackage;

/* renamed from: t92  reason: default package */
public abstract class t92 implements Runnable {
    public long e;
    public u92 f;

    public t92() {
        this(0, s92.f);
    }

    public t92(long j, u92 u92) {
        v62.f(u92, "taskContext");
        this.e = j;
        this.f = u92;
    }

    public final w92 a() {
        return this.f.E();
    }
}
