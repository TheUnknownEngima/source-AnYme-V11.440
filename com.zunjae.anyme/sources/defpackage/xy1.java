package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xy1  reason: default package */
public class xy1 implements Parcelable {
    public static final Parcelable.Creator<xy1> CREATOR = new a();
    private final long e;
    private final String f;
    private final String g;

    /* renamed from: xy1$a */
    static class a implements Parcelable.Creator<xy1> {
        a() {
        }

        /* renamed from: a */
        public xy1 createFromParcel(Parcel parcel) {
            return new xy1(parcel);
        }

        /* renamed from: b */
        public xy1[] newArray(int i) {
            return new xy1[i];
        }
    }

    public xy1(long j, String str, String str2) {
        this.e = j;
        this.f = str;
        this.g = str2;
    }

    protected xy1(Parcel parcel) {
        this.e = parcel.readLong();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public long a() {
        return this.e;
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.f;
    }

    public int describeContents() {
        return 0;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return Long.toString(this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
