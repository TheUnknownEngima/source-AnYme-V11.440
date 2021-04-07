package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: sy  reason: default package */
public final class sy extends vy {
    public static final Parcelable.Creator<sy> CREATOR = new a();
    public final String f;
    public final String g;
    public final String h;

    /* renamed from: sy$a */
    class a implements Parcelable.Creator<sy> {
        a() {
        }

        /* renamed from: a */
        public sy createFromParcel(Parcel parcel) {
            return new sy(parcel);
        }

        /* renamed from: b */
        public sy[] newArray(int i) {
            return new sy[i];
        }
    }

    sy(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.g = readString2;
        String readString3 = parcel.readString();
        v50.g(readString3);
        this.h = readString3;
    }

    public sy(String str, String str2, String str3) {
        super("COMM");
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sy.class != obj.getClass()) {
            return false;
        }
        sy syVar = (sy) obj;
        return v50.b(this.g, syVar.g) && v50.b(this.f, syVar.f) && v50.b(this.h, syVar.h);
    }

    public int hashCode() {
        String str = this.f;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.h);
    }
}
