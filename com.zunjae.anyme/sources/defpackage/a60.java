package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: a60  reason: default package */
public final class a60 {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    /* renamed from: a60$a */
    public static final class a {
        private final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }

        public b a(int i) {
            return this.a[i];
        }

        public int b() {
            return this.a.length;
        }
    }

    /* renamed from: a60$b */
    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.a = i;
            q40.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public a60(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public a60(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }

    public static a60 a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        float[] fArr;
        int i5;
        int i6;
        int i7;
        float f5 = f;
        int i8 = i;
        int i9 = i2;
        float f6 = f2;
        float f7 = f3;
        q40.a(f5 > Utils.FLOAT_EPSILON);
        q40.a(i8 >= 1);
        q40.a(i9 >= 1);
        q40.a(f6 > Utils.FLOAT_EPSILON && f6 <= 180.0f);
        q40.a(f7 > Utils.FLOAT_EPSILON && f7 <= 360.0f);
        float radians = (float) Math.toRadians((double) f6);
        float radians2 = (float) Math.toRadians((double) f7);
        float f8 = radians / ((float) i8);
        float f9 = radians2 / ((float) i9);
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[(i11 * 3)];
        float[] fArr3 = new float[(i11 * 2)];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f10 = radians / 2.0f;
            float f11 = (((float) i12) * f8) - f10;
            int i15 = i12 + 1;
            float f12 = (((float) i15) * f8) - f10;
            int i16 = 0;
            while (i16 < i10) {
                float f13 = f11;
                int i17 = i15;
                int i18 = 0;
                while (i18 < 2) {
                    if (i18 == 0) {
                        f4 = f13;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f12;
                    }
                    float f14 = ((float) i16) * f9;
                    float f15 = f9;
                    int i19 = i13 + 1;
                    int i20 = i16;
                    double d2 = (double) f5;
                    float f16 = f8;
                    int i21 = i18;
                    double d3 = (double) ((f14 + 3.1415927f) - (radians2 / 2.0f));
                    double d4 = (double) f4;
                    float[] fArr4 = fArr3;
                    float f17 = f12;
                    fArr2[i13] = -((float) (Math.sin(d3) * d2 * Math.cos(d4)));
                    int i22 = i19 + 1;
                    int i23 = i12;
                    fArr2[i19] = (float) (d2 * Math.sin(d4));
                    int i24 = i22 + 1;
                    fArr2[i22] = (float) (d2 * Math.cos(d3) * Math.cos(d4));
                    int i25 = i14 + 1;
                    fArr4[i14] = f14 / radians2;
                    int i26 = i25 + 1;
                    fArr4[i25] = (((float) (i23 + i21)) * f16) / radians;
                    if (i20 == 0 && i21 == 0) {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                    } else {
                        i7 = i2;
                        i6 = i20;
                        i5 = i21;
                        if (!(i6 == i7 && i5 == 1)) {
                            fArr = fArr4;
                            i14 = i26;
                            i13 = i24;
                            i18 = i5 + 1;
                            i9 = i7;
                            i16 = i6;
                            fArr3 = fArr;
                            i12 = i23;
                            i10 = i4;
                            f9 = f15;
                            f8 = f16;
                            f12 = f17;
                        }
                    }
                    System.arraycopy(fArr2, i24 - 3, fArr2, i24, 3);
                    i24 += 3;
                    fArr = fArr4;
                    System.arraycopy(fArr, i26 - 2, fArr, i26, 2);
                    i26 += 2;
                    i14 = i26;
                    i13 = i24;
                    i18 = i5 + 1;
                    i9 = i7;
                    i16 = i6;
                    fArr3 = fArr;
                    i12 = i23;
                    i10 = i4;
                    f9 = f15;
                    f8 = f16;
                    f12 = f17;
                }
                float f18 = f8;
                float f19 = f9;
                float[] fArr5 = fArr3;
                float f20 = f12;
                int i27 = i12;
                int i28 = i16;
                int i29 = i9;
                int i30 = i28 + 1;
                f11 = f13;
                i15 = i17;
                i10 = i10;
                f9 = f19;
                f8 = f18;
                f12 = f20;
                int i31 = i30;
                i9 = i29;
                i16 = i31;
            }
            i8 = i;
            i12 = i15;
        }
        return new a60(new a(new b(0, fArr2, fArr3, 1)), i3);
    }

    public static a60 b(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
