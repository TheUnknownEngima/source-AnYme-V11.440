package defpackage;

import android.content.ComponentCallbacks;
import androidx.lifecycle.a0;
import androidx.lifecycle.n;
import org.koin.androidx.viewmodel.a;
import org.koin.androidx.viewmodel.b;

/* renamed from: lg2  reason: default package */
public final class lg2 {
    private static final mg2 a(n nVar) {
        if (nVar != null) {
            return hg2.a((ComponentCallbacks) nVar);
        }
        throw new r22("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    public static final <T extends a0> T b(n nVar, y72<T> y72, oh2 oh2, o52<mh2> o52) {
        v62.f(nVar, "$this$getViewModel");
        v62.f(y72, "clazz");
        return b.c(a(nVar), new a(y72, nVar, oh2, (o52) null, o52, 8, (r62) null));
    }
}
