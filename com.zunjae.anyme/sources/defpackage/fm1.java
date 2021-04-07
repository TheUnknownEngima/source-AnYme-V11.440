package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.l;

/* renamed from: fm1  reason: default package */
public class fm1<Item extends l> implements em1<Item> {
    public RecyclerView.c0 a(b<Item> bVar, RecyclerView.c0 c0Var) {
        qm1.b(c0Var, bVar.S());
        return c0Var;
    }

    public RecyclerView.c0 b(b<Item> bVar, ViewGroup viewGroup, int i) {
        return bVar.i0(i).s(viewGroup);
    }
}
