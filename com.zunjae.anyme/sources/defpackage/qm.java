package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: qm  reason: default package */
public class qm {
    public static int a(int i, Context context) {
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }
}
