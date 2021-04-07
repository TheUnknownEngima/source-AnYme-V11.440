package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: j0  reason: default package */
class j0 extends k0 {
    private final double[] a;
    a[] b;

    /* renamed from: j0$a */
    private static class a {
        private static double[] s = new double[91];
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r = false;

        a(int i2, double d2, double d3, double d4, double d5, double d6, double d7) {
            int i3 = i2;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            double d13 = d7;
            boolean z = false;
            this.q = i3 == 1 ? true : z;
            this.c = d8;
            this.d = d9;
            this.i = 1.0d / (d9 - d8);
            if (3 == i3) {
                this.r = true;
            }
            double d14 = d12 - d10;
            double d15 = d13 - d11;
            if (this.r || Math.abs(d14) < 0.001d || Math.abs(d15) < 0.001d) {
                this.r = true;
                this.e = d10;
                this.f = d12;
                this.g = d11;
                this.h = d13;
                double hypot = Math.hypot(d15, d14);
                this.b = hypot;
                this.n = hypot * this.i;
                double d16 = this.d;
                double d17 = this.c;
                this.l = d14 / (d16 - d17);
                this.m = d15 / (d16 - d17);
                return;
            }
            this.a = new double[101];
            this.j = d14 * ((double) (this.q ? -1 : 1));
            this.k = d15 * ((double) (this.q ? 1 : -1));
            this.l = this.q ? d12 : d10;
            this.m = this.q ? d11 : d13;
            a(d4, d5, d6, d7);
            this.n = this.b * this.i;
        }

        private void a(double d2, double d3, double d4, double d5) {
            double d6;
            double d7 = d4 - d2;
            double d8 = d3 - d5;
            int i2 = 0;
            double d9 = Utils.DOUBLE_EPSILON;
            double d10 = Utils.DOUBLE_EPSILON;
            double d11 = Utils.DOUBLE_EPSILON;
            while (true) {
                double[] dArr = s;
                if (i2 >= dArr.length) {
                    break;
                }
                double d12 = d9;
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d7;
                double cos = Math.cos(radians) * d8;
                if (i2 > 0) {
                    d6 = d12 + Math.hypot(sin - d10, cos - d11);
                    s[i2] = d6;
                } else {
                    d6 = d12;
                }
                i2++;
                d11 = cos;
                double d13 = sin;
                d9 = d6;
                d10 = d13;
            }
            double d14 = d9;
            this.b = d14;
            int i3 = 0;
            while (true) {
                double[] dArr2 = s;
                if (i3 >= dArr2.length) {
                    break;
                }
                dArr2[i3] = dArr2[i3] / d14;
                i3++;
            }
            int i4 = 0;
            while (true) {
                double[] dArr3 = this.a;
                if (i4 < dArr3.length) {
                    double length = ((double) i4) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(s, length);
                    if (binarySearch >= 0) {
                        this.a[i4] = (double) (binarySearch / (s.length - 1));
                    } else if (binarySearch == -1) {
                        this.a[i4] = 0.0d;
                    } else {
                        int i5 = -binarySearch;
                        int i6 = i5 - 2;
                        double[] dArr4 = s;
                        this.a[i4] = (((double) i6) + ((length - dArr4[i6]) / (dArr4[i5 - 1] - dArr4[i6]))) / ((double) (dArr4.length - 1));
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public double b() {
            double d2 = this.j * this.p;
            double hypot = this.n / Math.hypot(d2, (-this.k) * this.o);
            if (this.q) {
                d2 = -d2;
            }
            return d2 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double c() {
            double d2 = this.j * this.p;
            double d3 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d2, d3);
            return this.q ? (-d3) * hypot : d3 * hypot;
        }

        public double d(double d2) {
            return this.l;
        }

        public double e(double d2) {
            return this.m;
        }

        public double f(double d2) {
            double d3 = (d2 - this.c) * this.i;
            double d4 = this.e;
            return d4 + (d3 * (this.f - d4));
        }

        public double g(double d2) {
            double d3 = (d2 - this.c) * this.i;
            double d4 = this.g;
            return d4 + (d3 * (this.h - d4));
        }

        /* access modifiers changed from: package-private */
        public double h() {
            return this.l + (this.j * this.o);
        }

        /* access modifiers changed from: package-private */
        public double i() {
            return this.m + (this.k * this.p);
        }

        /* access modifiers changed from: package-private */
        public double j(double d2) {
            if (d2 <= Utils.DOUBLE_EPSILON) {
                return Utils.DOUBLE_EPSILON;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.a;
            double length = d2 * ((double) (dArr.length - 1));
            int i2 = (int) length;
            return dArr[i2] + ((length - ((double) i2)) * (dArr[i2 + 1] - dArr[i2]));
        }

        /* access modifiers changed from: package-private */
        public void k(double d2) {
            double j2 = j((this.q ? this.d - d2 : d2 - this.c) * this.i) * 1.5707963267948966d;
            this.o = Math.sin(j2);
            this.p = Math.cos(j2);
        }
    }

    public j0(int[] iArr, double[] dArr, double[][] dArr2) {
        int i;
        double[] dArr3 = dArr;
        this.a = dArr3;
        this.b = new a[(dArr3.length - 1)];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < this.b.length) {
            int i5 = iArr[i2];
            if (i5 == 0) {
                i = 3;
            } else if (i5 == 1) {
                i3 = 1;
                i = 1;
            } else if (i5 == 2) {
                i3 = 2;
                i = 2;
            } else if (i5 != 3) {
                i = i4;
            } else {
                i3 = i3 == 1 ? 2 : 1;
                i = i3;
            }
            int i6 = i2 + 1;
            this.b[i2] = new a(i, dArr3[i2], dArr3[i6], dArr2[i2][0], dArr2[i2][1], dArr2[i6][0], dArr2[i6][1]);
            i4 = i;
            i2 = i6;
        }
    }

    public double c(double d, int i) {
        a[] aVarArr = this.b;
        int i2 = 0;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].d) {
                i2++;
            } else if (aVarArr2[i2].r) {
                return i == 0 ? aVarArr2[i2].f(d) : aVarArr2[i2].g(d);
            } else {
                aVarArr2[i2].k(d);
                a[] aVarArr3 = this.b;
                return i == 0 ? aVarArr3[i2].h() : aVarArr3[i2].i();
            }
        }
    }

