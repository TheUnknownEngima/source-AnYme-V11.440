package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: yy  reason: default package */
public final class yy extends vy {
    public static final Parcelable.Creator<yy> CREATOR = new a();
    public final String f;
    public final byte[] g;

    /* renamed from: yy$a */
    class a implements Parcelable.Creator<yy> {
        a() {
        }

        /* renamed from: a */
        public yy createFromParcel(Parcel parcel) {
            return new yy(parcel);
        }

        /* renamed from: b */
        public yy[] newArray(int i) {
            return new yy[i];
        }
    }

    yy(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.g = createByteArray;
    }

    public yy(String str, byte[] bArr) {
        super("PRIV");
        this.f = str;
        this.g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yy.class != obj.getClass()) {
            return false;
        }
        yy yyVar = (yy) obj;
        return v50.b(this.f, yyVar.f) && Arrays.equals(this.g, yyVar.g);
    }

    public int hashCode() {
        String str = this.f;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.g);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
    }
}
