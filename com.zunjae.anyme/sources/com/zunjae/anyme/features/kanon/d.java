package com.zunjae.anyme.features.kanon;

import android.content.Context;
import com.zunjae.extensions.b;
import defpackage.ab2;
import defpackage.ri2;
import defpackage.ua2;
import defpackage.xa2;

public final class d {
    public static final d a = new d();

    static final class a implements ua2 {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        public final cb2 a(ua2.a aVar) {
            ab2.a h = aVar.i().h();
            h.a("APIKey", "EUPP4UQDFJ435B5A900K");
            h.a("Content-Type", "application/json");
            h.a("AppVersionName", "11.440");
            h.a("PatchInstalled", String.valueOf(qv1.a.z(this.a)));
            h.a("AppBuildType", "Beta");
            String d = xx1.a.d();
            if (d == null) {
                d = "";
            }
            h.a("UserToken", d);
            return aVar.c(h.b());
        }
    }

    private d() {
    }

    public final e a(Context context, boolean z) {
        v62.e(context, "context");
        xa2.b c = b.a.c(context, z, 10);
        c.a(new a(context));
        ri2.b bVar = new ri2.b();
        bVar.b("https://kanonapp.com");
        bVar.a(wi2.f());
        bVar.f(c.b());
        Object b = bVar.d().b(e.class);
        v62.d(b, "retrofit.create(KanonService::class.java)");
        return (e) b;
    }
}
