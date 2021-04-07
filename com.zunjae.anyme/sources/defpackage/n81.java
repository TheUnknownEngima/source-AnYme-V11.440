package defpackage;

/* renamed from: n81  reason: default package */
final class n81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ k81 f;

    n81(k81 k81, e81 e81) {
        this.f = k81;
        this.e = e81;
    }

    public final void run() {
        try {
            e81 e81 = (e81) this.f.b.a(this.e);
            if (e81 == null) {
                this.f.d(new NullPointerException("Continuation returned null"));
                return;
            }
            e81.g(g81.b, this.f);
            e81.e(g81.b, this.f);
            e81.a(g81.b, this.f);
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
