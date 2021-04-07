package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public abstract class g {
    private d a;
    protected androidx.constraintlayout.widget.a b;
    private String c;
    private int d = 0;
    public int e = 0;
    ArrayList<p> f = new ArrayList<>();

    class a implements Comparator<p> {
        a(g gVar) {
        }

        /* renamed from: a */
        public int compare(p pVar, p pVar2) {
            return Integer.compare(pVar.a, pVar2.a);
        }
    }

    static class b extends g {
        b() {
        }

        public void f(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    static class c extends g {
        float[] g = new float[1];

        c() {
        }

        public void f(View view, float f) {
            this.g[0] = a(f);
            this.b.i(view, this.g);
        }
    }

    static class d {
        o0 a = new o0();
        float[] b;
        double[] c;
        float[] d;
        float[] e;
        k0 f;
        double[] g;
        double[] h;

        d(int i, int i2, int i3) {
            new HashMap();
            this.a.g(i);
            this.b = new float[i3];
            this.c = new double[i3];
            this.d = new float[i3];
            this.e = new float[i3];
            float[] fArr = new float[i3];
        }

        public double a(float f2) {
            k0 k0Var = this.f;
            if (k0Var != null) {
                double d2 = (double) f2;
                k0Var.g(d2, this.h);
                this.f.d(d2, this.g);
            } else {
                double[] dArr = this.h;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d3 = (double) f2;
            double e2 = this.a.e(d3);
            double d4 = this.a.d(d3);
            double[] dArr2 = this.h;
            return dArr2[0] + (e2 * dArr2[1]) + (d4 * this.g[1]);
        }

        public double b(float f2) {
            k0 k0Var = this.f;
            if (k0Var != null) {
                k0Var.d((double) f2, this.g);
            } else {
                double[] dArr = this.g;
                dArr[0] = (double) this.e[0];
                dArr[1] = (double) this.b[0];
            }
            return this.g[0] + (this.a.e((double) f2) * this.g[1]);
        }

        public void c(int i, int i2, float f2, float f3, float f4) {
            this.c[i] = ((double) i2) / 100.0d;
            this.d[i] = f2;
            this.e[i] = f3;
            this.b[i] = f4;
        }

        public void d(float f2) {
            int length = this.c.length;
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.b;
            this.g = new double[(fArr.length + 1)];
            this.h = new double[(fArr.length + 1)];
            if (this.c[0] > Utils.DOUBLE_EPSILON) {
                this.a.a(Utils.DOUBLE_EPSILON, this.d[0]);
            }
            double[] dArr2 = this.c;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.a.a(1.0d, this.d[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.e[i];
                int i2 = 0;
                while (true) {
                    float[] fArr2 = this.b;
                    if (i2 >= fArr2.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr2[i2];
                    i2++;
                }
                this.a.a(this.c[i], this.d[i]);
            }
            this.a.f();
            double[] dArr3 = this.c;
            this.f = dArr3.length > 1 ? k0.a(0, dArr3, dArr) : null;
        }
    }

    static class e extends g {
        e() {
        }

        public void f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setElevation(a(f));
            }
        }
    }

    static class f extends g {
        f() {
        }

        public void f(View view, float f) {
        }

        public void j(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.g$g  reason: collision with other inner class name */
    static class C0013g extends g {
        boolean g = false;

        C0013g() {
        }

        public void f(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
            } else if (!this.g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    static class h extends g {
        h() {
        }

        public void f(View view, float f) {
            view.setRotation(a(f));
        }
    }

    static class i extends g {
        i() {
        }

        public void f(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    static class j extends g {
        j() {
        }

        public void f(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    static class k extends g {
        k() {
        }

        public void f(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    static class l extends g {
        l() {
        }

        public void f(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    static class m extends g {
        m() {
        }

        public void f(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    static class n extends g {
        n() {
        }

        public void f(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    static class o extends g {
        o() {
        }

        public void f(View view, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(a(f));
            }
        }
    }

    static class p {
        int a;
        float b;
        float c;
        float d;

        public p(int i, float f, float f2, float f3) {
            this.a = i;
            this.b = f3;
            this.c = f2;
            this.d = f;
        }
    }

    static g c(String str) {
        if (str.startsWith("CUSTOM")) {
            return new c();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 10;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = 12;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c2 = 13;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c2 = 9;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c2 = 2;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c2 = 1;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c2 = 5;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 0;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new b();
            case 1:
                return new e();
            case 2:
                return new h();
            case 3:
                return new i();
            case 4:
                return new j();
            case 5:
                return new f();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new b();
            case 9:
                return new b();
            case 10:
                return new m();
            case 11:
                return new n();
            case 12:
                return new o();
            case 13:
                return new C0013g();
            default:
                return null;
        }
    }

    public float a(float f2) {
        return (float) this.a.b(f2);
    }

    public float b(float f2) {
        return (float) this.a.a(f2);
    }

    public void d(int i2, int i3, int i4, float f2, float f3, float f4) {
        this.f.add(new p(i2, f2, f3, f4));
        if (i4 != -1) {
            this.e = i4;
        }
        this.d = i3;
    }

    public void e(int i2, int i3, int i4, float f2, float f3, float f4, androidx.constraintlayout.widget.a aVar) {
        this.f.add(new p(i2, f2, f3, f4));
        if (i4 != -1) {
            this.e = i4;
        }
        this.d = i3;
        this.b = aVar;
    }

    public abstract void f(View view, float f2);

    public void g(String str) {
        this.c = str;
    }

    @TargetApi(19)
    public void h(float f2) {
        int size = this.f.size();
        if (size != 0) {
            Collections.sort(this.f, new a(this));
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.a = new d(this.d, this.e, size);
            Iterator<p> it = this.f.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                p next = it.next();
                float f3 = next.d;
                dArr[i2] = ((double) f3) * 0.01d;
                double[] dArr3 = dArr2[i2];
                float f4 = next.b;
                dArr3[0] = (double) f4;
                double[] dArr4 = dArr2[i2];
                float f5 = next.c;
                dArr4[1] = (double) f5;
                this.a.c(i2, next.a, f3, f5, f4);
                i2++;
            }
            this.a.d(f2);
            k0.a(0, dArr, dArr2);
        }
    }

    public boolean i() {
        return this.e == 1;
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<p> it = this.f.iterator();
        while (it.hasNext()) {
            p next = it.next();
            str = str + "[" + next.a + " , " + decimalFormat.format((double) next.b) + "] ";
        }
        return str;
    }
}
