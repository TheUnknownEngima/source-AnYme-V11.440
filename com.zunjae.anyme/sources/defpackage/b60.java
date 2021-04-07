package defpackage;

import defpackage.a60;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* renamed from: b60  reason: default package */
public final class b60 {
    public static a60 a(byte[] bArr, int i) {
        ArrayList<a60.a> arrayList;
        i50 i50 = new i50(bArr);
        try {
            arrayList = c(i50) ? f(i50) : e(i50);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new a60(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new a60(arrayList.get(0), arrayList.get(1), i);
    }

    private static int b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean c(i50 i50) {
        i50.N(4);
        int k = i50.k();
        i50.M(0);
        return k == 1886547818;
    }

    private static a60.a d(i50 i50) {
        int k = i50.k();
        if (k > 10000) {
            return null;
        }
        float[] fArr = new float[k];
        for (int i = 0; i < k; i++) {
            fArr[i] = i50.j();
        }
        int k2 = i50.k();
        if (k2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) k) * 2.0d) / log);
        h50 h50 = new h50(i50.a);
        int i2 = 8;
        h50.o(i50.c() * 8);
        float[] fArr2 = new float[(k2 * 5)];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < k2) {
            int i6 = 0;
            while (i6 < i3) {
                int b = iArr[i6] + b(h50.h(ceil));
                if (b >= k || b < 0) {
                    return null;
                }
                fArr2[i5] = fArr[b];
                iArr[i6] = b;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        h50.o((h50.e() + 7) & -8);
        int i7 = 32;
        int h = h50.h(32);
        a60.b[] bVarArr = new a60.b[h];
        int i8 = 0;
        while (i8 < h) {
            int h2 = h50.h(i2);
            int h3 = h50.h(i2);
            int h4 = h50.h(i7);
            if (h4 > 128000) {
                return null;
            }
            int i9 = h2;
            int ceil2 = (int) Math.ceil(Math.log(((double) k2) * d) / log);
            float[] fArr3 = new float[(h4 * 3)];
            float[] fArr4 = new float[(h4 * 2)];
            int i10 = 0;
            for (int i11 = 0; i11 < h4; i11++) {
                i10 += b(h50.h(ceil2));
                if (i10 < 0 || i10 >= k2) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = i10 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            bVarArr[i8] = new a60.b(i9, fArr3, fArr4, h3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new a60.a(bVarArr);
    }

    private static ArrayList<a60.a> e(i50 i50) {
        if (i50.z() != 0) {
            return null;
        }
        i50.N(7);
        int k = i50.k();
        if (k == 1684433976) {
            i50 i502 = new i50();
            Inflater inflater = new Inflater(true);
            try {
                if (!v50.d0(i50, i502, inflater)) {
                    return null;
                }
                i50 = i502;
            } finally {
                inflater.end();
            }
        } else if (k != 1918990112) {
            return null;
        }
        return g(i50);
    }

    private static ArrayList<a60.a> f(i50 i50) {
        int k;
        i50.N(8);
        int c = i50.c();
        int d = i50.d();
        while (c < d && (k = i50.k() + c) > c && k <= d) {
            int k2 = i50.k();
            if (k2 == 2037673328 || k2 == 1836279920) {
                i50.L(k);
                return e(i50);
            }
            i50.M(k);
            c = k;
        }
        return null;
    }

    private static ArrayList<a60.a> g(i50 i50) {
        ArrayList<a60.a> arrayList = new ArrayList<>();
        int c = i50.c();
        int d = i50.d();
        while (c < d) {
            int k = i50.k() + c;
            if (k <= c || k > d) {
                return null;
            }
            if (i50.k() == 1835365224) {
                a60.a d2 = d(i50);
                if (d2 == null) {
                    return null;
                }
                arrayList.add(d2);
            }
            i50.M(k);
            c = k;
        }
        return arrayList;
    }
}
