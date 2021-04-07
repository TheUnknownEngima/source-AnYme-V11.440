package defpackage;

import defpackage.bg2;
import defpackage.fg2;
import defpackage.gg2;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: eg2  reason: default package */
public class eg2 {
    private static final String[] d = {",", ">", "+", "~", " "};
    private static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("(\\+|-)?(\\d+)");
    private tf2 a;
    private String b;
    private List<bg2> c = new ArrayList();

    private eg2(String str) {
        this.b = str;
        this.a = new tf2(str);
    }

    private void a() {
        this.c.add(new bg2.a());
    }

    private void b() {
        List<bg2> list;
        Object hVar;
        Object obj;
        List<bg2> list2;
        tf2 tf2 = new tf2(this.a.a('[', ']'));
        String h = tf2.h(e);
        jf2.h(h);
        tf2.i();
        if (tf2.j()) {
            if (h.startsWith("^")) {
                list2 = this.c;
                obj = new bg2.d(h.substring(1));
            } else {
                list2 = this.c;
                obj = new bg2.b(h);
            }
            list2.add(obj);
            return;
        }
        if (tf2.k("=")) {
            list = this.c;
            hVar = new bg2.e(h, tf2.q());
        } else if (tf2.k("!=")) {
            list = this.c;
            hVar = new bg2.i(h, tf2.q());
        } else if (tf2.k("^=")) {
            list = this.c;
            hVar = new bg2.j(h, tf2.q());
        } else if (tf2.k("$=")) {
            list = this.c;
            hVar = new bg2.g(h, tf2.q());
        } else if (tf2.k("*=")) {
            list = this.c;
            hVar = new bg2.f(h, tf2.q());
        } else if (tf2.k("~=")) {
            list = this.c;
            hVar = new bg2.h(h, Pattern.compile(tf2.q()));
        } else {
            throw new fg2.a("Could not parse attribute query '%s': unexpected token at '%s'", this.b, tf2.q());
        }
        list.add(hVar);
    }

    private void c() {
        String e2 = this.a.e();
        jf2.h(e2);
        this.c.add(new bg2.k(e2.trim()));
    }

    private void d() {
        String e2 = this.a.e();
        jf2.h(e2);
        this.c.add(new bg2.p(e2));
    }

