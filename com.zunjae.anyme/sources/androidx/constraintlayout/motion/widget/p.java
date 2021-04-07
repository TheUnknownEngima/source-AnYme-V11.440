package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.c;
import com.github.mikephil.charting.utils.Utils;
import java.util.LinkedHashMap;

class p implements Comparable<p> {
    static String[] u = {"position", "x", "y", "width", "height", "pathRotate"};
    l0 e;
    int f = 0;
    float g;
    float h;
    float i;
    float j;
    float k;
    float l;
    float m = Float.NaN;
    int n = c.e;
    int o = 0;
    int p = 0;
    LinkedHashMap<String, a> q = new LinkedHashMap<>();
    int r = 0;
    double[] s = new double[18];
    double[] t = new double[18];

    public p() {
    }

    public p(int i2, int i3, i iVar, p pVar, p pVar2) {
        this.p = pVar2.p;
        this.o = pVar2.o;
        int i4 = iVar.p;
        if (i4 == 1) {
            t(iVar, pVar, pVar2);
        } else if (i4 != 2) {
            s(iVar, pVar, pVar2);
        } else {
            v(i2, i3, iVar, pVar, pVar2);
        }
    }

    private boolean f(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    public void a(c.a aVar) {
        this.e = l0.c(aVar.c.c);
        c.C0016c cVar = aVar.c;
        this.n = cVar.d;
        this.m = cVar.g;
        this.f = cVar.e;
        float f2 = aVar.b.e;
        for (String next : aVar.f.keySet()) {
            a aVar2 = aVar.f.get(next);
            if (aVar2.c() != a.b.STRING_TYPE) {
                this.q.put(next, aVar2);
            }
        }
    }

    /* renamed from: e */
    public int compareTo(p pVar) {
        return Float.compare(this.h, pVar.h);
    }

    /* access modifiers changed from: package-private */
    public void h(p pVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | f(this.h, pVar.h);
        zArr[1] = zArr[1] | f(this.i, pVar.i) | z;
        zArr[2] = z | f(this.j, pVar.j) | zArr[2];
        zArr[3] = zArr[3] | f(this.k, pVar.k);
        zArr[4] = f(this.l, pVar.l) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void i(double[] dArr, int[] iArr) {
        float[] fArr = {this.h, this.i, this.j, this.k, this.l, this.m};
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] < 6) {
                dArr[i2] = (double) fArr[iArr[i3]];
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.i;
        float f3 = this.j;
        float f4 = this.k;
        float f5 = this.l;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f6 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f2 = f6;
            } else if (i4 == 2) {
                f3 = f6;
            } else if (i4 == 3) {
                f4 = f6;
            } else if (i4 == 4) {
                f5 = f6;
            }
        }
        fArr[i2] = f2 + (f4 / 2.0f) + Utils.FLOAT_EPSILON;
        fArr[i2 + 1] = f3 + (f5 / 2.0f) + Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    public int l(String str, double[] dArr, int i2) {
        a aVar = this.q.get(str);
        if (aVar.f() == 1) {
            dArr[i2] = (double) aVar.d();
            return 1;
        }
        int f2 = aVar.f();
        float[] fArr = new float[f2];
        aVar.e(fArr);
        int i3 = 0;
        while (i3 < f2) {
            dArr[i2] = (double) fArr[i3];
            i3++;
            i2++;
        }
        return f2;
    }

