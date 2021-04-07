package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class e {
    private static int e = -100;
    private static final c0<WeakReference<e>> f = new c0<>();
    private static final Object g = new Object();

    e() {
    }

    public static e e(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e f(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int h() {
        return e;
    }

    static void o(e eVar) {
        synchronized (g) {
            y(eVar);
            f.add(new WeakReference(eVar));
        }
    }

    static void p(e eVar) {
        synchronized (g) {
            y(eVar);
        }
    }

    private static void y(e eVar) {
        synchronized (g) {
            Iterator<WeakReference<e>> it = f.iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void D(Toolbar toolbar);

    public void E(int i) {
    }

    public abstract void F(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public void d(Context context) {
    }

    public abstract <T extends View> T g(int i);

    public abstract a.b i();

    public int j() {
        return -100;
    }

    public abstract MenuInflater k();

    public abstract ActionBar l();

    public abstract void m();

    public abstract void n();

    public abstract void q(Configuration configuration);

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x();

    public abstract boolean z(int i);
}
