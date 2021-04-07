package defpackage;

/* renamed from: m02  reason: default package */
public final class m02<T> implements j12<T> {
    private static final Object c = new Object();
    private volatile j12<T> a;
    private volatile Object b = c;

    private m02(j12<T> j12) {
        this.a = j12;
    }

    public static <P extends j12<T>, T> j12<T> a(P p) {
        p02.b(p);
        return p instanceof m02 ? p : new m02(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.b;
        if (t == c) {
            synchronized (this) {
                t = this.b;
                if (t == c) {
                    t = this.a.get();
                    b(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
