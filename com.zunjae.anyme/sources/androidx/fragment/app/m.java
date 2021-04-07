package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    ArrayList<o> e;
    ArrayList<String> f;
    b[] g;
    int h;
    String i = null;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public m() {
    }

    public m(Parcel parcel) {
        this.e = parcel.createTypedArrayList(o.CREATOR);
        this.f = parcel.createStringArrayList();
        this.g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.h = parcel.readInt();
        this.i = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedArray(this.g, i2);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
    }
}
