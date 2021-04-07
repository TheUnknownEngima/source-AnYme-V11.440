package defpackage;

/* renamed from: o81  reason: default package */
final class o81 implements Runnable {
    private final /* synthetic */ m81 e;

    o81(m81 m81) {
        this.e = m81;
    }

    public final void run() {
        synchronized (this.e.b) {
            if (this.e.c != null) {
                this.e.c.c();
            }
        }
    }
}
