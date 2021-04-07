package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.m0;

/* renamed from: nx  reason: default package */
final class nx {

    /* renamed from: nx$a */
    private static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(it itVar, i50 i50) {
            itVar.l(i50.a, 0, 8);
            i50.M(0);
            return new a(i50.k(), i50.p());
        }
    }

    public static mx a(it itVar) {
        a a2;
        byte[] bArr;
        q40.e(itVar);
        i50 i50 = new i50(16);
        if (a.a(itVar, i50).a != 1380533830) {
            return null;
        }
        itVar.l(i50.a, 0, 4);
        i50.M(0);
        int k = i50.k();
        if (k != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(k);
            b50.c("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            a2 = a.a(itVar, i50);
            if (a2.a == 1718449184) {
                break;
            }
            itVar.e((int) a2.b);
        }
        q40.f(a2.b >= 16);
        itVar.l(i50.a, 0, 16);
        i50.M(0);
        int r = i50.r();
        int r2 = i50.r();
        int q = i50.q();
        int q2 = i50.q();
        int r3 = i50.r();
        int r4 = i50.r();
        int i = ((int) a2.b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            itVar.l(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = v50.f;
        }
        return new mx(r, r2, q, q2, r3, r4, bArr);
    }

    public static Pair<Long, Long> b(it itVar) {
        q40.e(itVar);
        itVar.i();
        i50 i50 = new i50(8);
        while (true) {
            a a2 = a.a(itVar, i50);
            int i = a2.a;
            if (i != 1684108385) {
                if (!(i == 1380533830 || i == 1718449184)) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Ignoring unknown WAV chunk: ");
                    sb.append(i);
                    b50.h("WavHeaderReader", sb.toString());
                }
                long j = a2.b + 8;
                if (a2.a == 1380533830) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    itVar.j((int) j);
                } else {
                    int i2 = a2.a;
                    StringBuilder sb2 = new StringBuilder(51);
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(i2);
                    throw new m0(sb2.toString());
                }
            } else {
                itVar.j(8);
                long m = itVar.m();
                long j2 = a2.b + m;
                long g = itVar.g();
                if (g != -1 && j2 > g) {
                    StringBuilder sb3 = new StringBuilder(69);
                    sb3.append("Data exceeds input length: ");
                    sb3.append(j2);
                    sb3.append(", ");
                    sb3.append(g);
                    b50.h("WavHeaderReader", sb3.toString());
                    j2 = g;
                }
                return Pair.create(Long.valueOf(m), Long.valueOf(j2));
            }
        }
    }
}
