package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: c0  reason: default package */
public final class c0<E> implements Collection<E>, Set<E> {
    private static final int[] i = new int[0];
    private static final Object[] j = new Object[0];
    private static Object[] k;
    private static int l;
    private static Object[] m;
    private static int n;
    private int[] e;
    Object[] f;
    int g;
    private g0<E, E> h;

    /* renamed from: c0$a */
    class a extends g0<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            c0.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return c0.this.f[i];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return c0.this.g;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return c0.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return c0.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e, E e2) {
            c0.this.add(e);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            c0.this.j(i);
        }

        /* access modifiers changed from: protected */
        public E i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public c0() {
        this(0);
    }

    public c0(int i2) {
        if (i2 == 0) {
            this.e = i;
            this.f = j;
        } else {
            a(i2);
        }
        this.g = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (c0.class) {
                if (m != null) {
                    Object[] objArr = m;
                    this.f = objArr;
                    m = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    n--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c0.class) {
                if (k != null) {
                    Object[] objArr2 = k;
                    this.f = objArr2;
                    k = (Object[]) objArr2[0];
                    this.e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    l--;
                    return;
                }
            }
        }
        this.e = new int[i2];
        this.f = new Object[i2];
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c0.class) {
                if (n < 10) {
                    objArr[0] = m;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    m = objArr;
                    n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c0.class) {
                if (l < 10) {
                    objArr[0] = k;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    k = objArr;
                    l++;
                }
            }
        }
    }

    private g0<E, E> g() {
        if (this.h == null) {
            this.h = new a();
        }
        return this.h;
    }

    private int h(Object obj, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d0.a(this.e, i3, i2);
        if (a2 < 0 || obj.equals(this.f[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.e[i4] == i2) {
            if (obj.equals(this.f[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.e[i5] == i2) {
            if (obj.equals(this.f[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int i() {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d0.a(this.e, i2, 0);
        if (a2 < 0 || this.f[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.e[i3] == 0) {
            if (this.f[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.e[i4] == 0) {
            if (this.f[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = i();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = h(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.g;
        if (i5 >= this.e.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.e;
            Object[] objArr = this.f;
            a(i6);
            int[] iArr2 = this.e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f, 0, objArr.length);
            }
            d(iArr, objArr, this.g);
        }
        int i7 = this.g;
        if (i4 < i7) {
            int[] iArr3 = this.e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f;
            System.arraycopy(objArr2, i4, objArr2, i8, this.g - i4);
        }
        this.e[i4] = i2;
        this.f[i4] = e2;
        this.g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        c(this.g + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void c(int i2) {
        int[] iArr = this.e;
        if (iArr.length < i2) {
            Object[] objArr = this.f;
            a(i2);
            int i3 = this.g;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.e, 0, i3);
                System.arraycopy(objArr, 0, this.f, 0, this.g);
            }
            d(iArr, objArr, this.g);
        }
    }

    public void clear() {
        int i2 = this.g;
        if (i2 != 0) {
            d(this.e, this.f, i2);
            this.e = i;
            this.f = j;
            this.g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.g) {
                try {
                    if (!set.contains(k(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.e;
        int i2 = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? i() : h(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.g <= 0;
    }

    public Iterator<E> iterator() {
        return g().m().iterator();
    }

    public E j(int i2) {
        E[] eArr = this.f;
        E e2 = eArr[i2];
        int i3 = this.g;
        if (i3 <= 1) {
            d(this.e, eArr, i3);
            this.e = i;
            this.f = j;
            this.g = 0;
        } else {
            int[] iArr = this.e;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.g - 1;
                this.g = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.e;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.f;
                    System.arraycopy(objArr, i6, objArr, i2, this.g - i2);
                }
                this.f[this.g] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.e;
                Object[] objArr2 = this.f;
                a(i4);
                this.g--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.e, 0, i2);
                    System.arraycopy(objArr2, 0, this.f, 0, i2);
                }
                int i7 = this.g;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.e, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.f, i2, this.g - i2);
                }
            }
        }
        return e2;
    }

    public E k(int i2) {
        return this.f[i2];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        j(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f[i2])) {
                j(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.g;
    }

    public Object[] toArray() {
        int i2 = this.g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.g);
        }
        System.arraycopy(this.f, 0, tArr, 0, this.g);
        int length = tArr.length;
        int i2 = this.g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
