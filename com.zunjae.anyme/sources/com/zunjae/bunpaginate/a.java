package com.zunjae.bunpaginate;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class a extends RecyclerView.s {
    private int a = 1;
    private final RecyclerView.o b;
    private final int c;

    public a(RecyclerView recyclerView, int i) {
        v62.e(recyclerView, "recyclerView");
        this.c = i;
        recyclerView.l(this);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        v62.c(layoutManager);
        this.b = layoutManager;
    }

    public void a(RecyclerView recyclerView, int i) {
        v62.e(recyclerView, "recyclerView");
        super.a(recyclerView, i);
        if (!e() && !f()) {
            int T = this.b.T();
            int i0 = this.b.i0();
            RecyclerView.o oVar = this.b;
            if (oVar != null) {
                int j2 = ((LinearLayoutManager) oVar).j2();
                if (j2 >= 0 && T + j2 + this.c >= i0) {
                    g(this.a);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    public final int c() {
        return this.a;
    }

    public final void d() {
        this.a++;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void g(int i);

    public final void h(int i) {
        this.a = i;
    }
}
