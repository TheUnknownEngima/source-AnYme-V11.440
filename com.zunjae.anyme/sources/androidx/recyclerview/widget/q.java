package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class q {
    static int a(RecyclerView.z zVar, n nVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.T() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1;
        }
        return Math.min(nVar.n(), nVar.d(view2) - nVar.g(view));
    }

    static int b(RecyclerView.z zVar, n nVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.T() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zVar.b() - Math.max(oVar.n0(view), oVar.n0(view2))) - 1) : Math.max(0, Math.min(oVar.n0(view), oVar.n0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(nVar.d(view2) - nVar.g(view))) / ((float) (Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1)))) + ((float) (nVar.m() - nVar.g(view))));
    }

    static int c(RecyclerView.z zVar, n nVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.T() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.b();
        }
        return (int) ((((float) (nVar.d(view2) - nVar.g(view))) / ((float) (Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1))) * ((float) zVar.b()));
    }
}
