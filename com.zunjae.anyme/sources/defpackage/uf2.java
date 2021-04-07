package defpackage;

import defpackage.sf2;
import java.util.Arrays;
import org.jsoup.nodes.i;

/* renamed from: uf2  reason: default package */
final class uf2 {
    private static final char[] s;
    private final kf2 a;
    private final of2 b;
    private vf2 c = vf2.Data;
    private sf2 d;
    private boolean e = false;
    private String f = null;
    private StringBuilder g = new StringBuilder(1024);
    StringBuilder h = new StringBuilder(1024);
    sf2.h i;
    sf2.g j = new sf2.g();
    sf2.f k = new sf2.f();
    sf2.b l = new sf2.b();
    sf2.d m = new sf2.d();
    sf2.c n = new sf2.c();
    private String o;
    private boolean p = true;
    private final int[] q = new int[1];
    private final int[] r = new int[2];

    static {
        char[] cArr = {9, 10, 13, 12, ' ', '<', '&'};
        s = cArr;
        Arrays.sort(cArr);
    }

    uf2(kf2 kf2, of2 of2) {
        this.a = kf2;
        this.b = of2;
    }

    private void d(String str) {
        if (this.b.c()) {
            this.b.add(new nf2(this.a.D(), "Invalid character reference: %s", str));
        }
    }

    private void r(String str) {
        if (this.b.c()) {
            this.b.add(new nf2(this.a.D(), str));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.p = true;
    }

    /* access modifiers changed from: package-private */
    public void b(vf2 vf2) {
        this.a.a();
        this.c = vf2;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        String str = this.o;
        if (str == null) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public int[] e(Character ch, boolean z) {
        int i2;
        if (this.a.q()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.a.p()) || this.a.x(s)) {
            return null;
        }
        int[] iArr = this.q;
        this.a.r();
        if (this.a.s("#")) {
            boolean t = this.a.t("X");
            kf2 kf2 = this.a;
            String f2 = t ? kf2.f() : kf2.e();
            if (f2.length() == 0) {
                d("numeric reference with no numerals");
            } else {
                if (!this.a.s(";")) {
                    d("missing semicolon");
                }
                try {
                    i2 = Integer.valueOf(f2, t ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i2 = -1;
                }
                if (i2 == -1 || ((i2 >= 55296 && i2 <= 57343) || i2 > 1114111)) {
                    d("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                iArr[0] = i2;
                return iArr;
            }
        } else {
            String h2 = this.a.h();
            boolean u = this.a.u(';');
            if (!(i.f(h2) || (i.g(h2) && u))) {
                this.a.F();
                if (u) {
                    d(String.format("invalid named referenece '%s'", new Object[]{h2}));
                }
                return null;
            } else if (!z || (!this.a.A() && !this.a.y() && !this.a.w('=', '-', '_'))) {
                if (!this.a.s(";")) {
                    d("missing semicolon");
                }
                int d2 = i.d(h2, this.r);
                if (d2 == 1) {
                    iArr[0] = this.r[0];
                    return iArr;
                } else if (d2 == 2) {
                    return this.r;
                } else {
                    jf2.a("Unexpected characters returned for " + h2);
                    throw null;
                }
            }
        }
        this.a.F();
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.n.l();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.m.l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: sf2$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: sf2$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: sf2$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: sf2$f} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.sf2.h h(boolean r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0008
            sf2$g r1 = r0.j
            r1.D()
            goto L_0x000d
        L_0x0008:
            sf2$f r1 = r0.k
            r1.l()
        L_0x000d:
            r0.i = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf2.h(boolean):sf2$h");
    }

    /* access modifiers changed from: package-private */
    public void i() {
        sf2.m(this.h);
    }

    /* access modifiers changed from: package-private */
    public void j(char c2) {
        k(String.valueOf(c2));
    }

    /* access modifiers changed from: package-private */
    public void k(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        if (this.g.length() == 0) {
            this.g.append(this.f);
        }
        this.g.append(str);
    }

    /* access modifiers changed from: package-private */
    public void l(sf2 sf2) {
        jf2.c(this.e, "There is an unread token pending!");
        this.d = sf2;
        this.e = true;
        sf2.i iVar = sf2.a;
        if (iVar == sf2.i.StartTag) {
            sf2.g gVar = (sf2.g) sf2;
            this.o = gVar.b;
            if (gVar.i) {
                this.p = false;
            }
        } else if (iVar == sf2.i.EndTag && ((sf2.f) sf2).j != null) {
            r("Attributes incorrectly present on end tag");
        }
    }

    /* access modifiers changed from: package-private */
    public void m(int[] iArr) {
        k(new String(iArr, 0, iArr.length));
    }

    /* access modifiers changed from: package-private */
    public void n() {
        l(this.n);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        l(this.m);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.i.w();
        l(this.i);
    }

    /* access modifiers changed from: package-private */
    public void q(vf2 vf2) {
        if (this.b.c()) {
            this.b.add(new nf2(this.a.D(), "Unexpectedly reached end of file (EOF) in input state [%s]", vf2));
        }
    }

    /* access modifiers changed from: package-private */
    public void s(vf2 vf2) {
        if (this.b.c()) {
            this.b.add(new nf2(this.a.D(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.a.p()), vf2));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return this.o != null && this.i.z().equalsIgnoreCase(this.o);
    }

    /* access modifiers changed from: package-private */
    public sf2 u() {
        if (!this.p) {
            r("Self closing flag not acknowledged");
            this.p = true;
        }
        while (!this.e) {
            this.c.read(this, this.a);
        }
        if (this.g.length() > 0) {
            String sb = this.g.toString();
            StringBuilder sb2 = this.g;
            sb2.delete(0, sb2.length());
            this.f = null;
            sf2.b bVar = this.l;
            bVar.o(sb);
            return bVar;
        }
        String str = this.f;
        if (str != null) {
            sf2.b bVar2 = this.l;
            bVar2.o(str);
            this.f = null;
            return bVar2;
        }
        this.e = false;
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void v(vf2 vf2) {
        this.c = vf2;
    }
}
