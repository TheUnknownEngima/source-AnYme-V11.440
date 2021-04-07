package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: s4  reason: default package */
public final class s4 {
    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                "ViewParent " + viewParent + " does not implement interface method onNestedFling";
                return false;
            }
        } else if (viewParent instanceof i4) {
            return ((i4) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                "ViewParent " + viewParent + " does not implement interface method onNestedPreFling";
                return false;
            }
        } else if (viewParent instanceof i4) {
            return ((i4) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof g4) {
            ((g4) viewParent).o(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll";
                }
            } else if (viewParent instanceof i4) {
                ((i4) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof h4) {
            ((h4) viewParent2).e(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof g4) {
            ((g4) viewParent2).k(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    "ViewParent " + viewParent + " does not implement interface method onNestedScroll";
                }
            } else if (viewParent2 instanceof i4) {
                ((i4) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof g4) {
            ((g4) viewParent).m(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                    "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted";
                }
            } else if (viewParent instanceof i4) {
                ((i4) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof g4) {
            return ((g4) viewParent).l(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError unused) {
                "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll";
                return false;
            }
        } else if (viewParent instanceof i4) {
            return ((i4) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof g4) {
            ((g4) viewParent).n(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll";
                }
            } else if (viewParent instanceof i4) {
                ((i4) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    public static boolean h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
