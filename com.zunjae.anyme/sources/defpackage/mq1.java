package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: mq1  reason: default package */
public class mq1 {
    public static int a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }
}
