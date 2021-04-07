package defpackage;

import java.util.concurrent.Callable;

/* renamed from: e91  reason: default package */
final class e91 implements Runnable {
    private final /* synthetic */ a91 e;
    private final /* synthetic */ Callable f;

    e91(a91 a91, Callable callable) {
        this.e = a91;
        this.f = callable;
    }

    public final void run() {
        try {
            this.e.u(this.f.call());
        } catch (Exception e2) {
            this.e.t(e2);
        }
    }
}
