package defpackage;

import defpackage.e1;
import defpackage.o1;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: f1  reason: default package */
public class f1 extends m1 {
    o1 D0 = new o1(this);
    public r1 E0 = new r1(this);
    protected o1.b F0 = null;
    private boolean G0 = false;
    protected u0 H0 = new u0();
    int I0;
    int J0;
    int K0 = 0;
    int L0 = 0;
    c1[] M0 = new c1[4];
    c1[] N0 = new c1[4];
    private int O0 = 7;
    private boolean P0 = false;
    private boolean Q0 = false;

    private void O0(e1 e1Var) {
        int i = this.K0 + 1;
        c1[] c1VarArr = this.N0;
        if (i >= c1VarArr.length) {
            this.N0 = (c1[]) Arrays.copyOf(c1VarArr, c1VarArr.length * 2);
        }
        this.N0[this.K0] = new c1(e1Var, 0, Z0());
        this.K0++;
    }

    private void P0(e1 e1Var) {
        int i = this.L0 + 1;
        c1[] c1VarArr = this.M0;
        if (i >= c1VarArr.length) {
            this.M0 = (c1[]) Arrays.copyOf(c1VarArr, c1VarArr.length * 2);
        }
        this.M0[this.L0] = new c1(e1Var, 1, Z0());
        this.L0++;
    }

    private void d1() {
        this.K0 = 0;
        this.L0 = 0;
    }

