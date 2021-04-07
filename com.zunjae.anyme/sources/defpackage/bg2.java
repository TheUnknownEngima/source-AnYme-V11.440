package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: bg2  reason: default package */
public abstract class bg2 {

    /* renamed from: bg2$a */
    public static final class a extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    /* renamed from: bg2$a0 */
    public static final class a0 extends o {
        public a0(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int b(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.G().h0().size() - hVar2.l0().intValue();
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "nth-last-child";
        }
    }

    /* renamed from: bg2$b */
    public static final class b extends bg2 {
        private String a;

        public b(String str) {
            this.a = str;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$b0 */
    public static class b0 extends o {
        public b0(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int b(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            ag2 h0 = hVar2.G().h0();
            int i = 0;
            for (int intValue = hVar2.l0().intValue(); intValue < h0.size(); intValue++) {
                if (((org.jsoup.nodes.h) h0.get(intValue)).C0().equals(hVar2.C0())) {
                    i++;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "nth-last-of-type";
        }
    }

    /* renamed from: bg2$c */
    public static abstract class c extends bg2 {
        String a;
        String b;

        public c(String str, String str2) {
            jf2.h(str);
            jf2.h(str2);
            this.a = str.trim().toLowerCase();
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.b = str2.trim().toLowerCase();
        }
    }

    /* renamed from: bg2$c0 */
    public static class c0 extends o {
        public c0(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int b(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            Iterator it = hVar2.G().h0().iterator();
            int i = 0;
            while (it.hasNext()) {
                org.jsoup.nodes.h hVar3 = (org.jsoup.nodes.h) it.next();
                if (hVar3.C0().equals(hVar2.C0())) {
                    i++;
                    continue;
                }
                if (hVar3 == hVar2) {
                    break;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "nth-of-type";
        }
    }

    /* renamed from: bg2$d */
    public static final class d extends bg2 {
        private String a;

        public d(String str) {
            jf2.h(str);
            this.a = str.toLowerCase();
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            for (org.jsoup.nodes.a c : hVar2.f().d()) {
                if (c.getKey().toLowerCase().startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$d0 */
    public static final class d0 extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            org.jsoup.nodes.h w0 = hVar2.G();
            return w0 != null && !(w0 instanceof org.jsoup.nodes.f) && hVar2.A0().size() == 0;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* renamed from: bg2$e */
    public static final class e extends c {
        public e(String str, String str2) {
            super(str, str2);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a) && this.b.equalsIgnoreCase(hVar2.d(this.a).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.a, this.b});
        }
    }

    /* renamed from: bg2$e0 */
    public static final class e0 extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            org.jsoup.nodes.h w0 = hVar2.G();
            if (w0 == null || (w0 instanceof org.jsoup.nodes.f)) {
                return false;
            }
            Iterator it = w0.h0().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((org.jsoup.nodes.h) it.next()).C0().equals(hVar2.C0())) {
                    i++;
                }
            }
            return i == 1;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* renamed from: bg2$f */
    public static final class f extends c {
        public f(String str, String str2) {
            super(str, str2);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a) && hVar2.d(this.a).toLowerCase().contains(this.b);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.a, this.b});
        }
    }

    /* renamed from: bg2$f0 */
    public static final class f0 extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            if (hVar instanceof org.jsoup.nodes.f) {
                hVar = hVar.g0(0);
            }
            return hVar2 == hVar;
        }

        public String toString() {
            return ":root";
        }
    }

    /* renamed from: bg2$g */
    public static final class g extends c {
        public g(String str, String str2) {
            super(str, str2);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a) && hVar2.d(this.a).toLowerCase().endsWith(this.b);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.a, this.b});
        }
    }

    /* renamed from: bg2$g0 */
    public static final class g0 extends bg2 {
        private Pattern a;

        public g0(Pattern pattern) {
            this.a = pattern;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return this.a.matcher(hVar2.E0()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$h */
    public static final class h extends bg2 {
        String a;
        Pattern b;

        public h(String str, Pattern pattern) {
            this.a = str.trim().toLowerCase();
            this.b = pattern;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a) && this.b.matcher(hVar2.d(this.a)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.a, this.b.toString()});
        }
    }

    /* renamed from: bg2$h0 */
    public static final class h0 extends bg2 {
        private Pattern a;

        public h0(Pattern pattern) {
            this.a = pattern;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return this.a.matcher(hVar2.u0()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$i */
    public static final class i extends c {
        public i(String str, String str2) {
            super(str, str2);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return !this.b.equalsIgnoreCase(hVar2.d(this.a));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.a, this.b});
        }
    }

