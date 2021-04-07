package defpackage;

import java.util.Iterator;
import org.jsoup.nodes.h;

/* renamed from: gg2  reason: default package */
abstract class gg2 extends bg2 {
    bg2 a;

    /* renamed from: gg2$a */
    static class a extends gg2 {
        public a(bg2 bg2) {
            this.a = bg2;
        }

        public boolean a(h hVar, h hVar2) {
            Iterator it = hVar2.n0().iterator();
            while (it.hasNext()) {
                h hVar3 = (h) it.next();
                if (hVar3 != hVar2 && this.a.a(hVar, hVar3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$b */
    static class b extends gg2 {
        public b(bg2 bg2) {
            this.a = bg2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.G();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(org.jsoup.nodes.h r3, org.jsoup.nodes.h r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.h r4 = r4.G()
                if (r4 == 0) goto L_0x0013
                bg2 r1 = r2.a
                boolean r3 = r1.a(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gg2.b.a(org.jsoup.nodes.h, org.jsoup.nodes.h):boolean");
        }

        public String toString() {
            return String.format(":ImmediateParent%s", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$c */
    static class c extends gg2 {
        public c(bg2 bg2) {
            this.a = bg2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.y0();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(org.jsoup.nodes.h r3, org.jsoup.nodes.h r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                org.jsoup.nodes.h r4 = r4.y0()
                if (r4 == 0) goto L_0x0013
                bg2 r1 = r2.a
                boolean r3 = r1.a(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gg2.c.a(org.jsoup.nodes.h, org.jsoup.nodes.h):boolean");
        }

        public String toString() {
            return String.format(":prev%s", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$d */
    static class d extends gg2 {
        public d(bg2 bg2) {
            this.a = bg2;
        }

        public boolean a(h hVar, h hVar2) {
            return !this.a.a(hVar, hVar2);
        }

        public String toString() {
            return String.format(":not%s", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$e */
    static class e extends gg2 {
        public e(bg2 bg2) {
            this.a = bg2;
        }

        public boolean a(h hVar, h hVar2) {
            if (hVar == hVar2) {
                return false;
            }
            do {
                hVar2 = hVar2.G();
                if (this.a.a(hVar, hVar2)) {
                    return true;
                }
            } while (hVar2 != hVar);
            return false;
        }

        public String toString() {
            return String.format(":parent%s", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$f */
    static class f extends gg2 {
        public f(bg2 bg2) {
            this.a = bg2;
        }

        public boolean a(h hVar, h hVar2) {
            if (hVar == hVar2) {
                return false;
            }
            do {
                hVar2 = hVar2.y0();
                if (hVar2 == null) {
                    return false;
                }
            } while (!this.a.a(hVar, hVar2));
            return true;
        }

        public String toString() {
            return String.format(":prev*%s", new Object[]{this.a});
        }
    }

    /* renamed from: gg2$g */
    static class g extends bg2 {
        g() {
        }

        public boolean a(h hVar, h hVar2) {
            return hVar == hVar2;
        }
    }

    gg2() {
    }
}
