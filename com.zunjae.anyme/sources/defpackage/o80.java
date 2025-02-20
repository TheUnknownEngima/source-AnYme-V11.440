package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o80  reason: default package */
public class o80 {
    private static void A(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    public static int a(Parcel parcel) {
        return x(parcel, 20293);
    }

    public static void b(Parcel parcel, int i) {
        z(parcel, i);
    }

    public static void c(Parcel parcel, int i, boolean z) {
        A(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            A(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int x = x(parcel, i);
            parcel.writeBundle(bundle);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int x = x(parcel, i);
            parcel.writeByteArray(bArr);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void g(Parcel parcel, int i, double d) {
        A(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void h(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            A(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void i(Parcel parcel, int i, float f) {
        A(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void j(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            A(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void k(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int x = x(parcel, i);
            parcel.writeStrongBinder(iBinder);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void l(Parcel parcel, int i, int i2) {
        A(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int x = x(parcel, i);
            parcel.writeIntArray(iArr);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void n(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            A(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void o(Parcel parcel, int i, long j) {
        A(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void p(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int x = x(parcel, i);
            parcel.writeLongArray(jArr);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void q(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            A(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void r(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int x = x(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void s(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int x = x(parcel, i);
            parcel.writeString(str);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void t(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int x = x(parcel, i);
            parcel.writeStringArray(strArr);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static void u(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int x = x(parcel, i);
            parcel.writeStringList(list);
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void v(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int x = x(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    y(parcel, t, i2);
                }
            }
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void w(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int x = x(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    y(parcel, parcelable, 0);
                }
            }
            z(parcel, x);
        } else if (z) {
            A(parcel, i, 0);
        }
    }

    private static int x(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <T extends Parcelable> void y(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static void z(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
