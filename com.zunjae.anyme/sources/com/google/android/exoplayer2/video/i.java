package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;
    private int i;

    class a implements Parcelable.Creator<i> {
        a() {
        }

        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* renamed from: b */
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(int i2, int i3, int i4, byte[] bArr) {
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = bArr;
    }

    i(Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = v50.t0(parcel) ? parcel.createByteArray() : null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.e == iVar.e && this.f == iVar.f && this.g == iVar.g && Arrays.equals(this.h, iVar.h);
    }

    public int hashCode() {
        if (this.i == 0) {
            this.i = ((((((527 + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
        }
        return this.i;
    }

    public String toString() {
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        boolean z = this.h != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        v50.J0(parcel, this.h != null);
        byte[] bArr = this.h;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
