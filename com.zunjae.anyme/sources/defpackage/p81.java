package defpackage;

/* renamed from: p81  reason: default package */
final class p81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ q81 f;

    p81(q81 q81, e81 e81) {
        this.f = q81;
        this.e = e81;
    }

    public final void run() {
        synchronized (this.f.b) {
            if (this.f.c != null) {
                this.f.c.a(this.e);
            }
        }
    }
}
