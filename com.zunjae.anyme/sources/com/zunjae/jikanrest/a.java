package com.zunjae.jikanrest;

import android.content.Context;
import com.zunjae.extensions.b;
import defpackage.ri2;
import defpackage.xa2;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public final b a(Context context, boolean z) {
        v62.e(context, "context");
        xa2.b a2 = b.a.a(context, z, 5, 10);
        ri2.b bVar = new ri2.b();
        bVar.b("https://api.jikan.moe/v3/");
        bVar.a(wi2.f());
        bVar.f(a2.b());
        Object b = bVar.d().b(b.class);
        v62.d(b, "retrofit.create(JikanService::class.java)");
        return (b) b;
    }
}
