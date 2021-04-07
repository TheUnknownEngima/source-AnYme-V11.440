package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final String e;
    public final String f;
    public final Uri g;
    public final List<h> h;
    public final String i;
    public final byte[] j;

    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    e(Parcel parcel) {
        String readString = parcel.readString();
        v50.g(readString);
        this.e = readString;
        String readString2 = parcel.readString();
        v50.g(readString2);
        this.f = readString2;
        String readString3 = parcel.readString();
        v50.g(readString3);
        this.g = Uri.parse(readString3);
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((h) parcel.readParcelable(h.class.getClassLoader()));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        v50.g(createByteArray);
        this.j = createByteArray;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.e.equals(eVar.e) && this.f.equals(eVar.f) && this.g.equals(eVar.g) && this.h.equals(eVar.h) && v50.b(this.i, eVar.i) && Arrays.equals(this.j, eVar.j);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        String str = this.i;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j);
    }

    public String toString() {
        String str = this.f;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g.toString());
        parcel.writeInt(this.h.size());
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            parcel.writeParcelable(this.h.get(i3), 0);
        }
        parcel.writeString(this.i);
        parcel.writeByteArray(this.j);
    }
}
