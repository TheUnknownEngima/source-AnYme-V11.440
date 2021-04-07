package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class p implements yx.b {
    public static final Parcelable.Creator<p> CREATOR = new a();
    public final String e;
    public final String f;
    public final List<b> g;

    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final long e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(long j, String str, String str2, String str3, String str4) {
            this.e = j;
            this.f = str;
            this.g = str2;
            this.h = str3;
            this.i = str4;
        }

        b(Parcel parcel) {
            this.e = parcel.readLong();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.e == bVar.e && TextUtils.equals(this.f, bVar.f) && TextUtils.equals(this.g, bVar.g) && TextUtils.equals(this.h, bVar.h) && TextUtils.equals(this.i, bVar.i);
        }

        public int hashCode() {
            long j = this.e;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.g;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.h;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.i;
            if (str4 != null) {
                i3 = str4.hashCode();
            }
            return hashCode3 + i3;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }
    }

    p(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.g = Collections.unmodifiableList(arrayList);
    }

    public p(String str, String str2, List<b> list) {
        this.e = str;
        this.f = str2;
        this.g = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return TextUtils.equals(this.e, pVar.e) && TextUtils.equals(this.f, pVar.f) && this.g.equals(pVar.g);
    }

    public int hashCode() {
        String str = this.e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str;
        String str2 = this.e;
        if (str2 != null) {
            String str3 = this.f;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 5 + String.valueOf(str3).length());
            sb.append(" [");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        int size = this.g.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.g.get(i2), 0);
        }
    }
}
