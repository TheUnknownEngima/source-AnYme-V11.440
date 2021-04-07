package defpackage;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import defpackage.uh1;

/* renamed from: th1  reason: default package */
public class th1 implements uh1 {
    private vh1 a;

    private th1(Context context) {
        this.a = vh1.a(context);
    }

    public static d<uh1> b() {
        d.b<uh1> a2 = d.a(uh1.class);
        a2.b(n.f(Context.class));
        a2.f(sh1.b());
        return a2.d();
    }

    static /* synthetic */ uh1 c(e eVar) {
        return new th1((Context) eVar.a(Context.class));
    }

    public uh1.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = this.a.c(str, currentTimeMillis);
        boolean b = this.a.b(currentTimeMillis);
        return (!c || !b) ? b ? uh1.a.GLOBAL : c ? uh1.a.SDK : uh1.a.NONE : uh1.a.COMBINED;
    }
}
