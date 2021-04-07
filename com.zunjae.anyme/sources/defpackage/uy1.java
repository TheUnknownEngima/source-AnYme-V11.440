package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: uy1  reason: default package */
public final class uy1 implements Parcelable {
    public static final Parcelable.Creator<uy1> CREATOR = new a();
    public int e;
    public int f;

    /* renamed from: uy1$a */
    static class a implements Parcelable.Creator<uy1> {
        a() {
        }

        /* renamed from: a */
        public uy1 createFromParcel(Parcel parcel) {
            return new uy1(parcel);
        }

        /* renamed from: b */
        public uy1[] newArray(int i) {
            return new uy1[i];
        }
    }

    public uy1() {
    }

    protected uy1(Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
