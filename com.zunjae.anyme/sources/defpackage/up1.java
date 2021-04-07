package defpackage;

import android.util.Pair;
import android.view.View;

/* renamed from: up1  reason: default package */
public class up1 {
    public Pair<Integer, Integer> a(vp1 vp1, int i, int i2) {
        int i3;
        int i4;
        vp1 vp12 = vp1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int c = vp1.c();
        int l = vp1.l();
        int r = vp1.r();
        int g = vp1.g();
        int i5 = vp1.i();
        int k = vp1.k();
        int j = vp1.j();
        int h = vp1.h();
        int i6 = l * 2;
        wp1 f = vp1.f();
        int i7 = 0;
        if (c != 0) {
            i3 = (i6 * c) + (r * 2 * c) + (g * (c - 1));
            i4 = i6 + r;
            if (f != wp1.HORIZONTAL) {
                int i8 = i3;
                i3 = i4;
                i4 = i8;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (vp1.b() == gp1.DROP) {
            if (f == wp1.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        wp1 wp1 = wp1.HORIZONTAL;
        int i9 = i3 + i5 + j;
        int i10 = i4 + k + h;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i9, size) : i9;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i10, size2) : i10;
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i7 = size2;
        }
        vp12.V(size);
        vp12.D(i7);
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(i7));
    }
}
