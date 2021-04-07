package defpackage;

/* renamed from: y0  reason: default package */
class y0<T> implements x0<T> {
    private final Object[] a;
    private int b;

    y0(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    public boolean c(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.b = i + 1;
        return true;
    }

    public void d(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.b;
            Object[] objArr = this.a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.b = i3 + 1;
            }
        }
    }
}
