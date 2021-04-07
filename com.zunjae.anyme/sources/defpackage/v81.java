package defpackage;

import java.util.concurrent.Executor;

/* renamed from: v81  reason: default package */
final class v81<TResult, TContinuationResult> implements y71, a81, b81<TContinuationResult>, x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final d81<TResult, TContinuationResult> b;
    private final a91<TContinuationResult> c;

    public v81(Executor executor, d81<TResult, TContinuationResult> d81, a91<TContinuationResult> a91) {
        this.a = executor;
        this.b = d81;
        this.c = a91;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.c.u(tcontinuationresult);
    }

    public final void b(e81<TResult> e81) {
        this.a.execute(new w81(this, e81));
    }

    public final void c() {
        this.c.v();
    }

    public final void d(Exception exc) {
        this.c.t(exc);
    }
}
