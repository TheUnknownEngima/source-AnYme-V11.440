package defpackage;

/* renamed from: c52  reason: default package */
public abstract class c52 extends t42 {
    public c52(k42<Object> k42) {
        super(k42);
        if (k42 != null) {
            if (!(k42.e() == o42.e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public n42 e() {
        return o42.e;
    }
}
