package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: n80  reason: default package */
public class n80 {

    /* renamed from: n80$a */
    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n80.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int A(Parcel parcel) {
        int s = s(parcel);
        int y = y(parcel, s);
        int dataPosition = parcel.dataPosition();
        if (l(s) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(s));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = y + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new a(sb.toString(), parcel);
    }

    private static void B(Parcel parcel, int i, int i2) {
        int y = y(parcel, i);
        if (y != i2) {
            String hexString = Integer.toHexString(y);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(y);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }

    private static void C(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y);
        return createIntArray;
    }

    public static long[] d(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + y);
        return createLongArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y);
        return t;
    }

    public static String f(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y);
        return readString;
    }

    public static String[] g(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArray;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new a(sb.toString(), parcel);
        }
    }

    public static int l(int i) {
        return i & 65535;
    }

    public static boolean m(Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i) {
        int y = y(parcel, i);
        if (y == 0) {
            return null;
        }
        C(parcel, i, y, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double o(Parcel parcel, int i) {
        B(parcel, i, 8);
        return parcel.readDouble();
    }

    public static Double p(Parcel parcel, int i) {
        int y = y(parcel, i);
        if (y == 0) {
            return null;
        }
        C(parcel, i, y, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float q(Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float r(Parcel parcel, int i) {
        int y = y(parcel, i);
        if (y == 0) {
            return null;
        }
        C(parcel, i, y, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int s(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder t(Parcel parcel, int i) {
        int y = y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i) {
        B(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i) {
        int y = y(parcel, i);
        if (y == 0) {
            return null;
        }
        C(parcel, i, y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i) {
        B(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long x(Parcel parcel, int i) {
        int y = y(parcel, i);
        if (y == 0) {
            return null;
        }
        C(parcel, i, y, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int y(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static void z(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i));
    }
}
