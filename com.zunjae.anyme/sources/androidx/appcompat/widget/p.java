package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

public interface p {
    void A(boolean z);

    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    Context e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(z zVar);

    boolean k();

    void l(int i);

    void m(CharSequence charSequence);

    Menu n();

    void o(int i);

    int p();

    t4 q(int i, long j);

    void r(int i);

    void s(m.a aVar, g.a aVar2);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    ViewGroup t();

    void u(boolean z);

    int v();

    void w(int i);

    void x();

    void y();

    void z(Drawable drawable);
}
