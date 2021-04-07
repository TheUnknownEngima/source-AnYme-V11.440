package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: h20  reason: default package */
public class h20 {
    public static final h20 s = new h20("");
    public final CharSequence e;
    public final Layout.Alignment f;
    public final Bitmap g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final int l;
    public final float m;
    public final float n;
    public final boolean o;
    public final int p;
    public final int q;
    public final float r;

    public h20(Bitmap bitmap, float f2, int i2, float f3, int i3, float f4, float f5) {
        this((CharSequence) null, (Layout.Alignment) null, bitmap, f3, 0, i3, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, f4, f5, false, -16777216);
    }

    public h20(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    public h20(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    public h20(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, alignment, (Bitmap) null, f2, i2, i3, f3, i4, i5, f5, f4, -3.4028235E38f, false, -16777216);
    }

    public h20(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5) {
        this(charSequence, alignment, (Bitmap) null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, f4, -3.4028235E38f, z, i5);
    }

    private h20(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6) {
        this.e = charSequence;
        this.f = alignment;
        this.g = bitmap;
        this.h = f2;
        this.i = i2;
        this.j = i3;
        this.k = f3;
        this.l = i4;
        this.m = f5;
        this.n = f6;
        this.o = z;
        this.p = i6;
        this.q = i5;
        this.r = f4;
    }
}
