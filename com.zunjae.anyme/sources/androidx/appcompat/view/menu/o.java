package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class o extends c implements Menu {
    private final v2 d;

    public o(Context context, v2 v2Var) {
        super(context);
        if (v2Var != null) {
            this.d = v2Var;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return c(this.d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return c(this.d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(this.d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = c(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return d(this.d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return d(this.d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return d(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.d.addSubMenu(charSequence));
    }

    public void clear() {
        e();
        this.d.clear();
    }

    public void close() {
        this.d.close();
    }

    public MenuItem findItem(int i) {
        return c(this.d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return c(this.d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        f(i);
        this.d.removeGroup(i);
    }

    public void removeItem(int i) {
        g(i);
        this.d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public int size() {
        return this.d.size();
    }
}
