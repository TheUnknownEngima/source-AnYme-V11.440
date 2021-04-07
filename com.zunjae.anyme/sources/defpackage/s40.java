package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.m0;
import java.util.ArrayList;

/* renamed from: s40  reason: default package */
public final class s40 {
    private static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] b(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return a(2, i5, i6);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, a.length, i2);
        return bArr3;
    }

    private static int e(byte[] bArr, int i) {
        int length = bArr.length - a.length;
        while (i <= length) {
            if (h(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int f(h50 h50) {
        int h = h50.h(5);
        return h == 31 ? h50.h(6) + 32 : h;
    }

    private static int g(h50 h50) {
        int h = h50.h(4);
        if (h == 15) {
            return h50.h(24);
        }
        q40.a(h < 13);
        return b[h];
    }

    private static boolean h(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair<Integer, Integer> i(h50 h50, boolean z) {
        int f = f(h50);
        int g = g(h50);
        int h = h50.h(4);
        if (f == 5 || f == 29) {
            g = g(h50);
            f = f(h50);
            if (f == 22) {
                h = h50.h(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(f == 1 || f == 2 || f == 3 || f == 4 || f == 6 || f == 7 || f == 17)) {
                switch (f) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(f);
                        throw new m0(sb.toString());
                }
            }
            l(h50, f, h);
            switch (f) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = h50.h(2);
                    if (h2 == 2 || h2 == 3) {
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Unsupported epConfig: ");
                        sb2.append(h2);
                        throw new m0(sb2.toString());
                    }
            }
        }
        int i = c[h];
        if (i == -1) {
            z2 = false;
        }
        q40.a(z2);
        return Pair.create(Integer.valueOf(g), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> j(byte[] bArr) {
        return i(new h50(bArr), false);
    }

    public static Pair<Integer, Integer> k(byte[] bArr) {
        i50 i50 = new i50(bArr);
        i50.M(9);
        int z = i50.z();
        i50.M(20);
        return Pair.create(Integer.valueOf(i50.D()), Integer.valueOf(z));
    }

    private static void l(h50 h50, int i, int i2) {
        h50.q(1);
        if (h50.g()) {
            h50.q(14);
        }
        boolean g = h50.g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                h50.q(3);
            }
            if (g) {
                if (i == 22) {
                    h50.q(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    h50.q(3);
                }
                h50.q(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[][] m(byte[] bArr) {
        if (!h(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = e(bArr, i + a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + -1 ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
