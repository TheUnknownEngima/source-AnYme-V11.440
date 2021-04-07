package com.afollestad.assent;

import com.afollestad.assent.internal.a;
import com.afollestad.assent.internal.e;
import com.afollestad.assent.internal.f;
import com.afollestad.assent.internal.g;
import com.afollestad.assent.rationale.b;
import java.util.Arrays;

public final class d {
    public static final <T> void a(T t, z52<? super T, g> z52, g[] gVarArr, int i, com.afollestad.assent.rationale.d dVar, b bVar, z52<? super b, u22> z522) {
        T t2 = t;
        g[] gVarArr2 = gVarArr;
        int i2 = i;
        com.afollestad.assent.rationale.d dVar2 = dVar;
        b bVar2 = bVar;
        z52<? super b, u22> z523 = z522;
        v62.f(t2, "$this$startPermissionRequest");
        v62.f(z52, "ensure");
        v62.f(gVarArr2, "permissions");
        v62.f(dVar2, "shouldShowRationale");
        v62.f(z523, "callback");
        e.a(t2, "startPermissionRequest(%s)", b32.k(gVarArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 63, (Object) null));
        for (g a : gVarArr2) {
            dVar2.a(a);
        }
        if (bVar2 != null) {
            bVar2.r(gVarArr2, i2, z523);
            return;
        }
        f d = a.f.d().d();
        if (d == null || !com.afollestad.assent.internal.b.c(d.b(), (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length))) {
            f fVar = new f(b32.s(gVarArr), i2, f32.i(z523));
            if (d == null) {
                a.f.d().g(fVar);
                e.a(t2, "New request, performing now", new Object[0]);
                z52.r(t2).K1(fVar);
                return;
            }
            if (d.c() == i2) {
                fVar.d(1 + i2);
            }
            e.a(t2, "New request queued for when the current is complete", new Object[0]);
            a.f.d().f().b(fVar);
            return;
        }
        e.a(t2, "Callback appended to existing matching request for %s", b32.k(gVarArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 63, (Object) null));
        d.a().add(z523);
    }
}
