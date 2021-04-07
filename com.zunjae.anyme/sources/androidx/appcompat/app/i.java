package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.p;
import java.util.ArrayList;

class i extends ActionBar {
    p a;
    boolean b;
    Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<ActionBar.a> f = new ArrayList<>();
    private final Runnable g = new a();
    private final Toolbar.e h = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.D();
        }
    }

    class b implements Toolbar.e {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {
        private boolean e;

        c() {
        }

        public void c(g gVar, boolean z) {
            if (!this.e) {
                this.e = true;
                i.this.a.i();
                Window.Callback callback = i.this.c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.e = false;
            }
        }

        public boolean d(g gVar) {
            Window.Callback callback = i.this.c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            i iVar = i.this;
            if (iVar.c == null) {
                return;
            }
            if (iVar.a.b()) {
                i.this.c.onPanelClosed(108, gVar);
            } else if (i.this.c.onPreparePanel(0, (View) null, gVar)) {
                i.this.c.onMenuOpened(108, gVar);
            }
        }
    }

    private class e extends u {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(i.this.a.e()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                i iVar = i.this;
                if (!iVar.b) {
                    iVar.a.c();
                    i.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new h0(toolbar, false);
        e eVar = new e(callback);
        this.c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.a.setWindowTitle(charSequence);
    }

    private Menu B() {
        if (!this.d) {
            this.a.s(new c(), new d());
            this.d = true;
        }
        return this.a.n();
    }

    public Window.Callback C() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void D() {
        Menu B = B();
        g gVar = B instanceof g ? (g) B : null;
        if (gVar != null) {
            gVar.h0();
        }
        try {
            B.clear();
            if (!this.c.onCreatePanelMenu(0, B) || !this.c.onPreparePanel(0, (View) null, B)) {
                B.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.g0();
            }
        }
    }

    public void E(int i, int i2) {
        this.a.l((i & i2) | ((~i2) & this.a.v()));
    }

    public boolean g() {
        return this.a.g();
    }

    public boolean h() {
        if (!this.a.k()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    public void i(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.get(i).a(z);
            }
        }
    }

    public int j() {
        return this.a.v();
    }

    public Context k() {
        return this.a.e();
    }

    public boolean l() {
        this.a.t().removeCallbacks(this.g);
        o4.b0(this.a.t(), this.g);
        return true;
    }

    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.a.t().removeCallbacks(this.g);
    }

    public boolean o(int i, KeyEvent keyEvent) {
        Menu B = B();
        if (B == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        B.setQwertyMode(z);
        return B.performShortcut(i, keyEvent, 0);
    }

    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    public boolean q() {
        return this.a.h();
    }

    public void r(boolean z) {
    }

    public void s(boolean z) {
        E(z ? 4 : 0, 4);
    }

    public void t(int i) {
        this.a.w(i);
    }

    public void u(int i) {
        this.a.r(i);
    }

    public void v(Drawable drawable) {
        this.a.z(drawable);
    }

    public void w(boolean z) {
    }

    public void x(CharSequence charSequence) {
        this.a.m(charSequence);
    }

    public void y(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    public void z(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }
}
