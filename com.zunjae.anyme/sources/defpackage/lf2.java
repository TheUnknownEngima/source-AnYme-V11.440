package defpackage;

import defpackage.sf2;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.b;
import org.jsoup.nodes.d;
import org.jsoup.nodes.e;
import org.jsoup.nodes.f;
import org.jsoup.nodes.h;
import org.jsoup.nodes.j;
import org.jsoup.nodes.k;
import org.jsoup.nodes.l;

/* renamed from: lf2  reason: default package */
public class lf2 extends wf2 {
    private static final String[] A = {"html", "table"};
    private static final String[] B = {"optgroup", "option"};
    private static final String[] C = {"dd", "dt", "li", "option", "optgroup", "p", "rp", "rt"};
    private static final String[] D = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};
    public static final String[] x = {"applet", "caption", "html", "table", "td", "th", "marquee", "object"};
    private static final String[] y = {"ol", "ul"};
    private static final String[] z = {"button"};
    private mf2 k;
    private mf2 l;
    private boolean m = false;
    private h n;
    private j o;
    private h p;
    private ArrayList<h> q = new ArrayList<>();
    private List<String> r = new ArrayList();
    private sf2.f s = new sf2.f();
    private boolean t = true;
    private boolean u = false;
    private boolean v = false;
    private String[] w = {null};

    lf2() {
    }

    private boolean I(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.w;
        strArr3[0] = str;
        return J(strArr3, strArr, strArr2);
    }

    private boolean J(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            String x2 = this.d.get(size).x();
            if (if2.b(x2, strArr)) {
                return true;
            }
            if (if2.b(x2, strArr2)) {
                return false;
            }
            if (strArr3 != null && if2.b(x2, strArr3)) {
                return false;
            }
        }
        jf2.a("Should not be reachable");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T(org.jsoup.nodes.k r2) {
        /*
            r1 = this;
            java.util.ArrayList<org.jsoup.nodes.h> r0 = r1.d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.f r0 = r1.c
        L_0x000a:
            r0.a0(r2)
            goto L_0x001d
        L_0x000e:
            boolean r0 = r1.X()
            if (r0 == 0) goto L_0x0018
            r1.R(r2)
            goto L_0x001d
        L_0x0018:
            org.jsoup.nodes.h r0 = r1.a()
            goto L_0x000a
        L_0x001d:
            boolean r0 = r2 instanceof org.jsoup.nodes.h
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.h r2 = (org.jsoup.nodes.h) r2
            rf2 r0 = r2.C0()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0034
            org.jsoup.nodes.j r0 = r1.o
            if (r0 == 0) goto L_0x0034
            r0.F0(r2)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.T(org.jsoup.nodes.k):void");
    }

    private boolean W(ArrayList<h> arrayList, h hVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == hVar) {
                return true;
            }
        }
        return false;
    }

    private boolean a0(h hVar, h hVar2) {
        return hVar.x().equals(hVar2.x()) && hVar.f().equals(hVar2.f());
    }

    private void l(String... strArr) {
        int size = this.d.size() - 1;
        while (size >= 0) {
            h hVar = this.d.get(size);
            if (!if2.b(hVar.x(), strArr) && !hVar.x().equals("html")) {
                this.d.remove(size);
                size--;
            } else {
                return;
            }
        }
    }

    private void u0(ArrayList<h> arrayList, h hVar, h hVar2) {
        int lastIndexOf = arrayList.lastIndexOf(hVar);
        jf2.d(lastIndexOf != -1);
        arrayList.set(lastIndexOf, hVar2);
    }

    /* access modifiers changed from: package-private */
    public List<String> A() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public mf2 A0() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<h> B() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void B0(mf2 mf2) {
        this.k = mf2;
    }

    /* access modifiers changed from: package-private */
    public boolean C(String str) {
        return F(str, z);
    }

    /* access modifiers changed from: package-private */
    public boolean D(String str) {
        return F(str, y);
    }

    /* access modifiers changed from: package-private */
    public boolean E(String str) {
        return F(str, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean F(String str, String[] strArr) {
        return I(str, x, strArr);
    }

    /* access modifiers changed from: package-private */
    public boolean G(String[] strArr) {
        return J(strArr, x, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean H(String str) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            String x2 = this.d.get(size).x();
            if (x2.equals(str)) {
                return true;
            }
            if (!if2.b(x2, B)) {
                return false;
            }
        }
        jf2.a("Should not be reachable");
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean K(String str) {
        return I(str, A, (String[]) null);
    }

    /* access modifiers changed from: package-private */
    public h L(sf2.g gVar) {
        if (gVar.y()) {
            h P = P(gVar);
            this.d.add(P);
            this.b.v(vf2.Data);
            uf2 uf2 = this.b;
            sf2.f fVar = this.s;
            fVar.l();
            fVar.A(P.D0());
            uf2.l(fVar);
            return P;
        }
        rf2 k2 = rf2.k(gVar.z(), this.h);
        String str = this.e;
        pf2 pf2 = this.h;
        b bVar = gVar.j;
        pf2.a(bVar);
        h hVar = new h(k2, str, bVar);
        M(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void M(h hVar) {
        T(hVar);
        this.d.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void N(sf2.b bVar) {
        String D0 = a().D0();
        a().a0((D0.equals("script") || D0.equals("style")) ? new e(bVar.p(), this.e) : new l(bVar.p(), this.e));
    }

    /* access modifiers changed from: package-private */
    public void O(sf2.c cVar) {
        T(new d(cVar.o(), this.e));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r0.g() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jsoup.nodes.h P(defpackage.sf2.g r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.z()
            pf2 r1 = r4.h
            rf2 r0 = defpackage.rf2.k(r0, r1)
            org.jsoup.nodes.h r1 = new org.jsoup.nodes.h
            java.lang.String r2 = r4.e
            org.jsoup.nodes.b r3 = r5.j
            r1.<init>(r0, r2, r3)
            r4.T(r1)
            boolean r5 = r5.y()
            if (r5 == 0) goto L_0x0031
            boolean r5 = r0.f()
            if (r5 == 0) goto L_0x0029
            boolean r5 = r0.g()
            if (r5 == 0) goto L_0x0031
            goto L_0x002c
        L_0x0029:
            r0.j()
        L_0x002c:
            uf2 r5 = r4.b
            r5.a()
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.P(sf2$g):org.jsoup.nodes.h");
    }

    /* access modifiers changed from: package-private */
    public j Q(sf2.g gVar, boolean z2) {
        j jVar = new j(rf2.k(gVar.z(), this.h), this.e, gVar.j);
        x0(jVar);
        T(jVar);
        if (z2) {
            this.d.add(jVar);
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public void R(k kVar) {
        h hVar;
        h y2 = y("table");
        boolean z2 = false;
        if (y2 == null) {
            hVar = this.d.get(0);
        } else if (y2.G() != null) {
            hVar = y2.G();
            z2 = true;
        } else {
            hVar = j(y2);
        }
        if (z2) {
            jf2.j(y2);
            y2.f0(kVar);
            return;
        }
        hVar.a0(kVar);
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.q.add((Object) null);
    }

    /* access modifiers changed from: package-private */
    public void U(h hVar, h hVar2) {
        int lastIndexOf = this.d.lastIndexOf(hVar);
        jf2.d(lastIndexOf != -1);
        this.d.add(lastIndexOf + 1, hVar2);
    }

    /* access modifiers changed from: package-private */
    public h V(String str) {
        h hVar = new h(rf2.k(str, this.h), this.e);
        M(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public boolean X() {
        return this.u;
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public boolean Z(h hVar) {
        return W(this.q, hVar);
    }

    /* access modifiers changed from: package-private */
    public pf2 b() {
        return pf2.c;
    }

    /* access modifiers changed from: package-private */
    public boolean b0(h hVar) {
        return if2.b(hVar.x(), D);
    }

    /* access modifiers changed from: package-private */
    public h c0() {
        if (this.q.size() <= 0) {
            return null;
        }
        ArrayList<h> arrayList = this.q;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public f d(String str, String str2, of2 of2, pf2 pf2) {
        this.k = mf2.Initial;
        this.m = false;
        return super.d(str, str2, of2, pf2);
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.l = this.k;
    }

    /* access modifiers changed from: protected */
    public boolean e(sf2 sf2) {
        this.f = sf2;
        return this.k.process(sf2, this);
    }

    /* access modifiers changed from: package-private */
    public void e0(h hVar) {
        if (!this.m) {
            String b = hVar.b("href");
            if (b.length() != 0) {
                this.e = b;
                this.m = true;
                this.c.R(b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        this.r = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public boolean g0(h hVar) {
        return W(this.d, hVar);
    }

    /* access modifiers changed from: package-private */
    public mf2 h0() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public h i0() {
        return this.d.remove(this.d.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public h j(h hVar) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            if (this.d.get(size) == hVar) {
                return this.d.get(size - 1);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void j0(String str) {
        int size = this.d.size() - 1;
        while (size >= 0 && !this.d.get(size).x().equals(str)) {
            this.d.remove(size);
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000c, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r1 = this;
        L_0x0000:
            java.util.ArrayList<org.jsoup.nodes.h> r0 = r1.q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            org.jsoup.nodes.h r0 = r1.s0()
            if (r0 != 0) goto L_0x0000
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.k():void");
    }

    /* access modifiers changed from: package-private */
    public void k0(String str) {
        int size = this.d.size() - 1;
        while (size >= 0) {
            this.d.remove(size);
            if (!this.d.get(size).x().equals(str)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l0(String... strArr) {
        int size = this.d.size() - 1;
        while (size >= 0) {
            this.d.remove(size);
            if (!if2.b(this.d.get(size).x(), strArr)) {
                size--;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        l("tbody", "tfoot", "thead");
    }

    /* access modifiers changed from: package-private */
    public boolean m0(sf2 sf2, mf2 mf2) {
        this.f = sf2;
        return mf2.process(sf2, this);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        l("table");
    }

    /* access modifiers changed from: package-private */
    public void n0(h hVar) {
        this.d.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        l("tr");
    }

    /* access modifiers changed from: package-private */
    public void o0(h hVar) {
        int size = this.q.size() - 1;
        int i = 0;
        while (true) {
            if (size >= 0) {
                h hVar2 = this.q.get(size);
                if (hVar2 == null) {
                    break;
                }
                if (a0(hVar, hVar2)) {
                    i++;
                }
                if (i == 3) {
                    this.q.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.q.add(hVar);
    }

    /* access modifiers changed from: package-private */
    public void p(mf2 mf2) {
        if (this.g.c()) {
            this.g.add(new nf2(this.a.D(), "Unexpected token [%s] when in state [%s]", this.f.n(), mf2));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    void p0() {
        /*
            r7 = this;
            org.jsoup.nodes.h r0 = r7.c0()
            if (r0 == 0) goto L_0x0056
            boolean r1 = r7.g0(r0)
            if (r1 == 0) goto L_0x000d
            goto L_0x0056
        L_0x000d:
            java.util.ArrayList<org.jsoup.nodes.h> r1 = r7.q
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = r1
        L_0x0016:
            r4 = 0
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.util.ArrayList<org.jsoup.nodes.h> r0 = r7.q
            int r3 = r3 + -1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.nodes.h r0 = (org.jsoup.nodes.h) r0
            if (r0 == 0) goto L_0x002c
            boolean r5 = r7.g0(r0)
            if (r5 == 0) goto L_0x0016
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 != 0) goto L_0x0039
            java.util.ArrayList<org.jsoup.nodes.h> r0 = r7.q
            int r3 = r3 + 1
            java.lang.Object r0 = r0.get(r3)
            org.jsoup.nodes.h r0 = (org.jsoup.nodes.h) r0
        L_0x0039:
            defpackage.jf2.j(r0)
            java.lang.String r2 = r0.x()
            org.jsoup.nodes.h r2 = r7.V(r2)
            org.jsoup.nodes.b r5 = r2.f()
            org.jsoup.nodes.b r6 = r0.f()
            r5.c(r6)
            java.util.ArrayList<org.jsoup.nodes.h> r5 = r7.q
            r5.set(r3, r2)
            if (r3 != r1) goto L_0x002c
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf2.p0():void");
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        this.t = z2;
    }

    /* access modifiers changed from: package-private */
    public void q0(h hVar) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (this.q.get(size) == hVar) {
                this.q.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public boolean r0(h hVar) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            if (this.d.get(size) == hVar) {
                this.d.remove(size);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        t((String) null);
    }

    /* access modifiers changed from: package-private */
    public h s0() {
        int size = this.q.size();
        if (size > 0) {
            return this.q.remove(size - 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void t(String str) {
        while (str != null && !a().x().equals(str) && if2.b(a().x(), C)) {
            i0();
        }
    }

    /* access modifiers changed from: package-private */
    public void t0(h hVar, h hVar2) {
        u0(this.q, hVar, hVar2);
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.f + ", state=" + this.k + ", currentElement=" + a() + '}';
    }

    /* access modifiers changed from: package-private */
    public h u(String str) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            h hVar = this.q.get(size);
            if (hVar == null) {
                return null;
            }
            if (hVar.x().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String v() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public void v0(h hVar, h hVar2) {
        u0(this.d, hVar, hVar2);
    }

    /* access modifiers changed from: package-private */
    public f w() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public void w0() {
        mf2 mf2;
        int size = this.d.size() - 1;
        boolean z2 = false;
        while (size >= 0) {
            h hVar = this.d.get(size);
            if (size == 0) {
                hVar = this.p;
                z2 = true;
            }
            String x2 = hVar.x();
            if ("select".equals(x2)) {
                mf2 = mf2.InSelect;
            } else if ("td".equals(x2) || ("th".equals(x2) && !z2)) {
                mf2 = mf2.InCell;
            } else if ("tr".equals(x2)) {
                mf2 = mf2.InRow;
            } else if ("tbody".equals(x2) || "thead".equals(x2) || "tfoot".equals(x2)) {
                mf2 = mf2.InTableBody;
            } else if ("caption".equals(x2)) {
                mf2 = mf2.InCaption;
            } else if ("colgroup".equals(x2)) {
                mf2 = mf2.InColumnGroup;
            } else if ("table".equals(x2)) {
                mf2 = mf2.InTable;
            } else {
                if (!"head".equals(x2) && !"body".equals(x2)) {
                    if ("frameset".equals(x2)) {
                        mf2 = mf2.InFrameset;
                    } else if ("html".equals(x2)) {
                        mf2 = mf2.BeforeHead;
                    } else if (!z2) {
                        size--;
                    }
                }
                mf2 = mf2.InBody;
            }
            B0(mf2);
            return;
        }
    }

    /* access modifiers changed from: package-private */
    public j x() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void x0(j jVar) {
        this.o = jVar;
    }

    /* access modifiers changed from: package-private */
    public h y(String str) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            h hVar = this.d.get(size);
            if (hVar.x().equals(str)) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void y0(boolean z2) {
        this.u = z2;
    }

    /* access modifiers changed from: package-private */
    public h z() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void z0(h hVar) {
        this.n = hVar;
    }
}
