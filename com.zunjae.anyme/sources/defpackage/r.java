package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import defpackage.n;
import java.util.ArrayList;

/* renamed from: r  reason: default package */
public class r extends ActionMode {
    final Context a;
    final n b;

    /* renamed from: r$a */
    public static class a implements n.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<r> c = new ArrayList<>();
        final h0<Menu, Menu> d = new h0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.b, (v2) menu);
            this.d.put(menu, oVar);
            return oVar;
        }

        public void a(n nVar) {
            this.a.onDestroyActionMode(e(nVar));
        }

        public boolean b(n nVar, Menu menu) {
            return this.a.onCreateActionMode(e(nVar), f(menu));
        }

        public boolean c(n nVar, Menu menu) {
            return this.a.onPrepareActionMode(e(nVar), f(menu));
        }

        public boolean d(n nVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(nVar), new j(this.b, (w2) menuItem));
        }

        public ActionMode e(n nVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                r rVar = this.c.get(i);
                if (rVar != null && rVar.b == nVar) {
                    return rVar;
                }
            }
            r rVar2 = new r(this.b, nVar);
            this.c.add(rVar2);
            return rVar2;
        }
    }

    public r(Context context, n nVar) {
        this.a = context;
        this.b = nVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (v2) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.h();
    }

    public CharSequence getTitle() {
        return this.b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    public void invalidate() {
        this.b.k();
    }

    public boolean isTitleOptional() {
        return this.b.l();
    }

    public void setCustomView(View view) {
        this.b.m(view);
    }

    public void setSubtitle(int i) {
        this.b.n(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.b.p(obj);
    }

    public void setTitle(int i) {
        this.b.q(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }
}
