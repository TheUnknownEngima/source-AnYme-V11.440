package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import com.mikepenz.fastadapter.l;
import com.mikepenz.materialdrawer.R$id;
import com.mikepenz.materialdrawer.c;
import java.util.Collections;
import java.util.List;

/* renamed from: qn1  reason: default package */
public abstract class qn1<T, VH extends RecyclerView.c0> implements go1<T, VH>, jo1<T> {
    protected long a = -1;
    protected Object b;
    protected boolean c = true;
    protected boolean d = false;
    protected boolean e = true;
    protected boolean f = true;
    public c.a g = null;
    protected io1 h = null;
    private go1 i;
    protected List<go1> j;
    private boolean k = false;

    public void A(go1 go1, View view) {
        io1 io1 = this.h;
        if (io1 != null) {
            io1.a(go1, view);
        }
    }

    public T B(boolean z) {
        this.c = z;
        return this;
    }

    public T C(c.a aVar) {
        this.g = aVar;
        return this;
    }

    public go1 D(go1 go1) {
        this.i = go1;
        return this;
    }

    public T E(boolean z) {
        this.e = z;
        return this;
    }

    public T F(boolean z) {
        this.f = z;
        return this;
    }

    public T G(List<go1> list) {
        this.j = list;
        for (go1 o : list) {
            o.o(this);
        }
        return this;
    }

    public boolean b() {
        return this.e;
    }

    public long c() {
        return this.a;
    }

    public T e(boolean z) {
        this.d = z;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((qn1) obj).a;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.k;
    }

    public int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public List<go1> i() {
        return this.j;
    }

    public boolean isEnabled() {
        return this.c;
    }

    public void j(VH vh) {
    }

    public boolean k(VH vh) {
        return false;
    }

    public void l(VH vh) {
        vh.e.clearAnimation();
    }

    public T m(long j2) {
        this.a = j2;
        return this;
    }

    public T n(boolean z) {
        this.k = z;
        return this;
    }

    public /* bridge */ /* synthetic */ Object o(l lVar) {
        D((go1) lVar);
        return this;
    }

    public void q(VH vh, List<Object> list) {
        vh.e.setTag(R$id.material_drawer_item, this);
    }

    public VH s(ViewGroup viewGroup) {
        return y(LayoutInflater.from(viewGroup.getContext()).inflate(h(), viewGroup, false));
    }

    public View t(Context context, ViewGroup viewGroup) {
        RecyclerView.c0 y = y(LayoutInflater.from(context).inflate(h(), viewGroup, false));
        q(y, Collections.emptyList());
        return y.e;
    }

    public void u(VH vh) {
    }

    public boolean v() {
        return true;
    }

    public c.a w() {
        return this.g;
    }

    /* renamed from: x */
    public go1 getParent() {
        return this.i;
    }

    public abstract VH y(View view);

    public boolean z() {
        return this.f;
    }
}
