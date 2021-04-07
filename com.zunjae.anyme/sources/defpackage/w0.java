package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: w0  reason: default package */
public class w0 extends s0 {
    private int f = 128;
    private z0[] g = new z0[128];
    private z0[] h = new z0[128];
    private int i = 0;
    b j = new b(this);
    t0 k;

    /* renamed from: w0$a */
    class a implements Comparator<z0> {
        a(w0 w0Var) {
        }

        /* renamed from: a */
        public int compare(z0 z0Var, z0 z0Var2) {
            return z0Var.c - z0Var2.c;
        }
    }

    /* renamed from: w0$b */
    class b implements Comparable {
        z0 e;

        public b(w0 w0Var) {
        }

        public boolean a(z0 z0Var, float f2) {
            boolean z = true;
            if (this.e.a) {
                for (int i = 0; i < 8; i++) {
                    float[] fArr = this.e.h;
                    fArr[i] = fArr[i] + (z0Var.h[i] * f2);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.e.h[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    w0.this.B(this.e);
                }
                return false;
            }
            for (int i2 = 0; i2 < 8; i2++) {
                float f3 = z0Var.h[i2];
                if (f3 != Utils.FLOAT_EPSILON) {
                    float f4 = f3 * f2;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = Utils.FLOAT_EPSILON;
                    }
                    this.e.h[i2] = f4;
                } else {
                    this.e.h[i2] = 0.0f;
                }
            }
            return true;
        }

        public int compareTo(Object obj) {
            return this.e.c - ((z0) obj).c;
        }

        public void e(z0 z0Var) {
            this.e = z0Var;
        }

        public final boolean f() {
            for (int i = 7; i >= 0; i--) {
                float f2 = this.e.h[i];
                if (f2 > Utils.FLOAT_EPSILON) {
                    return false;
                }
                if (f2 < Utils.FLOAT_EPSILON) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(z0 z0Var) {
            int i = 7;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f2 = z0Var.h[i];
                float f3 = this.e.h[i];
                if (f3 == f2) {
                    i--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void i() {
            Arrays.fill(this.e.h, Utils.FLOAT_EPSILON);
        }

        public String toString() {
            String str = "[ ";
            if (this.e != null) {
                for (int i = 0; i < 8; i++) {
                    str = str + this.e.h[i] + " ";
                }
            }
            return str + "] " + this.e;
        }
    }

    public w0(t0 t0Var) {
        super(t0Var);
        this.k = t0Var;
    }

    private final void A(z0 z0Var) {
        int i2;
        int i3 = this.i + 1;
        z0[] z0VarArr = this.g;
        if (i3 > z0VarArr.length) {
            z0[] z0VarArr2 = (z0[]) Arrays.copyOf(z0VarArr, z0VarArr.length * 2);
            this.g = z0VarArr2;
            this.h = (z0[]) Arrays.copyOf(z0VarArr2, z0VarArr2.length * 2);
        }
        z0[] z0VarArr3 = this.g;
        int i4 = this.i;
        z0VarArr3[i4] = z0Var;
        int i5 = i4 + 1;
        this.i = i5;
        if (i5 > 1 && z0VarArr3[i5 - 1].c > z0Var.c) {
            int i6 = 0;
            while (true) {
                i2 = this.i;
                if (i6 >= i2) {
                    break;
                }
                this.h[i6] = this.g[i6];
                i6++;
            }
            Arrays.sort(this.h, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.i; i7++) {
                this.g[i7] = this.h[i7];
            }
        }
        z0Var.a = true;
        z0Var.a(this);
    }

    /* access modifiers changed from: private */
    public final void B(z0 z0Var) {
        int i2 = 0;
        while (i2 < this.i) {
            if (this.g[i2] == z0Var) {
                while (true) {
                    int i3 = this.i;
                    if (i2 < i3 - 1) {
                        z0[] z0VarArr = this.g;
                        int i4 = i2 + 1;
                        z0VarArr[i2] = z0VarArr[i4];
                        i2 = i4;
                    } else {
                        this.i = i3 - 1;
                        z0Var.a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public void a(z0 z0Var) {
        this.j.e(z0Var);
        this.j.i();
        z0Var.h[z0Var.e] = 1.0f;
        A(z0Var);
    }

    public z0 b(u0 u0Var, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.i; i3++) {
            z0 z0Var = this.g[i3];
            if (!zArr[z0Var.c]) {
                this.j.e(z0Var);
                b bVar = this.j;
                if (i2 == -1) {
                    if (!bVar.f()) {
                    }
                } else if (!bVar.h(this.g[i2])) {
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.g[i2];
    }

    public void clear() {
        this.i = 0;
        this.b = Utils.FLOAT_EPSILON;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.i; i2++) {
            this.j.e(this.g[i2]);
            str = str + this.j + " ";
        }
        return str;
    }

    public void y(s0 s0Var, boolean z) {
        z0 z0Var = s0Var.a;
        if (z0Var != null) {
            int h2 = s0Var.d.h();
            int g2 = s0Var.d.g();
            while (h2 != -1 && g2 > 0) {
                int i2 = s0Var.d.i(h2);
                float l = s0Var.d.l(h2);
                z0 z0Var2 = this.k.c[i2];
                this.j.e(z0Var2);
                if (this.j.a(z0Var, l)) {
                    A(z0Var2);
                }
                this.b += s0Var.b * l;
                h2 = s0Var.d.j(h2);
            }
            B(z0Var);
        }
    }
}
