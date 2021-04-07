package defpackage;

import android.view.View;
import io.github.inflationx.viewpump.b;
import io.github.inflationx.viewpump.c;
import io.github.inflationx.viewpump.d;

/* renamed from: t02  reason: default package */
public final class t02 implements d {
    public c intercept(d.a aVar) {
        String str;
        Class<?> cls;
        v62.f(aVar, "chain");
        b i = aVar.i();
        View onCreateView = i.c().onCreateView(i.e(), i.d(), i.b(), i.a());
        if (onCreateView == null || (cls = onCreateView.getClass()) == null || (str = cls.getName()) == null) {
            str = i.d();
        }
        return new c(onCreateView, str, i.b(), i.a());
    }
}
