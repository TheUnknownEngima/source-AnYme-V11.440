package defpackage;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: s91  reason: default package */
public class s91 {
    public static int a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
