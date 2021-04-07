package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

@Deprecated
public class k extends p {
    final RecyclerView f;
    final w3 g = super.n();
    final w3 h = new a();

    class a extends w3 {
        a() {
        }

        public void g(View view, a5 a5Var) {
            Preference K;
            k.this.g.g(view, a5Var);
            int e0 = k.this.f.e0(view);
            RecyclerView.g adapter = k.this.f.getAdapter();
            if ((adapter instanceof h) && (K = ((h) adapter).K(e0)) != null) {
                K.h0(a5Var);
            }
        }

        public boolean j(View view, int i, Bundle bundle) {
            return k.this.g.j(view, i, bundle);
        }
    }

    public k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f = recyclerView;
    }

    public w3 n() {
        return this.h;
    }
}
