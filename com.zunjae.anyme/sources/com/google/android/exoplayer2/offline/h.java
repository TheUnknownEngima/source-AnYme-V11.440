package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Comparable<h>, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();
    public final int e;
    public final int f;
    public final int g;

    class a implements Parcelable.Creator<h> {
        a() {
        }

        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        /* renamed from: b */
        public h[] newArray(int i) {
            return new h[i];
        }
    }

    public h(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    h(Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        int i = this.e - hVar.e;
        if (i != 0) {
            return i;
        }
        int i2 = this.f - hVar.f;
        return i2 == 0 ? this.g - hVar.g : i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.e == hVar.e && this.f == hVar.f && this.g == hVar.g;
    }

    public int hashCode() {
        return (((this.e * 31) + this.f) * 31) + this.g;
    }

    public String toString() {
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
