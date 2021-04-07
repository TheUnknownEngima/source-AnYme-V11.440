package defpackage;

import org.jsoup.nodes.h;
import org.jsoup.nodes.k;

/* renamed from: yf2  reason: default package */
public class yf2 {

    /* renamed from: yf2$a */
    private static class a implements dg2 {
        private final h a;
        private final ag2 b;
        private final bg2 c;

        a(h hVar, ag2 ag2, bg2 bg2) {
            this.a = hVar;
            this.b = ag2;
            this.c = bg2;
        }

        public void a(k kVar, int i) {
            if (kVar instanceof h) {
                h hVar = (h) kVar;
                if (this.c.a(this.a, hVar)) {
                    this.b.add(hVar);
                }
            }
        }

        public void b(k kVar, int i) {
        }
    }

    public static ag2 a(bg2 bg2, h hVar) {
        ag2 ag2 = new ag2();
        new cg2(new a(hVar, ag2, bg2)).a(hVar);
        return ag2;
    }
}
