package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import com.rd.pageindicatorview.R$styleable;

/* renamed from: sp1  reason: default package */
public class sp1 {
    private vp1 a;

    public sp1(vp1 vp1) {
        this.a = vp1;
    }

    private gp1 a(int i) {
        switch (i) {
            case 0:
                return gp1.NONE;
            case 1:
                return gp1.COLOR;
            case 2:
                return gp1.SCALE;
            case 3:
                return gp1.WORM;
            case 4:
                return gp1.SLIDE;
            case 5:
                return gp1.FILL;
            case 6:
                return gp1.THIN_WORM;
            case 7:
                return gp1.DROP;
            case 8:
                return gp1.SWAP;
            case 9:
                return gp1.SCALE_DOWN;
            default:
                return gp1.NONE;
        }
    }

    private yp1 b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? yp1.Auto : yp1.Auto : yp1.Off : yp1.On;
    }

    private void d(TypedArray typedArray) {
        int i = 0;
        boolean z = typedArray.getBoolean(R$styleable.PageIndicatorView_piv_interactiveAnimation, false);
        int i2 = typedArray.getInt(R$styleable.PageIndicatorView_piv_animationDuration, 350);
        if (i2 >= 0) {
            i = i2;
        }
        gp1 a2 = a(typedArray.getInt(R$styleable.PageIndicatorView_piv_animationType, gp1.NONE.ordinal()));
        yp1 b = b(typedArray.getInt(R$styleable.PageIndicatorView_piv_rtl_mode, yp1.Off.ordinal()));
        this.a.y((long) i);
        this.a.E(z);
        this.a.z(a2);
        this.a.N(b);
    }

    private void e(TypedArray typedArray) {
        int color = typedArray.getColor(R$styleable.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = typedArray.getColor(R$styleable.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        this.a.T(color);
        this.a.P(color2);
    }

    private void f(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(R$styleable.PageIndicatorView_piv_viewPager, -1);
        boolean z = typedArray.getBoolean(R$styleable.PageIndicatorView_piv_autoVisibility, true);
        int i = 0;
        boolean z2 = typedArray.getBoolean(R$styleable.PageIndicatorView_piv_dynamicCount, false);
        int i2 = typedArray.getInt(R$styleable.PageIndicatorView_piv_count, -1);
        if (i2 == -1) {
            i2 = 3;
        }
        int i3 = typedArray.getInt(R$styleable.PageIndicatorView_piv_select, 0);
        if (i3 >= 0 && (i2 <= 0 || i3 <= i2 - 1)) {
            i = i3;
        }
        this.a.U(resourceId);
        this.a.A(z);
        this.a.C(z2);
        this.a.B(i2);
        this.a.Q(i);
        this.a.R(i);
        this.a.F(i);
    }

    private void g(TypedArray typedArray) {
        wp1 wp1 = typedArray.getInt(R$styleable.PageIndicatorView_piv_orientation, wp1.HORIZONTAL.ordinal()) == 0 ? wp1.HORIZONTAL : wp1.VERTICAL;
        int dimension = (int) typedArray.getDimension(R$styleable.PageIndicatorView_piv_radius, (float) mq1.a(6));
        int i = 0;
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) typedArray.getDimension(R$styleable.PageIndicatorView_piv_padding, (float) mq1.a(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = typedArray.getFloat(R$styleable.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) typedArray.getDimension(R$styleable.PageIndicatorView_piv_strokeWidth, (float) mq1.a(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        if (this.a.b() == gp1.FILL) {
            i = dimension3;
        }
        this.a.M(dimension);
        this.a.G(wp1);
        this.a.H(dimension2);
        this.a.O(f);
        this.a.S(i);
    }

    public void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PageIndicatorView, 0, 0);
        f(obtainStyledAttributes);
        e(obtainStyledAttributes);
        d(obtainStyledAttributes);
        g(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
