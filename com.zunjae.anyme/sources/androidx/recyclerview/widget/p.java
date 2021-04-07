package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

public class p extends w3 {
    final RecyclerView d;
    private final a e;

    public static class a extends w3 {
        final p d;
        private Map<View, w3> e = new WeakHashMap();

        public a(p pVar) {
            this.d = pVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            w3 w3Var = this.e.get(view);
            return w3Var != null ? w3Var.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public b5 b(View view) {
            w3 w3Var = this.e.get(view);
            return w3Var != null ? w3Var.b(view) : super.b(view);
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            w3 w3Var = this.e.get(view);
            if (w3Var != null) {
                w3Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        public void g(View view, a5 a5Var) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().V0(view, a5Var);
                w3 w3Var = this.e.get(view);
                if (w3Var != null) {
                    w3Var.g(view, a5Var);
                    return;
                }
            }
            super.g(view, a5Var);
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            w3 w3Var = this.e.get(view);
            if (w3Var != null) {
                w3Var.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            w3 w3Var = this.e.get(viewGroup);
            return w3Var != null ? w3Var.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            w3 w3Var = this.e.get(view);
            if (w3Var != null) {
                if (w3Var.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().p1(view, i, bundle);
        }

        public void l(View view, int i) {
            w3 w3Var = this.e.get(view);
            if (w3Var != null) {
                w3Var.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        public void m(View view, AccessibilityEvent accessibilityEvent) {
            w3 w3Var = this.e.get(view);
            if (w3Var != null) {
                w3Var.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        public w3 n(View view) {
            return this.e.remove(view);
        }

        /* access modifiers changed from: package-private */
        public void o(View view) {
            w3 j = o4.j(view);
            if (j != null && j != this) {
                this.e.put(view, j);
            }
        }
    }

    public p(RecyclerView recyclerView) {
        this.d = recyclerView;
        w3 n = n();
        this.e = (n == null || !(n instanceof a)) ? new a(this) : (a) n;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().R0(accessibilityEvent);
            }
        }
    }

    public void g(View view, a5 a5Var) {
        super.g(view, a5Var);
        if (!o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().T0(a5Var);
        }
    }

    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().n1(i, bundle);
    }

    public w3 n() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.d.n0();
    }
}
