package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: xy  reason: default package */
public final class xy extends vy {
    public static final Parcelable.Creator<xy> CREATOR = new a();
    public final int f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;

    /* renamed from: xy$a */
    class a implements Parcelable.Creator<xy> {
        a() {
        }

        /* renamed from: a */
        public xy createFromParcel(Parcel parcel) {
            return new xy(parcel);
        }

        /* renamed from: b */
        public xy[] newArray(int i) {
            return new xy[i];
        }
    }

    public xy(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = iArr;
        this.j = iArr2;
    }

    xy(Parcel parcel) {
        super("MLLT");
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        v50.g(createIntArray);
        this.i = createIntArray;
        int[] createIntArray2 = parcel.createIntArray();
        v50.g(createIntArray2);
        this.j = createIntArray2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xy.class != obj.getClass()) {
            return false;
        }
        xy xyVar = (xy) obj;
        return this.f == xyVar.f && this.g == xyVar.g && this.h == xyVar.h && Arrays.equals(this.i, xyVar.i) && Arrays.equals(this.j, xyVar.j);
    }

    public int hashCode() {
        return ((((((((527 + this.f) * 31) + this.g) * 31) + this.h) * 31) + Arrays.hashCode(this.i)) * 31) + Arrays.hashCode(this.j);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeIntArray(this.j);
    }
}
