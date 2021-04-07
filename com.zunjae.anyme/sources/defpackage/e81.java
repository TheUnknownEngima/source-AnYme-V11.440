package defpackage;

import java.util.concurrent.Executor;

/* renamed from: e81  reason: default package */
public abstract class e81<TResult> {
    public e81<TResult> a(Executor executor, y71 y71) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public e81<TResult> b(z71<TResult> z71) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public e81<TResult> c(Executor executor, z71<TResult> z71) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract e81<TResult> d(a81 a81);

    public abstract e81<TResult> e(Executor executor, a81 a81);

    public abstract e81<TResult> f(b81<? super TResult> b81);

    public abstract e81<TResult> g(Executor executor, b81<? super TResult> b81);

    public <TContinuationResult> e81<TContinuationResult> h(x71<TResult, TContinuationResult> x71) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> e81<TContinuationResult> i(Executor executor, x71<TResult, TContinuationResult> x71) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> e81<TContinuationResult> j(x71<TResult, e81<TContinuationResult>> x71) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> e81<TContinuationResult> k(Executor executor, x71<TResult, e81<TContinuationResult>> x71) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception l();

    public abstract TResult m();

    public abstract <X extends Throwable> TResult n(Class<X> cls);

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public <TContinuationResult> e81<TContinuationResult> r(d81<TResult, TContinuationResult> d81) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> e81<TContinuationResult> s(Executor executor, d81<TResult, TContinuationResult> d81) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