    private void e() {
        String f2 = this.a.f();
        jf2.h(f2);
        if (f2.startsWith("*|")) {
            this.c.add(new zf2.b(new bg2.i0(f2.trim().toLowerCase()), new bg2.j0(f2.replace("*|", ":").trim().toLowerCase())));
            return;
        }
        if (f2.contains("|")) {
            f2 = f2.replace("|", ":");
        }
        this.c.add(new bg2.i0(f2.trim()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(char r11) {
        /*
            r10 = this;
            tf2 r0 = r10.a
            r0.i()
            java.lang.String r0 = r10.h()
            bg2 r0 = t(r0)
            java.util.List<bg2> r1 = r10.c
            int r1 = r1.size()
            r2 = 44
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0033
            java.util.List<bg2> r1 = r10.c
            java.lang.Object r1 = r1.get(r4)
            bg2 r1 = (defpackage.bg2) r1
            boolean r5 = r1 instanceof defpackage.zf2.b
            if (r5 == 0) goto L_0x003a
            if (r11 == r2) goto L_0x003a
            r5 = r1
            zf2$b r5 = (defpackage.zf2.b) r5
            bg2 r5 = r5.c()
            r6 = 1
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x003c
        L_0x0033:
            zf2$a r1 = new zf2$a
            java.util.List<bg2> r5 = r10.c
            r1.<init>((java.util.Collection<defpackage.bg2>) r5)
        L_0x003a:
            r5 = r1
            r6 = 0
        L_0x003c:
            java.util.List<bg2> r7 = r10.c
            r7.clear()
            r7 = 62
            r8 = 2
            if (r11 != r7) goto L_0x0057
            zf2$a r11 = new zf2$a
            bg2[] r2 = new defpackage.bg2[r8]
            r2[r4] = r0
            gg2$b r0 = new gg2$b
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((defpackage.bg2[]) r2)
            goto L_0x00ae
        L_0x0057:
            r7 = 32
            if (r11 != r7) goto L_0x006c
            zf2$a r11 = new zf2$a
            bg2[] r2 = new defpackage.bg2[r8]
            r2[r4] = r0
            gg2$e r0 = new gg2$e
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((defpackage.bg2[]) r2)
            goto L_0x00ae
        L_0x006c:
            r7 = 43
            if (r11 != r7) goto L_0x0081
            zf2$a r11 = new zf2$a
            bg2[] r2 = new defpackage.bg2[r8]
            r2[r4] = r0
            gg2$c r0 = new gg2$c
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((defpackage.bg2[]) r2)
            goto L_0x00ae
        L_0x0081:
            r7 = 126(0x7e, float:1.77E-43)
            if (r11 != r7) goto L_0x0096
            zf2$a r11 = new zf2$a
            bg2[] r2 = new defpackage.bg2[r8]
            r2[r4] = r0
            gg2$f r0 = new gg2$f
            r0.<init>(r1)
            r2[r3] = r0
            r11.<init>((defpackage.bg2[]) r2)
            goto L_0x00ae
        L_0x0096:
            if (r11 != r2) goto L_0x00be
            boolean r11 = r1 instanceof defpackage.zf2.b
            if (r11 == 0) goto L_0x00a3
            zf2$b r1 = (defpackage.zf2.b) r1
            r1.e(r0)
            r11 = r1
            goto L_0x00ae
        L_0x00a3:
            zf2$b r11 = new zf2$b
            r11.<init>()
            r11.e(r1)
            r11.e(r0)
        L_0x00ae:
            if (r6 == 0) goto L_0x00b7
            r0 = r5
            zf2$b r0 = (defpackage.zf2.b) r0
            r0.b(r11)
            goto L_0x00b8
        L_0x00b7:
            r5 = r11
        L_0x00b8:
            java.util.List<bg2> r11 = r10.c
            r11.add(r5)
            return
        L_0x00be:
            fg2$a r0 = new fg2$a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown combinator: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.f(char):void");
    }

    private int g() {
        String trim = this.a.b(")").trim();
        jf2.e(if2.e(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String h() {
        String str;
        StringBuilder sb = new StringBuilder();
        while (!this.a.j()) {
            if (this.a.l("(")) {
                sb.append("(");
                sb.append(this.a.a('(', ')'));
                str = ")";
            } else if (this.a.l("[")) {
                sb.append("[");
                sb.append(this.a.a('[', ']'));
                str = "]";
            } else if (this.a.n(d)) {
                break;
            } else {
                sb.append(this.a.c());
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private void i(boolean z) {
        List<bg2> list;
        Object obj;
        this.a.d(z ? ":containsOwn" : ":contains");
        String s = tf2.s(this.a.a('(', ')'));
        jf2.i(s, ":contains(text) query must not be empty");
        if (z) {
            list = this.c;
            obj = new bg2.m(s);
        } else {
            list = this.c;
            obj = new bg2.n(s);
        }
        list.add(obj);
    }

    private void j() {
        this.a.d(":containsData");
        String s = tf2.s(this.a.a('(', ')'));
        jf2.i(s, ":containsData(text) query must not be empty");
        this.c.add(new bg2.l(s));
    }

    private void k(boolean z, boolean z2) {
        Object obj;
        List<bg2> list;
        String lowerCase = this.a.b(")").trim().toLowerCase();
        Matcher matcher = f.matcher(lowerCase);
        Matcher matcher2 = g.matcher(lowerCase);
        int i = 2;
        int i2 = 0;
        if ("odd".equals(lowerCase)) {
            i2 = 1;
        } else if (!"even".equals(lowerCase)) {
            if (matcher.matches()) {
                int parseInt = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
                i = parseInt;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i = 0;
            } else {
                throw new fg2.a("Could not parse nth-index '%s': unexpected format", lowerCase);
            }
        }
        if (z2) {
            if (z) {
                list = this.c;
                obj = new bg2.b0(i, i2);
            } else {
                list = this.c;
                obj = new bg2.c0(i, i2);
            }
        } else if (z) {
            list = this.c;
            obj = new bg2.a0(i, i2);
        } else {
            list = this.c;
            obj = new bg2.z(i, i2);
        }
        list.add(obj);
    }

    private void l() {
        List<bg2> list;
        Object f0Var;
        if (this.a.k("#")) {
            d();
        } else if (this.a.k(".")) {
            c();
        } else if (this.a.p() || this.a.l("*|")) {
            e();
        } else if (this.a.l("[")) {
            b();
        } else if (this.a.k("*")) {
            a();
        } else if (this.a.k(":lt(")) {
            p();
        } else if (this.a.k(":gt(")) {
            o();
        } else if (this.a.k(":eq(")) {
            n();
        } else if (this.a.l(":has(")) {
            m();
        } else if (this.a.l(":contains(")) {
            i(false);
        } else if (this.a.l(":containsOwn(")) {
            i(true);
        } else if (this.a.l(":containsData(")) {
            j();
        } else if (this.a.l(":matches(")) {
            q(false);
        } else if (this.a.l(":matchesOwn(")) {
            q(true);
        } else if (this.a.l(":not(")) {
            r();
        } else if (this.a.k(":nth-child(")) {
            k(false, false);
        } else if (this.a.k(":nth-last-child(")) {
            k(true, false);
        } else if (this.a.k(":nth-of-type(")) {
            k(false, true);
        } else if (this.a.k(":nth-last-of-type(")) {
            k(true, true);
        } else {
            if (this.a.k(":first-child")) {
                list = this.c;
                f0Var = new bg2.v();
            } else if (this.a.k(":last-child")) {
                list = this.c;
                f0Var = new bg2.x();
            } else if (this.a.k(":first-of-type")) {
                list = this.c;
                f0Var = new bg2.w();
            } else if (this.a.k(":last-of-type")) {
                list = this.c;
                f0Var = new bg2.y();
            } else if (this.a.k(":only-child")) {
                list = this.c;
                f0Var = new bg2.d0();
            } else if (this.a.k(":only-of-type")) {
                list = this.c;
                f0Var = new bg2.e0();
            } else if (this.a.k(":empty")) {
                list = this.c;
                f0Var = new bg2.u();
            } else if (this.a.k(":root")) {
                list = this.c;
                f0Var = new bg2.f0();
            } else {
                throw new fg2.a("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.q());
            }
            list.add(f0Var);
        }
    }

    private void m() {
        this.a.d(":has");
        String a2 = this.a.a('(', ')');
        jf2.i(a2, ":has(el) subselect must not be empty");
        this.c.add(new gg2.a(t(a2)));
    }

    private void n() {
        this.c.add(new bg2.q(g()));
    }

    private void o() {
        this.c.add(new bg2.s(g()));
    }

    private void p() {
        this.c.add(new bg2.t(g()));
    }

    private void q(boolean z) {
        List<bg2> list;
        Object obj;
        this.a.d(z ? ":matchesOwn" : ":matches");
        String a2 = this.a.a('(', ')');
        jf2.i(a2, ":matches(regex) query must not be empty");
        if (z) {
            list = this.c;
            obj = new bg2.h0(Pattern.compile(a2));
        } else {
            list = this.c;
            obj = new bg2.g0(Pattern.compile(a2));
        }
        list.add(obj);
    }

    private void r() {
        this.a.d(":not");
        String a2 = this.a.a('(', ')');
        jf2.i(a2, ":not(selector) subselect must not be empty");
        this.c.add(new gg2.d(t(a2)));
    }

    public static bg2 t(String str) {
        return new eg2(str).s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.bg2 s() {
        /*
            r3 = this;
            tf2 r0 = r3.a
            r0.i()
            tf2 r0 = r3.a
            java.lang.String[] r1 = d
            boolean r0 = r0.n(r1)
            if (r0 == 0) goto L_0x0023
            java.util.List<bg2> r0 = r3.c
            gg2$g r1 = new gg2$g
            r1.<init>()
            r0.add(r1)
        L_0x0019:
            tf2 r0 = r3.a
            char r0 = r0.c()
        L_0x001f:
            r3.f(r0)
            goto L_0x0026
        L_0x0023:
            r3.l()
        L_0x0026:
            tf2 r0 = r3.a
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x0044
            tf2 r0 = r3.a
            boolean r0 = r0.i()
            tf2 r1 = r3.a
            java.lang.String[] r2 = d
            boolean r1 = r1.n(r2)
            if (r1 == 0) goto L_0x003f
            goto L_0x0019
        L_0x003f:
            if (r0 == 0) goto L_0x0023
            r0 = 32
            goto L_0x001f
        L_0x0044:
            java.util.List<bg2> r0 = r3.c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0057
            java.util.List<bg2> r0 = r3.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            bg2 r0 = (defpackage.bg2) r0
            return r0
        L_0x0057:
            zf2$a r0 = new zf2$a
            java.util.List<bg2> r1 = r3.c
            r0.<init>((java.util.Collection<defpackage.bg2>) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg2.s():bg2");
    }
}
