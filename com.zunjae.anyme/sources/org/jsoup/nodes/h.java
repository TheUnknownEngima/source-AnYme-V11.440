package org.jsoup.nodes;

import defpackage.bg2;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.nodes.f;

public class h extends k {
    /* access modifiers changed from: private */
    public rf2 k;

    class a implements dg2 {
        final /* synthetic */ StringBuilder a;

        a(h hVar, StringBuilder sb) {
            this.a = sb;
        }

        public void a(k kVar, int i) {
            if (kVar instanceof l) {
                h.b0(this.a, (l) kVar);
            } else if (kVar instanceof h) {
                h hVar = (h) kVar;
                if (this.a.length() <= 0) {
                    return;
                }
                if ((hVar.t0() || hVar.k.b().equals("br")) && !l.b0(this.a)) {
                    this.a.append(" ");
                }
            }
        }

        public void b(k kVar, int i) {
        }
    }

    static {
        Pattern.compile("\\s+");
    }

    public h(rf2 rf2, String str) {
        this(rf2, str, new b());
    }

    public h(rf2 rf2, String str, b bVar) {
        super(str, bVar);
        jf2.j(rf2);
        this.k = rf2;
    }

    /* access modifiers changed from: private */
    public static void b0(StringBuilder sb, l lVar) {
        String Z = lVar.Z();
        if (x0(lVar.e)) {
            sb.append(Z);
        } else {
            if2.a(sb, Z, l.b0(sb));
        }
    }

    private static void c0(h hVar, StringBuilder sb) {
        if (hVar.k.b().equals("br") && !l.b0(sb)) {
            sb.append(" ");
        }
    }

    private void q0(StringBuilder sb) {
        for (k A : this.f) {
            A.A(sb);
        }
    }

    private static <E extends h> Integer s0(h hVar, List<E> list) {
        jf2.j(hVar);
        jf2.j(list);
        for (int i = 0; i < list.size(); i++) {
            if (((h) list.get(i)) == hVar) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private void v0(StringBuilder sb) {
        for (k next : this.f) {
            if (next instanceof l) {
                b0(sb, (l) next);
            } else if (next instanceof h) {
                c0((h) next, sb);
            }
        }
    }

    static boolean x0(k kVar) {
        if (kVar == null || !(kVar instanceof h)) {
            return false;
        }
        h hVar = (h) kVar;
        return hVar.k.h() || (hVar.G() != null && hVar.G().k.h());
    }

    public ag2 A0() {
        if (this.e == null) {
            return new ag2(0);
        }
        ag2<h> h0 = G().h0();
        ag2 ag2 = new ag2(h0.size() - 1);
        for (h hVar : h0) {
            if (hVar != this) {
                ag2.add(hVar);
            }
        }
        return ag2;
    }

    /* access modifiers changed from: package-private */
    public void B(Appendable appendable, int i, f.a aVar) {
        String str;
        if (aVar.o() && ((this.k.a() || ((G() != null && G().C0().a()) || aVar.n())) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            v(appendable, i, aVar);
        }
        appendable.append("<").append(D0());
        this.g.t(appendable, aVar);
        if (!this.f.isEmpty() || !this.k.g()) {
            str = ">";
        } else if (aVar.p() != f.a.C0255a.html || !this.k.d()) {
            str = " />";
        } else {
            appendable.append('>');
            return;
        }
        appendable.append(str);
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
        if (!this.f.isEmpty() || !this.k.g()) {
            if (aVar.o() && !this.f.isEmpty() && (this.k.a() || (aVar.n() && (this.f.size() > 1 || (this.f.size() == 1 && !(this.f.get(0) instanceof l)))))) {
                v(appendable, i, aVar);
            }
            appendable.append("</").append(D0()).append(">");
        }
    }

    public rf2 C0() {
        return this.k;
    }

    public String D0() {
        return this.k.b();
    }

    public String E0() {
        StringBuilder sb = new StringBuilder();
        new cg2(new a(this, sb)).a(this);
        return sb.toString().trim();
    }

    public h a0(k kVar) {
        jf2.j(kVar);
        O(kVar);
        s();
        this.f.add(kVar);
        kVar.T(this.f.size() - 1);
        return this;
    }

    public /* bridge */ /* synthetic */ k e(String str, String str2) {
        e0(str, str2);
        return this;
    }

    public h e0(String str, String str2) {
        super.e(str, str2);
        return this;
    }

    public h f0(k kVar) {
        super.j(kVar);
        return this;
    }

    public h g0(int i) {
        return (h) h0().get(i);
    }

    public ag2 h0() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (k next : this.f) {
            if (next instanceof h) {
                arrayList.add((h) next);
            }
        }
        return new ag2((List<h>) arrayList);
    }

    /* renamed from: i0 */
    public h q() {
        return (h) super.clone();
    }

    public String k0() {
        String k0;
        StringBuilder sb = new StringBuilder();
        for (k next : this.f) {
            if (next instanceof e) {
                k0 = ((e) next).X();
            } else if (next instanceof d) {
                k0 = ((d) next).X();
            } else if (next instanceof h) {
                k0 = ((h) next).k0();
            }
            sb.append(k0);
        }
        return sb.toString();
    }

    public Integer l0() {
        if (G() == null) {
            return 0;
        }
        return s0(this, G().h0());
    }

    public ag2 n0() {
        return yf2.a(new bg2.a(), this);
    }

    public boolean o0(String str) {
        String j = this.g.j("class");
        int length = j.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(j);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(j.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else if (i2 - i == length2 && j.regionMatches(true, i, str, 0, length2)) {
                        return true;
                    } else {
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return j.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public String p0() {
        StringBuilder sb = new StringBuilder();
        q0(sb);
        boolean o = t().o();
        String sb2 = sb.toString();
        return o ? sb2.trim() : sb2;
    }

    public String r0() {
        return this.g.n("id");
    }

    public boolean t0() {
        return this.k.c();
    }

    public String toString() {
        return y();
    }

    public String u0() {
        StringBuilder sb = new StringBuilder();
        v0(sb);
        return sb.toString().trim();
    }

    /* renamed from: w0 */
    public final h G() {
        return (h) this.e;
    }

    public String x() {
        return this.k.b();
    }

    public h y0() {
        if (this.e == null) {
            return null;
        }
        ag2 h0 = G().h0();
        Integer s0 = s0(this, h0);
        jf2.j(s0);
        if (s0.intValue() > 0) {
            return (h) h0.get(s0.intValue() - 1);
        }
        return null;
    }

    public ag2 z0(String str) {
        return fg2.c(str, this);
    }
}
