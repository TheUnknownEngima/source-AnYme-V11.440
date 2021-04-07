package defpackage;

import defpackage.xj1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: fk1  reason: default package */
final class fk1 extends yi1<Long> implements xj1.h, RandomAccess, yk1 {
    private static final fk1 h;
    private long[] f;
    private int g;

    static {
        fk1 fk1 = new fk1(new long[0], 0);
        h = fk1;
        fk1.s();
    }

    fk1() {
        this(new long[10], 0);
    }

    private fk1(long[] jArr, int i) {
        this.f = jArr;
        this.g = i;
    }

    private void g(int i, long j) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(l(i));
        }
        long[] jArr = this.f;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f, i, jArr2, i + 1, this.g - i);
            this.f = jArr2;
        }
        this.f[i] = j;
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

    public boolean addAll(Collection<? extends Long> collection) {
        a();
        xj1.a(collection);
        if (!(collection instanceof fk1)) {
            return super.addAll(collection);
        }
        fk1 fk1 = (fk1) collection;
        int i = fk1.g;
        if (i == 0) {
            return false;
        }
        int i2 = this.g;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f;
            if (i3 > jArr.length) {
                this.f = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(fk1.f, 0, this.f, this.g, fk1.g);
            this.g = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Long l) {
        g(i, l.longValue());
    }

    /* renamed from: d */
    public boolean add(Long l) {
        h(l.longValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk1)) {
            return super.equals(obj);
        }
        fk1 fk1 = (fk1) obj;
        if (this.g != fk1.g) {
            return false;
        }
        long[] jArr = fk1.f;
        for (int i = 0; i < this.g; i++) {
            if (this.f[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public void h(long j) {
        a();
        int i = this.g;
        long[] jArr = this.f;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f = jArr2;
        }
        long[] jArr3 = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        jArr3[i2] = j;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.g; i2++) {
            i = (i * 31) + xj1.f(this.f[i2]);
        }
        return i;
    }

    /* renamed from: j */
    public Long get(int i) {
        return Long.valueOf(k(i));
    }

    public long k(int i) {
        i(i);
        return this.f[i];
    }

    /* renamed from: m */
    public xj1.h w(int i) {
        if (i >= this.g) {
            return new fk1(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public Long remove(int i) {
        a();
        i(i);
        long[] jArr = this.f;
        long j = jArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: o */
    public Long set(int i, Long l) {
        return Long.valueOf(p(i, l.longValue()));
    }

    public long p(int i, long j) {
        a();
        i(i);
        long[] jArr = this.f;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.g; i++) {
            if (obj.equals(Long.valueOf(this.f[i]))) {
                long[] jArr = this.f;
                System.arraycopy(jArr, i + 1, jArr, i, (this.g - i) - 1);
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
            long[] jArr = this.f;
            System.arraycopy(jArr, i2, jArr, i, this.g - i2);
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
