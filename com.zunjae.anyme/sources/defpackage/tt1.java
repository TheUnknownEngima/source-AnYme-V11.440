package defpackage;

import android.content.Context;
import com.zunjae.extensions.b;
import defpackage.ri2;
import defpackage.xa2;

/* renamed from: tt1  reason: default package */
public final class tt1 {
    public static final tt1 a = new tt1();

    private tt1() {
    }

    public final ut1 a(Context context, boolean z) {
        v62.e(context, "context");
        xa2.b b = b.b(b.a, context, z, 0, 0, 12, (Object) null);
        ri2.b bVar = new ri2.b();
        bVar.b("https://gist.githubusercontent.com/zunjae/");
        bVar.a(wi2.f());
        bVar.f(b.b());
        Object b2 = bVar.d().b(ut1.class);
        v62.d(b2, "retrofit.create(GistService::class.java)");
        return (ut1) b2;
    }
}
