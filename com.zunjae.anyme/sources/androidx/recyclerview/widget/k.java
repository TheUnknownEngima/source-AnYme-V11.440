package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

public class k extends s {
    private n d;
    private n e;

    private float m(RecyclerView.o oVar, n nVar) {
        int max;
        int T = oVar.T();
        if (T == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < T; i3++) {
            View S = oVar.S(i3);
            int n0 = oVar.n0(S);
            if (n0 != -1) {
                if (n0 < i) {
                    view = S;
                    i = n0;
                }
                if (n0 > i2) {
                    view2 = S;
                    i2 = n0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(nVar.d(view), nVar.d(view2)) - Math.min(nVar.g(view), nVar.g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    private int n(RecyclerView.o oVar, View view, n nVar) {
        return (nVar.g(view) + (nVar.e(view) / 2)) - (nVar.m() + (nVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, n nVar, int i, int i2) {
        int[] d2 = d(i, i2);
        float m = m(oVar, nVar);
        if (m <= Utils.FLOAT_EPSILON) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d2[0]) > Math.abs(d2[1]) ? d2[0] : d2[1])) / m);
    }

    private View p(RecyclerView.o oVar, n nVar) {
        int T = oVar.T();
        View view = null;
        if (T == 0) {
            return null;
        }
        int m = nVar.m() + (nVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < T; i2++) {
            View S = oVar.S(i2);
            int abs = Math.abs((nVar.g(S) + (nVar.e(S) / 2)) - m);
            if (abs < i) {
                view = S;
                i = abs;
            }
        }
        return view;
    }

    private n q(RecyclerView.o oVar) {
        n nVar = this.e;
        if (nVar == null || nVar.a != oVar) {
            this.e = n.a(oVar);
        }
        return this.e;
    }

    private n r(RecyclerView.o oVar) {
        n nVar = this.d;
        if (nVar == null || nVar.a != oVar) {
            this.d = n.c(oVar);
        }
        return this.d;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.u()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.v()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View h(RecyclerView.o oVar) {
        n q;
        if (oVar.v()) {
            q = r(oVar);
        } else if (!oVar.u()) {
            return null;
        } else {
            q = q(oVar);
        }
        return p(oVar, q);
    }

    public int i(RecyclerView.o oVar, int i, int i2) {
        int i0;
        View h;
        int n0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.y.b) || (i0 = oVar.i0()) == 0 || (h = h(oVar)) == null || (n0 = oVar.n0(h)) == -1 || (a = ((RecyclerView.y.b) oVar).a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.u()) {
            i4 = o(oVar, q(oVar), i, 0);
            if (a.x < Utils.FLOAT_EPSILON) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.v()) {
            i5 = o(oVar, r(oVar), 0, i2);
            if (a.y < Utils.FLOAT_EPSILON) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.v()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = n0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= i0 ? i0 - 1 : i6;
    }
}
