package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.recyclical.a;

/* renamed from: i9  reason: default package */
public class i9 extends RecyclerView.g<RecyclerView.c0> {
    private f9 c;
    private a9<?> d;

    private final String J(Object obj) {
        String name = obj.getClass().getName();
        v62.b(name, "this::class.java.name");
        return name;
    }

    private final m9 K() {
        m9 c2;
        f9 f9Var = this.c;
        if (f9Var != null && (c2 = f9Var.c()) != null) {
            return c2;
        }
        throw new IllegalStateException("Not attached!".toString());
    }

    public void D(RecyclerView.c0 c0Var) {
        a9<?> a9Var;
        Object obj;
        String J;
        a<?, ?> a;
        v62.f(c0Var, "holder");
        int j = c0Var.j();
        if (!(j <= -1 || (a9Var = this.d) == null || (obj = a9Var.get(j)) == null || (J = J(obj)) == null || (a = K().a(J)) == null)) {
            l9.e(a, c0Var);
        }
        super.D(c0Var);
    }

    public void H(f9 f9Var) {
        v62.f(f9Var, "handle");
        if (f9Var instanceof e9) {
            e9 e9Var = (e9) f9Var;
            a9<?> f = e9Var.f();
            if (!(f instanceof a9)) {
                f = null;
            }
            if (f != null) {
                this.d = f;
                this.c = f9Var;
                return;
            }
            throw new IllegalStateException((e9Var.f() + " is not a " + a9.class.getName()).toString());
        }
        throw new IllegalStateException("Handle is not a real implementation.".toString());
    }

    public void I() {
        this.d = null;
        this.c = null;
    }

    public int g() {
        a9<?> a9Var = this.d;
        if (a9Var != null) {
            return a9Var.size();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        r0 = r1.r(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long h(int r5) {
        /*
            r4 = this;
            a9<?> r0 = r4.d
            r1 = 0
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r0.get(r5)
            m9 r2 = r4.K()
            java.lang.String r3 = r4.J(r0)
            com.afollestad.recyclical.a r2 = r2.a(r3)
            boolean r3 = r2 instanceof defpackage.n9
            if (r3 != 0) goto L_0x001a
            r2 = r1
        L_0x001a:
            n9 r2 = (defpackage.n9) r2
            if (r2 == 0) goto L_0x0022
            z52 r1 = r2.i()
        L_0x0022:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.r(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0031
            long r0 = r0.longValue()
            goto L_0x0035
        L_0x0031:
            long r0 = super.h(r5)
        L_0x0035:
            return r0
        L_0x0036:
            defpackage.v62.l()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9.h(int):long");
    }

    public int i(int i) {
        Object obj;
        String J;
        a9<?> a9Var = this.d;
        if (a9Var != null && (obj = a9Var.get(i)) != null && (J = J(obj)) != null) {
            return K().f(J);
        }
        throw new IllegalStateException("No data source available.".toString());
    }

    public void w(RecyclerView.c0 c0Var, int i) {
        v62.f(c0Var, "holder");
        a9<?> a9Var = this.d;
        if (a9Var != null) {
            Object obj = a9Var.get(i);
            l9.a(K().a(J(obj)), c0Var, obj, i);
            return;
        }
        v62.l();
        throw null;
    }

    public RecyclerView.c0 y(ViewGroup viewGroup, int i) {
        v62.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(K().d(i), viewGroup, false);
        a<?, ?> b = K().b(i);
        v62.b(inflate, "view");
        return l9.b(b, inflate);
    }
}
