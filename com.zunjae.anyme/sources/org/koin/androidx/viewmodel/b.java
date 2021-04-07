package org.koin.androidx.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.n;

public final class b {

    public static final class a implements c0.a {
        final /* synthetic */ sh2 a;
        final /* synthetic */ a b;

        a(sh2 sh2, a aVar) {
            this.a = sh2;
            this.b = aVar;
        }

        public <T extends a0> T a(Class<T> cls) {
            v62.f(cls, "modelClass");
            return (a0) this.a.e(this.b.a(), this.b.e(), this.b.d());
        }
    }

    /* renamed from: org.koin.androidx.viewmodel.b$b  reason: collision with other inner class name */
    static final class C0256b extends w62 implements o52<T> {
        final /* synthetic */ c0 f;
        final /* synthetic */ a g;
        final /* synthetic */ Class h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0256b(c0 c0Var, a aVar, Class cls) {
            super(0);
            this.f = c0Var;
            this.g = aVar;
            this.h = cls;
        }

        /* renamed from: a */
        public final T invoke() {
            return this.g.e() != null ? this.f.b(this.g.e().toString(), this.h) : this.f.a(this.h);
        }
    }

    public static final <T extends a0> c0 a(sh2 sh2, d0 d0Var, a<T> aVar) {
        v62.f(sh2, "$this$createViewModelProvider");
        v62.f(d0Var, "vmStore");
        v62.f(aVar, "parameters");
        return new c0(d0Var, new a(sh2, aVar));
    }

    public static final <T extends a0> T b(c0 c0Var, a<T> aVar) {
        v62.f(c0Var, "$this$getInstance");
        v62.f(aVar, "parameters");
        Class<T> a2 = m52.a(aVar.a());
        if (ng2.c.b().d(jh2.DEBUG)) {
            ng2.c.b().a("!- ViewModelProvider getting instance");
            l22 a3 = vh2.a(new C0256b(c0Var, aVar, a2));
            T t = (a0) a3.a();
            double doubleValue = ((Number) a3.b()).doubleValue();
            kh2 b = ng2.c.b();
            b.a("!- ViewModelProvider got instance in " + doubleValue);
            v62.b(t, "instance");
            return t;
        }
        T b2 = aVar.e() != null ? c0Var.b(aVar.e().toString(), a2) : c0Var.a(a2);
        v62.b(b2, "if (parameters.qualifier….get(javaClass)\n        }");
        return b2;
    }

    public static final <T extends a0> T c(mg2 mg2, a<T> aVar) {
        v62.f(mg2, "$this$getViewModel");
        v62.f(aVar, "parameters");
        return b(a(mg2.c(), d(aVar.c(), aVar), aVar), aVar);
    }

    public static final <T extends a0> d0 d(n nVar, a<T> aVar) {
        d0 h;
        v62.f(nVar, "$this$getViewModelStore");
        v62.f(aVar, "parameters");
        if (aVar.b() != null) {
            d0 h2 = aVar.b().invoke().h();
            v62.b(h2, "parameters.from.invoke().viewModelStore");
            return h2;
        }
        if (nVar instanceof FragmentActivity) {
            h = ((FragmentActivity) nVar).h();
        } else if (nVar instanceof Fragment) {
            h = ((Fragment) nVar).h();
        } else {
            throw new IllegalStateException(("Can't getByClass ViewModel '" + aVar.a() + "' on " + nVar + " - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner").toString());
        }
        v62.b(h, "this.viewModelStore");
        return h;
    }
}
