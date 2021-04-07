package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a30  reason: default package */
final class a30 {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c = new Canvas();
    private final b d = new b(719, 575, 0, 719, 0, 575);
    private final a e = new a(0, c(), d(), e());
    private final h f;
    private Bitmap g;

    /* renamed from: a30$a */
    private static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: a30$b */
    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* renamed from: a30$c */
    private static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* renamed from: a30$d */
    private static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i2;
            this.b = i3;
            this.c = sparseArray;
        }
    }

    /* renamed from: a30$e */
    private static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: a30$f */
    private static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.a = i2;
            this.b = z;
            this.c = i3;
            this.d = i4;
            this.e = i6;
            this.f = i7;
            this.g = i8;
            this.h = i9;
            this.i = i10;
            this.j = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.j;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.j.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    /* renamed from: a30$g */
    private static final class g {
        public final int a;
        public final int b;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i3;
            this.b = i4;
        }
    }

    /* renamed from: a30$h */
    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public a30(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.a.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.b.setPathEffect((PathEffect) null);
        this.f = new h(i2, i3);
    }

    private static byte[] a(int i2, int i3, h50 h50) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) h50.h(i3);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = f(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = 255;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = f(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = f(255, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = f(255, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = f(255, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = f(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    private static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:1:0x0009->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(defpackage.h50 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0059
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0059
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0052
            if (r4 == r3) goto L_0x004a
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0059
        L_0x0041:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0052:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0059
        L_0x0056:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0059:
            if (r12 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            if (r15 == 0) goto L_0x0061
            byte r4 = r15[r4]
        L_0x0061:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0077:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007b
            return r10
        L_0x007b:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.g(h50, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[LOOP:0: B:1:0x0009->B:34:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(defpackage.h50 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x0065
        L_0x0015:
            boolean r4 = r13.g()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.h(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x0065
        L_0x0028:
            r4 = 0
            r11 = 1
            goto L_0x004c
        L_0x002b:
            boolean r4 = r13.g()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.h(r5)
            int r5 = r4 + 4
        L_0x0037:
            int r4 = r13.h(r3)
            r11 = r2
            r12 = r5
            goto L_0x0065
        L_0x003e:
            int r4 = r13.h(r5)
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x0057
            if (r4 == r7) goto L_0x004e
            r11 = r2
            r4 = 0
        L_0x004c:
            r12 = 0
            goto L_0x0065
        L_0x004e:
            r4 = 8
            int r4 = r13.h(r4)
            int r5 = r4 + 25
            goto L_0x0037
        L_0x0057:
            int r4 = r13.h(r3)
            int r5 = r4 + 9
            goto L_0x0037
        L_0x005e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0065
        L_0x0062:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x0065:
            if (r12 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x006d
            byte r4 = r15[r4]
        L_0x006d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0081:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.h(h50, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int i(defpackage.h50 r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.i(h50, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i5 = i2;
        byte[] bArr5 = bArr;
        h50 h50 = new h50(bArr);
        int i6 = i3;
        int i7 = i4;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (h50.b() != 0) {
            int h2 = h50.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                                i6 = g(h50, iArr, bArr2, i6, i7, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr8 == null ? h : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? i : bArr6;
                        }
                        bArr2 = bArr3;
                        i6 = g(h50, iArr, bArr2, i6, i7, paint, canvas);
                    case 17:
                        if (i5 == 3) {
                            bArr4 = bArr7 == null ? j : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i6 = h(h50, iArr, bArr4, i6, i7, paint, canvas);
                        break;
                    case 18:
                        i6 = i(h50, iArr, (byte[]) null, i6, i7, paint, canvas);
                        continue;
                    default:
                        switch (h2) {
                            case 32:
                                bArr8 = a(4, 4, h50);
                                break;
                            case 33:
                                bArr6 = a(4, 8, h50);
                                break;
                            case 34:
                                bArr7 = a(16, 8, h50);
                                break;
                            default:
                                continue;
                        }
                }
                h50.c();
            } else {
                i7 += 2;
                i6 = i3;
            }
        }
    }

    private static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.d : i2 == 2 ? aVar.c : aVar.b;
        int i5 = i2;
        int i6 = i3;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        j(cVar.c, iArr, i5, i6, i4, paint2, canvas2);
        j(cVar.d, iArr, i5, i6, i4 + 1, paint2, canvas2);
    }

    private static a l(h50 h50, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        h50 h502 = h50;
        int i8 = 8;
        int h2 = h502.h(8);
        h502.q(8);
        int i9 = 2;
        int i10 = i2 - 2;
        int[] c2 = c();
        int[] d2 = d();
        int[] e2 = e();
        while (i10 > 0) {
            int h3 = h502.h(i8);
            int h4 = h502.h(i8);
            int i11 = i10 - 2;
            int[] iArr = (h4 & 128) != 0 ? c2 : (h4 & 64) != 0 ? d2 : e2;
            if ((h4 & 1) != 0) {
                i6 = h502.h(i8);
                i5 = h502.h(i8);
                i4 = h502.h(i8);
                i3 = h502.h(i8);
                i7 = i11 - 4;
            } else {
                i4 = h502.h(4) << 4;
                i7 = i11 - 2;
                int h5 = h502.h(4) << 4;
                i3 = h502.h(i9) << 6;
                i6 = h502.h(6) << i9;
                i5 = h5;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = 255;
            }
            double d3 = (double) i6;
            double d4 = (double) (i5 - 128);
            double d5 = (double) (i4 - 128);
            iArr[h3] = f((byte) (255 - (i3 & 255)), v50.o((int) (d3 + (1.402d * d4)), 0, 255), v50.o((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), v50.o((int) (d3 + (d5 * 1.772d)), 0, 255));
            i10 = i7;
            h2 = h2;
            i8 = 8;
            i9 = 2;
        }
        return new a(h2, c2, d2, e2);
    }

    private static b m(h50 h50) {
        int i2;
        int i3;
        int i4;
        int i5;
        h50.q(4);
        boolean g2 = h50.g();
        h50.q(3);
        int h2 = h50.h(16);
        int h3 = h50.h(16);
        if (g2) {
            int h4 = h50.h(16);
            int h5 = h50.h(16);
            int h6 = h50.h(16);
            i2 = h50.h(16);
            i4 = h5;
            i3 = h6;
            i5 = h4;
        } else {
            i4 = h2;
            i2 = h3;
            i5 = 0;
            i3 = 0;
        }
        return new b(h2, h3, i5, i4, i3, i2);
    }

    private static c n(h50 h50) {
        byte[] bArr;
        int h2 = h50.h(16);
        h50.q(4);
        int h3 = h50.h(2);
        boolean g2 = h50.g();
        h50.q(1);
        byte[] bArr2 = null;
        if (h3 == 1) {
            h50.q(h50.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = h50.h(16);
            int h5 = h50.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                h50.k(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                h50.k(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    private static d o(h50 h50, int i2) {
        int h2 = h50.h(8);
        int h3 = h50.h(4);
        int h4 = h50.h(2);
        h50.q(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = h50.h(8);
            h50.q(8);
            i3 -= 6;
            sparseArray.put(h5, new e(h50.h(16), h50.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    private static f p(h50 h50, int i2) {
        int i3;
        int i4;
        h50 h502 = h50;
        int h2 = h502.h(8);
        h502.q(4);
        boolean g2 = h50.g();
        h502.q(3);
        int i5 = 16;
        int h3 = h502.h(16);
        int h4 = h502.h(16);
        int h5 = h502.h(3);
        int h6 = h502.h(3);
        int i6 = 2;
        h502.q(2);
        int h7 = h502.h(8);
        int h8 = h502.h(8);
        int h9 = h502.h(4);
        int h10 = h502.h(2);
        h502.q(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int h11 = h502.h(i5);
            int h12 = h502.h(i6);
            int h13 = h502.h(i6);
            int h14 = h502.h(12);
            int i8 = h10;
            h502.q(4);
            int h15 = h502.h(12);
            i7 -= 6;
            if (h12 == 1 || h12 == 2) {
                i7 -= 2;
                i4 = h502.h(8);
                i3 = h502.h(8);
            } else {
                i4 = 0;
                i3 = 0;
            }
            sparseArray.put(h11, new g(h12, h13, h14, h15, i4, i3));
            h10 = i8;
            i6 = 2;
            i5 = 16;
        }
        return new f(h2, g2, h3, h4, h5, h6, h7, h8, h9, h10, sparseArray);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void q(defpackage.h50 r6, defpackage.a30.h r7) {
        /*
            r0 = 8
            int r0 = r6.h(r0)
            r1 = 16
            int r2 = r6.h(r1)
            int r1 = r6.h(r1)
            int r3 = r6.d()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.b()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            defpackage.b50.h(r7, r0)
            int r7 = r6.b()
            r6.q(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0097;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00c1
        L_0x0031:
            int r0 = r7.a
            if (r2 != r0) goto L_0x00c1
            a30$b r0 = m(r6)
            r7.h = r0
            goto L_0x00c1
        L_0x003d:
            int r0 = r7.a
            if (r2 != r0) goto L_0x004a
            a30$c r0 = n(r6)
            android.util.SparseArray<a30$c> r7 = r7.e
        L_0x0047:
            int r1 = r0.a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.b
            if (r2 != r0) goto L_0x00c1
            a30$c r0 = n(r6)
            android.util.SparseArray<a30$c> r7 = r7.g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.a
            if (r2 != r0) goto L_0x0065
            a30$a r0 = l(r6, r1)
            android.util.SparseArray<a30$a> r7 = r7.d
        L_0x005f:
            int r1 = r0.a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00c1
        L_0x0065:
            int r0 = r7.b
            if (r2 != r0) goto L_0x00c1
            a30$a r0 = l(r6, r1)
            android.util.SparseArray<a30$a> r7 = r7.f
            goto L_0x005f
        L_0x0070:
            a30$d r0 = r7.i
            int r4 = r7.a
            if (r2 != r4) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            a30$f r1 = p(r6, r1)
            int r0 = r0.b
            if (r0 != 0) goto L_0x008f
            android.util.SparseArray<a30$f> r0 = r7.c
            int r2 = r1.a
            java.lang.Object r0 = r0.get(r2)
            a30$f r0 = (defpackage.a30.f) r0
            if (r0 == 0) goto L_0x008f
            r1.a(r0)
        L_0x008f:
            android.util.SparseArray<a30$f> r7 = r7.c
            int r0 = r1.a
            r7.put(r0, r1)
            goto L_0x00c1
        L_0x0097:
            int r0 = r7.a
            if (r2 != r0) goto L_0x00c1
            a30$d r0 = r7.i
            a30$d r1 = o(r6, r1)
            int r2 = r1.b
            if (r2 == 0) goto L_0x00b7
            r7.i = r1
            android.util.SparseArray<a30$f> r0 = r7.c
            r0.clear()
            android.util.SparseArray<a30$a> r0 = r7.d
            r0.clear()
            android.util.SparseArray<a30$c> r7 = r7.e
            r7.clear()
            goto L_0x00c1
        L_0x00b7:
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.a
            int r2 = r1.a
            if (r0 == r2) goto L_0x00c1
            r7.i = r1
        L_0x00c1:
            int r7 = r6.d()
            int r3 = r3 - r7
            r6.r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.q(h50, a30$h):void");
    }

    public List<h20> b(byte[] bArr, int i2) {
        int i3;
        SparseArray<g> sparseArray;
        h50 h50 = new h50(bArr, i2);
        while (h50.b() >= 48 && h50.h(8) == 15) {
            q(h50, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (!(bitmap != null && bVar.a + 1 == bitmap.getWidth() && bVar.b + 1 == this.g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.c;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.c.save();
            e valueAt = sparseArray2.valueAt(i4);
            f fVar = this.f.c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.a + bVar.c;
            int i6 = valueAt.b + bVar.e;
            this.c.clipRect(i5, i6, Math.min(fVar.c + i5, bVar.d), Math.min(fVar.d + i6, bVar.f));
            a aVar = this.f.d.get(fVar.f);
            if (aVar == null && (aVar = this.f.f.get(fVar.f)) == null) {
                aVar = this.e;
            }
            SparseArray<g> sparseArray3 = fVar.j;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                g valueAt2 = sparseArray3.valueAt(i7);
                c cVar = this.f.e.get(keyAt);
                c cVar2 = cVar == null ? this.f.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.e, valueAt2.a + i5, i6 + valueAt2.b, cVar2.b ? null : this.a, this.c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i8 = fVar.e;
                this.b.setColor(i8 == 3 ? aVar.d[fVar.g] : i8 == 2 ? aVar.c[fVar.h] : aVar.b[fVar.i]);
                this.c.drawRect((float) i5, (float) i6, (float) (fVar.c + i5), (float) (fVar.d + i6), this.b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.g, i5, i6, fVar.c, fVar.d);
            int i9 = bVar.a;
            float f2 = ((float) i5) / ((float) i9);
            int i10 = bVar.b;
            arrayList.add(new h20(createBitmap2, f2, 0, ((float) i6) / ((float) i10), 0, ((float) fVar.c) / ((float) i9), ((float) fVar.d) / ((float) i10)));
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f.a();
    }
}
