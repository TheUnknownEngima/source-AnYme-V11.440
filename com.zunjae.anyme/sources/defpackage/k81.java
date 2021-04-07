package defpackage;

import java.util.concurrent.Executor;

/* renamed from: k81  reason: default package */
final class k81<TResult, TContinuationResult> implements y71, a81, b81<TContinuationResult>, x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final x71<TResult, e81<TContinuationResult>> b;
    /* access modifiers changed from: private */
    public final a91<TContinuationResult> c;

    public k81(Executor executor, x71<TResult, e81<TContinuationResult>> x71, a91<TContinuationResult> a91) {
        this.a = executor;
        this.b = x71;
        this.c = a91;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.c.u(tcontinuationresult);
    }

    public final void b(e81<TResult> e81) {
        this.a.execute(new n81(this, e81));
    }

    public final void c() {
        this.c.v();
    }

    public final void d(Exception exc) {
        this.c.t(exc);
    }
}
