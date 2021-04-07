package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.w;
import com.google.android.gms.cast.l;

public class c {
    private final w a = new a();

    class a extends w.a {
        private a() {
        }

        public final w80 V() {
            return x80.s3(c.this);
        }

        public final int a() {
            return 12451009;
        }

        public final k80 a2(l lVar, int i) {
            return c.this.a(lVar, i);
        }

        public final k80 g2(l lVar, b bVar) {
            return c.this.b(lVar, bVar);
        }
    }

    @Deprecated
    public k80 a(l lVar, int i) {
        if (lVar == null || !lVar.o()) {
            return null;
        }
        return lVar.k().get(0);
    }

    public k80 b(l lVar, b bVar) {
        return a(lVar, bVar.j());
    }

    public final w c() {
        return this.a;
    }
}
