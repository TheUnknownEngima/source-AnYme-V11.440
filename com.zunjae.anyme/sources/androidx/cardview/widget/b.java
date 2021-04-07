package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class b implements e {
    b() {
    }

    private f p(d dVar) {
        return (f) dVar.f();
    }

    public void a(d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.c(new f(colorStateList, f));
        View g = dVar.g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        o(dVar, f3);
    }

    public void b(d dVar, float f) {
        p(dVar).h(f);
    }

    public float c(d dVar) {
        return dVar.g().getElevation();
    }

    public float d(d dVar) {
        return p(dVar).d();
    }

    public void e(d dVar) {
        o(dVar, g(dVar));
    }

    public void f(d dVar, float f) {
        dVar.g().setElevation(f);
    }

    public float g(d dVar) {
        return p(dVar).c();
    }

    public ColorStateList h(d dVar) {
        return p(dVar).b();
    }

    public void i(d dVar) {
        if (!dVar.e()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float g = g(dVar);
        float d = d(dVar);
        int ceil = (int) Math.ceil((double) g.c(g, d, dVar.d()));
        int ceil2 = (int) Math.ceil((double) g.d(g, d, dVar.d()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    public void j() {
    }

    public float k(d dVar) {
        return d(dVar) * 2.0f;
    }

    public float l(d dVar) {
        return d(dVar) * 2.0f;
    }

    public void m(d dVar) {
        o(dVar, g(dVar));
    }

    public void n(d dVar, ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    public void o(d dVar, float f) {
        p(dVar).g(f, dVar.e(), dVar.d());
        i(dVar);
    }
}
