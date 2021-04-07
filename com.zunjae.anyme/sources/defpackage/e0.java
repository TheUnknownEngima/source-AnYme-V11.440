package defpackage;

/* renamed from: e0  reason: default package */
public class e0<E> implements Cloneable {
    private static final Object i = new Object();
    private boolean e;
    private long[] f;
    private Object[] g;
    private int h;

    public e0() {
        this(10);
    }

    public e0(int i2) {
        this.e = false;
        if (i2 == 0) {
            this.f = d0.b;
            this.g = d0.c;
            return;
        }
        int f2 = d0.f(i2);
        this.f = new long[f2];
        this.g = new Object[f2];
    }

    private void f() {
        int i2 = this.h;
        long[] jArr = this.f;
        Object[] objArr = this.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.e = false;
        this.h = i3;
    }

    public void b(long j, E e2) {
        int i2 = this.h;
        if (i2 == 0 || j > this.f[i2 - 1]) {
            if (this.e && this.h >= this.f.length) {
                f();
            }
            int i3 = this.h;
            if (i3 >= this.f.length) {
                int f2 = d0.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f = jArr;
                this.g = objArr;
            }
            this.f[i3] = j;
            this.g[i3] = e2;
            this.h = i3 + 1;
            return;
        }
        p(j, e2);
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
    public e0<E> clone() {
        try {
            e0<E> e0Var = (e0) super.clone();
            e0Var.f = (long[]) this.f.clone();
            e0Var.g = (Object[]) this.g.clone();
            return e0Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Deprecated
    public void e(long j) {
        q(j);
    }

    public E g(long j) {
        return j(j, (Object) null);
    }

    public E j(long j, E e2) {
        int b = d0.b(this.f, this.h, j);
        if (b >= 0) {
            E[] eArr = this.g;
            if (eArr[b] != i) {
                return eArr[b];
            }
        }
        return e2;
    }

    public int n(long j) {
        if (this.e) {
            f();
        }
        return d0.b(this.f, this.h, j);
    }

    public long o(int i2) {
        if (this.e) {
            f();
        }
        return this.f[i2];
    }

    public void p(long j, E e2) {
        int b = d0.b(this.f, this.h, j);
        if (b >= 0) {
            this.g[b] = e2;
            return;
        }
        int i2 = ~b;
        if (i2 < this.h) {
            Object[] objArr = this.g;
            if (objArr[i2] == i) {
                this.f[i2] = j;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.e && this.h >= this.f.length) {
            f();
            i2 = ~d0.b(this.f, this.h, j);
        }
        int i3 = this.h;
        if (i3 >= this.f.length) {
            int f2 = d0.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f = jArr;
            this.g = objArr2;
        }
        int i4 = this.h;
        if (i4 - i2 != 0) {
            long[] jArr3 = this.f;
            int i5 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i5, i4 - i2);
            Object[] objArr4 = this.g;
            System.arraycopy(objArr4, i2, objArr4, i5, this.h - i2);
        }
        this.f[i2] = j;
        this.g[i2] = e2;
        this.h++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f
            int r1 = r2.h
            int r3 = defpackage.d0.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.g
            r0 = r4[r3]
            java.lang.Object r1 = i
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.e = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0.q(long):void");
    }

    public void r(int i2) {
        Object[] objArr = this.g;
        Object obj = objArr[i2];
        Object obj2 = i;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.e = true;
        }
    }

    public int s() {
        if (this.e) {
            f();
        }
        return this.h;
    }

    public E t(int i2) {
        if (this.e) {
            f();
        }
        return this.g[i2];
    }

    public String toString() {
        if (s() <= 0) {
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
            Object t = t(i2);
            if (t != this) {
                sb.append(t);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
