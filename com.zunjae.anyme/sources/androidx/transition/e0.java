package androidx.transition;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e0 {
    private static LayoutTransition a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    static class a extends LayoutTransition {
        a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        if (!e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        boolean z2 = false;
        if (a == null) {
            a aVar = new a();
            a = aVar;
            aVar.setAnimator(2, (Animator) null);
            a.setAnimator(0, (Animator) null);
            a.setAnimator(1, (Animator) null);
            a.setAnimator(3, (Animator) null);
            a.setAnimator(4, (Animator) null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    a(layoutTransition2);
                }
                if (layoutTransition2 != a) {
                    viewGroup.setTag(R$id.transition_layout_save, layoutTransition2);
                }
            }
            layoutTransition = a;
        } else {
            viewGroup.setLayoutTransition((LayoutTransition) null);
            if (!c) {
                try {
                    Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                c = true;
            }
            Field field = b;
            if (field != null) {
                try {
                    boolean z3 = field.getBoolean(viewGroup);
                    if (z3) {
                        try {
                            b.setBoolean(viewGroup, false);
                        } catch (IllegalAccessException unused2) {
                        }
                    }
                    z2 = z3;
                } catch (IllegalAccessException unused3) {
                }
            }
            if (z2) {
                viewGroup.requestLayout();
            }
            layoutTransition = (LayoutTransition) viewGroup.getTag(R$id.transition_layout_save);
            if (layoutTransition != null) {
                viewGroup.setTag(R$id.transition_layout_save, (Object) null);
            } else {
                return;
            }
        }
        viewGroup.setLayoutTransition(layoutTransition);
    }
}
