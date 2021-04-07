package defpackage;

import com.google.android.exoplayer2.f0;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: zq  reason: default package */
public final class zq {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: zq$b */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private b(String str, int i, int i2, int i3, int i4, int i5) {
            this.a = str;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    private static int b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static f0 c(i50 i50, String str, String str2, ns nsVar) {
        int i = b[(i50.z() & 192) >> 6];
        int z = i50.z();
        int i2 = d[(z & 56) >> 3];
        if ((z & 4) != 0) {
            i2++;
        }
        return f0.p(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, nsVar, 0, str2);
    }

    public static int d(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return a[i] * 256;
    }

    public static b e(h50 h50) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        h50 h502 = h50;
        int e2 = h50.e();
        h502.q(40);
        boolean z = h502.h(5) > 10;
        h502.o(e2);
        int i12 = -1;
        if (z) {
            h502.q(16);
            int h = h502.h(2);
            if (h == 0) {
                i12 = 0;
            } else if (h == 1) {
                i12 = 1;
            } else if (h == 2) {
                i12 = 2;
            }
            h502.q(3);
            int h2 = (h502.h(11) + 1) * 2;
            int h3 = h502.h(2);
            if (h3 == 3) {
                i6 = c[h502.h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = h502.h(2);
                i7 = a[i8];
                i6 = b[h3];
            }
            int i13 = i7 * 256;
            int h4 = h502.h(3);
            boolean g = h50.g();
            int i14 = d[h4] + (g ? 1 : 0);
            h502.q(10);
            if (h50.g()) {
                h502.q(8);
            }
            if (h4 == 0) {
                h502.q(5);
                if (h50.g()) {
                    h502.q(8);
                }
            }
            if (i12 == 1 && h50.g()) {
                h502.q(16);
            }
            if (h50.g()) {
                if (h4 > 2) {
                    h502.q(2);
                }
                if ((h4 & 1) == 0 || h4 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    h502.q(6);
                }
                if ((h4 & 4) != 0) {
                    h502.q(i10);
                }
                if (g && h50.g()) {
                    h502.q(5);
                }
                if (i12 == 0) {
                    if (h50.g()) {
                        i11 = 6;
                        h502.q(6);
                    } else {
                        i11 = 6;
                    }
                    if (h4 == 0 && h50.g()) {
                        h502.q(i11);
                    }
                    if (h50.g()) {
                        h502.q(i11);
                    }
                    int h5 = h502.h(2);
                    if (h5 == 1) {
                        h502.q(5);
                    } else if (h5 == 2) {
                        h502.q(12);
                    } else if (h5 == 3) {
                        int h6 = h502.h(5);
                        if (h50.g()) {
                            h502.q(5);
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                h502.q(4);
                            }
                            if (h50.g()) {
                                if (h50.g()) {
                                    h502.q(4);
                                }
                                if (h50.g()) {
                                    h502.q(4);
                                }
                            }
                        }
                        if (h50.g()) {
                            h502.q(5);
                            if (h50.g()) {
                                h502.q(7);
                                if (h50.g()) {
                                    h502.q(8);
                                }
                            }
                        }
                        h502.q((h6 + 2) * 8);
                        h50.c();
                    }
                    if (h4 < 2) {
                        if (h50.g()) {
                            h502.q(14);
                        }
                        if (h4 == 0 && h50.g()) {
                            h502.q(14);
                        }
                    }
                    if (h50.g()) {
                        if (i8 == 0) {
                            h502.q(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (h50.g()) {
                                    h502.q(5);
                                }
                            }
                        }
                    }
                }
            }
            if (h50.g()) {
                h502.q(5);
                if (h4 == 2) {
                    h502.q(4);
                }
                if (h4 >= 6) {
                    h502.q(2);
                }
                if (h50.g()) {
                    h502.q(8);
                }
                if (h4 == 0 && h50.g()) {
                    h502.q(8);
                }
                if (h3 < 3) {
                    h50.p();
                }
            }
            if (i12 == 0 && i8 != 3) {
                h50.p();
            }
            if (i12 != 2 || (i8 != 3 && !h50.g())) {
                i9 = 6;
            } else {
                i9 = 6;
                h502.q(6);
            }
            str = (h50.g() && h502.h(i9) == 1 && h502.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = h2;
            i3 = i6;
            i4 = i14;
        } else {
            h502.q(32);
            int h7 = h502.h(2);
            String str2 = h7 == 3 ? null : "audio/ac3";
            int b2 = b(h7, h502.h(6));
            h502.q(8);
            int h8 = h502.h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                h502.q(2);
            }
            if ((h8 & 4) != 0) {
                h502.q(2);
            }
            if (h8 == 2) {
                h502.q(2);
            }
            int[] iArr = b;
            str = str2;
            i2 = b2;
            i3 = h7 < iArr.length ? iArr[h7] : -1;
            i4 = d[h8] + (h50.g() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new b(str, i5, i4, i3, i2, i);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static f0 g(i50 i50, String str, String str2, ns nsVar) {
        i50 i502 = i50;
        i50.N(2);
        int i = b[(i50.z() & 192) >> 6];
        int z = i50.z();
        int i2 = d[(z & 14) >> 1];
        if ((z & 1) != 0) {
            i2++;
        }
        if (((i50.z() & 30) >> 1) > 0 && (2 & i50.z()) != 0) {
            i2 += 2;
        }
        return f0.p(str, (i50.a() <= 0 || (i50.z() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, (List<byte[]>) null, nsVar, 0, str2);
    }

    public static int h(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }
}
