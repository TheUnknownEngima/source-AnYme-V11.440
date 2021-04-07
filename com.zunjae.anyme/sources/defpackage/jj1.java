package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: jj1  reason: default package */
final class jj1 extends yi1<Double> implements xj1.b, RandomAccess, yk1 {
    private static final jj1 h;
    private double[] f;
    private int g;

    static {
        jj1 jj1 = new jj1(new double[0], 0);
        h = jj1;
        jj1.s();
    }

    jj1() {
        this(new double[10], 0);
    }

    private jj1(double[] dArr, int i) {
        this.f = dArr;
        this.g = i;
    }

    private void h(int i, double d) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        double[] dArr = this.f;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f, i, dArr2, i + 1, this.g - i);
            this.f = dArr2;
        }
        this.f[i] = d;
        this.g++;
        this.modCount++;
    }

    private void i(int i) {
        if (i < 0 || i >= this.g) {
            throw new IndexOutOfBoundsException(l(i));
        }
    }

    private String l(int i) {
        return "Index:" + i + ", Size:" + this.g;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        a();
        xj1.a(collection);
        if (!(collection instanceof jj1)) {
            return super.addAll(collection);
        }
        jj1 jj1 = (jj1) collection;
        int i = jj1.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f;
            if (i3 > dArr.length) {
                this.f = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(jj1.f, 0, this.f, this.g, jj1.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Double d) {
        h(i, d.doubleValue());
    }

    /* renamed from: d */
    public boolean add(Double d) {
        g(d.doubleValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj1)) {
            return super.equals(obj);
        }
        jj1 jj1 = (jj1) obj;
        if (this.g != jj1.g) {
            return false;
        }
        double[] dArr = jj1.f;
        for (int i = 0; i < this.g; i++) {
            if (Double.doubleToLongBits(this.f[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public void g(double d) {
        a();
        int i = this.g;
        double[] dArr = this.f;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f = dArr2;
        }
        double[] dArr3 = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        dArr3[i2] = d;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + xj1.f(Double.doubleToLongBits(this.f[i2]));
        }
        return i;
    }

    /* renamed from: j */
    public Double get(int i) {
        return Double.valueOf(k(i));
    }

    public double k(int i) {
        i(i);
        return this.f[i];
    }

    /* renamed from: m */
    public xj1.b w(int i) {
        if (i >= this.g) {
            return new jj1(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Double remove(int i) {
        a();
        i(i);
        double[] dArr = this.f;
        double d = dArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: o */
    public Double set(int i, Double d) {
        return Double.valueOf(p(i, d.doubleValue()));
    }

    public double p(int i, double d) {
        a();
        i(i);
        double[] dArr = this.f;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.g; i++) {
            if (obj.equals(Double.valueOf(this.f[i]))) {
                double[] dArr = this.f;
                System.arraycopy(dArr, i + 1, dArr, i, (this.g - i) - 1);
                this.g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            double[] dArr = this.f;
            System.arraycopy(dArr, i2, dArr, i, this.g - i2);
            this.g -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.g;
    }
}
