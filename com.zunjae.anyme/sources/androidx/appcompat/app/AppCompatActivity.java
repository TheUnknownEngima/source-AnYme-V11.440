package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.core.app.f;
import androidx.core.app.n;
import androidx.fragment.app.FragmentActivity;
import defpackage.n;

public class AppCompatActivity extends FragmentActivity implements d, n.a, a.c {
    private e u;
    private Resources v;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.G(int, android.view.KeyEvent):boolean");
    }

    public ActionBar A() {
        return z().l();
    }

    public void B(n nVar) {
        nVar.c(this);
    }

    /* access modifiers changed from: protected */
    public void C(int i) {
    }

    public void D(n nVar) {
    }

    @Deprecated
    public void E() {
    }

    public boolean F() {
        Intent g = g();
        if (g == null) {
            return false;
        }
        if (J(g)) {
            n g2 = n.g(this);
            B(g2);
            D(g2);
            g2.j();
            try {
                androidx.core.app.a.l(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            I(g);
            return true;
        }
    }

    public void H(Toolbar toolbar) {
        z().D(toolbar);
    }

    public void I(Intent intent) {
        f.e(this, intent);
    }

    public boolean J(Intent intent) {
        return f.f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z().c(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        z().d(context);
    }

    public void closeOptionsMenu() {
        ActionBar A = A();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (A == null || !A.g()) {
            super.closeOptionsMenu();
        }
    }

    public void d(n nVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar A = A();
        if (keyCode != 82 || A == null || !A.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public a.b e() {
        return z().i();
    }

    public void f(n nVar) {
    }

    public <T extends View> T findViewById(int i) {
        return z().g(i);
    }

    public Intent g() {
        return f.a(this);
    }

    public MenuInflater getMenuInflater() {
        return z().k();
    }

    public Resources getResources() {
        if (this.v == null && l0.b()) {
            this.v = new l0(this, super.getResources());
        }
        Resources resources = this.v;
        return resources == null ? super.getResources() : resources;
    }

    public n i(n.a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        z().n();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.v != null) {
            this.v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        z().q(configuration);
    }

    public void onContentChanged() {
        E();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        e z = z();
        z.m();
        z.r(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        z().s();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (G(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar A = A();
        if (menuItem.getItemId() != 16908332 || A == null || (A.j() & 4) == 0) {
            return false;
        }
        return F();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        z().t(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        z().u();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        z().v(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        z().w();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        z().x();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        z().F(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar A = A();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (A == null || !A.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        z().A(i);
    }

    public void setContentView(View view) {
        z().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z().C(view, layoutParams);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        z().E(i);
    }

    public void y() {
        z().n();
    }

    public e z() {
        if (this.u == null) {
            this.u = e.e(this, this);
        }
        return this.u;
    }
}
