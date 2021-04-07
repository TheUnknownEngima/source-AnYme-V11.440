package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;

/* renamed from: vm1  reason: default package */
public class vm1 {
    private final Context a;
    private final TypedArray b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public vm1(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    private static tm1 g(tm1 tm1) {
        if (tm1 != null) {
            return tm1.clone();
        }
        return null;
    }

    private static tm1 i(tm1 tm1, Context context) {
        return tm1 == null ? new tm1(context) : tm1;
    }

    private tm1 l(tm1 tm1, boolean z, boolean z2) {
        tm1 g2 = g(tm1);
        String string = this.b.getString(this.c);
        if (!TextUtils.isEmpty(string)) {
            g2 = i(g2, this.a);
            g2.q(string);
        }
        ColorStateList colorStateList = this.b.getColorStateList(this.e);
        if (colorStateList != null) {
            g2 = i(g2, this.a);
            g2.i(colorStateList);
        }
        int dimensionPixelSize = this.b.getDimensionPixelSize(this.d, -1);
        if (dimensionPixelSize != -1) {
            g2 = i(g2, this.a);
            g2.F(dimensionPixelSize);
        }
        int dimensionPixelSize2 = this.b.getDimensionPixelSize(this.f, -1);
        if (dimensionPixelSize2 != -1) {
            g2 = i(g2, this.a);
            g2.x(dimensionPixelSize2);
        }
        int color = this.b.getColor(this.g, Integer.MIN_VALUE);
        if (color != Integer.MIN_VALUE) {
            g2 = i(g2, this.a);
            g2.k(color);
        }
        int dimensionPixelSize3 = this.b.getDimensionPixelSize(this.h, -1);
        if (dimensionPixelSize3 != -1) {
            g2 = i(g2, this.a);
            g2.l(dimensionPixelSize3);
        }
        int color2 = this.b.getColor(this.i, Integer.MIN_VALUE);
        if (color2 != Integer.MIN_VALUE) {
            g2 = i(g2, this.a);
            g2.c(color2);
        }
        int dimensionPixelSize4 = this.b.getDimensionPixelSize(this.j, -1);
        if (dimensionPixelSize4 != -1) {
            g2 = i(g2, this.a);
            g2.A(dimensionPixelSize4);
        }
        int color3 = this.b.getColor(this.k, Integer.MIN_VALUE);
        if (color3 != Integer.MIN_VALUE) {
            g2 = i(g2, this.a);
            g2.e(color3);
        }
        int dimensionPixelSize5 = this.b.getDimensionPixelSize(this.l, -1);
        if (dimensionPixelSize5 != -1) {
            g2 = i(g2, this.a);
            g2.f(dimensionPixelSize5);
        }
        if (z) {
            int dimensionPixelSize6 = this.b.getDimensionPixelSize(this.n, -1);
            if (dimensionPixelSize6 != -1) {
                g2 = i(g2, this.a);
                g2.s(dimensionPixelSize6);
            }
            int dimensionPixelSize7 = this.b.getDimensionPixelSize(this.m, -1);
            if (dimensionPixelSize7 != -1) {
                g2 = i(g2, this.a);
                g2.r(dimensionPixelSize7);
            }
        }
        return z2 ? i(g2, this.a) : g2;
    }

    public vm1 a(int i2) {
        this.i = i2;
        return this;
    }

    public vm1 b(int i2) {
        this.k = i2;
        return this;
    }

    public vm1 c(int i2) {
        this.l = i2;
        return this;
    }

    public vm1 d(int i2) {
        this.e = i2;
        return this;
    }

    public vm1 e(int i2) {
        this.g = i2;
        return this;
    }

    public vm1 f(int i2) {
        this.h = i2;
        return this;
    }

    public vm1 h(int i2) {
        this.j = i2;
        return this;
    }

    public tm1 j() {
        return l((tm1) null, false, false);
    }

    public tm1 k(tm1 tm1) {
        return l(tm1, false, false);
    }

    public tm1 m() {
        return l((tm1) null, false, true);
    }

    public vm1 n(int i2) {
        this.c = i2;
        return this;
    }

    public vm1 o(int i2) {
        this.f = i2;
        return this;
    }

    public vm1 p(int i2) {
        this.d = i2;
        return this;
    }
}
