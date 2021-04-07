package com.zunjae.anyme.features.niche.trace;

import android.content.Context;
import com.zunjae.extensions.b;
import defpackage.ri2;
import defpackage.xa2;

public final class c {
    public static final c a = new c();

    private c() {
    }

    public final e a(Context context, boolean z) {
        v62.e(context, "context");
        xa2.b c = b.a.c(context, z, 30);
        ri2.b bVar = new ri2.b();
        bVar.b("https://trace.moe/api/");
        bVar.a(wi2.f());
        bVar.f(c.b());
        Object b = bVar.d().b(e.class);
        v62.d(b, "retrofit.create(TraceMoeService::class.java)");
        return (e) b;
    }
}
