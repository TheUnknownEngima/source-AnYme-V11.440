package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import defpackage.yx;

/* renamed from: jy  reason: default package */
public final class jy implements yx.b {
    public static final Parcelable.Creator<jy> CREATOR = new a();
    public final String e;
    public final String f;

    /* renamed from: jy$a */
    class a implements Parcelable.Creator<jy> {
        a() {
        }

        /* renamed from: a */
        public jy createFromParcel(Parcel parcel) {
            return new jy(parcel);
        }

        /* renamed from: b */
        public jy[] newArray(int i) {
            return new jy[i];
        }
    }

    jy(Parcel parcel) {
        String readString = parcel.readString();
        v50.g(readString);
        this.e = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.f = readString2;
    }

    public jy(String str, String str2) {
        this.e = str;
        this.f = str2;
    }

    public /* synthetic */ f0 C() {
        return zx.b(this);
    }

    public /* synthetic */ byte[] F0() {
        return zx.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jy.class != obj.getClass()) {
            return false;
        }
        jy jyVar = (jy) obj;
        return this.e.equals(jyVar.e) && this.f.equals(jyVar.f);
    }

    public int hashCode() {
        return ((527 + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
