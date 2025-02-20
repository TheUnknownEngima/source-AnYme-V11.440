package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
    private final c e;
    /* access modifiers changed from: private */
    public b f;
    private float g;
    private int h = 0;

    public interface b {
        void a(float f, float f2, boolean z);
    }

    private final class c implements Runnable {
        private float e;
        private float f;
        private boolean g;
        private boolean h;

        private c() {
        }

        public void a(float f2, float f3, boolean z) {
            this.e = f2;
            this.f = f3;
            this.g = z;
            if (!this.h) {
                this.h = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.h = false;
            if (AspectRatioFrameLayout.this.f != null) {
                AspectRatioFrameLayout.this.f.a(this.e, this.f, this.g);
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.h = obtainStyledAttributes.getInt(R$styleable.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.e = new c();
    }

    public int getResizeMode() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4 > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.g
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.g
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.e
            float r10 = r8.g
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L_0x0031:
            int r5 = r8.h
            r6 = 1
            if (r5 == 0) goto L_0x004e
            if (r5 == r6) goto L_0x0049
            r7 = 2
            if (r5 == r7) goto L_0x0043
            r7 = 4
            if (r5 == r7) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0049
        L_0x0043:
            float r9 = r8.g
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0053
        L_0x0049:
            float r10 = r8.g
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0053
        L_0x004e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0043
            goto L_0x0049
        L_0x0053:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.e
            float r1 = r8.g
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f2) {
        if (this.g != f2) {
            this.g = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f = bVar;
    }

    public void setResizeMode(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }
}
