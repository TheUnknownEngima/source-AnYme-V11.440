package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: tj1  reason: default package */
final class tj1 extends yi1<Float> implements xj1.f, RandomAccess, yk1 {
    private static final tj1 h;
    private float[] f;
    private int g;

    static {
        tj1 tj1 = new tj1(new float[0], 0);
        h = tj1;
        tj1.s();
    }

    tj1() {
        this(new float[10], 0);
    }

    private tj1(float[] fArr, int i) {
        this.f = fArr;
        this.g = i;
    }

    private void h(int i, float f2) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        float[] fArr = this.f;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f, i, fArr2, i + 1, this.g - i);
            this.f = fArr2;
        }
        this.f[i] = f2;
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

    public boolean addAll(Collection<? extends Float> collection) {
        a();
        xj1.a(collection);
        if (!(collection instanceof tj1)) {
            return super.addAll(collection);
        }
        tj1 tj1 = (tj1) collection;
        int i = tj1.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f;
            if (i3 > fArr.length) {
                this.f = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(tj1.f, 0, this.f, this.g, tj1.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Float f2) {
        h(i, f2.floatValue());
    }

    /* renamed from: d */
    public boolean add(Float f2) {
        g(f2.floatValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj1)) {
            return super.equals(obj);
        }
        tj1 tj1 = (tj1) obj;
        if (this.g != tj1.g) {
            return false;
        }
        float[] fArr = tj1.f;
        for (int i = 0; i < this.g; i++) {
            if (Float.floatToIntBits(this.f[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public void g(float f2) {
        a();
        int i = this.g;
        float[] fArr = this.f;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f = fArr2;
        }
        float[] fArr3 = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        fArr3[i2] = f2;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public Float get(int i) {
        return Float.valueOf(k(i));
    }

    public float k(int i) {
        i(i);
        return this.f[i];
    }

    /* renamed from: m */
    public xj1.f w(int i) {
        if (i >= this.g) {
            return new tj1(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Float remove(int i) {
        a();
        i(i);
        float[] fArr = this.f;
        float f2 = fArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    /* renamed from: o */
    public Float set(int i, Float f2) {
        return Float.valueOf(p(i, f2.floatValue()));
    }

    public float p(int i, float f2) {
        a();
        i(i);
        float[] fArr = this.f;
        float f3 = fArr[i];
        fArr[i] = f2;
        return f3;
    }

    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.g; i++) {
            if (obj.equals(Float.valueOf(this.f[i]))) {
                float[] fArr = this.f;
                System.arraycopy(fArr, i + 1, fArr, i, (this.g - i) - 1);
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
            float[] fArr = this.f;
            System.arraycopy(fArr, i2, fArr, i, this.g - i2);
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
