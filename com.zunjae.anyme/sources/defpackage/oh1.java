package defpackage;

/* renamed from: oh1  reason: default package */
public class oh1<T> {
    private final Class<T> a;
    private final T b;

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.a, this.b});
    }
}
