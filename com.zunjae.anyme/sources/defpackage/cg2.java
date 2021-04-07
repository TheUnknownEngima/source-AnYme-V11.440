package defpackage;

import org.jsoup.nodes.k;

/* renamed from: cg2  reason: default package */
public class cg2 {
    private dg2 a;

    public cg2(dg2 dg2) {
        this.a = dg2;
    }

    public void a(k kVar) {
        k kVar2 = kVar;
        int i = 0;
        while (kVar2 != null) {
            this.a.a(kVar2, i);
            if (kVar2.o() > 0) {
                kVar2 = kVar2.n(0);
                i++;
            } else {
                while (kVar2.w() == null && i > 0) {
                    this.a.b(kVar2, i);
                    kVar2 = kVar2.H();
                    i--;
                }
                this.a.b(kVar2, i);
                if (kVar2 != kVar) {
                    kVar2 = kVar2.w();
                } else {
                    return;
                }
            }
        }
    }
}
