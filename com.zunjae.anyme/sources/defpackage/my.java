package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.f0;
import defpackage.yx;
import java.util.Arrays;

/* renamed from: my  reason: default package */
public final class my implements yx.b {
    public static final Parcelable.Creator<my> CREATOR = new a();
    public final byte[] e;
    public final String f;
    public final String g;

    /* renamed from: my$a */
    class a implements Parcelable.Creator<my> {
        a() {
        }

        /* renamed from: a */
        public my createFromParcel(Parcel parcel) {
            return new my(parcel);
        }

        /* renamed from: b */
        public my[] newArray(int i) {
            return new my[i];
        }
    }

    my(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        q40.e(createByteArray);
        this.e = createByteArray;
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public my(byte[] bArr, String str, String str2) {
        this.e = bArr;
        this.f = str;
        this.g = str2;
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
        if (obj == null || my.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.e, ((my) obj).e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.e);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f, this.g, Integer.valueOf(this.e.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