    public void d(double d, double[] dArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        }
        a[] aVarArr2 = this.b;
        if (d > aVarArr2[aVarArr2.length - 1].d) {
            d = aVarArr2[aVarArr2.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.b;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].d) {
                i++;
            } else if (aVarArr3[i].r) {
                dArr[0] = aVarArr3[i].f(d);
                dArr[1] = this.b[i].g(d);
                return;
            } else {
                aVarArr3[i].k(d);
                dArr[0] = this.b[i].h();
                dArr[1] = this.b[i].i();
                return;
            }
        }
    }

    public void e(double d, float[] fArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].d) {
                i++;
            } else if (aVarArr2[i].r) {
                fArr[0] = (float) aVarArr2[i].f(d);
                fArr[1] = (float) this.b[i].g(d);
                return;
            } else {
                aVarArr2[i].k(d);
                fArr[0] = (float) this.b[i].h();
                fArr[1] = (float) this.b[i].i();
                return;
            }
        }
    }

    public double f(double d, int i) {
        a[] aVarArr = this.b;
        int i2 = 0;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        }
        a[] aVarArr2 = this.b;
        if (d > aVarArr2[aVarArr2.length - 1].d) {
            d = aVarArr2[aVarArr2.length - 1].d;
        }
        while (true) {
            a[] aVarArr3 = this.b;
            if (i2 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d > aVarArr3[i2].d) {
                i2++;
            } else if (aVarArr3[i2].r) {
                return i == 0 ? aVarArr3[i2].d(d) : aVarArr3[i2].e(d);
            } else {
                aVarArr3[i2].k(d);
                a[] aVarArr4 = this.b;
                return i == 0 ? aVarArr4[i2].b() : aVarArr4[i2].c();
            }
        }
    }

    public void g(double d, double[] dArr) {
        a[] aVarArr = this.b;
        if (d < aVarArr[0].c) {
            d = aVarArr[0].c;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].d) {
                i++;
            } else if (aVarArr2[i].r) {
                dArr[0] = aVarArr2[i].d(d);
                dArr[1] = this.b[i].e(d);
                return;
            } else {
                aVarArr2[i].k(d);
                dArr[0] = this.b[i].b();
                dArr[1] = this.b[i].c();
                return;
            }
        }
    }

    public double[] h() {
        return this.a;
    }
}
