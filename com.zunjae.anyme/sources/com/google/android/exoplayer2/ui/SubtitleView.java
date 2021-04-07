package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public final class SubtitleView extends View implements q20 {
    private final List<f> e = new ArrayList();
    private List<h20> f;
    private int g = 0;
    private float h = 0.0533f;
    private boolean i = true;
    private boolean j = true;
    private g20 k = g20.g;
    private float l = 0.08f;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(19)
    private boolean a() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).isEnabled();
    }

    private float b(h20 h20, int i2, int i3) {
        int i4 = h20.q;
        if (i4 != Integer.MIN_VALUE) {
            float f2 = h20.r;
            if (f2 != -3.4028235E38f) {
                return Math.max(c(i4, f2, i2, i3), Utils.FLOAT_EPSILON);
            }
        }
        return Utils.FLOAT_EPSILON;
    }

    private float c(int i2, float f2, int i3, int i4) {
        float f3;
        if (i2 == 0) {
            f3 = (float) i4;
        } else if (i2 == 1) {
            f3 = (float) i3;
        } else if (i2 != 2) {
            return -3.4028235E38f;
        } else {
            return f2;
        }
        return f2 * f3;
    }

    private void e(int i2, float f2) {
        if (this.g != i2 || this.h != f2) {
            this.g = i2;
            this.h = f2;
            invalidate();
        }
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private g20 getUserCaptionStyleV19() {
        return g20.a(((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle());
    }

    public void d(float f2, boolean z) {
        e(z ? 1 : 0, f2);
    }

    public void dispatchDraw(Canvas canvas) {
        List<h20> list = this.f;
        if (list != null && !list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i2 = paddingBottom - paddingTop;
                float c = c(this.g, this.h, height, i2);
                if (c > Utils.FLOAT_EPSILON) {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        h20 h20 = list.get(i3);
                        float b = b(h20, height, i2);
                        boolean z = this.i;
                        boolean z2 = this.j;
                        g20 g20 = this.k;
                        int i4 = i3;
                        float f2 = b;
                        int i5 = size;
                        float f3 = this.l;
                        int i6 = paddingBottom;
                        int i7 = width;
                        this.e.get(i3).b(h20, z, z2, g20, c, f2, f3, canvas, paddingLeft, paddingTop, i7, i6);
                        i3 = i4 + 1;
                        size = i5;
                        i2 = i2;
                        paddingBottom = i6;
                        width = i7;
                        paddingTop = paddingTop;
                        paddingLeft = paddingLeft;
                    }
                }
            }
        }
    }

    public void f() {
        setStyle((v50.a < 19 || !a() || isInEditMode()) ? g20.g : getUserCaptionStyleV19());
    }

    public void g() {
        setFractionalTextSize(((v50.a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    public void p(List<h20> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.i != z || this.j != z) {
            this.i = z;
            this.j = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f2) {
        if (this.l != f2) {
            this.l = f2;
            invalidate();
        }
    }

    public void setCues(List<h20> list) {
        if (this.f != list) {
            this.f = list;
            int size = list == null ? 0 : list.size();
            while (this.e.size() < size) {
                this.e.add(new f(getContext()));
            }
            invalidate();
        }
    }

    public void setFractionalTextSize(float f2) {
        d(f2, false);
    }

    public void setStyle(g20 g20) {
        if (this.k != g20) {
            this.k = g20;
            invalidate();
        }
    }
}
