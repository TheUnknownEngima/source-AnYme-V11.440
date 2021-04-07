package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: n  reason: default package */
public abstract class n {
    private Object e;
    private boolean f;

    /* renamed from: n$a */
    public interface a {
        void a(n nVar);

        boolean b(n nVar, Menu menu);

        boolean c(n nVar, Menu menu);

        boolean d(n nVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.e;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.e = obj;
    }

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z) {
        this.f = z;
    }
}
