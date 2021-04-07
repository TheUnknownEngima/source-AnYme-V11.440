package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

public class r extends g implements SubMenu {
    private g B;
    private i C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.B = gVar;
        this.C = iVar;
    }

    public g F() {
        return this.B.F();
    }

    public boolean H() {
        return this.B.H();
    }

    public boolean I() {
        return this.B.I();
    }

    public boolean J() {
        return this.B.J();
    }

    public void V(g.a aVar) {
        this.B.V(aVar);
    }

    public boolean f(i iVar) {
        return this.B.f(iVar);
    }

    public MenuItem getItem() {
        return this.C;
    }

    /* access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.B.h(gVar, menuItem);
    }

    public Menu i0() {
        return this.B;
    }

    public boolean m(i iVar) {
        return this.B.m(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.Y(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.Z(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.b0(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.c0(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.d0(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.B.setQwertyMode(z);
    }

    public String v() {
        i iVar = this.C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }
}
