package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: o0  reason: default package */
public class o0 {
    float[] a = new float[0];
    double[] b = new double[0];
    double[] c;
    int d;
    double e = 6.283185307179586d;

    public void a(double d2, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d2;
        this.a[binarySearch] = f;
    }

    /* access modifiers changed from: package-private */
    public double b(double d2) {
        if (d2 <= Utils.DOUBLE_EPSILON) {
            d2 = 1.0E-5d;
        } else if (d2 >= 1.0d) {
            d2 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch > 0 || binarySearch == 0) {
            return Utils.DOUBLE_EPSILON;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.a;
        int i2 = i - 1;
        double d3 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.b;
        double d4 = d3 / (dArr[i] - dArr[i2]);
        return (((double) fArr[i2]) - (d4 * dArr[i2])) + (d2 * d4);
    }

    /* access modifiers changed from: package-private */
    public double c(double d2) {
        if (d2 < Utils.DOUBLE_EPSILON) {
            d2 = 0.0d;
        } else if (d2 > 1.0d) {
            d2 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d2);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return Utils.DOUBLE_EPSILON;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.a;
        int i2 = i - 1;
        double d3 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.b;
        double d4 = d3 / (dArr[i] - dArr[i2]);
        return this.c[i2] + ((((double) fArr[i2]) - (dArr[i2] * d4)) * (d2 - dArr[i2])) + ((d4 * ((d2 * d2) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        return r10 * 2.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        return r0 * r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        return r5 * r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double d(double r10) {
        /*
            r9 = this;
            int r0 = r9.d
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r0) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0055;
                case 3: goto L_0x0050;
                case 4: goto L_0x0048;
                case 5: goto L_0x0032;
                case 6: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            double r0 = r9.e
            double r2 = r9.b(r10)
            double r0 = r0 * r2
            double r2 = r9.e
            double r10 = r9.c(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.cos(r2)
        L_0x001d:
            double r0 = r0 * r10
            return r0
        L_0x0020:
            double r5 = r9.b(r10)
            double r5 = r5 * r3
            double r10 = r9.c(r10)
            double r10 = r10 * r3
            double r10 = r10 + r1
            double r10 = r10 % r3
            double r10 = r10 - r1
        L_0x002f:
            double r5 = r5 * r10
            return r5
        L_0x0032:
            double r0 = r9.e
            double r0 = -r0
            double r2 = r9.b(r10)
            double r0 = r0 * r2
            double r2 = r9.e
            double r10 = r9.c(r10)
            double r2 = r2 * r10
            double r10 = java.lang.Math.sin(r2)
            goto L_0x001d
        L_0x0048:
            double r10 = r9.b(r10)
            double r10 = -r10
        L_0x004d:
            double r10 = r10 * r1
            return r10
        L_0x0050:
            double r10 = r9.b(r10)
            goto L_0x004d
        L_0x0055:
            double r5 = r9.b(r10)
            double r5 = r5 * r3
            double r10 = r9.c(r10)
            double r10 = r10 * r3
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 + r7
            double r10 = r10 % r3
            double r10 = r10 - r1
            double r10 = java.lang.Math.signum(r10)
            goto L_0x002f
        L_0x006b:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0.d(double):double");
    }

    public double e(double d2) {
        double abs;
        switch (this.d) {
            case 1:
                return Math.signum(0.5d - (c(d2) % 1.0d));
            case 2:
                abs = Math.abs((((c(d2) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c(d2) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c(d2) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.e * c(d2));
            case 6:
                double abs2 = 1.0d - Math.abs(((c(d2) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(this.e * c(d2));
        }
        return 1.0d - abs;
    }

    public void f() {
        double d2 = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                break;
            }
            d2 += (double) fArr[i];
            i++;
        }
        int i2 = 1;
        double d3 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.a;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            double[] dArr = this.b;
            d3 += (dArr[i3] - dArr[i4]) * ((double) ((fArr2[i4] + fArr2[i3]) / 2.0f));
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d2 / d3));
            i5++;
        }
        this.c[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.a;
            if (i2 < fArr4.length) {
                int i6 = i2 - 1;
                double[] dArr2 = this.b;
                double d4 = dArr2[i2] - dArr2[i6];
                double[] dArr3 = this.c;
                dArr3[i2] = dArr3[i6] + (d4 * ((double) ((fArr4[i6] + fArr4[i2]) / 2.0f)));
                i2++;
            } else {
                return;
            }
        }
    }

    public void g(int i) {
        this.d = i;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}
