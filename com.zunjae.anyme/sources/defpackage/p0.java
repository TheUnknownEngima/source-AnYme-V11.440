package defpackage;

import androidx.constraintlayout.motion.widget.o;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: p0  reason: default package */
public class p0 extends o {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private boolean k = false;
    private float l;
    private float m;

    private float b(float f2) {
        float f3 = this.d;
        if (f2 <= f3) {
            float f4 = this.a;
            return (f4 * f2) + ((((this.b - f4) * f2) * f2) / (f3 * 2.0f));
        }
        int i2 = this.j;
        if (i2 == 1) {
            return this.g;
        }
        float f5 = f2 - f3;
        float f6 = this.e;
        if (f5 < f6) {
            float f7 = this.g;
            float f8 = this.b;
            return f7 + (f8 * f5) + ((((this.c - f8) * f5) * f5) / (f6 * 2.0f));
        } else if (i2 == 2) {
            return this.h;
        } else {
            float f9 = f5 - f6;
            float f10 = this.f;
            if (f9 >= f10) {
                return this.i;
            }
            float f11 = this.h;
            float f12 = this.c;
            return (f11 + (f12 * f9)) - (((f12 * f9) * f9) / (f10 * 2.0f));
        }
    }

    private void e(float f2, float f3, float f4, float f5, float f6) {
        if (f2 == Utils.FLOAT_EPSILON) {
            f2 = 1.0E-4f;
        }
        this.a = f2;
        float f7 = f2 / f4;
        float f8 = (f7 * f2) / 2.0f;
        if (f2 < Utils.FLOAT_EPSILON) {
            float sqrt = (float) Math.sqrt((double) ((f3 - ((((-f2) / f4) * f2) / 2.0f)) * f4));
            if (sqrt < f5) {
                this.j = 2;
                this.a = f2;
                this.b = sqrt;
                this.c = Utils.FLOAT_EPSILON;
                float f9 = (sqrt - f2) / f4;
                this.d = f9;
                this.e = sqrt / f4;
                this.g = ((f2 + sqrt) * f9) / 2.0f;
                this.h = f3;
                this.i = f3;
                return;
            }
            this.j = 3;
            this.a = f2;
            this.b = f5;
            this.c = f5;
            float f10 = (f5 - f2) / f4;
            this.d = f10;
            float f11 = f5 / f4;
            this.f = f11;
            float f12 = ((f2 + f5) * f10) / 2.0f;
            float f13 = (f11 * f5) / 2.0f;
            this.e = ((f3 - f12) - f13) / f5;
            this.g = f12;
            this.h = f3 - f13;
            this.i = f3;
        } else if (f8 >= f3) {
            this.j = 1;
            this.a = f2;
            this.b = Utils.FLOAT_EPSILON;
            this.g = f3;
            this.d = (2.0f * f3) / f2;
        } else {
            float f14 = f3 - f8;
            float f15 = f14 / f2;
            if (f15 + f7 < f6) {
                this.j = 2;
                this.a = f2;
                this.b = f2;
                this.c = Utils.FLOAT_EPSILON;
                this.g = f14;
                this.h = f3;
                this.d = f15;
                this.e = f7;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f4 * f3) + ((f2 * f2) / 2.0f)));
            float f16 = (sqrt2 - f2) / f4;
            this.d = f16;
            float f17 = sqrt2 / f4;
            this.e = f17;
            if (sqrt2 < f5) {
                this.j = 2;
                this.a = f2;
                this.b = sqrt2;
                this.c = Utils.FLOAT_EPSILON;
                this.d = f16;
                this.e = f17;
                this.g = ((f2 + sqrt2) * f16) / 2.0f;
                this.h = f3;
                return;
            }
            this.j = 3;
            this.a = f2;
            this.b = f5;
            this.c = f5;
            float f18 = (f5 - f2) / f4;
            this.d = f18;
            float f19 = f5 / f4;
            this.f = f19;
            float f20 = ((f2 + f5) * f18) / 2.0f;
            float f21 = (f19 * f5) / 2.0f;
            this.e = ((f3 - f20) - f21) / f5;
            this.g = f20;
            this.h = f3 - f21;
            this.i = f3;
        }
    }

    public float a() {
        return d(this.m);
    }

    public void c(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        p0 p0Var;
        this.l = f2;
        boolean z = f2 > f3;
        this.k = z;
        if (z) {
            f9 = -f4;
            f8 = f2 - f3;
            p0Var = this;
        } else {
            f8 = f3 - f2;
            p0Var = this;
            f9 = f4;
        }
        p0Var.e(f9, f8, f6, f7, f5);
    }

    public float d(float f2) {
        float f3 = this.d;
        if (f2 <= f3) {
            float f4 = this.a;
            return f4 + (((this.b - f4) * f2) / f3);
        }
        int i2 = this.j;
        if (i2 == 1) {
            return Utils.FLOAT_EPSILON;
        }
        float f5 = f2 - f3;
        float f6 = this.e;
        if (f5 < f6) {
            float f7 = this.b;
            return f7 + (((this.c - f7) * f5) / f6);
        } else if (i2 == 2) {
            return this.h;
        } else {
            float f8 = f5 - f6;
            float f9 = this.f;
            if (f8 >= f9) {
                return this.i;
            }
            float f10 = this.c;
            return f10 - ((f8 * f10) / f9);
        }
    }

    public float getInterpolation(float f2) {
        float b2 = b(f2);
        this.m = f2;
        return this.k ? this.l - b2 : this.l + b2;
    }
}
