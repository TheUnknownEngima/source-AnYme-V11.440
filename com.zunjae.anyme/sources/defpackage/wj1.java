package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: wj1  reason: default package */
final class wj1 extends yi1<Integer> implements xj1.g, RandomAccess, yk1 {
    private static final wj1 h;
    private int[] f;
    private int g;

    static {
        wj1 wj1 = new wj1(new int[0], 0);
        h = wj1;
        wj1.s();
    }

    wj1() {
        this(new int[10], 0);
    }

    private wj1(int[] iArr, int i) {
        this.f = iArr;
        this.g = i;
    }

    private void h(int i, int i2) {
        int i3;
        a();
        if (i < 0 || i > (i3 = this.g)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        int[] iArr = this.f;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f, i, iArr2, i + 1, this.g - i);
            this.f = iArr2;
        }
        this.f[i] = i2;
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

    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        xj1.a(collection);
        if (!(collection instanceof wj1)) {
            return super.addAll(collection);
        }
        wj1 wj1 = (wj1) collection;
        int i = wj1.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f;
            if (i3 > iArr.length) {
                this.f = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(wj1.f, 0, this.f, this.g, wj1.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Integer num) {
        h(i, num.intValue());
    }

    /* renamed from: d */
    public boolean add(Integer num) {
        g(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj1)) {
            return super.equals(obj);
        }
        wj1 wj1 = (wj1) obj;
        if (this.g != wj1.g) {
            return false;
        }
        int[] iArr = wj1.f;
        for (int i = 0; i < this.g; i++) {
            if (this.f[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public void g(int i) {
        a();
        int i2 = this.g;
        int[] iArr = this.f;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f = iArr2;
        }
        int[] iArr3 = this.f;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + this.f[i2];
        }
        return i;
    }

    /* renamed from: j */
    public Integer get(int i) {
        return Integer.valueOf(k(i));
    }

    public int k(int i) {
        i(i);
        return this.f[i];
    }

    /* renamed from: m */
    public xj1.g w(int i) {
        if (i >= this.g) {
            return new wj1(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Integer remove(int i) {
        a();
        i(i);
        int[] iArr = this.f;
        int i2 = iArr[i];
        int i3 = this.g;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: o */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(p(i, num.intValue()));
    }

    public int p(int i, int i2) {
        a();
        i(i);
        int[] iArr = this.f;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.g; i++) {
            if (obj.equals(Integer.valueOf(this.f[i]))) {
                int[] iArr = this.f;
                System.arraycopy(iArr, i + 1, iArr, i, (this.g - i) - 1);
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
            int[] iArr = this.f;
            System.arraycopy(iArr, i2, iArr, i, this.g - i2);
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
