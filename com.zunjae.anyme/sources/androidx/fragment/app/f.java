package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.e0;

public class f {
    private final h<?> a;

    private f(h<?> hVar) {
        this.a = hVar;
    }

    public static f b(h<?> hVar) {
        u3.d(hVar, "callbacks == null");
        return new f(hVar);
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.a;
        hVar.h.h(hVar, hVar, fragment);
    }

    public void c() {
        this.a.h.s();
    }

    public void d(Configuration configuration) {
        this.a.h.t(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.h.u(menuItem);
    }

    public void f() {
        this.a.h.v();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.h.w(menu, menuInflater);
    }

    public void h() {
        this.a.h.x();
    }

    public void i() {
        this.a.h.z();
    }

    public void j(boolean z) {
        this.a.h.A(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.h.B(menuItem);
    }

    public void l(Menu menu) {
        this.a.h.C(menu);
    }

    public void m() {
        this.a.h.E();
    }

    public void n(boolean z) {
        this.a.h.F(z);
    }

    public boolean o(Menu menu) {
        return this.a.h.G(menu);
    }

    public void p() {
        this.a.h.I();
    }

    public void q() {
        this.a.h.J();
    }

    public void r() {
        this.a.h.L();
    }

    public boolean s() {
        return this.a.h.R(true);
    }

    public Fragment t(String str) {
        return this.a.h.a0(str);
    }

    public k u() {
        return this.a.h;
    }

    public void v() {
        this.a.h.F0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.h.j0().onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.a;
        if (hVar instanceof e0) {
            hVar.h.S0(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable y() {
        return this.a.h.U0();
    }
}
