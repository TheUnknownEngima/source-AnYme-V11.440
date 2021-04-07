package defpackage;

/* renamed from: s81  reason: default package */
final class s81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ r81 f;

    s81(r81 r81, e81 e81) {
        this.f = r81;
        this.e = e81;
    }

    public final void run() {
        synchronized (this.f.b) {
            if (this.f.c != null) {
                this.f.c.d(this.e.l());
            }
        }
    }
}
