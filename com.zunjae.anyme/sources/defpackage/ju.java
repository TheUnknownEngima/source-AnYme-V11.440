package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.video.h;
import defpackage.iu;
import defpackage.vt;

/* renamed from: ju  reason: default package */
final class ju extends iu {
    private final i50 b = new i50(f50.a);
    private final i50 c = new i50(4);
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public ju(vt vtVar) {
        super(vtVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(i50 i50) {
        int z = i50.z();
        int i = (z >> 4) & 15;
        int i2 = z & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new iu.a(sb.toString());
    }

    /* access modifiers changed from: protected */
    public boolean c(i50 i50, long j) {
        i50 i502 = i50;
        int z = i50.z();
        long l = j + (((long) i50.l()) * 1000);
        if (z == 0 && !this.e) {
            i50 i503 = new i50(new byte[i50.a()]);
            i502.h(i503.a, 0, i50.a());
            h b2 = h.b(i503);
            this.d = b2.b;
            this.a.d(f0.H((String) null, "video/avc", (String) null, -1, -1, b2.c, b2.d, -1.0f, b2.a, -1, b2.e, (ns) null));
            this.e = true;
            return false;
        } else if (z != 1 || !this.e) {
            return false;
        } else {
            int i = this.g == 1 ? 1 : 0;
            if (!this.f && i == 0) {
                return false;
            }
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.d;
            int i3 = 0;
            while (i50.a() > 0) {
                i502.h(this.c.a, i2, this.d);
                this.c.M(0);
                int D = this.c.D();
                this.b.M(0);
                this.a.b(this.b, 4);
                this.a.b(i502, D);
                i3 = i3 + 4 + D;
            }
            this.a.c(l, i, i3, 0, (vt.a) null);
            this.f = true;
            return true;
        }
    }
}
