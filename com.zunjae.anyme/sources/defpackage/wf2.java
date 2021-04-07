package defpackage;

import defpackage.sf2;
import java.util.ArrayList;
import org.jsoup.nodes.b;
import org.jsoup.nodes.f;
import org.jsoup.nodes.h;

/* renamed from: wf2  reason: default package */
abstract class wf2 {
    kf2 a;
    uf2 b;
    protected f c;
    protected ArrayList<h> d;
    protected String e;
    protected sf2 f;
    protected of2 g;
    protected pf2 h;
    private sf2.g i = new sf2.g();
    private sf2.f j = new sf2.f();

    wf2() {
    }

    /* access modifiers changed from: protected */
    public h a() {
        int size = this.d.size();
        if (size > 0) {
            return this.d.get(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract pf2 b();

    /* access modifiers changed from: protected */
    public void c(String str, String str2, of2 of2, pf2 pf2) {
        jf2.k(str, "String input must not be null");
        jf2.k(str2, "BaseURI must not be null");
        this.c = new f(str2);
        this.h = pf2;
        this.a = new kf2(str);
        this.g = of2;
        this.b = new uf2(this.a, of2);
        this.d = new ArrayList<>(32);
        this.e = str2;
    }

    /* access modifiers changed from: package-private */
    public f d(String str, String str2, of2 of2, pf2 pf2) {
        c(str, str2, of2, pf2);
        i();
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean e(sf2 sf2);

    /* access modifiers changed from: protected */
    public boolean f(String str) {
        sf2 sf2 = this.f;
        sf2.f fVar = this.j;
        if (sf2 == fVar) {
            sf2.f fVar2 = new sf2.f();
            fVar2.A(str);
            return e(fVar2);
        }
        fVar.l();
        fVar.A(str);
        return e(fVar);
    }

    /* access modifiers changed from: protected */
    public boolean g(String str) {
        sf2 sf2 = this.f;
        sf2.g gVar = this.i;
        if (sf2 == gVar) {
            sf2.g gVar2 = new sf2.g();
            gVar2.A(str);
            return e(gVar2);
        }
        gVar.D();
        gVar.A(str);
        return e(gVar);
    }

    public boolean h(String str, b bVar) {
        sf2 sf2 = this.f;
        sf2.g gVar = this.i;
        if (sf2 == gVar) {
            sf2.g gVar2 = new sf2.g();
            gVar2.F(str, bVar);
            return e(gVar2);
        }
        gVar.D();
        this.i.F(str, bVar);
        return e(this.i);
    }

    /* access modifiers changed from: protected */
    public void i() {
        sf2 u;
        do {
            u = this.b.u();
            e(u);
            u.l();
        } while (u.a != sf2.i.EOF);
    }
}
