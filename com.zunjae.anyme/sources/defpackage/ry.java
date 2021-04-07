package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ry  reason: default package */
public final class ry extends vy {
    public static final Parcelable.Creator<ry> CREATOR = new a();
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String[] i;
    private final vy[] j;

    /* renamed from: ry$a */
    class a implements Parcelable.Creator<ry> {
        a() {
        }

        /* renamed from: a */
        public ry createFromParcel(Parcel parcel) {
            return new ry(parcel);
        }

        /* renamed from: b */
        public ry[] newArray(int i) {
            return new ry[i];
        }
    }

    ry(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        boolean z = true;
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() == 0 ? false : z;
        String[] createStringArray = parcel.createStringArray();
        v50.g(createStringArray);
        this.i = createStringArray;
        int readInt = parcel.readInt();
        this.j = new vy[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.j[i2] = (vy) parcel.readParcelable(vy.class.getClassLoader());
        }
    }

    public ry(String str, boolean z, boolean z2, String[] strArr, vy[] vyVarArr) {
        super("CTOC");
        this.f = str;
        this.g = z;
        this.h = z2;
        this.i = strArr;
        this.j = vyVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ry.class != obj.getClass()) {
            return false;
        }
        ry ryVar = (ry) obj;
        return this.g == ryVar.g && this.h == ryVar.h && v50.b(this.f, ryVar.f) && Arrays.equals(this.i, ryVar.i) && Arrays.equals(this.j, ryVar.j);
    }

    public int hashCode() {
        int i2 = (((true + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31;
        String str = this.f;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeByte(this.g ? (byte) 1 : 0);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeStringArray(this.i);
        parcel.writeInt(this.j.length);
        for (vy writeParcelable : this.j) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
