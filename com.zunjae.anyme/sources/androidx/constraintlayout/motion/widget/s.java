package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;

public abstract class s {
    private static float k = 6.2831855f;
    protected k0 a;
    protected int b = 0;
    protected int[] c = new int[10];
    protected float[][] d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));
    private int e;
    private String f;
    private float[] g = new float[3];
    protected boolean h = false;
    long i;
    float j = Float.NaN;

    static class a extends s {
        a() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setAlpha(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class b extends s {
        SparseArray<androidx.constraintlayout.widget.a> l;
        SparseArray<float[]> m = new SparseArray<>();
        float[] n;
        float[] o;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            String str2 = str.split(",")[1];
            this.l = sparseArray;
        }

        public void e(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean f(View view, float f, long j, e eVar) {
            this.a.e((double) f, this.n);
            float[] fArr = this.n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            float f4 = (float) ((((double) this.j) + ((((double) (j - this.i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.j = f4;
            this.i = j;
            float a = a(f4);
            this.h = false;
            for (int i = 0; i < this.o.length; i++) {
                this.h |= ((double) this.n[i]) != Utils.DOUBLE_EPSILON;
                this.o[i] = (this.n[i] * a) + f3;
            }
            this.l.valueAt(0).i(view, this.o);
            if (f2 != Utils.FLOAT_EPSILON) {
                this.h = true;
            }
            return this.h;
        }

        public void i(int i) {
            int size = this.l.size();
            int f = this.l.valueAt(0).f();
            double[] dArr = new double[size];
            int i2 = f + 2;
            this.n = new float[i2];
            this.o = new float[f];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.l.keyAt(i3);
                float[] valueAt = this.m.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.l.valueAt(i3).e(this.n);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.n;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][f] = (double) valueAt[0];
                dArr2[i3][f + 1] = (double) valueAt[1];
            }
            this.a = k0.a(i, dArr, dArr2);
        }

        public void j(int i, androidx.constraintlayout.widget.a aVar, float f, int i2, float f2) {
            this.l.append(i, aVar);
            this.m.append(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }
    }

    static class c extends s {
        c() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(b(f, j, view, eVar));
            }
            return this.h;
        }
    }

    static class d extends s {
        d() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            return this.h;
        }

        public boolean j(View view, e eVar, float f, long j, double d, double d2) {
            view.setRotation(b(f, j, view, eVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    static class e extends s {
        boolean l = false;

        e() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(b(f, j, view, eVar));
            } else if (this.l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.l = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(b(f, j, view, eVar))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.h;
        }
    }

    static class f extends s {
        f() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setRotation(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class g extends s {
        g() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setRotationX(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class h extends s {
        h() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setRotationY(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class i extends s {
        i() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setScaleX(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class j extends s {
        j() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setScaleY(b(f, j, view, eVar));
            return this.h;
        }
    }

    private static class k {
        static void a(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static int b(int[] iArr, float[][] fArr, int i, int i2) {
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

        private static void c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    static class l extends s {
        l() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setTranslationX(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class m extends s {
        m() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            view.setTranslationY(b(f, j, view, eVar));
            return this.h;
        }
    }

    static class n extends s {
        n() {
        }

        public boolean f(View view, float f, long j, e eVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(b(f, j, view, eVar));
            }
            return this.h;
        }
    }

    static s c(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.s d(java.lang.String r1, long r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x007d;
                case -1249320805: goto L_0x0073;
                case -1225497657: goto L_0x0068;
                case -1225497656: goto L_0x005d;
                case -1225497655: goto L_0x0052;
                case -1001078227: goto L_0x0047;
                case -908189618: goto L_0x003d;
                case -908189617: goto L_0x0033;
                case -40300674: goto L_0x0029;
                case -4379043: goto L_0x001f;
                case 37232917: goto L_0x0014;
                case 92909918: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x003d:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x0047:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0052:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x0073:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009f;
                case 9: goto L_0x0099;
                case 10: goto L_0x0093;
                case 11: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            r1 = 0
            return r1
        L_0x008d:
            androidx.constraintlayout.motion.widget.s$e r1 = new androidx.constraintlayout.motion.widget.s$e
            r1.<init>()
            goto L_0x00d4
        L_0x0093:
            androidx.constraintlayout.motion.widget.s$n r1 = new androidx.constraintlayout.motion.widget.s$n
            r1.<init>()
            goto L_0x00d4
        L_0x0099:
            androidx.constraintlayout.motion.widget.s$m r1 = new androidx.constraintlayout.motion.widget.s$m
            r1.<init>()
            goto L_0x00d4
        L_0x009f:
            androidx.constraintlayout.motion.widget.s$l r1 = new androidx.constraintlayout.motion.widget.s$l
            r1.<init>()
            goto L_0x00d4
        L_0x00a5:
            androidx.constraintlayout.motion.widget.s$j r1 = new androidx.constraintlayout.motion.widget.s$j
            r1.<init>()
            goto L_0x00d4
        L_0x00ab:
            androidx.constraintlayout.motion.widget.s$i r1 = new androidx.constraintlayout.motion.widget.s$i
            r1.<init>()
            goto L_0x00d4
        L_0x00b1:
            androidx.constraintlayout.motion.widget.s$d r1 = new androidx.constraintlayout.motion.widget.s$d
            r1.<init>()
            goto L_0x00d4
        L_0x00b7:
            androidx.constraintlayout.motion.widget.s$h r1 = new androidx.constraintlayout.motion.widget.s$h
            r1.<init>()
            goto L_0x00d4
        L_0x00bd:
            androidx.constraintlayout.motion.widget.s$g r1 = new androidx.constraintlayout.motion.widget.s$g
            r1.<init>()
            goto L_0x00d4
        L_0x00c3:
            androidx.constraintlayout.motion.widget.s$f r1 = new androidx.constraintlayout.motion.widget.s$f
            r1.<init>()
            goto L_0x00d4
        L_0x00c9:
            androidx.constraintlayout.motion.widget.s$c r1 = new androidx.constraintlayout.motion.widget.s$c
            r1.<init>()
            goto L_0x00d4
        L_0x00cf:
            androidx.constraintlayout.motion.widget.s$a r1 = new androidx.constraintlayout.motion.widget.s$a
            r1.<init>()
        L_0x00d4:
            r1.g(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.s.d(java.lang.String, long):androidx.constraintlayout.motion.widget.s");
    }

    /* access modifiers changed from: protected */
    public float a(float f2) {
        float abs;
        switch (this.b) {
            case 1:
                return Math.signum(f2 * k);
            case 2:
                abs = Math.abs(f2);
                break;
            case 3:
                return (((f2 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f2 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f2 * k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f2 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f2 * k));
        }
        return 1.0f - abs;
    }

    public float b(float f2, long j2, View view, e eVar) {
        long j3 = j2;
        View view2 = view;
        e eVar2 = eVar;
        this.a.e((double) f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        int i2 = (f3 > Utils.FLOAT_EPSILON ? 1 : (f3 == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i2 == 0) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a2 = eVar2.a(view2, this.f, 0);
            this.j = a2;
            if (Float.isNaN(a2)) {
                this.j = Utils.FLOAT_EPSILON;
            }
        }
        float f4 = (float) ((((double) this.j) + ((((double) (j3 - this.i)) * 1.0E-9d) * ((double) f3))) % 1.0d);
        this.j = f4;
        eVar2.b(view2, this.f, 0, f4);
        this.i = j3;
        float f5 = this.g[0];
        float a3 = (a(this.j) * f5) + this.g[2];
        this.h = (f5 == Utils.FLOAT_EPSILON && i2 == 0) ? false : true;
        return a3;
    }

    public void e(int i2, float f2, float f3, int i3, float f4) {
        int[] iArr = this.c;
        int i4 = this.e;
        iArr[i4] = i2;
        float[][] fArr = this.d;
        fArr[i4][0] = f2;
        fArr[i4][1] = f3;
        fArr[i4][2] = f4;
        this.b = Math.max(this.b, i3);
        this.e++;
    }

    public abstract boolean f(View view, float f2, long j2, e eVar);

    /* access modifiers changed from: protected */
    public void g(long j2) {
        this.i = j2;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            "Error no points added to " + this.f;
            return;
        }
        k.a(this.c, this.d, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        double[] dArr = new double[i5];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i5;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i6 = 0;
        for (int i7 = 0; i7 < this.e; i7++) {
            if (i7 > 0) {
                int[] iArr3 = this.c;
                if (iArr3[i7] == iArr3[i7 - 1]) {
                }
            }
            dArr[i6] = ((double) this.c[i7]) * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[][] fArr = this.d;
            dArr3[0] = (double) fArr[i7][0];
            dArr2[i6][1] = (double) fArr[i7][1];
            dArr2[i6][2] = (double) fArr[i7][2];
            i6++;
        }
        this.a = k0.a(i2, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.e; i2++) {
            str = str + "[" + this.c[i2] + " , " + decimalFormat.format(this.d[i2]) + "] ";
        }
        return str;
    }
}
