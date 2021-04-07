package androidx.transition;

import android.view.View;

public abstract class p0 extends v {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(x xVar, int i) {
        int[] iArr;
        if (xVar == null || (iArr = (int[]) xVar.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public void a(x xVar) {
        View view = xVar.b;
        Integer num = (Integer) xVar.a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        xVar.a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        xVar.a.put("android:visibilityPropagation:center", iArr);
    }

    public String[] b() {
        return a;
    }

    public int e(x xVar) {
        Integer num;
        if (xVar == null || (num = (Integer) xVar.a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(x xVar) {
        return d(xVar, 0);
    }

    public int g(x xVar) {
        return d(xVar, 1);
    }
}
