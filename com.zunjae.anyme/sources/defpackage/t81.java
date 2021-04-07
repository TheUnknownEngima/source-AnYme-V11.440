package defpackage;

/* renamed from: t81  reason: default package */
final class t81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ u81 f;

    t81(u81 u81, e81 e81) {
        this.f = u81;
        this.e = e81;
    }

    public final void run() {
        synchronized (this.f.b) {
            if (this.f.c != null) {
                this.f.c.a(this.e.m());
            }
        }
    }
}
