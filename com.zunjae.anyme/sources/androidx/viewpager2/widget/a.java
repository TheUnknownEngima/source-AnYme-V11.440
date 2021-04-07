package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

final class a {
    private static final ViewGroup.MarginLayoutParams b;
    private LinearLayoutManager a;

    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    class C0061a implements Comparator<int[]> {
        C0061a(a aVar) {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    private boolean a() {
        int i;
        int i2;
        int i3;
        int i4;
        int T = this.a.T();
        if (T == 0) {
            return true;
        }
        boolean z = this.a.z2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = T;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i5 = 0;
        while (i5 < T) {
            View S = this.a.S(i5);
            if (S != null) {
                ViewGroup.LayoutParams layoutParams = S.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : b;
                int[] iArr3 = iArr2[i5];
                if (z) {
                    i2 = S.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = S.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr3[0] = i2 - i;
                int[] iArr4 = iArr2[i5];
                if (z) {
                    i4 = S.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = S.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0061a(this));
        for (int i6 = 1; i6 < T; i6++) {
            if (iArr2[i6 - 1][1] != iArr2[i6][0]) {
                return false;
            }
        }
        return iArr2[0][0] <= 0 && iArr2[T - 1][1] >= iArr2[0][1] - iArr2[0][0];
    }

    private boolean b() {
        int T = this.a.T();
        for (int i = 0; i < T; i++) {
            if (c(this.a.S(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return (!a() || this.a.T() <= 1) && b();
    }
}
