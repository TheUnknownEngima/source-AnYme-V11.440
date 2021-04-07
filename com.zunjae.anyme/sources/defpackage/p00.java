package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: p00  reason: default package */
public final class p00 implements Parcelable {
    public static final Parcelable.Creator<p00> CREATOR = new a();
    public static final p00 h = new p00(new o00[0]);
    public final int e;
    private final o00[] f;
    private int g;

    /* renamed from: p00$a */
    class a implements Parcelable.Creator<p00> {
        a() {
        }

        /* renamed from: a */
        public p00 createFromParcel(Parcel parcel) {
            return new p00(parcel);
        }

        /* renamed from: b */
        public p00[] newArray(int i) {
            return new p00[i];
        }
    }

    p00(Parcel parcel) {
        int readInt = parcel.readInt();
        this.e = readInt;
        this.f = new o00[readInt];
        for (int i = 0; i < this.e; i++) {
            this.f[i] = (o00) parcel.readParcelable(o00.class.getClassLoader());
        }
    }

    public p00(o00... o00Arr) {
        this.f = o00Arr;
        this.e = o00Arr.length;
    }

    public o00 a(int i) {
        return this.f[i];
    }

    public int b(o00 o00) {
        for (int i = 0; i < this.e; i++) {
            if (this.f[i] == o00) {
                return i;
            }
        }
        return -1;
    }

    public boolean c() {
        return this.e == 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p00.class != obj.getClass()) {
            return false;
        }
        p00 p00 = (p00) obj;
        return this.e == p00.e && Arrays.equals(this.f, p00.f);
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        for (int i2 = 0; i2 < this.e; i2++) {
            parcel.writeParcelable(this.f[i2], 0);
        }
    }
}
