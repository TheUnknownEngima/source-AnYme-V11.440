package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.e1;
import java.util.ArrayList;

/* renamed from: c1  reason: default package */
public class c1 {
    protected e1 a;
    protected e1 b;
    protected e1 c;
    protected e1 d;
    protected e1 e;
    protected e1 f;
    protected e1 g;
    protected ArrayList<e1> h;
    protected int i;
    protected int j;
    protected float k = Utils.FLOAT_EPSILON;
    int l;
    int m;
    int n;
    private int o;
    private boolean p = false;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private boolean t;

    public c1(e1 e1Var, int i2, boolean z) {
        this.a = e1Var;
        this.o = i2;
        this.p = z;
    }

    private void b() {
        int i2 = this.o * 2;
        e1 e1Var = this.a;
        boolean z = false;
        e1 e1Var2 = e1Var;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            e1[] e1VarArr = e1Var.y0;
            int i3 = this.o;
            e1 e1Var3 = null;
            e1VarArr[i3] = null;
            e1Var.x0[i3] = null;
            if (e1Var.O() != 8) {
                this.l++;
                if (e1Var.s(this.o) != e1.b.MATCH_CONSTRAINT) {
                    this.m += e1Var.A(this.o);
                }
                int c2 = this.m + e1Var.I[i2].c();
                this.m = c2;
                int i4 = i2 + 1;
                this.m = c2 + e1Var.I[i4].c();
                int c3 = this.n + e1Var.I[i2].c();
                this.n = c3;
                this.n = c3 + e1Var.I[i4].c();
                if (this.b == null) {
                    this.b = e1Var;
                }
                this.d = e1Var;
                e1.b[] bVarArr = e1Var.K;
                int i5 = this.o;
                if (bVarArr[i5] == e1.b.MATCH_CONSTRAINT) {
                    int[] iArr = e1Var.l;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.j++;
                        float[] fArr = e1Var.w0;
                        int i6 = this.o;
                        float f2 = fArr[i6];
                        if (f2 > Utils.FLOAT_EPSILON) {
                            this.k += fArr[i6];
                        }
                        if (c(e1Var, this.o)) {
                            if (f2 < Utils.FLOAT_EPSILON) {
                                this.q = true;
                            } else {
                                this.r = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(e1Var);
                        }
                        if (this.f == null) {
                            this.f = e1Var;
                        }
                        e1 e1Var4 = this.g;
                        if (e1Var4 != null) {
                            e1Var4.x0[this.o] = e1Var;
                        }
                        this.g = e1Var;
                    }
                    if (this.o == 0) {
                        if (e1Var.j == 0 && e1Var.m == 0) {
                            int i7 = e1Var.n;
                        }
                    } else if (e1Var.k == 0 && e1Var.p == 0) {
                        int i8 = e1Var.q;
                    }
                    int i9 = (e1Var.O > Utils.FLOAT_EPSILON ? 1 : (e1Var.O == Utils.FLOAT_EPSILON ? 0 : -1));
                }
            }
            if (e1Var2 != e1Var) {
                e1Var2.y0[this.o] = e1Var;
            }
            d1 d1Var = e1Var.I[i2 + 1].c;
            if (d1Var != null) {
                e1 e1Var5 = d1Var.a;
                d1[] d1VarArr = e1Var5.I;
                if (d1VarArr[i2].c != null && d1VarArr[i2].c.a == e1Var) {
                    e1Var3 = e1Var5;
                }
            }
            if (e1Var3 == null) {
                e1Var3 = e1Var;
                z2 = true;
            }
            e1Var2 = e1Var;
            e1Var = e1Var3;
        }
        e1 e1Var6 = this.b;
        if (e1Var6 != null) {
            this.m -= e1Var6.I[i2].c();
        }
        e1 e1Var7 = this.d;
        if (e1Var7 != null) {
            this.m -= e1Var7.I[i2 + 1].c();
        }
        this.c = e1Var;
        if (this.o != 0 || !this.p) {
            this.e = this.a;
        } else {
            this.e = e1Var;
        }
        if (this.r && this.q) {
            z = true;
        }
        this.s = z;
    }

    private static boolean c(e1 e1Var, int i2) {
        if (e1Var.O() != 8 && e1Var.K[i2] == e1.b.MATCH_CONSTRAINT) {
            int[] iArr = e1Var.l;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.t) {
            b();
        }
        this.t = true;
    }
}
