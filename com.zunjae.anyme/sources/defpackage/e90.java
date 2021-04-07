package defpackage;

import android.os.Parcel;

/* renamed from: e90  reason: default package */
public class e90 {
    static {
        e90.class.getClassLoader();
    }

    private e90() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
