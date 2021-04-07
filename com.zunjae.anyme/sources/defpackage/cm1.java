package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.R$id;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.l;
import java.util.List;

/* renamed from: cm1  reason: default package */
public class cm1 implements bm1 {
    public void a(RecyclerView.c0 c0Var, int i) {
        l W = b.W(c0Var);
        if (W != null) {
            W.u(c0Var);
            if (c0Var instanceof b.f) {
                ((b.f) c0Var).O(W);
            }
        }
    }

    public void b(RecyclerView.c0 c0Var, int i) {
        l V = b.V(c0Var, i);
        if (V != null) {
            try {
                V.j(c0Var);
                if (c0Var instanceof b.f) {
                    ((b.f) c0Var).M(V);
                }
            } catch (AbstractMethodError e) {
                e.toString();
            }
        }
    }

    public void c(RecyclerView.c0 c0Var, int i, List<Object> list) {
        l Y;
        Object tag = c0Var.e.getTag(R$id.fastadapter_item_adapter);
        if ((tag instanceof b) && (Y = ((b) tag).Y(i)) != null) {
            Y.q(c0Var, list);
            if (c0Var instanceof b.f) {
                ((b.f) c0Var).N(Y, list);
            }
            c0Var.e.setTag(R$id.fastadapter_item, Y);
        }
    }

    public boolean d(RecyclerView.c0 c0Var, int i) {
        l lVar = (l) c0Var.e.getTag(R$id.fastadapter_item);
        boolean z = false;
        if (lVar == null) {
            return false;
        }
        boolean k = lVar.k(c0Var);
        if (!(c0Var instanceof b.f)) {
            return k;
        }
        if (k || ((b.f) c0Var).P(lVar)) {
            z = true;
        }
        return z;
    }

    public void e(RecyclerView.c0 c0Var, int i) {
        l W = b.W(c0Var);
        if (W != null) {
            W.l(c0Var);
            if (c0Var instanceof b.f) {
                ((b.f) c0Var).Q(W);
            }
            c0Var.e.setTag(R$id.fastadapter_item, (Object) null);
            c0Var.e.setTag(R$id.fastadapter_item_adapter, (Object) null);
        }
    }
}