    /* access modifiers changed from: package-private */
    public int m(String str) {
        return this.q.get(str).f();
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.i;
        float f3 = this.j;
        float f4 = this.k;
        float f5 = this.l;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f6 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f2 = f6;
            } else if (i4 == 2) {
                f3 = f6;
            } else if (i4 == 3) {
                f4 = f6;
            } else if (i4 == 4) {
                f5 = f6;
            }
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        boolean isNaN = Float.isNaN(Float.NaN);
        boolean isNaN2 = Float.isNaN(Float.NaN);
        float f9 = f2 + Utils.FLOAT_EPSILON;
        float f10 = f3 + Utils.FLOAT_EPSILON;
        float f11 = f7 + Utils.FLOAT_EPSILON;
        float f12 = f3 + Utils.FLOAT_EPSILON;
        float f13 = f7 + Utils.FLOAT_EPSILON;
        float f14 = f8 + Utils.FLOAT_EPSILON;
        float f15 = f2 + Utils.FLOAT_EPSILON;
        float f16 = f8 + Utils.FLOAT_EPSILON;
        int i5 = i2 + 1;
        fArr[i2] = f9;
        int i6 = i5 + 1;
        fArr[i5] = f10;
        int i7 = i6 + 1;
        fArr[i6] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        int i10 = i9 + 1;
        fArr[i9] = f14;
        fArr[i10] = f15;
        fArr[i10 + 1] = f16;
    }

    /* access modifiers changed from: package-private */
    public boolean r(String str) {
        return this.q.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void s(i iVar, p pVar, p pVar2) {
        i iVar2 = iVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f2 = ((float) iVar2.a) / 100.0f;
        this.g = f2;
        this.f = iVar2.i;
        float f3 = Float.isNaN(iVar2.j) ? f2 : iVar2.j;
        float f4 = Float.isNaN(iVar2.k) ? f2 : iVar2.k;
        float f5 = pVar4.k;
        float f6 = pVar3.k;
        float f7 = pVar4.l;
        float f8 = pVar3.l;
        this.h = this.g;
        float f9 = pVar3.i;
        float f10 = pVar3.j;
        float f11 = (pVar4.i + (f5 / 2.0f)) - ((f6 / 2.0f) + f9);
        float f12 = (pVar4.j + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = (f5 - f6) * f3;
        float f14 = f13 / 2.0f;
        this.i = (float) ((int) ((f9 + (f11 * f2)) - f14));
        float f15 = (f7 - f8) * f4;
        float f16 = f15 / 2.0f;
        this.j = (float) ((int) ((f10 + (f12 * f2)) - f16));
        this.k = (float) ((int) (f6 + f13));
        this.l = (float) ((int) (f8 + f15));
        i iVar3 = iVar;
        float f17 = Float.isNaN(iVar3.l) ? f2 : iVar3.l;
        boolean isNaN = Float.isNaN(iVar3.o);
        float f18 = Utils.FLOAT_EPSILON;
        float f19 = isNaN ? Utils.FLOAT_EPSILON : iVar3.o;
        if (!Float.isNaN(iVar3.m)) {
            f2 = iVar3.m;
        }
        if (!Float.isNaN(iVar3.n)) {
            f18 = iVar3.n;
        }
        this.r = 2;
        p pVar5 = pVar;
        this.i = (float) ((int) (((pVar5.i + (f17 * f11)) + (f18 * f12)) - f14));
        this.j = (float) ((int) (((pVar5.j + (f11 * f19)) + (f12 * f2)) - f16));
        this.e = l0.c(iVar3.g);
        this.n = iVar3.h;
    }

    /* access modifiers changed from: package-private */
    public void t(i iVar, p pVar, p pVar2) {
        i iVar2 = iVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f2 = ((float) iVar2.a) / 100.0f;
        this.g = f2;
        this.f = iVar2.i;
        float f3 = Float.isNaN(iVar2.j) ? f2 : iVar2.j;
        float f4 = Float.isNaN(iVar2.k) ? f2 : iVar2.k;
        float f5 = pVar4.k - pVar3.k;
        float f6 = pVar4.l - pVar3.l;
        this.h = this.g;
        if (!Float.isNaN(iVar2.l)) {
            f2 = iVar2.l;
        }
        float f7 = pVar3.i;
        float f8 = pVar3.k;
        float f9 = pVar3.j;
        float f10 = pVar3.l;
        float f11 = (pVar4.i + (pVar4.k / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (pVar4.j + (pVar4.l / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = f5 * f3;
        float f15 = f14 / 2.0f;
        this.i = (float) ((int) ((f7 + f13) - f15));
        float f16 = f2 * f12;
        float f17 = f6 * f4;
        float f18 = f17 / 2.0f;
        this.j = (float) ((int) ((f9 + f16) - f18));
        this.k = (float) ((int) (f8 + f14));
        this.l = (float) ((int) (f10 + f17));
        i iVar3 = iVar;
        float f19 = Float.isNaN(iVar3.m) ? Utils.FLOAT_EPSILON : iVar3.m;
        float f20 = (-f12) * f19;
        float f21 = f11 * f19;
        this.r = 1;
        p pVar5 = pVar;
        float f22 = (float) ((int) ((pVar5.i + f13) - f15));
        this.i = f22;
        float f23 = (float) ((int) ((pVar5.j + f16) - f18));
        this.j = f23;
        this.i = f22 + f20;
        this.j = f23 + f21;
        this.e = l0.c(iVar3.g);
        this.n = iVar3.h;
    }

    /* access modifiers changed from: package-private */
    public void v(int i2, int i3, i iVar, p pVar, p pVar2) {
        i iVar2 = iVar;
        p pVar3 = pVar;
        p pVar4 = pVar2;
        float f2 = ((float) iVar2.a) / 100.0f;
        this.g = f2;
        this.f = iVar2.i;
        float f3 = Float.isNaN(iVar2.j) ? f2 : iVar2.j;
        float f4 = Float.isNaN(iVar2.k) ? f2 : iVar2.k;
        float f5 = pVar4.k;
        float f6 = pVar3.k;
        float f7 = pVar4.l;
        float f8 = pVar3.l;
        this.h = this.g;
        float f9 = pVar3.i;
        float f10 = pVar3.j;
        float f11 = pVar4.i + (f5 / 2.0f);
        float f12 = pVar4.j + (f7 / 2.0f);
        float f13 = (f5 - f6) * f3;
        this.i = (float) ((int) ((f9 + ((f11 - ((f6 / 2.0f) + f9)) * f2)) - (f13 / 2.0f)));
        float f14 = (f7 - f8) * f4;
        this.j = (float) ((int) ((f10 + ((f12 - (f10 + (f8 / 2.0f))) * f2)) - (f14 / 2.0f)));
        this.k = (float) ((int) (f6 + f13));
        this.l = (float) ((int) (f8 + f14));
        this.r = 3;
        i iVar3 = iVar;
        if (!Float.isNaN(iVar3.l)) {
            this.i = (float) ((int) (iVar3.l * ((float) ((int) (((float) i2) - this.k)))));
        }
        if (!Float.isNaN(iVar3.m)) {
            this.j = (float) ((int) (iVar3.m * ((float) ((int) (((float) i3) - this.l)))));
        }
        this.e = l0.c(iVar3.g);
        this.n = iVar3.h;
    }

    /* access modifiers changed from: package-private */
    public void w(float f2, float f3, float f4, float f5) {
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.o = View.MeasureSpec.makeMeasureSpec((int) f4, 1073741824);
        this.p = View.MeasureSpec.makeMeasureSpec((int) f5, 1073741824);
    }

    /* access modifiers changed from: package-private */
    public void x(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f4 = Utils.FLOAT_EPSILON;
        float f5 = Utils.FLOAT_EPSILON;
        float f6 = Utils.FLOAT_EPSILON;
        float f7 = Utils.FLOAT_EPSILON;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f8 = (float) dArr[i2];
            double d = dArr2[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f4 = f8;
            } else if (i3 == 2) {
                f6 = f8;
            } else if (i3 == 3) {
                f5 = f8;
            } else if (i3 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((Utils.FLOAT_EPSILON * f5) / 2.0f);
        float f10 = f6 - ((Utils.FLOAT_EPSILON * f7) / 2.0f);
        fArr[0] = (f9 * (1.0f - f2)) + (((f5 * 1.0f) + f9) * f2) + Utils.FLOAT_EPSILON;
        fArr[1] = (f10 * (1.0f - f3)) + (((f7 * 1.0f) + f10) * f3) + Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (java.lang.Float.isNaN(Float.NaN) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            float r3 = r0.i
            float r4 = r0.j
            float r5 = r0.k
            float r6 = r0.l
            int r7 = r2.length
            r8 = 1
            if (r7 == 0) goto L_0x0028
            double[] r7 = r0.s
            int r7 = r7.length
            int r9 = r2.length
            int r9 = r9 - r8
            r9 = r2[r9]
            if (r7 > r9) goto L_0x0028
            int r7 = r2.length
            int r7 = r7 - r8
            r7 = r2[r7]
            int r7 = r7 + r8
            double[] r9 = new double[r7]
            r0.s = r9
            double[] r7 = new double[r7]
            r0.t = r7
        L_0x0028:
            double[] r7 = r0.s
            r9 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.util.Arrays.fill(r7, r9)
            r9 = 0
        L_0x0030:
            int r10 = r2.length
            if (r9 >= r10) goto L_0x0046
            double[] r10 = r0.s
            r11 = r2[r9]
            r12 = r24[r9]
            r10[r11] = r12
            double[] r10 = r0.t
            r11 = r2[r9]
            r12 = r25[r9]
            r10[r11] = r12
            int r9 = r9 + 1
            goto L_0x0030
        L_0x0046:
            r10 = 0
            r11 = 2143289344(0x7fc00000, float:NaN)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x004d:
            double[] r7 = r0.s
            int r9 = r7.length
            if (r10 >= r9) goto L_0x00ac
            r17 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r17)
            r17 = 0
            if (r7 == 0) goto L_0x0068
            if (r26 == 0) goto L_0x0064
            r19 = r26[r10]
            int r7 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0068
        L_0x0064:
            r25 = r3
            r7 = 1
            goto L_0x0096
        L_0x0068:
            if (r26 == 0) goto L_0x006c
            r17 = r26[r10]
        L_0x006c:
            double[] r7 = r0.s
            r19 = r7[r10]
            boolean r7 = java.lang.Double.isNaN(r19)
            if (r7 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            double[] r7 = r0.s
            r19 = r7[r10]
            double r17 = r19 + r17
        L_0x007d:
            r25 = r3
            r2 = r17
            float r2 = (float) r2
            double[] r3 = r0.t
            r8 = r3[r10]
            float r3 = (float) r8
            r7 = 1
            if (r10 == r7) goto L_0x00a6
            r8 = 2
            if (r10 == r8) goto L_0x00a3
            r8 = 3
            if (r10 == r8) goto L_0x00a0
            r8 = 4
            if (r10 == r8) goto L_0x009d
            r3 = 5
            if (r10 == r3) goto L_0x0099
        L_0x0096:
            r3 = r25
            goto L_0x00a8
        L_0x0099:
            r3 = r25
            r11 = r2
            goto L_0x00a8
        L_0x009d:
            r6 = r2
            r15 = r3
            goto L_0x0096
        L_0x00a0:
            r5 = r2
            r13 = r3
            goto L_0x0096
        L_0x00a3:
            r4 = r2
            r14 = r3
            goto L_0x0096
        L_0x00a6:
            r12 = r3
            r3 = r2
        L_0x00a8:
            int r10 = r10 + 1
            r8 = 1
            goto L_0x004d
        L_0x00ac:
            r25 = r3
            r7 = 1
            boolean r2 = java.lang.Float.isNaN(r11)
            if (r2 == 0) goto L_0x00c1
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L_0x00e0
        L_0x00bd:
            r1.setRotation(r2)
            goto L_0x00e0
        L_0x00c1:
            r2 = 2143289344(0x7fc00000, float:NaN)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L_0x00ca
            r2 = 0
        L_0x00ca:
            r3 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r3
            float r12 = r12 + r13
            float r15 = r15 / r3
            float r14 = r14 + r15
            double r2 = (double) r2
            double r8 = (double) r11
            double r10 = (double) r14
            double r12 = (double) r12
            double r10 = java.lang.Math.atan2(r10, r12)
            double r10 = java.lang.Math.toDegrees(r10)
            double r8 = r8 + r10
            double r2 = r2 + r8
            float r2 = (float) r2
            goto L_0x00bd
        L_0x00e0:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r25 + r2
            int r8 = (int) r3
            float r4 = r4 + r2
            int r2 = (int) r4
            float r3 = r3 + r5
            int r3 = (int) r3
            float r4 = r4 + r6
            int r4 = (int) r4
            int r5 = r3 - r8
            int r6 = r4 - r2
            int r9 = r22.getWidth()
            if (r5 != r9) goto L_0x00ff
            int r9 = r22.getHeight()
            if (r6 == r9) goto L_0x00fc
            goto L_0x00ff
        L_0x00fc:
            r16 = 0
            goto L_0x0101
        L_0x00ff:
            r16 = 1
        L_0x0101:
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r9 = r0.o
            if (r9 != r5) goto L_0x0113
            int r9 = r0.p
            if (r9 == r6) goto L_0x0115
        L_0x0113:
            r16 = 1
        L_0x0115:
            if (r16 == 0) goto L_0x011e
            r0.o = r5
            r0.p = r6
            r1.measure(r5, r6)
        L_0x011e:
            r1.layout(r8, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.z(android.view.View, int[], double[], double[], double[]):void");
    }
}
