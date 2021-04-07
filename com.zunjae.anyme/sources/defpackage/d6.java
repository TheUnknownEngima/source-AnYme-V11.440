package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: d6  reason: default package */
public final class d6 {
    public static final d6 e;
    public static final d6 f;
    public static final d6 g;
    public static final d6 h;
    public static final d6 i;
    public static final d6 j;
    final float[] a;
    final float[] b = new float[3];
    final float[] c = new float[3];
    boolean d = true;

    static {
        d6 d6Var = new d6();
        e = d6Var;
        m(d6Var);
        p(e);
        d6 d6Var2 = new d6();
        f = d6Var2;
        o(d6Var2);
        p(f);
        d6 d6Var3 = new d6();
        g = d6Var3;
        l(d6Var3);
        p(g);
        d6 d6Var4 = new d6();
        h = d6Var4;
        m(d6Var4);
        n(h);
        d6 d6Var5 = new d6();
        i = d6Var5;
        o(d6Var5);
        n(i);
        d6 d6Var6 = new d6();
        j = d6Var6;
        l(d6Var6);
        n(j);
    }

    d6() {
        float[] fArr = new float[3];
        this.a = fArr;
        r(fArr);
        r(this.b);
        q();
    }

    private static void l(d6 d6Var) {
        float[] fArr = d6Var.b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(d6 d6Var) {
        float[] fArr = d6Var.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(d6 d6Var) {
        float[] fArr = d6Var.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(d6 d6Var) {
        float[] fArr = d6Var.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(d6 d6Var) {
        float[] fArr = d6Var.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public float d() {
        return this.b[0];
    }

    public float e() {
        return this.a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        float f2 = Utils.FLOAT_EPSILON;
        for (float f3 : this.c) {
            if (f3 > Utils.FLOAT_EPSILON) {
                f2 += f3;
            }
        }
        if (f2 != Utils.FLOAT_EPSILON) {
            int length = this.c.length;
            for (int i2 = 0; i2 < length; i2++) {
                float[] fArr = this.c;
                if (fArr[i2] > Utils.FLOAT_EPSILON) {
                    fArr[i2] = fArr[i2] / f2;
                }
            }
        }
    }
}
