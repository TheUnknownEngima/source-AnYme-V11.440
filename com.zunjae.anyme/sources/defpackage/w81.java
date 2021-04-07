package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: w81  reason: default package */
final class w81 implements Runnable {
    private final /* synthetic */ e81 e;
    private final /* synthetic */ v81 f;

    w81(v81 v81, e81 e81) {
        this.f = v81;
        this.e = e81;
    }

    public final void run() {
        try {
            e81 a = this.f.b.a(this.e.m());
            if (a == null) {
                this.f.d(new NullPointerException("Continuation returned null"));
                return;
            }
            a.g(g81.b, this.f);
            a.e(g81.b, this.f);
            a.a(g81.b, this.f);
        } catch (c81 e2) {
            if (e2.getCause() instanceof Exception) {
                this.f.d((Exception) e2.getCause());
            } else {
                this.f.d(e2);
            }
        } catch (CancellationException unused) {
            this.f.c();
        } catch (Exception e3) {
            this.f.d(e3);
        }
    }
}
