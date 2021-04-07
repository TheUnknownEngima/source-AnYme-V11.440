package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ty  reason: default package */
public final class ty extends vy {
    public static final Parcelable.Creator<ty> CREATOR = new a();
    public final String f;
    public final String g;
    public final String h;
    public final byte[] i;

    /* renamed from: ty$a */
    class a implements Parcelable.Creator<ty> {
        a() {
        }

        /* renamed from: a */
        public ty createFromParcel(Parcel parcel) {
            return new ty(parcel);
        }

        /* renamed from: b */
        public ty[] newArray(int i) {
            return new ty[i];
        }
    }

    ty(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.g = readString2;
        String readString3 = parcel.readString();
        v50.g(readString3);
        this.h = readString3;
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.i = createByteArray;
    }

    public ty(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ty.class != obj.getClass()) {
            return false;
        }
        ty tyVar = (ty) obj;
        return v50.b(this.f, tyVar.f) && v50.b(this.g, tyVar.g) && v50.b(this.h, tyVar.h) && Arrays.equals(this.i, tyVar.i);
    }

    public int hashCode() {
        String str = this.f;
        int i2 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Arrays.hashCode(this.i);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeByteArray(this.i);
    }
}
