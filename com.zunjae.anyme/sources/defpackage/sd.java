package defpackage;

import android.graphics.Bitmap;
import defpackage.od;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: sd  reason: default package */
public class sd implements od {
    private static final String u = "sd";
    private int[] a;
    private final int[] b;
    private final od.a c;
    private ByteBuffer d;
    private byte[] e;
    private short[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int[] j;
    private int k;
    private qd l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Boolean s;
    private Bitmap.Config t;

    public sd(od.a aVar) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = aVar;
        this.l = new qd();
    }

    public sd(od.a aVar, qd qdVar, ByteBuffer byteBuffer, int i2) {
        this(aVar);
        q(qdVar, byteBuffer, i2);
    }

    private int i(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.p + i2; i10++) {
            byte[] bArr = this.i;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.a[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.p + i12; i13++) {
            byte[] bArr2 = this.i;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.a[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private void j(pd pdVar) {
        Boolean bool;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        pd pdVar2 = pdVar;
        int[] iArr = this.j;
        int i7 = pdVar2.d;
        int i8 = this.p;
        int i9 = i7 / i8;
        int i10 = pdVar2.b / i8;
        int i11 = pdVar2.c / i8;
        int i12 = pdVar2.a / i8;
        boolean z = this.k == 0;
        int i13 = this.p;
        int i14 = this.r;
        int i15 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        Boolean bool2 = this.s;
        int i16 = 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (true) {
            bool = bool2;
            if (i17 >= i9) {
                break;
            }
            if (pdVar2.e) {
                if (i18 >= i9) {
                    i2 = i9;
                    int i20 = i19 + 1;
                    if (i20 == 2) {
                        i19 = i20;
                        i18 = 4;
                    } else if (i20 != 3) {
                        i19 = i20;
                        if (i20 == 4) {
                            i18 = 1;
                            i16 = 2;
                        }
                    } else {
                        i19 = i20;
                        i18 = 2;
                        i16 = 4;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i18 + i16;
            } else {
                i2 = i9;
                i3 = i18;
                i18 = i17;
            }
            int i21 = i18 + i10;
            boolean z2 = i13 == 1;
            if (i21 < i15) {
                int i22 = i21 * i14;
                int i23 = i22 + i12;
                int i24 = i23 + i11;
                int i25 = i22 + i14;
                if (i25 < i24) {
                    i24 = i25;
                }
                i4 = i3;
                int i26 = i17 * i13 * pdVar2.c;
                if (z2) {
                    int i27 = i23;
                    while (true) {
                        i6 = i10;
                        if (i27 >= i24) {
                            break;
                        }
                        int i28 = iArr2[bArr[i26] & 255];
                        if (i28 != 0) {
                            iArr[i27] = i28;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i26 += i13;
                        i27++;
                        i10 = i6;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i24 - i23) * i13) + i26;
                    int i30 = i23;
                    while (true) {
                        i5 = i11;
                        if (i30 >= i24) {
                            break;
                        }
                        int i31 = i(i26, i29, pdVar2.c);
                        if (i31 != 0) {
                            iArr[i30] = i31;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i26 += i13;
                        i30++;
                        i11 = i5;
                    }
                    bool2 = bool;
                    i17++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i18 = i4;
                }
            } else {
                i4 = i3;
                i6 = i10;
            }
            i5 = i11;
            bool2 = bool;
            i17++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i18 = i4;
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(pd pdVar) {
        pd pdVar2 = pdVar;
        int[] iArr = this.j;
        int i2 = pdVar2.d;
        int i3 = pdVar2.b;
        int i4 = pdVar2.c;
        int i5 = pdVar2.a;
        boolean z = this.k == 0;
        int i6 = this.r;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = pdVar2.c * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = i2;
                byte b4 = b3 & 255;
                if (b4 != b2) {
                    int i15 = iArr2[b4];
                    if (i15 != 0) {
                        iArr[i13] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                pd pdVar3 = pdVar;
                i2 = i14;
            }
            int i16 = i2;
            i7++;
            pdVar2 = pdVar;
        }
        Boolean bool = this.s;
        this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.s == null && z && b2 != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(defpackage.pd r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.d
            int r3 = r1.j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            qd r1 = r0.l
            int r2 = r1.f
            int r1 = r1.g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.c
            int r1 = r1.d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            od$a r1 = r0.c
            byte[] r1 = r1.e(r2)
            r0.i = r1
        L_0x002b:
            byte[] r1 = r0.i
            short[] r3 = r0.f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f = r3
        L_0x0037:
            short[] r3 = r0.f
            byte[] r5 = r0.g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.g = r5
        L_0x0041:
            byte[] r5 = r0.g
            byte[] r6 = r0.h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.h = r6
        L_0x004d:
            byte[] r6 = r0.h
            int r7 = r28.p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014c
            if (r16 != 0) goto L_0x0094
            int r16 = r28.o()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.o = r3
            goto L_0x014c
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014c:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.l(pd):void");
    }

    private Bitmap n() {
        Boolean bool = this.s;
        Bitmap a2 = this.c.a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        a2.setHasAlpha(true);
        return a2;
    }

    private int o() {
        int p2 = p();
        if (p2 <= 0) {
            return p2;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(p2, byteBuffer.remaining()));
        return p2;
    }

    private int p() {
        return this.d.get() & 255;
    }

    private Bitmap r(pd pdVar, pd pdVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.j;
        int i4 = 0;
        if (pdVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.c.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (pdVar2 != null && pdVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (pdVar2 != null && (i3 = pdVar2.g) > 0) {
            if (i3 == 2) {
                if (!pdVar.f) {
                    qd qdVar = this.l;
                    int i5 = qdVar.l;
                    if (pdVar.k == null || qdVar.j != pdVar.h) {
                        i4 = i5;
                    }
                }
                int i6 = pdVar2.d;
                int i7 = this.p;
                int i8 = i6 / i7;
                int i9 = pdVar2.b / i7;
                int i10 = pdVar2.c / i7;
                int i11 = pdVar2.a / i7;
                int i12 = this.r;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.r;
                }
            } else if (i3 == 3 && (bitmap = this.m) != null) {
                int i17 = this.r;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.q);
            }
        }
        l(pdVar);
        if (pdVar.e || this.p != 1) {
            j(pdVar);
        } else {
            k(pdVar);
        }
        if (this.n && ((i2 = pdVar.g) == 0 || i2 == 1)) {
            if (this.m == null) {
                this.m = n();
            }
            Bitmap bitmap3 = this.m;
            int i18 = this.r;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.q);
        }
        Bitmap n2 = n();
        int i19 = this.r;
        n2.setPixels(iArr, 0, i19, 0, 0, i19, this.q);
        return n2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap a() {
        /*
            r8 = this;
            monitor-enter(r8)
            qd r0 = r8.l     // Catch:{ all -> 0x00dc }
            int r0 = r0.c     // Catch:{ all -> 0x00dc }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.k     // Catch:{ all -> 0x00dc }
            if (r0 >= 0) goto L_0x0035
        L_0x000d:
            java.lang.String r0 = u     // Catch:{ all -> 0x00dc }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00dc }
            qd r3 = r8.l     // Catch:{ all -> 0x00dc }
            int r3 = r3.c     // Catch:{ all -> 0x00dc }
            r0.append(r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00dc }
            int r3 = r8.k     // Catch:{ all -> 0x00dc }
            r0.append(r3)     // Catch:{ all -> 0x00dc }
            r0.toString()     // Catch:{ all -> 0x00dc }
        L_0x0033:
            r8.o = r2     // Catch:{ all -> 0x00dc }
        L_0x0035:
            int r0 = r8.o     // Catch:{ all -> 0x00dc }
            r3 = 0
            if (r0 == r2) goto L_0x00c0
            int r0 = r8.o     // Catch:{ all -> 0x00dc }
            r4 = 2
            if (r0 != r4) goto L_0x0041
            goto L_0x00c0
        L_0x0041:
            r0 = 0
            r8.o = r0     // Catch:{ all -> 0x00dc }
            byte[] r5 = r8.e     // Catch:{ all -> 0x00dc }
            if (r5 != 0) goto L_0x0052
            od$a r5 = r8.c     // Catch:{ all -> 0x00dc }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.e(r6)     // Catch:{ all -> 0x00dc }
            r8.e = r5     // Catch:{ all -> 0x00dc }
        L_0x0052:
            qd r5 = r8.l     // Catch:{ all -> 0x00dc }
            java.util.List<pd> r5 = r5.e     // Catch:{ all -> 0x00dc }
            int r6 = r8.k     // Catch:{ all -> 0x00dc }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00dc }
            pd r5 = (defpackage.pd) r5     // Catch:{ all -> 0x00dc }
            int r6 = r8.k     // Catch:{ all -> 0x00dc }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x006e
            qd r7 = r8.l     // Catch:{ all -> 0x00dc }
            java.util.List<pd> r7 = r7.e     // Catch:{ all -> 0x00dc }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00dc }
            pd r6 = (defpackage.pd) r6     // Catch:{ all -> 0x00dc }
            goto L_0x006f
        L_0x006e:
            r6 = r3
        L_0x006f:
            int[] r7 = r5.k     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0076
            int[] r7 = r5.k     // Catch:{ all -> 0x00dc }
            goto L_0x007a
        L_0x0076:
            qd r7 = r8.l     // Catch:{ all -> 0x00dc }
            int[] r7 = r7.a     // Catch:{ all -> 0x00dc }
        L_0x007a:
            r8.a = r7     // Catch:{ all -> 0x00dc }
            if (r7 != 0) goto L_0x009c
            java.lang.String r0 = u     // Catch:{ all -> 0x00dc }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0098
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00dc }
            int r1 = r8.k     // Catch:{ all -> 0x00dc }
            r0.append(r1)     // Catch:{ all -> 0x00dc }
            r0.toString()     // Catch:{ all -> 0x00dc }
        L_0x0098:
            r8.o = r2     // Catch:{ all -> 0x00dc }
            monitor-exit(r8)
            return r3
        L_0x009c:
            boolean r1 = r5.f     // Catch:{ all -> 0x00dc }
            if (r1 == 0) goto L_0x00ba
            int[] r1 = r8.b     // Catch:{ all -> 0x00dc }
            int r2 = r7.length     // Catch:{ all -> 0x00dc }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00dc }
            int[] r1 = r8.b     // Catch:{ all -> 0x00dc }
            r8.a = r1     // Catch:{ all -> 0x00dc }
            int r2 = r5.h     // Catch:{ all -> 0x00dc }
            r1[r2] = r0     // Catch:{ all -> 0x00dc }
            int r0 = r5.g     // Catch:{ all -> 0x00dc }
            if (r0 != r4) goto L_0x00ba
            int r0 = r8.k     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00ba
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00dc }
            r8.s = r0     // Catch:{ all -> 0x00dc }
        L_0x00ba:
            android.graphics.Bitmap r0 = r8.r(r5, r6)     // Catch:{ all -> 0x00dc }
            monitor-exit(r8)
            return r0
        L_0x00c0:
            java.lang.String r0 = u     // Catch:{ all -> 0x00dc }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00dc }
            int r1 = r8.o     // Catch:{ all -> 0x00dc }
            r0.append(r1)     // Catch:{ all -> 0x00dc }
            r0.toString()     // Catch:{ all -> 0x00dc }
        L_0x00da:
            monitor-exit(r8)
            return r3
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd.a():android.graphics.Bitmap");
    }

    public void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    public int c() {
        return this.l.c;
    }

    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.c.d(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            this.c.f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.c.c(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.d(bArr2);
        }
    }

    public int d() {
        int i2;
        if (this.l.c <= 0 || (i2 = this.k) < 0) {
            return 0;
        }
        return m(i2);
    }

    public void e(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public void f() {
        this.k = -1;
    }

    public int g() {
        return this.k;
    }

    public ByteBuffer getData() {
        return this.d;
    }

    public int h() {
        return this.d.limit() + this.i.length + (this.j.length * 4);
    }

    public int m(int i2) {
        if (i2 >= 0) {
            qd qdVar = this.l;
            if (i2 < qdVar.c) {
                return qdVar.e.get(i2).i;
            }
        }
        return -1;
    }

    public synchronized void q(qd qdVar, ByteBuffer byteBuffer, int i2) {
        if (i2 > 0) {
            int highestOneBit = Integer.highestOneBit(i2);
            this.o = 0;
            this.l = qdVar;
            this.k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator<pd> it = qdVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().g == 3) {
                        this.n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.p = highestOneBit;
            this.r = qdVar.f / highestOneBit;
            this.q = qdVar.g / highestOneBit;
            this.i = this.c.e(qdVar.f * qdVar.g);
            this.j = this.c.b(this.r * this.q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
    }
}