    /* renamed from: bg2$i0 */
    public static final class i0 extends bg2 {
        private String a;

        public i0(String str) {
            this.a = str;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.D0().equalsIgnoreCase(this.a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$j */
    public static final class j extends c {
        public j(String str, String str2) {
            super(str, str2);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u(this.a) && hVar2.d(this.a).toLowerCase().startsWith(this.b);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.a, this.b});
        }
    }

    /* renamed from: bg2$j0 */
    public static final class j0 extends bg2 {
        private String a;

        public j0(String str) {
            this.a = str;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.D0().endsWith(this.a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$k */
    public static final class k extends bg2 {
        private String a;

        public k(String str) {
            this.a = str;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.o0(this.a);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$l */
    public static final class l extends bg2 {
        private String a;

        public l(String str) {
            this.a = str.toLowerCase();
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.k0().toLowerCase().contains(this.a);
        }

        public String toString() {
            return String.format(":containsData(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$m */
    public static final class m extends bg2 {
        private String a;

        public m(String str) {
            this.a = str.toLowerCase();
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.u0().toLowerCase().contains(this.a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$n */
    public static final class n extends bg2 {
        private String a;

        public n(String str) {
            this.a = str.toLowerCase();
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.E0().toLowerCase().contains(this.a);
        }

        public String toString() {
            return String.format(":contains(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$o */
    public static abstract class o extends bg2 {
        protected final int a;
        protected final int b;

        public o(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            org.jsoup.nodes.h w0 = hVar2.G();
            if (w0 == null || (w0 instanceof org.jsoup.nodes.f)) {
                return false;
            }
            int b2 = b(hVar, hVar2);
            int i = this.a;
            if (i == 0) {
                return b2 == this.b;
            }
            int i2 = this.b;
            return (b2 - i2) * i >= 0 && (b2 - i2) % i == 0;
        }

        /* access modifiers changed from: protected */
        public abstract int b(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2);

        /* access modifiers changed from: protected */
        public abstract String c();

        public String toString() {
            if (this.a == 0) {
                return String.format(":%s(%d)", new Object[]{c(), Integer.valueOf(this.b)});
            } else if (this.b == 0) {
                return String.format(":%s(%dn)", new Object[]{c(), Integer.valueOf(this.a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{c(), Integer.valueOf(this.a), Integer.valueOf(this.b)});
            }
        }
    }

    /* renamed from: bg2$p */
    public static final class p extends bg2 {
        private String a;

        public p(String str) {
            this.a = str;
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return this.a.equals(hVar2.r0());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.a});
        }
    }

    /* renamed from: bg2$q */
    public static final class q extends r {
        public q(int i) {
            super(i);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.l0().intValue() == this.a;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    /* renamed from: bg2$r */
    public static abstract class r extends bg2 {
        int a;

        public r(int i) {
            this.a = i;
        }
    }

    /* renamed from: bg2$s */
    public static final class s extends r {
        public s(int i) {
            super(i);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.l0().intValue() > this.a;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    /* renamed from: bg2$t */
    public static final class t extends r {
        public t(int i) {
            super(i);
        }

        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.l0().intValue() < this.a;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.a)});
        }
    }

    /* renamed from: bg2$u */
    public static final class u extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            for (org.jsoup.nodes.k next : hVar2.p()) {
                if (!(next instanceof org.jsoup.nodes.d) && !(next instanceof org.jsoup.nodes.m) && !(next instanceof org.jsoup.nodes.g)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* renamed from: bg2$v */
    public static final class v extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            org.jsoup.nodes.h w0 = hVar2.G();
            return w0 != null && !(w0 instanceof org.jsoup.nodes.f) && hVar2.l0().intValue() == 0;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* renamed from: bg2$w */
    public static final class w extends c0 {
        public w() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    /* renamed from: bg2$x */
    public static final class x extends bg2 {
        public boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            org.jsoup.nodes.h w0 = hVar2.G();
            return w0 != null && !(w0 instanceof org.jsoup.nodes.f) && hVar2.l0().intValue() == w0.h0().size() - 1;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* renamed from: bg2$y */
    public static final class y extends b0 {
        public y() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    /* renamed from: bg2$z */
    public static final class z extends o {
        public z(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int b(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2) {
            return hVar2.l0().intValue() + 1;
        }

        /* access modifiers changed from: protected */
        public String c() {
            return "nth-child";
        }
    }

    protected bg2() {
    }

    public abstract boolean a(org.jsoup.nodes.h hVar, org.jsoup.nodes.h hVar2);
}
