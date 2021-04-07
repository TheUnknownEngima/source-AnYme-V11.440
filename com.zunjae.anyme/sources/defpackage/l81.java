package defpackage;

/* renamed from: l81  reason: default package */
final class l81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ j81 f;

    l81(j81 j81, e81 e81) {
        this.f = j81;
        this.e = e81;
    }

    public final void run() {
        if (this.e.o()) {
            this.f.c.v();
            return;
        }
        try {
            this.f.c.u(this.f.b.a(this.e));
        } catch (c81 e2) {
            if (e2.getCause() instanceof Exception) {
                this.f.c.t((Exception) e2.getCause());
            } else {
                this.f.c.t(e2);
            }
        } catch (Exception e3) {
            this.f.c.t(e3);
        }
    }
}
