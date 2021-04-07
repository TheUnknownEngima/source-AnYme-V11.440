package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: pt1  reason: default package */
public final class pt1 implements Parcelable {
    public static final Parcelable.Creator<pt1> CREATOR = new a();
    @SerializedName("songTitle")
    private final String e;
    @SerializedName("thumbnailURL")
    private final String f;
    @SerializedName("videoURL")
    private final String g;

    /* renamed from: pt1$a */
    static class a implements Parcelable.Creator<pt1> {
        a() {
        }

        /* renamed from: a */
        public pt1 createFromParcel(Parcel parcel) {
            return new pt1(parcel);
        }

        /* renamed from: b */
        public pt1[] newArray(int i) {
            return new pt1[i];
        }
    }

    protected pt1(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public pt1(String str, String str2, String str3) {
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
