package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.g;
import defpackage.q91;

/* renamed from: r91  reason: default package */
public class r91 {
    public static final boolean a = (Build.VERSION.SDK_INT < 18);

    public static void a(q91 q91, View view, FrameLayout frameLayout) {
        e(q91, view, frameLayout);
        if (!a) {
            view.getOverlay().add(q91);
        } else if (frameLayout != null) {
            frameLayout.setForeground(q91);
        } else {
            throw new IllegalArgumentException("Trying to reference null compatBadgeParent");
        }
    }

    public static SparseArray<q91> b(Context context, g gVar) {
        SparseArray<q91> sparseArray = new SparseArray<>(gVar.size());
        int i = 0;
        while (i < gVar.size()) {
            int keyAt = gVar.keyAt(i);
            q91.a aVar = (q91.a) gVar.valueAt(i);
            if (aVar != null) {
                sparseArray.put(keyAt, q91.e(context, aVar));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    public static g c(SparseArray<q91> sparseArray) {
        g gVar = new g();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            q91 valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                gVar.put(keyAt, valueAt.k());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return gVar;
    }

    public static void d(q91 q91, View view, FrameLayout frameLayout) {
        if (q91 != null) {
            if (a) {
                frameLayout.setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(q91);
            }
        }
    }

    public static void e(q91 q91, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        FrameLayout frameLayout2 = a ? frameLayout : view;
        if (frameLayout2 != null) {
            frameLayout2.getDrawingRect(rect);
            q91.setBounds(rect);
            q91.y(view, frameLayout);
            return;
        }
        throw new IllegalArgumentException("Trying to reference null badgeParent");
    }

    public static void f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
