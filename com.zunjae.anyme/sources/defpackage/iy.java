package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.Arrays;

/* renamed from: iy  reason: default package */
public final class iy implements yx.b {
    public static final Parcelable.Creator<iy> CREATOR = new a();
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final byte[] l;

    /* renamed from: iy$a */
    class a implements Parcelable.Creator<iy> {
        a() {
        }

        /* renamed from: a */
        public iy createFromParcel(Parcel parcel) {
            return new iy(parcel);
        }

        /* renamed from: b */
        public iy[] newArray(int i) {
            return new iy[i];
        }
    }

    public iy(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = bArr;
    }

    iy(Parcel parcel) {
        this.e = parcel.readInt();
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.g = readString2;
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.l = createByteArray;
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
        if (obj == null || iy.class != obj.getClass()) {
            return false;
        }
        iy iyVar = (iy) obj;
        return this.e == iyVar.e && this.f.equals(iyVar.f) && this.g.equals(iyVar.g) && this.h == iyVar.h && this.i == iyVar.i && this.j == iyVar.j && this.k == iyVar.k && Arrays.equals(this.l, iyVar.l);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + Arrays.hashCode(this.l);
    }

    public String toString() {
        String str = this.f;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeByteArray(this.l);
    }
}
