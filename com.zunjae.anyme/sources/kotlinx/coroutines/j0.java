package kotlinx.coroutines;

public final class j0 extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(String str, Throwable th) {
        super(str, th);
        v62.f(str, "message");
        v62.f(th, "cause");
    }
}
