package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;

class c extends ra1 {
    private final Paint C;
    private final RectF D;
    private int E;

    c() {
        this((wa1) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(wa1 wa1) {
        super(wa1 == null ? new wa1() : wa1);
        this.C = new Paint(1);
        v0();
        this.D = new RectF();
    }

    private void p0(Canvas canvas) {
        if (!w0(getCallback())) {
            canvas.restoreToCount(this.E);
        }
    }

    private void q0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (w0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        s0(canvas);
    }

    private void s0(Canvas canvas) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        } else {
            i = canvas.saveLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
        }
        this.E = i;
    }

    private void v0() {
        this.C.setStyle(Paint.Style.FILL_AND_STROKE);
        this.C.setColor(-1);
        this.C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean w0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        q0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.D, this.C);
        p0(canvas);
    }

    /* access modifiers changed from: package-private */
    public boolean o0() {
        return !this.D.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        t0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    public void t0(float f, float f2, float f3, float f4) {
        RectF rectF = this.D;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.D.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(RectF rectF) {
        t0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
