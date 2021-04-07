package defpackage;

import defpackage.cl0;
import java.util.Map;

/* renamed from: uk0  reason: default package */
final class uk0 extends rk0<cl0.c> {
    uk0() {
    }

    /* access modifiers changed from: package-private */
    public final int a(Map.Entry<?, ?> entry) {
        cl0.c cVar = (cl0.c) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void b(qo0 qo0, Map.Entry<?, ?> entry) {
        cl0.c cVar = (cl0.c) entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final wk0<cl0.c> c(Object obj) {
        return ((cl0.d) obj).zzbre;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(pm0 pm0) {
        return pm0 instanceof cl0.d;
    }

    /* access modifiers changed from: package-private */
    public final wk0<cl0.c> e(Object obj) {
        cl0.d dVar = (cl0.d) obj;
        if (dVar.zzbre.b()) {
            dVar.zzbre = (wk0) dVar.zzbre.clone();
        }
        return dVar.zzbre;
    }

    /* access modifiers changed from: package-private */
    public final void f(Object obj) {
        c(obj).q();
    }
}
