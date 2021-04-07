package kotlinx.coroutines;

public final class n2 extends a0 {
    public static final n2 e = new n2();

    private n2() {
    }

    public void N(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        throw new UnsupportedOperationException();
    }

    public boolean Q(n42 n42) {
        v62.f(n42, "context");
        return false;
    }

    public String toString() {
        return "Unconfined";
    }
}
