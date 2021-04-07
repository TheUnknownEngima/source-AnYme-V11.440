package kotlinx.coroutines;

import kotlinx.coroutines.internal.u;

public final class x1 {
    /* access modifiers changed from: private */
    public static final u a = new u("SEALED");
    /* access modifiers changed from: private */
    public static final y0 b = new y0(false);
    /* access modifiers changed from: private */
    public static final y0 c = new y0(true);

    public static final Object d(Object obj) {
        return obj instanceof j1 ? new k1((j1) obj) : obj;
    }

    public static final Object e(Object obj) {
        j1 j1Var;
        k1 k1Var = (k1) (!(obj instanceof k1) ? null : obj);
        return (k1Var == null || (j1Var = k1Var.a) == null) ? obj : j1Var;
    }
}
