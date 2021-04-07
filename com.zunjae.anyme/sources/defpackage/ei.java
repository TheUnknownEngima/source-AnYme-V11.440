package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: ei  reason: default package */
public final class ei implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: ei$a */
    private static final class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public long e(long j) {
            int min = (int) Math.min((long) this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        public int f() {
            return (h() << 8) | h();
        }

        public int g(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        public short h() {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }
    }

    /* renamed from: ei$b */
    private static final class b {
        private final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        public short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return this.a.remaining();
        }

        /* access modifiers changed from: package-private */
        public void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* renamed from: ei$c */
    private interface c {

        /* renamed from: ei$c$a */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long e(long j);

        int f();

        int g(byte[] bArr, int i);

        short h();
    }

    /* renamed from: ei$d */
    private static final class d implements c {
        private final InputStream a;

        d(InputStream inputStream) {
            this.a = inputStream;
        }

        public long e(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        public int f() {
            return (h() << 8) | h();
        }

        public int g(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new c.a();
        }

        public short h() {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }
    }

    private static int d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private int e(c cVar, of ofVar) {
        byte[] bArr;
        try {
            int f = cVar.f();
            if (!g(f)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    "Parser doesn't handle magic number: " + f;
                }
                return -1;
            }
            int i = i(cVar);
            if (i == -1) {
                boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            bArr = (byte[]) ofVar.e(i, byte[].class);
            int k = k(cVar, bArr, i);
            ofVar.d(bArr);
            return k;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            ofVar.d(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType f(defpackage.ei.c r6) {
        /*
            r5 = this;
            int r0 = r6.f()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.h()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.h()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.e(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.h()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.e(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.f()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.f()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.f()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.f()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.e(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.h()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.e(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.h()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei.f(ei$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    private static boolean g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    private boolean h(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private int i(c cVar) {
        short h;
        int f;
        long j;
        long e;
        do {
            short h2 = cVar.h();
            if (h2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    "Unknown segmentId=" + h2;
                }
                return -1;
            }
            h = cVar.h();
            if (h == 218) {
                return -1;
            }
            if (h == 217) {
                boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            f = cVar.f() - 2;
            if (h == 225) {
                return f;
            }
            j = (long) f;
            e = cVar.e(j);
        } while (e == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            "Unable to skip enough data, type: " + h + ", wanted to skip: " + f + ", but actually skipped: " + e;
        }
        return -1;
    }

    private static int j(b bVar) {
        ByteOrder byteOrder;
        StringBuilder sb;
        String str;
        short a2 = bVar.a(6);
        if (a2 != 18761) {
            if (a2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                "Unknown endianness = " + a2;
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i = 0; i < a3; i++) {
            int d2 = d(b2, i);
            short a4 = bVar.a(d2);
            if (a4 == 274) {
                short a5 = bVar.a(d2 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b3 = bVar.b(d2 + 4);
                    if (b3 < 0) {
                        boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            "Got tagIndex=" + i + " tagType=" + a4 + " formatCode=" + a5 + " componentCount=" + b3;
                        }
                        int i2 = b3 + b[a5];
                        if (i2 <= 4) {
                            int i3 = d2 + 8;
                            if (i3 < 0 || i3 > bVar.d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    "Illegal tagValueOffset=" + i3 + " tagType=" + a4;
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.d()) {
                                return bVar.a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    sb = new StringBuilder();
                                    sb.append("Illegal number of bytes for TI tag data tagType=");
                                    sb.append(a4);
                                    sb.toString();
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            sb = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    sb = new StringBuilder();
                    str = "Got invalid format code = ";
                }
                sb.append(str);
                sb.append(a5);
                sb.toString();
            }
        }
        return -1;
    }

    private int k(c cVar, byte[] bArr, int i) {
        int g = cVar.g(bArr, i);
        if (g != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                "Unable to read exif segment data, length: " + i + ", actually read: " + g;
            }
            return -1;
        } else if (h(bArr, i)) {
            return j(new b(bArr, i));
        } else {
            boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        jm.d(byteBuffer);
        return f(new a(byteBuffer));
    }

    public ImageHeaderParser.ImageType b(InputStream inputStream) {
        jm.d(inputStream);
        return f(new d(inputStream));
    }

    public int c(InputStream inputStream, of ofVar) {
        jm.d(inputStream);
        d dVar = new d(inputStream);
        jm.d(ofVar);
        return e(dVar, ofVar);
    }
}
