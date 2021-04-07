package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.f0;
import defpackage.iu;
import defpackage.vt;
import java.util.Collections;
import java.util.List;

/* renamed from: fu  reason: default package */
final class fu extends iu {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public fu(vt vtVar) {
        super(vtVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(i50 i50) {
        f0 o;
        if (!this.b) {
            int z = i50.z();
            int i = (z >> 4) & 15;
            this.d = i;
            if (i == 2) {
                o = f0.p((String) null, "audio/mpeg", (String) null, -1, -1, 1, e[(z >> 2) & 3], (List<byte[]>) null, (ns) null, 0, (String) null);
            } else if (i == 7 || i == 8) {
                o = f0.o((String) null, this.d == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, -1, (List<byte[]>) null, (ns) null, 0, (String) null);
            } else {
                if (i != 10) {
                    int i2 = this.d;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Audio format not supported: ");
                    sb.append(i2);
                    throw new iu.a(sb.toString());
                }
                this.b = true;
            }
            this.a.d(o);
            this.c = true;
            this.b = true;
        } else {
            i50.N(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(i50 i50, long j) {
        i50 i502 = i50;
        if (this.d == 2) {
            int a = i50.a();
            this.a.b(i502, a);
            this.a.c(j, 1, a, 0, (vt.a) null);
            return true;
        }
        int z = i50.z();
        if (z == 0 && !this.c) {
            int a2 = i50.a();
            byte[] bArr = new byte[a2];
            i502.h(bArr, 0, a2);
            Pair<Integer, Integer> j2 = s40.j(bArr);
            this.a.d(f0.p((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) j2.second).intValue(), ((Integer) j2.first).intValue(), Collections.singletonList(bArr), (ns) null, 0, (String) null));
            this.c = true;
            return false;
        } else if (this.d == 10 && z != 1) {
            return false;
        } else {
            int a3 = i50.a();
            this.a.b(i502, a3);
            this.a.c(j, 1, a3, 0, (vt.a) null);
            return true;
        }
    }
}
