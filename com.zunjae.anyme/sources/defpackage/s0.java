package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.u0;
import defpackage.z0;

/* renamed from: s0  reason: default package */
public class s0 implements u0.a {
    z0 a = null;
    float b = Utils.FLOAT_EPSILON;
    boolean c;
    public final r0 d;
    boolean e = false;

    public s0(t0 t0Var) {
        this.d = new r0(this, t0Var);
    }

    public void a(z0 z0Var) {
        int i = z0Var.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.q(z0Var, f);
    }

    public z0 b(u0 u0Var, boolean[] zArr) {
        return this.d.k(zArr, (z0) null);
    }

    public void c(u0.a aVar) {
        if (aVar instanceof s0) {
            s0 s0Var = (s0) aVar;
            this.a = null;
            this.d.c();
            int i = 0;
            while (true) {
                r0 r0Var = s0Var.d;
                if (i < r0Var.a) {
                    this.d.a(r0Var.m(i), s0Var.d.n(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void clear() {
        this.d.c();
        this.a = null;
        this.b = Utils.FLOAT_EPSILON;
    }

    public s0 d(u0 u0Var, int i) {
        this.d.q(u0Var.o(i, "ep"), 1.0f);
        this.d.q(u0Var.o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public s0 e(z0 z0Var, int i) {
        this.d.q(z0Var, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(u0 u0Var) {
        boolean z;
        z0 b2 = this.d.b(u0Var);
        if (b2 == null) {
            z = true;
        } else {
            v(b2);
            z = false;
        }
        if (this.d.a == 0) {
            this.e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public s0 g(z0 z0Var, z0 z0Var2, int i, float f, z0 z0Var3, z0 z0Var4, int i2) {
        float f2;
        int i3;
        if (z0Var2 == z0Var3) {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var4, 1.0f);
            this.d.q(z0Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
            this.d.q(z0Var3, -1.0f);
            this.d.q(z0Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= Utils.FLOAT_EPSILON) {
            this.d.q(z0Var, -1.0f);
            this.d.q(z0Var2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.d.q(z0Var4, -1.0f);
            this.d.q(z0Var3, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.d.q(z0Var, f3 * 1.0f);
            this.d.q(z0Var2, f3 * -1.0f);
            this.d.q(z0Var3, -1.0f * f);
            this.d.q(z0Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.b = f2;
        return this;
        f2 = (float) i3;
        this.b = f2;
        return this;
    }

    public z0 getKey() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public s0 h(z0 z0Var, int i) {
        this.a = z0Var;
        float f = (float) i;
        z0Var.f = f;
        this.b = f;
        this.e = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public s0 i(z0 z0Var, z0 z0Var2, float f) {
        this.d.q(z0Var, -1.0f);
        this.d.q(z0Var2, f);
        return this;
    }

    public s0 j(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, float f) {
        this.d.q(z0Var, -1.0f);
        this.d.q(z0Var2, 1.0f);
        this.d.q(z0Var3, f);
        this.d.q(z0Var4, -f);
        return this;
    }

    public s0 k(float f, float f2, float f3, z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4) {
        this.b = Utils.FLOAT_EPSILON;
        if (f2 == Utils.FLOAT_EPSILON || f == f3) {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
            this.d.q(z0Var4, 1.0f);
            this.d.q(z0Var3, -1.0f);
        } else if (f == Utils.FLOAT_EPSILON) {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
        } else if (f3 == Utils.FLOAT_EPSILON) {
            this.d.q(z0Var3, 1.0f);
            this.d.q(z0Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
            this.d.q(z0Var4, f4);
            this.d.q(z0Var3, -f4);
        }
        return this;
    }

    public s0 l(z0 z0Var, int i) {
        r0 r0Var;
        float f;
        if (i < 0) {
            this.b = (float) (i * -1);
            r0Var = this.d;
            f = 1.0f;
        } else {
            this.b = (float) i;
            r0Var = this.d;
            f = -1.0f;
        }
        r0Var.q(z0Var, f);
        return this;
    }

    public s0 m(z0 z0Var, z0 z0Var2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.q(z0Var, -1.0f);
            this.d.q(z0Var2, 1.0f);
        } else {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
        }
        return this;
    }

    public s0 n(z0 z0Var, z0 z0Var2, z0 z0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.q(z0Var, -1.0f);
            this.d.q(z0Var2, 1.0f);
            this.d.q(z0Var3, 1.0f);
        } else {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
            this.d.q(z0Var3, -1.0f);
        }
        return this;
    }

    public s0 o(z0 z0Var, z0 z0Var2, z0 z0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.q(z0Var, -1.0f);
            this.d.q(z0Var2, 1.0f);
            this.d.q(z0Var3, -1.0f);
        } else {
            this.d.q(z0Var, 1.0f);
            this.d.q(z0Var2, -1.0f);
            this.d.q(z0Var3, 1.0f);
        }
        return this;
    }

    public s0 p(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, float f) {
        this.d.q(z0Var3, 0.5f);
        this.d.q(z0Var4, 0.5f);
        this.d.q(z0Var, -0.5f);
        this.d.q(z0Var2, -0.5f);
        this.b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        float f = this.b;
        if (f < Utils.FLOAT_EPSILON) {
            this.b = f * -1.0f;
            this.d.o();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        z0 z0Var = this.a;
        return z0Var != null && (z0Var.i == z0.a.UNRESTRICTED || this.b >= Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    public boolean s(z0 z0Var) {
        return this.d.d(z0Var);
    }

    public boolean t() {
        return this.a == null && this.b == Utils.FLOAT_EPSILON && this.d.a == 0;
    }

    public String toString() {
        return x();
    }

    /* access modifiers changed from: package-private */
    public z0 u(z0 z0Var) {
        return this.d.k((boolean[]) null, z0Var);
    }

    /* access modifiers changed from: package-private */
    public void v(z0 z0Var) {
        z0 z0Var2 = this.a;
        if (z0Var2 != null) {
            this.d.q(z0Var2, -1.0f);
            this.a = null;
        }
        float r = this.d.r(z0Var, true) * -1.0f;
        this.a = z0Var;
        if (r != 1.0f) {
            this.b /= r;
            this.d.e(r);
        }
    }

    public void w() {
        this.a = null;
        this.d.c();
        this.b = Utils.FLOAT_EPSILON;
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String x() {
        /*
            r10 = this;
            z0 r0 = r10.a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            z0 r1 = r10.a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r0 r5 = r10.d
            int r5 = r5.a
        L_0x0057:
            if (r2 >= r5) goto L_0x00d0
            r0 r6 = r10.d
            z0 r6 = r6.m(r2)
            if (r6 != 0) goto L_0x0062
            goto L_0x00cd
        L_0x0062:
            r0 r7 = r10.d
            float r7 = r7.n(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006d
            goto L_0x00cd
        L_0x006d:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0084
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a0
        L_0x0084:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x0098
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00a9
        L_0x0098:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00a9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c2
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c2:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x00d0:
            if (r1 != 0) goto L_0x00e3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0.x():java.lang.String");
    }

    public void y(s0 s0Var, boolean z) {
        this.d.s(this, s0Var, z);
    }
}
