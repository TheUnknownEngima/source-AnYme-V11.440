package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.nodes.i;

public class f extends h {
    private a l = new a();
    private b m = b.noQuirks;

    public static class a implements Cloneable {
        private i.c e = i.c.base;
        private Charset f = Charset.forName("UTF-8");
        private boolean g = true;
        private boolean h = false;
        private int i = 1;
        private C0255a j = C0255a.html;

        /* renamed from: org.jsoup.nodes.f$a$a  reason: collision with other inner class name */
        public enum C0255a {
            html,
            xml
        }

        public Charset b() {
            return this.f;
        }

        public a c(String str) {
            d(Charset.forName(str));
            return this;
        }

        public a d(Charset charset) {
            this.f = charset;
            return this;
        }

        /* renamed from: e */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.c(this.f.name());
                aVar.e = i.c.valueOf(this.e.name());
                return aVar;
            } catch (CloneNotSupportedException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharsetEncoder f() {
            return this.f.newEncoder();
        }

        public i.c g() {
            return this.e;
        }

        public int j() {
            return this.i;
        }

        public boolean n() {
            return this.h;
        }

        public boolean o() {
            return this.g;
        }

        public C0255a p() {
            return this.j;
        }

        public a q(C0255a aVar) {
            this.j = aVar;
            return this;
        }
    }

    public enum b {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public f(String str) {
        super(rf2.k("#root", pf2.c), str);
    }

    private h H0(String str, k kVar) {
        if (kVar.x().equals(str)) {
            return (h) kVar;
        }
        for (k H0 : kVar.f) {
            h H02 = H0(str, H0);
            if (H02 != null) {
                return H02;
            }
        }
        return null;
    }

    public h F0() {
        return H0("body", this);
    }

    /* renamed from: G0 */
    public f q() {
        f fVar = (f) super.q();
        fVar.l = this.l.clone();
        return fVar;
    }

    public a I0() {
        return this.l;
    }

    public b J0() {
        return this.m;
    }

    public f K0(b bVar) {
        this.m = bVar;
        return this;
    }

    public String x() {
        return "#document";
    }

    public String y() {
        return super.p0();
    }
}
