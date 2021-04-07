package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: k0  reason: default package */
public abstract class k0 {

    /* renamed from: k0$a */
    static class a extends k0 {
        double a;
        double[] b;

        a(double d, double[] dArr) {
            this.a = d;
            this.b = dArr;
        }

        public double c(double d, int i) {
            return this.b[i];
        }

        public void d(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        public double f(double d, int i) {
            return Utils.DOUBLE_EPSILON;
        }

        public void g(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        public double[] h() {
            return new double[]{this.a};
        }
    }

    public static k0 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new m0(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new n0(dArr, dArr2);
    }

    public static k0 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new j0(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract double f(double d, int i);

    public abstract void g(double d, double[] dArr);

    public abstract double[] h();
}
