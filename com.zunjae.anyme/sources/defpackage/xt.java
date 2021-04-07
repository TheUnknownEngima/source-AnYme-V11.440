package defpackage;

import com.google.android.exoplayer2.m0;
import java.util.Arrays;

/* renamed from: xt  reason: default package */
public final class xt {

    /* renamed from: xt$a */
    private static final class a {
        public a(int i, int i2, long[] jArr, int i3, boolean z) {
        }
    }

    /* renamed from: xt$b */
    public static final class b {
        public final String[] a;

        public b(String str, String[] strArr, int i) {
            this.a = strArr;
        }
    }

    /* renamed from: xt$c */
    public static final class c {
        public final boolean a;

        public c(boolean z, int i, int i2, int i3) {
            this.a = z;
        }
    }

    /* renamed from: xt$d */
    public static final class d {
        public final int a;
        public final long b;
        public final int c;
        public final int d;
        public final int e;
        public final byte[] f;

        public d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.a = i;
            this.b = j2;
            this.c = i3;
            this.d = i5;
            this.e = i6;
            this.f = bArr;
        }
    }

    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    private static long b(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    private static a c(wt wtVar) {
        if (wtVar.d(24) == 5653314) {
            int d2 = wtVar.d(16);
            int d3 = wtVar.d(24);
            long[] jArr = new long[d3];
            boolean c2 = wtVar.c();
            long j = 0;
            if (!c2) {
                boolean c3 = wtVar.c();
                for (int i = 0; i < d3; i++) {
                    if (!c3) {
                        jArr[i] = (long) (wtVar.d(5) + 1);
                    } else if (wtVar.c()) {
                        jArr[i] = (long) (wtVar.d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d4 = wtVar.d(5) + 1;
                int i2 = 0;
                while (i2 < d3) {
                    int d5 = wtVar.d(a(d3 - i2));
                    for (int i3 = 0; i3 < d5 && i2 < d3; i3++) {
                        jArr[i2] = (long) d4;
                        i2++;
                    }
                    d4++;
                }
            }
            int d6 = wtVar.d(4);
            if (d6 <= 2) {
                if (d6 == 1 || d6 == 2) {
                    wtVar.e(32);
                    wtVar.e(32);
                    int d7 = wtVar.d(4) + 1;
                    wtVar.e(1);
                    if (d6 != 1) {
                        j = ((long) d3) * ((long) d2);
                    } else if (d2 != 0) {
                        j = b((long) d3, (long) d2);
                    }
                    wtVar.e((int) (j * ((long) d7)));
                }
                return new a(d2, d3, jArr, d6, c2);
            }
            StringBuilder sb = new StringBuilder(53);
            sb.append("lookup type greater than 2 not decodable: ");
            sb.append(d6);
            throw new m0(sb.toString());
        }
        int b2 = wtVar.b();
        StringBuilder sb2 = new StringBuilder(66);
        sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb2.append(b2);
        throw new m0(sb2.toString());
    }

    private static void d(wt wtVar) {
        int d2 = wtVar.d(6) + 1;
        for (int i = 0; i < d2; i++) {
            int d3 = wtVar.d(16);
            if (d3 == 0) {
                wtVar.e(8);
                wtVar.e(16);
                wtVar.e(16);
                wtVar.e(6);
                wtVar.e(8);
                int d4 = wtVar.d(4) + 1;
                for (int i2 = 0; i2 < d4; i2++) {
                    wtVar.e(8);
                }
            } else if (d3 == 1) {
                int d5 = wtVar.d(5);
                int i3 = -1;
                int[] iArr = new int[d5];
                for (int i4 = 0; i4 < d5; i4++) {
                    iArr[i4] = wtVar.d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = wtVar.d(3) + 1;
                    int d6 = wtVar.d(2);
                    if (d6 > 0) {
                        wtVar.e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d6); i7++) {
                        wtVar.e(8);
                    }
                }
                wtVar.e(2);
                int d7 = wtVar.d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d5; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        wtVar.e(d7);
                        i9++;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("floor type greater than 1 not decodable: ");
                sb.append(d3);
                throw new m0(sb.toString());
            }
        }
    }

    private static void e(int i, wt wtVar) {
        int d2 = wtVar.d(6) + 1;
        for (int i2 = 0; i2 < d2; i2++) {
            int d3 = wtVar.d(16);
            if (d3 != 0) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("mapping type other than 0 not supported: ");
                sb.append(d3);
                b50.c("VorbisUtil", sb.toString());
            } else {
                int d4 = wtVar.c() ? wtVar.d(4) + 1 : 1;
                if (wtVar.c()) {
                    int d5 = wtVar.d(8) + 1;
                    for (int i3 = 0; i3 < d5; i3++) {
                        int i4 = i - 1;
                        wtVar.e(a(i4));
                        wtVar.e(a(i4));
                    }
                }
                if (wtVar.d(2) == 0) {
                    if (d4 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            wtVar.e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d4; i6++) {
                        wtVar.e(8);
                        wtVar.e(8);
                        wtVar.e(8);
                    }
                } else {
                    throw new m0("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    private static c[] f(wt wtVar) {
        int d2 = wtVar.d(6) + 1;
        c[] cVarArr = new c[d2];
        for (int i = 0; i < d2; i++) {
            cVarArr[i] = new c(wtVar.c(), wtVar.d(16), wtVar.d(16), wtVar.d(8));
        }
        return cVarArr;
    }

    private static void g(wt wtVar) {
        int d2 = wtVar.d(6) + 1;
        int i = 0;
        while (i < d2) {
            if (wtVar.d(16) <= 2) {
                wtVar.e(24);
                wtVar.e(24);
                wtVar.e(24);
                int d3 = wtVar.d(6) + 1;
                wtVar.e(8);
                int[] iArr = new int[d3];
                for (int i2 = 0; i2 < d3; i2++) {
                    iArr[i2] = ((wtVar.c() ? wtVar.d(5) : 0) * 8) + wtVar.d(3);
                }
                for (int i3 = 0; i3 < d3; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            wtVar.e(8);
                        }
                    }
                }
                i++;
            } else {
                throw new m0("residueType greater than 2 is not decodable");
            }
        }
    }

    public static b h(i50 i50) {
        return i(i50, true, true);
    }

    public static b i(i50 i50, boolean z, boolean z2) {
        if (z) {
            l(3, i50, false);
        }
        String w = i50.w((int) i50.p());
        int length = 11 + w.length();
        long p = i50.p();
        String[] strArr = new String[((int) p)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < p; i2++) {
            strArr[i2] = i50.w((int) i50.p());
            i = i + 4 + strArr[i2].length();
        }
        if (!z2 || (i50.z() & 1) != 0) {
            return new b(w, strArr, i + 1);
        }
        throw new m0("framing bit expected to be set");
    }

    public static d j(i50 i50) {
        i50 i502 = i50;
        l(1, i502, false);
        long p = i50.p();
        int z = i50.z();
        long p2 = i50.p();
        int n = i50.n();
        int n2 = i50.n();
        int n3 = i50.n();
        int z2 = i50.z();
        return new d(p, z, p2, n, n2, n3, (int) Math.pow(2.0d, (double) (z2 & 15)), (int) Math.pow(2.0d, (double) ((z2 & 240) >> 4)), (i50.z() & 1) > 0, Arrays.copyOf(i502.a, i50.d()));
    }

    public static c[] k(i50 i50, int i) {
        int i2 = 0;
        l(5, i50, false);
        int z = i50.z() + 1;
        wt wtVar = new wt(i50.a);
        wtVar.e(i50.c() * 8);
        for (int i3 = 0; i3 < z; i3++) {
            c(wtVar);
        }
        int d2 = wtVar.d(6) + 1;
        while (i2 < d2) {
            if (wtVar.d(16) == 0) {
                i2++;
            } else {
                throw new m0("placeholder of time domain transforms not zeroed out");
            }
        }
        d(wtVar);
        g(wtVar);
        e(i, wtVar);
        c[] f = f(wtVar);
        if (wtVar.c()) {
            return f;
        }
        throw new m0("framing bit after modes not set as expected");
    }

    public static boolean l(int i, i50 i50, boolean z) {
        if (i50.a() < 7) {
            if (z) {
                return false;
            }
            int a2 = i50.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(a2);
            throw new m0(sb.toString());
        } else if (i50.z() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new m0(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (i50.z() == 118 && i50.z() == 111 && i50.z() == 114 && i50.z() == 98 && i50.z() == 105 && i50.z() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new m0("expected characters 'vorbis'");
        }
    }
}
