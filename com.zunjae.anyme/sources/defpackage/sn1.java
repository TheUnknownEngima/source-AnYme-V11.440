package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import defpackage.un1;

/* renamed from: sn1  reason: default package */
public abstract class sn1<T, VH extends un1> extends tn1<T, VH> {
    private in1 A;
    private ln1 z;

    /* access modifiers changed from: protected */
    public void d0(un1 un1) {
        Context context = un1.e.getContext();
        un1.e.setId(hashCode());
        un1.e.setSelected(f());
        un1.e.setEnabled(isEnabled());
        int M = M(context);
        ColorStateList U = U(H(context), R(context));
        int K = K(context);
        int P = P(context);
        no1.h(context, un1.x, M, z());
        so1.b(a(), un1.z);
        so1.d(e0(), un1.A);
        un1.z.setTextColor(U);
        po1.c(f0(), un1.A, U);
        if (V() != null) {
            un1.z.setTypeface(V());
            un1.A.setTypeface(V());
        }
        Drawable l = kn1.l(getIcon(), context, K, W(), 1);
        if (l != null) {
            ro1.a(l, K, kn1.l(O(), context, P, W(), 1), P, W(), un1.y);
        } else {
            kn1.j(getIcon(), un1.y, K, W(), 1);
        }
        no1.g(un1.x, this.y);
    }

    public ln1 e0() {
        return this.z;
    }

    public in1 f0() {
        return this.A;
    }

    public T g0(String str) {
        this.z = new ln1(str);
        return this;
    }

    public T h0(int i) {
        this.A = in1.k(i);
        return this;
    }
}
