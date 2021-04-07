package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e9  reason: default package */
public final class e9 implements f9 {
    private final View a;
    private final i9 b;
    private final a9<?> c;
    private final m9 d;

    public e9(View view, i9 i9Var, a9<?> a9Var, m9 m9Var) {
        v62.f(i9Var, "adapter");
        v62.f(a9Var, "dataSource");
        v62.f(m9Var, "itemGraph");
        this.a = view;
        this.b = i9Var;
        this.c = a9Var;
        this.d = m9Var;
    }

    public void a(z52<? super RecyclerView.g<?>, u22> z52) {
        v62.f(z52, "block");
        if (v62.a(Looper.myLooper(), Looper.getMainLooper())) {
            z52.r(b());
            g(this.c.isEmpty());
            return;
        }
        throw new IllegalStateException("DataSource interaction must be done on the main (UI) thread.".toString());
    }

    public RecyclerView.g<?> b() {
        return this.b;
    }

    public m9 c() {
        return this.d;
    }

    public final void d() {
        this.c.b(this);
        this.b.H(this);
    }

    public final void e() {
        this.c.a();
        this.b.I();
    }

    public final a9<?> f() {
        return this.c;
    }

    public void g(boolean z) {
        if (v62.a(Looper.myLooper(), Looper.getMainLooper())) {
            View view = this.a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
                return;
            }
            return;
        }
        throw new IllegalStateException("DataSource interaction must be done on the main (UI) thread.".toString());
    }
}
