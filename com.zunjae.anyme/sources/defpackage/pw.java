package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import java.util.Arrays;

/* renamed from: pw  reason: default package */
public final class pw implements ow {
    private static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;
    private vt b;
    private boolean c;
    private long d;
    private final jx e;
    private final i50 f;
    private final boolean[] g;
    private final a h;
    private final vw i;
    private long j;
    private boolean k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    /* renamed from: pw$a */
    private static final class a {
        private static final byte[] e = {0, 0, 1};
        private boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.a = false;
                    return true;
                }
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    public pw() {
        this((jx) null);
    }

    pw(jx jxVar) {
        i50 i50;
        this.e = jxVar;
        this.g = new boolean[4];
        this.h = new a(128);
        if (jxVar != null) {
            this.i = new vw(178, 128);
            i50 = new i50();
        } else {
            i50 = null;
            this.i = null;
        }
        this.f = i50;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<com.google.android.exoplayer2.f0, java.lang.Long> a(defpackage.pw.a r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.d
            int r2 = r0.b
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            byte r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            byte r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            byte r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L_0x0043
            r6 = 3
            if (r5 == r6) goto L_0x003d
            if (r5 == r2) goto L_0x0037
            r2 = 1065353216(0x3f800000, float:1.0)
            r18 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004c
        L_0x0037:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L_0x0048
        L_0x003d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L_0x0048
        L_0x0043:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L_0x0048:
            float r5 = (float) r5
            float r2 = r2 / r5
            r18 = r2
        L_0x004c:
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            java.lang.String r9 = "video/mpeg2"
            r8 = r21
            com.google.android.exoplayer2.f0 r2 = com.google.android.exoplayer2.f0.H(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = 0
            byte r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0092
            double[] r7 = q
            int r8 = r7.length
            if (r3 >= r8) goto L_0x0092
            r5 = r7[r3]
            int r0 = r0.c
            int r0 = r0 + 9
            byte r3 = r1[r0]
            r3 = r3 & 96
            int r3 = r3 >> r4
            byte r0 = r1[r0]
            r0 = r0 & 31
            if (r3 == r0) goto L_0x008b
            double r3 = (double) r3
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r7
            int r0 = r0 + 1
            double r0 = (double) r0
            double r3 = r3 / r0
            double r5 = r5 * r3
        L_0x008b:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            long r5 = (long) r0
        L_0x0092:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw.a(pw$a, java.lang.String):android.util.Pair");
    }

    public void b(i50 i50) {
        int i2;
        i50 i502 = i50;
        int c2 = i50.c();
        int d2 = i50.d();
        byte[] bArr = i502.a;
        this.j += (long) i50.a();
        this.b.b(i502, i50.a());
        while (true) {
            int c3 = f50.c(bArr, c2, d2, this.g);
            if (c3 == d2) {
                break;
            }
            int i3 = c3 + 3;
            byte b2 = i502.a[i3] & 255;
            int i4 = c3 - c2;
            boolean z = false;
            if (!this.c) {
                if (i4 > 0) {
                    this.h.a(bArr, c2, c3);
                }
                if (this.h.b(b2, i4 < 0 ? -i4 : 0)) {
                    Pair<f0, Long> a2 = a(this.h, this.a);
                    this.b.d((f0) a2.first);
                    this.d = ((Long) a2.second).longValue();
                    this.c = true;
                }
            }
            if (this.e != null) {
                if (i4 > 0) {
                    this.i.a(bArr, c2, c3);
                    i2 = 0;
                } else {
                    i2 = -i4;
                }
                if (this.i.b(i2)) {
                    vw vwVar = this.i;
                    this.f.K(this.i.d, f50.k(vwVar.d, vwVar.e));
                    this.e.a(this.n, this.f);
                }
                if (b2 == 178 && i502.a[c3 + 2] == 1) {
                    this.i.e(b2);
                }
            }
            if (b2 == 0 || b2 == 179) {
                int i5 = d2 - c3;
                if (this.k && this.p && this.c) {
                    this.b.c(this.n, this.o ? 1 : 0, ((int) (this.j - this.m)) - i5, i5, (vt.a) null);
                }
                if (!this.k || this.p) {
                    this.m = this.j - ((long) i5);
                    long j2 = this.l;
                    if (j2 == -9223372036854775807L) {
                        j2 = this.k ? this.n + this.d : 0;
                    }
                    this.n = j2;
                    this.o = false;
                    this.l = -9223372036854775807L;
                    this.k = true;
                }
                if (b2 == 0) {
                    z = true;
                }
                this.p = z;
            } else if (b2 == 184) {
                this.o = true;
            }
            c2 = i3;
        }
        if (!this.c) {
            this.h.a(bArr, c2, d2);
        }
        if (this.e != null) {
            this.i.a(bArr, c2, d2);
        }
    }

    public void c() {
        f50.a(this.g);
        this.h.c();
        if (this.e != null) {
            this.i.d();
        }
        this.j = 0;
        this.k = false;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = jtVar.a(dVar.c(), 2);
        jx jxVar = this.e;
        if (jxVar != null) {
            jxVar.b(jtVar, dVar);
        }
    }

    public void f(long j2, int i2) {
        this.l = j2;
    }
}
