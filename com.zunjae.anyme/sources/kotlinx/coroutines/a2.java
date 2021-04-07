package kotlinx.coroutines;

import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.j;

public final class a2 extends h implements j1 {
    public a2 a() {
        return this;
    }

    public boolean b() {
        return true;
    }

    public String toString() {
        return k0.c() ? y("Active") : super.toString();
    }

    public final String y(String str) {
        v62.f(str, "state");
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object n = n();
        if (n != null) {
            boolean z = true;
            for (j jVar = (j) n; !v62.a(jVar, this); jVar = jVar.o()) {
                if (jVar instanceof v1) {
                    v1 v1Var = (v1) jVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(v1Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            v62.b(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
