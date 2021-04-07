package defpackage;

import defpackage.yx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: uy  reason: default package */
public final class uy implements ay {
    public static final a b = ny.a;
    private final a a;

    /* renamed from: uy$a */
    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: uy$b */
    private static final class b {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final boolean b;
        /* access modifiers changed from: private */
        public final int c;

        public b(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public uy() {
        this((a) null);
    }

    public uy(a aVar) {
        this.a = aVar;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? v50.f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static oy d(i50 i50, int i, int i2) {
        int i3;
        String str;
        int z = i50.z();
        String t = t(z);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        i50.h(bArr, 0, i4);
        if (i2 == 2) {
            String valueOf = String.valueOf(v50.G0(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = w(bArr, 0);
            String G0 = v50.G0(new String(bArr, 0, i3, "ISO-8859-1"));
            if (G0.indexOf(47) == -1) {
                String valueOf2 = String.valueOf(G0);
                if (valueOf2.length() != 0) {
                    str = "image/".concat(valueOf2);
                } else {
                    G0 = new String("image/");
                }
            }
            str = G0;
        }
        int i5 = i3 + 2;
        int v = v(bArr, i5, z);
        return new oy(str, new String(bArr, i5, v - i5, t), bArr[i3 + 1] & 255, b(bArr, v + s(z), i4));
    }

    private static py e(i50 i50, int i, String str) {
        byte[] bArr = new byte[i];
        i50.h(bArr, 0, i);
        return new py(str, bArr);
    }

    private static qy f(i50 i50, int i, int i2, boolean z, int i3, a aVar) {
        i50 i502 = i50;
        int c = i50.c();
        int w = w(i502.a, c);
        String str = new String(i502.a, c, w - c, "ISO-8859-1");
        i50.M(w + 1);
        int k = i50.k();
        int k2 = i50.k();
        long B = i50.B();
        long j = B == 4294967295L ? -1 : B;
        long B2 = i50.B();
        long j2 = B2 == 4294967295L ? -1 : B2;
        ArrayList arrayList = new ArrayList();
        int i4 = c + i;
        while (i50.c() < i4) {
            vy i5 = i(i2, i50, z, i3, aVar);
            if (i5 != null) {
                arrayList.add(i5);
            }
        }
        vy[] vyVarArr = new vy[arrayList.size()];
        arrayList.toArray(vyVarArr);
        return new qy(str, k, k2, j, j2, vyVarArr);
    }

    private static ry g(i50 i50, int i, int i2, boolean z, int i3, a aVar) {
        i50 i502 = i50;
        int c = i50.c();
        int w = w(i502.a, c);
        String str = new String(i502.a, c, w - c, "ISO-8859-1");
        i50.M(w + 1);
        int z2 = i50.z();
        boolean z3 = (z2 & 2) != 0;
        boolean z4 = (z2 & 1) != 0;
        int z5 = i50.z();
        String[] strArr = new String[z5];
        for (int i4 = 0; i4 < z5; i4++) {
            int c2 = i50.c();
            int w2 = w(i502.a, c2);
            strArr[i4] = new String(i502.a, c2, w2 - c2, "ISO-8859-1");
            i50.M(w2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (i50.c() < i5) {
            vy i6 = i(i2, i50, z, i3, aVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        vy[] vyVarArr = new vy[arrayList.size()];
        arrayList.toArray(vyVarArr);
        return new ry(str, z3, z4, strArr, vyVarArr);
    }

    private static sy h(i50 i50, int i) {
        if (i < 4) {
            return null;
        }
        int z = i50.z();
        String t = t(z);
        byte[] bArr = new byte[3];
        i50.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        i50.h(bArr2, 0, i2);
        int v = v(bArr2, 0, z);
        String str2 = new String(bArr2, 0, v, t);
        int s = v + s(z);
        return new sy(str, str2, n(bArr2, s, v(bArr2, s, z), t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.vy i(int r19, defpackage.i50 r20, boolean r21, int r22, defpackage.uy.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.z()
            int r9 = r20.z()
            int r10 = r20.z()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.z()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.D()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.D()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.C()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.F()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.d()
            r7.M(r0)
            return r16
        L_0x0067:
            int r1 = r20.c()
            int r5 = r1 + r15
            int r1 = r20.d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            defpackage.b50.h(r4, r0)
            int r0 = r20.d()
            r7.M(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.M(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x022f
            if (r4 == 0) goto L_0x00f8
            goto L_0x022f
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.N(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.N(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = y(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            zy r1 = p(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            zy r1 = o(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x022b
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            az r1 = r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            az r1 = q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            yy r1 = m(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            ty r1 = j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            oy r1 = d(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            sy r1 = h(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            qy r1 = f(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            ry r1 = g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            xy r1 = l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            py r1 = e(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
        L_0x01f2:
            if (r1 != 0) goto L_0x021e
            java.lang.String r0 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            r3.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0222 }
            defpackage.b50.h(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0222 }
        L_0x021e:
            r7.M(r14)
            return r1
        L_0x0222:
            java.lang.String r0 = "Unsupported character encoding"
            defpackage.b50.h(r12, r0)     // Catch:{ all -> 0x012e }
            r7.M(r14)
            return r16
        L_0x022b:
            r7.M(r14)
            throw r0
        L_0x022f:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            defpackage.b50.h(r12, r0)
            r7.M(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.i(int, i50, boolean, int, uy$a):vy");
    }

    private static ty j(i50 i50, int i) {
        int z = i50.z();
        String t = t(z);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        i50.h(bArr, 0, i2);
        int w = w(bArr, 0);
        String str = new String(bArr, 0, w, "ISO-8859-1");
        int i3 = w + 1;
        int v = v(bArr, i3, z);
        String n = n(bArr, i3, v, t);
        int s = v + s(z);
        int v2 = v(bArr, s, z);
        return new ty(str, n, n(bArr, s, v2, t), b(bArr, v2 + s(z), i2));
    }

    private static b k(i50 i50) {
        String sb;
        if (i50.a() < 10) {
            sb = "Data too short to be an ID3 tag";
        } else {
            int C = i50.C();
            boolean z = false;
            if (C != 4801587) {
                String valueOf = String.valueOf(String.format("%06X", new Object[]{Integer.valueOf(C)}));
                b50.h("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
                return null;
            }
            int z2 = i50.z();
            i50.N(1);
            int z3 = i50.z();
            int y = i50.y();
            if (z2 == 2) {
                if ((z3 & 64) != 0) {
                    sb = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                }
            } else if (z2 == 3) {
                if ((z3 & 64) != 0) {
                    int k = i50.k();
                    i50.N(k);
                    y -= k + 4;
                }
            } else if (z2 == 4) {
                if ((z3 & 64) != 0) {
                    int y2 = i50.y();
                    i50.N(y2 - 4);
                    y -= y2;
                }
                if ((z3 & 16) != 0) {
                    y -= 10;
                }
            } else {
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                sb2.append(z2);
                sb = sb2.toString();
            }
            if (z2 < 4 && (z3 & 128) != 0) {
                z = true;
            }
            return new b(z2, z, y);
        }
        b50.h("Id3Decoder", sb);
        return null;
    }

    private static xy l(i50 i50, int i) {
        int F = i50.F();
        int C = i50.C();
        int C2 = i50.C();
        int z = i50.z();
        int z2 = i50.z();
        h50 h50 = new h50();
        h50.l(i50);
        int i2 = ((i - 10) * 8) / (z + z2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = h50.h(z);
            int h2 = h50.h(z2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new xy(F, C, C2, iArr, iArr2);
    }

    private static yy m(i50 i50, int i) {
        byte[] bArr = new byte[i];
        i50.h(bArr, 0, i);
        int w = w(bArr, 0);
        return new yy(new String(bArr, 0, w, "ISO-8859-1"), b(bArr, w + 1, i));
    }

    private static String n(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static zy o(i50 i50, int i, String str) {
        if (i < 1) {
            return null;
        }
        int z = i50.z();
        String t = t(z);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        i50.h(bArr, 0, i2);
        return new zy(str, (String) null, new String(bArr, 0, v(bArr, 0, z), t));
    }

    private static zy p(i50 i50, int i) {
        if (i < 1) {
            return null;
        }
        int z = i50.z();
        String t = t(z);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        i50.h(bArr, 0, i2);
        int v = v(bArr, 0, z);
        String str = new String(bArr, 0, v, t);
        int s = v + s(z);
        return new zy("TXXX", str, n(bArr, s, v(bArr, s, z), t));
    }

    private static az q(i50 i50, int i, String str) {
        byte[] bArr = new byte[i];
        i50.h(bArr, 0, i);
        return new az(str, (String) null, new String(bArr, 0, w(bArr, 0), "ISO-8859-1"));
    }

    private static az r(i50 i50, int i) {
        if (i < 1) {
            return null;
        }
        int z = i50.z();
        String t = t(z);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        i50.h(bArr, 0, i2);
        int v = v(bArr, 0, z);
        String str = new String(bArr, 0, v, t);
        int s = v + s(z);
        return new az("WXXX", str, n(bArr, s, w(bArr, s), "ISO-8859-1"));
    }

    private static int s(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String u(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static int v(byte[] bArr, int i, int i2) {
        int w = w(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return w;
        }
        while (w < bArr.length - 1) {
            if (w % 2 == 0 && bArr[w + 1] == 0) {
                return w;
            }
            w = w(bArr, w + 1);
        }
        return bArr.length;
    }

    private static int w(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    static /* synthetic */ boolean x(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static int y(i50 i50, int i) {
        byte[] bArr = i50.a;
        int c = i50.c();
        int i2 = c;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c + i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - (i2 - c)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean z(defpackage.i50 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.k()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.B()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.F()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.C()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.C()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.M(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.M(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.M(r2)
            return r6
        L_0x009b:
            int r3 = r18.a()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.M(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.N(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.M(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.M(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy.z(i50, int, int, boolean):boolean");
    }

    public yx a(cy cyVar) {
        ByteBuffer byteBuffer = cyVar.f;
        q40.e(byteBuffer);
        ByteBuffer byteBuffer2 = byteBuffer;
        return c(byteBuffer2.array(), byteBuffer2.limit());
    }

    public yx c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        i50 i50 = new i50(bArr, i);
        b k = k(i50);
        if (k == null) {
            return null;
        }
        int c = i50.c();
        int i2 = k.a == 2 ? 6 : 10;
        int b2 = k.c;
        if (k.b) {
            b2 = y(i50, k.c);
        }
        i50.L(c + b2);
        boolean z = false;
        if (!z(i50, k.a, i2, false)) {
            if (k.a != 4 || !z(i50, 4, i2, true)) {
                int a2 = k.a;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(a2);
                b50.h("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (i50.a() >= i2) {
            vy i3 = i(k.a, i50, z, i2, this.a);
            if (i3 != null) {
                arrayList.add(i3);
            }
        }
        return new yx((List<? extends yx.b>) arrayList);
    }
}
