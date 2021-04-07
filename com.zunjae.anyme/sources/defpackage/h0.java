package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: h0  reason: default package */
public class h0<K, V> {
    static Object[] h;
    static int i;
    static Object[] j;
    static int k;
    int[] e;
    Object[] f;
    int g;

    public h0() {
        this.e = d0.a;
        this.f = d0.c;
        this.g = 0;
    }

    public h0(int i2) {
        if (i2 == 0) {
            this.e = d0.a;
            this.f = d0.c;
        } else {
            a(i2);
        }
        this.g = 0;
    }

    public h0(h0<K, V> h0Var) {
        this();
        if (h0Var != null) {
            j(h0Var);
        }
    }

    private void a(int i2) {
        Class<h0> cls = h0.class;
        if (i2 == 8) {
            synchronized (cls) {
                if (j != null) {
                    Object[] objArr = j;
                    this.f = objArr;
                    j = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                if (h != null) {
                    Object[] objArr2 = h;
                    this.f = objArr2;
                    h = (Object[]) objArr2[0];
                    this.e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.e = new int[i2];
        this.f = new Object[(i2 << 1)];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return d0.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        Class<h0> cls = h0.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.g;
        int[] iArr = this.e;
        if (iArr.length < i2) {
            Object[] objArr = this.f;
            a(i2);
            if (this.g > 0) {
                System.arraycopy(iArr, 0, this.e, 0, i3);
                System.arraycopy(objArr, 0, this.f, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.g != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.g;
        if (i2 > 0) {
            int[] iArr = this.e;
            Object[] objArr = this.f;
            this.e = d0.a;
            this.f = d0.c;
            this.g = 0;
            d(iArr, objArr, i2);
        }
        if (this.g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        int b = b(this.e, i3, i2);
        if (b < 0 || obj.equals(this.f[b << 1])) {
            return b;
        }
        int i4 = b + 1;
        while (i4 < i3 && this.e[i4] == i2) {
            if (obj.equals(this.f[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = b - 1;
        while (i5 >= 0 && this.e[i5] == i2) {
            if (obj.equals(this.f[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (size() != h0Var.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.g) {
                try {
                    Object i3 = i(i2);
                    Object m = m(i2);
                    Object obj2 = h0Var.get(i3);
                    if (m == null) {
                        if (obj2 != null || !h0Var.containsKey(i3)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.g) {
                try {
                    Object i5 = i(i4);
                    Object m2 = m(i4);
                    Object obj3 = map.get(i5);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.e, i2, 0);
        if (b < 0 || this.f[b << 1] == null) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.e[i3] == 0) {
            if (this.f[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.e[i4] == 0) {
            if (this.f[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? this.f[(f2 << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i2 = this.g * 2;
        Object[] objArr = this.f;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.e;
        Object[] objArr = this.f;
        int i2 = this.g;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public K i(int i2) {
        return this.f[i2 << 1];
    }

    public boolean isEmpty() {
        return this.g <= 0;
    }

    public void j(h0<? extends K, ? extends V> h0Var) {
        int i2 = h0Var.g;
        c(this.g + i2);
        if (this.g != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(h0Var.i(i3), h0Var.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(h0Var.e, 0, this.e, 0, i2);
            System.arraycopy(h0Var.f, 0, this.f, 0, i2 << 1);
            this.g = i2;
        }
    }

    public V k(int i2) {
        V[] vArr = this.f;
        int i3 = i2 << 1;
        V v = vArr[i3 + 1];
        int i4 = this.g;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.e, vArr, i4);
            this.e = d0.a;
            this.f = d0.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.e;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int[] iArr2 = this.e;
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr2, i8, iArr2, i2, i9);
                    Object[] objArr = this.f;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.f;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.e;
                Object[] objArr3 = this.f;
                a(i7);
                if (i4 == this.g) {
                    if (i2 > 0) {
                        System.arraycopy(iArr3, 0, this.e, 0, i2);
                        System.arraycopy(objArr3, 0, this.f, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr3, i11, this.e, i2, i12);
                        System.arraycopy(objArr3, i11 << 1, this.f, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.g) {
            this.g = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.f;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public V m(int i2) {
        return this.f[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.g;
        if (k2 == null) {
            i3 = g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = e(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.f;
            V v2 = vArr[i5];
            vArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        if (i4 >= this.e.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            int[] iArr = this.e;
            Object[] objArr = this.f;
            a(i7);
            if (i4 == this.g) {
                int[] iArr2 = this.e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f, 0, objArr.length);
                }
                d(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.e;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.f;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.g - i6) << 1);
        }
        int i9 = this.g;
        if (i4 == i9) {
            int[] iArr4 = this.e;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.f;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v;
                this.g = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object m = m(f2);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        k(f2);
        return true;
    }

    public V replace(K k2, V v) {
        int f2 = f(k2);
        if (f2 >= 0) {
            return l(f2, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int f2 = f(k2);
        if (f2 < 0) {
            return false;
        }
        V m = m(f2);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        l(f2, v2);
        return true;
    }

    public int size() {
        return this.g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = m(i2);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
