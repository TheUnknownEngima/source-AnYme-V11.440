package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: oy  reason: default package */
public final class oy extends vy {
    public static final Parcelable.Creator<oy> CREATOR = new a();
    public final String f;
    public final String g;
    public final int h;
    public final byte[] i;

    /* renamed from: oy$a */
    class a implements Parcelable.Creator<oy> {
        a() {
        }

        /* renamed from: a */
        public oy createFromParcel(Parcel parcel) {
            return new oy(parcel);
        }

        /* renamed from: b */
        public oy[] newArray(int i) {
            return new oy[i];
        }
    }

    oy(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        this.g = parcel.readString();
        this.h = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.i = createByteArray;
    }

    public oy(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f = str;
        this.g = str2;
        this.h = i2;
        this.i = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy.class != obj.getClass()) {
            return false;
        }
        oy oyVar = (oy) obj;
        return this.h == oyVar.h && v50.b(this.f, oyVar.f) && v50.b(this.g, oyVar.g) && Arrays.equals(this.i, oyVar.i);
    }

    public int hashCode() {
        int i2 = (527 + this.h) * 31;
        String str = this.f;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((hashCode + i3) * 31) + Arrays.hashCode(this.i);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }
}
