package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: x3  reason: default package */
public abstract class x3 {
    private final Context a;
    private a b;
    private b c;

    /* renamed from: x3$a */
    public interface a {
        void a(boolean z);
    }

    /* renamed from: x3$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public x3(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.c != null && h()) {
            this.c.onActionProviderVisibilityChanged(c());
        }
    }

    public void j() {
        this.c = null;
        this.b = null;
    }

    public void k(a aVar) {
        this.b = aVar;
    }

    public void l(b bVar) {
        if (!(this.c == null || bVar == null)) {
            "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?";
        }
        this.c = bVar;
    }

    public void m(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(z);
        }
    }
}
