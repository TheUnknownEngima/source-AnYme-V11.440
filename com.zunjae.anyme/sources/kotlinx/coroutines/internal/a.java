package kotlinx.coroutines.internal;

public class a<T> {
    private Object[] a = new Object[16];
    private int b;
    private int c;

    private final void b() {
        Object[] objArr = this.a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = a32.c(objArr, objArr3, 0, this.b, 0, 10, (Object) null);
        Object[] objArr4 = this.a;
        int length2 = objArr4.length;
        int i = this.b;
        Object[] unused2 = a32.c(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.a = objArr3;
        this.b = 0;
        this.c = length;
    }

    public final void a(T t) {
        v62.f(t, "element");
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.c = length;
        if (length == this.b) {
            b();
        }
    }

    public final boolean c() {
        return this.b == this.c;
    }

    public final T d() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        T[] tArr = this.a;
        T t = tArr[i];
        tArr[i] = null;
        this.b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new r22("null cannot be cast to non-null type T");
    }
}