    public void G0(boolean z, boolean z2) {
        super.G0(z, z2);
        int size = this.C0.size();
        for (int i = 0; i < size; i++) {
            this.C0.get(i).G0(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    public void J0() {
        boolean z;
        ? r11;
        this.Q = 0;
        this.R = 0;
        int max = Math.max(0, P());
        int max2 = Math.max(0, v());
        this.P0 = false;
        this.Q0 = false;
        boolean z2 = c1(64) || c1(128);
        u0 u0Var = this.H0;
        u0Var.g = false;
        u0Var.h = false;
        if (this.O0 != 0 && z2) {
            u0Var.h = true;
        }
        e1.b[] bVarArr = this.K;
        e1.b bVar = bVarArr[1];
        e1.b bVar2 = bVarArr[0];
        ArrayList<e1> arrayList = this.C0;
        boolean z3 = y() == e1.b.WRAP_CONTENT || M() == e1.b.WRAP_CONTENT;
        d1();
        int size = this.C0.size();
        for (int i = 0; i < size; i++) {
            e1 e1Var = this.C0.get(i);
            if (e1Var instanceof m1) {
                ((m1) e1Var).J0();
            }
        }
        int i2 = 0;
        boolean z4 = true;
        boolean z5 = false;
        while (z4) {
            int i3 = i2 + 1;
            try {
                this.H0.D();
                d1();
                l(this.H0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.C0.get(i4).l(this.H0);
                }
                z4 = N0(this.H0);
                if (z4) {
                    this.H0.z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                PrintStream printStream = System.out;
                printStream.println("EXCEPTION : " + e);
            }
            u0 u0Var2 = this.H0;
            if (z4) {
                h1(u0Var2, k1.a);
            } else {
                H0(u0Var2);
                for (int i5 = 0; i5 < size; i5++) {
                    this.C0.get(i5).H0(this.H0);
                }
            }
            if (!z3 || i3 >= 8 || !k1.a[2]) {
                z = false;
            } else {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    e1 e1Var2 = this.C0.get(i8);
                    i6 = Math.max(i6, e1Var2.Q + e1Var2.P());
                    i7 = Math.max(i7, e1Var2.R + e1Var2.v());
                }
                int max3 = Math.max(this.X, i6);
                int max4 = Math.max(this.Y, i7);
                if (bVar2 != e1.b.WRAP_CONTENT || P() >= max3) {
                    z = false;
                } else {
                    C0(max3);
                    this.K[0] = e1.b.WRAP_CONTENT;
                    z = true;
                    z5 = true;
                }
                if (bVar == e1.b.WRAP_CONTENT && v() < max4) {
                    g0(max4);
                    this.K[1] = e1.b.WRAP_CONTENT;
                    z = true;
                    z5 = true;
                }
            }
            int max5 = Math.max(this.X, P());
            if (max5 > P()) {
                C0(max5);
                this.K[0] = e1.b.FIXED;
                z = true;
                z5 = true;
            }
            int max6 = Math.max(this.Y, v());
            if (max6 > v()) {
                g0(max6);
                r11 = 1;
                this.K[1] = e1.b.FIXED;
                z = true;
                z5 = true;
            } else {
                r11 = 1;
            }
            if (!z5) {
                if (this.K[0] == e1.b.WRAP_CONTENT && max > 0 && P() > max) {
                    this.P0 = r11;
                    this.K[0] = e1.b.FIXED;
                    C0(max);
                    z = true;
                    z5 = true;
                }
                if (this.K[r11] == e1.b.WRAP_CONTENT && max2 > 0 && v() > max2) {
                    this.Q0 = r11;
                    this.K[r11] = e1.b.FIXED;
                    g0(max2);
                    z4 = true;
                    z5 = true;
                    i2 = i3;
                }
            }
            z4 = z;
            i2 = i3;
        }
        this.C0 = arrayList;
        if (z5) {
            e1.b[] bVarArr2 = this.K;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        Z(this.H0.v());
    }

    /* access modifiers changed from: package-private */
    public void M0(e1 e1Var, int i) {
        if (i == 0) {
            O0(e1Var);
        } else if (i == 1) {
            P0(e1Var);
        }
    }

    public boolean N0(u0 u0Var) {
        e(u0Var);
        int size = this.C0.size();
        for (int i = 0; i < size; i++) {
            e1 e1Var = this.C0.get(i);
            if ((e1Var instanceof l1) || (e1Var instanceof h1)) {
                e1Var.e(u0Var);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            e1 e1Var2 = this.C0.get(i2);
            if (e1Var2 instanceof f1) {
                e1.b[] bVarArr = e1Var2.K;
                e1.b bVar = bVarArr[0];
                e1.b bVar2 = bVarArr[1];
                if (bVar == e1.b.WRAP_CONTENT) {
                    e1Var2.k0(e1.b.FIXED);
                }
                if (bVar2 == e1.b.WRAP_CONTENT) {
                    e1Var2.y0(e1.b.FIXED);
                }
                e1Var2.e(u0Var);
                if (bVar == e1.b.WRAP_CONTENT) {
                    e1Var2.k0(bVar);
                }
                if (bVar2 == e1.b.WRAP_CONTENT) {
                    e1Var2.y0(bVar2);
                }
            } else {
                k1.a(this, u0Var, e1Var2);
                if (!(e1Var2 instanceof l1) && !(e1Var2 instanceof h1)) {
                    e1Var2.e(u0Var);
                }
            }
        }
        if (this.K0 > 0) {
            b1.a(this, u0Var, 0);
        }
        if (this.L0 > 0) {
            b1.a(this, u0Var, 1);
        }
        return true;
    }

    public boolean Q0(boolean z) {
        return this.E0.f(z);
    }

    public boolean R0(boolean z) {
        return this.E0.g(z);
    }

    public boolean S0(boolean z, int i) {
        return this.E0.h(z, i);
    }

    public o1.b T0() {
        return this.F0;
    }

    public int U0() {
        return this.O0;
    }

    public boolean V0() {
        return false;
    }

    public void W0() {
        this.E0.j();
    }

    public void X() {
        this.H0.D();
        this.I0 = 0;
        this.J0 = 0;
        super.X();
    }

    public void X0() {
        this.E0.k();
    }

    public boolean Y0() {
        return this.Q0;
    }

    public boolean Z0() {
        return this.G0;
    }

    public boolean a1() {
        return this.P0;
    }

    public void b1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.I0 = i10;
        int i11 = i9;
        this.J0 = i11;
        this.D0.d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    public boolean c1(int i) {
        return (this.O0 & i) == i;
    }

    public void e1(o1.b bVar) {
        this.F0 = bVar;
        this.E0.n(bVar);
    }

    public void f1(int i) {
        this.O0 = i;
    }

    public void g1(boolean z) {
        this.G0 = z;
    }

    public void h1(u0 u0Var, boolean[] zArr) {
        zArr[2] = false;
        H0(u0Var);
        int size = this.C0.size();
        for (int i = 0; i < size; i++) {
            this.C0.get(i).H0(u0Var);
        }
    }

    public void i1() {
        this.D0.e(this);
    }
}
