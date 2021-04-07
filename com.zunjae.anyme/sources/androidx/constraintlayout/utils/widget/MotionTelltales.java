package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R$styleable;

public class MotionTelltales extends MockView {
    private Paint p = new Paint();
    MotionLayout q;
    float[] r = new float[2];
    Matrix s = new Matrix();
    int t = 0;
    int u = -65281;
    float v = 0.25f;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.MotionTelltales_telltales_tailColor) {
                    this.u = obtainStyledAttributes.getColor(index, this.u);
                } else if (index == R$styleable.MotionTelltales_telltales_velocityMode) {
                    this.t = obtainStyledAttributes.getInt(index, this.t);
                } else if (index == R$styleable.MotionTelltales_telltales_tailScale) {
                    this.v = obtainStyledAttributes.getFloat(index, this.v);
                }
            }
        }
        this.p.setColor(this.u);
        this.p.setStrokeWidth(5.0f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.s);
        if (this.q == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.q = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.q.f0(this, f2, f, this.r, this.t);
                this.s.mapVectors(this.r);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.r;
                float f5 = fArr2[0];
                float f6 = this.v;
                float f7 = f4 - (fArr2[1] * f6);
                this.s.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.p);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.j = charSequence.toString();
        requestLayout();
    }
}
