package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.github.mikephil.charting.utils.Utils;
import defpackage.fi;
import defpackage.mi;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: gi  reason: default package */
public final class gi {
    public static final h<com.bumptech.glide.load.b> f = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.DEFAULT);
    public static final h<j> g = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", j.SRGB);
    public static final h<Boolean> h = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    public static final h<Boolean> i = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
    private static final Set<String> j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    private static final b k = new a();
    private static final Set<ImageHeaderParser.ImageType> l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private static final Queue<BitmapFactory.Options> m = km.f(0);
    private final rf a;
    private final DisplayMetrics b;
    private final of c;
    private final List<ImageHeaderParser> d;
    private final li e = li.a();

    /* renamed from: gi$a */
    class a implements b {
        a() {
        }

        public void a(rf rfVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    /* renamed from: gi$b */
    public interface b {
        void a(rf rfVar, Bitmap bitmap);

        void b();
    }

    static {
        h<fi> hVar = fi.f;
    }

    public gi(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, rf rfVar, of ofVar) {
        this.d = list;
        jm.d(displayMetrics);
        this.b = displayMetrics;
        jm.d(rfVar);
        this.a = rfVar;
        jm.d(ofVar);
        this.c = ofVar;
    }

    private static int a(double d2) {
        int l2 = l(d2);
        int x = x(((double) l2) * d2);
        return x((d2 / ((double) (((float) x) / ((float) l2)))) * ((double) x));
    }

    private void b(mi miVar, com.bumptech.glide.load.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (!this.e.e(i2, i3, options, z, z2)) {
            if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = miVar.d().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable("Downsampler", 3)) {
                    "Cannot determine whether the image has alpha or not from header, format " + bVar;
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, mi miVar, b bVar, rf rfVar, fi fiVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ImageHeaderParser.ImageType imageType2 = imageType;
        fi fiVar2 = fiVar;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        BitmapFactory.Options options2 = options;
        if (i12 > 0 && i13 > 0) {
            if (r(i2)) {
                i7 = i12;
                i8 = i13;
            } else {
                i8 = i12;
                i7 = i13;
            }
            float b2 = fiVar2.b(i8, i7, i14, i15);
            if (b2 > Utils.FLOAT_EPSILON) {
                fi.e a2 = fiVar2.a(i8, i7, i14, i15);
                if (a2 != null) {
                    float f2 = (float) i8;
                    float f3 = (float) i7;
                    int x = i8 / x((double) (b2 * f2));
                    int x2 = i7 / x((double) (b2 * f3));
                    int max = a2 == fi.e.MEMORY ? Math.max(x, x2) : Math.min(x, x2);
                    String str = "x";
                    if (Build.VERSION.SDK_INT > 23 || !j.contains(options2.outMimeType)) {
                        i9 = Math.max(1, Integer.highestOneBit(max));
                        if (a2 == fi.e.MEMORY && ((float) i9) < 1.0f / b2) {
                            i9 <<= 1;
                        }
                    } else {
                        i9 = 1;
                    }
                    options2.inSampleSize = i9;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i9, 8);
                        i10 = (int) Math.ceil((double) (f2 / min));
                        i11 = (int) Math.ceil((double) (f3 / min));
                        int i16 = i9 / 8;
                        if (i16 > 0) {
                            i10 /= i16;
                            i11 /= i16;
                        }
                    } else {
                        if (!(imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A)) {
                            if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    float f4 = (float) i9;
                                    i10 = Math.round(f2 / f4);
                                    i11 = Math.round(f3 / f4);
                                }
                            } else if (i8 % i9 == 0 && i7 % i9 == 0) {
                                i10 = i8 / i9;
                                i11 = i7 / i9;
                            } else {
                                int[] m2 = m(miVar, options2, bVar, rfVar);
                                i10 = m2[0];
                                i11 = m2[1];
                            }
                        }
                        float f5 = (float) i9;
                        i10 = (int) Math.floor((double) (f2 / f5));
                        i11 = (int) Math.floor((double) (f3 / f5));
                    }
                    double b3 = (double) fiVar2.b(i10, i11, i14, i15);
                    if (Build.VERSION.SDK_INT >= 19) {
                        options2.inTargetDensity = a(b3);
                        options2.inDensity = l(b3);
                    }
                    if (s(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculate scaling, source: [");
                        sb.append(i3);
                        String str2 = str;
                        sb.append(str2);
                        sb.append(i4);
                        sb.append("], degreesToRotate: ");
                        sb.append(i2);
                        sb.append(", target: [");
                        sb.append(i14);
                        sb.append(str2);
                        sb.append(i15);
                        sb.append("], power of two scaled: [");
                        sb.append(i10);
                        sb.append(str2);
                        sb.append(i11);
                        sb.append("], exact scale factor: ");
                        sb.append(b2);
                        sb.append(", power of 2 sample size: ");
                        sb.append(i9);
                        sb.append(", adjusted scale factor: ");
                        sb.append(b3);
                        sb.append(", target density: ");
                        sb.append(options2.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options2.inDensity);
                        sb.toString();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + fiVar2 + ", source: [" + i12 + "x" + i13 + "], target: [" + i14 + "x" + i15 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            "Unable to determine dimensions for: " + imageType2 + " with target [" + i14 + "x" + i15 + "]";
        }
    }

    private Cif<Bitmap> e(mi miVar, int i2, int i3, i iVar, b bVar) {
        i iVar2 = iVar;
        byte[] bArr = (byte[]) this.c.e(65536, byte[].class);
        BitmapFactory.Options k2 = k();
        k2.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar2.c(f);
        j jVar = (j) iVar2.c(g);
        try {
            return yh.f(h(miVar, k2, (fi) iVar2.c(fi.f), bVar2, jVar, iVar2.c(i) != null && ((Boolean) iVar2.c(i)).booleanValue(), i2, i3, ((Boolean) iVar2.c(h)).booleanValue(), bVar), this.a);
        } finally {
            v(k2);
            this.c.d(bArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0169, code lost:
        if (r3 >= 26) goto L_0x016b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap h(defpackage.mi r28, android.graphics.BitmapFactory.Options r29, defpackage.fi r30, com.bumptech.glide.load.b r31, com.bumptech.glide.load.j r32, boolean r33, int r34, int r35, boolean r36, defpackage.gi.b r37) {
        /*
            r27 = this;
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r37
            long r20 = defpackage.fm.b()
            rf r0 = r8.a
            int[] r0 = m(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r3 = 1
            r2 = r0[r3]
            java.lang.String r1 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L_0x0024
            if (r2 != r0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r23 = r33
            goto L_0x0026
        L_0x0024:
            r23 = 0
        L_0x0026:
            int r0 = r28.a()
            int r14 = defpackage.ti.g(r0)
            boolean r24 = defpackage.ti.j(r0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r34
            if (r15 != r9) goto L_0x0046
            boolean r10 = r(r14)
            r13 = r35
            if (r10 == 0) goto L_0x0043
            r25 = r2
            goto L_0x004a
        L_0x0043:
            r25 = r4
            goto L_0x004a
        L_0x0046:
            r13 = r35
            r25 = r15
        L_0x004a:
            if (r13 != r9) goto L_0x0058
            boolean r9 = r(r14)
            if (r9 == 0) goto L_0x0055
            r26 = r4
            goto L_0x005a
        L_0x0055:
            r26 = r2
            goto L_0x005a
        L_0x0058:
            r26 = r13
        L_0x005a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = r28.d()
            rf r11 = r8.a
            r9 = r12
            r10 = r28
            r16 = r11
            r11 = r37
            r8 = r12
            r12 = r16
            r13 = r30
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r26
            r19 = r29
            c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            r0 = r27
            r11 = r1
            r1 = r28
            r10 = r2
            r2 = r31
            r9 = 1
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r29
            r14 = r6
            r6 = r25
            r7 = r26
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x009a
            r3 = 1
            goto L_0x009b
        L_0x009a:
            r3 = 0
        L_0x009b:
            int r0 = r14.inSampleSize
            r1 = 2
            java.lang.String r2 = "Downsampler"
            if (r0 == r9) goto L_0x00a9
            if (r3 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            r0 = r27
            goto L_0x014a
        L_0x00a9:
            r0 = r27
            r4 = r8
            boolean r4 = r0.z(r4)
            if (r4 == 0) goto L_0x014a
            if (r12 < 0) goto L_0x00c0
            if (r10 < 0) goto L_0x00c0
            if (r36 == 0) goto L_0x00c0
            if (r3 == 0) goto L_0x00c0
            r5 = r25
            r6 = r26
            goto L_0x0141
        L_0x00c0:
            boolean r3 = s(r29)
            if (r3 == 0) goto L_0x00ce
            int r3 = r14.inTargetDensity
            float r3 = (float) r3
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L_0x00d0
        L_0x00ce:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d0:
            int r4 = r14.inSampleSize
            float r5 = (float) r12
            float r6 = (float) r4
            float r5 = r5 / r6
            double r7 = (double) r5
            double r7 = java.lang.Math.ceil(r7)
            int r5 = (int) r7
            float r7 = (float) r10
            float r7 = r7 / r6
            double r6 = (double) r7
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r6 = r6 * r3
            int r6 = java.lang.Math.round(r6)
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L_0x0141
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Calculated target ["
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = "x"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r9 = "] for source ["
            r7.append(r9)
            r7.append(r12)
            r7.append(r8)
            r7.append(r10)
            java.lang.String r8 = "], sampleSize: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = ", targetDensity: "
            r7.append(r4)
            int r4 = r14.inTargetDensity
            r7.append(r4)
            java.lang.String r4 = ", density: "
            r7.append(r4)
            int r4 = r14.inDensity
            r7.append(r4)
            java.lang.String r4 = ", density multiplier: "
            r7.append(r4)
            r7.append(r3)
            r7.toString()
        L_0x0141:
            if (r5 <= 0) goto L_0x014a
            if (r6 <= 0) goto L_0x014a
            rf r3 = r0.a
            y(r14, r3, r5, r6)
        L_0x014a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x0167
            com.bumptech.glide.load.j r3 = com.bumptech.glide.load.j.DISPLAY_P3
            r4 = r32
            if (r4 != r3) goto L_0x0162
            android.graphics.ColorSpace r3 = r14.outColorSpace
            if (r3 == 0) goto L_0x0162
            boolean r3 = r3.isWideGamut()
            if (r3 == 0) goto L_0x0162
            r22 = 1
        L_0x0162:
            if (r22 == 0) goto L_0x016b
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x016d
        L_0x0167:
            r4 = 26
            if (r3 < r4) goto L_0x0173
        L_0x016b:
            android.graphics.ColorSpace$Named r3 = android.graphics.ColorSpace.Named.SRGB
        L_0x016d:
            android.graphics.ColorSpace r3 = android.graphics.ColorSpace.get(r3)
            r14.inPreferredColorSpace = r3
        L_0x0173:
            rf r3 = r0.a
            r4 = r28
            android.graphics.Bitmap r3 = i(r4, r14, r13, r3)
            rf r4 = r0.a
            r13.a(r4, r3)
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x0195
            r9 = r12
            r12 = r29
            r13 = r3
            r14 = r34
            r1 = r15
            r15 = r35
            r16 = r20
            t(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0196
        L_0x0195:
            r1 = r15
        L_0x0196:
            r2 = 0
            if (r3 == 0) goto L_0x01b1
            android.util.DisplayMetrics r2 = r0.b
            int r2 = r2.densityDpi
            r3.setDensity(r2)
            rf r2 = r0.a
            android.graphics.Bitmap r2 = defpackage.ti.k(r2, r3, r1)
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L_0x01b1
            rf r1 = r0.a
            r1.c(r3)
        L_0x01b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.h(mi, android.graphics.BitmapFactory$Options, fi, com.bumptech.glide.load.b, com.bumptech.glide.load.j, boolean, int, int, boolean, gi$b):android.graphics.Bitmap");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap i(defpackage.mi r4, android.graphics.BitmapFactory.Options r5, defpackage.gi.b r6, defpackage.rf r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.b()
            r4.c()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.ti.f()
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = defpackage.ti.f()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x004a
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ IOException -> 0x0049 }
            r7.c(r1)     // Catch:{ IOException -> 0x0049 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0049 }
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0049 }
            java.util.concurrent.locks.Lock r5 = defpackage.ti.f()
            r5.unlock()
            return r4
        L_0x0049:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x004b:
            java.util.concurrent.locks.Lock r5 = defpackage.ti.f()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.i(mi, android.graphics.BitmapFactory$Options, gi$b, rf):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (gi.class) {
            synchronized (m) {
                poll = m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] m(mi miVar, BitmapFactory.Options options, b bVar, rf rfVar) {
        options.inJustDecodeBounds = true;
        i(miVar, options, bVar, rfVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.s(android.graphics.BitmapFactory$Options):boolean");
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        "Decoded " + j(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + n(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + fm.a(j2);
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        synchronized (m) {
            m.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d2) {
        return (int) (d2 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, rf rfVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = rfVar.e(i2, i3, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return l.contains(imageType);
    }

    public Cif<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, i iVar) {
        return e(new mi.b(parcelFileDescriptor, this.d, this.c), i2, i3, iVar, k);
    }

    public Cif<Bitmap> f(InputStream inputStream, int i2, int i3, i iVar) {
        return g(inputStream, i2, i3, iVar, k);
    }

    public Cif<Bitmap> g(InputStream inputStream, int i2, int i3, i iVar, b bVar) {
        return e(new mi.a(inputStream, this.d, this.c), i2, i3, iVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return fe.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
