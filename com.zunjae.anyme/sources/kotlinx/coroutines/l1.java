package kotlinx.coroutines;

final class l1 extends g {
    private final z52<Throwable, u22> e;

    public l1(z52<? super Throwable, u22> z52) {
        v62.f(z52, "handler");
        this.e = z52;
    }

    public void a(Throwable th) {
        this.e.r(th);
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        a((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + l0.a(this.e) + '@' + l0.b(this) + ']';
    }
}
