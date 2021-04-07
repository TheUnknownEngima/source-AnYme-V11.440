package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lq0  reason: default package */
public class lq0 {
    static {
        lq0.class.getClassLoader();
    }

    private lq0() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static boolean c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
