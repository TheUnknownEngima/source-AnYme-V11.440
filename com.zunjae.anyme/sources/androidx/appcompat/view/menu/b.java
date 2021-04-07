package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {
    protected Context e;
    protected Context f;
    protected g g;
    protected LayoutInflater h;
    private m.a i;
    private int j;
    private int k;
    protected n l;
    private int m;

    public b(Context context, int i2, int i3) {
        this.e = context;
        this.h = LayoutInflater.from(context);
        this.j = i2;
        this.k = i3;
    }

    /* access modifiers changed from: protected */
    public void b(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.l).addView(view, i2);
    }

    public void c(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public abstract void d(i iVar, n.a aVar);

    public n.a e(ViewGroup viewGroup) {
        return (n.a) this.h.inflate(this.k, viewGroup, false);
    }

    public int f() {
        return this.m;
    }

    public void g(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup != null) {
            g gVar = this.g;
            int i2 = 0;
            if (gVar != null) {
                gVar.t();
                ArrayList<i> G = this.g.G();
                int size = G.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar = G.get(i4);
                    if (u(i3, iVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View r = r(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            r.setPressed(false);
                            r.jumpDrawablesToCurrentState();
                        }
                        if (r != childAt) {
                            b(r, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!n(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.i = aVar;
    }

    public void l(Context context, g gVar) {
        this.f = context;
        LayoutInflater.from(context);
        this.g = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean n(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public boolean o(r rVar) {
        m.a aVar = this.i;
        if (aVar != null) {
            return aVar.d(rVar);
        }
        return false;
    }

    public m.a q() {
        return this.i;
    }

    public View r(i iVar, View view, ViewGroup viewGroup) {
        n.a e2 = view instanceof n.a ? (n.a) view : e(viewGroup);
        d(iVar, e2);
        return (View) e2;
    }

    public n s(ViewGroup viewGroup) {
        if (this.l == null) {
            n nVar = (n) this.h.inflate(this.j, viewGroup, false);
            this.l = nVar;
            nVar.b(this.g);
            g(true);
        }
        return this.l;
    }

    public void t(int i2) {
        this.m = i2;
    }

    public abstract boolean u(int i2, i iVar);
}
