package kotlinx.coroutines.internal;

final class b0 {
    private Object[] a;
    private int b;
    private final n42 c;

    public b0(n42 n42, int i) {
        v62.f(n42, "context");
        this.c = n42;
        this.a = new Object[i];
    }

    public final void a(Object obj) {
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final n42 b() {
        return this.c;
    }

    public final void c() {
        this.b = 0;
    }

    public final Object d() {
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return objArr[i];
    }
}
