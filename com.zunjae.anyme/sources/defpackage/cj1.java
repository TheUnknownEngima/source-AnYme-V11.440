package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: cj1  reason: default package */
final class cj1 extends yi1<Boolean> implements xj1.a, RandomAccess, yk1 {
    private static final cj1 h;
    private boolean[] f;
    private int g;

    static {
        cj1 cj1 = new cj1(new boolean[0], 0);
        h = cj1;
        cj1.s();
    }

    cj1() {
        this(new boolean[10], 0);
    }

    private cj1(boolean[] zArr, int i) {
        this.f = zArr;
        this.g = i;
    }

    private void g(int i, boolean z) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        boolean[] zArr = this.f;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f, i, zArr2, i + 1, this.g - i);
            this.f = zArr2;
        }
        this.f[i] = z;
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

    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        xj1.a(collection);
        if (!(collection instanceof cj1)) {
            return super.addAll(collection);
        }
        cj1 cj1 = (cj1) collection;
        int i = cj1.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f;
            if (i3 > zArr.length) {
                this.f = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(cj1.f, 0, this.f, this.g, cj1.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Boolean bool) {
        g(i, bool.booleanValue());
    }

    /* renamed from: d */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return super.equals(obj);
        }
        cj1 cj1 = (cj1) obj;
        if (this.g != cj1.g) {
            return false;
        }
        boolean[] zArr = cj1.f;
        for (int i = 0; i < this.g; i++) {
            if (this.f[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public void h(boolean z) {
        a();
        int i = this.g;
        boolean[] zArr = this.f;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f = zArr2;
        }
        boolean[] zArr3 = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        zArr3[i2] = z;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + xj1.c(this.f[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public Boolean get(int i) {
        return Boolean.valueOf(k(i));
    }

    public boolean k(int i) {
        i(i);
        return this.f[i];
    }

    /* renamed from: m */
    public xj1.a w(int i) {
        if (i >= this.g) {
            return new cj1(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Boolean remove(int i) {
        a();
        i(i);
        boolean[] zArr = this.f;
        boolean z = zArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(p(i, bool.booleanValue()));
    }

    public boolean p(int i, boolean z) {
        a();
        i(i);
        boolean[] zArr = this.f;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.g; i++) {
            if (obj.equals(Boolean.valueOf(this.f[i]))) {
                boolean[] zArr = this.f;
                System.arraycopy(zArr, i + 1, zArr, i, (this.g - i) - 1);
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
            boolean[] zArr = this.f;
            System.arraycopy(zArr, i2, zArr, i, this.g - i2);
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
