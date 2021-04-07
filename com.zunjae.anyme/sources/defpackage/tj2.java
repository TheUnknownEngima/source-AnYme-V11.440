package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: tj2  reason: default package */
public class tj2 {
    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
