package com.afollestad.recyclical;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Map;

public final class b {

    static final class a extends w62 implements z52<View, u22> {
        final /* synthetic */ f9 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f9 f9Var) {
            super(1);
            this.f = f9Var;
        }

        public final void a(View view) {
            v62.f(view, "$receiver");
            ((e9) this.f).d();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((View) obj);
            return u22.a;
        }
    }

    /* renamed from: com.afollestad.recyclical.b$b  reason: collision with other inner class name */
    static final class C0078b extends w62 implements z52<View, u22> {
        final /* synthetic */ f9 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0078b(f9 f9Var) {
            super(1);
            this.f = f9Var;
        }

        public final void a(View view) {
            v62.f(view, "$receiver");
            ((e9) this.f).e();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((View) obj);
            return u22.a;
        }
    }

    public static final f9 a(RecyclerView recyclerView, z52<? super c, u22> z52) {
        Collection<o9> values;
        v62.f(recyclerView, "$this$setup");
        v62.f(z52, "block");
        c cVar = new c(recyclerView);
        z52.r(cVar);
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        f9 f = cVar.f();
        recyclerView.setAdapter(f.b());
        boolean z = f instanceof e9;
        if (z) {
            k9.c(recyclerView, new a(f));
            k9.d(recyclerView, new C0078b(f));
        }
        Map<String, o9> d = cVar.d();
        if (!(d == null || (values = d.values()) == null)) {
            for (o9 o9Var : values) {
                if (z) {
                    e9 e9Var = (e9) f;
                    a9<?> f2 = e9Var.f();
                    if (!(f2 instanceof a9)) {
                        f2 = null;
                    }
                    if (f2 != null) {
                        o9Var.a(recyclerView, f2);
                    } else {
                        throw new IllegalStateException((e9Var.f() + " is not a " + a9.class.getName()).toString());
                    }
                } else {
                    throw new IllegalStateException("Handle is not a real implementation.".toString());
                }
            }
        }
        return f;
    }
}
