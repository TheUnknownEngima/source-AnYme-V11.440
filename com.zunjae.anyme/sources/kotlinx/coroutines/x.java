package kotlinx.coroutines;

public final class x extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str, Throwable th) {
        super(str, th);
        v62.f(str, "message");
        v62.f(th, "cause");
    }
}
