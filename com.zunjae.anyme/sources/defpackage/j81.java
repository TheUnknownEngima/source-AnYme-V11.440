package defpackage;

import java.util.concurrent.Executor;

/* renamed from: j81  reason: default package */
final class j81<TResult, TContinuationResult> implements x81<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final x71<TResult, TContinuationResult> b;
    /* access modifiers changed from: private */
    public final a91<TContinuationResult> c;

    public j81(Executor executor, x71<TResult, TContinuationResult> x71, a91<TContinuationResult> a91) {
        this.a = executor;
        this.b = x71;
        this.c = a91;
    }

    public final void b(e81<TResult> e81) {
        this.a.execute(new l81(this, e81));
    }
}
