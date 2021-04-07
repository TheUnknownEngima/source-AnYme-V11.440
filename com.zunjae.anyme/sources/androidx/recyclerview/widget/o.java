package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

public class o extends s {
    private n d;
    private n e;

    class a extends j {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            o oVar = o.this;
            int[] c = oVar.c(oVar.a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.d(i, i2, w, this.j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private int m(RecyclerView.o oVar, View view, n nVar) {
        return (nVar.g(view) + (nVar.e(view) / 2)) - (nVar.m() + (nVar.n() / 2));
    }

    private View n(RecyclerView.o oVar, n nVar) {
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

    private n o(RecyclerView.o oVar) {
        n nVar = this.e;
        if (nVar == null || nVar.a != oVar) {
            this.e = n.a(oVar);
        }
        return this.e;
    }

    private n p(RecyclerView.o oVar) {
        if (oVar.v()) {
            return q(oVar);
        }
        if (oVar.u()) {
            return o(oVar);
        }
        return null;
    }

    private n q(RecyclerView.o oVar) {
        n nVar = this.d;
        if (nVar == null || nVar.a != oVar) {
            this.d = n.c(oVar);
        }
        return this.d;
    }

    private boolean r(RecyclerView.o oVar, int i, int i2) {
        return oVar.u() ? i > 0 : i2 > 0;
    }

    private boolean s(RecyclerView.o oVar) {
        PointF a2;
        int i0 = oVar.i0();
        if (!(oVar instanceof RecyclerView.y.b) || (a2 = ((RecyclerView.y.b) oVar).a(i0 - 1)) == null) {
            return false;
        }
        return a2.x < Utils.FLOAT_EPSILON || a2.y < Utils.FLOAT_EPSILON;
    }

    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.u()) {
            iArr[0] = m(oVar, view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.v()) {
            iArr[1] = m(oVar, view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public j f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.y.b)) {
            return null;
        }
        return new a(this.a.getContext());
    }

    public View h(RecyclerView.o oVar) {
        n o;
        if (oVar.v()) {
            o = q(oVar);
        } else if (!oVar.u()) {
            return null;
        } else {
            o = o(oVar);
        }
        return n(oVar, o);
    }

    public int i(RecyclerView.o oVar, int i, int i2) {
        n p;
        int i0 = oVar.i0();
        if (i0 == 0 || (p = p(oVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int T = oVar.T();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < T; i5++) {
            View S = oVar.S(i5);
            if (S != null) {
                int m = m(oVar, S, p);
                if (m <= 0 && m > i3) {
                    view2 = S;
                    i3 = m;
                }
                if (m >= 0 && m < i4) {
                    view = S;
                    i4 = m;
                }
            }
        }
        boolean r = r(oVar, i, i2);
        if (r && view != null) {
            return oVar.n0(view);
        }
        if (!r && view2 != null) {
            return oVar.n0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int n0 = oVar.n0(view) + (s(oVar) == r ? -1 : 1);
        if (n0 < 0 || n0 >= i0) {
            return -1;
        }
        return n0;
    }
}
