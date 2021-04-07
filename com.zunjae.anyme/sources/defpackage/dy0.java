package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dy0  reason: default package */
final class dy0 extends fx0<Double> implements bz0<Double>, r01, RandomAccess {
    private double[] f;
    private int g;

    static {
        new dy0(new double[0], 0).f0();
    }

    dy0() {
        this(new double[10], 0);
    }

    private dy0(double[] dArr, int i) {
        this.f = dArr;
        this.g = i;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.g) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    private final String g(int i) {
        int i2 = this.g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(g(i));
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
        this.f[i] = doubleValue;
        this.g++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        c(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        uy0.d(collection);
        if (!(collection instanceof dy0)) {
            return super.addAll(collection);
        }
        dy0 dy0 = (dy0) collection;
        int i = dy0.g;
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
            System.arraycopy(dy0.f, 0, this.f, this.g, dy0.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(double d) {
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

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy0)) {
            return super.equals(obj);
        }
        dy0 dy0 = (dy0) obj;
        if (this.g != dy0.g) {
            return false;
        }
        double[] dArr = dy0.f;
        for (int i = 0; i < this.g; i++) {
            if (Double.doubleToLongBits(this.f[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ bz0 f(int i) {
        if (i >= this.g) {
            return new dy0(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        d(i);
        return Double.valueOf(this.f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + uy0.b(Double.doubleToLongBits(this.f[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
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

    public final boolean remove(Object obj) {
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
    public final void removeRange(int i, int i2) {
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

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        d(i);
        double[] dArr = this.f;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.g;
    }
}
