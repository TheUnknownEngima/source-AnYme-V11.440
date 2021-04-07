package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b90  reason: default package */
public final class b90 extends jq0 implements z80 {
    b90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel p3 = p3();
        p3.writeString(str);
        lq0.a(p3, z);
        p3.writeInt(i);
        Parcel q3 = q3(2, p3);
        boolean c = lq0.c(q3);
        q3.recycle();
        return c;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeInt(i);
        p3.writeInt(i2);
        Parcel q3 = q3(3, p3);
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeLong(j);
        p3.writeInt(i);
        Parcel q3 = q3(4, p3);
        long readLong = q3.readLong();
        q3.recycle();
        return readLong;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel p3 = p3();
        p3.writeString(str);
        p3.writeString(str2);
        p3.writeInt(i);
        Parcel q3 = q3(5, p3);
        String readString = q3.readString();
        q3.recycle();
        return readString;
    }

    public final void init(w80 w80) {
        Parcel p3 = p3();
        lq0.b(p3, w80);
        r3(1, p3);
    }
}
