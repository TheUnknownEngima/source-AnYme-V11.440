package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qy  reason: default package */
public final class qy extends vy {
    public static final Parcelable.Creator<qy> CREATOR = new a();
    public final String f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    private final vy[] k;

    /* renamed from: qy$a */
    class a implements Parcelable.Creator<qy> {
        a() {
        }

        /* renamed from: a */
        public qy createFromParcel(Parcel parcel) {
            return new qy(parcel);
        }

        /* renamed from: b */
        public qy[] newArray(int i) {
            return new qy[i];
        }
    }

    qy(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        v50.g(readString);
        this.f = readString;
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readLong();
        this.j = parcel.readLong();
        int readInt = parcel.readInt();
        this.k = new vy[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.k[i2] = (vy) parcel.readParcelable(vy.class.getClassLoader());
        }
    }

    public qy(String str, int i2, int i3, long j2, long j3, vy[] vyVarArr) {
        super("CHAP");
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = j2;
        this.j = j3;
        this.k = vyVarArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qy.class != obj.getClass()) {
            return false;
        }
        qy qyVar = (qy) obj;
        return this.g == qyVar.g && this.h == qyVar.h && this.i == qyVar.i && this.j == qyVar.j && v50.b(this.f, qyVar.f) && Arrays.equals(this.k, qyVar.k);
    }

    public int hashCode() {
        int i2 = (((((((527 + this.g) * 31) + this.h) * 31) + ((int) this.i)) * 31) + ((int) this.j)) * 31;
        String str = this.f;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeLong(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k.length);
        for (vy writeParcelable : this.k) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
