package com.google.android.material.bottomappbar;

import com.github.mikephil.charting.utils.Utils;

public class a extends pa1 implements Cloneable {
    private float e;
    private float f;
    private float g;
    private float h;
    private float i = Utils.FLOAT_EPSILON;

    public a(float f2, float f3, float f4) {
        this.f = f2;
        this.e = f3;
        n(f4);
    }

    public void c(float f2, float f3, float f4, ya1 ya1) {
        float f5 = f2;
        ya1 ya12 = ya1;
        float f6 = this.g;
        if (f6 == Utils.FLOAT_EPSILON) {
            ya12.m(f5, Utils.FLOAT_EPSILON);
            return;
        }
        float f7 = ((this.f * 2.0f) + f6) / 2.0f;
        float f8 = f4 * this.e;
        float f9 = f3 + this.i;
        float f10 = (this.h * f4) + ((1.0f - f4) * f7);
        if (f10 / f7 >= 1.0f) {
            ya12.m(f5, Utils.FLOAT_EPSILON);
            return;
        }
        float f11 = f7 + f8;
        float f12 = f10 + f8;
        float sqrt = (float) Math.sqrt((double) ((f11 * f11) - (f12 * f12)));
        float f13 = f9 - sqrt;
        float f14 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f12)));
        float f15 = 90.0f - degrees;
        ya12.m(f13, Utils.FLOAT_EPSILON);
        float f16 = f8 * 2.0f;
        float f17 = degrees;
        ya1.a(f13 - f8, Utils.FLOAT_EPSILON, f13 + f8, f16, 270.0f, degrees);
        ya1.a(f9 - f7, (-f7) - f10, f9 + f7, f7 - f10, 180.0f - f15, (f15 * 2.0f) - 180.0f);
        ya1.a(f14 - f8, Utils.FLOAT_EPSILON, f14 + f8, f16, 270.0f - f17, f17);
        ya12.m(f5, Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.e;
    }

    public float g() {
        return this.g;
    }

    public float j() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void n(float f2) {
        if (f2 >= Utils.FLOAT_EPSILON) {
            this.h = f2;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void o(float f2) {
        this.f = f2;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        this.e = f2;
    }

    public void q(float f2) {
        this.g = f2;
    }

    /* access modifiers changed from: package-private */
    public void r(float f2) {
        this.i = f2;
    }
}
