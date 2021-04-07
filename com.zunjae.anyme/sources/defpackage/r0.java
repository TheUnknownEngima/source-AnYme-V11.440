package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.z0;
import java.util.Arrays;

/* renamed from: r0  reason: default package */
public class r0 {
    private static float l = 0.001f;
    int a = 0;
    private final s0 b;
    protected final t0 c;
    private int d = 8;
    private z0 e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    r0(s0 s0Var, t0 t0Var) {
        this.b = s0Var;
        this.c = t0Var;
    }

    private boolean p(z0 z0Var, u0 u0Var) {
        return z0Var.l <= 1;
    }

    /* access modifiers changed from: package-private */
    public final void a(z0 z0Var, float f2, boolean z) {
        if (Math.abs(f2) >= l) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                this.h[0] = f2;
                this.f[0] = z0Var.c;
                this.g[0] = -1;
                z0Var.l++;
                z0Var.a(this.b);
                this.a++;
                if (!this.k) {
                    int i3 = this.j + 1;
                    this.j = i3;
                    int[] iArr = this.f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.f;
                int i6 = iArr2[i2];
                int i7 = z0Var.c;
                if (i6 == i7) {
                    float[] fArr = this.h;
                    fArr[i2] = fArr[i2] + f2;
                    if (Math.abs(fArr[i2]) < l) {
                        this.h[i2] = 0.0f;
                    }
                    if (this.h[i2] == Utils.FLOAT_EPSILON) {
                        if (i2 == this.i) {
                            this.i = this.g[i2];
                        } else {
                            int[] iArr3 = this.g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            z0Var.c(this.b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        z0Var.l--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.g[i2];
                i4++;
            }
            int i8 = this.j;
            int i9 = i8 + 1;
            if (this.k) {
                int[] iArr4 = this.f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.k = false;
                this.j = i8 - 1;
                this.h = Arrays.copyOf(this.h, i11);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i8] = z0Var.c;
            this.h[i8] = f2;
            int[] iArr8 = this.g;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.i;
                this.i = i8;
            }
            z0Var.l++;
            z0Var.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.z0 b(defpackage.u0 r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            r9 = -1
            if (r0 == r9) goto L_0x008a
            int r9 = r14.a
            if (r4 >= r9) goto L_0x008a
            float[] r9 = r14.h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            t0 r12 = r14.c
            z0[] r12 = r12.c
            int[] r13 = r14.f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0031
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x003d
            r9[r0] = r3
            goto L_0x0037
        L_0x0031:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x003d
            r9[r0] = r3
        L_0x0037:
            s0 r9 = r14.b
            r12.c(r9)
            r10 = 0
        L_0x003d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0083
            z0$a r11 = r12.i
            z0$a r13 = defpackage.z0.a.UNRESTRICTED
            if (r11 != r13) goto L_0x0063
            if (r2 != 0) goto L_0x0052
        L_0x004a:
            boolean r2 = r14.p(r12, r15)
            r5 = r2
            r7 = r10
            r2 = r12
            goto L_0x0083
        L_0x0052:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0057
            goto L_0x004a
        L_0x0057:
            if (r5 != 0) goto L_0x0083
            boolean r11 = r14.p(r12, r15)
            if (r11 == 0) goto L_0x0083
            r7 = r10
            r2 = r12
            r5 = 1
            goto L_0x0083
        L_0x0063:
            if (r2 != 0) goto L_0x0083
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x0083
            if (r1 != 0) goto L_0x0073
        L_0x006b:
            boolean r1 = r14.p(r12, r15)
            r6 = r1
            r8 = r10
            r1 = r12
            goto L_0x0083
        L_0x0073:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0078
            goto L_0x006b
        L_0x0078:
            if (r6 != 0) goto L_0x0083
            boolean r11 = r14.p(r12, r15)
            if (r11 == 0) goto L_0x0083
            r8 = r10
            r1 = r12
            r6 = 1
        L_0x0083:
            int[] r9 = r14.g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto L_0x000b
        L_0x008a:
            if (r2 == 0) goto L_0x008d
            return r2
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.b(u0):z0");
    }

    public final void c() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            z0 z0Var = this.c.c[this.f[i2]];
            if (z0Var != null) {
                z0Var.c(this.b);
            }
            i2 = this.g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(z0 z0Var) {
        int i2 = this.i;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == z0Var.c) {
                return true;
            }
            i2 = this.g[i2];
            i3++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.g[i2];
            i3++;
        }
    }

    public final float f(z0 z0Var) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == z0Var.c) {
                return this.h[i2];
            }
            i2 = this.g[i2];
            i3++;
        }
        return Utils.FLOAT_EPSILON;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.i;
    }

    public final int i(int i2) {
        return this.f[i2];
    }

    public final int j(int i2) {
        return this.g[i2];
    }

    /* access modifiers changed from: package-private */
    public z0 k(boolean[] zArr, z0 z0Var) {
        z0.a aVar;
        int i2 = this.i;
        int i3 = 0;
        z0 z0Var2 = null;
        float f2 = Utils.FLOAT_EPSILON;
        while (i2 != -1 && i3 < this.a) {
            float f3 = this.h[i2];
            if (f3 < Utils.FLOAT_EPSILON) {
                z0 z0Var3 = this.c.c[this.f[i2]];
                if ((zArr == null || !zArr[z0Var3.c]) && z0Var3 != z0Var && (((aVar = z0Var3.i) == z0.a.SLACK || aVar == z0.a.ERROR) && f3 < f2)) {
                    f2 = f3;
                    z0Var2 = z0Var3;
                }
            }
            i2 = this.g[i2];
            i3++;
        }
        return z0Var2;
    }

    public final float l(int i2) {
        return this.h[i2];
    }

    /* access modifiers changed from: package-private */
    public final z0 m(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.c[this.f[i3]];
            }
            i3 = this.g[i3];
            i4++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float n(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.h[i3];
            }
            i3 = this.g[i3];
            i4++;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.g[i2];
            i3++;
        }
    }

    public final void q(z0 z0Var, float f2) {
        if (f2 == Utils.FLOAT_EPSILON) {
            r(z0Var, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            this.h[0] = f2;
            this.f[0] = z0Var.c;
            this.g[0] = -1;
            z0Var.l++;
            z0Var.a(this.b);
            this.a++;
            if (!this.k) {
                int i3 = this.j + 1;
                this.j = i3;
                int[] iArr = this.f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.f;
            int i6 = iArr2[i2];
            int i7 = z0Var.c;
            if (i6 == i7) {
                this.h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.g[i2];
            i4++;
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.k = false;
            this.j = i8 - 1;
            this.h = Arrays.copyOf(this.h, i11);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i8] = z0Var.c;
        this.h[i8] = f2;
        int[] iArr7 = this.g;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.i;
            this.i = i8;
        }
        z0Var.l++;
        z0Var.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        if (this.a >= this.f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final float r(z0 z0Var, boolean z) {
        if (this.e == z0Var) {
            this.e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return Utils.FLOAT_EPSILON;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f[i2] == z0Var.c) {
                if (i2 == this.i) {
                    this.i = this.g[i2];
                } else {
                    int[] iArr = this.g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    z0Var.c(this.b);
                }
                z0Var.l--;
                this.a--;
                this.f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.g[i2];
        }
        return Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public final void s(s0 s0Var, s0 s0Var2, boolean z) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                int i4 = this.f[i2];
                z0 z0Var = s0Var2.a;
                if (i4 == z0Var.c) {
                    float f2 = this.h[i2];
                    r(z0Var, z);
                    r0 r0Var = s0Var2.d;
                    int i5 = r0Var.i;
                    int i6 = 0;
                    while (i5 != -1 && i6 < r0Var.a) {
                        a(this.c.c[r0Var.f[i5]], r0Var.h[i5] * f2, z);
                        i5 = r0Var.g[i5];
                        i6++;
                    }
                    s0Var.b += s0Var2.b * f2;
                    if (z) {
                        s0Var2.a.c(s0Var);
                    }
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public void t(s0 s0Var, s0[] s0VarArr) {
        int i2 = this.i;
        while (true) {
            int i3 = 0;
            while (i2 != -1 && i3 < this.a) {
                z0 z0Var = this.c.c[this.f[i2]];
                if (z0Var.d != -1) {
                    float f2 = this.h[i2];
                    r(z0Var, true);
                    s0 s0Var2 = s0VarArr[z0Var.d];
                    if (!s0Var2.e) {
                        r0 r0Var = s0Var2.d;
                        int i4 = r0Var.i;
                        int i5 = 0;
                        while (i4 != -1 && i5 < r0Var.a) {
                            a(this.c.c[r0Var.f[i4]], r0Var.h[i4] * f2, true);
                            i4 = r0Var.g[i4];
                            i5++;
                        }
                    }
                    float f3 = s0Var.b + (s0Var2.b * f2);
                    s0Var.b = f3;
                    if (Math.abs(f3) < l) {
                        s0Var.b = Utils.FLOAT_EPSILON;
                    }
                    s0Var2.a.c(s0Var);
                    i2 = this.i;
                } else {
                    i2 = this.g[i2];
                    i3++;
                }
            }
            return;
        }
    }

    public String toString() {
        int i2 = this.i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            str = ((str + " -> ") + this.h[i2] + " : ") + this.c.c[this.f[i2]];
            i2 = this.g[i2];
            i3++;
        }
        return str;
    }
}
