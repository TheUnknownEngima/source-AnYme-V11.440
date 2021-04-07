package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.R$layout;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    private g e;
    private c f;
    e g;
    private m.a h;

    public h(g gVar) {
        this.e = gVar;
    }

    public void a() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        g gVar = this.e;
        c.a aVar = new c.a(gVar.w());
        e eVar = new e(aVar.b(), R$layout.abc_list_menu_item_layout);
        this.g = eVar;
        eVar.k(this);
        this.e.b(this.g);
        aVar.c(this.g.a(), this);
        View A = gVar.A();
        if (A != null) {
            aVar.d(A);
        } else {
            aVar.e(gVar.y());
            aVar.m(gVar.z());
        }
        aVar.i(this);
        c a = aVar.a();
        this.f = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f.show();
    }

    public void c(g gVar, boolean z) {
        if (z || gVar == this.e) {
            a();
        }
        m.a aVar = this.h;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public boolean d(g gVar) {
        m.a aVar = this.h;
        if (aVar != null) {
            return aVar.d(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.e.N((i) this.g.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.g.c(this.e, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.e.performShortcut(i, keyEvent, 0);
    }
}
