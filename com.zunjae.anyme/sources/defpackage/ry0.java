package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ry0  reason: default package */
final class ry0 extends fx0<Float> implements bz0<Float>, r01, RandomAccess {
    private float[] f;
    private int g;

    static {
        new ry0(new float[0], 0).f0();
    }

    ry0() {
        this(new float[10], 0);
    }

    private ry0(float[] fArr, int i) {
        this.f = fArr;
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
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(g(i));
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
        this.f[i] = floatValue;
        this.g++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        uy0.d(collection);
        if (!(collection instanceof ry0)) {
            return super.addAll(collection);
        }
        ry0 ry0 = (ry0) collection;
        int i = ry0.g;
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
            System.arraycopy(ry0.f, 0, this.f, this.g, ry0.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void c(float f2) {
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

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry0)) {
            return super.equals(obj);
        }
        ry0 ry0 = (ry0) obj;
        if (this.g != ry0.g) {
            return false;
        }
        float[] fArr = ry0.f;
        for (int i = 0; i < this.g; i++) {
            if (Float.floatToIntBits(this.f[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ bz0 f(int i) {
        if (i >= this.g) {
            return new ry0(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        d(i);
        return Float.valueOf(this.f[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        a();
        d(i);
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

    public final boolean remove(Object obj) {
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
    public final void removeRange(int i, int i2) {
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

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        d(i);
        float[] fArr = this.f;
        float f2 = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.g;
    }
}
