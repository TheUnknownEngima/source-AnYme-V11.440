package com.afollestad.recyclical;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

public final class c {
    private final m9 a = new m9();
    private View b;
    private Map<String, o9> c;
    private d62<? super r9<? extends Object>, ? super Integer, u22> d;
    private d62<? super r9<? extends Object>, ? super Integer, u22> e;
    private a9<?> f;
    private o52<? extends i9> g = a.f;
    private final RecyclerView h;

    static final class a extends w62 implements o52<i9> {
        public static final a f = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final i9 invoke() {
            return new i9();
        }
    }

    public c(RecyclerView recyclerView) {
        v62.f(recyclerView, "recyclerView");
        this.h = recyclerView;
    }

    public final a9<?> a() {
        return this.f;
    }

    public final d62<r9<? extends Object>, Integer, u22> b() {
        return this.d;
    }

    public final d62<r9<? extends Object>, Integer, u22> c() {
        return this.e;
    }

    public final Map<String, o9> d() {
        return this.c;
    }

    public final void e(int i, a<?, ?> aVar) {
        v62.f(aVar, "definition");
        this.a.e(i, aVar);
    }

    public final f9 f() {
        a9<?> a9Var = this.f;
        if (a9Var != null) {
            m9 m9Var = this.a;
            m9Var.g();
            e9 e9Var = new e9(this.b, (i9) this.g.invoke(), a9Var, m9Var);
            e9Var.b().F(this.a.c());
            a9Var.b(e9Var);
            return e9Var;
        }
        throw new IllegalStateException("Must set a data source.".toString());
    }

    public final c g(a9<?> a9Var) {
        v62.f(a9Var, "dataSource");
        this.f = a9Var;
        return this;
    }

    public final c h(RecyclerView.o oVar) {
        v62.f(oVar, "layoutManager");
        this.h.setLayoutManager(oVar);
        return this;
    }
}
