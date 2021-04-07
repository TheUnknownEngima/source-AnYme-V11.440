package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class r {
    protected k0 a;
    protected int[] b = new int[10];
    protected float[] c = new float[10];
    private int d;
    private String e;

    static class a extends r {
        a() {
        }

        public void f(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    static class b extends r {
        SparseArray<androidx.constraintlayout.widget.a> f;
        float[] g;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f = sparseArray;
        }

        public void e(int i, float f2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void f(View view, float f2) {
            this.a.e((double) f2, this.g);
            this.f.valueAt(0).i(view, this.g);
        }

        public void h(int i) {
            int size = this.f.size();
            int f2 = this.f.valueAt(0).f();
            double[] dArr = new double[size];
            this.g = new float[f2];
            int[] iArr = new int[2];
            iArr[1] = f2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f.keyAt(i2)) * 0.01d;
                this.f.valueAt(i2).e(this.g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.a = k0.a(i, dArr, dArr2);
        }

        public void i(int i, androidx.constraintlayout.widget.a aVar) {
            this.f.append(i, aVar);
        }
    }

    static class c extends r {
        c() {
        }

        public void f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    static class d extends r {
        d() {
        }

        public void f(View view, float f) {
        }

        public void i(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    static class e extends r {
        boolean f = false;

        e() {
        }

        public void f(View view, float f2) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f2));
            } else if (!this.f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f2))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    static class f extends r {
        f() {
        }

        public void f(View view, float f) {
            view.setRotation(a(f));
        }
    }

    static class g extends r {
        g() {
        }

        public void f(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    static class h extends r {
        h() {
        }

        public void f(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    static class i extends r {
        i() {
        }

        public void f(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    static class j extends r {
        j() {
        }

        public void f(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    private static class k {
        static void a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, i4, i2);
            return i4;
        }

        private static void c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    static class l extends r {
        l() {
        }

        public void f(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    static class m extends r {
        m() {
        }

        public void f(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    static class n extends r {
        n() {
        }

        public void f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    static r c(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.r d(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0095;
                case -1249320805: goto L_0x008b;
                case -1225497657: goto L_0x0080;
                case -1225497656: goto L_0x0075;
                case -1225497655: goto L_0x006a;
                case -1001078227: goto L_0x005f;
                case -908189618: goto L_0x0055;
                case -908189617: goto L_0x004b;
                case -797520672: goto L_0x0040;
                case -40300674: goto L_0x0036;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x009f
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 8
            goto L_0x00a0
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 0
            goto L_0x00a0
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 5
            goto L_0x00a0
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 1
            goto L_0x00a0
        L_0x0036:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 2
            goto L_0x00a0
        L_0x0040:
            java.lang.String r0 = "waveVariesBy"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 9
            goto L_0x00a0
        L_0x004b:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 7
            goto L_0x00a0
        L_0x0055:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 13
            goto L_0x00a0
        L_0x006a:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 12
            goto L_0x00a0
        L_0x0075:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 11
            goto L_0x00a0
        L_0x0080:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 10
            goto L_0x00a0
        L_0x008b:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 4
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 3
            goto L_0x00a0
        L_0x009f:
            r1 = -1
        L_0x00a0:
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00db;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b7;
                case 11: goto L_0x00b1;
                case 12: goto L_0x00ab;
                case 13: goto L_0x00a5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r1 = 0
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.r$e r1 = new androidx.constraintlayout.motion.widget.r$e
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.r$n r1 = new androidx.constraintlayout.motion.widget.r$n
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.r$m r1 = new androidx.constraintlayout.motion.widget.r$m
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.r$l r1 = new androidx.constraintlayout.motion.widget.r$l
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.r$a r1 = new androidx.constraintlayout.motion.widget.r$a
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.r$a r1 = new androidx.constraintlayout.motion.widget.r$a
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.r$j r1 = new androidx.constraintlayout.motion.widget.r$j
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.r$i r1 = new androidx.constraintlayout.motion.widget.r$i
            r1.<init>()
            return r1
        L_0x00d5:
            androidx.constraintlayout.motion.widget.r$d r1 = new androidx.constraintlayout.motion.widget.r$d
            r1.<init>()
            return r1
        L_0x00db:
            androidx.constraintlayout.motion.widget.r$h r1 = new androidx.constraintlayout.motion.widget.r$h
            r1.<init>()
            return r1
        L_0x00e1:
            androidx.constraintlayout.motion.widget.r$g r1 = new androidx.constraintlayout.motion.widget.r$g
            r1.<init>()
            return r1
        L_0x00e7:
            androidx.constraintlayout.motion.widget.r$f r1 = new androidx.constraintlayout.motion.widget.r$f
            r1.<init>()
            return r1
        L_0x00ed:
            androidx.constraintlayout.motion.widget.r$c r1 = new androidx.constraintlayout.motion.widget.r$c
            r1.<init>()
            return r1
        L_0x00f3:
            androidx.constraintlayout.motion.widget.r$a r1 = new androidx.constraintlayout.motion.widget.r$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.d(java.lang.String):androidx.constraintlayout.motion.widget.r");
    }

    public float a(float f2) {
        return (float) this.a.c((double) f2, 0);
    }

    public float b(float f2) {
        return (float) this.a.f((double) f2, 0);
    }

    public void e(int i2, float f2) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.d;
        iArr2[i3] = i2;
        this.c[i3] = f2;
        this.d = i3 + 1;
    }

    public abstract void f(View view, float f2);

    public void g(String str) {
        this.e = str;
    }

    public void h(int i2) {
        int i3 = this.d;
        if (i3 != 0) {
            k.a(this.b, this.c, 0, i3 - 1);
            int i4 = 1;
            for (int i5 = 1; i5 < this.d; i5++) {
                int[] iArr = this.b;
                if (iArr[i5 - 1] != iArr[i5]) {
                    i4++;
                }
            }
            double[] dArr = new double[i4];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i4;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i6 = 0;
            for (int i7 = 0; i7 < this.d; i7++) {
                if (i7 > 0) {
                    int[] iArr3 = this.b;
                    if (iArr3[i7] == iArr3[i7 - 1]) {
                    }
                }
                dArr[i6] = ((double) this.b[i7]) * 0.01d;
                dArr2[i6][0] = (double) this.c[i7];
                i6++;
            }
            this.a = k0.a(i2, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.d; i2++) {
            str = str + "[" + this.b[i2] + " , " + decimalFormat.format((double) this.c[i2]) + "] ";
        }
        return str;
    }
}
