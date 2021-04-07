package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

abstract class c {
    final Context a;
    private Map<w2, MenuItem> b;
    private Map<x2, SubMenu> c;

    c(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof w2)) {
            return menuItem;
        }
        w2 w2Var = (w2) menuItem;
        if (this.b == null) {
            this.b = new b0();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, w2Var);
        this.b.put(w2Var, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof x2)) {
            return subMenu;
        }
        x2 x2Var = (x2) subMenu;
        if (this.c == null) {
            this.c = new b0();
        }
        SubMenu subMenu2 = this.c.get(x2Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, x2Var);
        this.c.put(x2Var, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        Map<w2, MenuItem> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<x2, SubMenu> map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i) {
        Map<w2, MenuItem> map = this.b;
        if (map != null) {
            Iterator<w2> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i) {
        Map<w2, MenuItem> map = this.b;
        if (map != null) {
            Iterator<w2> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
