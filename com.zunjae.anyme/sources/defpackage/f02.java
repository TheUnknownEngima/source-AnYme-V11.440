package defpackage;

import android.text.Spanned;
import com.zunjae.constants.b;
import defpackage.iz1;
import java.util.List;

/* renamed from: f02  reason: default package */
public final class f02 implements iz1 {
    private final jz1 e = jz1.GoGoAnime;
    private final hz1 f = hz1.BuiltinBrowser;
    private final Void g;
    private final boolean h = true;
    private final int i = 50;
    private final mz1 j = mz1.Grid;
    private final long k = 15;
    private final boolean l = true;

    public Integer a() {
        return Integer.valueOf(this.i);
    }

    public hz1 b() {
        return this.f;
    }

    public List<oz1> c(pz1 pz1) {
        v62.e(pz1, "provider");
        throw new k22((String) null, 1, (r62) null);
    }

    public List<qz1> d(String str) {
        v62.e(str, "query");
        try {
            bf2 a = df2.a("https://ajax.gogocdn.net/site/loadAjaxSearch?keyword=" + str);
            a.c(b.d.b());
            a.f(true);
            String p0 = a.get().p0();
            v62.d(p0, "document.html()");
            df2.b(he2.a(f92.q(p0, "\\", "", false, 4, (Object) null)));
            return null;
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public mz1 e() {
        return this.j;
    }

    public long f() {
        return this.k;
    }

    public List<lz1> g(String str, int i2) {
        v62.e(str, "slug");
        throw new k22((String) null, 1, (r62) null);
    }

    public boolean h() {
        return this.h;
    }

    public List<oz1> i(String str, int i2) {
        v62.e(str, "id");
        throw new k22((String) null, 1, (r62) null);
    }

    public /* bridge */ /* synthetic */ String j() {
        return (String) m();
    }

    public Spanned k() {
        return iz1.a.a(this);
    }

    public jz1 l() {
        return this.e;
    }

    public Void m() {
        return this.g;
    }

    public boolean n() {
        return this.l;
    }

    public List<qz1> o() {
        throw new k22("An operation is not implemented: " + "not implemented");
    }
}
