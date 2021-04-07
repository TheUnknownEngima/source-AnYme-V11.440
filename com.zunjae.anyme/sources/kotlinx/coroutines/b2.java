package kotlinx.coroutines;

public final class b2 implements w0, n {
    public static final b2 e = new b2();

    private b2() {
    }

    public boolean e(Throwable th) {
        v62.f(th, "cause");
        return false;
    }

    public void k() {
    }

    public String toString() {
        return "NonDisposableHandle";
    }
}
