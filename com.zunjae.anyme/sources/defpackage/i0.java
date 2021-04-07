package defpackage;

/* renamed from: i0  reason: default package */
public class i0<E> implements Cloneable {
    private static final Object i = new Object();
    private boolean e;
    private int[] f;
    private Object[] g;
    private int h;

    public i0() {
        this(10);
    }

    public i0(int i2) {
        this.e = false;
        if (i2 == 0) {
            this.f = d0.a;
            this.g = d0.c;
            return;
        }
        int e2 = d0.e(i2);
        this.f = new int[e2];
        this.g = new Object[e2];
    }

    private void e() {
        int i2 = this.h;
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.e = false;
        this.h = i3;
    }

    public void b(int i2, E e2) {
        int i3 = this.h;
        if (i3 == 0 || i2 > this.f[i3 - 1]) {
            if (this.e && this.h >= this.f.length) {
                e();
            }
            int i4 = this.h;
            if (i4 >= this.f.length) {
                int e3 = d0.e(i4 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f = iArr;
                this.g = objArr;
            }
            this.f[i4] = i2;
            this.g[i4] = e2;
            this.h = i4 + 1;
            return;
        }
        p(i2, e2);
    }

    public void c() {
        int i2 = this.h;
        Object[] objArr = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.h = 0;
        this.e = false;
    }

    /* renamed from: d */
    public i0<E> clone() {
        try {
            i0<E> i0Var = (i0) super.clone();
            i0Var.f = (int[]) this.f.clone();
            i0Var.g = (Object[]) this.g.clone();
            return i0Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E f(int i2) {
        return g(i2, (Object) null);
    }

    public E g(int i2, E e2) {
        int a = d0.a(this.f, this.h, i2);
        if (a >= 0) {
            E[] eArr = this.g;
            if (eArr[a] != i) {
                return eArr[a];
            }
        }
        return e2;
    }

    public int j(int i2) {
        if (this.e) {
            e();
        }
        return d0.a(this.f, this.h, i2);
    }

    public int n(E e2) {
        if (this.e) {
            e();
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] == e2) {
                return i2;
            }
        }
        return -1;
    }

    public int o(int i2) {
        if (this.e) {
            e();
        }
        return this.f[i2];
    }

    public void p(int i2, E e2) {
        int a = d0.a(this.f, this.h, i2);
        if (a >= 0) {
            this.g[a] = e2;
            return;
        }
        int i3 = ~a;
        if (i3 < this.h) {
            Object[] objArr = this.g;
            if (objArr[i3] == i) {
                this.f[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.e && this.h >= this.f.length) {
            e();
            i3 = ~d0.a(this.f, this.h, i2);
        }
        int i4 = this.h;
        if (i4 >= this.f.length) {
            int e3 = d0.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f = iArr;
            this.g = objArr2;
        }
        int i5 = this.h;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            Object[] objArr4 = this.g;
            System.arraycopy(objArr4, i3, objArr4, i6, this.h - i3);
        }
        this.f[i3] = i2;
        this.g[i3] = e2;
        this.h++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f
            int r1 = r3.h
            int r4 = defpackage.d0.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.g
            r1 = r0[r4]
            java.lang.Object r2 = i
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.e = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.q(int):void");
    }

    public int r() {
        if (this.e) {
            e();
        }
        return this.h;
    }

    public E s(int i2) {
        if (this.e) {
            e();
        }
        return this.g[i2];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(o(i2));
            sb.append('=');
            Object s = s(i2);
            if (s != this) {
                sb.append(s);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
