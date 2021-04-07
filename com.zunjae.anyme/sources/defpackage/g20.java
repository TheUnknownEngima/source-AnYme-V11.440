package defpackage;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: g20  reason: default package */
public final class g20 {
    public static final g20 g = new g20(-1, -16777216, 0, 0, -1, (Typeface) null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public g20(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    @TargetApi(19)
    public static g20 a(CaptioningManager.CaptionStyle captionStyle) {
        return v50.a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    private static g20 b(CaptioningManager.CaptionStyle captionStyle) {
        return new g20(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    private static g20 c(CaptioningManager.CaptionStyle captionStyle) {
        return new g20(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
