package defpackage;

import defpackage.yx;
import java.nio.ByteBuffer;

/* renamed from: dz  reason: default package */
public final class dz implements ay {
    private final i50 a = new i50();
    private final h50 b = new h50();
    private s50 c;

    public yx a(cy cyVar) {
        ByteBuffer byteBuffer = cyVar.f;
        q40.e(byteBuffer);
        ByteBuffer byteBuffer2 = byteBuffer;
        s50 s50 = this.c;
        if (s50 == null || cyVar.k != s50.e()) {
            s50 s502 = new s50(cyVar.h);
            this.c = s502;
            s502.a(cyVar.h - cyVar.k);
        }
        byte[] array = byteBuffer2.array();
        int limit = byteBuffer2.limit();
        this.a.K(array, limit);
        this.b.n(array, limit);
        this.b.q(39);
        long h = (((long) this.b.h(1)) << 32) | ((long) this.b.h(32));
        this.b.q(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        yx.b bVar = null;
        this.a.N(14);
        if (h3 == 0) {
            bVar = new fz();
        } else if (h3 == 255) {
            bVar = bz.a(this.a, h2, h);
        } else if (h3 == 4) {
            bVar = gz.a(this.a);
        } else if (h3 == 5) {
            bVar = ez.a(this.a, h, this.c);
        } else if (h3 == 6) {
            bVar = hz.a(this.a, h, this.c);
        }
        if (bVar == null) {
            return new yx(new yx.b[0]);
        }
        return new yx(bVar);
    }
}
