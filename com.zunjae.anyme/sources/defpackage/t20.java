package defpackage;

import android.text.Layout;

/* renamed from: t20  reason: default package */
final class t20 extends h20 implements Comparable<t20> {
    public final int t;

    public t20(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.t = i5;
    }

    /* renamed from: a */
    public int compareTo(t20 t20) {
        int i = t20.t;
        int i2 = this.t;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
